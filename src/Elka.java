import java.util.ArrayList;
import java.util.List;

public class Elka {

    private String name;
    private List <ElkaTag> tags = new ArrayList<>();

    public Elka(String name, List<ElkaTag> tags) {
        this.name = name;
        this.tags = tags;
    }

    public Elka(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ElkaTag> getTags() {
        return tags;
    }

    public void setTags(List<ElkaTag> tags) {
        this.tags = tags;
    }

    public void addToy(ElkaTag toy) {
        tags.add(toy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Elka elka = (Elka) o;

        if (name != null ? !name.equals(elka.name) : elka.name != null) return false;
        return tags != null ? tags.equals(elka.tags) : elka.tags == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (tags != null ? tags.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Elka{" +
                "name='" + name + '\'' +
                ", tags=" + tags +
                '}';
    }

    public int countRed () {
        int counter = 0;
        for (ElkaTag toy : tags) {
            if (Colour.RED == toy.getColour()) {
                counter++;
            }
        }
        return counter;
    }
}


