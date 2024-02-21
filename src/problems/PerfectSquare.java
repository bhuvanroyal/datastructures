package problems;

public class PerfectSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=13;
		        int count=0;
		        int i=2;
		        int pow=(int)(Math.pow(i,2));
		        while(n>0 && pow<=n){
		            pow=(int)(Math.pow(i,2));
		            if(n%pow==0){
		                n=n-pow;
		                count+=1;
		            }
		            else if(n>pow){
		                i+=1;
		            }
		        }
		        if(n==0){
		            System.out.println(count);
		        }
		        else{
		            System.out.println(0);
		        }
	}

}
