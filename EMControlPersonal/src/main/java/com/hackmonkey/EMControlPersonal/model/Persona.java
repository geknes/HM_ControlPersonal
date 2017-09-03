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
@Table(name="Em_Persona")
public class Persona implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6132929797030805923L;

	@Id
	@Column(name="idUsuarioRegistro")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idPersona;
	
	@Column(name="idUsuario")
	private Long idUsuario;
	
	@Column(name="idTipoEmpleado")
	private Integer idTipoEmpleado;
	
	@Column(name="idSexo")
	private Integer idSexo;
	
	@Column(name="idTipoDocumento")
	private Integer idTipoDocumento;
	
	@Column(name="idSituacionPersona")
	private Integer idSituacionPersona;
	
	@Column(name="numeroDocumento")
	private String numeroDocumento;
	
	@Column(name="primerNombre")
	private String primerNombre;
	
	@Column(name="segundoNombre")
	private String segundoNombre;
	
	@Column(name="apellidoPaterno")
	private String apellidoPaterno;
	
	@Column(name="apellidoMaterno")
	private String apellidoMaterno;
	
	@Temporal(TemporalType.DATE)
	@Column(name="fechaNacimiento")
	private Date fechaNacimiento;
	
	@Column(name="correo")
	private String correo;
	
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

	public Persona() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdTipoEmpleado() {
		return idTipoEmpleado;
	}

	public void setIdTipoEmpleado(Integer idTipoEmpleado) {
		this.idTipoEmpleado = idTipoEmpleado;
	}

	public Integer getIdSexo() {
		return idSexo;
	}

	public void setIdSexo(Integer idSexo) {
		this.idSexo = idSexo;
	}

	public Integer getIdTipoDocumento() {
		return idTipoDocumento;
	}

	public void setIdTipoDocumento(Integer idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}

	public Integer getIdSituacionPersona() {
		return idSituacionPersona;
	}

	public void setIdSituacionPersona(Integer idSituacionPersona) {
		this.idSituacionPersona = idSituacionPersona;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
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
