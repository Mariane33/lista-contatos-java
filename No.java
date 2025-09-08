public class No {
    private Contato contato;
    private No proximo;

    public No(Contato contato) {
        this.contato = contato;
        this.proximo = null;
    }

    public Contato getContato() {
        return contato;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximNo) {
        this.proximo = proximo;
    }
}
