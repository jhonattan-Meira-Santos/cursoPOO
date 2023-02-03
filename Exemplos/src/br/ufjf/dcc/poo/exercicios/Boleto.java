package br.ufjf.dcc.poo.exercicios;

import java.util.ArrayList;
import java.util.Date;

public class Boleto {
	private String codBarra;
	private Date dataVenc;
	private double valor;
	private ArrayList<Pagamento> pagamento;
	private Socio socio;
	public String getCodBarra() {
		return codBarra;
	}
	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}
	public Date getDataVenc() {
		return dataVenc;
	}
	public void setDataVenc(Date dataVenc) {
		this.dataVenc = dataVenc;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public ArrayList<Pagamento> getPagamento() {
		return pagamento;
	}
	public void setPagamento(ArrayList<Pagamento> pagamento) {
		this.pagamento = pagamento;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	
	
}
