package EjemploCajaNegra;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

class ejemploCajaNegraTest {
	
	EjemploCajaNegra miPorgrama = new EjemploCajaNegra();
	@Test
	void CP1() {
		
		InputStream sysInBackup = System.in;
		PrintStream sysOutBackup = System.out;
		
		ByteArrayInputStream in = new ByteArrayInputStream("amigos\n50\n3000\n".getBytes());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		
		System.setIn(in);
		System.setOut(new PrintStream(outContent));
		
		miPorgrama.AmigosDivisores();;
		
		System.setIn(sysInBackup);
		System.setOut(sysOutBackup);
		assertTrue(outContent.toString().indexOf("Los numeros introducidos no son amigos")>0);
	}
}
