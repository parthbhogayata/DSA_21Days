class longestprefix{
	public static void main(String[] args){
		String[] arr = {"Flower" , "Flow" , "Flyer"};
		int n = arr.length;
		String res = arr[0]; // geeksforgeeks
		
		for(int i = 1 ; i < n ; i++){
			
			while(arr[i].indexOf(res) != 0){
				res = res.substring(0,res.length()-1);
				
				if(res.isEmpty()){
					System.out.println("-1");
				}
			}
		}
		System.out.println(res);
	}
}