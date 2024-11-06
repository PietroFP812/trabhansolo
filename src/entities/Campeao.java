package entities;

public class Campeao {
    private String nome;
    private int ataque;
    private int armadura;
    private int vida;

    public Campeao(String nome, int ataque, int armadura, int vida) {
        this.nome = nome;
        this.ataque = ataque;
        this.armadura = armadura;
        this.vida = vida;
    }

    // Método para calcular o dano recebido de outro campeão
    public void takeDamage(int ataqueInimigo) {
        int dano = Math.max(ataqueInimigo - this.armadura, 1); // Pelo menos 1 de dano sempre
        this.vida = Math.max(this.vida - dano, 0); // Vida não pode ser menor que zero
    }

    // Método para mostrar o status do campeão
    public String status() {
        if (this.vida == 0) {
            return this.nome + ": morreu";
        } else {
            return this.nome + ": " + this.vida + " de vida";
        }
    }

    // Getters
    public int getAtaque() {
        return this.ataque;
    }

    public int getVida() {
        return this.vida;
    }

    // Getter do nome, caso seja necessário para relatórios
    public String getNome() {
        return this.nome;
    }
}
