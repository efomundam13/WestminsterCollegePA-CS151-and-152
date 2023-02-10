
public class DivideByZeroException extends Exception {

	public DivideByZeroException()
	{
		super("Divide by Zero");
	}
	
	public DivideByZeroException(String mesg)
	{
		super(mesg);
	}
}
