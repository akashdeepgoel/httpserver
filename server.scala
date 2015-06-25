//HTTP Server
import java.net.ServerSocket
import java.io.BufferedInputStream
import java.io.BufferedOutputStream
import java.io.PrintStream
object server {

	def main(args: Array[String]): Unit = {
		val input = readLine("Enter Port Number>")
		val port = input.toInt
		val socket = new ServerSocket(port)
		println("Server running on Port " + port)
		val accept = socket.accept()
		val input_stream = new BufferedInputStream(accept.getInputStream())
		val output_stream = new PrintStream(new BufferedOutputStream(accept.getOutputStream()))
		output_stream.println("Server Works!")
		output_stream.flush()
	}
}