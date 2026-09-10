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

        JsonLevelBuilder explorationJsonBuilder = new JsonLevelBuilder();
        director.makeExplorationLevel(explorationJsonBuilder);
        String explorationJson = explorationJsonBuilder.getResult(); // representation 3: json
        System.out.println(explorationJson);

        // Boss level
        GameLevelObjectBuilder bossObjectBuilder = new GameLevelObjectBuilder();
        director.makeBossLevel(bossObjectBuilder);
        GameLevel bossLevel = bossObjectBuilder.getResult();
        System.out.println(bossLevel);

        LevelBriefingBuilder bossBriefingBuilder = new LevelBriefingBuilder();
        director.makeBossLevel(bossBriefingBuilder);
        String bossBriefing = bossBriefingBuilder.getResult();
        System.out.println(bossBriefing);

        JsonLevelBuilder bossJsonBuilder = new JsonLevelBuilder();
        director.makeBossLevel(bossJsonBuilder);
        String bossJson = bossJsonBuilder.getResult();
        System.out.println(bossJson);

    }
}
