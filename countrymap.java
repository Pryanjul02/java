import java.util.HashMap;
import java.util.Scanner;

public class countrymap {
    public static void main(String[] args) {
        HashMap<String , String > countrymap = new HashMap<>();
        countrymap.put("India" , "New Delhi");
        countrymap.put("Pakistan" , "Islamabad");
        countrymap.put("China" , " Beijing");
        countrymap.put("Bangladesh" , "Dhaka");
        countrymap.put("Sri Lanka " , "Columbo");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name of the country: ");
        String country = input.next();

        if(countrymap.containsKey(country)){
            System.out.printf("Capital of %s : %s" , country , countrymap.get(country));
        }else{
            System.out.println("OOPS!! sorry.......please enter a valid country. ");
        }

    }
}
