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
@Table(name="Em_Usuario")
public class Usuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3280392578798013969L;
	
	@Id
	@Column(name="idTablaMaestra")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Column(name="idSituacionUsuario")
	private Integer idSituacionUsuario;
	
	@Column(name="usuario")
	private String usuario;
	
	@Column(name="password")
	private String password;
	
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

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdSituacionUsuario() {
		return idSituacionUsuario;
	}

	public void setIdSituacionUsuario(Integer idSituacionUsuario) {
		this.idSituacionUsuario = idSituacionUsuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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
