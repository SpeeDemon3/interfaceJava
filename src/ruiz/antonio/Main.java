package ruiz.antonio;

public class Main {


    public static void main(String[] args) {

        CocheCRUDImpl coche = new CocheCRUDImpl();

        coche.delete();

        coche.findAll();

        coche.save();



    }

}
