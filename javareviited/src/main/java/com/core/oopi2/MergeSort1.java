package com.core.oopi2;

public class MergeSort1 {

	public static void mergeSort(int[] rr,int l,int m,int r){
		
		//find the sizes of two sub arrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		
		//create two temp arrays 
		int L[]=new int[n1];
		int R[]=new int[n2];
		//copy the data  to temp arrays
		for(int i=0;i<n1;++i){
			L[i]=rr[l+i];
		}
		for(int j=0;j<n2; ++j)
			R[j]=rr[m+1+j];
		//initial indexes of first and second arrays 
		  int i=0,j=0;
		  
		  //initial index of merged sub arrays 
		  int k=l;
		  while(i < n1  &&  j < n2){
			  if(L[i]<=R[j]){
				  rr[k]=L[i];
				  i++;
			  }else{
				  rr[k]=R[j];
			  }
			  k++;
		  }
		  
		//copy the remaining elements of L[] if any 
		  
		  while(i<n1){
			  rr[k]=L[i];
			  i++;
			  k++;
		  }
		  //copy the remaining elements of R[] if any 
		 
		  while(j<n2){
			  rr[k]=R[j];
			  j++;
			  k++;
		  }
	}
	//main functions that sorts
	static void sort(int[] arr,int l,int r){
		
		if(l<r){
			//find the middle point
			int m=(l+r)/2;
			
			//sort first and second
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			//merge the sorted array 
			mergeSort(arr,l,m,r);
		}
	}
	//a utility function to print array 
	static void printArray(int [] arr){
		int n =arr.length;
		for(int i=0;i<n;++i){
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String ad[]){
		int[] arr={9,8,7,6,5,4,3,2,1};
		printArray(arr);
		sort(arr, 0, arr.length-1);
		printArray(arr);
	}
}
