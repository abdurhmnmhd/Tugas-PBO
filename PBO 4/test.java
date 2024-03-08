public class test {
    public static void main(String[] args) {
        persegi persegi = new persegi(4);
        persegi.getInfo();
        System.out.println();

        lingkaran lingkaran = new lingkaran(7);
        lingkaran.getInfo();
        System.out.println();

        samasisi samasisi = new samasisi(5, 2, 6);
        samasisi.getInfo();
        System.out.println();

        samakaki samakaki = new samakaki(5, 4, 8);
        samakaki.getInfo();
        System.out.println();

        sembarang sembarang = new sembarang(8, 6, 4);
        sembarang.getInfo();
        System.out.println();

        sikusiku sikusiku = new sikusiku(9, 6, 5);
        sikusiku.getInfo();
        System.out.println();
    }
    
}
