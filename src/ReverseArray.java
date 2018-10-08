/* ---------------- */
/* This change took place on github itselffffffffffffffffff */

/* This is one more change, which is done */
class Email 
{ 
public void sendEmail(String subject, String message)
{ 
	System.out.println("Mail sending successfull");
} 
} 


public class ReverseArray  
{ 
private Email email = new Email(); 
public void greetFriend()
{ 
	email.sendEmail("Hello", "Hello my friend "); 
} 

public static void main(String[] args) {
	new ReverseArray().greetFriend();
}
} 
