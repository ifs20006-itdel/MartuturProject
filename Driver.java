import java.util.Scanner;

public class Driver {
    Scanner sc = new Scanner(System.in);
    static DataMarga dm = new DataMarga();

    public static void main(String[] args) {
        CekRelasi cr = new CekRelasi();

        Orang Guntur = new Orang("sinaga", "tambunan", "baoa");
        Orang Hmmm = new Orang("sinurat", "aritonang", "boru");

        System.out.println(cr.cekTartulang(Guntur, Hmmm));
    }
}

// Evaluasi

// "Fungsi diatas mungkin dapat menampilkan hubungan appara yang berada dalam
// marga yang sama. Namun akan sulit jika harus menghubungkan ke kumpulan marga
// yang lain. Dimana akan kesulitan jika harus beralih ke kumpulan marga yang
// lain."

// Solusi yg mungkin adalah menggunakan array of map. penggunaan map agar dapat
// mengetahui nama kumpulan marganya dan penggunaan Array untuk memudahkan
// iterasi antar marga
