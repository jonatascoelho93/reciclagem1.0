package br.com.coelho.reciclagem.models;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

@Entity
public class Material {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMaterial;
	@Length(min = 3, max = 20)
	@NotBlank
	private String descricaoMateria;
	@ManyToOne
	private UnidadeMedida unidadeMedida;
	@NotNull
	private BigDecimal precoCompraMaterial;
	@NotNull
	private BigDecimal precoVendaMaterial;

	public Integer getIdMaterial() {
		return idMaterial;
	}

	public String getDescricaoMateria() {
		return descricaoMateria;
	}

	public void setDescricaoMateria(String descricaoMateria) {
		this.descricaoMateria = descricaoMateria;
	}

	public UnidadeMedida getUnidadeMedida() {
		return unidadeMedida;
	}

	public void setUnidadeMedida(UnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	public BigDecimal getPrecoCompraMaterial() {
		return precoCompraMaterial;
	}

	public void setPrecoCompraMaterial(BigDecimal precoCompraMaterial) {
		this.precoCompraMaterial = precoCompraMaterial;
	}

	public BigDecimal getPrecoVendaMaterial() {
		return precoVendaMaterial;
	}

	public void setPrecoVendaMaterial(BigDecimal precoVendaMaterial) {
		this.precoVendaMaterial = precoVendaMaterial;
	}

}
