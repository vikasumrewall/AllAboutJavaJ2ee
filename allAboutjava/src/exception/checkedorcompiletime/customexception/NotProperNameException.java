package exception.checkedorcompiletime.customexception;

public class NotProperNameException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NotProperNameException() {
		super("age invalid");
	}

	public NotProperNameException(String messasge) {
		super(messasge);
	}

}
