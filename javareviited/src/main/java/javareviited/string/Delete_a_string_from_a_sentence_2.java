package javareviited.string;

public class Delete_a_string_from_a_sentence_2 {

	public static void delete_a_String(String sentence, String str){
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			int i1 = sentence.indexOf(c);	
			
			
			System.out.println(c +" : " +i1 );
			}if(sentence.contains(str)){
				System.out.println("int ie");
				sb.append(sentence.replaceAll(str, " ")).toString();
			}
		System.out.println(sb);
	}
	public static void main(String sdis[]){
		
		delete_a_String("Jyoti loves Luckie", "loves");
	}
}
