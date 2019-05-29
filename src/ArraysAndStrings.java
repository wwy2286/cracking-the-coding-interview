import java.util.Arrays;

public class ArraysAndStrings {
	
	
	public boolean isUnique(String s) {
		boolean unique = true;
		int[] arr = new int[255];
		//System.out.println(s.length());
		for (int i = 0; i < s.length(); i++) {
			int charInt = s.charAt(i);
			//System.out.println(charInt);
			if (arr[charInt] != 1) {
				arr[charInt] = 1;
			} else {
				unique = false;
				break;
			}
		}
		return unique;
	}
	
	public boolean isPermutation(String s1, String s2){
		if (s1.length() != s2.length()){
			return false;
		}
		
		int[] arr1 = new int[255];
		int[] arr2 = new int[255];
		
		for (int i = 0; i<s1.length(); i++){
			int index = s1.charAt(i);
			arr1[index] = arr1[index]++;
			index = s2.charAt(i);
			arr2[index] = arr2[index]++;
			
			
		}
		
		System.out.println(Arrays.equals(arr1, arr2));
	
		
		return (Arrays.equals(arr1, arr2));
	}
	
	public String urlify(String s, int n){
		char[] output = new char[n];
		int j = 0;
		for (int i = 0; i<n; i++){
			if (s.charAt(j) == ' '){
				output[i]='%';
				output[i++]=2;
				output[i++]=0;
				int temp = j;
				for (j=temp; j<s.length(); j++){
					if (s.charAt(j) != ' '){
						break;
					}
				}
				j--;
			} else {
				output[i] = s.charAt(j);
			}	
			
			j++;
		}
		return output.toString();
	}
}
