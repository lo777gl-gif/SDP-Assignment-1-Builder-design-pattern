package com.game.level;

// Concrete Builder #1: the actual GameLevel object
public class GameLevelObjectBuilder implements LevelBuilder {

    private String name;
    private Biome biome;
    private Difficulty difficulty;
    private int enemyCount;
    private String bossName;
    private String objective;

    @Override
    public GameLevelObjectBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public GameLevelObjectBuilder setBiome(Biome biome) {
        this.biome = biome;
        return this;
    }

    @Override
    public GameLevelObjectBuilder setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    @Override
    public GameLevelObjectBuilder setEnemyCount(int enemyCount) {
        this.enemyCount = enemyCount;
        return this;
    }

    @Override
    public GameLevelObjectBuilder setBoss(String bossName) {
        this.bossName = bossName;
        return this;
    }

    @Override
    public GameLevelObjectBuilder setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    public GameLevel getResult() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Level name is required");
        }
        if (biome == null) {
            throw new IllegalStateException("Biome is required");
        }
        if (difficulty == null) {
            throw new IllegalStateException("Difficulty is required");
        }
        if (enemyCount < 0) {
            throw new IllegalStateException("Enemy count cannot be negative");
        }
        if (objective == null || objective.isBlank()) {
            throw new IllegalStateException("Objective is required");
        }
        return new GameLevel(name, biome, difficulty, enemyCount, bossName, objective);
    }
}
