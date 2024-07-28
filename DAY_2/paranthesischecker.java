import java.util.*;
class paranthesischecker{
	
	public static boolean checker(String expr){
		
		//Deque is Faster than stack class
		Deque<Character> stack = new ArrayDeque<Character>();
		
		for(int i = 0 ; i <expr.length(); i++){
			char x = expr.charAt(i);
			
			if(x == '(' || x == '{' || x == '['){
				stack.push(x);
				continue;
			}
			
			if(stack.isEmpty()){
				return false;
			}
			
			char check;
			switch(x){
				case ')':
					check = stack.pop();
					if(check == '{' || check == '[')
						return false;
					break;
				
				case '}':
					check = stack.pop();
					if(check == '(' || check == '[')
						return false;
					break;
				
				case ']':
					check = stack.pop();
					if(check == '(' || check == '{')
						return false;
					break;
			}
		}
		return (stack.isEmpty());
	}
	
	public static void main(String[] args){
		String expr = "([{}])";
		
		if(checker(expr)){
			System.out.println("Balanced...");
		}else{
			System.out.println("Not Balanced...");
		}
	}
}