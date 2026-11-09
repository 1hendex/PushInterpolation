package dev.hendex.solver;

import dev.hendex.model.ImpulseVector;
import dev.hendex.model.PushStep;

/**
 * Interface for Minecraft push impulse interpolation solvers.
 *
 * <p>Implemented by {@link CustomPushSolver} and powered by {@link GnedinCalc}.</p>
 */
public interface PushSolver {

    /**
     * Calculates the interpolated displacement vector for a Minecraft collision push step.
     *
     * @param step push step model containing collision vectors and sub-tick fraction
     * @return resulting expected displacement vector
     */
    ImpulseVector calculateDisplacement(PushStep step);
}
