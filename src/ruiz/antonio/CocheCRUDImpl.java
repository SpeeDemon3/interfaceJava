package ruiz.antonio;


public class CocheCRUDImpl implements CocheCRUD {

    // atributos

    String color;
    String marcar;
    int puertas;

    // constructor


    public CocheCRUDImpl() {
    }

    public CocheCRUDImpl(String color, String marcar, int puertas) {
        this.color = color;
        this.marcar = marcar;
        this.puertas = puertas;
    }

    // metodos

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void findAll() {
        System.out.println("findAll");
    }


}
