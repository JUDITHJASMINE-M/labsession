 class typecasting {
    public static void main(String[] args){
        
		int a = 7;  // Widening casting
		long b = a;
		double c = b;
		double d = 15.17d; //Narrowing casting
        int i = (int)d;

	  
	System.out.println("Before conversion,the value is"+ " "+ a);
	System.out.println("After conversion,the value is"+ " "+ b);
	System.out.println("After conversion,the value is"+ " "+ c);
	
	System.out.println("Before conversion,the value is"+ " "+ d);	
	System.out.println("After conversion,the value is"+ " "+ i);
		
		}	
}