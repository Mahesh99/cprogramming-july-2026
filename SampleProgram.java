import java.io.*;
import java.uitl.*;
public class SampleProgram {
    public static void main(String[] args) {
        SampleProgram sp = new SampleProgram();
        int r=sp.add(2,3);
        System.out.println(r);
        

    }

    int add(int a,int b) {
        int c;
        c=a+b;
        return c;
    }

}
