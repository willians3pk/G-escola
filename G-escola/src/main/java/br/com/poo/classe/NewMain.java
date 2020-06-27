package br.com.poo.classe;

import br.com.conexao.ConexaoDAO;
import br.com.conexao.NewHibernateUtil;
import br.com.poo.classe.telascarregamento.Carregamento;
import br.com.poo.classe.telas.TelaPrincipal;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class NewMain {

    public static void main(String[] args) {
        Carregamento p = new Carregamento();
        p.setVisible(true);

        try {

            for (int i = 0; i <= 100; i++) {
                Thread.sleep(100);
                p.label.setText(Integer.toString(i) + "%");
                p.obj.setValue(i);

            }

        } catch (Exception e) {
            System.out.println(e);
        }

        new TelaPrincipal().setVisible(true);
        p.setVisible(false);
    }
}