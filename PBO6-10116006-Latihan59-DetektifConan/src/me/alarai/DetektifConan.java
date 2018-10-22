package me.alarai;

public class DetektifConan {

    private String episodeTitle;
    private int episodeNum;

    public DetektifConan(String episodeTitle, int episodeNum) {
        this.episodeTitle = episodeTitle;
        this.episodeNum = episodeNum;
    }

    public String getEpisodeTitle() {
        return episodeTitle;
    }

    public int getEpisodeNum() {
        return episodeNum;
    }

    public void playTheAnime(){
        System.out.println("Nonton Detektif Conan");
        System.out.println("Episode : "+this.getEpisodeNum());
        System.out.println("Title : "+ this.getEpisodeTitle());
    }
}
