

class Sender {
    fun send(msg: String) {
        println("Sending $msg")
        println("$msg Sent")
    }
}

class ThreadSend(val sender: Sender, val msg: String) : Runnable {
    override fun run() {
        synchronized(sender) {
            sender.send(msg)
        }
    }
}

fun main() {
    val sender = Sender()

    val t1 = Thread(ThreadSend(sender, "Hii"))
    val t2 = Thread(ThreadSend(sender, "Byee"))

    t1.start()
    t2.start()
}
