package dsa.stack;

import java.util.Stack;

public class webhistory {
	Stack<String> bws,fws;
	String curr;
	
	public webhistory()
	{
		bws=new Stack<>();
		fws=new Stack<>();
		curr="Home Page";
	}
	
	public String getpage()
	{
		return curr;
	}
	
	public void visit(String page)
	{
		bws.push(curr);
		curr=page;
	}
	
	public void prev()
	{
		if(!bws.isEmpty())
		{
			fws.push(curr);
			curr=bws.pop();
		}
	}
	
	public void next()
	{
		if(!fws.isEmpty())
		{
			bws.push(curr);
			curr=fws.pop();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	webhistory w=new webhistory();
	System.out.println(w.getpage());
	w.visit("Amazon");
	w.visit("amazon home");
	w.visit("fashions");
	w.prev();
	w.prev();
	w.next();
	System.out.println(w.getpage());
	}

}
