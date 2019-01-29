package mmfq.mmfq;

public class max {
	public int maxval() {
		int arr[]= {8,5,4,9,8,21,6,4,16,32,5};
		int val=0;
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				temp=arr[i]*arr[j];
				if(temp>val && i!=j) {
					val=temp;
				}
			}
		}
		return val;
	}
}
