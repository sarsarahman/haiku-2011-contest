import java.io.DataInputStream;
import java.io.IOException;

public class q9 {
  private static final String String = null;

private Stack theStack;

  private String input;

  private String output = "";

  public q9(String in) {
    input = in;
    int stackSize = input.length();
    theStack = new Stack(stackSize);
  }

  public String doTrans() {
    for (int j = 0; j < input.length(); j++) {
      char ch = input.charAt(j);
      switch (ch) {
      case '+': 
      case '-':
        gotOper(ch, 1); 
        break; 
      case '*': 
      case '/':
        gotOper(ch, 2); 
        break;
      case '^':
          gotOper(ch, 3);
          break;
      case '(':
        theStack.push(ch);
        break;
      case ')':
        gotParen(ch);
        break;
      default: 
        output = output + ch;
        break;
      }
    }
    while (!theStack.isEmpty()) {
      output = output + theStack.pop();
    }
    return output;
  }
  public void gotOper(char opThis, int prec1) {
    while (!theStack.isEmpty()) {
      char opTop = theStack.pop();
      if (opTop == '(') {
        theStack.push(opTop);
        break;
      }
      else {
        int prec2;
        if (opTop == '+' || opTop == '-')
          prec2 = 1;
        else if(opTop == '*' || opTop == '/')
            prec2 = 2;
          else 
              prec2 = 3;
        if (prec2 < prec1) 
        { 
          theStack.push(opTop);
          break;
        } else
            output = output + opTop; 
      }
    }
    theStack.push(opThis);
  }
  public void gotParen(char ch){ 
    while (!theStack.isEmpty()) {
      char chx = theStack.pop();
      if (chx == '(') 
        break; 
      else
        output = output + chx; 
    }
  }
  @SuppressWarnings("deprecation")
public static void main(String[] args) throws IOException 
{
	  int t,i;
	  DataInputStream in=new DataInputStream(System.in);
	  String input;
	  t=Integer.parseInt(in.readLine());
	  String[] output=new String[101];
    if(t<101){
    	for(i=0;i<t;i++)
    	{
    	input = in.readLine();
    	q9 theTrans = new q9(input);
        output[i] = theTrans.doTrans(); 
    	}
    	for(i=0;i<t;i++){
    		System.out.println(output[i]);
    	}
    }
    }
  class Stack {
      private int maxSize;
    
      private char[] stackArray;
    
      private int top;
    
      public Stack(int max) {
        maxSize = max;
        stackArray = new char[maxSize];
        top = -1;
      }
       public void push(char j) {
        stackArray[++top] = j;
      }
    
      public char pop() {
        return stackArray[top--];
      }
         public char peek() {
        return stackArray[top];
      }
         public boolean isEmpty() {
        return (top == -1);
      }
    } 

}