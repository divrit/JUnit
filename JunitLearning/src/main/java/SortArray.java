import java.util.Arrays;

public class SortArray {

  int[] sort() {
	int a[]= {12,3,4,3,5};
	for(int i=0;i<a.length;i++) {
		int temp=0;
		for(int j=i+1;j<a.length;j++) {
			
			if(a[i]>a[j]) {
				temp=a[j];
				a[j]=a[i];
				a[i]=temp;
			}
			
		}
		
		
	}
	System.out.println(Arrays.toString(a));
	return (a);
	
  }
  
  public void test2() {
	  int a[]= {1,2,3,4,5};
	  
	  for(int i=0;i<1000000;i++) {
		  a[0]=i;
		  Arrays.sort(a);
		  
	  }
	  
  }
	
	public static void main(String args[]) {
		
		SortArray s=new SortArray();
		s.sort();
		
		
	}

}