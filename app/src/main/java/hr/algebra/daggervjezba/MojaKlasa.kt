package hr.algebra.daggervjezba

import android.widget.Toast

class MojaKlasa ( private val activity : MainActivity ){

    fun pokaziTost( s: String ) {
        Toast
            .makeText( activity, s, Toast.LENGTH_LONG )
            .show( )
    }

}