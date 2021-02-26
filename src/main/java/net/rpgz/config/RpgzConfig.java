package net.rpgz.config;

import java.util.ArrayList;
import java.util.List;

import me.sargunvohra.mcmods.autoconfig1u.ConfigData;
import me.sargunvohra.mcmods.autoconfig1u.annotation.ConfigEntry;
import me.sargunvohra.mcmods.autoconfig1u.shadowed.blue.endless.jankson.Comment;
import me.sargunvohra.mcmods.autoconfig1u.annotation.Config;

@Config(name = "rpgz")
@Config.Gui.Background("minecraft:textures/block/stone.png")
public class RpgzConfig implements ConfigData {

  public boolean drop_unlooted = false;
  public boolean hopper_extracting = false;
  @ConfigEntry.Gui.PrefixText
  @Comment("Default: 2400ticks = 2min")
  public int drop_after_ticks = 2400;
  public int despawn_corps_after_ticks = 4800;
  public boolean despawn_immediately_when_empty = true;
  @Comment("Example: minecraft:zombie or adventurez.brown_fungus")
  public List<String> excluded_entities = new ArrayList<>();

}
