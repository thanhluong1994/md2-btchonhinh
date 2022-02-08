import java.util.Scanner;

public class chonhinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        System.out.println("1.Hinh chu nhat");
        System.out.println("2.Hinh tam giac vuong o duoi");
        System.out.println("3.Hinh tam giac vuong o tren");
        System.out.println("4.Hinh tam giac can");
        System.out.println("0.Thoat");
        System.out.println("chon hinh");
        choice = input.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Hinh chu nhat");
                System.out.println("+ + + + + +");
                System.out.println("+ + + + + +");
                System.out.println("+ + + + + +");
                break;
            case 2:
                System.out.println("Hinh tam giac vuong o duoi");
                for (int i = 1; i <= 6; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("+");
                    }
                    System.out.printf("\n");
                }
                break;
            case 3:
                System.out.println("Hinh tam giac vuong o tren");
                for (int i = 6; i >= 1; i--) {
                    for (int j = 1; j <= i; j++) {
                        System.out.printf("+");
                    }
                    System.out.printf("\n");
                }
                break;
            case 4:
                System.out.println("Hinh tam giac can");
                for (int i = 1; i < 6; i++) {
                    for (int j = 1; j < 6 - i; j++)
                        System.out.printf(" ");
                    {
                        for (int j = 1; j <= 2 * i - 1; j++)
                            System.out.printf("+");
                    }
                    System.out.printf("\n");
                }
        }
    }
}