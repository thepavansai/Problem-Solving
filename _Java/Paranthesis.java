 static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> s= new Stack<Character>();
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='{'|| x.charAt(i)=='('|| x.charAt(i)=='['){
                s.push(x.charAt(i));
            }
            else if(s.empty()){
                return false;
            }
            else{
                if(x.charAt(i)==')'){
                    if(s.pop()!='('){
                        return false;
                    }
                    else if(x.charAt(i)=='}'){
                        if(s.pop()!='{'){
                            return false;
                        }
                    }
                    else if(x.charAt(i)==']'){
                        if(s.pop()!='['){
                            return false;
                        }
                    }
                }
            }
        }
        if(s.empty()){
            return true;
        }
        return false;
    }