
package br.com.poo.classe;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name = "Professor")
public class Professor {
    
//----------------- Atributos -----------------
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int NumeroMatricula;
    private String Nome;
    private String Sexo;
    private String Cpf;
    private String Telefone;
    private String DataNascimento;
    private String Email;
    private int CargaHorariaProf;
    
    @OneToOne(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private Endereco endereco;
    
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade(CascadeType.ALL)
    private List<Disciplina> disciplina;
    
//------------- CONSTRUTORES -------------------

    public Professor() {
        
    }

    public Professor(List<Disciplina> disciplina, int CargaHorariaProf) {
        this.disciplina = disciplina;
        this.CargaHorariaProf = CargaHorariaProf;
    }
    
    public int getNumeroMatricula() {
        return NumeroMatricula;
    }

    public void setNumeroMatricula(int NumeroMatricula) {
        this.NumeroMatricula = NumeroMatricula;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

//-------------------- Metados Getter e Setter -------------------------------//
    
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(List<Disciplina> disciplina) {
        this.disciplina = disciplina;
    }
    
    public int getCargaHorariaProf() {
        return CargaHorariaProf;
    }

    public void setCargaHorariaProf(int CargaHorariaProf) {
        this.CargaHorariaProf = CargaHorariaProf;
    }

    
    //------------------ Metados Getter e Setter -----------------------------//

    public void adicionarDisciplinas(Disciplina disc1,Disciplina disc2,Disciplina disc3){
        this.disciplina.add(disc1);
        this.disciplina.add(disc2);
        this.disciplina.add(disc3);
    }
    
    public void adicionaDisciplina(Disciplina disciplina){
        this.disciplina.add(disciplina);
    }
    
    public void excluirDisciplina(Disciplina disciplina){
        this.disciplina.remove(disciplina);
    }
    

    public String dadosDoProfessor(){
        return  "------------------------- PROFESSOR -----------------------\n"+
                "Nome: "+this.getNome()+ "\nCpf: "+this.getCpf()+"\nData Nascimento: "+this.getDataNascimento()+
                "\nSexo: "+this.getSexo()+"\nE-mail: "+this.getEmail()+"\nContato: "+this.getTelefone()+"\n";
    }
    
    public String imprimir(){
        return  "------------------------- PROFESSOR -----------------------\n"+
                "Nome: "+this.getNome()+ "\nCpf: "+this.getCpf()+"\nData Nascimento: "+this.getDataNascimento()+
                "\nSexo: "+this.getSexo()+"\nE-mail: "+this.getEmail()+"\nContato: "+this.getTelefone()+"\n"+this.disciplina+"\n";
    }

    @Override
    public String toString() {
        return  "------------------------- PROFESSOR -----------------------\n"
                +"Professor: "+this.getNome()+ "\ndisciplina: " + disciplina + "\nCargaHorariaProf: " + CargaHorariaProf + "\ncurso: "+"\n"
                +"-----------------------------------------------------------\n";    
    }

    public void SalvarBlocoNotas() {
                     
            String nomeDoArquivo = "Cadastros de Professores"; // Nome do arquivo
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
