//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FormeRectangulaire s = new Square(5);
        FormeRectangulaire r = new Rectangle(5, 10);

        System.out.println(s.calculerAir());
        System.out.println(r.calculerAir());
        System.out.println(s.getHauteur());
        System.out.println(s.getLargeur());
        System.out.println(r.getHauteur());
        System.out.println(r.getLargeur());
    }
}