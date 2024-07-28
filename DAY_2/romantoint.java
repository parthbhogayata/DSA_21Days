class romantoint{
	
	public static int value(char r){
		if(r == 'I')
			return 1;
		else if(r == 'V')
			return 5;
		else if(r == 'X')
			return 10;
		else if(r == 'L')
			return 50;
		else if(r == 'C')
			return 100;
		else if(r == 'D')
			return 500;
		else if(r == 'M')
			return 1000;
		return -1;
	}
	
	public static int romantodecimal(String str){
		int res = 0;
		
		for(int i = 0 ; i < str.length() ; i++){
			int s1 = value(str.charAt(i));
			if(i+1 < str.length()){
				int s2 = value(str.charAt(i+1));
				if(s1 >= s2){
					res += s1;
				}
				else{
					res += (s2-s1);
					i++;
				}
			}
			else{
				res += s1;
			}
		}
		return res;
	}
	
	public static void main(String[] args){
		String str = "MCMIV";
		System.out.println(romantodecimal(str));
	}
}