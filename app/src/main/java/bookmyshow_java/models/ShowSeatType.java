package bookmyshow_java.models;

public class ShowSeatType extends BaseModel{
    public ShowSeatType(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }

    private Long price;

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
