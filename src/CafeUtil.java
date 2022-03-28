import java.util.ArrayList;
import java.util.Scanner;

class CafeUtil {

    public static int getStreakGoal(){
        //10
        int suma=0;
        for (int i = 1; i <= 10; i++) {
            suma +=i;
        }
        return suma;
    }
    public static int getStreakGoal(int numWeek){
        //10
        int suma=0;
        for (int i = 1; i <= numWeek; i++) {
            suma +=i;
        }
        return suma;
    }
    public static double getOrderTotal(double[] prices){
        double sum=0;
        for (int i = 0; i < prices.length; i++) {
            sum +=prices[i];
        }
        return sum;
    }
    public static void displayMenu(ArrayList<String> menuItems){
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + " " + menuItems.get(i));
        }
    }
    public static void addCustomer(ArrayList<String> customers){
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu nombre:");
        String userName = input.nextLine();
        // String userName = System.console().readLine();
        System.out.println("Hola "+userName);
        System.out.println("Hay "+customers.size()+" personas frente a ti");
        customers.add(userName);
        System.out.println("-- Lista --");
        for (int i = 0; i < customers.size(); i++) {
            System.out.println(customers.get(i));
        }
    }
}
