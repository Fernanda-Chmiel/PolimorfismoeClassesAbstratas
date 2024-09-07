/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fe.polimorfismoeclassesabstratas;

/**
 *
 * @author Admin
 */
public class PolimorfismoeClassesAbstratas {

    public static void main(String[] args) {
        // ex1
//        FormaGeometrica Circulo = new Circulo(5); //informar raio
//        System.out.println("Área do Círculo aproximada (número inteiro): " + Circulo.calcularArea());
//        FormaGeometrica Retangulo = new Retangulo(4,5); // informar largura e altura 
//        System.out.println("Área do Retângulo aproximada (número inteiro): " + Retangulo.calcularArea());
//        FormaGeometrica Triangulo = new Triangulo(4,5); // informar base e altura
//        System.out.println("Área do Triângulo aproximada (número inteiro): " + Triangulo.calcularArea());

       // ex2
//       Animal cachorro = new Cachorro();
//       cachorro.emitirSom();
//       cachorro.mover();
//       
//        System.out.println("--------------------------");
//       
//       Animal passaro = new Passaro();
//       passaro.emitirSom();
//       passaro.mover();
//        
//        System.out.println("--------------------------");
//       
//      Animal gato = new Gato();
//      gato.emitirSom();
//      gato.mover();

      // ex3
//        ContaBancaria ContaCorrente = new ContaCorrente(5000);
//        ContaCorrente.depositar(90);
//        ContaCorrente.sacar(2000);
//        System.out.println("Saldo Conta Corrente: R$" + ContaCorrente.getSaldo());
//
//        
//        ContaBancaria ContaPoupanca = new ContaPoupanca(1550);
//        ContaPoupanca.depositar(700);
//        ContaPoupanca.sacar(25);
//        System.out.println("Saldo Conta Poupança: R$" + ContaPoupanca.getSaldo());

      // ex4
//        Pagamento Cartao = new PagamentoCartaoCredito(5000); // tem acréscimo de 3%
//        Pagamento Boleto = new PagamentoBoleto(5000);
//
//        System.out.println("Valor com cartão de crédito: R$" + Cartao.calcularValor());
//        System.out.println("Valor com boleto: R$" + Boleto.calcularValor());

      // ex5
         Funcionario gr = new Gerente(8000);
         System.out.println("Salário de Gerente: " + gr.calcularSalario());
         Funcionario pg = new Programador(3000);
         System.out.println("Salário de Programador: " + pg.calcularSalario());


    }
}
