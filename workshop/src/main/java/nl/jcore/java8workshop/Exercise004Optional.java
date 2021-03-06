package nl.jcore.java8workshop;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.Optional;

public class Exercise004Optional {
    /**
     * Return an Optional holding the value of the String
     * input. The input should never be null.
     *
     * Why wrap a should-not-be-null value in an Optional
     * if it's going to throw a NullPointerException
     * anyway if the object is null? In this way we
     * express that we do not expect a null value and that
     * execution should halt if it does occur. Fail fast.
     */
    static Optional<String> returnOptional(@NotNull final String input) {
        return null;
    }

    /**
     * Return an Optional holding the value of the String
     * input. The input may be null.
     *
     * In this case we want to use Optional's full
     * potential and wrap the may-be-null value in a
     * holder to express that there might not be a value.
     * The code working with this Optional will have to
     * handle an Optional.empty() appropriately.
     */
    static Optional<String> nullSafeOptional(@Nullable final String input) {
        return null;
    }

    /**
     * Return an Optional holding the value of the String
     * input. If the input String is empty, the Optional
     * should also be empty.
     *
     * Another great thing about the Optional is that we
     * can use filter() and map() functionality with
     * lambdas. The filter(λ) method on an Optional
     * returns either itself or an Optional.empty()
     * depending on the boolean return value of the
     * lambda (λ). Map(λ) returns an Optional wrapping
     * the outcome of the lambda.
     */
    static Optional<String> nullSafeOptional_EmptyOptionalIfEmptyString(@Nullable final String input) {
        return null;
    }
}
