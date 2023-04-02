//Number Pattern 1
  /*class Assignment1 {

  public static void main(String args[]) {
    int n = 5;
    
      for (int i = 1; i <= n; i++) {
     
      for (int j = 1; j <= i; j++) {
		  
        System.out.print(j + " ");
		
		}
	  
      System.out.println();
    }
  }
}*/

//Alphabet Pattern 2
 /*class Assignment1{
	 
  public static void main(String[] args) {

    
    int size = 5;
	
    int alpha = 65;

 
    for (int i = 0; i < size; i++) {
		
      for (int j = 0; j <= i; j++) {
		  
        System.out.print((char)(alpha+j));
		
      }
	  
      System.out.println();
    }
  }
}*/

//Star Pattern 3

/*public class Assignment1  {

  public static void main(String[] args) {

  int rows = 5;

  for (int i = 1; i <= rows; ++i){  

 for (int j = 1; j <= i; ++j){ 

    System.out.print("* "); 

 }

    System.out.println(); 

  }

 }

}*/

//Number Pattern 4
/*import java.util.Scanner;

  class Assignment1{
	  
     public static void main (String [] args){
{
     Scanner scanner = new Scanner(System.in);  
	 
    System.out.println("Enter the number of rows");
	
  int rows = scanner.nextInt();
   
   System.out.println("Printing Pattern");
           for (int i = 1; i <= rows; i++)
{
        for (int j = 1; j <= i; j++)
{
     System.out.print(i + " ");
}
    System.out.println();
}
}
}
}*/

//Alphabet Pattern 5
/*import java.util.*;
 
class Assignment1
{
	public static void main(String args[])
	{
		int i,j,n;
		
 		Scanner sc = new Scanner(System.in);
		
    		System.out.println("Enter the no of lines");
			
 		
		n=sc.nextInt();
		
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
            			System.out.print((char)(i+64));
        		}
 
        		System.out.println("");
    		}
	}
}*/

//Star Pattern 6
 /*class Assignment1 //(Code Mistake)
{ 
    public static void printStars(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}*/

//Number Pattern 7
/* class Assignment1{
	 
  public static void main(String[] args) {

    
    int size = 5;
	
    int num = 1;

    for (int i = 0; i < size; i++) {
    
      for (int j = 1; j < size - i; j++) {
		  
        System.out.print(" ");
      }
   
      for (int k = 0; k <= i; k++) {
		  
        System.out.print(num++);
      }
      num = 1;
	  
      System.out.println();
	  
     }
   }
}*/
//Number Pattern 8

/*import java.util.Scanner;

 class Assignment1
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }

            for (int k = i; k <= rows; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }

    }
}*/

//Alphabet Pattern 9
/*public class Assignment1
{
    public static void main(String[] args)
    {
        System.out.println("** Printing the pattern... **");

        for (int i = 0; i <= 5; i++)
        {
            int alphabet = 65;
            for (int j = 5; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++)
            {
                System.out.print((char) (alphabet + k) + " ");
            }
            System.out.println();
        }
    }
}*/

//Alphabet Pattern 10
 /*import java.util.*;
 
class Assignment1
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=n;i>=1;i--)
    		{
        		for(j=i;j<=n;j++)
        		{ 		
            			System.out.print((char)(j+64));
        		} 
        		System.out.println("");
    		}
	}
}*/

//Star Pattern 11
/*import java.util.Scanner;
public class Assignment1
{
public static void main(String[] args)
{
    Scanner scanner = new Scanner(System.in);

         System.out.println("Please Enter number of rows to print... ");

   int myrows = scanner.nextInt();

      System.out.println("\nThe star pattern is... ");
   for (int m = 1; m <= myrows; m++)
  {
        for (int n=myrows; n>m; n--)
     {
         System.out.print(" ");
  }
            for (int p=1; p<=(m * 2) -1; p++)
     {
      System.out.print("*");
  }
           System.out.println();
    }
  }
}*/

  //Number pattern 12;
/*class Assignment1 {

  public static void main(String args[]) {
    int n = 5;
    //Loop to iterate over each row
    for (int i = 1; i <= n; i++) {
      //Loop to iterate over each column of the ith row
      for (int j = 1; j <= i; j++) {
        System.out.print(i + " ");
      }
      System.out.println();
    }
  }*/
  //Alphabet 13
  
// import java.util.*;
 
/*class Assignment1
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines");
 		n=sc.nextInt();
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=i;j++)
        		{
            			System.out.print((char)(i+64));
        		}
 
        		System.out.println("");
    		}
	}
}*/

//Number pattern 14;


/*import java.util.Scanner;

class Assignment1
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of rows to print the pattern ");

        int rows = scanner.nextInt();
        
        System.out.println("** Printing the pattern... **");
        
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j < i; j++)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= rows - i + 1; k++)
            {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}*/

//Number pattern 15;
/*class Assignment1 {

  public static void main(String args[]) {
    int n = 5;
    //Loop to iterate over each row in reverse order
    for (int i = n; i >= 1; i--) {
      //Loop to iterate over each column of the ith row in reverse order
      for (int j = i; j >= 1; j--) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}*/

//Number pattern 16;

/*import java.util.Scanner;

    public class Assignment1 {  
	
   public static void main (String[] args){
	   
	
    Scanner scanner = new Scanner (System.in);
 
       System.out.println("Enter the number of rows");

     int rows = scanner.nextInt();

     System.out.println("Printing Pattern");

       for (int i = rows; i >= 1; i--)
	
    {
         for (int j = rows; j >= i; j--)
	
  {
        System.out.print(j + " ");

   }

System.out.println();
	}
    }
	
}*/

