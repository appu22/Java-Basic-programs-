import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        
        Scanner my = new Scanner(System.in);
        
        System.out.println("Enter Reverse String..");
        String name =  my.nextLine();
        String temp = reversString(name);
        System.out.println("reverse= "+temp);
    }
    
    public static String reversString(String name){
        //String reverString = "hello";
        String temp = "";
        char ch;
        for(int i= 0; i<name.length(); i++){
            //System.out.println("i "+i);
            char res = name.charAt(i);
            //System.out.println("reverse "+res);
            temp =res+temp;
        }
        //System.out.println("reverse= "+temp);
        return temp;
    }
}
