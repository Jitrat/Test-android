package buu.informatics.s59160931.hello

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView


class CustomAdapterFruit(var context: Context, var fruit: ArrayList<Fruit>): BaseAdapter() {

    private class ViewHolder(row: View?) {
        var txtName: TextView
        var txtDescription: TextView
        var fruitImg: ImageView

        init {
            this.txtName = row?.findViewById(R.id.nameText) as TextView
            this.txtDescription = row?.findViewById(R.id.descriptionText) as TextView
            this.fruitImg = row?.findViewById(R.id.fruitImage) as ImageView
        }
    }

    override fun getView(position: Int, converView: View?, parent: ViewGroup?): View? {
        var view: View?
        var viewHolder: ViewHolder
        if (converView == null){
            var layout = LayoutInflater.from(context)
            view = layout.inflate(R.layout.list_fruit, parent, false)
            viewHolder = ViewHolder(view)
            view.tag = viewHolder
        } else {
            view = converView
            viewHolder = view.tag as ViewHolder
        }

        var fruit: Fruit = getItem(position) as Fruit
        viewHolder.txtName.text = fruit.name
        viewHolder.txtDescription.text = fruit.description
        viewHolder.fruitImg.setImageResource(fruit.image)

        return view as View
    }

    override fun getItem(position: Int): Any {
        return fruit.get(position)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getCount(): Int {
        return fruit.count()
    }
}