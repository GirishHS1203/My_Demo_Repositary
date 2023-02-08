public class megaByteConveter {
    public static void printMegaByteAndKiloByte(int kiloBytes){
        if(kiloBytes< 0){
            System.out.println("Invalid Statement");
        }
        else{
            int megabyte=kiloBytes/1024;
            int kilobyte=kiloBytes%1024;
            System.out.println(kiloBytes +" KB = " +megabyte+ " MB and " + kilobyte+ " KB");
        }
    }

    public static void main(String[] args) {
        printMegaByteAndKiloByte(2500);
        printMegaByteAndKiloByte(5000);
        printMegaByteAndKiloByte(3000);
    }
}


//
//    public static void printMegaBytesAndKiloBytes(int kiloBytes){
//        if(kiloBytes< 0){
//            System.out.println("Invalid Value");
//        }
//        else{
//            int megabyte=kiloBytes/1024;
//            int Kilobyte=kiloBytes%1024;
//            System.out.println(kiloBytes +" KB = " +megabyte+ " MB and " + Kilobyte+ " KB");
//        }
//    }
//}
