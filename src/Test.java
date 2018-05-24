//import java.lang.Math;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test extends testChild {
    public static void main(String[] args) throws IOException {
//        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        do{
//            c=(char) bufferedReader.read();
//            System.out.println(c);
//        }while(c!='q');
        /*bufferedReader test*/
//        String string;
//        System.out.println("Enter lines of text, 'end' to quit");
//        do {
//            string=bufferedReader.readLine();
//            System.out.println(string);
//        }while(!string.equals("end"));
        Parent parent = new Parent();
        parent.show();


    }

}
class testChild {
    private String name = "test_child_string";
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
class Parent extends testChild implements A {
    public Parent(){
        System.out.println(getName());
    }
    public void show(){
        System.out.println("show time");
    }
}
