package array.geekfor.geeks;

public class Selection_sort1 {

	public static void seleSort(int[] sort){
		
		int k=0,temp;
		int len=sort.length;
		for (int i = 0; i < sort.length; i++) {
			k=i;
			for (int j = i+1; j < sort.length; j++) 
				if(sort[k]>sort[j])
					k=j;
			temp=sort[i];
			sort[i]=sort[k];
			sort[k]=temp;
		}
		for(int i=0;i<len;i++)
			System.out.println(sort[i]);
	}
	public static void main(String irtu[]){
		int[] s={3,24,2,25,24,22,4,324,22,1};
		seleSort(s);
	}
}
