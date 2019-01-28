package Sohan.H_W_Test;

public class FindMaxMul {
	public static void main(String args[]) {
		int[] intArray = new int[]{ 2,10,3,5,7,8,4,6,1,9}; 
		
		int i,j,mul=0,max=0;
		
		for(i=0; i<10; i++) {
			for(j=0; j<10; j++) {
				if(i!=j) {
					mul=intArray[i]*intArray[j];
					if(mul>max) max=mul;
				}
			}
		}
		System.out.println(max);
	}

}
