package nosi.webapps.net_farma_app.pages.paginalistarproduto;

import nosi.core.gui.components.IGRPTable;
import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;
import nosi.core.webapp.databse.helpers.BaseQueryInterface;
import java.util.ArrayList;
import java.util.List;

public class Paginalistarproduto extends Model{		

	@RParam(rParamName = "p_sectionheader_2_text")
	private String sectionheader_2_text;

	@RParam(rParamName = "p_nome_filter")
	private String nome_filter;

	@RParam(rParamName = "p_tipo_de_produto_filtro")
	private String tipo_de_produto_filtro;

	@RParam(rParamName = "p_receita_filter")
	private String receita_filter;

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;
	
	private List<Tabela_de_produto> tabela_de_produto = new ArrayList<>();	
	public void setTabela_de_produto(List<Tabela_de_produto> tabela_de_produto){
		this.tabela_de_produto = tabela_de_produto;
	}
	public List<Tabela_de_produto> getTabela_de_produto(){
		return this.tabela_de_produto;
	}

	
	public void setSectionheader_2_text(String sectionheader_2_text){
		this.sectionheader_2_text = sectionheader_2_text;
	}
	public String getSectionheader_2_text(){
		return this.sectionheader_2_text;
	}
	
	public void setNome_filter(String nome_filter){
		this.nome_filter = nome_filter;
	}
	public String getNome_filter(){
		return this.nome_filter;
	}
	
	public void setTipo_de_produto_filtro(String tipo_de_produto_filtro){
		this.tipo_de_produto_filtro = tipo_de_produto_filtro;
	}
	public String getTipo_de_produto_filtro(){
		return this.tipo_de_produto_filtro;
	}
	
	public void setReceita_filter(String receita_filter){
		this.receita_filter = receita_filter;
	}
	public String getReceita_filter(){
		return this.receita_filter;
	}
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}


	public static class Tabela_de_produto extends IGRPTable.Table{
		private String imagem="../images/IGRP/IGRP2.3/assets/img/jon_doe.jpg";
		private String imagem_uuid;
		private String nome_do_produto;
		private String descricao;
		private String preco;
		private String tipo_de_produto;
		private String receita;
		private int ativo;
		private int ativo_check;
		private String id_list;
		public void setImagem(String imagem){
			this.imagem = imagem;
		}
		public String getImagem(){
			return this.imagem;
		}
		public void setImagem_uuid(String imagem_uuid){
			this.imagem_uuid = imagem_uuid;
		}
		public String getImagem_uuid(){
			return this.imagem_uuid;
		}

		public void setNome_do_produto(String nome_do_produto){
			this.nome_do_produto = nome_do_produto;
		}
		public String getNome_do_produto(){
			return this.nome_do_produto;
		}

		public void setDescricao(String descricao){
			this.descricao = descricao;
		}
		public String getDescricao(){
			return this.descricao;
		}

		public void setPreco(String preco){
			this.preco = preco;
		}
		public String getPreco(){
			return this.preco;
		}

		public void setTipo_de_produto(String tipo_de_produto){
			this.tipo_de_produto = tipo_de_produto;
		}
		public String getTipo_de_produto(){
			return this.tipo_de_produto;
		}

		public void setReceita(String receita){
			this.receita = receita;
		}
		public String getReceita(){
			return this.receita;
		}

		public void setAtivo(int ativo){
			this.ativo = ativo;
		}
		public int getAtivo(){
			return this.ativo;
		}
		public void setAtivo_check(int ativo_check){
			this.ativo_check = ativo_check;
		}
		public int getAtivo_check(){
			return this.ativo_check;
		}

		public void setId_list(String id_list){
			this.id_list = id_list;
		}
		public String getId_list(){
			return this.id_list;
		}

	}

	public void loadTabela_de_produto(BaseQueryInterface query) {
		this.setTabela_de_produto(this.loadTable(query,Tabela_de_produto.class));
	}

}