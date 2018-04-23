package hello.hello_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val message: TextView = this.findViewById(R.id.helloText)
        message.text = "ハロー ことりん"
    }
}
