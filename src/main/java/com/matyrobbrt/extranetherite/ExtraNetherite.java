package com.matyrobbrt.extranetherite;

import com.matyrobbrt.lib.ModSetup;
import com.matyrobbrt.lib.registry.annotation.AnnotationProcessor;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

import net.minecraftforge.fml.common.Mod;

@Mod(ExtraNetherite.MOD_ID)
public class ExtraNetherite extends ModSetup {

	public static final String MOD_ID = "extranetherite";

	public static final AnnotationProcessor ANN_PROCESSOR = new AnnotationProcessor(MOD_ID);

	public ExtraNetherite() {
		super(MOD_ID);
	}

	@Override
	public AnnotationProcessor annotationProcessor() {
		return ANN_PROCESSOR;
	}

	public static ResourceLocation resourceLocation(String name) {
		return new ResourceLocation(MOD_ID, name);
	}

	public static final ItemGroup EXTRA_NETHERITE_TAB = new ItemGroup(ItemGroup.TABS.length, MOD_ID) {

		@Override
		public ItemStack makeIcon() {
			return ItemStack.EMPTY;
		}
	};

}
