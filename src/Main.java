public class Main {
    public static void main(String[] args) {
        Anmal p = new Perro("canito","chapi");

        p.setNombre("Choca");
        p.comer();
        p.caminar();
        p.sonido();
        p.dormir();

        System.out.println("----------------------------------");
        Anmal g = new Perro("Darzy","doberman");
        g.setNombre("Mochita");
        g.comer();
        g.caminar();
        g.sonido();
        g.dormir();
        g.despertar();

    }
}
