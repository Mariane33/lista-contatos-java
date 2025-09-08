public class ListaLigada {
    private No primeiro;

    public ListaLigada() {
        this.primeiro = null;
    }

    // Adiciona um novo contato ao final da lista
    public void adicionarContato(Contato contato) {
        No novoNo = new No(contato);
        if (primeiro == null) {
            primeiro = novoNo;
        } else {
            No atual = primeiro;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
    }

    // Remove um contato pelo nome
    public boolean removerContato(String nome) {
        if (primeiro == null) return false;

        if (primeiro.getContato().getNome().equalsIgnoreCase(nome)) {
            primeiro = primeiro.getProximo();
            return true;
        }

        No atual = primeiro;
        while (atual.getProximo() != null) {
            if (atual.getProximo().getContato().getNome().equalsIgnoreCase(nome)) {
                atual.setProximo(atual.getProximo().getProximo());
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
        }

        // Busca um contato pelo nome
        public Contato buscarContato(String nome) {
            No atual = primeiro;
            while (atual != null) {
                if (atual.getContato().getNome().equalsIgnoreCase(nome)) {
                    return atual.getContato();
                }
                atual = atual.getProximo();
            }
            return null;
        }

        // Lista todos os contatos
        public void listarContatos() {
            No atual = primeiro;
            if (atual == null) {
                System.out.println("Lista de contatos vazia.");
                return;
            }

            while (atual != null) {
                System.out.println(atual.getContato());
                System.out.println("---------------");
                atual = atual.getProximo();
            }
        }
    }
