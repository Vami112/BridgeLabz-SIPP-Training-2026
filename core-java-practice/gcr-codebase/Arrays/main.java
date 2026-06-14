import java.util.*;
class main{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		//ArrayList<Object> a1=new ArrayList<>();
		//a1.add(4);
		//a1.add(11.2);
		//a1.add(111.222);
		//a1.add("vamika");
		//System.out.println(a1);
		
		
		//ques:frequency
		//int n=12334577;
		//String s= Integer.toString(n);
		//int a[]= new int [10]; 
		//for(int i=0;i<s.length();i++){
			//a[s.charAt(i)-'0']++;
		//} 
		//for(int i=0;i<a.length;i++){
			//if(a[i]>0){
				//System.out.print(a[i]+" ");
			//}
		//}
		
		
		
		//two sum
		//int[] arr = {1, 6, 9, 7, 4, 3, 5, 2, 8};
		//Arrays.sort(arr);
		//int target = 9;
		//int left = 0;
        //int right = arr.length - 2;
		//while (left < right) {
            //if (arr[left] + arr[right] == target) {
                //System.out.println(arr[left] + " + " + arr[right] + " = " + target);
                //left++;
                //right--;
            //} 
			//else if (arr[left] + arr[right] < target) {
                //left++;
            //} 
			//else {
                //right--;
            //}
        //}
		
		
	
		//Merge two unsorted arrays and find the mid element after sorting, you can use any technique bubble,slection,insertion
		int[] arr1= {1,3,2,4};
		int[]arr2 = {9,5,7,1,3};
		int[]merged =new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++){
			merged[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			merged[arr1.length+i]=arr2[i];
		}
		Arrays.sort(merged);   // ye array.sort na lagake koi aur lagana hai
		System.out.println(merged[merged.length/2]);
		//for(int i=0;i<merged.length;i++){
			//System.out.print(merged[i]+" ");
		//}
		
		
		
		
		
	
	
	}
}