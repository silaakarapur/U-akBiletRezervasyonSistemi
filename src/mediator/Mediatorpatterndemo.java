/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediator;

/**
 *
 * @author Sila
 */
public class Mediatorpatterndemo {

    public static void main(final String[] args) {
        final Mediator mediator = new Mediator();
        final verilisteleme[] kullanıcı = new verilisteleme[2];
        kullanıcı[0] = new Personel(mediator);
        kullanıcı[1] = new Yolcu(mediator);

        for (final verilisteleme kullanıcılar : kullanıcı) {
            kullanıcılar.biletsil();
            kullanıcılar.verilistele();
        }

    }
}
