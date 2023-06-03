/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Fatec
 */
public class Aluno {
    
    private int id;
    private String CPF;
    private String nome;
    private String data;
    private int peso;
    private int altura;
    
    public Aluno(String CPF, String nome,String data,int peso,int altura)
    {
        this.CPF = CPF;
        this.nome = nome;
        this.data = data;
        this.peso = peso;
        this.altura = altura;
    }
    
    public double IMC()
    {
        double metros =  this.altura;
        metros = metros/100;
        return (this.peso /(metros * metros));
    }
    
    public String IMC_Interpretacao()
    {
        double a = this.IMC();
        if (a < 18.5d)
        {
            return "Magreza";
        }
        else if (a < 24.9d)
        {
            return "Normal";
        }
        else if (a < 29.9d)
        {
            return "Sobrepeso";
        }
        else if (a < 39.9d)
        {
            return "Obesidade";
        }
        else
        {
            return "Obesidade Grave";
        }
        
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }
    
    
}
