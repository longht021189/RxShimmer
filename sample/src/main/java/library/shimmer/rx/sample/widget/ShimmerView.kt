package library.shimmer.rx.sample.widget

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.view.View
import library.shimmer.rx.ShimmerHelper

class ShimmerView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyle: Int = 0
) : View(context, attrs, defStyle) {

    private val helper = ShimmerHelper(this)

    override fun onDraw(canvas: Canvas?) {
        if (canvas != null) { helper.draw(canvas) }
        super.onDraw(canvas)
    }
}