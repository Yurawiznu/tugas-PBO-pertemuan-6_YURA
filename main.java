public class main {
     public static void main(String[] args) {
          
          Donatur donatur1 = new Donatur("Adi", "magetan", "Uang", 40000);

          System.out.println("Donatur 1:");
          donatur1.setNama("yura");
          donatur1.tampilkanInfo();

          System.out.println();
          
          Penerima penerima1 = new Penerima("yudi", "magetan", "Uang");
          System.out.println("Penerima1");
          penerima1.setNama("Bagus");
          penerima1.tampilkanInfo();

          System.out.println();

          System.out.print("Nama pembayar Zakat:" + donatur1.getNama()); System.out.println();
          System.out.println("Nama penerima zakat: " + penerima1.getNama());

         }

     }