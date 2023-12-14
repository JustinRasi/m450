package ch.schule.bank.junit5;

import ch.schule.Booking;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


/**
 * Tests für die Klasse Booking.
 *
 * @author Luigi Cavuoti
 * @version 1.1
 */
public class BookingTests
{
	/**
	 * Tests für die Erzeugung von Buchungen.
	 */
	@Test
	public void testInitialization()
	{
		Booking booking = new Booking(20220101, 1000);
		assertEquals(20220101, booking.getDate());
		assertEquals(1000, booking.getAmount());
	}

	/**
	 * Experimente mit print().
	 */
	@Test
	public void testPrint()
	{
		Booking booking = new Booking(1, 100);

		StringBuilder printedOutput = new StringBuilder();
		System.setOut(new java.io.PrintStream(new java.io.ByteArrayOutputStream()) {
			public void println(String message) {
				printedOutput.append(message).append("\n");
			}
		});

		booking.print(500);

		System.setOut(System.out);

		String expectedOutput = "01.01.1971  1.00 501.00\n";
		assertEquals(expectedOutput, printedOutput.toString());
	};
}
