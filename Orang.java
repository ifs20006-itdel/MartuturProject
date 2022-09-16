public class Orang {
    public String margaAyah;
    public String boruMama;
    public String punguanAyah;
    public String punguanIbu;
    public String jenisKelamin;

    Orang(String margaAyah, String boruMama, String jenisKelamin) {
        DataMarga dm = new DataMarga();
        this.boruMama = boruMama;
        this.margaAyah = margaAyah;
        this.punguanAyah = dm.cekPunguan(margaAyah);
        this.punguanIbu = dm.cekPunguan(boruMama);
    }
}
