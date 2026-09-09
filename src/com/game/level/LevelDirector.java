package com.game.level;

// Director
public class LevelDirector {

    // Easy exploration level without boss
    public void makeExplorationLevel(LevelBuilder builder) {
        builder.setName("Whispering Woods")
               .setBiome(Biome.FOREST)
               .setDifficulty(Difficulty.EASY)
               .setEnemyCount(6)
               .setObjective("Find the hidden ruins");
    }

    // Hard boss fight level
    public void makeBossLevel(LevelBuilder builder) {
        builder.setName("Molten Throne")
               .setBiome(Biome.VOLCANO)
               .setDifficulty(Difficulty.HARD)
               .setEnemyCount(20)
               .setBoss("Ashfang")
               .setObjective("Defeat the volcano guardian");
    }
}
