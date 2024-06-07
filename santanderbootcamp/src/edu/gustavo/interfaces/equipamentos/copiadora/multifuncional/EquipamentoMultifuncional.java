package edu.gustavo.interfaces.equipamentos.copiadora.multifuncional;

import edu.gustavo.interfaces.equipamentos.copiadora.Copiadora;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.Impressora;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.digitalizadora.Digitalizadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {
    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void impressora() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    public void Imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    
}
