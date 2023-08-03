import java.util.Arrays;

public class arrays {
    public static void main(String[] args) {
        // int i;
        // System.out.println(i);
        // int[] arr = new int[10]; {0,0,0,0,0,0,0,0,0,0}
        // String[] arrName = new String[20]; {"","",...,""}

        //String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        /*
         * 1 String[] cars
         * 2 String[] = {};
         * 3 String[] = {"Volvo", "BMW", "MG", "Ford", "Mazda"}
         */

        String[] cars = {"Volvo", "BMW", "Ford", "MG"};
        String[] carBrands = {
            "Toyota",
            "Honda",
            "Ford",
            "Chevrolet",
            "Nissan",
            "BMW",
            "Mercedes-Benz",
            "Audi",
            "Hyundai",
            "Kia",
            "Volkswagen",
            "Lexus",
            "Subaru",
            "Mazda",
            "Tesla",
            "Jeep",
            "Volvo",
            "Porsche",
            "Ferrari",
            "Lamborghini"
            // Add more car brands here if you like
        };
        // System.out.println(carBrands[4]);
        // carBrands[4] = "new";
        //int[] numbers = {1, 2, 3, 4, 5};

        // System.out.println(numbers);
        // System.out.println("Arrays.toString()");
        // String arrValue = Arrays.toString(numbers);
        // System.out.println(arrValue);
        // System.out.println(Arrays.toString(numbers));

        // System.out.print("cars[]: ");
        // System.out.println(Arrays.toString(cars));

        // System.out.print("----------------------");
        // System.out.println(cars[0]);
        // System.out.println(cars[1]);
        // System.out.println(cars[2]);
        // System.out.println(cars[3]);

        // System.out.println(cars[3]);
        // cars[3] = "Tesla";
        // System.out.println(cars[3]);
        // System.out.print("cars[]: ");
        // System.out.println(Arrays.toString(cars));

        //System.out.println(carBrands.length);
        //int i = 245;

        // for(int i = 0; i < carBrands.length; i++){
        //     System.out.println(carBrands[i]);
        // }
        
        /*
         * for each
         * for(datatype tokens: arr){
         *
         * }
         */
        // for(String e : carBrands){
        //     System.out.println(e);
        // }

        // int[] numbers = {1, 2, 3, 4, 5};
        // for(int n : numbers){
        //     System.out.println(n);
        // }

        for(int i = 0; i < carBrands.length; i++){
            System.out.print(i + ": ");
            System.out.println(carBrands[i]);
        }


        System.out.println("_______________________________");
        System.out.println("for each");
        for(String e : carBrands){
            System.out.println(e);
        }
    }
}
