package bookmyshow_java.models;

import java.util.List;

public class Screen extends BaseModel{
    private List<Seat> seats;
    private String name;
    private List<Feature> features;

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Screen(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
