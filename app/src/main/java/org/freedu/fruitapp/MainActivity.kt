package org.freedu.fruitapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import org.freedu.fruitapp.adapter.FruitAdapter
import org.freedu.fruitapp.databinding.ActivityMainBinding
import org.freedu.fruitapp.model.Fruit

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.fruitRv.layoutManager = LinearLayoutManager(this)
        val fruit = ArrayList<Fruit>()

        fruit.add(Fruit("Apple", 20, 4.0, R.drawable.apple, "Apple"))
        fruit.add(Fruit("Orange", 30, 3.0, R.drawable.orange, "Orange"))
        fruit.add(Fruit("Banana", 100, 1.0, R.drawable.banana, "Banana"))
        fruit.add(Fruit("Strawberry", 200, 5.0, R.drawable.strawberry, "Strawberry"))
        fruit.add(Fruit("Mango", 20, 4.0, R.drawable.mango, "Mango"))
        fruit.add(Fruit("Kiwi", 50, 6.0, R.drawable.kiwi, "Kiwi"))
        fruit.add(Fruit("Dragon Fruit", 10, 2.0, R.drawable.dragon, "Dragon Fruit"))
        fruit.add(Fruit("Berry", 2023, 7.0, R.drawable.berry, "Berry"))
        fruit.add(Fruit("Grape", 3000, 5.0, R.drawable.grape, "Grape"))
        fruit.add(Fruit("Jack Fruit", 20, 8.0, R.drawable.jackfruit, "Jack Fruit"))
        fruit.add(Fruit("Apple", 20, 4.0, R.drawable.apple, "Apple"))
        fruit.add(Fruit("Orange", 30, 3.0, R.drawable.orange, "Orange"))
        fruit.add(Fruit("Banana", 100, 1.0, R.drawable.banana, "Banana"))
        fruit.add(Fruit("Strawberry", 200, 5.0, R.drawable.strawberry, "Strawberry"))
        fruit.add(Fruit("Mango", 20, 4.0, R.drawable.mango, "Mango"))
        fruit.add(Fruit("Kiwi", 50, 6.0, R.drawable.kiwi, "Kiwi"))
        fruit.add(Fruit("Dragon Fruit", 10, 2.0, R.drawable.dragon, "Dragon Fruit"))
        fruit.add(Fruit("Berry", 2023, 7.0, R.drawable.berry, "Berry"))
        fruit.add(Fruit("Grape", 3000, 5.0, R.drawable.grape, "Grape"))
        fruit.add(Fruit("Jack Fruit", 20, 8.0, R.drawable.jackfruit, "Jack Fruit"))
        fruit.add(Fruit("Apple", 20, 4.0, R.drawable.apple, "Apple"))
        fruit.add(Fruit("Orange", 30, 3.0, R.drawable.orange, "Orange"))
        fruit.add(Fruit("Banana", 100, 1.0, R.drawable.banana, "Banana"))
        fruit.add(Fruit("Strawberry", 200, 5.0, R.drawable.strawberry, "Strawberry"))
        fruit.add(Fruit("Mango", 20, 4.0, R.drawable.mango, "Mango"))
        fruit.add(Fruit("Kiwi", 50, 6.0, R.drawable.kiwi, "Kiwi"))
        fruit.add(Fruit("Dragon Fruit", 10, 2.0, R.drawable.dragon, "Dragon Fruit"))
        fruit.add(Fruit("Berry", 2023, 7.0, R.drawable.berry, "Berry"))
        fruit.add(Fruit("Grape", 3000, 5.0, R.drawable.grape, "Grape"))
        fruit.add(Fruit("Jack Fruit", 20, 8.0, R.drawable.jackfruit, "Jack Fruit"))

        var fruitAdapter = FruitAdapter(fruit)
        binding.fruitRv.adapter = fruitAdapter

        fruitAdapter.onClick={
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", it.fruitName)
            intent.putExtra("price", it.fruitPrice)
            intent.putExtra("quantity", it.fruitQnt)
            intent.putExtra("desc", it.fruitDesc)
            intent.putExtra("image", it.fruitImg)
            startActivity(intent)
        }

    }
}