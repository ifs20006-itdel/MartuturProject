import java.util.*;

public class DataMarga {
    public List<Map<String, String>> Marga = new ArrayList<Map<String, String>>();

    DataMarga() {
        tambahMarga();
    }

    public String cekPunguan(String a) {
        for (int i = 0; i < 2; i++) {
            for (Map.Entry<String, String> entry : Marga.get(i).entrySet()) {
                if (a == entry.getKey()) {
                    return entry.getValue();
                }
            }
        }
        return null;
    }

    public void tambahMarga() {
        Map<String, String> Lontung = new HashMap<>();
        Lontung.put("sinaga", "lontung");
        Lontung.put("situmorang", "lontung");
        Lontung.put("pandiangan", "lontung");
        Lontung.put("nainggolan", "lontung");
        Lontung.put("simatupang", "lontung");
        Lontung.put("aritonang", "lontung");
        Lontung.put("siregar", "lontung");

        Map<String, String> Silahisabungan = new HashMap<>();
        Silahisabungan.put("haloho", "silahisabungan");
        Silahisabungan.put("silalahi", "silahisabungan");
        Silahisabungan.put("tambunan", "silahisabungan");
        Silahisabungan.put("sinurat", "silahisabungan");
        Silahisabungan.put("tambun", "silahisabungan");
        Silahisabungan.put("tungkir", "silahisabungan");
        Silahisabungan.put("dabutar", "silahisabungan");
        Silahisabungan.put("debang", "silahisabungan");
        Silahisabungan.put("pintubatu", "silahisabungan");
        Silahisabungan.put("rumasondi", "silahisabungan");
        Silahisabungan.put("tambunan", "silahisabungan");

        Map<String, String> PurajaLaguboti = new HashMap<>();
        PurajaLaguboti.put("pangaribuan", "PurajaLaguboti");
        PurajaLaguboti.put("hutapea", "PurajaLaguboti");

        Map<String, String> Siahaan = new HashMap<>();
        Siahaan.put("Simanjuntak", "siahaan");
        Siahaan.put("Hutagaol", "siahaan");

        Map<String, String> SiOpatPisoran = new HashMap<String, String>();
        SiOpatPisoran.put("hutagalung", "SiOpatPisoran");
        SiOpatPisoran.put("hutabarat", "SiOpatPisoran");
        SiOpatPisoran.put("panggabean", "SiOpatPisoran");
        SiOpatPisoran.put("lumbantobing", "SiOpatPisoran");
        SiOpatPisoran.put("simorangkir", "SiOpatPisoran");
        SiOpatPisoran.put("hutapea", "SiOpatPisoran");

        Map<String, String> Nairasaon = new HashMap<>();
        Nairasaon.put("manurung", "Nairasaon");
        Nairasaon.put("sitorus", "Nairasaon");
        Nairasaon.put("sirait", "Nairasaon");
        Nairasaon.put("butarbutar", "Nairasaon");

        // Adding to marga
        Marga.add(Lontung);
        Marga.add(Silahisabungan);
        Marga.add(PurajaLaguboti);
        Marga.add(Siahaan);
        Marga.add(SiOpatPisoran);
        Marga.add(Nairasaon);
        //a comment
    }

}
