package com.hackmonkey.EMControlPersonal.model;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Em_Telefono")
public class Telefono implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 3245016868804531429L;
	
	@Id
	@Column(name="idTablaMaestra")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTelefono;
	
	@Column(name="idPersona")
	private Long idPersona;
	
	@Column(name="idTipoTelefono")
	private Integer idTipoTelefono;
	
	@Column(name="idOperador")
	private Integer idOperador;
	
	@Column(name="idSituacionTelefono")
	private Integer idSituacionTelefono;
	
	@Column(name="numero")
	private String numero;
	
	@Column(name="estado")
	private Boolean estado;

	@Column(name="idUsuarioRegistro")
	private Long idUsuarioRegistro;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechaRegistro")
	private Date fechaRegistro;
	
	@Column(name="hostRegistro")
	private String hostRegistro;
	
	@Column(name="idUsuarioModificacion")
	private Long idUsuarioModificacion;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechaModificacion")
	private Date fechaModificacion;
	
	@Column(name="hostModificacion")
	private String hostModificacion;

	public Telefono() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(Long idTelefono) {
		this.idTelefono = idTelefono;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Integer getIdTipoTelefono() {
		return idTipoTelefono;
	}

	public void setIdTipoTelefono(Integer idTipoTelefono) {
		this.idTipoTelefono = idTipoTelefono;
	}

	public Integer getIdOperador() {
		return idOperador;
	}

	public void setIdOperador(Integer idOperador) {
		this.idOperador = idOperador;
	}

	public Integer getIdSituacionTelefono() {
		return idSituacionTelefono;
	}

	public void setIdSituacionTelefono(Integer idSituacionTelefono) {
		this.idSituacionTelefono = idSituacionTelefono;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Long getIdUsuarioRegistro() {
		return idUsuarioRegistro;
	}

	public void setIdUsuarioRegistro(Long idUsuarioRegistro) {
		this.idUsuarioRegistro = idUsuarioRegistro;
	}

	public Date getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getHostRegistro() {
		return hostRegistro;
	}

	public void setHostRegistro(String hostRegistro) {
		this.hostRegistro = hostRegistro;
	}

	public Long getIdUsuarioModificacion() {
		return idUsuarioModificacion;
	}

	public void setIdUsuarioModificacion(Long idUsuarioModificacion) {
		this.idUsuarioModificacion = idUsuarioModificacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getHostModificacion() {
		return hostModificacion;
	}

	public void setHostModificacion(String hostModificacion) {
		this.hostModificacion = hostModificacion;
	}
	
	
	
}
