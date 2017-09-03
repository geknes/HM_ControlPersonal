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
@Table(name="Em_Asistencia")
public class Asistencia implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2747424822066373855L;
	
	@Id
	@Column(name="idAsistencia")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idAsistencia;
	
	@Column(name="idPersona")
	private Long idPersona;
	
	@Temporal(TemporalType.TIME)
	@Column(name="horaIngreso")
	private Date horaIngreso;
	
	@Temporal(TemporalType.TIME)
	@Column(name="horaSalida")
	private Date horaSalida;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fecha")
	private Date fecha;
	
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
	
	public Asistencia() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdAsistencia() {
		return idAsistencia;
	}

	public void setIdAsistencia(Long idAsistencia) {
		this.idAsistencia = idAsistencia;
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Date getHoraIngreso() {
		return horaIngreso;
	}

	public void setHoraIngreso(Date horaIngreso) {
		this.horaIngreso = horaIngreso;
	}

	public Date getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(Date horaSalida) {
		this.horaSalida = horaSalida;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
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
