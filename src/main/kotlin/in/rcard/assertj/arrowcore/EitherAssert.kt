package `in`.rcard.assertj.arrowcore

import arrow.core.Either

/**
 * Assertions for [Either].
 *
 * @param <LEFT>  type of the value on the left contained in the [Either].
 * @param <RIGHT> type of the value on the right contained in the [Either].
 * @author Riccardo Cardin
 */
class EitherAssert<LEFT, RIGHT>(either: Either<LEFT, RIGHT>?) :
    AbstractEitherAssert<EitherAssert<LEFT, RIGHT>, LEFT, RIGHT>(either) {
    companion object {
        fun <LEFT, RIGHT> assertThat(actual: Either<LEFT, RIGHT>?): EitherAssert<LEFT, RIGHT> {
            return EitherAssert(actual)
        }
    }
}
