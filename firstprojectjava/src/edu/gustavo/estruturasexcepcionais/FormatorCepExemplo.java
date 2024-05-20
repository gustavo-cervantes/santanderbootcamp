package edu.gustavo.estruturasexcepcionais;

public class FormatorCepExemplo {
    public static void main(String[] args) {
       try {
        String cepFormatado = formatarCep("9556000");
        System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
        System.out.println("CEP Inválido - Falta de caracteres");
    }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        // simulando cep formatado
        return "95.560-000";
    }
}
