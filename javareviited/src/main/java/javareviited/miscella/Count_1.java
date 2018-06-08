package javareviited.miscella;

public class Count_1 {

	public static void main(String riut[]){
		
//			System.out.println("Jyoti");
			Count_1 c_1 = new Count_1();
			c_1.reverseName("Prasanna");
		}
	 
	public void reverseName(String name){
		
		char[] c = new char[name.length()];
		char[] name_c = name.toCharArray();
		System.out.println(c);
		
//		for (int i = name.length()-1; i >=0; i--) {
//			c[i] = name_c[i];
//		}System.out.println(name_c);
		
		//System.out.println("before reversing\n" + c);
		int len = name_c.length;  //8
		for(int i=0; i<name_c.length; i++){
			c[i] = name_c[len-1];
			len--;
		}//System.out.println("after reversing\n "+c);
		for(Character c_: c)
			System.out.print(c_);
	}
}
