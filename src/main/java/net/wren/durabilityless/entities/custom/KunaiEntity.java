package net.wren.durabilityless.entities.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.world.World;
import net.wren.durabilityless.item.ModItems;

public class KunaiEntity extends PersistentProjectileEntity {

    public KunaiEntity(EntityType<? extends PersistentProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    public KunaiEntity(EntityType<? extends PersistentProjectileEntity> entityType, double x, double y, double z, World world) {
        super(entityType, x, y, z, world);
    }

    public KunaiEntity(EntityType<? extends PersistentProjectileEntity> entityType, LivingEntity owner, World world) {
        super(entityType, owner, world);
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(Items.AIR);
    }
}
