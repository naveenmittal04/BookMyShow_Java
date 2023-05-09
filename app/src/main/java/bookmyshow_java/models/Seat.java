package bookmyshow_java.models;

public class Seat extends BaseModel{
    private int seatNumber;
    private int rowNumber;
    private int columnNumber;
    private SeatType seatType;

    public Seat(int id, int seatNumber, SeatType seatType) {
        super(id);
        this.seatNumber = seatNumber;
        this.rowNumber = 0;
        this.columnNumber = 0;
        this.seatType = seatType;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getRowNumber() {
        return rowNumber;
    }

    public void setRowNumber(int rowNumber) {
        this.rowNumber = rowNumber;
    }

    public int getColumnNumber() {
        return columnNumber;
    }

    public void setColumnNumber(int columnNumber) {
        this.columnNumber = columnNumber;
    }

    public Seat(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
