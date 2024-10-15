package tr.com.turksat.saop.sekiller;

public class Ucgen implements Sekil {

    private int yukseklik;
    private char sembol;

    public Ucgen(int yukseklik, char sembol) {
        this.yukseklik = yukseklik;
        this.sembol = sembol;
    }

    @Override
    public void ciz() {
        for (int i = 1; i <= yukseklik; i++) {
            for (int j = 1; j <= i; j++) {
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
