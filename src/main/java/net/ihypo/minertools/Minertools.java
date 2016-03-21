package net.ihypo.minertools;

import net.ihypo.block.TitaniumOre;
import net.ihypo.item.TitaniumIngot;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Minertools.MODID, version = Minertools.VERSION)
public class Minertools
{
    public static final String MODID = "minertools";
    public static final String VERSION = "0.1";
    
    // 方块
    static public Block titaniumOre;
    
    //物品
    static public Item titaniumIngot;
    
    @EventHandler
    public void preLoad(FMLPreInitializationEvent event)
    {
    	titaniumOre = new TitaniumOre(Material.rock);
    	titaniumOre.setBlockName("TitaniumOre");
    	titaniumOre.setBlockTextureName("minertools:titaniumOre");
    	titaniumOre.setHardness(5.0f);
    	titaniumOre.setResistance(10.0f);
    	titaniumOre.setLightLevel(0.0f);
    	titaniumOre.setStepSound(Block.soundTypeStone);
    	titaniumOre.setCreativeTab(CreativeTabs.tabBlock);
    	titaniumOre.setHarvestLevel("pickaxe", 2);
    	GameRegistry.registerBlock(titaniumOre,"TitaniumOre");
    	
    	titaniumIngot = new TitaniumIngot();
    	titaniumIngot.setUnlocalizedName("TitaniumIngot");
    	titaniumIngot.setTextureName("minertools:titaniumIngot");
    	titaniumIngot.setMaxStackSize(64);
    	titaniumIngot.setCreativeTab(CreativeTabs.tabMaterials);
    	GameRegistry.registerItem(titaniumIngot, "TitaniumIngot");
    	
    	GameRegistry.addSmelting(titaniumOre, new ItemStack(titaniumIngot), 100f);
    }
     
    @EventHandler
    public void load(FMLInitializationEvent event)
    {
    }
     
    @EventHandler
    public void postLoad(FMLPostInitializationEvent event)
    {
    }
}
