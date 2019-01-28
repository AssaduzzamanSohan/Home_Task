package Sohan.H_W_Test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int sum1=0,sum=0;
        int i,j;
        
        for(i=1; i<=12; i++) {
        	sum1+=i;
        	sum+=sum1;
        }
        System.out.println(sum);
    }
}
