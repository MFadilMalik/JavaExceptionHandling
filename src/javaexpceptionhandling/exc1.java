package javaexpceptionhandling;
public class exc1 {
    public static void main(String[] args) {
        /* ~Sebelum~
        int n = 0;
        n = System.in.read();
        System.out.println("Hasil: "+(char) n); */
        // ~Setelah~ //
        int n = 0;
        try{  
            System.out.print("Input: ");
            n = System.in.read();
        } catch (Exception e){
            System.out.println(e);
        }
        System.out.println("Hasil: "+(char) n);
    }  
}