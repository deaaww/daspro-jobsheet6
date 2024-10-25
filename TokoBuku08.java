import java.util.Scanner;

public class TokoBuku08 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jenis buku (kamus, novel, atau lainnya): ");
        String jenisBuku = scanner.nextLine().toLowerCase();
        System.out.print("Masukkan jumlah buku yang dibeli: ");
        int jumlahBuku = scanner.nextInt();

        double diskon = 0;

       
        if (jenisBuku.equals("kamus")) {
            diskon = 10; 
            if (jumlahBuku > 2) {
                diskon += 2;
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7; 
            if (jumlahBuku > 3) {
                diskon += 2; 
            } else {
                diskon += 1; 
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5;
            }
        }

        System.out.println("Total diskon yang didapat: " + diskon + "%");

        sc.close();
    }
}

