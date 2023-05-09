package bookmyshow_java.models;

public class ShowSeat extends BaseModel{
    private Seat seat;
    private SeatStatus seatStatus;
    
    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public ShowSeat(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
}
