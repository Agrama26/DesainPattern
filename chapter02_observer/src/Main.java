//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("\n");
        Channel ch = new Channel("Bryan Furran");
        User user1 = new User("Wika Wika");
        User user2 = new User("Jobot TV");
        User user3 = new User("Jinjit Karunia");

        ch.addSubscriber(user1);
        ch.addSubscriber(user2);
        ch.notifyUser("Ada Video baru yang diposting untuk anda!!");

        user3.subscribe(ch);
        ch.notifyUser("Video Baru!!");

        OrderCreation orderCreation = new OrderCreation(new InvoiceCreation(), new StockUpdater());
        orderCreation.createOrder();

        System.out.println("\n");

        // Membuat instance dari pembuatan pesanan dengan penerbit yang sesuai
        PenerbitPembuatanPesanan penerbit = new PenerbitPembuatanPesanan();

        // Menambahkan pelanggan untuk pembaruan stok dan pembuatan faktur
        penerbit.tambahPelanggan(new PembaruanStok()).tambahPelanggan(new PembuatanFaktur());

        // Membuat instance dari pembuatan pesanan dengan penerbit yang telah disiapkan
        PembuatanPesanan pembuatanPesanan = new PembuatanPesanan(penerbit);

        // Memulai proses pembuatan pesanan
        pembuatanPesanan.buatPesanan();
    }
}