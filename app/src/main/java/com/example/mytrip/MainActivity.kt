package com.example.mytrip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onClick(view: View) {

        val id = view.id

        if (id == R.id.buttonCalculator) {
            handleCalculate()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCalculator.setOnClickListener(this)
    }

    private fun handleCalculate() {

        if (!(isValid())) {
            Toast.makeText(this, getString(R.string.campos_invalidos), Toast.LENGTH_LONG).show()
        }
    }

    private fun isValid(): Boolean {
        return editNome.text.toString() != ""
                && editEmail.text.toString() != ""
                && editDistance.text.toString() != ""
                && editPrice.text.toString() != ""
                && editAutonomy.text.toString() != ""
                && editAutonomy.text.toString() != "0"
    }
}
