package org.example;

public class Paciente implements Cloneable{

    private int cpf;
    private String nome;
    private String localNascimento;

    public Paciente(int cpf, String nome, String localNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.localNascimento = localNascimento;
    }

    public int getCPF() {
        return cpf;
    }

    public void setCPF(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalNascimento() {
        return localNascimento;
    }

    public void setLocalNascimento(String localNascimento) {
        this.localNascimento = localNascimento;
    }

    @Override

    public Paciente clone() throws CloneNotSupportedException {
        Paciente pacienteClone = (Paciente) super.clone();
        return pacienteClone;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "CPF=" + cpf +
                ", nome='" + nome + '\'' +
                ", localNascimento='" + localNascimento + '\'' +
                '}';
    }

}
