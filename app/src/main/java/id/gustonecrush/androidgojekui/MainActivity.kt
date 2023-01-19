package id.gustonecrush.androidgojekui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout
import id.gustonecrush.androidgojekui.Fragments.BerandaFragment
import id.gustonecrush.androidgojekui.Fragments.ChatFragment
import id.gustonecrush.androidgojekui.Fragments.PesananFragment
import id.gustonecrush.androidgojekui.Fragments.PromoFragment

class MainActivity : AppCompatActivity() {

    // initialize tablayout and viewpager variable
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager: ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // assign the variable with view, which get from their id
        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)

        // setup the viewpager
        tabLayout.setupWithViewPager(viewPager)

        // instansiate the adapter of viewpager
        val vpAdapter: VPAdapter = VPAdapter(this.supportFragmentManager, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)

        // add fragment to adapter
        vpAdapter.addFragment(BerandaFragment(), "Beranda")
        vpAdapter.addFragment(PromoFragment(), "Promo")
        vpAdapter.addFragment(PesananFragment(), "Pesanan")
        vpAdapter.addFragment(ChatFragment(), "Chat")

        // setting up the viewPager view adapter with vpAdapter
        viewPager.adapter = vpAdapter

    }
}