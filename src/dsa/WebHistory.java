package dsa;

import java.util.Stack;

public class WebHistory {
	private String current_page;
	private Stack<String> bws,fws;
	
	public WebHistory() {
		this.current_page="Home Page";
		bws=new Stack<>();
		fws=new Stack<>();
	}
	
	public void visit(String page) {
		bws .push(current_page);
		current_page=page;
		fws.clear();
	}
	
	public void previous() {
		if(!bws.isEmpty())
		{
			fws.push(current_page);
			current_page=bws.pop();
		}
	}
	
	public void next() {
		if(!fws.isEmpty())
		{
			bws.push(current_page);
			current_page=fws.pop();
		}
	}
	
	public String getcurrent_page()
	{
		return current_page;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebHistory web=new WebHistory();
		web.visit("Amazon");
		web.visit("Amazon home");
		web.previous();
		web.next();
		System.out.println(web.getcurrent_page());
	}

}
