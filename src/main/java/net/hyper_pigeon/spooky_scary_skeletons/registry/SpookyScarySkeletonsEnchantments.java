package net.hyper_pigeon.spooky_scary_skeletons.registry;

import net.hyper_pigeon.spooky_scary_skeletons.enchantments.FrightfulEnchantment;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentTarget;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SpookyScarySkeletonsEnchantments {

    public static Enchantment FRIGHTFUL;

    public static void init(){
//        Registry.register(
//                Registry.ENCHANTMENT,
//                new Identifier("spooky_scary_skeletons", "frightful"),
//                new FrightfulEnchantment(Enchantment.Rarity.RARE,
//                        EnchantmentTarget.WEAPON,
//                        new EquipmentSlot[] {
//                                EquipmentSlot.MAINHAND
//                        })
//        );
    }
}
