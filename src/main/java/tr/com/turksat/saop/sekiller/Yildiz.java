package tr.com.turksat.saop.sekiller;

public class Yildiz implements  Sekil{

    private int boyut;
    private char sembol;

    public Yildiz(int boyut, char sembol) {
        this.boyut = boyut;
        this.sembol = sembol;
    }

    @Override
    public void ciz() {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                if (i == j || i + j == boyut - 1) {
                    System.out.print(sembol + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    @Override
    public void sembolDegistir(char yeniSembol) {
        this.sembol = yeniSembol;
    }


}
