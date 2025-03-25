class Funcionario {
    private String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalarioBase() {

        return salarioBase;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void mostrarDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Salário Base: R$" + calcularSalarioBase());
        System.out.println("---------------------------");

    }
}

class Gerente extends Funcionario {

    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);

    }

    @Override

    public double calcularSalarioBase() {
        return salarioBase * 1.2;
    }

    public void mostrarDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: Gerente");
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Salário Total: R$" + (calcularSalarioBase() + 500));
        System.out.println("---------------------------");
    }

}

class Desenvolvedor extends Funcionario {
    int horasExtras;

    public Desenvolvedor(String nome, double salarioBase, int horasExtras) {
        super(nome, salarioBase);
        this.horasExtras = horasExtras;

    }

    @Override
    public double calcularSalarioBase() {
        return salarioBase * 1.1 + (horasExtras * 50);
    }

    public void mostrarDados() {

        System.out.println("Nome: " + getNome());
        System.out.println("Cargo: Desenvolvedor ");
        System.out.println("Salário Base: R$" + salarioBase);
        System.out.println("Horas extras: " + horasExtras);
        System.out.println("Salário Total: R$" + (calcularSalarioBase() + horasExtras * 50));
    }
}

public class ex2 {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("João", 3000);
        Funcionario f2 = new Gerente("Maria", 5000);
        Funcionario f3 = new Desenvolvedor("Carlos", 4000, 10);

        // Mostrando dados
        System.out.println("=== Folha de Pagamento ===");
        f1.mostrarDados();
        f2.mostrarDados();
        f3.mostrarDados();

        // Calculando total
        double total = f1.calcularSalarioBase() + f2.calcularSalarioBase() + f3.calcularSalarioBase();
        System.out.println("\nTotal da folha: R$" + total);

    }
}
