package herenciaact2;

// @author Haze

import Entities.Lavadora;
import Entities.Televisor;

public class HerenciaAct2 {

    public static void main(String[] args) {
        Lavadora lavadora = new Lavadora();
        lavadora.crearLavadora();
        System.out.println("Precio lavadora = $" + lavadora.precioFinal());

        Televisor televisor = new Televisor();
        televisor.crearTelevisor();
        System.out.println("Precio televisor = $" + televisor.precioFinal());
    }

}
