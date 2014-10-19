package entities;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIMoveIndoors;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAIOpenDoor;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAIRestrictOpenDoor;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.ai.EntityAIWatchClosest2;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import lib.Constants;
import btomoduno.btomod;

public class EntityTest extends EntityHorse
{
	 // fields related to attacking
	protected Entity entityAttacked = null;
	protected float attackDamage = 1.0F;
	protected int knockback = 0;
	protected boolean wasDamageDone = false;
	
		public EntityTest(World par1World)
    {
        super(par1World);
        this.setSize(1.5F, 1.5F);
        this.getNavigator().setBreakDoors(true);
        this.getNavigator().setAvoidsWater(true);
        this.getNavigator().setCanSwim(false);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(2, new EntityAIMoveIndoors(this));
        this.tasks.addTask(3, new EntityAIRestrictOpenDoor(this));
        this.tasks.addTask(4, new EntityAIOpenDoor(this, true));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, 0.6D));
        this.tasks.addTask(9, new EntityAIWatchClosest2(this, EntityPlayer.class, 3.0F, 1.0F));
        this.tasks.addTask(9, new EntityAIWander(this, 0.6D));
        this.tasks.addTask(10, new EntityAIWatchClosest(this, EntityLivingBase.class, 8.0F));
        this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityMob.class, 1.0D, true));
        //this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntitySkeleton.class, 1.0D, true));
       // this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityEnderman.class, 1.0D, true));
        //this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntitySpider.class, 1.0D, true));
        //this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityWalker.class, 1.0D, true));
       // this.tasks.addTask(11, new EntityAIAttackOnCollide(this, EntityCreeper.class, 1.0D, true));
        this.tasks.addTask(12, new EntityAIPanic(this, 1.4D));
        this.tasks.addTask(13, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(14, new EntityAITempt(this, 1.0D, items.ModItems.botellaaceite, false));
        this.tasks.addTask(15, new EntityAIFollowParent(this, 0.6D));
        this.tasks.addTask(16, new EntityAILookIdle(this));
        this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityMob.class, 0, true));
        ///this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, 0, true));
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityEnderman.class, 0, true));
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, 0, true));
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityWalker.class, 0, true));
        //this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityCreeper.class, 0, true));
        
        
        
    }

    public boolean isAIEnabled() {
    	return true;
    }
    
   
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(40.0D);
        this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.4D);
        
        this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
        
        
    }

    protected void fall(float par1) {}
    
    @Override
    protected String getLivingSound()
    {
    	playSound(Constants.MODID + ":" + "robot1", getSoundVolume(), getSoundPitch());
    	return null;//this refers to:yourmod/sound/YourSound
    }

    @Override
    protected String getHurtSound()
    {
    
        return null;//this refers to:yourmod/sound/optionalFile/YourSound
    }

    @Override
    protected String getDeathSound()
    {
    	    	playSound(Constants.MODID + ":" + "wilhelm", getSoundVolume(), getSoundPitch());
    	return null;//etc.
    }

    @Override
    protected float getSoundVolume()
    {
        return 0.4F;
    }

	@Override
	public EntityHorse createChild(EntityAgeable var1) {
		return new EntityTest(this.worldObj);
	}
	
	public boolean isBreedingItem(ItemStack par1ItemStack)
    {
        return par1ItemStack != null && par1ItemStack.getItem() == items.ModItems.botellaaceite;
    }
	
	
	


@Override

public boolean attackEntityAsMob(Entity entityTarget)
{
    float attackDamage = (float)getEntityAttribute(SharedMonsterAttributes

          .attackDamage).getAttributeValue();
    int knockbackModifier = 0;

    if (entityTarget instanceof EntityLivingBase)
    {
        attackDamage += EnchantmentHelper.getEnchantmentModifierLiving(this, 

              (EntityLivingBase)entityTarget);
        knockbackModifier  += EnchantmentHelper.getKnockbackModifier(this, 

              (EntityLivingBase)entityTarget);
    }

    boolean isTargetHurt = entityTarget.attackEntityFrom(DamageSource

          .causeMobDamage(this), attackDamage);

  	if (wasDamageDone)
    {
        if (knockbackModifier  > 0)
        {
        	
           entityTarget.addVelocity((double)(-MathHelper.sin(rotationYaw * 

                 (float)Math.PI / 180.0F) * (float)knockbackModifier  * 0.5F), 

             0.1D, (double)(MathHelper.cos(rotationYaw * 

                  (float)Math.PI / 180.0F) * (float)knockbackModifier  * 0.5F));
            motionX *= 0.6D;
            motionZ *= 0.6D;
        }

        int fireModifier = EnchantmentHelper.getFireAspectModifier(this);

      if (fireModifier > 0)
    {
   entityTarget.setFire(fireModifier * 4);
    }

        if (entityTarget instanceof EntityLivingBase)
        {
            EnchantmentHelper.func_151384_a((EntityLivingBase)entityTarget, this);
        }

        EnchantmentHelper.func_151385_b(this, entityTarget);
    }

   return isTargetHurt ;
}


}
