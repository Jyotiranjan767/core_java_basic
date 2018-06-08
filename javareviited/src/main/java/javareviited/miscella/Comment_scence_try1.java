package javareviited.miscella;

public class Comment_scence_try1 {

	int m_x,m_y;
	public Comment_scence_try1(){}//default constructor has to be called impicitly if you call it without 
	                                                    //declaration
	public Comment_scence_try1(int x,int y){
		m_x=x;
		m_y=y;
	}
	public static void main(String ida[]){
//		try{
//			throw 1000;
//		}catch(int e){
//			System.out.println("this is a exception "+e);
//		}
		Comment_scence_try1 cst=new Comment_scence_try1();
	}
}
