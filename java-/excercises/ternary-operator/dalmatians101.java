import java.util.Scanner;
public class dalmatians101 {
    public static String howManyDalmatians(int number) {
        String[] dogs = {"Error, there must be at least one!", "Hardly any", "More than a handful!", "Woah that's a lot of dogs!", "101 DALMATIANS!!!"};
        String response = (number <= 0) ? dogs [0] :
                          (number <= 10) ? dogs[1] :
                          (number <= 50) ? dogs[2] :
                          (number == 101) ? dogs[4] : dogs[3];
        return response;
    
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Insert the number of dogs");

        int number = sc.nextInt();

        String response = howManyDalmatians(number);

        System.out.println(response);

        sc.close();


    }
}