package javaexpceptionhandling;
public class exc3 {
    public static void main(String[] args) {
        /* ~Sebelum~ 
        byte[] b = new byte[5];
        System.out.println("Input Bilangan Bulat: ");
        try{
            System.in.read();
        } catch (java.io.IOException);
        int N = Integer.valueOf(b).intValue();
        System.out.println("Hasil: "+(N+2)); */
        // ~Setelah~ //
        byte[] b = new byte[5];
        System.out.print("Input Bilangan Bulat: ");
        try{
            System.in.read(b);
        } catch (java.io.IOException e){
            System.out.println(e);
        }
        // Konversi Array Byte ke String //
        String a = new String(b).trim();
        int N = Integer.valueOf(a);
        System.out.println("Hasil: "+(N+2));
    } 
}
