<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0"><xsl:output method="html" omit-xml-declaration="yes" encoding="utf-8" indent="yes" doctype-system="about:legacy-compat"/><xsl:template match="/"><html><head><xsl:call-template name="IGRP-head"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/toolsbar/toolsbar.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/separatorlist/igrp.separatorlist.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/igrp.tables.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/core/igrp/table/dataTables.bootstrap.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.min.css?v={$version}"/><link rel="stylesheet" type="text/css" href="{$path}/plugins/select2/select2.style.css?v={$version}"/><style>.toolsbar_1{  background: #ffffff;  border-block: solid;  writing-mode: horizontal-tb;}</style></head><body class="{$bodyClass} sidebar-off"><xsl:call-template name="IGRP-topmenu"/><form method="POST" class="IGRP-form" name="formular_default" enctype="multipart/form-data"><div class="container-fluid"><div class="row"><xsl:call-template name="IGRP-sidebar"/><div class="col-sm-9 col-md-10 col-md-offset-2 col-sm-offset-3 main" id="igrp-contents"><div class="content"><div class="row row-msg"><div class="gen-column col-md-12"><div class="gen-inner"><xsl:apply-templates mode="igrp-messages" select="rows/content/messages"/></div></div></div><div class="row " id="row-d8908199"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/toolsbar_1"><div class="toolsbar-holder default gen-container-item toolsbar_1" gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="toolsbar_1" item-name="toolsbar_1"><div class="btns-holder  pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_1" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div><div class="row " id="row-1b3d0e4b"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/sectionheader_1"><section class="content-header gen-container-item " gen-class="" item-name="sectionheader_1"><h2 class="disable-output-escaping"><xsl:value-of disable-output-escaping="yes" select="rows/content/sectionheader_1/fields/sectionheader_1_text/value"/></h2></section></xsl:if></div></div></div><div class="row " id="row-73e835aa"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/box_1"><div class="box igrp-box-holder gen-container-item " gen-class="" item-name="box_1"><div class="box-body" gen-preserve-content="true"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/box_1/fields"/><div><div class="row " id="row-0d02e19f"><div class="gen-column col-sm-12"><div class="gen-inner"><xsl:if test="rows/content/separatorlist_registrar"><div class="box gen-container-item " id="separatorlist1727960662853" gen-class="" item-name="separatorlist_registrar"><div class="box-body IGRP-separatorlist" tag="separatorlist_registrar" dialog="false"><xsl:if test="rows/content/separatorlist_registrar/@noedit and rows/content/separatorlist_registrar/@noedit = 'true'"><xsl:attribute name="noedt"><xsl:value-of select="rows/content/separatorlist_registrar/@noedit"/></xsl:attribute></xsl:if><xsl:if test="rows/content/separatorlist_registrar/@noadd and rows/content/separatorlist_registrar/@noadd = 'true'"><xsl:attribute name="noadd"><xsl:value-of select="rows/content/separatorlist_registrar/@noadd"/></xsl:attribute></xsl:if><xsl:if test="rows/content/separatorlist_registrar/@nodelete and rows/content/separatorlist_registrar/@nodelete = 'true'"><xsl:attribute name="nodel"><xsl:value-of select="rows/content/separatorlist_registrar/@nodelete"/></xsl:attribute></xsl:if><div class="splist-form-holder"><xsl:if test="(not(rows/content/separatorlist_registrar/@noadd) or rows/content/separatorlist_registrar/@noadd != 'true')"><div class="splist-form" role="form"><xsl:apply-templates mode="form-hidden-fields" select="rows/content/separatorlist_registrar/fields"/><xsl:if test="rows/content/separatorlist_registrar/fields/nome_medicamento"><div class="form-group col-sm-4   gen-fields-holder" item-name="nome_medicamento" item-type="text"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/separatorlist_registrar/fields/nome_medicamento"/><label for="{rows/content/separatorlist_registrar/fields/nome_medicamento/@name}"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/nome_medicamento/label"/></span></label><input type="text" value="{rows/content/separatorlist_registrar/fields/nome_medicamento/value}" class="form-control  " inputmask="" id="{rows/content/separatorlist_registrar/fields/nome_medicamento/@name}" name="{rows/content/separatorlist_registrar/fields/nome_medicamento/@name}" disablehtml="true" placeholder="{rows/content/separatorlist_registrar/fields/nome_medicamento/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/nome_medicamento"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/descricao_do_produto"><div class="form-group col-sm-12  gen-fields-holder" item-name="descricao_do_produto" item-type="texteditor" required="required"><label><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/descricao_do_produto/label"/></span></label><textarea id="separatorlist_registrar_descricao_do_produto" name="{rows/content/separatorlist_registrar/fields/descricao_do_produto/@name}" class="gen-texteditor " required="required"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/descricao_do_produto"/></xsl:call-template><xsl:value-of select="rows/content/separatorlist_registrar/fields/descricao_do_produto/value" disable-output-escaping="yes"/></textarea><script type="text/javascript"></script></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/preco_do_produto"><div class="form-group col-sm-2   gen-fields-holder" item-name="preco_do_produto" item-type="text"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/separatorlist_registrar/fields/preco_do_produto"/><label for="{rows/content/separatorlist_registrar/fields/preco_do_produto/@name}"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/preco_do_produto/label"/></span></label><input type="text" value="{rows/content/separatorlist_registrar/fields/preco_do_produto/value}" class="form-control  " inputmask="" id="{rows/content/separatorlist_registrar/fields/preco_do_produto/@name}" name="{rows/content/separatorlist_registrar/fields/preco_do_produto/@name}" disablehtml="true" placeholder="{rows/content/separatorlist_registrar/fields/preco_do_produto/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/preco_do_produto"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/image"><div class="form-group col-sm-2  gen-fields-holder" item-name="image" item-type="file"><label for="{rows/content/separatorlist_registrar/fields/image/@name}"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/image/label"/></span></label><div class="input-group"><input type="text" class="form-control not-form" readonly=""><xsl:if test="rows/content/separatorlist_registrar/fields/image/@temp-value"><xsl:attribute name="value"><xsl:value-of select="rows/content/separatorlist_registrar/fields/image/@temp-value"/></xsl:attribute></xsl:if></input><span class="input-group-btn"><span class="btn btn-primary file-btn-holder"><i class="fa fa-upload"/><input id="{rows/content/separatorlist_registrar/fields/image/@name}" name="{rows/content/separatorlist_registrar/fields/image/@name}" value="{rows/content/separatorlist_registrar/fields/image/value}" target-rend="" class="transparent " type="file" accept="image/*"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/image"/></xsl:call-template></input></span></span></div></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/receita"><div class="col-sm-1 form-group  gen-fields-holder" item-name="receita" item-type="select"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/separatorlist_registrar/fields/receita"/><label for="{rows/content/separatorlist_registrar/fields/receita/@name}"><xsl:value-of select="rows/content/separatorlist_registrar/fields/receita/label"/></label><select class="form-control select2  " id="{rows/content/separatorlist_registrar/fields/receita/@name}" name="{rows/content/separatorlist_registrar/fields/receita/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/receita"/></xsl:call-template><xsl:for-each select="rows/content/separatorlist_registrar/fields/receita/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/estoque"><div class="form-group col-sm-2   gen-fields-holder" item-name="estoque" item-type="text"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/separatorlist_registrar/fields/estoque"/><label for="{rows/content/separatorlist_registrar/fields/estoque/@name}"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/estoque/label"/></span></label><input type="text" value="{rows/content/separatorlist_registrar/fields/estoque/value}" class="form-control  " inputmask="" id="{rows/content/separatorlist_registrar/fields/estoque/@name}" name="{rows/content/separatorlist_registrar/fields/estoque/@name}" disablehtml="true" placeholder="{rows/content/separatorlist_registrar/fields/estoque/@placeholder}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/estoque"/></xsl:call-template></input></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/tipo_de_produto"><div class="col-sm-3 form-group  gen-fields-holder" item-name="tipo_de_produto" item-type="select"><xsl:apply-templates mode="setRequiredAttribute" select="rows/content/separatorlist_registrar/fields/tipo_de_produto"/><label for="{rows/content/separatorlist_registrar/fields/tipo_de_produto/@name}"><xsl:value-of select="rows/content/separatorlist_registrar/fields/tipo_de_produto/label"/></label><select class="form-control select2  " id="{rows/content/separatorlist_registrar/fields/tipo_de_produto/@name}" name="{rows/content/separatorlist_registrar/fields/tipo_de_produto/@name}" placeholder=""><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/tipo_de_produto"/></xsl:call-template><xsl:for-each select="rows/content/separatorlist_registrar/fields/tipo_de_produto/list/option"><option value="{value}" label="{text}"><xsl:if test="@selected='true'"><xsl:attribute name="selected">selected</xsl:attribute></xsl:if><span><xsl:value-of select="text"/></span></option></xsl:for-each></select></div></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/ativo"><div class="col-sm-2  gen-fields-holder" item-name="ativo" item-type="checkbox"><div class="form-group"><div class="checkbox form-check-offset"><label class="container-box "><xsl:value-of select="rows/content/separatorlist_registrar/fields/ativo/label"/><input type="checkbox" name="{rows/content/separatorlist_registrar/fields/ativo/@name}" value="1" class="checkbox " label="{rows/content/separatorlist_registrar/fields/ativo/label}"><xsl:call-template name="setAttributes"><xsl:with-param name="field" select="rows/content/separatorlist_registrar/fields/ativo"/></xsl:call-template><xsl:if test="rows/content/separatorlist_registrar/fields/ativo/value = '1'"><xsl:attribute name="checked">checked</xsl:attribute></xsl:if></input><span class="slider round"/><span class="checkmark"/></label></div></div></div></xsl:if></div></xsl:if></div><div class="table-box box-body box-table-contents splist-table"><table rel="T_separatorlist_registrar" id="separatorlist_registrar" class="table  table-striped gen-data-table"><thead><tr><xsl:if test="rows/content/separatorlist_registrar/fields/nome_medicamento"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/nome_medicamento/@visible)"><th style="text-align: ;" item-name="nome_medicamento"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/nome_medicamento/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/descricao_do_produto"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/descricao_do_produto/@visible)"><th style="text-align: ;" item-name="descricao_do_produto"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/descricao_do_produto/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/preco_do_produto"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/preco_do_produto/@visible)"><th style="text-align: ;" item-name="preco_do_produto"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/preco_do_produto/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/image"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/image/@visible)"><th style="text-align: ;" item-name="image"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/image/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/receita"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/receita/@visible)"><th style="text-align: ;" item-name="receita"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/receita/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/estoque"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/estoque/@visible)"><th style="text-align: ;" item-name="estoque"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/estoque/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/tipo_de_produto"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/tipo_de_produto/@visible)"><th style="text-align: ;" item-name="tipo_de_produto"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/tipo_de_produto/label"/></span></th></xsl:if></xsl:if><xsl:if test="rows/content/separatorlist_registrar/fields/ativo"><xsl:if test="not(//rows/content/separatorlist_registrar/fields/ativo/@visible)"><th style="text-align: ;" item-name="ativo"><span><xsl:value-of select="rows/content/separatorlist_registrar/fields/ativo/label"/></span></th></xsl:if></xsl:if><th class="table-btn"><xsl:if test="(not(rows/content/separatorlist_registrar/@noadd) or rows/content/separatorlist_registrar/@noadd != 'true')"><a class="table-row-add btn-xs btn btn-primary" title="Add" data-toggle="tooltip" data-placement="left"><i class="fa fa-plus"/></a></xsl:if></th></tr></thead><tbody><xsl:for-each select="rows/content/separatorlist_registrar/table/value/row"><tr><input type="hidden" class="sl-row-id" name="p_separatorlist_registrar_id" value="{separatorlist_registrar_id}"/><xsl:apply-templates mode="form-hidden-fields" select="."/><xsl:if test="nome_medicamento"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/nome_medicamento/@visible)"><td field="nome_medicamento" data-row="{position()}" data-title="{../../../fields/nome_medicamento/label}" class="text" item-name="nome_medicamento"><span class="separator-list-td-val"><xsl:value-of select="nome_medicamento_desc"/></span><input type="hidden" name="p_nome_medicamento_fk" value="{nome_medicamento}"/><input type="hidden" name="p_nome_medicamento_fk_desc" value="{nome_medicamento_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_nome_medicamento_fk" value="{nome_medicamento}"/><input type="hidden" name="p_nome_medicamento_fk_desc" value="{nome_medicamento_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="descricao_do_produto"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/descricao_do_produto/@visible)"><td field="descricao_do_produto" data-row="{position()}" data-title="{../../../fields/descricao_do_produto/label}" class="texteditor" item-name="descricao_do_produto"><span class="separator-list-td-val"><xsl:value-of select="descricao_do_produto_desc"/></span><input type="hidden" name="p_descricao_do_produto_fk" value="{descricao_do_produto}"/><input type="hidden" name="p_descricao_do_produto_fk_desc" value="{descricao_do_produto_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_descricao_do_produto_fk" value="{descricao_do_produto}"/><input type="hidden" name="p_descricao_do_produto_fk_desc" value="{descricao_do_produto_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="preco_do_produto"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/preco_do_produto/@visible)"><td field="preco_do_produto" data-row="{position()}" data-title="{../../../fields/preco_do_produto/label}" class="text" item-name="preco_do_produto"><span class="separator-list-td-val"><xsl:value-of select="preco_do_produto_desc"/></span><input type="hidden" name="p_preco_do_produto_fk" value="{preco_do_produto}"/><input type="hidden" name="p_preco_do_produto_fk_desc" value="{preco_do_produto_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_preco_do_produto_fk" value="{preco_do_produto}"/><input type="hidden" name="p_preco_do_produto_fk_desc" value="{preco_do_produto_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="image"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/image/@visible)"><td data-row="{position()}" data-title="{../../fields/image/label}" class="file" item-name="image"><xsl:choose><xsl:when test="image != ''"><a href="{image}" class="link bClick" target="_blank" name="image"><xsl:value-of select="image_desc"/></a></xsl:when><xsl:otherwise><xsl:value-of select="image_desc"/></xsl:otherwise></xsl:choose><input type="hidden" name="p_image_fk" value="{image}"/><input type="hidden" name="p_image_fk_desc" value="{image_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_image_fk" value="{image}"/><input type="hidden" name="p_image_fk_desc" value="{image_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="receita"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/receita/@visible)"><td field="receita" data-row="{position()}" data-title="{../../../fields/receita/label}" class="select" item-name="receita"><span class="separator-list-td-val"><xsl:value-of select="receita_desc"/></span><input type="hidden" name="p_receita_fk" value="{receita}"/><input type="hidden" name="p_receita_fk_desc" value="{receita_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_receita_fk" value="{receita}"/><input type="hidden" name="p_receita_fk_desc" value="{receita_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="estoque"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/estoque/@visible)"><td field="estoque" data-row="{position()}" data-title="{../../../fields/estoque/label}" class="text" item-name="estoque"><span class="separator-list-td-val"><xsl:value-of select="estoque_desc"/></span><input type="hidden" name="p_estoque_fk" value="{estoque}"/><input type="hidden" name="p_estoque_fk_desc" value="{estoque_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_estoque_fk" value="{estoque}"/><input type="hidden" name="p_estoque_fk_desc" value="{estoque_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="tipo_de_produto"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/tipo_de_produto/@visible)"><td field="tipo_de_produto" data-row="{position()}" data-title="{../../../fields/tipo_de_produto/label}" class="select" item-name="tipo_de_produto"><span class="separator-list-td-val"><xsl:value-of select="tipo_de_produto_desc"/></span><input type="hidden" name="p_tipo_de_produto_fk" value="{tipo_de_produto}"/><input type="hidden" name="p_tipo_de_produto_fk_desc" value="{tipo_de_produto_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_tipo_de_produto_fk" value="{tipo_de_produto}"/><input type="hidden" name="p_tipo_de_produto_fk_desc" value="{tipo_de_produto_desc}"/></xsl:otherwise></xsl:choose></xsl:if><xsl:if test="ativo"><xsl:choose><xsl:when test="not(//rows/content/separatorlist_registrar/fields/ativo/@visible)"><td field="ativo" data-row="{position()}" data-title="{../../../fields/ativo/label}" class="checkbox" item-name="ativo"><span class="separator-list-td-val"><xsl:value-of select="ativo_desc"/></span><input type="hidden" name="p_ativo_fk" value="{ativo}"/><input type="hidden" name="p_ativo_fk_desc" value="{ativo_desc}"/></td></xsl:when><xsl:otherwise><input type="hidden" name="p_ativo_fk" value="{ativo}"/><input type="hidden" name="p_ativo_fk_desc" value="{ativo_desc}"/></xsl:otherwise></xsl:choose></xsl:if><td data-row="{position()}" class="table-btn"><xsl:if test="not(//rows/content/separatorlist_registrar/@noedit) or //rows/content/separatorlist_registrar/@noedit != 'true'"><span class="table-row-undo btn btn-info d-none" rel="separatorlist_registrar" title="Undo" data-toggle="tooltip" data-placement="left"><i class="fa fa-undo"/></span><span class="table-row-edit btn btn-warning " rel="separatorlist_registrar" title="Edit" data-toggle="tooltip" data-placement="left"><i class="fa fa-pencil"/></span></xsl:if><xsl:if test="not(//rows/content/separatorlist_registrar/@nodelete) or //rows/content/separatorlist_registrar/@nodelete != 'true'"><span class="table-row-remove btn btn-danger" rel="separatorlist_registrar" title="Remove" data-toggle="tooltip" data-placement="right"><i class="fa fa-times"/></span></xsl:if></td></tr></xsl:for-each></tbody></table></div></div></div></xsl:if><xsl:if test="rows/content/toolsbar_2"><div class="toolsbar-holder default gen-container-item " gen-structure="toolsbar" gen-fields=".btns-holder&gt;a.btn" gen-class="" item-name="toolsbar_2"><div class="btns-holder   pull-right" role="group"><xsl:apply-templates select="rows/content/toolsbar_2" mode="gen-buttons"><xsl:with-param name="vertical" select="'true'"/><xsl:with-param name="outline" select="'false'"/></xsl:apply-templates></div></div></xsl:if></div></div></div></div></div></div></xsl:if></div></div></div></div></div></div></div><xsl:call-template name="IGRP-bottom"/></form><script type="text/javascript" src="{$path}/plugins/separatorlist/igrp.separatorlist.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/form/igrp.forms.js?v={$version}"/><script type="text/javascript" src="{$path}/core/igrp/components/list-association/igrp.list.association.1.1.js?v={$version}"/><script type="text/javascript" src="{$path}/core/ckeditor/ckeditor.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.full.min.js?v={$version}"/><script type="text/javascript" src="{$path}/plugins/select2/select2.init.js?v={$version}"/></body></html></xsl:template><xsl:include href="../../../xsl/tmpl/IGRP-functions.tmpl.xsl?v=9"/><xsl:include href="../../../xsl/tmpl/IGRP-variables.tmpl.xsl?v=9"/><xsl:include href="../../../xsl/tmpl/IGRP-home-include.tmpl.xsl?v=9"/><xsl:include href="../../../xsl/tmpl/IGRP-utils.tmpl.xsl?v=9"/><xsl:include href="../../../xsl/tmpl/IGRP-form-utils.tmpl.xsl?v=9"/></xsl:stylesheet>