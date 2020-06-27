
package br.com.poo.classe;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;


@Entity
@Table(name = "Aluno")
public class Aluno {

//------------ Atributos ----------------------- 
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int NumeroMatricula;
    
    private String Nome;
    private String Sexo;
    private String Cpf;
    private String Telefone;
    private String DataNascimento;
    private String Email;
    private double Notas;
    private byte Falta;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE})
    private Endereco endereco; 
    
    @ManyToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE})
    private Turma turma;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST, CascadeType.SAVE_UPDATE})
    private Curso curso;

//------------ CONSTRUTORES --------------------  

    public Aluno() {
    }
    
    
    public Aluno(String Nome, String Sexo, String Cpf) {
        setNome(Nome);
        setCpf(Sexo);
        setEmail(Cpf);
    }

    public Aluno(int NumeroMatricula, double Notas, Curso curso) {
        this.NumeroMatricula = NumeroMatricula;
        this.Notas = Notas;
        this.curso = curso;
    }
    
    public Aluno(String Nome, String Cpf, String telefone, String dataNascimento, String Email, Endereco endereco){
        this.Nome = Nome;
        this.Cpf =Cpf;
        this.Telefone = telefone;
        this.DataNascimento = dataNascimento;
        this.Email = Email;
        this.endereco = endereco;
    }
    
    public Aluno(int NumeroMatricula, String Nome, String Sexo, String Cpf, String Telefone, String DataNascimento, String Email, Endereco endereco, double Notas, byte Falta, Turma turma, Curso curso) {
        this.NumeroMatricula = NumeroMatricula;
        this.Nome = Nome;
        this.Sexo = Sexo;
        this.Cpf = Cpf;
        this.Telefone = Telefone;
        this.DataNascimento = DataNascimento;
        this.Email = Email;
        this.endereco = endereco;
        this.Notas = Notas;
        this.Falta = Falta;
        this.turma = turma;
        this.curso = curso;
    }
    
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public void setDataNascimento(String DataNascimento) {
        this.DataNascimento = DataNascimento;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

//----------------------- Metados Getter e Setter -------------------------//
    public void setEndereco(Endereco endereco) {    
        this.endereco = endereco;
    }

    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
    }

    public double getNotas() {
        return Notas;
    }

    public void setNotas(double Notas) {
        this.Notas = Notas;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public byte getFalta() {
        return Falta;
    }

    public void setFalta(byte Falta) {
        this.Falta = Falta;
    }

    public void setTurma(Turma turma){
        this.turma = turma;
    }
    
    public Turma getListTurma(){
        return turma;
    }
    
    /*
    // ------------------- METODOS --------------------------//
    
    public void adicionarDisciplina(Disciplina disciplina){
    this.disciplina.add(disciplina);
    }
    
    public void excluirDisciplina(Disciplina disciplina){
    this.disciplina.remove(disciplina);
    }
    
    public int quantidadeDisciplina(){
    return disciplina.size();
    }*/
    
    public void adicionarCurso(Curso curso){
        this.curso = curso;
    }
    
    public String pesquisarCurso(){
        return curso.dadosDoCurso();
    }
        
    public String dadosDoAluno(){
        return"Nome: "+this.getNome() + "\nCpf: "+this.getCpf() + "\nData Nascimento: "+this.getDataNascimento() +
                "\nSexo: "+this.getSexo()+ "\nTelefone: "+this.getTelefone() + "\nEmail: "+this.getEmail()+"\nCursando: "+this.curso.getNome()+"\n";
    }
    
    public String imprimir(){
        return "\n"+
                "Nome: "+this.getNome() + "\nCpf: "+this.getCpf() + "\nData Nascimento: "+this.getDataNascimento() +
                "\nSexo: "+this.getSexo()+ "\nTelefone: "+this.getTelefone() + "\nEmail: "+this.getEmail()+"\n "
                +"\n"+"Curso: "+this.curso.getNome()+"\nLista de alunos:"+"\n";
    }
    
    @Override
    public String toString() {
        return  "\n"+
                " Nome: "+this.getNome() + "\n Cpf: "+this.getCpf() + "\n Data Nascimento: "+this.getDataNascimento() +
                "\n Sexo: "+this.getSexo()+ "\n Telefone: "+this.getTelefone() + "\n Email: "+this.getEmail()+"\n "
                +"\n"+"\nDisciplina: "+"\n";
    }
    
    public void SalvarBlocoNotas(){
                
            String nomeDoArquivo = "Cadastros de Alunos"; // Nome do arquivo
            String caminhoDoArquivo = "C:\\Users\\" + System.getProperty("user.name").toString() + "\\Desktop\\" + nomeDoArquivo + ".txt";
            
            try {
                FileWriter Arquivo      = new FileWriter(caminhoDoArquivo, true);
                PrintWriter escrever    = new PrintWriter(Arquivo);
                
                escrever.println(super.toString()); // ESCREVE O CADASTRO NO ARQUIVO BLOCO NOTAS
                escrever.close();
                
            } catch (IOException ex) {
                //Logger.getLogger(Cadastro.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

}

