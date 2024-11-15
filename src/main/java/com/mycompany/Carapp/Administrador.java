package com.mycompany.Carapp;


public class Administrador {
    private String nombre;
    private String email;
    private String contraseña;
    private String rol;
    private boolean aceptaTerminos;

    public Administrador() {}

    public Administrador(String nombre, String email, String contraseña, String rol) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getContraseña() { return contraseña; }
    public void setContraseña(String contraseña) { this.contraseña = contraseña; }
    public String getRol() { return rol; }
    public void setRol(String rol) { this.rol = rol; }
    public boolean isAceptaTerminos() { return aceptaTerminos; }
    public void setAceptaTerminos(boolean aceptaTerminos) { this.aceptaTerminos = aceptaTerminos; }

    public boolean validarRegistro() {
        return nombre != null && !nombre.isEmpty() &&
               email != null && validarCorreo(email) &&
               contraseña != null && validarContraseña(contraseña) &&
               rol != null && !rol.isEmpty();
    }

    public boolean validarCorreo(String email) {
        return email.matches("^[A-Za-z0-9+_.-]+@(.+)$");
    }

    public boolean validarContraseña(String contraseña) {
        return contraseña.length() >= 8 && contraseña.matches(".*[A-Z].*");
    }
}