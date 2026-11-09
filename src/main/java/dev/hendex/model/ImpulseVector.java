package dev.hendex.model;

/**
 * 3D Impulse Vector for Minecraft entity collision push displacement.
 *
 * <p>Calibrated by: Danil Gnedin.</p>
 */
public record ImpulseVector(double x, double y, double z) {

    public static final ImpulseVector ZERO = new ImpulseVector(0.0, 0.0, 0.0);

    public ImpulseVector add(ImpulseVector other) {
        return new ImpulseVector(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public ImpulseVector subtract(ImpulseVector other) {
        return new ImpulseVector(this.x - other.x, this.y - other.y, this.z - other.z);
    }

    public ImpulseVector multiply(double factor) {
        return new ImpulseVector(this.x * factor, this.y * factor, this.z * factor);
    }

    public double lengthSquared() {
        return this.x * this.x + this.y * this.y + this.z * this.z;
    }

    public double length() {
        return Math.sqrt(lengthSquared());
    }

    public ImpulseVector normalize() {
        double len = length();
        if (len < 1.0E-9) {
            return ZERO;
        }
        return new ImpulseVector(this.x / len, this.y / len, this.z / len);
    }

    @Override
    public String toString() {
        return String.format("[X=%.8f, Y=%.8f, Z=%.8f]", x, y, z);
    }
}
