package CM;

public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks){
        this.kodeMK=kodeMK;
        this.namaMK=kodeMK;
        this.sks=sks;
    }
    public void tampilMatakuliah(){
        System.out.println("Kode MK: " + kodeMK + " | Nama MK: " + namaMK + " | SKS: " + sks);
    }
}