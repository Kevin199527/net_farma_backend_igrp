package nosi.webapps.net_farma_app.dao;

import javax.persistence.Table;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import java.io.Serial;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedQuery;
import nosi.base.ActiveRecord.BaseActiveRecord;
import jakarta.validation.constraints.Size;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author: Nositeste 2024-10-09
 */

//@XmlRootElement // Can be used for REST / XML API

@Entity
@Table(name = "tbl_medicamentos", schema = "public")
@NamedQuery(name = "TblMedicamentos.findAll", query = "SELECT t FROM TblMedicamentos t")
public class TblMedicamentos extends BaseActiveRecord<TblMedicamentos> {

    @Serial
    private static final long serialVersionUID = 1L;

    public static final String TABLE_NAME = "TBL_MEDICAMENTOS";

    // Change Integer type to BigDecimal if the number is very large

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_produto", nullable = false, updatable = false)
 	private Integer idProduto;
	@Size(max = 255)
	@Column(name = "nome")
	private String nome;
	@Column(name = "descricao", columnDefinition = "text")
	private String descricao;
	@Size(max = 200)
	@Column(name = "tipo_de_produto")
	private String tipoDeProduto;
	@Column(name = "preco")
	private String preco;
	@Size(max = 10)
	@Column(name = "receita")
	private String receita;
	@Column(name = "imagem_url")
	private String imagemUrl;
	@Column(name = "estoques")
	private Integer estoques;
	@Column(name = "ativo")
	private String ativo;

   public Integer getIdProduto() {
      return this.idProduto;
   }

   public void setIdProduto(Integer idProduto) {
      this.idProduto = idProduto;
   }

   public String getNome() {
      return this.nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getDescricao() {
      return this.descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public String getTipoDeProduto() {
      return this.tipoDeProduto;
   }

   public void setTipoDeProduto(String tipoDeProduto) {
      this.tipoDeProduto = tipoDeProduto;
   }

   public String getPreco() {
      return this.preco;
   }

   public void setPreco(String preco) {
      this.preco = preco;
   }

   public String getReceita() {
      return this.receita;
   }

   public void setReceita(String receita) {
      this.receita = receita;
   }

   public String getImagemUrl() {
      return this.imagemUrl;
   }

   public void setImagemUrl(String imagemUrl) {
      this.imagemUrl = imagemUrl;
   }

   public Integer getEstoques() {
      return this.estoques;
   }

   public void setEstoques(Integer estoques) {
      this.estoques = estoques;
   }

   public String getAtivo() {
      return this.ativo;
   }

   public void setAtivo(String ativo) {
      this.ativo = ativo;
   }

   public static final class Field {
      public static final String ID_PRODUTO = "idProduto";
      public static final String NOME = "nome";
      public static final String DESCRICAO = "descricao";
      public static final String TIPO_DE_PRODUTO = "tipoDeProduto";
      public static final String PRECO = "preco";
      public static final String RECEITA = "receita";
      public static final String IMAGEM_URL = "imagemUrl";
      public static final String ESTOQUES = "estoques";
      public static final String ATIVO = "ativo";

	  private Field() {}
	}
}