package com.ventas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer idCliente;
	
	@NotNull
	@NotBlank(message = "El Campo es obligatorio")
	@Size(min = 3,max = 70,message ="el campo debe estar entre 3 y 7a caracteres" )
	@Column(name = "nombres" ,nullable = false,length = 70)
	private String nombres;
	
	@NotNull
	@NotBlank(message = "El campo es obligatorio")
	@Size(min = 3,max =150,message = "el campo debe estar entre 3 y 150 caracteres" )
	@Column(name = "apellidos",nullable = false,length = 150)
	private String apellidos;
	
	
	@Size(min = 8,message = "ladireccion debe estar entre 8 y 150 caracteres")
	@Column(name = "direccion",nullable = true,length = 150)
	private String direccion;
	
	
	@Size(min = 8,message = "El telefono debe tener un minimo de 8 caracteres")
	@Column(name = "telefono",nullable = true,length = 10)
	private String telefono;
	
	@NotNull
	@NotBlank(message = "El email es obligatorio")
	@Size(min = 10,message = "El email debe ser de almenos 10 caracteres")
	@Email(message = "El email no es un formato valido")
	@Column(nullable = false,length = 150)
	private String email;
	
	
	public Integer getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	
}
