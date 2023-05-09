package bookmyshow_java.models;

import java.util.List;

public class Movie extends BaseModel{
    private String name;
    private List<Actor> cast;
    private List<MovieLanguage> languages;
    private List<Feature> features;
    
    public List<MovieLanguage> getLanguages() {
        return languages;
    }
    public void setLanguages(List<MovieLanguage> languages) {
        this.languages = languages;
    }
    public List<Feature> getFeatures() {
        return features;
    }
    public void setFeatures(List<Feature> features) {
        this.features = features;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Actor> getCast() {
        return cast;
    }
    public void setCast(List<Actor> cast) {
        this.cast = cast;
    }
    public Movie(int id) {
        super(id);
        //TODO Auto-generated constructor stub
    }
    
}
