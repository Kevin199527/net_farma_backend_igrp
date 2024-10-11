package nosi.webapps.net_farma_app.pages.registrar_medicamento;

import nosi.core.webapp.Model;
import nosi.core.webapp.View;
import nosi.core.gui.components.*;
import nosi.core.gui.fields.*;
import static nosi.core.i18n.Translator.gt;

public class Registrar_medicamentoView extends View {

	public Field sectionheader_1_text;
	public Field nome_medicamento;
	public Field descricao_do_produto;
	public Field preco_do_produto;
	public Field image;
	public Field receita;
	public Field estoque;
	public Field tipo_de_produto;
	public Field ativo;
	public Field ativo_check;
	public IGRPSectionHeader sectionheader_1;
	public IGRPBox box_1;
	public IGRPSeparatorList separatorlist_registrar;

	public IGRPToolsBar toolsbar_1;
	public IGRPToolsBar toolsbar_2;
	public IGRPButton btn_registrar_produtos;
	public IGRPButton btn_listar_produtos;
	public IGRPButton btn_dashboard;
	public IGRPButton btn_gravar;

	public Registrar_medicamentoView(){

		this.setPageTitle("Registrar Medicamento");
			
		sectionheader_1 = new IGRPSectionHeader("sectionheader_1","");

		box_1 = new IGRPBox("box_1","");

		separatorlist_registrar = new IGRPSeparatorList("separatorlist_registrar","");

		sectionheader_1_text = new TextField(model,"sectionheader_1_text");
		sectionheader_1_text.setLabel(gt(""));
		sectionheader_1_text.setValue(gt("<p><strong><span style='font-family:Times New Roman,Times,serif;'><span style='font-size:36px;'>Registrar Produto</span></span></strong></p>"));
		sectionheader_1_text.propertie().add("type","text").add("name","p_sectionheader_1_text").add("maxlength","4000");
		
		nome_medicamento = new TextField(model,"nome_medicamento");
		nome_medicamento.setLabel(gt("Nome Medicamento"));
		nome_medicamento.propertie().add("name","p_nome_medicamento").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		descricao_do_produto = new TextEditorField(model,"descricao_do_produto");
		descricao_do_produto.setLabel(gt("Descrição do Produto"));
		descricao_do_produto.propertie().add("name","p_descricao_do_produto").add("type","texteditor").add("maxlength","250000").add("required","true").add("readonly","false").add("disabled","false").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		preco_do_produto = new TextField(model,"preco_do_produto");
		preco_do_produto.setLabel(gt("Preço do Produto"));
		preco_do_produto.propertie().add("name","p_preco_do_produto").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		image = new FileField(model,"image");
		image.setLabel(gt("Imagem"));
		image.propertie().add("name","p_image").add("type","file").add("accept","image/*").add("targetrend","").add("multiple","false").add("rendvalue","false").add("maxlength","250").add("required","false").add("disabled","false").add("class","primary").add("desc","true");
		
		receita = new ListField(model,"receita");
		receita.setLabel(gt("Receita"));
		receita.propertie().add("name","p_receita").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","Receita « net_farma_app").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","").add("desc","true");
		
		estoque = new TextField(model,"estoque");
		estoque.setLabel(gt("Estoque"));
		estoque.propertie().add("name","p_estoque").add("type","text").add("maxlength","250").add("required","true").add("readonly","false").add("disabled","false").add("disablehtml","true").add("placeholder",gt("")).add("desclabel","false").add("desc","true");
		
		tipo_de_produto = new ListField(model,"tipo_de_produto");
		tipo_de_produto.setLabel(gt("Tipo de Produto"));
		tipo_de_produto.propertie().add("name","p_tipo_de_produto").add("type","select").add("multiple","false").add("tags","false").add("load_service_data","false").add("domain","Tipo de Produto « net_farma_app").add("maxlength","250").add("required","true").add("disabled","false").add("java-type","").add("desc","true");
		
		ativo = new CheckBoxField(model,"ativo");
		ativo.setLabel(gt("Ativo"));
		ativo.propertie().add("name","p_ativo").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","Integer").add("check","true").add("desc","true");
		
		ativo_check = new CheckBoxField(model,"ativo_check");
		ativo_check.propertie().add("name","p_ativo").add("type","checkbox").add("maxlength","250").add("required","false").add("readonly","false").add("disabled","false").add("java-type","Integer").add("check","true").add("desc","true");
		

		toolsbar_1 = new IGRPToolsBar("toolsbar_1");
		toolsbar_2 = new IGRPToolsBar("toolsbar_2");

		btn_registrar_produtos = new IGRPButton("Registrar Produtos","net_farma_app","Registrar_medicamento","registrar_produtos","_self","grey|fa-save","","");
		btn_registrar_produtos.propertie.add("type","specific").add("rel","registrar_produtos").add("refresh_components","");

		btn_listar_produtos = new IGRPButton("Listar Produtos","net_farma_app","Registrar_medicamento","listar_produtos","_self","grey|fa-list","","");
		btn_listar_produtos.propertie.add("type","specific").add("rel","listar_produtos").add("refresh_components","");

		btn_dashboard = new IGRPButton("Dashboard","net_farma_app","Registrar_medicamento","dashboard","_self","grey|fa-dashboard","","");
		btn_dashboard.propertie.add("type","specific").add("rel","dashboard").add("refresh_components","");

		btn_gravar = new IGRPButton("Gravar","net_farma_app","Registrar_medicamento","gravar","submit","success|fa-save","","");
		btn_gravar.propertie.add("type","specific").add("rel","gravar").add("refresh_components","");

		
	}
		
	@Override
	public void render(){
		

		sectionheader_1.addField(sectionheader_1_text);


		separatorlist_registrar.addField(nome_medicamento);
		separatorlist_registrar.addField(descricao_do_produto);
		separatorlist_registrar.addField(preco_do_produto);
		separatorlist_registrar.addField(image);
		separatorlist_registrar.addField(receita);
		separatorlist_registrar.addField(estoque);
		separatorlist_registrar.addField(tipo_de_produto);
		separatorlist_registrar.addField(ativo);
		separatorlist_registrar.addField(ativo_check);


		toolsbar_1.addButton(btn_registrar_produtos);
		toolsbar_1.addButton(btn_listar_produtos);
		toolsbar_1.addButton(btn_dashboard);
		toolsbar_2.addButton(btn_gravar);
		this.addToPage(sectionheader_1);
		this.addToPage(box_1);
		this.addToPage(separatorlist_registrar);
		this.addToPage(toolsbar_1);
		this.addToPage(toolsbar_2);
	}
		
	@Override
	public void setModel(Model model) {
		
		nome_medicamento.setValue(model);
		descricao_do_produto.setValue(model);
		preco_do_produto.setValue(model);
		image.setValue(model);
		receita.setValue(model);
		estoque.setValue(model);
		tipo_de_produto.setValue(model);
		ativo.setValue(model);	

		separatorlist_registrar.loadModel(((Registrar_medicamento) model).getSeparatorlist_registrar());
		}
}