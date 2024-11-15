package com.mycompany.Carapp;

public class Conductor {
    private String nombre;
    private String email;
    private String contraseña;
    private String licencia;
    private String tipoVehiculo;
    private boolean aceptaTerminos;

    public Conductor() {}

    public Conductor(String nombre, String email, String contraseña, String licencia, String tipoVehiculo) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.licencia = licencia;
        this.tipoVehiculo = tipoVehiculo;
    }

    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public String getLicencia() { return licencia; }
    public void setLicencia(String licencia) { this.licencia = licencia; }
    public String getTipoVehiculo() { return tipoVehiculo; }
    public void setTipoVehiculo(String tipoVehiculo) { this.tipoVehiculo = tipoVehiculo; }
    public boolean isAceptaTerminos() { return aceptaTerminos; }
    public void setAceptaTerminos(boolean aceptaTerminos) { this.aceptaTerminos = aceptaTerminos; }

    public boolean validarRegistro() {
        return nombre != null && !nombre.isEmpty() &&
               email != null && validarCorreo(email) &&
               contraseña != null && validarContraseña(contraseña) &&
               licencia != null && !licencia.isEmpty() &&
               tipoVehiculo != null && !tipoVehiculo.isEmpty();
    }

    public boolean validarCorreo(String email) {
        return email.matches("felipeandres@gmail.com");
    }

    public boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8 && contraseña.matches("Felipe128");
    }
}
