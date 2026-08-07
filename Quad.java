import java.util.Scanner;
public class Quad{
public static void main(string[]args){
    scanner sc= new scanner(system.in); 
    double a,b,c,d, root1, root2;
    system.out.print("Enter the values of ab,b,c:");

    a= sc.nextdouble();
    b=sc.nextdouble();
    c=sc.nextdouble();

    d= b*b-4*a*c;

    if (d>0){
        root1= (-b+Math.sqrt(d))/(2*a);
        root2= (-b-Math.sqrt(d))/(2*a);
        system.out.println("The roots are " + root1 + " and " + root2);
    }
    else if (d==0){
        root1= b/(2*a);
        system.out.println("equal Root is " + root1);
    }
    else
        sc.close()
}

}
