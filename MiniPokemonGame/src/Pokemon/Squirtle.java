package Pokemon;

import Interfaces.Water;

public class Squirtle extends Pokemon implements Water {

    public Squirtle(double weightPokemon, String genrePokemon) {
        super(weightPokemon, genrePokemon);
        setNum_pokedex(2);
        setNamePokemon("Squirtle");
        setSeasonSpawn("Winter");
    }

    @Override
    public void atacarHidrobomba() {
        System.out.println(getNamePokemon() + " ataca con Hidrobomba");
    }

    @Override
    public void tacarPistolaAgua() {
        System.out.println(getNamePokemon() + " ataca con Pistola Agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println(getNamePokemon() + " ataca con Burbuja");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println(getNamePokemon() + " ataca con Hidropulso");
    }

    @Override
    public void attackTackle() {
        System.out.println(getNamePokemon() + " ataca con Placaje");
    }

    @Override
    public void attackScratch() {
        System.out.println(getNamePokemon() + " ataca con Aranazo");
    }

    @Override
    public void attackBite() {
        System.out.println(getNamePokemon() + " ataca con Mordisco");
    }
}
