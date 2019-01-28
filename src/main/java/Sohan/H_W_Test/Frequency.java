package Sohan.H_W_Test;

public class Frequency {
	public static void main(String args[]) {
		int[] intArray = new int[]{ 1,2,3,4,4,6,1,8,2,1 }; 
		int[] intArray2;
		intArray2 = new int[10];
		int i,j,mul,max=0;
		
		for(i=0; i<10; i++) {
			intArray2[intArray[i]]++;
		}
		for(i=0; i<10; i++) {
			if(intArray2[i]>0) {
				System.out.println("Frequency of Number "+i+" is "+intArray2[i]);
			}
		}
	}
}
