package teste;

interface First{
	
	public int soma(int n);
	
}

class Second implements First , Forth {
	
	Second(String teste){
		System.out.println(teste);
	}

	@Override
	public int soma(int n) {
		
		return n+2;
		
	}

	@Override
	public int multiplicacao(int n) {
		
		return n*4;
	}

}


public class Third {
	
	
public static void main(String args[]) {
		
		Second t=new Second("Ana");
		
		System.out.println(t.soma(2));
		
		System.out.println(t.multiplicacao(2));
	}

}
 

interface Forth {
	
	public int multiplicacao(int n);
	
}




