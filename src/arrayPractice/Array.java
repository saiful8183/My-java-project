package arrayPractice;

public class Array {

	public static void main(String[] args) {
//
//int[]myArray=new int[4];{
//	
//	myArray[0]=56;
//	myArray[1]=57;
//	myArray[2]=58;
//	myArray[3]=569;
//
//	
//	System.out.println(myArray[0]);
//	System.out.println(myArray[1]);
//	System.out.println(myArray[2]);
//	System.out.println(myArray[3]);
//	//System.out.println(myArray[4]);
//
//	
//	
//	int size=myArray.length;
//	System.out.println("The length of the size is:"+size);
//	System.out.println(myArray.length);
//	
//}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	int a[]=new int[3];  //Declaration and instantiation
		
		a[0]=10;   //Initialization
		a[1]=50;
		a[2]=30;
//		
//System.out.println(a[0]);
//System.out.println(a[1]);
//System.out.println(a[2]);
//		int size=a.length;
//	System.out.println("The length of array is:"+size);	
//		
//	System.out.println(a.length);	
//		
		
	for(int i=0;i<a.length;i++)//length is the property of array  
		System.out.println(a[i]); 
		
		
		
		
	/*
	 * int age=160; int age2=90;
	 * 
	 * if(age>age2) { System.out.println("I am happy");
	 */


	
/*
 * int age5=160; int age6=90;
 * 
 * if(age5<age6) { System.out.println("I am happy");
 * 
 * }else {
 * 
 * System.out.println("I am not happy");
 * 
 * }
 */
	
	int age55=160;
	int age65=90;
	
	if(age55<age65) {
	System.out.println("I am not happy");	
	
	}else if(age55!=age65){
		
		System.out.println("I am  happy");
	}else {
		System.out.println("Nothing");
	}
	
}
}