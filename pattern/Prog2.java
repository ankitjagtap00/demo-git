package pattern;
import java.util.Scanner;
public class Prog2 {

	public static void main(String[] args) {
		int array[],total=0;
	       array=new int[5];
	       int i,max,k=0;
	       Scanner sc=new Scanner(System.in);
	       System.out.println("enter 5 numbers");
	       for(i=0;i<5;i++) {
	    	   array[i]=sc.nextInt();
	    	   
	       }
	       max=array[0];
	       for(i=1;i<5;i++) {
	    	   total=total+array[i];
	    	   if(array[i]>max) {
	    		   max=array[i];
	    		   k=i;
	    		 
	    	   }
	    	
	    	   
	       }
	       System.out.println("largest element is array["+k+"]="+array[k]);
	       System.out.println("average="+total/5);
	}

}
