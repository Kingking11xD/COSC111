 import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner Input = new Scanner(System.in )) {
            System.out.println("Enter v0, v1 and t");
            double v0 = Input.nextDouble();
            double v1 = Input.nextDouble();
            double t = Input.nextDouble();

            double acceleration = (v1-v0)/t;
            System.out.println("The Average acceleration is"+acceleration);


            System.out.println("Enter driving distance in miles:");
            double distance = Input.nextDouble();
            System.out.println("Enter miles per gallon:");
            double milespergal = Input.nextDouble();
            System.out.println("Enter price $ per gallon:");
            double pricepergal = Input.nextDouble();

            double distancepergallon = distance/milespergal;
            double totalprice = distancepergallon*pricepergal;


            
            System.out.println("The cost of driving is $"+totalprice);

            System.out.println("Enter x1 and y1");
            double x1 = Input.nextDouble();
            double y1 = Input.nextDouble();
            System.out.println("Enter x2 and y2");
            
            double x2 = Input.nextDouble();
            double y2 = Input.nextDouble();
            

            double distancebetween2points = Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
            System.out.println(distancebetween2points);
            


            System.out.println("Three points for a triangle:");
            System.out.println("(x1,y1)");
            double point1x = Input.nextDouble();
            double point1y = Input.nextDouble();
            
            System.out.println("(x2,y2)");
            double point2x = Input.nextDouble();
            double point2y = Input.nextDouble();
            System.out.println("(x3,y3)");
            double point3x = Input.nextDouble();
            double point3y = Input.nextDouble();
            double squared1x = Math.pow((point1x-point2x ),2 ); // sqaures the points first point to second in x
            double squared1y = Math.pow((point1y-point2y ),2 ); // sqaures the points first point to second in y
            double side1 = Math.sqrt(squared1x+squared1y);        // which gives side 1
            double squard2x =Math.pow(point1x-point3x, 2);
            double squard2y =Math.pow(point1x-point3y, 2);
            double side2 = Math.sqrt(squard2x+squard2y);          // same here this measured from point 1 to point 3
            double sqaured3x =Math.pow(point2x-point3x,2 );
            double sqaured3y =Math.pow(point2y-point3y,2 );
            double side3 =Math.sqrt(sqaured3x+sqaured3y);         // measure from point 2 to point 3

            double s = (side1+side2+side3)/2; 
            double area = Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));

            System.out.println(area);
        }
        



    }
}
