public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(50);
        arvore.inserir(30);
        arvore.inserir(70);
        arvore.inserir(20);
        arvore.inserir(40);
        arvore.inserir(60);
        arvore.inserir(80);

        System.out.println("Busca 40: " + arvore.buscar(40));
        System.out.println("Busca 90: " + arvore.buscar(90));

        System.out.print("Pré-ordem: ");
        arvore.preOrdem();
        System.out.println();

        System.out.print("Em ordem: ");
        arvore.emOrdem();
        System.out.println();

        System.out.print("Pós-ordem: ");
        arvore.posOrdem();
        System.out.println();
    }
}