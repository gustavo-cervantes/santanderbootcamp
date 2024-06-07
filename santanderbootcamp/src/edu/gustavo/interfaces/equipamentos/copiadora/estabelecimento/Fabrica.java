package edu.gustavo.interfaces.equipamentos.copiadora.estabelecimento;

import edu.gustavo.interfaces.equipamentos.copiadora.Copiadora;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.Deskjet;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.Impressora;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.Laserjet;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.digitalizadora.Digitalizadora;
import edu.gustavo.interfaces.equipamentos.copiadora.multifuncional.EquipamentoMultifuncional;
import edu.gustavo.interfaces.equipamentos.copiadora.impressora.digitalizadora.*;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

         Scanner scanner = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;
        
        impressora.Imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
