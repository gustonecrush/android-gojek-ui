package id.gustonecrush.androidgojekui

import androidx.coordinatorlayout.widget.CoordinatorLayout.AttachedBehavior
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class VPAdapter(fm: FragmentManager, behavior: Int): FragmentPagerAdapter(fm, behavior) {

    private val fragmentArrayList: ArrayList<Fragment> = ArrayList<Fragment>()
    private val fragmentTitle: ArrayList<String> = ArrayList<String>()

    override fun getCount(): Int {
        return fragmentArrayList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentArrayList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitle[position]
    }

    fun addFragment(fr: Fragment, title: String) {
        fragmentArrayList.add(fr)
        fragmentTitle.add(title)
    }

}