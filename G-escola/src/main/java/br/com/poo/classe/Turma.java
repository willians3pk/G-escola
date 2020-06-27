
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
@Table(name = "Turma")
public class Turma {
    
//----------------- Atributos -----------------   
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Codigo;
    
    private String nome;
    private String periodo;
    private String Ano;
    private String diaSemana;
    private String horarios;
    private String grade;
    private String dataInicio;
    private String dataFim;
    private String status;
    private String anoLetivo;
    private String descriçao;
    
    @ManyToOne(fetch = FetchType.EAGER)
    private Disciplina disciplina;
    
    @OneToMany(fetch = FetchType.EAGER)
    @Cascade({CascadeType.PERSIST,CascadeType.SAVE_UPDATE})
    private List<Aluno> aluno;
//------------- CONSTRUTORES -------------------
    
    public Turma() {
    }

    public Turma(String Ano, String diaSemana, String horarios, String grade, String dataInicio, String dataFim, String status, String anoLetivo, String periodo, String descriçao) {
        this.Ano = Ano;
        this.diaSemana = diaSemana;
        this.horarios = horarios;
        this.grade = grade;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.status = status;
        this.anoLetivo = anoLetivo;
        this.periodo = periodo;
        this.descriçao = descriçao;
    }

    public Turma(int Codigo, String Ano, String diaSemana, String horarios, List<Aluno> aluno) {
        this.Codigo = Codigo;
        this.Ano = Ano;
        this.diaSemana = diaSemana;
        this.horarios = horarios;
        this.aluno = aluno;
    }
    
//----------------------- Metados Getter e Setter -------------------------//

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public String getHorarios() {
        return horarios;
    }

    public void setHorarios(String horarios) {
        this.horarios = horarios;
    }

    public List<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(List<Aluno> aluno) {
        this.aluno = aluno;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFim() {
        return dataFim;
    }

    public void setDataFim(String dataFim) {
        this.dataFim = dataFim;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(String anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
    
// ------------------- METODOS --------------------------//    
    
    public void adicionarAluno(Aluno aluno){
        this.aluno.add(aluno);
    }
    
    public void removeAluno(Aluno aluno){
        this.aluno.remove(aluno);
    }
    
}
