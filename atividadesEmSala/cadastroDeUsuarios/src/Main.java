import Database.DAO.UsersDAO;
import Models.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            for (; ; ) {
                System.out.println("=====ESCOLHA UMA OPÇÃO:=====");
                System.out.println("[1] - Inserir um usuário;");
                System.out.println("[2] - Inserir vários usuários;");
                System.out.println("[3] - Atualizar um usuário;");
                System.out.println("[4] - Excluir um usuário;");
                System.out.println("[5] - Obter todos os usuários;");
                System.out.println("[6] - Obter usuário por id;");

                System.out.print("Opção: ");
                int opcao = scanner.nextInt();
                switch (opcao) {
                    case 1: {
                        User user = lerUsuario();
                        inserirUsuario(user);
                        continue;
                    }
                    case 2: {
                        ArrayList<User> users = lerUsuarios();
                        inserirMuitosUsuarios(users);
                        continue;
                    }
                    case 3: {
                        int id = lerCodigoDeUsuario();
                        User user = lerUsuario();
                        atualizarUsuario(user);
                        continue;
                    }
                    case 4: {
                        continue;
                    }
                    case 5: {
                        continue;
                    }
                    case 6: {
                        continue;
                    }
                    default: {
                        System.out.println("Opção inválida, tente novamente!");
                        continue;
                    }
                }
            }
        } catch (Exception ex) {
            System.out.println("ERRO: " + ex.getMessage());
        }
    }

    private static User lerUsuario() {
        System.out.print("Informe o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Informe o endereço do usuário: ");
        String endereco = scanner.nextLine();

        System.out.print("Informe o telefone do usuário: ");
        String telefone = scanner.nextLine();

        return new User(nome, endereco, telefone);
    }

    private static ArrayList<User> lerUsuarios() {
        ArrayList<User> users = new ArrayList<User>();

        for (; ; ) {
            users.add(lerUsuario());

            System.out.print("Inserir outro usuário? [S/N]");
            if (!scanner.next().equalsIgnoreCase("S")) {
                break;
            }
        }

        return users;
    }

    private static int lerCodigoDeUsuario() {
        System.out.print("Informe o código do usuário: ");
        return scanner.nextInt();
    }

    private static void inserirUsuario(User user) throws Exception {
        new UsersDAO().updateUser(user);
    }

    private static void inserirMuitosUsuarios(ArrayList<User> users) throws Exception {
        new UsersDAO().insertManyUsers(users);
    }

    private static void atualizarUsuario(User user) throws Exception {
        new UsersDAO().updateUser(user);
    }

    private static void excluirUsuario(int id) throws Exception {
        new UsersDAO().deleteUserById(id);
    }

    private static void obterTodosUsuarios() throws SQLException {
        ArrayList<User> users = new UsersDAO().findAllUsers();

        for (User user : users) {
            System.out.println(user);
        }
    }

    private static void obterUsuarioPorId(int id) throws Exception {
        User user = new UsersDAO().findUserById(id);
        System.out.println(user.toString());
    }
}