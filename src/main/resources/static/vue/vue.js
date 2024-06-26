new Vue({
    el: '#app',
    data: {
        floors: [],
        employees: [],
        selectedEmployee: null,
        selectedSeat: null
    },
    methods: {
        fetchSeats() {
            axios.get('/api/seats')
                .then(response => {
                    this.floors = response.data;
                });
        },
        fetchEmployees() {
            axios.get('/api/employees')
                .then(response => {
                    this.employees = response.data;
                });
        },
        getSeatStyle(seat) {
            if (seat.emp) {
                return 'background-color: red;'; // 已占用座位
            } else if (this.selectedSeat && this.selectedSeat.seq === seat.seq) {
                return 'background-color: yellow;'; // 选中的空座位
            } else {
                return 'background-color: green;'; // 空座位
            }
        },
        selectSeat(seat) {
            if (!seat.emp) {
                this.selectedSeat = seat;
            }
        },
        employeeChanged() {
            this.selectedSeat = null;
        },
        submitChanges() {
            if (this.selectedSeat && this.selectedEmployee) {
                axios.post('/api/assignSeat', {
                    empId: this.selectedEmployee,
                    seatSeq: this.selectedSeat.seq
                }).then(response => {
                    this.fetchSeats();
                    this.selectedSeat = null;
                    this.selectedEmployee = null;
                });
            }
        }
    },
    created() {
        this.fetchSeats();
        this.fetchEmployees();
    }
});