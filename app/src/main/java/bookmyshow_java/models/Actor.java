package bookmyshow_java.models;

public class Actor extends BaseModel{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Actor(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
