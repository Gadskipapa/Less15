public enum Shape {

    ROUND("round"),
    SQUARE("square"),
    STAR("star"),
    FIGURE ("figure"),
    OTHER ("other");

    private String name;
    Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
