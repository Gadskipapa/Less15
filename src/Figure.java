public class Figure extends ElkaTag {

    private boolean isFigureOfMen;

    public boolean isFigureOfMen() {
        return isFigureOfMen;
    }

    public Figure (String name, Colour colour, boolean isFigureOfMen) {
        super (name, colour, Shape.FIGURE);
        this.isFigureOfMen = isFigureOfMen;



    }
}
