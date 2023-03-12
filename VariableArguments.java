
public class VariableArguments {
    static int sum(int...arr) {

        /*you can make a method to take no parameter as input or you can restrict it to 
         * at least give a single input by separating it by a coma before '...arr'
         */

        /* variable arguments will be very helpful if you want to change 
        parameters every time you use this feature */

        int result = 0;
        for(int a: arr) {
            result += a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(sum(2,34,5,3,4,5,5,6,5));
    }
}
