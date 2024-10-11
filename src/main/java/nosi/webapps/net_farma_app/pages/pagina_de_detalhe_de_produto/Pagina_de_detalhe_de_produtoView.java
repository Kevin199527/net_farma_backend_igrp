package nosi.webapps.net_farma_app.pages.pagina_de_detalhe_de_produto;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Pagina_de_detalhe_de_produtoView extends View {

	public Field sectionheader_1_text;
	public Field form_1_img_1;
	public Field nome_do_produto;
	public Field preco_do_produto;
	public Field tipo_de_produto;
	public Field contem_receita;
	public Field ativo;
	public Field ativo_check;
	public Field descricao_do_produto;
	public Field id_list;
	public IGRPSectionHeader sectionheader_1;
	public IGRPForm form_1;

	public IGRPButton btn_concluir;
	public IGRPButton btn_fechar_1;

	public Pagina_de_detalhe_de_produtoView(){

		this.setPageTitle("Pagina de Detalhe de Produto");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		form_1 = new IGRPForm("form_1","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><strong><span style='font-family:Times New Roman,Times,serif;'><span style='font-size:36px;'>Detalhe do Produto</span></span></strong></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		form_1_img_1 = new TextField(model,"form_1_img_1");
		form_1_img_1.setLabel(gt("Img"));
		form_1_img_1.setValue(gt("../images/IGRP/IGRP2.3/assets/img/loginLogo.svg"));
		form_1_img_1.propertie().add("name","p_form_1_img_1").add("type","img").add("img","../images/IGRP/IGRP2.3/assets/img/loginLogo.svg").add("width","").add("height","").add("croppie","false").add("rounded","false").add("autoupload","false").add("maxlength","250").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		nome_do_produto = new TextField(model,"nome_do_produto");
		nome_do_produto.setLabel(gt("Nome do Produto"));
		nome_do_produto.propertie().add("name","p_nome_do_produto").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Nome do Produto")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		preco_do_produto = new TextField(model,"preco_do_produto");
		preco_do_produto.setLabel(gt("Preço do Produto"));
		preco_do_produto.propertie().add("name","p_preco_do_produto").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Preço do Produto")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		tipo_de_produto = new TextField(model,"tipo_de_produto");
		tipo_de_produto.setLabel(gt("Tipo de Produto"));
		tipo_de_produto.propertie().add("name","p_tipo_de_produto").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Tipo de Produto")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		contem_receita = new TextField(model,"contem_receita");
		contem_receita.setLabel(gt("Contem Receita"));
		contem_receita.propertie().add("name","p_contem_receita").add("type","text").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("Contem Receita")).add("desclabel","false").add("inputmask","").add("tooltip","false").add("disable_copy_paste","false");
		
		ativo = new CheckBoxField(model,"ativo");
		ativo.setLabel(gt("Ativo"));
		ativo.propertie().add("name","p_ativo").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","int").add("tooltip","false").add("disable_copy_paste","false").add("switch","true").add("check","true");
		
		descricao_do_produto = new TextAreaField(model,"descricao_do_produto");
		descricao_do_produto.setLabel(gt("Descrição do Produto"));
		descricao_do_produto.propertie().add("name","p_descricao_do_produto").add("type","textarea").add("maxlength","2500000").add("required","false").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("tooltip","false").add("disable_copy_paste","false");
		
		id_list = new HiddenField(model,"id_list");
		id_list.setLabel(gt(""));
		id_list.propertie().add("name","p_id_list").add("type","hidden").add("maxlength","250").add("java-type","").add("tooltip","false").add("disable_copy_paste","false").add("tag","id_list");
		


		btn_concluir = new IGRPButton("Concluir","net_farma_app","Pagina_de_detalhe_de_produto","concluir","submit","success|fa-check","","");
		btn_concluir.propertie.add("id","button_e86c_34d9").add("type","form").add("class","success").add("rel","concluir").add("refresh_components","");

		btn_fechar_1 = new IGRPButton("Fechar","net_farma_app","Pagina_de_detalhe_de_produto","fechar_1","closerefresh","danger|fa-close","","");
		btn_fechar_1.propertie.add("id","button_093c_b006").add("type","form").add("class","danger").add("rel","fechar_1").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		
		sectionheader_1.addField(sectionheader_1_text);

		form_1.addField(form_1_img_1);
		form_1.addField(nome_do_produto);
		form_1.addField(preco_do_produto);
		form_1.addField(tipo_de_produto);
		form_1.addField(contem_receita);
		form_1.addField(ativo);
		form_1.addField(descricao_do_produto);
		form_1.addField(id_list);

		form_1.addButton(btn_concluir);
		form_1.addButton(btn_fechar_1);
		this.addToPage(sectionheader_1);
		this.addToPage(form_1);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_do_produto.setValue(model);
		preco_do_produto.setValue(model);
		tipo_de_produto.setValue(model);
		contem_receita.setValue(model);
		ativo.setValue(model);
		descricao_do_produto.setValue(model);
		id_list.setValue(model);	

		}
}