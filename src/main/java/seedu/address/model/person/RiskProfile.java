package seedu.address.model.person;

import static java.util.Objects.requireNonNull;

/**
 * Represents a Person's risk profile in the address book.
 * Guarantees: immutable; is always valid
 */
public class RiskProfile {
    public final String value;

    /**
     * Constructs a {@code RiskProfile} object with the given result.
     *
     * @param result The result for risk profile.
     */
    public RiskProfile(String result) {
        requireNonNull(result);
        value = result;
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
            || (other instanceof RiskProfile // instanceof handles nulls
            && value.equals(((RiskProfile) other).value)); // state check
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
