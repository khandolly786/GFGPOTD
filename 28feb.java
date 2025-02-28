
class Solution 
{
    public int evaluate(String[] arr) 
    {
        Stack<String>st=new Stack<>();
        for(String i:arr)
        {
            if(!(i.equals("+")||i.equals("*")||(i.equals("-") && i.length()==1)||i.equals("/")))
            {
                st.push(i);
            }
            else
            {
                int val2=Integer.parseInt(st.pop());
                int val1=Integer.parseInt(st.pop());
                if(i.equals("+"))
                st.push(Integer.toString(val1+val2));
                else if(i.equals("-"))
                st.push(Integer.toString(val1-val2));
                else if(i.equals("*"))
                st.push(Integer.toString(val1*val2));
                else
                st.push(Integer.toString(val1/val2));
            }
        }
        return Integer.parseInt(st.peek());
    }
}
