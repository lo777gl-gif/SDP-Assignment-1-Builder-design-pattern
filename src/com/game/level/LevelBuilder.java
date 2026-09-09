package com.game.level;

// Builder Interface
public interface LevelBuilder {

    LevelBuilder setName(String name);
    LevelBuilder setBiome(Biome biome);
    LevelBuilder setDifficulty(Difficulty difficulty);
    LevelBuilder setEnemyCount(int enemyCount);
    LevelBuilder setBoss(String bossName);
    LevelBuilder setObjective(String objective);
}
