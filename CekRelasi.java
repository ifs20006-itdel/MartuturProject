import java.util.Map;

public class CekRelasi {

    // untuk baoa
    public String cekPariban(Orang a, Orang b) {
        // pariban adalah ketika marga si boru sama dengan mama si baoa
        if (a.jenisKelamin == "baoa") {
            if (a.punguanIbu.equals(b.punguanAyah)) {
                return "pariban";
            } else {
                return "!pariban";
            }
        } else {
            if (a.punguanAyah.equals(b.punguanIbu)) {
                return "pariban";
            } else {
                return "!pariban";
            }
        }
    }

    public String cekTartulang(Orang a, Orang b) {
        // tulang terjadi ketika marga baoa sama dengan boru mamany
        if (a.jenisKelamin == "baoa") {
            if (a.punguanAyah.equals(b.punguanIbu)) {
                return "bere";
            } else {
                return "!bere";
            }
        } else {
            if (a.punguanIbu.equals(b.punguanAyah)) {
                return "tulang";
            } else {
                return "!tulang";
            }
        }
    }

    // untuk boru

    // untuk baoa dan boru
    public String cekTarito(Orang a, Orang b) {
        // tarito terjadi jika kedua marga ayah sama
        if (a.jenisKelamin != b.jenisKelamin) {
            if (a.punguanAyah.equals(b.punguanAyah) || a.punguanIbu.equals(b.punguanIbu)) {
                return "ito";
            } else {
                return "!ito";
            }
        } else if (a.jenisKelamin != b.jenisKelamin && a.jenisKelamin == "boru") {
            if (a.punguanAyah.equals(b.punguanAyah) || a.punguanIbu.equals(b.punguanIbu)) {
                return "appirik";
            } else {
                return "!appirik";
            }
        } else {
            if (a.punguanAyah.equals(b.punguanAyah) || a.punguanIbu.equals(b.punguanIbu)) {
                return "appara";
            } else {
                return "!appara";
            }
        }
    }

}
