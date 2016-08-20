package sceat.unsafe;

import static sceat.SegForJ.LOGGER;

import java.lang.reflect.Field;
import java.util.logging.Level;

import sun.misc.Unsafe; // NOSONAR go fuck yourself

/**
 * This class is part of AresCommons library
 * 
 * @author Sylvain José Amaury Pierre DURIF {@literal <oriana-aldebaran@bugarrach.cosmos>}
 * @Since 0.0.1
 */
public class UnsafeAccessor {
	private static final Unsafe unsafe = stealUnsafe();

	private UnsafeAccessor() {
		throw new IllegalConstructionException();
	}

	private static Unsafe stealUnsafe() {
		try {
			Field f = Unsafe.class.getDeclaredField("theUnsafe");
			f.setAccessible(true);
			return (Unsafe) f.get(null);
		} catch (ReflectiveOperationException e) {
			LOGGER.log(Level.SEVERE, "Unsafe not found , library not usable", e);
			return null;
		}
	}

	/**
	 * Get the unsafe instance
	 * 
	 * @return unsafe
	 * @see Unsafe
	 */
	public static Unsafe getUnsafe() {
		return unsafe;
	}
}