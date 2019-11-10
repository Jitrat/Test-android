package buu.informatics.s59160931.hello


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import buu.informatics.s59160931.hello.databinding.FragmentDetailBinding
import kotlinx.android.synthetic.main.fragment_detail.*


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//private const val ARG_PARAM1 = "param1"
//private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class DetailFragment : Fragment() {
    private lateinit var webview: WebView
    private lateinit var binding: FragmentDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate<FragmentDetailBinding>(inflater,
            R.layout.fragment_detail, container, false)

        val args = DetailFragmentArgs.fromBundle(arguments!!)
        //Toast.makeText(context, "Index: ${args.numbers}", Toast.LENGTH_LONG).show()


        var arr = "An apple is a sweet, edible fruit produced by an apple tree (Malus domestica). Apple trees are cultivated worldwide and are the most widely grown species in the genus Malus. The tree originated in Central Asia, where its wild ancestor, Malus sieversii, is still found today. Apples have been grown for thousands of years in Asia and Europe and were brought to North America by European colonists. Apples have religious and mythological significance in many cultures, including Norse, Greek and European Christian traditions. Apple trees are large if grown from seed. Generally, apple cultivars are propagated by grafting onto rootstocks, which control the size of the resulting tree. There are more than 7,500 known cultivars of apples, resulting in a range of desired characteristics. Different cultivars are bred for various tastes and use, including cooking, eating raw and cider production. Trees and fruit are prone to a number of fungal, bacterial and pest problems, which can be controlled by a number of organic and non-organic means. In 2010, the fruit's genome was sequenced as part of research on disease control and selective breeding in apple production."
        var arr1 = "Asian pear or China pear and other names, such as nashie pearlite: Nashi of South Korea, also known as Shingo, is a buffer of Rosaceae, which is native to Western China and a natural plant. A perennial aromatic tree of Sichuan Province, China, having panicles of white flowers and many colored fruits ranging from yellow to red to brown. Juicy green, thin, sweet, sweet, with a small smell, black or brown seeds."

        if(args.numbers == 0){
            binding.apply {
                fruitImage.setImageResource(R.drawable.apples)
                nameFruit.setText("Apple")
                desFruit.setText(arr)
            }
        }
        if(args.numbers == 1){
            binding.apply {
                fruitImage.setImageResource(R.drawable.asianpears)
                nameFruit.setText("Asian pear")
                desFruit.setText(arr1)
            }
        }

        return binding.root
        //return inflater.inflate(R.layout.fragment_detail, container, false)
    }


}
