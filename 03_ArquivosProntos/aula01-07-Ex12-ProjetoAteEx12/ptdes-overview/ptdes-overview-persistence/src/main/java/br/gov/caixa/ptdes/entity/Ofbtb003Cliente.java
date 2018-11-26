package br.gov.caixa.ptdes.entity;
// Generated 30/10/2018 21:04:33 by Hibernate Tools 5.2.3.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ofbtb003Cliente generated by hbm2java
 */
@Entity
@Table(name = "OFBTB003_CLIENTE", schema = "OFB", catalog = "OVERDB")
public class Ofbtb003Cliente implements java.io.Serializable {

	private long nuCpfCliente;
	private String noCliente;
	private Date dtNascimento;
	private Set<Ofbtb004Conta> ofbtb004Contas = new HashSet<Ofbtb004Conta>(0);

	public Ofbtb003Cliente() {
	}

	public Ofbtb003Cliente(long nuCpfCliente, String noCliente, Date dtNascimento) {
		this.nuCpfCliente = nuCpfCliente;
		this.noCliente = noCliente;
		this.dtNascimento = dtNascimento;
	}

	public Ofbtb003Cliente(long nuCpfCliente, String noCliente, Date dtNascimento, Set<Ofbtb004Conta> ofbtb004Contas) {
		this.nuCpfCliente = nuCpfCliente;
		this.noCliente = noCliente;
		this.dtNascimento = dtNascimento;
		this.ofbtb004Contas = ofbtb004Contas;
	}

	@Id

	@Column(name = "NU_CPF_CLIENTE", unique = true, nullable = false, precision = 11, scale = 0, columnDefinition="DECIMAL(11)")
	public long getNuCpfCliente() {
		return this.nuCpfCliente;
	}

	public void setNuCpfCliente(long nuCpfCliente) {
		this.nuCpfCliente = nuCpfCliente;
	}

	@Column(name = "NO_CLIENTE", nullable = false, length = 200)
	public String getNoCliente() {
		return this.noCliente;
	}

	public void setNoCliente(String noCliente) {
		this.noCliente = noCliente;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DT_NASCIMENTO", nullable = false, length = 8)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "OFBTB005_CLIENTE_CONTA", schema = "OFB", catalog = "OVERDB", joinColumns = {
			@JoinColumn(name = "NU_CPF_CLIENTE_003", nullable = false, updatable = false) }, inverseJoinColumns = {
					@JoinColumn(name = "NU_NSU_CONTA_004", nullable = false, updatable = false) })
	public Set<Ofbtb004Conta> getOfbtb004Contas() {
		return this.ofbtb004Contas;
	}

	public void setOfbtb004Contas(Set<Ofbtb004Conta> ofbtb004Contas) {
		this.ofbtb004Contas = ofbtb004Contas;
	}

	@Override
	public String toString() {
		return "Ofbtb003Cliente [nuCpfCliente=" + nuCpfCliente + ", noCliente=" + noCliente + ", dtNascimento="
				+ dtNascimento + "]";
	}	
	
}