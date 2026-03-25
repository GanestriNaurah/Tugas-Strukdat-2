abstract class MakananLebaran {
    protected String nama;
    public MakananLebaran(String nama){
        this.nama = nama;
    }
    public void tampilkanInfo() {
        System.out.println("Nama Makanan: " + nama);
    }
    public String getnama(){
        return nama;
    }
}

class MakananUtama extends MakananLebaran {
    public MakananUtama(String nama){
        super(nama);
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Makanan Utama:");
        super.tampilkanInfo();
    }
}

class KueKering extends MakananLebaran {
    public KueKering(String nama){
        super(nama);
    }
    @Override
    public void tampilkanInfo(){
        System.out.println("Kue Kering:");
        super.tampilkanInfo();
    }
}

class Resep {
    private String bahan;
    private String langkah;

    public Resep(String bahan, String langkah){
        this.bahan = bahan;
        this.langkah = langkah;
    }
    public void tampilkanResep(){
        System.out.println("Bahan: " + bahan);
        System.out.println("Langkah: " + langkah);
    }
}
public class App{
    public static void main(String[] args)  {
        MakananLebaran m1 = new MakananUtama("Rendang");
        MakananLebaran m2 = new KueKering("Nastar");

        Resep r1 = new Resep (
            "\n1. Daging Sapi\n2.Bumbu Rendang Instan\n3. Santan", 
            "\n1. Tumis bumbu rendang instan hingga harum\n2. Masukkan daging sapi, aduk hingga berubah warna\n3. Tuang santan, masak dengan api kecil hingga daging empuk dan bumbu meresap");

        Resep r2 = new Resep (
            "\n1. Tepung Terigu\n2. Gula Pasir\n3. Mentega\n4. Telur", 
            "\n1. Campurkan tepung terigu, gula pasir, mentega, dan telur dalam wadah\n2. Aduk hingga adonan kalis\n3. Bentuk adonan sesuai selera dan panggang hingga matang");

        m1.tampilkanInfo();
        r1.tampilkanResep();
        System.out.println("===============");
        m2.tampilkanInfo();
        r2.tampilkanResep();
    }    
}