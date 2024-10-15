package tr.com.turksat.saop.sekiller;

public class Kare implements Sekil{


    private int boyut;
    private char sembol;


    public Kare(int boyut, char sembol) {
        this.boyut = boyut;
        this.sembol = sembol;
    }

    @Override
    public void ciz() {
        for (int i = 0; i < boyut; i++) {
            for (int j = 0; j < boyut; j++) {
                System.out.print(sembol + " ");
            }
            System.out.println();
        }
    }

    @Override
    public void sembolDegistir(char yeniSembol) {
        this.sembol = yeniSembol;
    }


}
