package nosi.webapps.net_farma_app.pages.pagina_de_detalhe_de_produto;

import nosi.core.webapp.Model;
import nosi.core.webapp.RParam;

public class Pagina_de_detalhe_de_produto extends Model{		

	@RParam(rParamName = "p_sectionheader_1_text")
	private String sectionheader_1_text;

	@RParam(rParamName = "p_form_1_img_1")
	private String form_1_img_1;
	@RParam(rParamName = "p_form_1_img_1_uuid")
	private String form_1_img_1_uuid;

	@RParam(rParamName = "p_nome_do_produto")
	private String nome_do_produto;

	@RParam(rParamName = "p_preco_do_produto")
	private String preco_do_produto;

	@RParam(rParamName = "p_tipo_de_produto")
	private String tipo_de_produto;

	@RParam(rParamName = "p_contem_receita")
	private String contem_receita;

	@RParam(rParamName = "p_descricao")
	private String descricao;
	
	public void setSectionheader_1_text(String sectionheader_1_text){
		this.sectionheader_1_text = sectionheader_1_text;
	}
	public String getSectionheader_1_text(){
		return this.sectionheader_1_text;
	}
	
	public void setForm_1_img_1(String form_1_img_1){
		this.form_1_img_1 = form_1_img_1;
	}
	public String getForm_1_img_1(){
		return this.form_1_img_1;
	}
	public void setForm_1_img_1_uuid(String form_1_img_1_uuid){
		this.form_1_img_1_uuid = form_1_img_1_uuid;
	}
	public String getForm_1_img_1_uuid(){
		return this.form_1_img_1_uuid;
	}
	
	public void setNome_do_produto(String nome_do_produto){
		this.nome_do_produto = nome_do_produto;
	}
	public String getNome_do_produto(){
		return this.nome_do_produto;
	}
	
	public void setPreco_do_produto(String preco_do_produto){
		this.preco_do_produto = preco_do_produto;
	}
	public String getPreco_do_produto(){
		return this.preco_do_produto;
	}
	
	public void setTipo_de_produto(String tipo_de_produto){
		this.tipo_de_produto = tipo_de_produto;
	}
	public String getTipo_de_produto(){
		return this.tipo_de_produto;
	}
	
	public void setContem_receita(String contem_receita){
		this.contem_receita = contem_receita;
	}
	public String getContem_receita(){
		return this.contem_receita;
	}
	
	public void setDescricao(String descricao){
		this.descricao = descricao;
	}
	public String getDescricao(){
		return this.descricao;
	}



}