package info.hellovass.playground

import android.app.Application
import info.hellovass.library.LibraryModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        LibraryModule()
    }
}