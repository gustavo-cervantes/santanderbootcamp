const ValorSalario = parseFloat(gets()); // const pois não mudará!
const valorBeneficios = parseFloat(gets());

const valorImposto = calcularImposto(ValorSalario);
const saida = ValorSalario - valorImposto + valorBeneficios;
print(saida.toFixed(2));

function calcularImposto(salario) {
    let aliquota; // let pois o valor mudará!
    if (salario >= 0 && salario <= 1100) {
        aliquota = 0.05;
    }else if (salario >=1100.01 && salario <= 2500.00) {
        aliquota = 0.10 * salario;
        // acima de R$2500.00    
    } else { 
        aliquota = 0.15 * salario;
    }

    return aliquota * salario;

}