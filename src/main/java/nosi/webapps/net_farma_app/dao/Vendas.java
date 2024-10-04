package nosi.webapps.net_farma_app.dao;

import javax.persistence.GenerationType;
import nosi.base.ActiveRecord.BaseActiveRecord;
import javax.persistence.Entity;
import javax.persistence.Column;
import java.time.LocalDateTime;
import java.math.BigDecimal;
import java.io.Serial;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.NotBlank;
import javax.persistence.NamedQuery;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

/**
 * @author: Nositeste 2024-10-04
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "vendas", schema = "public")
@NamedQuery(name = "Vendas.findAll", query = "SELECT t FROM Vendas t")
public class Vendas extends BaseActiveRecord<Vendas> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "VENDAS";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, updatable = false)
 	private Integer id;
	@Size(max = 200)
	@Column(name = "produto")
	private String produto;
	@NotNull
	@Column(name = "quantidade")
	private Integer quantidade;
	@NotNull
	@Column(name = "preco_unitario")
	private BigDecimal precoUnitario;
	@Column(name = "data_venda")
	private LocalDateTime dataVenda;
	@NotBlank
	@Size(max = 50)
	@Column(name = "status")
	private String status;
	@NotBlank
	@Size(max = 50)
	@Column(name = "metodo_pagamento")
	private String metodoPagamento;
	@NotNull
	@Column(name = "valor_total")
	private BigDecimal valorTotal;
	@Size(max = 200)
	@Column(name = "tipo_produto")
	private String tipoProduto;

   public Integer getId() {
      return this.id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getProduto() {
      return this.produto;
   }

   public void setProduto(String produto) {
      this.produto = produto;
   }

   public Integer getQuantidade() {
      return this.quantidade;
   }

   public void setQuantidade(Integer quantidade) {
      this.quantidade = quantidade;
   }

   public BigDecimal getPrecoUnitario() {
      return this.precoUnitario;
   }

   public void setPrecoUnitario(BigDecimal precoUnitario) {
      this.precoUnitario = precoUnitario;
   }

   public LocalDateTime getDataVenda() {
      return this.dataVenda;
   }

   public void setDataVenda(LocalDateTime dataVenda) {
      this.dataVenda = dataVenda;
   }

   public String getStatus() {
      return this.status;
   }

   public void setStatus(String status) {
      this.status = status;
   }

   public String getMetodoPagamento() {
      return this.metodoPagamento;
   }

   public void setMetodoPagamento(String metodoPagamento) {
      this.metodoPagamento = metodoPagamento;
   }

   public BigDecimal getValorTotal() {
      return this.valorTotal;
   }

   public void setValorTotal(BigDecimal valorTotal) {
      this.valorTotal = valorTotal;
   }

   public String getTipoProduto() {
      return this.tipoProduto;
   }

   public void setTipoProduto(String tipoProduto) {
      this.tipoProduto = tipoProduto;
   }

   public static final class Field {
      public static final String ID = "id";
      public static final String PRODUTO = "produto";
      public static final String QUANTIDADE = "quantidade";
      public static final String PRECO_UNITARIO = "precoUnitario";
      public static final String DATA_VENDA = "dataVenda";
      public static final String STATUS = "status";
      public static final String METODO_PAGAMENTO = "metodoPagamento";
      public static final String VALOR_TOTAL = "valorTotal";
      public static final String TIPO_PRODUTO = "tipoProduto";

	  private Field() {}
	}
}