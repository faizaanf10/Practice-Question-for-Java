public class MaxFrequency
{
	public static void main(String[] args) {
		int[] arr = {1,30,2,2,5,30,5,2};
		freqElement(arr);
	}
	
	static void freqElement(int[] arr){
	    int element = 0;
	    int count = 0;
	    for (int i = 0;i < arr.length ;i++ ){
	        int tempElement = arr[i];
	        int tempCount = 0;
	        for (int p = 0;p < arr.length ;p++ ){
	            if (arr[p] == tempElement){
	                tempCount++;
	            } 
	        } 
	        if(tempCount > count){
	            element = tempElement;
	            count = tempCount;
	        }
	    } 
	    System.out.println("The most frequent element is : " + element);
	}
}
