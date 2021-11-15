package uz.allomalar.uz.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import uz.allomalar.uz.R
import uz.allomalar.uz.ui.home.articles.ArticlesAdapter
import uz.allomalar.uz.ui.home.discount.DiscountAdapter
import uz.allomalar.uz.ui.home.line.LineAdapter
import uz.allomalar.uz.ui.home.our_work.OurWorkAdapter
import uz.allomalar.uz.ui.home.vedio.YoutubeAdapter

class HomeFragment : Fragment() {

    private lateinit var adapterViewPager2: ScreenSlidePagerAdapter
    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    
            val recyclerViewLine = view.findViewById<RecyclerView>(R.id.recyclerLine)
    
            recyclerViewLine.layoutManager =
                LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
    
            val mAdapterLine = LineAdapter()
            recyclerViewLine.adapter = mAdapterLine


        val recyclerDiscount = view.findViewById<RecyclerView>(R.id.recyclerDiscount)

        recyclerDiscount.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val mAdapterDiscount = DiscountAdapter()
        recyclerDiscount.adapter = mAdapterDiscount

        val recyclerBestSeller = view.findViewById<RecyclerView>(R.id.recyclerBestSeller)

        recyclerBestSeller.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val mAdapterBestSeller = DiscountAdapter(discount = true)
        recyclerBestSeller.adapter = mAdapterBestSeller


        val recyclerOurWork = view.findViewById<RecyclerView>(R.id.recyclerOurWork)

        recyclerOurWork.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val mAdapterOurWork = OurWorkAdapter()
        recyclerOurWork.adapter = mAdapterOurWork



        val recyclerActicles = view.findViewById<RecyclerView>(R.id.recyclerActicles)

        recyclerActicles.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)

        val mAdapterActicles = ArticlesAdapter()
        recyclerActicles.adapter = mAdapterActicles

        val bundle=Bundle()

        mAdapterActicles.onItemClick={
            Toast.makeText(context?.applicationContext, "${it.position}", Toast.LENGTH_SHORT).show()
//            nextFragmnet.arguments=bundle
//            view.findNavController().navigate(R.id.selectedProductInfoFragment,bundle)
        }



     val recyclerVedio = view.findViewById<RecyclerView>(R.id.recyclerVedio)

        recyclerVedio.layoutManager =
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

        val mAdapterVedio = YoutubeAdapter()
        recyclerVedio.adapter = mAdapterVedio


// ------------------------------------------------------//

        viewPager2 = view.findViewById(R.id.viewPager)
        adapterViewPager2 = ScreenSlidePagerAdapter(this)
        tabLayout = view.findViewById(R.id.tabLayoutViewPager2)


        viewPager2.adapter = adapterViewPager2


        val list = ArrayList<Int>()
        list.add(R.drawable.al_xorazmiy)
        list.add(R.drawable.beruniy)
        list.add(R.drawable.bobur)
        list.add(R.drawable.navoiy)

        adapterViewPager2.update(list)

//        val tabLayout = view.findViewById(R.id.tabLayoutViewPager2Top)

//        tabLayout.setupWithViewPager(viewPagerTop)

        TabLayoutMediator(tabLayout, viewPager2) { _, _ ->
//            top.text ="OBJECT ${(position + 1)}"
        }.attach()


    }

}