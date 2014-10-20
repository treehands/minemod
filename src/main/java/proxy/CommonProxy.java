package proxy;

import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;

import lib.Constants;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.registry.EntityRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import entities.EntityWalker;

public class CommonProxy {
	public void registerRenderThings() {}
	public void registerSounds() {}
    public void registerTileEntities() {}
	public void registerRenderers() {}
	
		public void registerEntitySpawns()
    {
        // register natural spawns for entities
        // EntityRegistry.addSpawn(MyEntity.class, spawnProbability, minSpawn, maxSpawn, enumCreatureType, [spawnBiome]);
        // See the constructor in BiomeGenBase.java to see the rarity of vanilla mobs; Sheep are probability 10 while Endermen are probability 1
        // minSpawn and maxSpawn are about how groups of the entity spawn
        // enumCreatureType represents the "rules" Minecraft uses to determine spawning, based on creature type. By default, you have three choices:
        //    EnumCreatureType.creature uses rules for animals: spawn everywhere it is light out.
        //    EnumCreatureType.monster uses rules for monsters: spawn everywhere it is dark out.
        //    EnumCreatureType.waterCreature uses rules for water creatures: spawn only in water.
        // [spawnBiome] is an optional parameter of type BiomeGenBase that limits the creature spawn to a single biome type. Without this parameter, it will spawn everywhere. 

         // DEBUG
        System.out.println("[bTo Chili Hunter]: Registering custom mod spawns.");
        
        // For the biome type you can use an list, but unfortunately the built-in biomeList contains
        // null entries and will crash, so you need to clean up that list.
        // Diesieben07 suggested the following code to remove the nulls and create list of all biomes
        BiomeGenBase[] allBiomes = Iterators.toArray(Iterators.filter(Iterators.forArray(BiomeGenBase.getBiomeGenArray()), Predicates.notNull()), BiomeGenBase.class);

        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.savanna); //change the values to vary the spawn rarity, biome, etc.              
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.plains);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.forest);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.desert);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.iceMountains);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.icePlains);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.taiga);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.river);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.birchForest);
        EntityRegistry.addSpawn(EntityWalker.class, 12, 3, 8, EnumCreatureType.creature, BiomeGenBase.swampland);
   }    
}

