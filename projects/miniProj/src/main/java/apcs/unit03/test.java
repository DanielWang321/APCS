package apcs.unit03;

public class test{
    public static void main(String[] args) {
        System.out.println(countDuplicates("helloooooo")); 
    }
    public static int countDuplicates(String name){
        int counter =0;
        int i=0;
        while(i<name.length()-1){
            if(name.charAt(i)==name.charAt(i+1)){
                while(name.charAt(i)==name.charAt(i+1)){
                    i++;
                    if(i>=name.length()-1){
                        break;
                    }
                }
                counter++;
            } else {
                i++;
            }
        }
        return counter;
    }
    
}