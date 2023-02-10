import java.util.Scanner;
import java.util.LinkedList;

public class PostFixEvaluator {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		LinkedList<Integer> stack = new LinkedList<>(); 
		
		String s = in.next();
		while(!s.equals("=")) {
			if(isOperator(s)) {
				if(stack.isEmpty()) {
					System.out.println("ERROR: expected value, got " + s);
					System.exit(-1);
				}
				int arg1 = stack.pop();
				if(stack.isEmpty()) {
					System.out.println("ERROR: expected value, got " + s);
					System.exit(-1);
				}
				int arg2 = stack.pop();
			if(s.equals("+")) {
//				int arg1 = stack.pop();
//				int arg2 = stack.pop();
				stack.push(arg2 + arg1);
			}
			else if(s.equals("-")) {
//				int arg1 = stack.pop();
//				int arg2 = stack.pop();
				stack.push(arg2 - arg1);
			}
			else if(s.equals("*")) {
//				int arg1 = stack.pop();
//				int arg2 = stack.pop();
				stack.push(arg2 * arg1);
			}
			else if(s.equals("/")) {
//				int arg1 = stack.pop();
//				int arg2 = stack.pop();
				stack.push(arg2 / arg1);
			}
			else if(s.equals("%")) {
//				int arg1 = stack.pop();
//				int arg2 = stack.pop();
				stack.push(arg2 % arg1);
			}
			else {
				int val = Integer.parseInt(s);
				stack.push(val);
			}
//			System.out.println(stack);
			s = in.next();
		}
		if(stack.size() > 1) {
			System.out.println("ERROR: Too few operands");
			System.exit(-1);
		}
		System.out.println(stack.pop());
		}
	}
	
	public static boolean isOperator(String s) {
		String ops = "+-*/%";
		return ops.contains(s);
	}
}
