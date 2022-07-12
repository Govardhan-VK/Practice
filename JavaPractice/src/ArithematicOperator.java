
public class ArithematicOperator {
/*
 *  ArithematicOperator +,-,*,/,%
 */
     public static void main(String[] args) 
     {
          int s=4, b=8,a,c;
          int l1 = s+b;
          int l2 = s-b;
          int l3 = s*b;
          double l4 = (double) s/b; // type casting 
          int l5 = s%b;
          
          System.out.println(l1); 
          System.out.println(l2); 
          System.out.println(l3); 
          System.out.println(l4); 
          System.out.println(l5); 
          
         // a=++s; // pre increment - first it will increase the value of s and assign the value of s into the a operands.
          //c=s++; // post increment - first it will assign the value s into the a operands and then it will increment the s value.
          //System.out.println(a+" "+c+" "+s);
          
         // a=(--s + s) * (b + b++);
          //System.out.println(a+" "+s+" "+b);
          
          s++;
          System.out.println(s);
          
	 }
     
}
