package bookmyshow_java.models;

import java.util.List;

public class SeatType extends BaseModel{
    private List<String> seatTypes;
    public SeatType(int id, List<String> seatTypes) {
        super(id);
        this.seatTypes = seatTypes;
    }
    public List<String> getSeatTypes() {
        return seatTypes;
    }
    public void setSeatTypes(List<String> seatTypes) {
        this.seatTypes = seatTypes;
    }
    
}
