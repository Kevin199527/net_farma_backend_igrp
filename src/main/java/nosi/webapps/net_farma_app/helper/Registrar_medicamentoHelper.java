package nosi.webapps.net_farma_app.helper;

import nosi.core.webapp.Core;
import nosi.core.webapp.business.IgrpPageHelper;
import nosi.webapps.net_farma_app.dao.TblMedicamentos;
import nosi.webapps.net_farma_app.pages.registrar_medicamento.Registrar_medicamento;
import nosi.webapps.net_farma_app.pages.registrar_medicamento.Registrar_medicamentoView;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Arrays;

public class Registrar_medicamentoHelper extends IgrpPageHelper<Registrar_medicamento, Registrar_medicamentoView> {

protected Registrar_medicamentoHelper(Session session, Registrar_medicamento model, Registrar_medicamentoView view) {
        super(session, model, view);
        // TODO Auto-generated constructor stub
        }

public static Registrar_medicamentoHelper with(Session session, Registrar_medicamento model, Registrar_medicamentoView view) {
        return new Registrar_medicamentoHelper(session, model, view);
	}

public static Registrar_medicamentoHelper with(Session session, Registrar_medicamento model) {
        return new Registrar_medicamentoHelper(session, model,null);
	}

    public void registerMedicamento(){
        Session session = null;  // Declara um objeto Session, inicialmente nulo.
        Transaction transaction = null;  // Declara um objeto Transaction, inicialmente nulo.
        Integer userId = Core.getCurrentUser().getId();  // Obtém o ID do usuário atual.

        try{
            session = Core.getSession(Core.defaultConnection());
            transaction = session.beginTransaction();

            for (Registrar_medicamento.Separatorlist_registrar row : model.getSeparatorlist_registrar()){
                TblMedicamentos entityMedicamentos = new TblMedicamentos();
                        entityMedicamentos.setNome(row.getNome_medicamento().getKey());
                        entityMedicamentos.setDescricao(row.getDescricao_do_produto().getKey());
                        entityMedicamentos.setPreco(row.getPreco_do_produto().getKey());
                        entityMedicamentos.setReceita(row.getReceita().getKey());
                        entityMedicamentos.setEstoques(Core.toInt(row.getEstoque().getKey()));
                        entityMedicamentos.setTipoDeProduto(row.getTipo_de_produto().getKey());
                        entityMedicamentos.setImagemUrl(row.getImage().getKey());

                        session.persist(entityMedicamentos);

                        if (entityMedicamentos != null && !entityMedicamentos.hasError()){
                            Core.setMessageSuccess("Produto Registrado com Sucesso!");
                        }else {
                            Core.setMessageError("Erro ao registrar o Produto!");
                        }
            }
            transaction.commit();
        }catch (Exception error){
            Core.setMessageError(error.getMessage());
        }
    }

}