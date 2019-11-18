package library.shimmer.rx.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import library.shimmer.rx.sample.widget.ShimmerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ShimmerView(this))
    }
}