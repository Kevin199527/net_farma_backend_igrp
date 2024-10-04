package nosi.core.db.migration.igrp.postgres;

import nosi.core.db.migration.igrp.IgrpMigrationTemplate;
import nosi.webapps.igrp.dao.Action;
import nosi.webapps.igrp.dao.Application;
import nosi.webapps.igrp.dao.Config_env;
import nosi.webapps.igrp.dao.Domain;
import nosi.webapps.igrp.dao.Transaction;
import nosi.webapps.igrp.dao.DomainType;

/**
 * Nositeste
 * out. 04, 2024
 */
public class R__net_farma_app extends IgrpMigrationTemplate{

	@Override
	public void app() {
	  this.app = new Application("net_farma_app", "net_farma_app", "default.svg", "Uma Plataforma de Farmacia Online", 1, null,"",0);
	}

	@Override
	public void pages() {
	  this.actions.add(new Action("Pagina_de_detalhe_de_produto", "index", "nosi.webapps.net_farma_app.pages", "net_farma_app/pagina_de_detalhe_de_produto/Pagina_de_detalhe_de_produto.xsl", "Pagina de Detalhe de Produto", "Pagina de Detalhe de Produto", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Registrar_medicamento", "index", "nosi.webapps.net_farma_app.pages", "net_farma_app/registrar_medicamento/Registrar_medicamento.xsl", "Registrar Medicamento", "Registrar Medicamento", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Paginalistarproduto", "index", "nosi.webapps.net_farma_app.pages", "net_farma_app/paginalistarproduto/Paginalistarproduto.xsl", "PaginaListarProduto", "PaginaListarProduto", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Pagemenu", "index", "nosi.webapps.net_farma_app.pages", "net_farma_app/pagemenu/Pagemenu.xsl", "pageMenu", "pageMenu", "2.3", 1, this.app, (short)0, null, null, (short)0));
	  this.actions.add(new Action("Pagina_dashboard", "index", "nosi.webapps.net_farma_app.pages", "net_farma_app/pagina_dashboard/Pagina_dashboard.xsl", "Pagina Dashboard", "Pagina Dashboard", "2.3", 1, this.app, (short)0, null, null, (short)0));
	}

	@Override
	public void transactions() {
	  this.transactions.add(new Transaction("net_farma_app_Dashboards_toolsbar_1_button_1", "Registar medicamentos", 1, this.app));
	  this.transactions.add(new Transaction("net_farma_app_Pagedetalheproduto_concluir", "Concluir", 1, this.app));
	}

	@Override
	public void domains() {
	  this.domains.add(new Domain("Receita Medica", "", "", "ATIVE", 0, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Tipo de Produto", "Medicamento", "Medicamento", "ATIVE", 1, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Tipo de Produto", "Produto de Bebe", "Produto de Bebe", "ATIVE", 2, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Tipo de Produto", "Produto para Mãe", "Produto para Mãe", "ATIVE", 3, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Tipo de Produto", "Suplimentos", "Suplimentos", "ATIVE", 4, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Tipo de Produto", "Outros", "Outros", "ATIVE", 5, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Receita", "Sim", "Sim", "ATIVE", 1, DomainType.PRIVATE, this.app));
	  this.domains.add(new Domain("Receita", "Não", "Não", "ATIVE", 2, DomainType.PRIVATE, this.app));
	}

	@Override
	public void dbConnections() {
	  this.configs.add(new Config_env(null, "1", "org.hibernate.dialect.PostgreSQLDialect", "utf-8", "G6pC5Z/zvrwZsWyWjfO0RA==", "N/EwTHhbGGqWg6o5mrTlhA==", "goGcpkTAtr41hx4euvpaiQ==", "net_farma_app_postgresql_1", "rvDSR1rjREYbBKk7KybFLkNuiy8sacBkrIT9jGIQvI1yoVQaa7xWCP0NgB88Ypq8", "fDYSEiVw09DSlMzSTJUW6XvVluz2/lrAfVM3rchj8pc=", this.app, (short)1, "39d45223-39f1-42cd-b8c0-e10c82517fb7"));	}

	@Override
	public void reports() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void bpmns() {
		// Not implemented yet... Put your code here!
	}

	@Override
	public void documentTypes() {
		// Not implemented yet... Put your code here!
	}


	@Override
	public Integer getChecksum() {
		return 722545566;
	}

}