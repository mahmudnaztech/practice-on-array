package mmfq.mmfq;

public class maxMinFq {
	public  int[] mmfq() {
		int minf=1000;
		int maxf=0;
		int minfval=-1;
		int maxfval=-1;
		int tempx=0;
		int arr[]= {1,5,4,9,3,2,4,5,1,6,3,5,4,1,5,8,3,5,4,6,9,7,4,5};
		int[] array=new int[4];
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					tempx++;
				}
				
			}
			if(tempx>maxf) {
				maxf=tempx;
				maxfval=arr[i];
			}
			if(tempx<minf) {
				minf=tempx;
				minfval=arr[i];
			}
			tempx=0;
		}
		System.out.println("max frequency:"+ maxf +" value:"+maxfval);
		System.out.println("min frequency:"+ minf+" value:"+minfval);
		array[0]=maxfval;
		array[1]=maxf;
		array[2]=minfval;
		array[3]=minf;
		return array;
	}
}
