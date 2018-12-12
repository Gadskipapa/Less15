abstract class ElkaTag implements Comparable <ElkaTag> {

    private String name;
    private Colour colour;
    private Shape shape;

    public ElkaTag(String name, Colour colour, Shape shape) {
        this.name = name;
        this.colour = colour;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    @Override
    public int compareTo (ElkaTag toy) {
        return this.name.compareTo(toy.name);
    }


}
