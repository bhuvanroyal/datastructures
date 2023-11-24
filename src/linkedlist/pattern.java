package linkedlist;

public class pattern {

	public static void main(String[] args) {
		
		int n = 5;
		int num = 2;

		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("    ");
            }

            for (int j = i; j < n; j++) {
            	
            	if (j == n - 2 && i==1) {
                    System.out.print("    ");
                  
                    continue;
                }
            	
                System.out.print("   " +num); 
                num++;
                
                
            }

            System.out.println(); 
        }
		
	

	}

}
