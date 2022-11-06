import java.util.Scanner;
import java.util.Vector;

public class question1 {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Size of array ?");
        int number_of_elements = input.nextInt(); // get size from user
        Vector v = new Vector(number_of_elements);

        String element;
        for (int i = 0; i < number_of_elements; i++) // iterate till vector full or keyword entered
        {
            element = input.next();
            if (element.equals("break")) { // if "break" keyword entered then stop inputing elements
                break;
            } else {
                v.addElement(element); // add element to vector as string
            }
        }
        System.out.println("the elements you entered are ");
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));
        }

    }

}
