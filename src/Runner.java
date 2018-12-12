public class Runner {

    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.justPrint();

        PaperPrinter pp = new PaperPrinter();
        pp.justPrint();
    }

    Iout paperPrinter = new Iout() {
        @Override
        public void justPrint() {
            System.out.println("paper prints");
        }
    };
    paperPrinter.justPrint();
}
