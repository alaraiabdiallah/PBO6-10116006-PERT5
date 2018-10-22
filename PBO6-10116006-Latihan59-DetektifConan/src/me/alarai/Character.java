package me.alarai;

public class Character extends DetektifConan{

    private String heroName, villianName;

    public Character(String episodeTitle, int episodeNum) {
        super(episodeTitle, episodeNum);
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public String getVillianName() {
        return villianName;
    }

    public void setVillianName(String villianName) {
        this.villianName = villianName;
    }

    public void playTheAnime(){
        System.out.println("Watch Detektif Conan");
        System.out.println("Episode : "+this.getEpisodeNum());
        System.out.println("Title : "+ this.getEpisodeTitle());
        System.out.println();
        System.out.println("====With Character====");
        System.out.println("Prontagonis of the episode : "+this.getHeroName());
        System.out.println("Bad guy of the episode : "+this.getVillianName());
    }
}
