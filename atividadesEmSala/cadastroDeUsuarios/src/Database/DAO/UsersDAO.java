package Database.DAO;

import Database.Conexao;
import Models.User;

import java.sql.*;
import java.util.ArrayList;

public class UsersDAO {

    public void insertUser(User user) throws Exception {
        String sql = "INSERT INTO USERS(USNOME, USENDERECO, USTELEFONE) VALUES (?, ?, ?);";

        Connection connection = Conexao.criarConexaoComBancoDeDados();

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, user.getNome());
        ps.setString(2, user.getEndereco());
        ps.setString(3, user.getTelefone());


        int row = ps.executeUpdate();

        ps.close();
        connection.close();

        if (row == 0) {
            throw new Exception("O usuário não foi inserido no banco");
        }
    }

    public void insertManyUsers(ArrayList<User> users) throws Exception {
        String sql = "INSERT INTO USERS(USNOME, USENDERECO, USTELEFONE) VALUES (?, ?, ?);";

        Connection connection = Conexao.criarConexaoComBancoDeDados();

        PreparedStatement ps = connection.prepareStatement(sql);

        for (User user : users) {
            ps.setString(1, user.getNome());
            ps.setString(2, user.getEndereco());
            ps.setString(3, user.getTelefone());

            ps.addBatch();
        }

        int[] rows = ps.executeBatch();

        ps.close();
        connection.close();

        if (rows.length == 0) {
            throw new Exception("O usuário não foi inserido no banco");
        }
    }

    public void updateUser(User user) throws Exception {
        ArrayList<String> parameters = new ArrayList<String>();

        String sql = "UPDATE USERS SET ";

        if (user.getNome() != null) {
            sql += "USNOME = ?,";
            parameters.add(user.getNome());
        }

        if (user.getEndereco() != null) {
            sql += "USENDERECO = ?,";
            parameters.add(user.getEndereco());
        }

        if (user.getTelefone() != null) {
            sql += "USTELEFONE = ?,";
            parameters.add(user.getTelefone());
        }

        sql = sql.substring(0, sql.length() - 1) + " ";

        sql += "WHERE USID = ?";

        Connection connection = Conexao.criarConexaoComBancoDeDados();
        PreparedStatement ps = connection.prepareStatement(sql);

        for (int i = 0; i < parameters.size(); i++) {
            ps.setString(i + 1, parameters.get(i));
        }

        ps.setInt(parameters.size() + 1, user.getId());

        int row = ps.executeUpdate();

        ps.close();
        connection.close();

        if (row == 0) {
            throw new Exception("O usuário informado para atualização não existe no banco");
        }
    }

    public void deleteUserById(int id) throws Exception {
        String sql = "DELETE FROM USERS WHERE USID = ?";

        Connection connection = Conexao.criarConexaoComBancoDeDados();

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, id);

        int row = ps.executeUpdate();
        if (row == 0) {
            throw new Exception("O usuário informado para exclusão não existe no banco");
        }
    }

    public ArrayList<User> findAllUsers() throws SQLException {
        String sql = "SELECT USID, USNOME, USENDERECO, USTELEFONE FROM USERS";

        Connection connection = Conexao.criarConexaoComBancoDeDados();
        Statement statement = connection.createStatement();

        ArrayList<User> users = new ArrayList<User>();
        ResultSet result = statement.executeQuery(sql);
        while (result.next()) {
            int id = result.getInt("USID");
            String nome = result.getString("USNOME");
            if (result.wasNull()) {
                nome = null;
            }

            String endereco = result.getString("USENDERECO");
            if (result.wasNull()) {
                endereco = null;
            }

            String telefone = result.getString("USTELEFONE");
            if (result.wasNull()) {
                telefone = null;
            }

            User user = new User(id, nome, endereco, telefone);
            users.add(user);
        }

        result.close();
        connection.close();

        return users;
    }

    public User findUserById(int idBusca) throws Exception {
        String sql = "SELECT USID, USNOME, USENDERECO, USTELEFONE FROM USERS WHERE USID = ?";

        Connection connection = Conexao.criarConexaoComBancoDeDados();

        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setInt(1, idBusca);

        ResultSet result = ps.executeQuery();
        if (result.next()) {
            int id = result.getInt("USID");
            String nome = result.getString("USNOME");
            if (result.wasNull()) {
                nome = null;
            }

            String endereco = result.getString("USENDERECO");
            if (result.wasNull()) {
                endereco = null;
            }

            String telefone = result.getString("USTELEFONE");
            if (result.wasNull()) {
                telefone = null;
            }

            return new User(id, nome, endereco, telefone);
        }

        return null;
    }
}