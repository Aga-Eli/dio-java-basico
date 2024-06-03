package aula_list.operacoes_basicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List <Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List listaParaRemover = new ArrayList<>();

        for (Item item : carrinhoDeCompras){
            if (item.getNome().equalsIgnoreCase(nome))
                listaParaRemover.add(item);
        }

        carrinhoDeCompras.removeAll(listaParaRemover);
    }

    public Double calcularValorTotal(){
        Double valorTotal = 0.0;

        for (Item item : carrinhoDeCompras){
            valorTotal += item.getPreco() * item.getQuantidade();
        }

        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoDeCompras);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras meuCarrinhoDeCompras = new CarrinhoDeCompras();

        meuCarrinhoDeCompras.adicionarItem("chocolate", 0.13, 3);
        meuCarrinhoDeCompras.adicionarItem("leite", 2.26, 4);
        meuCarrinhoDeCompras.adicionarItem("pão", 3.0, 5);
        meuCarrinhoDeCompras.adicionarItem("manteiga", 0.5, 2);
        meuCarrinhoDeCompras.adicionarItem("ovo", 0.10, 6);

        meuCarrinhoDeCompras.exibirItens();

        meuCarrinhoDeCompras.removerItem("chocolate");

        meuCarrinhoDeCompras.exibirItens();

        System.out.println(meuCarrinhoDeCompras.calcularValorTotal());
    }
    
}
