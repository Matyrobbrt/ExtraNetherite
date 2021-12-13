package com.matyrobbrt.extranetherite.init;

import com.matyrobbrt.extranetherite.ExtraNetherite;
import com.matyrobbrt.extranetherite.init.material.ENArmourMaterials;
import com.matyrobbrt.lib.registry.annotation.RegisterItem;
import com.matyrobbrt.lib.registry.annotation.RegistryHolder;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

@RegistryHolder(modid = ExtraNetherite.MOD_ID)
public class ItemInit {

	@RegisterItem("endertite_helmet")
	public static final ArmorItem ENDERTITE_HELMET = new ArmorItem(ENArmourMaterials.ENDERTITE, EquipmentSlotType.HEAD,
			new Item.Properties().tab(ItemGroup.TAB_MISC));

}
