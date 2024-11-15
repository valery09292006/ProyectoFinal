package testCarapp;

import com.mycompany.Carapp.Pasajero;
import org.junit.Test;
import static org.junit.Assert.*;

public class PasajeroTest {
    
    @Test
    public void testRegistroCompleto() {
        Pasajero pasajero = new Pasajero();
        pasajero.setNombre("Ana lucia");
        pasajero.setEmail("luciaAna@gmail.com");
        pasajero.setContraseña("Lucia1453");
        pasajero.setAceptaTerminos(true);
        
        assertTrue(pasajero.validarRegistro());
    }

    @Test
    public void testRegistroSinNombre() {
        Pasajero pasajero = new Pasajero();
        pasajero.setEmail("luciaAna@gmail.com");
        pasajero.setContraseña("Lucia1453");
        pasajero.setAceptaTerminos(true);
        
        assertFalse(pasajero.validarRegistro());
    }

    @Test
    public void testValidacionCorreo() {
        Pasajero pasajero = new Pasajero();
        
        assertTrue(pasajero.validarCorreo("luciaAna@gmail.com"));
        assertFalse(pasajero.validarCorreo("anaLucia@gmail.com"));
        assertFalse(pasajero.validarCorreo("luciana@gmail.com"));
    }

    @Test
    public void testValidacionContraseña() {
        Pasajero pasajero = new Pasajero();
        
        assertTrue(pasajero.validarContraseña("Lucia1453"));
        assertFalse(pasajero.validarContraseña("Lucia")); // muy corta
        assertFalse(pasajero.validarContraseña("lucia1453")); // sin mayúsculas
    }
}
