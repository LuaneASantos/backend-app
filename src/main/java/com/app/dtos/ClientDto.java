package com.app.dtos;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotNull;
import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModelProperty;

public class ClientDto implements Serializable {

	private static final long serialVersionUID = -8105241933692707649L;
	
	@ApiModelProperty(value = "Nome do cliente")
	private String nome;
	
	@ApiModelProperty(value = "Sexo do cliente")
	private String sexo;
	
	@ApiModelProperty(value = "E-mail do cliente")
	private String email;
	
	@ApiModelProperty(value = "Data de nascimento do cliente (yyyy-MM-dd)")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	private Date dataNascimento;
	
	@ApiModelProperty(value = "Naturalidade do cliente")
	private String naturalidade;
	
	@ApiModelProperty(value = "Nacionalidade do cliente")
	private String nacionalidade;
	
	@ApiModelProperty(value = "CPF do cliente")
	private String CPF;
	


	public ClientDto() {

	}

	@NotNull(message = "Nome é uma informação obrigatória")
	public String getNome() {
		return nome;
	}

	public void setLocalNome(String nome) {
		this.nome = nome;
	}

	@NotNull(message = "Data de nascimento é uma informação obrigatória")
	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNaturalidade() {
		return naturalidade;
	}

	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@NotNull(message = "CPF é uma informação obrigatória")
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}
