package no.rogo.goneproofofconcept

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sw1.setOnCheckedChangeListener { _, boolean ->
            if(boolean) station_constraint_1.visibility = View.VISIBLE else station_constraint_1.visibility = View.GONE
        }
        sw2.setOnCheckedChangeListener { _, boolean ->
            if(boolean) date_constraint_2.visibility = View.VISIBLE else date_constraint_2.visibility = View.GONE
        }
        sw3.setOnCheckedChangeListener { _, boolean ->
            if(boolean) price_constraint_3.visibility = View.VISIBLE else price_constraint_3.visibility = View.GONE
        }
        sw4.setOnCheckedChangeListener { _, boolean ->
            if(boolean) warning_constraint_4.visibility = View.VISIBLE else warning_constraint_4.visibility = View.GONE
        }
        sw5.setOnCheckedChangeListener { _, boolean ->
            if(boolean) include_constraint_5.visibility = View.VISIBLE else include_constraint_5.visibility = View.GONE
        }
        sw6.setOnCheckedChangeListener { _, boolean ->
            if(boolean) list_constraint_6.visibility = View.VISIBLE else list_constraint_6.visibility = View.GONE
        }
        sw7.setOnCheckedChangeListener { _, boolean ->
            if(boolean) button_constraint_7.visibility = View.VISIBLE else button_constraint_7.visibility = View.GONE
        }


    }


}