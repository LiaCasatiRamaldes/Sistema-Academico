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
public class SistemaAcademico {
    private ArrayList<Professor> professores;
    private ArrayList<Aluno> alunos;
    private ArrayList<Disciplina> disciplinas;
    private ArrayList<Turma> turmas;
    private ArrayList<Avaliacao> avaliacoes;

    public SistemaAcademico() {
        this.professores = new ArrayList<Professor>();
        this.alunos = new ArrayList<Aluno>();
        this.disciplinas = new ArrayList<Disciplina>();
        this.turmas = new ArrayList<Turma>();
        this.avaliacoes = new ArrayList<Avaliacao>();
    }

    public ArrayList<Professor> getProfessores() {
        return professores;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public ArrayList<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public ArrayList<Turma> getTurmas() {
        return turmas;
    }

    public ArrayList<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }

    public void setProfessores(ArrayList<Professor> professores) {
        this.professores = professores;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setDisciplinas(ArrayList<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public void setTurmas(ArrayList<Turma> turmas) {
        this.turmas = turmas;
    }

    public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    }

}
