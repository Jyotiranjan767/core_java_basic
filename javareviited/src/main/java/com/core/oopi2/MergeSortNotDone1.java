package com.core.oopi2;

public class MergeSortNotDone1 {

	public static void mergeMe(int rr[],int[] L,int[] R){
		
		int l=0;
		int r=rr.length-1;
		int mid=(r-l)/2;
		int n1=(mid-l)+1;
		int n2=(r-mid);
		
		/*create two temp arrays */
			 L=new int[n1];
			 R=new int[n2];
			
			//copy data to temp arrays
				for(int i=0;i<L.length;i++){
					L[i]=rr[l+i];
				}
				for (int i = 0; i < R.length; i++) {
					R[i]=rr[mid+1+i];
				}
				
				//merge the temp arrays
					//initial indexes of the first and second subarrays 
						int i=0,j=0;
					//initial indexed of merge subarrays 
						int k=l;
						
						while(i<n1 && j<n2){
							if(L[i]>R[j]){
								rr[k]=R[j];
								j++;
							}
							else{
								rr[k]=L[i];
								i++;
							}
							k++;
						}
						
						//copy the remaining elements if any
						while(i<n1){
							rr[k]=L[i];
							i++;k++;
						}
						while(j<n2){
							rr[k]=R[j];
							j++;k++;
						}
				}
	
	public static void mergeSort(int[] rt){
			int n=rt.length;
			if(n<2)
				return;
			int mid=n/2;
			//int d=mid;//
			int[] left=new int[mid+1];
			int[] right=new int[n-mid-1];
			for(int i=0;i<left.length-1;i++){
				left[i]=rt[i];
			}
			for(int j=mid;j<n-1;j++){
				right[j-mid]=rt[j];
				mid++;
			}
			//mergeSort(left);
			mergeSort(right);
			mergeMe(rt,left,right);
	}
	
	public static void printMe(int[] ra){
		for(int i : ra){
			System.out.print(i);
		}
	}
	
	public static void main(String ir[]){
			
		int rr[]={9,8,7,6,5,4,3,2,1};
		mergeSort(rr);
		printMe(rr);
	}
}
