import java.util.Objects;

public class Cat {

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;
        Cat cat = (Cat) o;
        return getColor().equals(cat.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getColor());
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + color + '\'' +
                '}';
    }
}
