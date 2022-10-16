import java.util.Scanner;

public class Year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    int year;
        do {
            System.out.println("Doğum yılını giriniz 0-3000 arasında ");
            year = sc.nextInt();

        }while (year<0 && year>3000);
        int kalan=year%12;
        switch (kalan){
            case 0:
                System.out.println("Maymun yılı");
                break;
            case 1:
                System.out.println("Horoz yılı");
                break;
            case 2:
                System.out.println("Köpek yılı");
                break;
            case 3:
                System.out.println("Domuz yılı");
                break;
            case 4:
                System.out.println("Fare yılı");
                break;
            case 5:
                System.out.println("Öküz yılı");
                break;
            case 6:
                System.out.println("Kaplan yılı");
                break;
            case 7:
                System.out.println("Tavşan yılı");
                break;
            case 8:
                System.out.println("Ejderha yılı");
                break;
            case 9:
                System.out.println("Yılan yılı");
                break;
            case 10:
                System.out.println("At yılı");
                break;
            case 11:
                System.out.println("Koyun yılı");
                break;
        }
    }
}
