import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try {eingabe();} catch (java.io.IOException e) {}

    }
    public static void eingabe() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");




        String name1 = reader.readLine();
        System.out.println("Enter your Birthday: " );
        String name2 = reader.readLine();
        System.out.println("Enter your sex: " );
        String name3 = reader.readLine();
        System.out.println("Enter your favourite colour: ");
        String name4 = reader.readLine();
        System.out.print("Your name is: "+name1+"\nYour birthday is:"+name2+"\nYour sex is : "+name3+"\nYour favourite colourn is: "+name4 );


    }

}

