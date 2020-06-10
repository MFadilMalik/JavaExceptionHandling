package javaexpceptionhandling;
public class exc2 {
    public static void main(String[] args){
        /* ~Sebelum~
        byte[] b = new byte[5];
        try{
            System.in.read();
        } catch (java.io.IOException);
        System.out.println("Hasil: "+(char) b[0]+ (char) b[1] + (char) b[2]); */
        // ~Setelah~ //
        byte[] b = new byte[5];
        try {
            System.out.print("Input: ");
            System.in.read(b);
        } catch (java.io.IOException e){
            System.out.println(e);
        }
        System.out.println("Hasil: "+(char) b[0]+ (char) b[1] + (char) b[2]);
    }
}
