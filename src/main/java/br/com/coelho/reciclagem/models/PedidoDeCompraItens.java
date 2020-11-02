package br.com.coelho.reciclagem.models;

import java.math.BigDecimal;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;

public class PedidoDeCompraItens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPedidoCompraItens;

	@ManyToMany
	@NotNull
	private Material material;

	@NotNull
	private BigDecimal quantidade;
	@NotNull
	private BigDecimal totalPreco;

	public Long getIdPedidoCompraItens() {
		return idPedidoCompraItens;
	}

	public Material getMaterial() {
		return material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public BigDecimal getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(BigDecimal quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getTotalPreco() {
		return totalPreco;
	}

	public void setTotalPreco(BigDecimal totalPreco) {
		this.totalPreco = totalPreco;
	}

}
