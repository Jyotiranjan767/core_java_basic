package javareviited.miscella;

public class Comment_scence1 {

	int m_x,m_y;
	public Comment_scence1(int x,int y){
		m_x=x;
		m_y=y;
	}
	public Comment_scence1(){
		this(10,10);
	}
	public int get_x(){
		return m_x;
	}
	
	public static void main(String ieru[]){
		Comment_scence1 cs1=new Comment_scence1();
		System.out.println(cs1.get_x());
	}
}
