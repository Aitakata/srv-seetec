package br.gov.etec.app.dtos;

import java.io.Serializable;
import java.util.Date;

public class EventoDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8897101607411657261L;
	private String nome;
	private String descricao;
	private int	status;
	private Date dataInicio;
	private Date dataFim;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataFim() {
		return dataFim;
	}
	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}
	
	@Override
	public String toString() {
		return "EventoDto [nome=" + nome + ", descricao=" + descricao + ", status=" + status + ", dataInicio="
				+ dataInicio + ", dataFim=" + dataFim + "]";
	}
}
