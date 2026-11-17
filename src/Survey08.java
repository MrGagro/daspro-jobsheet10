import java.util.Scanner;

public class Survey08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int survey[][] = new int[10][6];

        for(int i = 0; i < 10; i++) {
            System.out.println("Responder ke-" + (i + 1));
            for(int j = 0; j < 6; j++) {
                System.out.println("Pertanyaan ke-" + (j + 1) + "(1-5): ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Rata-rata tiap responden");
        for(int i = 0; i < 10; i++) {
            int total = 0;
            for(int j = 0; j < 6; j++) {
                total += survey[i][j];
            }
            double rata = total / 6.0;
            System.out.println("Rata-rata responden ke-" + (i + 1) + ": " + rata);
        }

        int totalSemua = 0;
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < 6; j++) {
                totalSemua += survey[i][j];
            }
        }

        double rataSemua = totalSemua / 60.0;
        System.out.println("Rata-rata keseluruhan: " + rataSemua);
        sc.close();
    }
}
