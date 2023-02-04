public class Exercice2 {

    public void execute() {
        /*
        1- Create a program that declares several variables of different data types, including at least one variable of each of the following types: int, double, char, and boolean.
        2- Assign values to each of the variables.
        */
        int var1 = 1;
        double var2 = 1;
        char var3 = 'A';
        boolean var4 = true;

        //3-Print the value of each variable to the console
        System.out.println(var1);
        System.out.println(var2);
        System.out.print(var3);
        System.out.print(var4);

        //4-Modify the values of the variables and print the new values to the console.
        var1 = 2;
        var2 = 2;
        var3 = 'B';
        var4 = false;

        System.out.println(var1);
        System.out.println(var2);
        System.out.print(var3);
        System.out.print(var4);

        //5-Use at least one type casting operation in the program, such as casting a double to an int.
        double var1_prime = (double) var1;

        //6-Use at least one mathematical operation, such as addition or multiplication, with the variables.
        double var5 = var1 + var2;

        //7-Use at least one comparison operator, such as > or ==, to compare the values of two or more variables
        double var6 = var1_prime <= var1 ? var1_prime : var1;

        //8-Use at least one control flow statement, such as an if-else statement or a switch statement, to make a decision based on the values of the variables.
        if (var1 >= var2) {
            var3 = 'C';
        }


    }
}
