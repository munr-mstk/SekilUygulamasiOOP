package tr.com.turksat.saop.sekiller;

public class Daire  implements  Sekil{


    private int cap;
    private char sembol;

    public Daire(int cap, char sembol) {
        this.cap = cap;
        this.sembol = sembol;
    }

    @Override
    public void ciz() {
        double r = cap / 2.0;
        for (int i = 0; i <= cap; i++) {
            for (int j = 0; j <= cap; j++) {
                double distance = Math.sqrt(Math.pow(i - r, 2) + Math.pow(j - r, 2));
                if (distance > r - 0.5 && distance < r + 0.5) {
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
