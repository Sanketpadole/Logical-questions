package programs;

public class Prime_number {

//	public static void main(String[] args) {
//		
//	
//	int n=29;
//	boolean flag=false;
//	for(int i=0;i<n;i++) {
//		if(i%2==0);
//		flag=true;
//		break;
//		
//		
//		if(!flag)
//		System.out.println("not prime"+n);
//		else
//		System.out.println("prime"+n);
//			
//		}
//	}
//}

//	public static void main(String[] args) {
//		
//	int i=1;
//	int n=50,firstNum=0,secNo=1,nextNum;
//	System.out.println("fibonacci"+n);
//
//	while(i<n) {
//		System.out.print(firstNum+",");
//		
//	
//		nextNum=firstNum+secNo;
//		firstNum=secNo;
//		secNo=nextNum;
//		i++;
//		
//	}

//	public static void main(String[] args) {
//		int n=10;
//		int factorial=1;
//		for(int i=1;i<n;i++) {
//			
//			factorial=factorial*i;
//			
//			
//	}
//		System.out.print(+factorial);
//	
//	
//	}

//	public static void main(String[] args) {
//
//		//boolean flag = false;
//		int n = 25;
//		for (int i = 1; i < n; i++) {
//			if (n % 2 == 0) {
//				System.out.println("not prime");
//				break;
//			} else {
//				System.out.println("prime");
//				break;
//
//			}
//
//		}
//	}
//}

//	}

//	public static void main(String[] args) {
//		int i=1,n=10,firstTerm=0,secondTerm=1;
//		System.out.println("fibonacii series" + n );
//		
//		
//		while(i <= n) {
//			System.out.print(firstTerm+",");
//			
//			
//			int nextTerm=firstTerm+secondTerm;
//			
//			firstTerm=secondTerm;
//			secondTerm=nextTerm;
//			
//			i++;
//			
//		}
//	}
//}

//	 public static void main(String[] args) {
//
//		  int num = 20, count;
//
//		  for (int i = 1; i <= num; i++) {
//		   count = 0;
//		   for (int j = 2; j <= i / 2; j++) {
//		    if (i % j == 0) {
//		     count++;
//		     break;
//		    }
//		   }
//
//		   if (count == 0) {
//		    System.out.println(i);
//		   }
//
//		  }
//		 }
//}
	
	
	
	
	
//	public static void main(String[] args) {
//		
//		
//		int n=25;
//		boolean flag=false;
//		for(int i=0;i<n;i++) {
//			if(i%2==0);
//			flag=true;
//			break;
//		}
//			
//			if(!flag)
//			System.out.println("not prime"+n);
//			else
//			System.out.println("prime"+n);
//				
//			}
//		}
	
	
	

//	  public static void main(String[] args) {
//
//	    int num = 23;
//	    boolean flag = false;
//	    for (int i = 2; i <= num / 2; ++i) {
//	      // condition for nonprime number
//	      if (num % i == 0) {
//	        flag = true;
//	        break;
//	      }
//	    }
//
//	    if (!flag)
//	      System.out.println(num + " is a prime number.");
//	    else
//	      System.out.println(num + " is not a prime number.");
//	  }
//	}
	public static void main(String[] args) {
		int num=23;
		boolean flag=false;
		for(int i=2;i<=num/2;i++) {
			if(num%i == 0) {
				flag=true;
				break;
				
			}
		}
		if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
			
		
		
	}


