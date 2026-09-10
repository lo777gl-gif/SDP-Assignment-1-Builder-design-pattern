
# Builder Pattern - Game Level

Builder pattern example: same construction steps produce two different representations of a game level — a GameLevel object and a text mission briefing.

---

## Project Structure

* `GameLevel.java` — The product (it's immutable, no setters).
* `LevelBuilder.java` — The builder interface.
* `GameLevelObjectBuilder.java` — The first Concrete builder, creates actual game level object.
* `LevelBriefingBuilder.java` — The second Concrete builder, creates a text mission description.
* `JsonLevelBuilder.java` — The third Concrete builder, creates a JSON file mission description.
* `LevelDirector.java` — The director class, it has two ready-made level templates (`makeExplorationLevel` and `makeBossLevel`).
* `Biome.java` & `Difficulty.java` — Just enums.
* `Main.java` — The client (Where everything is run).

---