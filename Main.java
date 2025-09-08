import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n Sistema de Gerenciamento de Contatos");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Buscar Contato");
            System.out.println("3 - Remover Contato");
            System.out.println("4 - Listar todos os Contatos");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                System.out.print("Nome: ");
                String nome = scanner.nextLine();
                System.out.print("Telefone: ");
                String telefone = scanner.nextLine();
                System.out.print("Endereço: ");
                String endereco = scanner.nextLine();
                Contato novoContato = new Contato(nome, telefone, endereco);
                lista.adicionarContato(novoContato);
                System.out.println("Contato adicionado com sucesso!");
                break;

                case 2:
                System.out.print("Digite o nome do contato a buscar: ");
                String nomeBusca = scanner.nextLine();
                Contato encontrado = lista.buscarContato(nomeBusca);
                if (encontrado != null) {
                    System.out.println(" Contato Encontrado: ");
                    System.out.println(encontrado);
                    } else {
                        System.out.println(" Contato não encontrado.");
                    }
                    break;

                case 3:
                System.out.print("Digite o nome do contato a remover: ");
                String nomeRemover = scanner.nextLine();
                boolean removido = lista.removerContato(nomeRemover);
                if (removido) {
                    System.out.println(" Contato removido com sucesso.");
                } else {
                    System.out.println(" Contato não encontrado.");
                }
                break;

                case 4:
                System.out.println(" Lista de contato: ");
                lista.listarContatos();
                break;

                case 0:
                System.out.println(" Encerrando o sistema...");
                break;

                default:
                System.out.println(" Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
        
        }
    }
