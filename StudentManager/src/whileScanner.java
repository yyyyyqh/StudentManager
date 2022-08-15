import java.util.Scanner;

public class whileScanner {
    public static void main(String[] args) {


        while(true){
            Scanner scanner = new Scanner(System.in);
            String tmp = scanner.nextLine();
            switch (tmp){
                case "123":
                    System.out.println(tmp);
                    break;

                case "1":
                    System.out.println("1");
                    break;
                default:
                    System.out.println("五");

            }
        }

    }
}
