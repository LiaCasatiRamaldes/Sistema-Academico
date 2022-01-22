/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;
import java.util.ArrayList;

/**
 *
 * @author 20171tiimi0165
 */
public class Disciplina {
    private String nome;
    private int codigo;
    private ArrayList<Disciplina> disciplinas;

    public Disciplina(String nome, int codigo, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.codigo = codigo;
        this.disciplinas = disciplinas;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }
    
    
}
