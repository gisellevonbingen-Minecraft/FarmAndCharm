package satisfy.farmcharm.mixin;

import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.level.Level;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import satisfy.farmcharm.entity.ai.ApproachFeedingTroughGoal;

@Mixin(Animal.class)
public abstract class AnimalEntityMixin extends Mob {
    protected AnimalEntityMixin(EntityType<? extends Mob> entityType, Level world) {
        super(entityType, world);
    }

    @Inject(method = "<init>", at = @At("TAIL"))
    private void AFTAddSelfFeedingGoal(EntityType<? extends Mob> entityType, Level world, CallbackInfo ci) {
        if (!world.isClientSide) {
            this.goalSelector.addGoal(3, new ApproachFeedingTroughGoal((Animal) (Object) this, 1.2D));
        }
    }
}
