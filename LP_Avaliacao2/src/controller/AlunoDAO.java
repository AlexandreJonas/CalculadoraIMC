/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import factory.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import model.Aluno;

/**
 *
 * @author Fatec
 */
public class AlunoDAO {

    private Connection connection;
    private Aluno aluno;

    public AlunoDAO() {
        this.connection = new ConnectionFactory().getConexaoMySQL();

    }

    public void setAluno(Aluno aluno) {
        String sql = "INSERT INTO lp_avaliacao2.aluno(cpf ,nome , dataNascimento ,peso, altura) VALUES(?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql,
                    Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, aluno.getCPF());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getData());
            stmt.setInt(4, aluno.getPeso());
            stmt.setInt(5, aluno.getAltura());
            stmt.execute();
            // Pegar chave primaria gerada pelo banco de dados mysql
            ResultSet keys = stmt.getGeneratedKeys();
            if (keys.next()) {
                int id = keys.getInt(1);
                aluno.setId(id);
            }
            stmt.close();
        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }

    public void getAluno(Aluno aluno) {
        String sql = "select * from lp_avaliacao2.aluno where nome = ?";

        try ( PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, aluno.getNome());

            try ( ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    aluno.setId(rs.getInt("id"));
                    aluno.setCPF(rs.getString("cpf"));
                    aluno.setData(rs.getString("dataNascimento"));
                    aluno.setPeso(rs.getInt("peso"));
                    aluno.setAltura(rs.getInt("altura"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return;
    }

    public void UpdateAluno(Aluno aluno) {

        String sql = "update lp_avaliacao2.aluno set cpf = ?, nome = ?, dataNascimento = ?, peso = ?, altura = ? where id = ?;";

        try ( PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, aluno.getCPF());
            stmt.setString(2, aluno.getNome());
            stmt.setString(3, aluno.getData());
            stmt.setInt(4, aluno.getPeso());
            stmt.setInt(5, aluno.getAltura());
            stmt.setInt(6, aluno.getId());

            stmt.execute();
            stmt.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        
        return;
    }
    
    public void deleteAluno(Aluno aluno){
        String sql = "delete from lp_avaliacao2.aluno where id = ?";  
        try (PreparedStatement stmt = connection.prepareStatement(sql)){
            stmt.setInt(1, aluno.getId());
            stmt.execute();
            stmt.close();
        } catch(SQLException u){
            throw new RuntimeException(u);
        }
    }
    
    public void getAluno(JComboBox cb)
    {
        String sql = "select * from lp_avaliacao2.aluno";

        try ( PreparedStatement stmt = connection.prepareStatement(sql)) {

            try ( ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    cb.addItem(rs.getString("nome"));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return;
    }

}
