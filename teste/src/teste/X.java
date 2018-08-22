package teste;

public class X {
	
	int j=-100;	
	
	X(int i){
		if(i>j) 
		return;
		
		j=i;	
		
		
	}
	
	public static void main(String[] args) {
		
	  System.out.println(new X(4).j);

	}

}
