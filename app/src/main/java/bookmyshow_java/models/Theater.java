package bookmyshow_java.models;

import java.util.List;

public class Theater extends BaseModel{
    private String name;
    private String address;
    private List<Screen> screens;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Screen> getScreens() {
        return screens;
    }

    public void setScreens(List<Screen> screens) {
        this.screens = screens;
    }

    public Theater(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
