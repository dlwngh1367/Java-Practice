
/**
*It was sorted using the printf method.
*The sum of each column was calculated using nested for statement.

 * 
 * @author Juho Lee
 * @version 11.0.15
 * @since 1.8.0_342
 */


public class Main
{
public static void main(String[] args)
 {
   final int ROWS = 7;
   final int COLUMNS = 8;

   int[][] patients = 
      { 
         {  2200, 1100, 1200, 1000, 1015, 2000, 1092, 2204 },
         {  5020, 6105, 2009, 9047, 1016, 2014, 2708, 2308 }, 
         {  1720, 2406, 3054, 1018, 1023, 3100, 1406, 1502 }, 
         {  1490, 2002, 2016, 5008, 2044, 1055, 1607, 2201 },
         {  1520, 1007, 1092, 2065, 1023, 1010, 1046, 1502 },
         {  1670, 1201, 2008, 2001, 1086, 1009, 1041, 1706 },
	     {  1870, 2001, 2078, 1006, 1053, 1702, 1009, 1406 }
         
      };

   String[] provinces = 
	      { 
	         "Ontario", 
	         "Quebec", 
	         "Nova Scotia",
	         "New Brunswick", 
	         "Manitoba", 
	         "British Columbia",
		     "Prince Edward Island"         
	      };
	   
	   System.out.printf("%-25s %-5s %-7s %-7s %-7s %-7s %-7s %-7s %-7s ",
	"Month","Feb","March",   "April",     "May",    "June",    "July",    "Aug",     "Sept");
	   
	   System.out.println();
	   System.out.println();
	   
	   for(int i=0;i<ROWS;i++) {
	    	System.out.printf("%-25s", provinces[i]);
	    	for(int j=0;j<COLUMNS;j++) {
	    		System.out.printf(patients[i][j]+"\t");    		
	    	}
	    	System.out.println(" ");
	   }



		
   System.out.println();
   System.out.printf("%-25s","Recovered Patients");
   int sum = 0;
   for(int i=0;i<COLUMNS;i++) {
	   for(int j=0;j<ROWS;j++) {
		   sum += patients[j][i];
	   } 
	   System.out.printf("%-8s", sum);
	   sum = 0;}

   
   System.out.println(); 
   System.out.println(); 
   System.out.println("               Vaccinate and maintain good health practices!" );
}
   }

