
package br.com.poo.classe;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Endereco")
public class Endereco {
//------------Atributos

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;
    private String Rua;
    private String Bairro;
    private String Cidade;
    private String Estado;
    private String NumeroCasa;

    public Endereco() {
    }

    public Endereco( String Rua, String Bairro, String Cidade, String Estado, String NumeroCasa) {
        this.Rua = Rua;
        this.Bairro = Bairro;
        this.Cidade = Cidade;
        this.Estado = Estado;
        this.NumeroCasa = NumeroCasa;
    }

    
    
//--------------Metados
    
    public String getRua() {
        return Rua;
    }

    public void setRua(String Rua) {
        this.Rua = Rua;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNumeroCasa() {
        return NumeroCasa;
    }

    public void setNumeroCasa(String NumeroCasa) {
        this.NumeroCasa = NumeroCasa;
    }
    
    
}
