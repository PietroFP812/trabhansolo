package services;

import entities.Campeao;

public class Combate {
    private Campeao campeao1;
    private Campeao campeao2;
    private int turnos;

    public Combate(Campeao campeao1, Campeao campeao2, int turnos) {
        this.campeao1 = campeao1;
        this.campeao2 = campeao2;
        this.turnos = turnos;
    }

    public void iniciar() {
        for (int i = 1; i <= turnos; i++) {
            System.out.println("Resultado do turno " + i + ":");

            // Campeão 1 ataca Campeão 2
            campeao2.takeDamage(campeao1.getAtaque());

            // Campeão 2 ataca Campeão 1
            campeao1.takeDamage(campeao2.getAtaque());

            // Mostra o status dos campeões
            System.out.println(campeao1.status());
            System.out.println(campeao2.status());

            // Verifica se algum dos campeões morreu para terminar o combate
            if (campeao1.getVida() == 0 || campeao2.getVida() == 0) {
                break;
            }
        }
        System.out.println("### FIM DO COMBATE ###");
    }
}
