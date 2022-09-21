package bridgelabz;

public class Compare {
	 static void equal(double a1, double b1, double a2, double b2, double p1, double q1, double p2, double q2)
	    {
	        if (a1*b2 == a2*b1 &&  (p1*q2 == p2*q1))
	        {
	            System.out.println("Yes Lines are Equal");
	        }

	        else
	        {
	            System.out.println("No Equal Lines");
	        }
	    }
	    public static void main(String args[]) {
	        {
	            double a1 = 2, b1 = 4;
	            double a2 = 6, b2 = 12;
	            double p1 = 3, q1 = 7;
	            double p2 = 5, q2 = 13;

	            double length1 = Math.sqrt( ( ( a2 - a1 ) * (  a2 - a1 ) ) + ( b2 - b1 ) * ( b2 - b1 ) ) ;
	            System.out.println("Length of Line 1 is : " + length1);

	            double length2 = Math.sqrt( ( ( p2 - p1 ) * (  p2 - p1 ) ) + ( q2 - q1 ) * ( q2 - q1 ) ) ;
	            System.out.println("Length of Line 2 is : " + length2);

	            System.out.println(length1 == (length2));
	            equal(a1,a2,b1,b2,p1,p2,q1,q2);
	        }

	}

}
