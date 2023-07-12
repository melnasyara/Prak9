public class Main {
    public static void main(String [] args) {

        Buku buku1 = new Buku("0001", "Pemrogramman Java");
        Buku buku2 = new Buku("0002", "Pemrogramman C++");
        BukuLuar buku3 = new BukuLuar("0003", "Pemrogramman Python");

        Petugas petugas1 = new Petugas("Alex", "P001");
        Peminjam peminjam1 = new Mahasiswa();
        peminjam1.setNamaPeminjam("Cinta");
        peminjam1.setKodePeminjam("M002");

        peminjam1.doLogin();

        try{
        Peminjaman peminjaman1 = new Peminjaman(peminjam1, petugas1, buku3);
        Denda denda = new Denda(7);
        System.out.println("Nama Peminjam :"+peminjaman1.getPeminjam().getNamaPeminjam());
        System.out.println("Kode Peminjam :"+peminjaman1.getPeminjam().getKodePeminjam());
        System.out.println("Nama Petugas :"+peminjaman1.getPetugas().getNamaPetugas());
        System.out.println("Nama Buku :"+peminjaman1.getBuku().getNamaBuku());
        System.out.println("Tagihan denda: "+denda.getTagihan());
        denda.addAntiDenda();
        System.out.println("=== Denda dihapuskan ! ===");
        System.out.println("Tagihan denda: "+denda.getTagihan());
        denda.addAntiDenda();
        System.out.println("=== Denda ditambahkan ===");
        System.out.println("Tagihan denda: "+denda.getTagihan());
        }catch (Exception e){
            System.out.println("Terjadi Kesalahan"+e.getMessage());
        } finally {
            System.out.println("Program Selesai");
        }
    }
}
public class Denda {
    private static final int TARIF_DENDA = 10000;
    private int hariTerlambat;

    public Denda(int hariTerlambat) {
        this.hariTerlambat = hariTerlambat;
    }

    public int getHariTerlambat() {
        return hariTerlambat;
    }

    public int getTagihan() {
        return TARIF_DENDA * hariTerlambat;
    }

    public void addAntiDenda() {
        this.hariTerlambat = 0;
    }
}