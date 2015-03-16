/**
 class yang biasa pertama dibuat oleh programmer
 @author iman l hakim (milh_cbt@yahoo.com)
 
*/
import java.util.Set;
import java.util.HashSet;

public class Hello{

	/**
	ini methode yang pertama dipanggil oleh Java virtual machine JVM
	*/
	public static void main(String[] consoleIn){
	
	    Person andi = new Person (15,"Andi");
		Person yenni = new Person (14, "Yenni");
	    Person x = new Person(15, "Andi");	
		Set<Person> peserta = new HashSet<Person>();
		peserta.add(andi);
		peserta.add(yenni);
		peserta.add(x);
		System.out.println("equals : "+andi.equals(x));
		System.out.println("== : " + (andi == x) );
		System.out.println("hashcode andi:"+andi.hashCode());
		System.out.println("hashcode x:"+x.hashCode());
	}
}
class Person{
    public Person(int ID,String name){
		this.ID = ID;this.name = name;
	}
    public int ID;
	public String name;
	
	public boolean equals(Object o){
	    if ((o instanceof Person)== false) return false;
		Person other = (Person) o;
		
		if(this.ID == other.ID) return true;
		return false;
	}
	public int hashCode(){return ID;}
}

