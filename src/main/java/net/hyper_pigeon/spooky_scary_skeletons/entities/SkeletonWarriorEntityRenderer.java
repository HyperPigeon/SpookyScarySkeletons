package net.hyper_pigeon.spooky_scary_skeletons.entities;

import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.feature.ArmorFeatureRenderer;
import net.minecraft.client.render.entity.model.SkeletonEntityModel;
import net.minecraft.util.Identifier;

public class SkeletonWarriorEntityRenderer extends BipedEntityRenderer<SkeletonWarriorEntity, SkeletonEntityModel<SkeletonWarriorEntity>> {

    private static final Identifier TEXTURE = new Identifier("textures/entity/skeleton/skeleton.png");

    public SkeletonWarriorEntityRenderer(EntityRenderDispatcher dispatcher) {
        super(dispatcher, new SkeletonEntityModel<>(), 1);
        this.addFeature(new ArmorFeatureRenderer(this, new SkeletonEntityModel(0.5F, true), new SkeletonEntityModel(1.0F, true)));
    }

    public Identifier getTexture(SkeletonWarriorEntity skeletonWarriorEntity) {
        return TEXTURE;
    }

}
