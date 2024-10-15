package tr.com.turksat.saop.sekiller;

public class Dikdortgen implements Sekil {

    private int genislik;
    private int yukseklik;
    private char sembol;

    public Dikdortgen(int genislik, int yukseklik, char sembol) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.sembol = sembol;
    }

    @Override
    public void ciz() {
        for (int i = 0; i < yukseklik; i++) {
            for (int j = 0; j < genislik; j++) {
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
