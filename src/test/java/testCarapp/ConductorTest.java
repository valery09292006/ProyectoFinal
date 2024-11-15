package testCarapp;
import com.mycompany.Carapp.Conductor;
import org.junit.Test;
import static org.junit.Assert.*;

public class ConductorTest {
    
    @Test
    public void testRegistroCompleto() {
        Conductor conductor = new Conductor();
        conductor.setNombre("luis carlos");
        conductor.setEmail("luis@gmail.com");
        conductor.setContraseña("Carlos3456");
        conductor.setLicencia("ZPA4365");
        conductor.setTipoVehiculo("RENAULT");
        conductor.setAceptaTerminos(true);
        
        assertTrue(conductor.validarRegistro());
    }

    @Test
    public void testRegistroSinLicencia() {
        Conductor conductor = new Conductor();
        conductor.setNombre("luis carlos");
        conductor.setEmail("luis@gmail.com");
        conductor.setContraseña("Carlos3456");
        conductor.setTipoVehiculo("RENAULT");
        
        assertFalse(conductor.validarRegistro());
    }

    @Test
    public void testValidacionCorreo() {
        Conductor conductor = new Conductor();
        
        assertTrue(conductor.validarCorreo("luis@gmail.com"));
        assertFalse(conductor.validarCorreo("luis12@gmail.com"));
        assertFalse(conductor.validarCorreo("luis@Hotmail.com"));
    }

    @Test
    public void testValidacionContraseña() {
        Conductor conductor = new Conductor();
        
        assertTrue(conductor.validarContraseña("Carlos3456"));
        assertFalse(conductor.validarContraseña("Carlos")); 
        assertFalse(conductor.validarContraseña("carlos3456"));
    }
}
