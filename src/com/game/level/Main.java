package com.game.level;

// Client
public class Main {

    public static void main(String[] args) {
        LevelDirector director = new LevelDirector();

        // Exploration level
        GameLevelObjectBuilder explorationObjectBuilder = new GameLevelObjectBuilder();
        director.makeExplorationLevel(explorationObjectBuilder);
        GameLevel explorationLevel = explorationObjectBuilder.getResult(); // representation 1: object
        System.out.println(explorationLevel);

        LevelBriefingBuilder explorationBriefingBuilder = new LevelBriefingBuilder();
        director.makeExplorationLevel(explorationBriefingBuilder);
        String explorationBriefing = explorationBriefingBuilder.getResult(); // representation 2: text
        System.out.println(explorationBriefing);

        // Boss level
        GameLevelObjectBuilder bossObjectBuilder = new GameLevelObjectBuilder();
        director.makeBossLevel(bossObjectBuilder);
        GameLevel bossLevel = bossObjectBuilder.getResult();
        System.out.println(bossLevel);

        LevelBriefingBuilder bossBriefingBuilder = new LevelBriefingBuilder();
        director.makeBossLevel(bossBriefingBuilder);
        String bossBriefing = bossBriefingBuilder.getResult();
        System.out.println(bossBriefing);

    }
}
