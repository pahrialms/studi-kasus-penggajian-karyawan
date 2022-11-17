public class AplikasiPenggajianKaryawan {
    public static java.util.Scanner scanner = new java.util.Scanner(System.in);

    public static void main(String[] args) {
        systemPenggajian();
    }
    public static void systemPenggajian(){
        int[] gajiKaryawan = {5000000,6500000,9500000};
        int[] lembur = {30,32,34,36,38};
        while (true){
            System.out.println("======== MENU ========");
            System.out.println("Tersedia golongan [A,B,C]");

            var input1 = input("Silahkan Pilih Salah Satu Golongan");
            if(input1.equals("A")){
                var input2 = input("Masukan Berapa Jam Anda Lembur [Tersedia 1-5] ");
                if (input2.equals("1")){
                    var uangLembur = gajiKaryawan[0] * lembur[0] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[0] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[0]));
                } else if (input2.equals("2")) {
                    var uangLembur = gajiKaryawan[0] * lembur[1] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[0] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[0]));
                } else if (input2.equals("3")) {
                    var uangLembur = gajiKaryawan[0] * lembur[2] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[0] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[0]));
                } else if (input2.equals("4")) {
                    var uangLembur = gajiKaryawan[0] * lembur[3] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[0] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[0]));
                } else if (input2.equals("5")) {
                    var uangLembur = gajiKaryawan[0] * lembur[4] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[0] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[0]));
                }
                break;
            }else if(input1.equals("B")){
                var input2 = input("Masukan Berapa Jam Anda Lembur [Tersedia 1-5]");
                if (input2.equals("1")){
                    var uangLembur = gajiKaryawan[1] * lembur[0] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[1] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[1]));
                } else if (input2.equals("2")) {
                    var uangLembur = gajiKaryawan[1] * lembur[1] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[1] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[1]));
                } else if (input2.equals("3")) {
                    var uangLembur = gajiKaryawan[1] * lembur[2] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[1] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[1]));
                } else if (input2.equals("4")) {
                    var uangLembur = gajiKaryawan[1] * lembur[3] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[1] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[1]));
                } else if (input2.equals("5")) {
                    var uangLembur = gajiKaryawan[1] * lembur[4] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[1] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[1]));
                }
                break;
            } else if (input1.equals("C")) {
                var input2 = input("Masukan Berapa Jam Anda Lembur [Tersedia 1-5]");
                if (input2.equals("1")){
                    var uangLembur = gajiKaryawan[2] * lembur[0] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[2] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[2]));
                } else if (input2.equals("2")) {
                    var uangLembur = gajiKaryawan[2] * lembur[1] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[2] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[2]));
                } else if (input2.equals("3")) {
                    var uangLembur = gajiKaryawan[2] * lembur[2] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[2] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[2]));
                } else if (input2.equals("4")) {
                    var uangLembur = gajiKaryawan[2] * lembur[3] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[2] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[2]));
                } else if (input2.equals("5")) {
                    var uangLembur = gajiKaryawan[2] * lembur[4] / 100;
                    System.out.println("Lembur : Rp." + uangLembur + "\nGaji Pokok : Rp." + gajiKaryawan[2] + "\nTotal : Rp." +(uangLembur + gajiKaryawan[2]));
                }
                break;
            }else {
                System.err.println("Pilihan Tidak Di Mengerti");
            }
        }
    }
    public static String input(String gol){
        System.out.println(gol + " : ");
        String golongan = scanner.nextLine();
        return golongan;
    }

//    public static void testSystemPenggajian(){
//        systemPenggajian();
//    }
//    public static void systemLemburKaryawan(){
//        int[] lembur = {30,32,34,36,38};
//
//        var jamLembur = input("Berapa Jam Lembur");
//        if (jamLembur.equals("1")){
//            System.out.println(lembur[0] * 100);
//        } else if (jamLembur.equals("2")) {
//            System.out.println(lembur[1] * 100);
//        } else if (jamLembur.equals("3")) {
//            System.out.println(lembur[2] * 100);
//        } else if (jamLembur.equals("4")) {
//            System.out.println(lembur[3] * 100);
//        } else if (jamLembur.equals("5")) {
//            System.out.println(lembur[4] * 100);
//        }
//    }
//    public static void testSystemLemburKaryawan(){
//        systemLemburKaryawan();
//    }
//
//
//
//
//    public static void testInput(){
//        var golBer = input("Pilih Golongan A, B atau C ");
//        System.out.println("Anda Golongan " + golBer);
//    }

}
