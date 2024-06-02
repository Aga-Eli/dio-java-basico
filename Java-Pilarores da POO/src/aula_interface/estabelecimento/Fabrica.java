package aula_interface.estabelecimento;

import aula_interface.equipamentos.copiadora.Copiadora;
import aula_interface.equipamentos.digitalizadora.Digitalizadora;
import aula_interface.equipamentos.impressora.Impressora;
import aula_interface.equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Impressora impressora = em;
        Copiadora copiadora = em;
        Digitalizadora digitalizadora = em;

        em.imprimir();
        em.copiar();
        em.digitalizar();

        impressora.imprimir();
        copiadora.copiar();
        digitalizadora.digitalizar();

        // Note que o equipament funcional pode acessar todos os métodos
        // mas o resto dos equipamento so podem fazer o que fazem
    }
}
