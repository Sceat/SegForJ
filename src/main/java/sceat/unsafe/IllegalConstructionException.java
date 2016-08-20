package sceat.unsafe;

/**
 * A runtime exception to avoid illegal construction of util classes
 * 
 * @author Sylvain José Amaury Pierre DURIF {@literal <oriana-aldebaran@bugarrach.cosmos>}
 */
public class IllegalConstructionException extends IllegalStateException {

	/**
	 * Construct the exception
	 */
	public IllegalConstructionException() {
		super("A construction of this class is not allowed");
	}
}