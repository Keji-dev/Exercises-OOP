package Pokemon;

public abstract class Pokemon {

    private int num_pokedex;
    private String namePokemon;
    private double weightPokemon;
    private String genrePokemon;
    private String seasonSpawn;

    public Pokemon(double weightPokemon, String genrePokemon) {
        this.weightPokemon = weightPokemon;
        this.genrePokemon = genrePokemon;
    }

    public abstract void attackTackle();

    public abstract void attackScratch();

    public abstract void attackBite();

    @Override
    public String toString() {
        return  "Nombre: " + getNamePokemon() +
                "\nNumero en la pokedex: " + getNum_pokedex() +
                "\nPeso: " + getWeightPokemon() +
                "\nGenero: " + getGenrePokemon() +
                "\nEstacion: " + getSeasonSpawn();
    }

    public int getNum_pokedex() {
        return num_pokedex;
    }

    public String getNamePokemon() {
        return namePokemon;
    }

    public double getWeightPokemon() {
        return weightPokemon;
    }

    public String getGenrePokemon() {
        return genrePokemon;
    }

    public String getSeasonSpawn() {
        return seasonSpawn;
    }

    public void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    public void setNamePokemon(String namePokemon) {
        this.namePokemon = namePokemon;
    }

    public void setWeightPokemon(double weightPokemon) {
        this.weightPokemon = weightPokemon;
    }

    public void setGenrePokemon(String genrePokemon) {
        this.genrePokemon = genrePokemon;
    }

    public void setSeasonSpawn(String seasonSpawn) {
        this.seasonSpawn = seasonSpawn;
    }
}
