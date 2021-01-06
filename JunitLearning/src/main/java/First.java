
public class First {

	
	public String TruncateFirst2A(String s) {
		
		if(s.length()<=200) {
			return s.replaceFirst("a","");
		}
		
		return s.substring(5);
	}
	
	public boolean First2andLast2(String s) {
		
		if(s.length()<=1)
			return false;
		
		return s.substring(0, 2).equals(s.substring(s.length()-2)); 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		First f=new First();
		System.out.println(f.TruncateFirst2A("Divrit Saini"));

	}

}
