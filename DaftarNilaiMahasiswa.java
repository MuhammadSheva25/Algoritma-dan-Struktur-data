import java.util.Scanner;

public class DaftarNilaiMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Soal No. 1
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        System.out.println("________________________________");

        String[] nama = new String[jumlahData];
        double[] nilai = new double[jumlahData];
        String[] status = new String[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Mahasiswa Ke : " + (i + 1));
            System.out.print("Nama: ");
            nama[i] = input.next();
            System.out.print("Nilai: ");
            nilai[i] = input.nextDouble();
            System.out.println("________________________________");
        }

        double totalNilai = 0;
        System.out.println("\nDAFTAR NILAI MAHASISWA\n================================");
        System.out.println("No\tNama\tNilai\tStatus");

        for (int i = 0; i < jumlahData; i++) {
            if (nilai[i] >= 60) {
                status[i] = "Lulus";
            } else {
                status[i] = "Tidak Lulus";
            }

            System.out.println((i+1) + "\t" + nama[i] + "\t" + nilai[i] + "\t" + status[i]);
            totalNilai += nilai[i];
        }

        double rataRata = totalNilai / jumlahData;
        System.out.println("================================");
        System.out.println("Jumlah: " + totalNilai);
        System.out.println("Nilai Rata-rata: " + rataRata);
    }
}
