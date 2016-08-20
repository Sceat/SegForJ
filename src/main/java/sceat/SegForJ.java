package sceat;

import java.util.logging.Logger;

import sceat.unsafe.UnsafeAccessor;

/**
 * This class is the main class of a useless noob mlg noscope app that create a swagg segfault at launch
 * 
 * @author Sylvain José Amaury Pierre DURIF {@literal <oriana-aldebaran@bugarrach.cosmos>}
 * @Since 0.0.1
 */
public final class SegForJ {

	public static final Logger LOGGER = Logger.getLogger("Christ_Cosmique");

	private SegForJ() {
	}

	/**
	 * ask dumbledore
	 * 
	 * @param args
	 *            u fool
	 */
	public static void main(String[] args) {
		LOGGER.info("Watch him rollin down the street");
		try {
			UnsafeAccessor.getUnsafe().freeMemory(UnsafeAccessor.getUnsafe().allocateInstance(SegForJ.class).hashCode());
		} catch (InstantiationException e) { // NOSONAR fuck off get aids
			LOGGER.severe("GG obama you just dodge worldwar 3");
		}
	}

}
