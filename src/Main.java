import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String metin="";
        System.out.println("Doğum Tarihinizi Giriniz: ");
        int tarih = scanner.nextInt();
        int artik= tarih%12;
        if (artik==0){
            metin ="Maymun";
        } else if (artik==1) {
            metin="Horoz";
        } else if (artik==2) {
            metin="Köpek";
        } else if (artik==3) {
            metin="Domuz";
        } else if (artik==4) {
            metin="Fare";
        } else if (artik==5) {
            metin="Öküz";
        } else if (artik==6) {
            metin="Kaplan";
        } else if (artik==7) {
            metin="Tavşan";
        } else if (artik==8) {
            metin="Ejderha";
        } else if (artik==9) {
            metin="Yılan";
        } else if (artik==10) {
            metin="At";
        } else if (artik==11) {
            metin="Koyun";
        }

        System.out.println("Çin Zodyağı Burcunuz: " + metin);

    }
}