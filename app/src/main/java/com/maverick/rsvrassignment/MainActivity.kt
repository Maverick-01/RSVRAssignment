package com.maverick.rsvrassignment

import android.os.Bundle
import android.transition.AutoTransition
import android.transition.TransitionManager
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.maverick.rsvrassignment.adapters.CastAdapter
import com.maverick.rsvrassignment.adapters.MovieAdapter
import com.maverick.rsvrassignment.databinding.ActivityMainBinding
import com.maverick.rsvrassignment.model.CastModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        recyclerView()

        expandCardView()
    }

    private fun expandCardView() {
        binding.readMore.setOnClickListener {
            if (binding.hiddenView.visibility == View.VISIBLE) {
                binding.readMore.text = "READ MORE"
                TransitionManager.beginDelayedTransition(binding.mainCardView, AutoTransition())
                binding.hiddenView.visibility = View.GONE
            } else {
                binding.readMore.text = "READ LESS"
                TransitionManager.beginDelayedTransition(binding.mainCardView, AutoTransition())
                binding.hiddenView.visibility = View.VISIBLE
            }
        }
    }

    private fun recyclerView() {
        binding.castRecycler.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CastAdapter(createCastList())
        }
        binding.crewRecycler.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = CastAdapter(createCastList())
        }
        binding.similarMovie.apply {
            layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
            adapter = MovieAdapter(createCastList())
        }
        binding.upperMovieList.apply {
            layoutManager = LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
            adapter = MovieAdapter(createCastList())
        }
    }

    private fun createCastList(): ArrayList<CastModel> {
        return arrayListOf<CastModel>(
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool
            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool
            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool

            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool

            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool

            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool
            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.ryan,
                R.drawable.deadpool
            ),
            CastModel(
                "Ryan Reynolds",
                R.drawable.deadpool,
                R.drawable.deadpool
            ),
            CastModel(
                "deadpool",
                R.drawable.deadpool,
                R.drawable.deadpool
            ),
            CastModel(
                "deadpool",
                R.drawable.deadpool,
                R.drawable.deadpool
            ),
        )
    }
}