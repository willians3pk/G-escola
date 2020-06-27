package br.com.poo.classe;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Curso")
public class Curso {

// ----------------- Atributos -------------------- //
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    
    private String Nome;
    private String CargaHoraria;
    private String duracao;
    private String Semestres;
    private String sigla;
    private String turno;
    private String situacao;
    private String discricao;

    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
    private List<Disciplina> disciplina;
    
//------------- CONSTRUTORES -------------------
    
    public Curso() {

    }

    public Curso(String Nome, String CargaHoraria, String duracao, String Semestres, ArrayList<Disciplina> disciplina, ArrayList<Professor> professor, ArrayList<Aluno> aluno, long NumeroMatricula) {
        this.Nome = Nome;
        this.CargaHoraria = CargaHoraria;
        this.duracao = duracao;
        this.Semestres = Semestres;
        this.disciplina = disciplina;
    }
//--------------- Metados Getter e Setter ------------------------------------//

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(String CargaHoraria) {
        this.CargaHoraria = CargaHoraria;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSemestres() {
        return Semestres;
    }

    public void setSemestres(String Semestres) {
        this.Semestres = Semestres;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getDiscricao() {
        return discricao;
    }

    public void setDiscricao(String discricao) {
        this.discricao = discricao;
    }

// ------------------- METODOS CRIADOS DE ARRAYLIST<> -------------------------//
    /*/*public void excluirAluno(Aluno a) {
    this.aluno.remove(a);
    }
    
    public void matricularAluno(Aluno a){
    this.aluno.add(a);
    }
    
    public int quantidadeAluno(){
    return aluno.size();
    }
    
    public String pesquisarAluno(Aluno a){
    if(aluno.contains(a)){
    return a.imprimir();
    }
    return "Aluno nao Encontrado!!";
    }
    
    public String buscaPorDadosAluno(String nomeAluno){
        
        String buscarPor = nomeAluno;
        try {
            // ---------- PESQQUISAR POR NOME ----------
            for (int i = 0; i < aluno.size(); i++) {
                if(aluno.get(i).getNome().contains(buscarPor)){
                    return aluno.get(i).dadosDoAluno();
                }
            }// ---------- PESQQUISAR POR CPF ----------
            for (int i = 0; i < aluno.size(); i++) {
                if(aluno.get(i).getCpf().contains(buscarPor)){
                    return aluno.get(i).dadosDoAluno();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "Aluno nao Encontrado!!";
    }*/
// ------------------- PROFESSORES ------------------------- //  
    /*public void adicionarProfessor(Professor prof){
    this.professor.add(prof);
    }
    
    public void excluirProfessor(Professor prof){
    this.professor.remove(prof);
    }
    
    public int quantidadeProfessores(){
    return professor.size();
    }
    
    public String pesquisaProfessor(Professor prof){
    if(professor.contains(prof)){
    return prof.dadosDoProfessor();
    };return "Professor nao encontrado!!";
    }
    
    public String buscarPorDadosProfessor(String nomeProfessor){
    String busca = nomeProfessor;
    try {
    // ---------- PESQUISAR POR NOME ------------
    for (int i = 0; i < professor.size(); i++) {
    if(professor.get(i).getNome().contains(busca)){
    return professor.get(i).dadosDoProfessor();
    }
    }// ---------PESQUISAR POR CPF ---------------
    for (int i = 0; i < professor.size(); i++) {
    if(professor.get(i).getCpf().contains(busca)){
    return professor.get(i).dadosDoProfessor();
    }
    }
    } catch (Exception e) {
    System.out.println(e.getMessage());
    }
    return "Professor nao encontrado";
    }*/
    public void adicionarDisciplina(Disciplina disc) {
        this.disciplina.add(disc);
    }

    public void excluirDisciplina(Disciplina disc) {
        this.disciplina.remove(disc);
    }

    public int quantidadeDisciplina() {
        return disciplina.size();
    }

    public void excluirDisciplinas(Disciplina dis1, Disciplina dis2, Disciplina dis3, Disciplina dis4) {
        this.disciplina.remove(dis1);
        this.disciplina.remove(dis2);
        this.disciplina.remove(dis3);
        this.disciplina.remove(dis4);
    }

    public String dadosDoCurso() {
        return "Curso: " + Nome + "\nCargaHoraria: " + CargaHoraria + "\nduracao: " + duracao + "\nSemestres: "
                + Semestres + "\n";
    }

    public String imprimir() {
        return "Curso: " + Nome + "\nCargaHoraria: " + CargaHoraria + "\nduracao: " + duracao + "\nSemestres: "
                + Semestres + "\nDisciplinas: " + this.disciplina + "\nlistAluno: " + "\n";
    }

    @Override
    public String toString() {
        return "------------------------- Curso ----------------------------\n"
                +"Id: "+ Id +"\nNome: " + Nome + "\nCargaHoraria: " + CargaHoraria + "\nduracao: " + duracao + "\nSemestres: "
                + Semestres + "\ndisciplinas: "+disciplina+"\n"
                +"-----------------------------------------------------------\n";
    }

    public void Salvar() {

        String nomeDoArquivo = "Cadastro de Curso"; // Nome do arquivo
        String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoArquivo + ".txt";

        try {
            FileWriter Arquivo = new FileWriter(caminhoDoArquivo, true);
            PrintWriter escrever = new PrintWriter(Arquivo);

            escrever.println(Curso.class.toString()); // Escreve a lista de alunos no Arquivo
            escrever.close();

        } catch (IOException ex) {
            //Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
