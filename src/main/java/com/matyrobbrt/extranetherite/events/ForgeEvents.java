package com.matyrobbrt.extranetherite.events;

import com.matyrobbrt.extranetherite.ExtraNetherite;
import com.matyrobbrt.extranetherite.init.ItemInit;

import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.player.PlayerEntity;

import net.minecraftforge.event.entity.living.EntityTeleportEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(modid = ExtraNetherite.MOD_ID)
public class ForgeEvents {

	@SubscribeEvent
	public static void endermanTeleport(final EntityTeleportEvent.EnderEntity event) {
		EndermanEntity enderman = (EndermanEntity) event.getEntityLiving();
		if (enderman.getTarget() instanceof PlayerEntity) {
			PlayerEntity player = (PlayerEntity) enderman.getTarget();
			if (player.inventory.armor.get(3).getItem() == ItemInit.ENDERTITE_HELMET) {
				event.setCanceled(true);
			}
		}
	}

}
