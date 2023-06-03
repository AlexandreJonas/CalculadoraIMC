/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lp_avaliacao2;
import model.Aluno;
import controller.AlunoDAO;
/**
 *
 * @author Fatec
 */
public class LP_Avaliacao2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Aluno a = new Aluno("12345","GG","54321",50,157);
        System.out.println(a.IMC());
        //Teste SET
        //new AlunoDAO().setAluno(a);
        
        //Teste GET
        Aluno b = new Aluno("","GG","",0,0);
        new AlunoDAO().getAluno(b);
        System.out.println(b.getAltura());
        System.out.println(b.getCPF());
        System.out.println(b.getData());
        System.out.println(b.getId());
        
        //Teste Update
        Aluno c = new Aluno("22222","AA","12/03/12",60,120);
        c.setId(b.getId());
        //new AlunoDAO().UpdateAluno(c);
        
        //Teste Delete
        Aluno d = new Aluno("","GG","",0,0);
        d.setId(b.getId());
        new AlunoDAO().deleteAluno(d);
    }
    
}
