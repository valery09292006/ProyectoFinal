package testCarapp;
import com.mycompany.Carapp.Administrador;
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AdministradorTest {

    @Test
    public void testRegistroCompleto() {
        Administrador admin = new Administrador();
        admin.setNombre("Cristian");
        admin.setEmail("Cristian@gmail.com");
        admin.setContraseña("Andres1990");
        admin.setRol("ADMIN");
        
        assertTrue(admin.validarRegistro());
    }

    @Test
    public void testRegistroSinRol() {
        Administrador admin = new Administrador();
        admin.setNombre("Cristian");
        admin.setEmail("Cristian@gmail.com");
        admin.setContraseña("andres1990");
        
        assertFalse(admin.validarRegistro());
    }

    @Test
    public void testValidacionCorreo() {
        Administrador admin = new Administrador();
        
        assertTrue(admin.validarCorreo("Cristian@gmail.com"));
        assertFalse(admin.validarCorreo("cristian1@gmail.com"));
        assertFalse(admin.validarCorreo("cristian@.com"));
    }

    @Test
    public void testValidacionContraseña() {
        Administrador admin = new Administrador();
        
        assertTrue(admin.validarContraseña("Andres1990"));
        assertFalse(admin.validarContraseña("Andres"));
        assertFalse(admin.validarContraseña("andres19908234"));
    }
}
