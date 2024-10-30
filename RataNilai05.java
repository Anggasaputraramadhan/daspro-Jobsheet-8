import java.util.Scanner;

public class RataNilai05 {

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);
        int i,j;
        float Nilai, totalNilai, rataNilai, NilaiMhs;

        i=1;
        while (i <= 5) {
        totalNilai = 0;
        System.out.println("Input Nilai Mahasiswa ke- " + i);
        for (j = 1; j <= 5; j++) {
            System.out.println("Nilai ke-" +j + " = ");
            NilaiMhs = sc05.nextInt();
            totalNilai += NilaiMhs;
        }
        rataNilai=totalNilai/5;
        System.out.println("Rata Rata Nilai ke- " + i + " adalah " + rataNilai);
        i++;

        }
    }
}