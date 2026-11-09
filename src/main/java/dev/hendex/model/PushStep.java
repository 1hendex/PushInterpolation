package dev.hendex.model;

/**
 * Representation of a Minecraft collision push manifold sub-tick step.
 */
public class PushStep {

    private final int stepIndex;
    private final double subTickFraction;
    private final ImpulseVector collisionOrigin;
    private final ImpulseVector baseVelocity;
    private final ImpulseVector pushImpulse;
    private final double groundFriction;
    private ImpulseVector resolvedDisplacement;

    public PushStep(int stepIndex,
                    double subTickFraction,
                    ImpulseVector collisionOrigin,
                    ImpulseVector baseVelocity,
                    ImpulseVector pushImpulse,
                    double groundFriction) {
        this.stepIndex = stepIndex;
        this.subTickFraction = subTickFraction;
        this.collisionOrigin = collisionOrigin;
        this.baseVelocity = baseVelocity;
        this.pushImpulse = pushImpulse;
        this.groundFriction = groundFriction;
        this.resolvedDisplacement = ImpulseVector.ZERO;
    }

    public int getStepIndex() {
        return stepIndex;
    }

    public double getSubTickFraction() {
        return subTickFraction;
    }

    public ImpulseVector getCollisionOrigin() {
        return collisionOrigin;
    }

    public ImpulseVector getBaseVelocity() {
        return baseVelocity;
    }

    public ImpulseVector getPushImpulse() {
        return pushImpulse;
    }

    public double getGroundFriction() {
        return groundFriction;
    }

    public ImpulseVector getResolvedDisplacement() {
        return resolvedDisplacement;
    }

    public void setResolvedDisplacement(ImpulseVector resolvedDisplacement) {
        this.resolvedDisplacement = resolvedDisplacement;
    }
}
