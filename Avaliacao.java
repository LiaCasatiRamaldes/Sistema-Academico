/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaacademico;

/**
 *
 * @author 20171tiimi0165
 */
public class Avaliacao {
    private Aluno aluno;
    private Turma turma;
    private int nota;
    private int peso;

    public Avaliacao(Aluno aluno, Turma turma, int nota, int peso) {
        this.aluno = aluno;
        this.turma = turma;
        this.nota = nota;
        this.peso = peso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public Turma getTurma() {
        return turma;
    }

    public int getNota() {
        return nota;
    }

    public int getPeso() {
        return peso;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
