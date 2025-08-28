package apcs.unit01;

/*
Topics to cover:
basic program layout
comments
class header
main method header
naming rules and conventions
print vs. println
escape characters
identifying errors - types of errors
predict the output
fix me
*/
//this is a line comment
//identifier: any thing that you are naming (Class, variable, function/method, constant)

/*
    1. Can contain underscores, letters, digits, $
    2. Can begin with underscores, letters, $
    3. Cannot be a keyword (reserved word)

    Naming concentions:
    1. camelcase
    2. class names begin with capital letter
    3. function & variable names should begin with lowercase
    4. constants (enums) in all caps
    5. identifier names should be meaningful
 */

 // \n makes a new line within a string
// \t creates a tab
// \\ - \ in output stream
// \" - allows for " in output stream
/*
Type of errors:
1. Syntax error: u broke one of the rules of the language, occurs at COMPILE time
2. Run time error -  in Java called an exception. This means your program compiles fine, runs to a point, but then crashes
3. Logic Error - program compiles and runs but doesn't behave the way its supposed to
*/
public class Notes_1_1 //class header
{ 
    //public: access modifier, accessed by other class
    //class: type we are creating
    //notes_1_1 is name of class
    public static void main(String[] args){
        //static: not an instance function, not intended to be called on a particular object
            //but perform on a generic operation
        //void: return type of function, void means that its not returning anything
        //inside () is parameter list: what function needs to do its job
        System.out.println("hello world"); //prints characters to console with newline
        System.out.print("My name is Daniel"); //prints characters to console w/o newline
        System.out.println(" I am 16 years old");
        System.out.println("other");
        
    }

}//braces define class body

/*
predict the output:
Example 1:
System.out.println("This\tis a \"crazy\"\nline/nof text\\!");
Example 2:
System.out.print("\"Welcome//to APCS!\nLet's have a great year!\""
System.out.println(" -Said someone :\\")

fix me:
public class Notes_1_1
{
    public static void main(String[] args)
    {
        System.out.println("Hello World!");
        System.out.print("Welcome to APCS :)");
    }
}
*/
