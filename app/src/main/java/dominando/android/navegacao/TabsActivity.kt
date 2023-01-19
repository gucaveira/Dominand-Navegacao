package dominando.android.navegacao

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import dominando.android.navegacao.databinding.ActivityTabsBinding

class TabsActivity : AppCompatActivity() {

    private var _binding: ActivityTabsBinding? = null
    private val binding: ActivityTabsBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityTabsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.includeToolbar.toolbar)
        val pagerAdapter = TabsPagerAdapter(this, supportFragmentManager)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.viewPager.adapter = pagerAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }
}