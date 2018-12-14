package kz.proenglish.bostonceltics;
import java.io.Serializable;

// Player class creating Player object
public class Player implements Serializable {
    private String name;
    private String age;
    private double height;
    private String position;
    private int image;
    private int points;
    Player(String name, String age, double height, String position, int image, int points) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.position = position;
        this.image = image;
        this.points = points;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getImage() {
        return image;
    }
    public void setImage(int image) {
        this.image = image;
    }
    public int getPoints() { return points; }
    public void setPoints(int points) { this.points = points; }
}