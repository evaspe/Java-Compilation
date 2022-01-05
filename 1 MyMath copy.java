import java.lang.Math;
import java.lang.System;

public class MyMath {

    //this function calculates square roots using bisection method, accepts a double random number, returns double sqrt
	static double sqrt(double d){

        int removefour=0; //variable to keep track of how many times we remove four

        // this loop is to make the input between 0-1 so we can use the bisection method
        while(d>1){
            d=d/4;
            removefour++;
        }
    
        
        double mid=.5;  //midpoint
        double lower=0; //lower bound
        double upper=1; //upper bound

        //bisection method loop
        while(upper-lower>.0000000001)
            {if(d<=mid*mid){
                upper=mid;
            }
            
             else {
                lower=mid;
            }
        
             mid= lower + ((upper-lower)/2);
        }
    
        //multiply back the 2 powers from taking out root 4 earlier
        if(removefour<1){
			return lower;
			
        }
        else {
			return lower*Math.pow(2, removefour);
		}
        }

        public static void main(String[] args){
        
            long time1=System.currentTimeMillis(); //start time for mymath sqrt

            //loop to run MyMath sqrt function
            for (int i=0; i<100000; i++){
                double rand=Math.random() * 100;
                sqrt(rand);
                }

            long time2= System.currentTimeMillis(); //end time for mymath sqrt, start time for math sqrt
           
            //loop to run the Math.sqrt function
            for (int i=0; i<100000; i++){
                double rand=Math.random() * 100;
                Math.sqrt(rand);
                    }

            long time3 = System.currentTimeMillis(); //end time for math sqrt
            
            //these times are converted from ms to ns for readability
            long avg1= ((time2-time1)*10); //average of MyMath sqrt
            long avg2= ((time3-time2)*10); // average of Math sqrt
            
            System.out.println("Average time required to take squareroot ");
            System.out.println("MyMath.sqrt: " + avg1+ " ns");
            System.out.println("Math.sqrt: " + avg2+ " ns");



}
}