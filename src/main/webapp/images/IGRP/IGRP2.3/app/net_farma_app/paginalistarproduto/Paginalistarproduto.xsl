<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/datatable/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><style>.toolsbar_1{  background: #ffffff;  border-block: solid;  writing-mode: horizontal-tb;}</style></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-be32af41"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item toolsbar_1" gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="toolsbar_1" item-name="toolsbar_1"><div class="btns-holder  pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if><xsl:if test="rows/content/tabela_de_produto"><div class="box box-table-contents gen-container-item " gen-class="" item-name="tabela_de_produto"><div class="box-body "><div class="table-contents-head"><div class="table-contents-inner"></div></div><div class="table-box"><div class="table-box-inner"><table id="tabela_de_produto" class="table table-striped  igrp-data-table IGRP_contextmenu " exports=""><thead><tr><xsl:if test="rows/content/tabela_de_produto/fields/imagem"><th td-name="imagem" style="text-align: left;" show-label="true" class="img  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tabela_de_produto/fields/imagem/label"/></span></th></xsl:if><xsl:if test="rows/content/tabela_de_produto/fields/nome_do_produto"><th td-name="nome_do_produto" style="text-align: left;" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tabela_de_produto/fields/nome_do_produto/label"/></span></th></xsl:if><xsl:if test="rows/content/tabela_de_produto/fields/descricao"><th td-name="descricao" style="text-align: left;" show-label="true" class="textarea  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tabela_de_produto/fields/descricao/label"/></span></th></xsl:if><xsl:if test="rows/content/tabela_de_produto/fields/preco"><th td-name="preco" style="text-align: left;" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tabela_de_produto/fields/preco/label"/></span></th></xsl:if><xsl:if test="rows/content/tabela_de_produto/fields/tipo_de_produto"><th td-name="tipo_de_produto" style="text-align: left;" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tabela_de_produto/fields/tipo_de_produto/label"/></span></th></xsl:if><xsl:if test="rows/content/tabela_de_produto/fields/receita"><th td-name="receita" style="text-align: left;" show-label="true" class="text  gen-fields-holder" group-in=""><span><xsl:value-of select="rows/content/tabela_de_produto/fields/receita/label"/></span></th></xsl:if><xsl:if test="rows/content/tabela_de_produto/table/context-menu/item"><th class="igrp-table-ctx-th"/></xsl:if></tr></thead><tbody><xsl:for-each select="rows/content/tabela_de_produto/table/value/row[not(@total='yes')]"><tr><xsl:apply-templates mode="context-param" select="context-menu"/><input type="hidden" name="p_id_list_fk" value="{id_list}"/><input type="hidden" name="p_id_list_fk_desc" value="{id_list_desc}"/><xsl:if test="imagem"><td style="text-align: left;" data-row="{position()}" data-title="{../../fields/imagem/label}" item-type="images" class="img" item-name="imagem"><img class="table-img   " name="p_imagem" src="{imagem}"/></td></xsl:if><xsl:if test="nome_do_produto"><td style="text-align: left;" data-order="{nome_do_produto}" data-row="{position()}" data-title="{../../../fields/nome_do_produto/label}" class="text" item-name="nome_do_produto"><span class=""><xsl:value-of select="nome_do_produto"/></span></td></xsl:if><xsl:if test="descricao"><td style="text-align: left;" data-order="{descricao}" data-row="{position()}" data-title="{../../../fields/descricao/label}" class="textarea" item-name="descricao"><span class=""><xsl:value-of select="descricao"/></span></td></xsl:if><xsl:if test="preco"><td style="text-align: left;" data-order="{preco}" data-row="{position()}" data-title="{../../../fields/preco/label}" class="text" item-name="preco"><span class=""><xsl:value-of select="preco"/></span></td></xsl:if><xsl:if test="tipo_de_produto"><td style="text-align: left;" data-order="{tipo_de_produto}" data-row="{position()}" data-title="{../../../fields/tipo_de_produto/label}" class="text" item-name="tipo_de_produto"><span class=""><xsl:value-of select="tipo_de_produto"/></span></td></xsl:if><xsl:if test="receita"><td style="text-align: left;" data-order="{receita}" data-row="{position()}" data-title="{../../../fields/receita/label}" class="text" item-name="receita"><span class=""><xsl:value-of select="receita"/></span></td></xsl:if><xsl:if test="//rows/content/tabela_de_produto/table/context-menu/item"><td class="igrp-table-ctx-td"><xsl:apply-templates select="../../context-menu" mode="table-context-inline"><xsl:with-param name="row-params" select="context-menu"/><xsl:with-param name="type" select="'inl'"/></xsl:apply-templates></td></xsl:if></tr></xsl:for-each></tbody></table></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/jquery.dataTables.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/datatable/dataTables.bootstrap.min.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/igrp.table.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/bootstrap-contextmenu.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/table/table.contextmenu.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=3"/><xsl:include href="../../../xsl/tmpl/IGRP-table-utils.tmpl.xsl?v=3"/></xsl:stylesheet>