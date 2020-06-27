
package br.com.poo.classe;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Disciplina")
public class Disciplina {

//------------- Atributos ----------------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    private String Nome;
    private String descricao;
    private String CargahorariaDisci;
    private String sigla;
    private String avaliacao;
    private String conceitoNota;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Curso  curso;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Professor professor;
    
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
    private List<Turma> turma;
    
//------------- CONSTRUTORES -------------------

    public Disciplina() {
        
    }

    public Disciplina(String Nome, String descricao, String CargahorariaDisci, String sigla, String avaliacao, String conceitoNota) {
        this.Nome = Nome;
        this.descricao = descricao;
        this.CargahorariaDisci = CargahorariaDisci;
        this.sigla = sigla;
        this.avaliacao = avaliacao;
        this.conceitoNota = conceitoNota;
    }
    
//----------------------- Metados Getter e Setter -------------------------
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCargahorariaDisci() {
        return CargahorariaDisci;
    }

    public void setCargahorariaDisci(String CargahorariaDisci) {
        this.CargahorariaDisci = CargahorariaDisci;
    } 

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<Turma> getTurma() {
        return turma;
    }

    public void setTurma(List<Turma> turma) {
        this.turma = turma;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

    public String getConceitoNota() {
        return conceitoNota;
    }

    public void setConceitoNota(String conceitoNota) {
        this.conceitoNota = conceitoNota;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
// ------------------- METODOS --------------------------//
    
    public Curso removeCurso(){
        return this.finalize(curso);
    }
    
    public void adicionarTurma(Turma turma){
        this.turma.add(turma);
    }
    
    /*public void adicionarAluno(Aluno aluno){
    this.aluno.add(aluno);
    }
    
    public void excluirAluno(Aluno aluno){
    this.aluno.remove(aluno);
    }
    
    public int quantidadeAluno(){
    return aluno.size();
    }
    
    public String PesquisarAlunos(Aluno alu){
    if(aluno.contains(alu)){
    return alu.dadosDoAluno();
    }
    return "Aluno não Encontrado!!";
    }
    
    public String buscarPorNome(String alu){
    String busca = alu;
    for (int i = 0; i < aluno.size(); i++) {
    if(aluno.get(i).getNome().contains(busca)){
    return aluno.get(i).dadosDoAluno();
    }
    }
    
    return "Aluno Não encontrado";
    }*/
    
    public String imprimir(){
        return "\nNome da Disciplina: " + Nome + "\nNota: " + descricao + "\nCargahorariaDisci: " + CargahorariaDisci+
                "\nLista de Alunos: "+"\n";
    }
    
    @Override
    public String toString() {
        return "\nNome: " + Nome + "\nDescricao: " + descricao + "\nCargahorariaDisci: " + CargahorariaDisci+ 
                "\nCurso: "+ curso.getNome();
    }

    private Curso finalize(Curso curso) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
