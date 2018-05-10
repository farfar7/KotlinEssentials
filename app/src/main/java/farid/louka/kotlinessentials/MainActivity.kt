package farid.louka.kotlinessentials

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btnSpinnerClicked (view:View){
        var intent = Intent(this, SpinnerActivity::class.java)
        startActivity(intent)
    }
    fun btn4Clicked (view:View){
        var intent = Intent(this, IntentActivity::class.java)
        startActivity(intent)
    }
    fun btn2Clicked (view:View){
        var intent = Intent(this, ArrayActivity::class.java)
        startActivity(intent)
    }
    fun btn3Clicked (view:View){
        var intent = Intent(this, RandomActivity::class.java)
        startActivity(intent)
    }
    fun btn10Clicked (view:View){
        var intent = Intent(this, ButtonActivity::class.java)
        startActivity(intent)
    }
    fun btn6Clicked (view:View){
        var intent = Intent(this, ToastActivity::class.java)
        startActivity(intent)
    }
    fun btn9Clicked (view:View){
        var intent = Intent(this, InstanceStateActivity::class.java)
        startActivity(intent)
    }
}
