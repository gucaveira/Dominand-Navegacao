package dominando.android.navegacao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dominando.android.navegacao.databinding.ActivityPagerBinding

class PagerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPagerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPagerBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.includeToolbar.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        val tabsPagerAdapter = TabsPagerAdapter(this, supportFragmentManager)
        binding.viewPager.adapter = tabsPagerAdapter
    }
}
