package hr.algebra.daggervjezba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import dagger.android.AndroidInjection
import hr.algebra.daggervjezba.databinding.ActivityMainBinding
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    val TAG = "MainActivity"

    private lateinit var binding : ActivityMainBinding

    @Inject
    lateinit var x : MojaKlasa

    override fun onCreate( savedInstanceState: Bundle? ) {
        super.onCreate( savedInstanceState )
        AndroidInjection.inject(this );
        binding = ActivityMainBinding.inflate( layoutInflater )
        setContentView( binding.root )

        Log.i( TAG, x.toString() )
        x.pokaziTost( "Primjer" )
    }
}