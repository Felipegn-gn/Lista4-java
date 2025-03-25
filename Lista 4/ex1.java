class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String exibirInformacoes() {
        return "Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano;
    }
}

class Carro extends Veiculo {
    private int quantidadeDePortas;

    public Carro(String marca, String modelo, int ano, int quantidadeDePortas) {
        super(marca, modelo, ano);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public int getQuantidadeDePortas() {
        return quantidadeDePortas;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + 
               "\nQuantidade de Portas: " + quantidadeDePortas + 
               "\nTipo: Carro";
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public int getCilindradas() {
        return cilindradas;
    }

    @Override
    public String exibirInformacoes() {
        return super.exibirInformacoes() + 
               "\nCilindradas: " + cilindradas + "cc" + 
               "\nTipo: Moto";
    }
}

public class ex1 {
    public static void main(String[] args) {
        // Criando um carro de exemplo
        Veiculo carro = new Carro("Toyota", "Corolla", 2022, 4);
        
        // Criando uma moto de exemplo
        Veiculo moto = new Moto("Honda", "CB 500", 2021, 500);
        
        System.out.println("=== Informações do Carro ===");
        System.out.println(carro.exibirInformacoes());
        
        System.out.println("\n=== Informações da Moto ===");
        System.out.println(moto.exibirInformacoes());
    }
}