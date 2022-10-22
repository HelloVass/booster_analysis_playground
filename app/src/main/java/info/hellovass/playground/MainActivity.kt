package info.hellovass.playground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import info.hellovass.library.Test

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Test()
    }
}