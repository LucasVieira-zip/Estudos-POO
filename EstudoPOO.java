// Classe base Livro
class Livro {
    // Atributos da classe Livro
    protected String titulo;
    protected String autor;

    // Construtor da classe Livro
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    // Método para exibir informações do livro
    public void exibirInfo() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    // Método abstrato para calcular o preço (diferente para LivroFisico e LivroDigital)
    public abstract double calcularPreco();
}

// Classe LivroFisico que herda de Livro
class LivroFisico extends Livro {
    // Atributo específico para LivroFisico
    private double peso;  // Peso do livro

    // Construtor da classe LivroFisico
    public LivroFisico(String titulo, String autor, double peso) {
        super(titulo, autor);  // Chama o construtor da classe base
        this.peso = peso;
    }

    // Sobrescrita do método calcularPreco
    @Override
    public double calcularPreco() {
        // O preço de um livro físico depende do peso
        return 30.00 + (peso * 0.5);  // Preço base de R$30,00 mais R$0,50 por quilo
    }

    // Sobrescrita do método exibirInfo para incluir peso
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Peso: " + peso + " kg");
    }
}

// Classe LivroDigital que herda de Livro
class LivroDigital extends Livro {
    // Atributo específico para LivroDigital
    private double tamanhoArquivo;  // Tamanho do arquivo em MB

    // Construtor da classe LivroDigital
    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);  // Chama o construtor da classe base
        this.tamanhoArquivo = tamanhoArquivo;
    }

    // Sobrescrita do método calcularPreco
    @Override
    public double calcularPreco() {
        // O preço de um livro digital depende do tamanho do arquivo
        return 20.00 + (tamanhoArquivo * 0.2);  // Preço base de R$20,00 mais R$0,20 por MB
    }

    // Sobrescrita do método exibirInfo para incluir tamanho do arquivo
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tamanho do arquivo: " + tamanhoArquivo + " MB");
    }
}

// Classe principal para testar o código
public class Main {
    public static void main(String[] args) {
        // Criando objetos de LivroFisico e LivroDigital
        Livro livroFisico = new LivroFisico("Java para Iniciantes", "José Silva", 1.5);
        Livro livroDigital = new LivroDigital("Design Patterns", "Maria Costa", 15.0);

        // Exibindo informações e calculando preços
        System.out.println("Informações do Livro Físico:");
        livroFisico.exibirInfo();
        System.out.println("Preço do Livro Físico: R$" + livroFisico.calcularPreco());
        
        System.out.println("\nInformações do Livro Digital:");
        livroDigital.exibirInfo();
        System.out.println("Preço do Livro Digital: R$" + livroDigital.calcularPreco());
    }
}