//Number pattern 17;
/*import java.util.Scanner;

  public class Assignment1{
	  
  public static void main(String [] args){
	  
   Scanner scanner = new Scanner(System.in);
   
   System.out.println("Enter the number of rows");
   
  int rows = scanner.nextInt();
  int k = 1;
    System.out.println("Printing Pattern");
        for (int i = 1; i <= rows; i++)
 {
            for (int j = 1; j <= i; j++)
    {
       System.out.print(k + " ");
          k++;
    }
           System.out.println();
 }
  }
}*/

//Alphabet pattern 18;
/*import java.util.*;
 
class Assignment1
{
	public static void main(String args[])
	{
		int i,j,n;
 		Scanner sc = new Scanner(System.in);
    		System.out.println("Enter the no of lines"); 
 		  n=sc.nextInt(); 
		
    		for(i=1;i<=n;i++)
    		{
        		for(j=1;j<=n-i+1;j++)
        		{
            			System.out.print((char)(j+64));
        		} 
        		System.out.println("");
    		}
	}
}*/

//-------------------------------------------------------------------------------------------
//Star Pattern 1;
/*public class Assignment1
{ 
    public static void rightTriangle(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        rightTriangle(n); 
    } 
}*/

//Star Pattern 2;
/*public class Assignment1
{ 
    public static void printStars(int n) 
    { 
        int i, j;  
        for(i=0; i<n; i++) //outer loop for number of rows(n) { for(j=2*(n-i); j>=0; j--) // inner loop for spaces 
            {           
                System.out.print(" "); // printing space
            } 
            for(j=0; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("* "); // print star
            }           
            System.out.println(); // ending line after each row
        } 
    } 
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
}*/

//Star Pattern 3;
/*public class Assignment1 {
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    for (int i = 0; i < size; i++) {
      // print stars
      for (int j = 0; j < size - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

//Star Pattern 4;
/*public class Assignment1 {
  public static void main(String[] args) {

    // size of the triangle
    int size = 5;
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int j = size; j > i; j--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

//Star Pattern 5;    
/*  public class Assignment1{
  // pyramid star pattern
  public static void main(String[] args) {

    int size = 5;
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < size - i - 1; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int k = 0; k < 2 * i + 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/
//Star Pattern 6;
/*public class Assignment1 {
  public static void main(String[] args) {
    // size of the pyramid
    int size = 5;
    for (int i = 0; i < size; i++) {
      // print spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      // print stars
      for (int k = 0; k < 2 * (size - i) - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

 //Star Pattern 7;
/*public class Assignment1{
  public static void main(String[] args) {
    int size = 5;
    
    for (int i = 1; i <= size; i++) {
     
      for (int j = size; j > i; j--) {
        System.out.print(" ");
      }
      
      for (int k = 0; k < i * 2 - 1; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
	
    for (int i = 1; i <= size - 1; i++) {
      // printing spaces
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
    
      for (int k = (size - i) * 2 - 1; k > 0; k--) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

 //Star Pattern 8;
 /*public class Assignment1 {
  public static void main(String[] args) {
   
    int size = 5;

    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    
    for (int i = 1; i <= size - 1; i++) {
      for (int j = 0; j < size - i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/


 //Star Pattern 9;
 /*public class Assignment1 {
  public static void main(String[] args) {
 
    int size = 5;

    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < size - i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
    for (int i = 1; i <= size - 1; i++) {
      for (int j = 0; j < i; j++) {
        System.out.print(" ");
      }
      for (int k = 0; k < size - i; k++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

 //Star Pattern 10;
 /*class Assignment1
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<10;j++)
			{
				if((j+i>=4 && j+i<=8))
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}*/

 //Star Pattern 11;
/*class Assignment1
 {
	 public static void main(String args[])
	 {
		for(int i=0;i<5;i++)
		{
			for (int j=0;j<10;j++)
			{
				if(j-i>=0 && j-i<=4)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}*/

 //Star Pattern 12;
 /* class Assignment1
 {
	 public static void main(String args[])
	 {
      for(int i=0;i<9;i++)
       {
         for (int j=0;j<5;j++)
          {
            if(j+i<=4 || j-i<=-4)
            System.out.print("*");
          else
            System.out.print(" ");
          }
        System.out.println();
       }
    }
}*/

 //Star Pattern 14;
 /*public class Assignment1{
	 
  public static void main(String[] args) {
	  
    int size = 5;
   
    for (int i = 0; i < size; i++) {
		
      // printing spaces
      for (int j = 0; j < i; j++) {
		  
        System.out.print(" ");
      }
      
      for (int k = 0; k < (size - i) * 2 - 1; k++) {
		  
        System.out.print("*");
      }
      System.out.println();
    }
    
    for (int i = 2; i <= size; i++) {
     
      for (int j = size; j > i; j--) {
		  
        System.out.print(" ");
      }
     
      for (int k = 0; k < i * 2 - 1; k++) {
		  
        System.out.print("*");
      }
      System.out.println();
    }
  }
}*/

 //Star Pattern 15;
 /*public class Assignment1 {
  public static void main(String[] args) {

    int size = 5;
    for (int i = 1; i <= size; i++) {
      for (int j = 0; j < i; j++) {
        
        if (i != size) {
          if (j == 0 || j == i - 1) {
            System.out.print("*");
          } else {
            System.out.print(" ");
          }
        }
       
        else {
          System.out.print("*");
        }
      }
      System.out.println();
    }
  }
}*/

 //Pyramid Number Pattern 1;

/*import java.util.Scanner;
 
public class Assignment1
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(i+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }
}*/
 
  //Pyramid Number Pattern 2; 
 /* import java.util.Scanner;
 
   class Assignment1{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }
}
*/

