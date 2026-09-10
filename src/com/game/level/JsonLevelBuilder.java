package com.game.level;

// Concrete Builder #3: JSON representation
public class JsonLevelBuilder implements LevelBuilder {

    private String name;
    private Biome biome;
    private Difficulty difficulty;
    private int enemyCount;
    private String bossName;
    private String objective;

    @Override
    public JsonLevelBuilder setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public JsonLevelBuilder setBiome(Biome biome) {
        this.biome = biome;
        return this;
    }

    @Override
    public JsonLevelBuilder setDifficulty(Difficulty difficulty) {
        this.difficulty = difficulty;
        return this;
    }

    @Override
    public JsonLevelBuilder setEnemyCount(int enemyCount) {
        this.enemyCount = enemyCount;
        return this;
    }

    @Override
    public JsonLevelBuilder setBoss(String bossName) {
        this.bossName = bossName;
        return this;
    }

    @Override
    public JsonLevelBuilder setObjective(String objective) {
        this.objective = objective;
        return this;
    }

    public String getResult() {
        if (name == null || name.isBlank()) {
            throw new IllegalStateException("Level name is required");
        }
        if (biome == null) {
            throw new IllegalStateException("Biome is required");
        }
        if (difficulty == null) {
            throw new IllegalStateException("Difficulty is required");
        }
        if (objective == null || objective.isBlank()) {
            throw new IllegalStateException("Objective is required");
        }

        return "{\n"
                + "  \"name\": " + quote(name) + ",\n"
                + "  \"biome\": " + quote(biome.name()) + ",\n"
                + "  \"difficulty\": " + quote(difficulty.name()) + ",\n"
                + "  \"enemyCount\": " + enemyCount + ",\n"
                + "  \"boss\": " + (bossName == null ? "null" : quote(bossName)) + ",\n"
                + "  \"objective\": " + quote(objective) + "\n"
                + "}";
    }

    private static String quote(String value) {
        return "\"" + value + "\"";
    }
}
