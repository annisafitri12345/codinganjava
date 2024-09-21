import java.util.Scanner;

public class InputKeyboard01 {
    public static void main(String[] args) {
        // deklarasi variable atau obyek
        Scanner in = new Scanner (System.in); // membuat objek
        String nama;

        // input-- begin
        System.out.print("Tulis nama:");

        /*
        contoh method dari objek input keyboard
        nextLine() untuk membaca inputan dari keyboard tipe data string 
         */
    
        nama = inputKeyboard.nextLine();
        // input -- end

        //output
        System.out.println("Nama adalah" + nama);

    }
}
