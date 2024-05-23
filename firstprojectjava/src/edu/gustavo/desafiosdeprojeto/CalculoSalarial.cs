using System;

public class CalculoSalarial
{
    public static void Main()
    { 
        float valorSalario = float.Parse(Console.ReadLine());
        float valorBeneficios = float.Parse(Console.ReadLine());

        float valorImposto = 0;

            // de R$0,00 a R$1100.00
        if (valorSalario >=0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
            // de R$1100.01 a R$2500.00
        }else if (valorSalario >=1100.01 && valorSalario <= 2500.00) {
            valorImposto = 0.10F * valorSalario;
            // acima de R$2500.00    
        } else { 
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        Console.WriteLine(saida.ToString("0.00"));    
    }
}