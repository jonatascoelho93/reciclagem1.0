package br.com.coelho.reciclagem.models;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
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

}
