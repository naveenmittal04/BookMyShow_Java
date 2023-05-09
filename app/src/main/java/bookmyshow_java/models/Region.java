package bookmyshow_java.models;

import java.util.List;

public class Region extends BaseModel{
    private String name;
    private List<Theater> theaters;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Theater> getTheaters() {
        return theaters;
    }

    public void setTheaters(List<Theater> theaters) {
        this.theaters = theaters;
    }

    public Region(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
