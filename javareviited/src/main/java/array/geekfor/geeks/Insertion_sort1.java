package array.geekfor.geeks;

public class Insertion_sort1 {

	public static void insert1(int[] ei){
		
		int len=ei.length;
		for (int i = 1; i < len; i++) {
			int key=ei[i];
			int j=i-1;
				while(j>=0 && ei[j]>key){
					ei[j+1]=ei[j];
					j=j-1;
			}
				ei[j+1]=key;
		}
	}
}
