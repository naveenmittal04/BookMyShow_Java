package bookmyshow_java.models;

import java.util.Date;
import java.util.List;

public class Show extends BaseModel{
    private Movie movie;
    private Screen screen;
    private Date startTime;
    private Date endTime;
    private List<Feature> features;
    
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public List<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<Feature> features) {
        this.features = features;
    }

    public Show(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
