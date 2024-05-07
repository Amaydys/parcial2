package com.app.web.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    
	    @Column(name = "placa",nullable = false,length = 6)
	    private String placa;
	    
	    @Column(name = "entrada",nullable = false) 
	     private int entrada;
	    
	    
	    @Column(name = "salida",nullable = false,length = 100) 
	     private String salida;
	    
	    @Column(name = "ubicacion",nullable = false)
	    private int ubicacion;
	    
	    
	    @Column(name = "tipo_vehiculo",nullable = false,length = 100) 
	     private String tipo;
	    
	    public Usuario() {
	    	
	    	
	    }

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getPlaca() {
			return placa;
		}

		public void setPlaca(String placa) {
			this.placa = placa;
		}

		public int getEntrada() {
			return entrada;
		}

		public void setEntrada(int entrada) {
			this.entrada = entrada;
		}

		public String getSalida() {
			return salida;
		}

		public void setSalida(String salida) {
			this.salida = salida;
		}

		public int getUbicacion() {
			return ubicacion;
		}

		public void setUbicacion(int ubicacion) {
			this.ubicacion = ubicacion;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public Usuario(Long id, String placa, int entrada, String salida, int ubicacion, String tipo) {
			super();
			this.id = id;
			this.placa = placa;
			this.entrada = entrada;
			this.salida = salida;
			this.ubicacion = ubicacion;
			this.tipo = tipo;
		}
		public Usuario( String placa, int entrada, String salida, int ubicacion, String tipo) {
			super();
			
			this.placa = placa;
			this.entrada = entrada;
			this.salida = salida;
			this.ubicacion = ubicacion;
			this.tipo = tipo;
		}
		@Override
		public String toString() {
			return "estudiantes [id=" + id + ", placa=" + placa + ", entrada=" + entrada + ", salida=" + salida
					+ ", ubicacion=" + ubicacion + ", tipo=" + tipo + "]";
		}
}

		

	