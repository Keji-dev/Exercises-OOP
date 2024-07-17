package Pokemon;

import Interfaces.Plant;

public class Bulbasaur extends Pokemon implements Plant {

    public Bulbasaur(double weightPokemon, String genrePokemon) {
        super(weightPokemon, genrePokemon);
        setNum_pokedex(3);
        setNamePokemon("Bulbasaur");
        setSeasonSpawn("Spring");
    }

    @Override
    public void atacarParalizar() {
        System.out.println(getNamePokemon() + " ataca con Paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println(getNamePokemon() + " ataca con Drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println(getNamePokemon() + " ataca con Hoja Afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println(getNamePokemon() + " ataca con LatigoCepa");
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
