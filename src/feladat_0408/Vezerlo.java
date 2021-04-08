package feladat_0408;

public class Vezerlo {

    private Ablak ablak;

    public Vezerlo() {
        init();
        ablak.setVisible(true);
    }

    private void init() {
        this.ablak = new Ablak();
    }

    public static void main(String[] args) {
        new Vezerlo();
    }
}
