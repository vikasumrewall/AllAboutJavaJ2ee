package exception.uncheckedorruntime.customexception;

public class NotProperNameException extends RuntimeException {

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
