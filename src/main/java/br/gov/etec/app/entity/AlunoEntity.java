package br.gov.etec.app.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tb_aluno")
public class AlunoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id_aluno", nullable = false)
	private Long Id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "rg", nullable = true)
	private String rg;
	
	@Column(name = "cpf", nullable = true)
	private String cpf;
	
	@Column(name = "email", nullable = true)
	private String email;

	@Column(name = "id_curso", nullable = false)
	private Long id_curso;

	@Column(name = "data_nasc", nullable = false)
	private Date data_nasc;
	
	@Column(name = "senha", nullable = false)
	private String senha;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getId_curso() {
		return id_curso;
	}

	public void setId_curso(Long id_curso) {
		this.id_curso = id_curso;
	}

	public Date getData_nasc() {
		return data_nasc;
	}

	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "Aluno [Id=" + Id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", email=" + email + ", id_curso="
				+ id_curso + ", data_nasc=" + data_nasc + ", senha=" + senha + "]";
	}
	
}
