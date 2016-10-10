
public class Letter {
	private String author;
	private String reciever;
	
public Letter(String sender, String recipient)
{
	author=sender;
	reciever=recipient;
}
public void addLine(String line)
{
	System.out.println(line);
}
public void getText()
{
	System.out.println("Dear "+reciever+":"+"\n");
	addLine("I'm sorry for killing your cat. "+ "\n");
	addLine("That was a dick move. "+ "\n");
	System.out.println("Sincerley, " + "\n" + author);
	
}



}
