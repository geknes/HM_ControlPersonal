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
@Table(name="Em_TablaMaestra")
public class TablaMaestra implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7280848906074093245L;

	@Id
	@Column(name="idTablaMaestra")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idTablaMaestra;
	
	@Column(name="codigoTabla")
	private String codigoTabla;
	
	@Column(name="codigoRegistro")
	private Integer codigoRegistro;
	
	@Column(name="nombreCorto")
	private String nombreCorto;
	
	@Column(name="nombreLargo")
	private String nombreLargo;
	
	@Column(name="valor1")
	private String valor1;
	
	@Column(name="valor2")
	private String valor2;
	
	@Column(name="valor3")
	private String valor3;
	
	@Column(name="valor4")
	private String valor4;
	
	@Column(name="estado")
	private Boolean estado;
	
	@Column(name="numeroOrden")
	private Integer numeroOrden;
	
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

	public TablaMaestra() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdTablaMaestra() {
		return idTablaMaestra;
	}

	public void setIdTablaMaestra(Long idTablaMaestra) {
		this.idTablaMaestra = idTablaMaestra;
	}

	public String getCodigoTabla() {
		return codigoTabla;
	}

	public void setCodigoTabla(String codigoTabla) {
		this.codigoTabla = codigoTabla;
	}

	public Integer getCodigoRegistro() {
		return codigoRegistro;
	}

	public void setCodigoRegistro(Integer codigoRegistro) {
		this.codigoRegistro = codigoRegistro;
	}

	public String getNombreCorto() {
		return nombreCorto;
	}

	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}

	public String getNombreLargo() {
		return nombreLargo;
	}

	public void setNombreLargo(String nombreLargo) {
		this.nombreLargo = nombreLargo;
	}

	public String getValor1() {
		return valor1;
	}

	public void setValor1(String valor1) {
		this.valor1 = valor1;
	}

	public String getValor2() {
		return valor2;
	}

	public void setValor2(String valor2) {
		this.valor2 = valor2;
	}

	public String getValor3() {
		return valor3;
	}

	public void setValor3(String valor3) {
		this.valor3 = valor3;
	}

	public String getValor4() {
		return valor4;
	}

	public void setValor4(String valor4) {
		this.valor4 = valor4;
	}

	public Boolean getEstado() {
		return estado;
	}

	public void setEstado(Boolean estado) {
		this.estado = estado;
	}

	public Integer getNumeroOrden() {
		return numeroOrden;
	}

	public void setNumeroOrden(Integer numeroOrden) {
		this.numeroOrden = numeroOrden;
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
