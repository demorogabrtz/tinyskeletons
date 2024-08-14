package fuzs.tinyskeletons.init;

import fuzs.puzzleslib.api.init.v3.registry.RegistryManager;
import fuzs.tinyskeletons.TinySkeletons;
import fuzs.tinyskeletons.world.entity.monster.BabySkeleton;
import fuzs.tinyskeletons.world.entity.monster.BabyStray;
import fuzs.tinyskeletons.world.entity.monster.BabyWitherSkeleton;
import net.minecraft.core.Holder;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.level.block.Blocks;

public class ModRegistry {
    static final RegistryManager REGISTRY = RegistryManager.from(TinySkeletons.MOD_ID);
    public static final Holder.Reference<EntityType<BabySkeleton>> BABY_SKELETON_ENTITY_TYPE = REGISTRY.registerEntityType("baby_skeleton", () -> EntityType.Builder.of(BabySkeleton::new, MobCategory.MONSTER).sized(0.6F, 1.99F).clientTrackingRange(8));
    public static final Holder.Reference<EntityType<BabyWitherSkeleton>> BABY_WITHER_SKELETON_ENTITY_TYPE = REGISTRY.registerEntityType("baby_wither_skeleton", () -> EntityType.Builder.of(BabyWitherSkeleton::new, MobCategory.MONSTER).fireImmune().sized(0.7F, 2.4F).clientTrackingRange(8));
    public static final Holder.Reference<EntityType<BabyStray>> BABY_STRAY_ENTITY_TYPE = REGISTRY.registerEntityType("baby_stray", () -> EntityType.Builder.of(BabyStray::new, MobCategory.MONSTER).sized(0.6F, 1.99F).immuneTo(Blocks.POWDER_SNOW).clientTrackingRange(8));

    public static void touch() {

    }
}
