package teste;

import javax.swing.JOptionPane;

/**
 * 
 * @author ingrid.marion.mazoni
 *
 */
public class  Person {
	
	String firstName="Ricardo";
	String lastName= "Pereira";
	
	Person(String firstName, String lastName){
		
		firstName=firstName;
		lastName=lastName;
		
		JOptionPane.showMessageDialog(null, 
		firstName +" " + lastName +"\n"+
		this.firstName+" "+this.lastName	
		);
		
	}
	
	public static void main(String args[]) {
		
		Person p=new Person("Sandra ", "Silva");
		
	}

}
