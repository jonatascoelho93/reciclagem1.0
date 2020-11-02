package br.com.coelho.reciclagem.models;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

@Entity
public class PedidoCompra {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedidoCompra;

	@OneToMany(cascade = CascadeType.ALL)
	@NotNull
	private List<PedidoDeCompraItens> pedidoDeCompraItens;

	@NotNull
	private BigDecimal totalCompra;

	@Temporal(TemporalType.DATE)
	private Calendar dataPublicacao;

	public List<PedidoDeCompraItens> getPedidoDeCompraItens() {
		return pedidoDeCompraItens;
	}

	public void setPedidoDeCompraItens(List<PedidoDeCompraItens> pedidoDeCompraItens) {
		this.pedidoDeCompraItens = pedidoDeCompraItens;
	}

	public BigDecimal getTotalCompra() {
		return totalCompra;
	}

	public void setTotalCompra(BigDecimal totalCompra) {
		this.totalCompra = totalCompra;
	}

	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public Long getIdPedidoCompra() {
		return idPedidoCompra;
	}

}
