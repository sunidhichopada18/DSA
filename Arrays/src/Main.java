public class Main {
    public static void main(String[] args) {
        //Q: store a roll no.
        int a = 19;
        //Q: store a person's name
        String name = "Sunidhi Chopada";
        //Store 5 roll nos.
        int rno1 = 23;
        int rno2 = 55;
        int rno3 = 18;

        /*
            --- syntax ---
        datatype[] variable_name = new datatype[size];

        Example:
        store 5 roll numbers:
        int [] rnos = new int[5];

           --- or directly ---
        int[] rnos2 = {23, 12, 45, 32, 15};
        (all the type of the data in the array should be same!)
        */

        int[] ros; //declaration of array. ros is getting defined in the stack
        ros = new int[5]; // initialization: actually here object is being created in the memory (heap)
        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }
}