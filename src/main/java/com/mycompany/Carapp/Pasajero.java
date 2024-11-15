package com.mycompany.Carapp;

public class Pasajero {
    private String nombre;
    private String email;
    private String contraseña;
    private boolean aceptaTerminos;

    public Pasajero() {}

    public Pasajero(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }

    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public boolean isAceptaTerminos() { return aceptaTerminos; }
    public void setAceptaTerminos(boolean aceptaTerminos) { this.aceptaTerminos = aceptaTerminos; }

    public boolean validarRegistro() {
        return nombre != null && !nombre.isEmpty() &&
               email != null && validarCorreo(email) &&
               contraseña != null && validarContraseña(contraseña);
    }

    public boolean validarCorreo(String email) {
        return email.matches("pablo@gmail.com");
    }

    public boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8 && contraseña.matches("pablo234");
    }
}
