package br.com.conexao;

import br.com.poo.classe.Aluno;
import br.com.poo.classe.Curso;
import br.com.poo.classe.Disciplina;
import br.com.poo.classe.Endereco;
import br.com.poo.classe.Professor;
import br.com.poo.classe.Turma;
import br.com.poo.classe.telascarregamento.telaErro;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ConexaoDAO {

    telaErro erro = new telaErro();
    
    private Session session;
    private Transaction tx;
    
    public void save(Object objeto) {

        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            session.save(objeto);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro "+e);
            JOptionPane.showMessageDialog(null, "Erro ao Salvar na Base de Dados!");
        }finally{
            session.close();
        }
    }

    public void persist(Object obj){
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            session.persist(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro "+e);
            JOptionPane.showMessageDialog(erro, erro.jLabel2);
        }finally{
            session.close();
        }
    }
    
    public void update(Object objeto) {
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            session.update(objeto);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro ao Atualizar no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar na Base de Dados!");
        }finally{
            session.close();
        }
    }

    public void save_update(Object obj){
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            session.saveOrUpdate(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro "+e);
            JOptionPane.showMessageDialog(erro, erro.jLabel2);
        }finally{
            session.close();
        }
    }
    
    public void delete(Object obj){
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            
            session.delete(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro "+e);
            JOptionPane.showMessageDialog(erro, erro.jLabel2);
        }finally{
            session.close();
        }
    }
    
    public void merge(Object obj){
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            session.merge(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro "+e);
            JOptionPane.showMessageDialog(erro, erro.jLabel2);
        }finally{
            session.close();
        }
    }
    
    public void refresh(Object obj){
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        try {
            session.refresh(obj);
            tx.commit();
            JOptionPane.showMessageDialog(null, "Atualizado com Sucesso!");
        } catch (Exception e) {
            System.out.println("Erro "+e);
            JOptionPane.showMessageDialog(erro, erro.jLabel2);
        }finally{
            session.close();
        }
    }
    
    public List<Aluno> listAluno() {
       
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        List<Aluno> list = null;
        
        try {
            list = (List<Aluno>) session.createQuery("from Aluno").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        }finally{
            session.close();
        }
        return null;
    }
    
    public List<Professor> ListProfessor() {
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        List<Professor> list = null;

        try {
            list = (List<Professor>) session.createQuery("from Professor").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }

    public List<Disciplina> ListDisciplinas() {
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        List<Disciplina> list = null;

        try {
            list = (List<Disciplina>) session.createQuery("from Disciplina").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }
    
    public List<Curso> ListCurso() {
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        List<Curso> list = null;

        try {
            list = (List<Curso>) session.createQuery("from Curso").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }
    
    public List<Turma> ListTurma() {
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        List<Turma> list = null;

        try {
            list = (List<Turma>) session.createQuery("from Turma").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }
    
    public List<Endereco> ListEndereco() {
        
        this.session = NewHibernateUtil.getSessionFactory().openSession();
        this.tx = session.beginTransaction();
        
        List<Endereco> list = null;

        try {
            list = (List<Endereco>) session.createQuery("from Endereco").list();
            tx.commit();
            return list;
        } catch (Exception e) {
            System.out.println("Erro ao Pegar lista no Banco de Dados!");
            JOptionPane.showMessageDialog(null, "Erro na Base de Dados!");
        } finally {
            session.close();
        }
        return null;
    }
    
}
