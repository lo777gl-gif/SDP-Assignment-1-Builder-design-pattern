package com.game.level;

// Product
public final class GameLevel {

    private final String name;
    private final Biome biome;
    private final Difficulty difficulty;
    private final int enemyCount;
    private final String bossName;   // may be null -> no boss on this level
    private final String objective;

    GameLevel(String name, Biome biome, Difficulty difficulty, int enemyCount, String bossName, String objective) {
        this.name = name;
        this.biome = biome;
        this.difficulty = difficulty;
        this.enemyCount = enemyCount;
        this.bossName = bossName;
        this.objective = objective;
    }

    @Override
    public String toString() {
        return "GameLevel[" + name + ", " + biome + ", " + difficulty + ", enemies=" + enemyCount + ", boss=" + (bossName == null ? "none" : bossName) + "]";
    }
}
