import java.util.Collections;
import java.util.Comparator;

public class Less15 {

    public static void main(String[] args) {
        ElkaTag toy = new Round ("кружок", Colour.RED);
        Figure dedMoroz = new Figure ("дуд мороз", Colour.WHITE, true);
        Star star1 = new Star ("звезда", Colour.WHITE);
        ElkaTag star2 = new Star("звезда 2", Colour.BLACK);
        Elka elka = new Elka ("Елка");
        elka.addToy(dedMoroz);
        elka.addToy(star1);
        elka.addToy(star2);
        elka.addToy(toy);

        System.out.println(elka.countRed());

        Collections.sort(elka.getTags());

        Comparator<ElkaTag> coloursComparator = new Comparator<ElkaTag>() {
            @Override
            public int compare(ElkaTag o1, ElkaTag o2) {

                if (o1 == null && o2 == null) {
                    return 0;
                }
                if (o1 != null && o2 == null) {
                    return 1;
                }
                if (o1 == null && o2 != null) {
                    return -1;
                }

                return o1.getColour().compareTo(o2.getColour());
            }
        };

        Collections.sort(elka.getTags(), coloursComparator);

}
}
