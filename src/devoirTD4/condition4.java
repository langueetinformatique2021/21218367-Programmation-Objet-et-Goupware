package devoirTD4;
import java.util.Arrays;
public class condition4 {
	
	    public static void main(String[] args) {
	        int p1=10,p2=9,p3=-1,p4=4,p5=8;
	        int[] arr = new int[]{p1,p2,p3,p4,p5};
	        //ordre
	        Arrays.sort(arr);
//	        for (int i=0;i<arr.length;i++){
//	            System.out.println(arr[i]);
//	        }
	        int len = arr.length;
	        int p6;
	        if (len%2==0){
	            p6 = (arr[len/2]+arr[len/2-1])/2;
	        } else {
	            p6 = arr[len/2];
	        }
	        System.out.println(p6);
	    }
	}