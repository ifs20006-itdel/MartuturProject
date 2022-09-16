public class cekHubungan {
    public String cekSyaratCinta(Orang a, Orang b) {
        CekRelasi cr = new CekRelasi();

        if (cr.cekTarito(a, b) == "ito") {
            System.out.println("Sayang sekali dia itomu");
        } else if (cr.cekTartulang(a, b) == "bere") {
            System.out.println("Sayang sekali, dia bere mu");
        } else if (cr.cekPariban(a, b) == "pariban") {
            System.out.println("Selamat, kamu bertemu pariban mu");
        } else {
            System.out.println("Gas kan aja, no problem");
        }
        return null;
    }
}
