package Pokemon;

import Interfaces.Fire;

public class Charmander extends Pokemon implements Fire {

    public Charmander(double weightPokemon, String genrePokemon) {
        super(weightPokemon, genrePokemon);
        setNum_pokedex(4);
        setNamePokemon("Charmander");
        setSeasonSpawn("Summer");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println(getNamePokemon() + " ataca con Punio Fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println(getNamePokemon() + " ataca con Ascuas");
    }

    @Override
    public void atacarLanzallamas() {
        System.out.println(getNamePokemon() + " ataca con Lanzallamas");
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
