import java.util.Stack;


public class StackCal {

    
    /** 
     * @param s
     * @return int
     * @author Samantha Bhor 
     */
    public int postfixcomprob(String s) {        /// ciclo para comprobación  con casos de operaciones comunes
        Stack<Integer> stack = new Stack<Integer>();
        int x = 0, y = 0;
        char cha[] = s.toCharArray();
        for(char c: cha) {
          if(c >= '0' && c <= '9') {
            stack.push((int)(c - '0'));
          } else {
            y = stack.pop();
            x = stack.pop();
            switch(c) {
              case '+':
              stack.push(x+y);
                break;
              case '-':
              stack.push(x-y);
                break;
              case '*':
              stack.push(x*y);
                break;
              case '/':
              stack.push(x/y);
                break;
            }
          }
        }
        return stack.pop();
      }
      
    /** 
       * @param c
       * @return int
       *////preoridad de operaciones suma y resta
      public int preoridadCarac(char cat) {
        if(cat == '+' || cat == '-') {
          return 1;
        } else {
          return 2;
        } 
      }
      
      /** 
       * @param s
       * @return String
       */
      public String CalcFinal(String s) {
        Stack<Character> stack1 = new Stack<Character>();
        String postfix = "";
        char cha[] = s.toCharArray();
        
        for(char comp: cha) {
          if(comp != '+' && comp != '-' && comp != '*' && comp != '/' && comp != '(' && comp != ')') { /// en este investigué y se puede pasar a infix y postfix con operaciones que tienen paréntesis por el orden de operaciones
            postfix = postfix + comp;
          } else if (comp == '(') {
            stack1.push(comp);
          } else if (comp == ')') {
            while(!stack1.isEmpty()) {
              char t = stack1.pop();
              if(t != '(') {
                postfix = postfix + t;
              } else {
                break;
              }
            }
          } else if(comp == '+' ||comp == '-' ||comp == '*' ||comp == '/') { /// testeo con cada uno 
            if(stack1.isEmpty()) {
              stack1.push(comp);
            } else {
              while(!stack1.isEmpty()) {
                char t = stack1.pop();
                if(t == '(') {
                  stack1.push(t);
                  break;
                } else if(t == '+' || t == '-' || t == '*' || t == '/') {
                  if(preoridadCarac(t) <  preoridadCarac(comp)) {
                    stack1.push(t);
                    break;
                  } else {
                    postfix = postfix + t;
                  }
                }
              }
              stack1.push(comp);
            }
          }
        }
        while(!stack1.isEmpty()) {
          postfix = postfix + stack1.pop();
        }
        return postfix;
      }
      
      
      
      
}
    
    


    

