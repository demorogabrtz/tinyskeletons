package fuzs.tinyskeletons.client.core;

import com.mojang.blaze3d.vertex.PoseStack;
import fuzs.puzzleslib.api.core.v1.ServiceProviderHelper;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.world.item.ItemDisplayContext;
import net.minecraft.world.item.ItemStack;

public interface ClientAbstractions {
    ClientAbstractions INSTANCE = ServiceProviderHelper.load(ClientAbstractions.class);

    void renderByItem(ItemStack itemStack, ItemDisplayContext itemDisplayContext, PoseStack poseStack, MultiBufferSource multiBufferSource, int packedLight, int packedOverlay);
}
