import java.io.*;

class Demo{
public static void main(String[] args){
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the number");
int num = br.readLine();
System.out.println("Entered number is "+num);
}
}