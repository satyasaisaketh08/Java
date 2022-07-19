package stack;
import java.util.*;
public class balanced_parantheses {
	  public static void main(String[] args) {
	    String s = "{}";
	    if(solve(s)){
	        System.out.println("Yes`");
	    }else{
	        System.out.println("No");
	    }
	  }

	  public static boolean solve(String s) {
	    Stack < Character > S = new Stack < Character > ();
	    for (int i = 0; i < s.length(); i++) {
	      char ch = s.charAt(i);
	      if(ch == '(' || ch == '{' || ch == '['){
	          S.push(ch);
	          continue;
	      }
	      

	      if (S.isEmpty()) {
	        return false;
	      }
	      
	      char check;
	      switch(ch){
	          case ')':
	              check = S.pop();
	              if(check == '{' || check == '['){
	                  return false;
	              }
	              break;
	          case '}':
	              check = S.pop();
	              if(check == '(' || check == '['){
	                  return false;
	              }
	                 break;
	          case ']':
	              check = S.pop();
	              if(check == '(' || check == '{'){
	                  return false;
	              }
	               break;
	      }

	  }
	  return (S.isEmpty());
	  }

	}
