package entities;

import lib.Constants;
import btomoduno.btomod;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class EntityWalker extends EntityMob{
	
public EntityWalker(World par1World) {
	
super(par1World);
}

@Override
protected void applyEntityAttributes()
{
	 super.applyEntityAttributes();
this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(2.0D);
}

}