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
public class Turma {
    private int codigo;
    private Disciplina disciplina;
    private Professor professor;
    private int vagas;
    private ArrayList<Aluno> alunos;
    private int numeroAlunos;
    private String semestre;

    public Turma(int codigo, Disciplina disciplina, Professor professor, int vagas, ArrayList<Aluno> alunos, int quantAlunos, String semestre) {
        this.codigo = codigo;
        this.disciplina = disciplina;
        this.professor = professor;
        this.vagas = vagas;
        this.alunos = alunos;
        this.numeroAlunos = quantAlunos;
        this.semestre = semestre;
    }

    Turma(String codigo, int disciplina, int professor, int qtdVagas, ArrayList<Aluno> alunos, String semestre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getCodigo() {
        return codigo;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public int getVagas() {
        return vagas;
    }

    public ArrayList<Aluno> getAlunos() {
        return alunos;
    }

    public int getNumeroAlunos() {
        return numeroAlunos;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public void setVagas(int vagas) {
        this.vagas = vagas;
    }

    public void setAlunos(ArrayList<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void setNumeroAlunos(int numeroAlunos) {
        this.numeroAlunos = numeroAlunos;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    
    
    
}
