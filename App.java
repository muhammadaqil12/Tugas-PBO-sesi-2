public class App {

    public static void main(String[] args) {
        Persegi persegiA = new Persegi(10);
        double kelilingPersegiBefore = persegiA.getKeliling();
        double luasPersegiBefore = persegiA.getLuas();

        System.out.println("Keliling Persegi Sebelum diubah: " + kelilingPersegiBefore); 
        System.out.println("Luas Persegi Sebelum diubah: " + luasPersegiBefore + "\n");

        persegiA.setSisi (5);
        double kelilingPersegiAfter = persegiA.getKeliling();
        double luasPersegiAfter = persegiA.getLuas();

        System.out.println("Keliling Persegi sesudah diubah: " + kelilingPersegiAfter); 
        System.out.println("Luas Persegi sesudah diubah: " + luasPersegiAfter + "\n");


        Books book1 = new Books("Putra", "Artificial Intelligence", 50000, 1);
        Books book2 = new Books("Malika", "Machine Learning", 30000, 2);

        double totalPrice = book1.buyBooks (2) + book2.buyBooks (4);
        System.out.println("\n" + "Total Harga yang harus dibayar Rp." + totalPrice);
    }
}
