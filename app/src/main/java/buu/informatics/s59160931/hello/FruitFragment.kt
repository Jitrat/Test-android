package buu.informatics.s59160931.hello


import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.findNavController
import buu.informatics.s59160931.hello.databinding.FragmentFruitBinding
import kotlinx.android.synthetic.main.list_fruit.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class FruitFragment : Fragment() {

    private lateinit var binding: FragmentFruitBinding

    var number = 0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentFruitBinding>(
            inflater,
            R.layout.fragment_fruit, container, false
        )

        var arrFruit: ArrayList<Fruit> = ArrayList()
        arrFruit.add(Fruit("Apple", "apple description", R.drawable.apple))
        arrFruit.add(Fruit("Asian pear", "asian pear description", R.drawable.asianpear))
        arrFruit.add(Fruit("Banana", "banana description", R.drawable.banana))
        arrFruit.add(Fruit("Cantaloupe", "cantaloupe description", R.drawable.cantaloupe))
        arrFruit.add(Fruit("Custard apple", "custard apple description", R.drawable.custardapple))
        arrFruit.add(Fruit("Dragon fruit", "dragon fruit description", R.drawable.dragonfruit))
        arrFruit.add(Fruit("Durian", "durian description", R.drawable.durian))


        binding.listView.adapter = this.context?.let { CustomAdapterFruit(it, arrFruit) }

        binding.listView.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            if(position == 0){
                number = 0
            }
            if (position == 1){
                number = 1
            }
            if (position == 2){
                number = 2
            }
            if (position == 3){
                number = 3
            }
            if (position == 4){
                number = 4
            }
            if (position == 5){
                number = 5
            }
            if (position == 6){
                number = 6
            }

            when(position){
               in 0..6 -> findNavController().navigate(FruitFragmentDirections.actionFruitFragmentToDetailFragment(number))
            }

        }
        return binding.root
    }
}
