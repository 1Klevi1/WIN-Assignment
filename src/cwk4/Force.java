package cwk4;

/**
 * Represents a force in the United Forces Fleet (UFF) which can partake
 * in battles.
 *
 * @author Klevi, Jack, Luke, Abdulla
 * @version 23/03/2023
 */
public class Force {
    private final String reference;
    private final String name;
    private final int fee;
    private final int strength;

    /**
     * Constructs a force object.
     *
     * @param ref     The force's reference.
     * @param nme     The force's name.
     * @param cost    The force's activation fee.
     * @param strngth The force's strength.
     */
    public Force(String ref, String nme, int cost, int strngth) {
        reference = ref;
        name = nme;
        fee = cost;
        strength = strngth;
    }

    /**
     * Get the force's reference.
     *
     * @return The force's reference.
     */
    public String getReference() {
        return reference;
    }

    /**
     * Get the force's name.
     *
     * @return The force's name.
     */
    public String getName() {
        return name;
    }

    /**
     * Get the force's activation fee.
     *
     * @return The force's activation fee.
     */
    public int getFee() {
        return fee;
    }

    /**
     * Get the force's strength
     *
     * @return The force's strength.
     */
    public int getStrength() {
        return strength;
    }

    /**
     * Get a human-readable representation of this object including the
     * force reference, the force name, the activation cost, and the force
     * strength.
     *
     * @return A string representation of this object.
     */
    public String toString() {
        return "<Force Reference: " + reference + " - Name: " + name + " - Activation Fee: " + fee + " - Strength: " + strength + ">";
    }
}