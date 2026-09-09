package com.game.level;

// Concrete Builder #2: Informing player about Level
public class LevelBriefingBuilder implements LevelBuilder {

    private final StringBuilder sb = new StringBuilder("=== MISSION BRIEFING ===\n");

    private boolean nameSet = false;
    private boolean biomeSet = false;
    private boolean difficultySet = false;

    @Override
    public LevelBriefingBuilder setName(String name) {
        sb.append("Level: ").append(name).append('\n');
        nameSet = true;
        return this;
    }

    @Override
    public LevelBriefingBuilder setBiome(Biome biome) {
        sb.append("Location: ").append(biome).append('\n');
        biomeSet = true;
        return this;
    }

    @Override
    public LevelBriefingBuilder setDifficulty(Difficulty difficulty) {
        sb.append("Difficulty: ").append(difficulty).append('\n');
        difficultySet = true;
        return this;
    }

    @Override
    public LevelBriefingBuilder setEnemyCount(int enemyCount) {
        sb.append("Enemies expected: ").append(enemyCount).append('\n');
        return this;
    }

    @Override
    public LevelBriefingBuilder setBoss(String bossName) {
        sb.append("Boss: ").append(bossName == null ? "None" : bossName).append('\n');
        return this;
    }

    @Override
    public LevelBriefingBuilder setObjective(String objective) {
        sb.append("Objective: ").append(objective).append('\n');
        return this;
    }

    public String getResult() {
        if (!nameSet) {
            throw new IllegalStateException("Level name is required");
        }
        if (!biomeSet) {
            throw new IllegalStateException("Biome is required");
        }
        if (!difficultySet) {
            throw new IllegalStateException("Difficulty is required");
        }
        return sb.toString();
    }
}
