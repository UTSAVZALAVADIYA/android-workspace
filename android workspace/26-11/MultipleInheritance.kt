interface Camera {
    fun takePhoto() {
        println("Taking a photo...")
    }
}

interface MusicPlayer {
    fun playMusic() {
        println("Playing music...")
    }
}

class Smartphone : Camera, MusicPlayer {
    fun makeCall() {
        println("Making a call...")
    }
}

fun main() {
    val smartphone = Smartphone()

    smartphone.takePhoto()
    smartphone.playMusic()
    smartphone.makeCall()
}s