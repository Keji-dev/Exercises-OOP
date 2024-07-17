package Pokemon;

import Interfaces.Electric;

public class Pikachu extends Pokemon implements Electric {


    public Pikachu(double weightPokemon, String genrePokemon) {
        super(weightPokemon, genrePokemon);
        setNum_pokedex(1);
        setNamePokemon("Pikachu");
        setSeasonSpawn("Autumn");
    }

    @Override
    public void atacarImpactrueno() {
        System.out.println(getNamePokemon() + " ataca con Impact Trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println(getNamePokemon() + " ataca con Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println(getNamePokemon() + " ataca con Rayo Carga");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println(getNamePokemon() + " ataca con Punio de Trueno");
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

    @Override
    public String toString() {
        return super.toString();
    }
}
