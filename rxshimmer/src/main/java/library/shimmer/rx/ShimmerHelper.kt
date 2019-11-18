package library.shimmer.rx

import android.graphics.Canvas
import android.view.View
import java.lang.ref.WeakReference

class ShimmerHelper(
    view: View
) {
    private val viewRef = WeakReference(view)

    fun draw(canvas: Canvas) {
        val view = viewRef.get() ?: return


    }
}