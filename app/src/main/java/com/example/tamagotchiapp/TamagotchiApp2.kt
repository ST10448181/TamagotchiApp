package com.example.tamagotchiapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextClock
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TamagotchiApp2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_tamagotchi_app2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets



        }
        //declartions
        val play =findViewById<Button>(R.id.play)
        val feed =findViewById<Button>(R.id.feed)
        val clean =findViewById<Button>(R.id.clean)
        val playtextview =findViewById<TextView>(R.id.playtextview)
        val feedtextview =findViewById<TextView>(R.id.feedtextview)
        val cleantextview =findViewById<TextView>(R.id.cleantextview)
        val petimages =findViewById<ImageView>(R.id.petimages)


        // the logic for the play button
        play.setOnClickListener{
            petimages.setImageResource(R.drawable.playing)
            // the pet is now playing
            playtextview.text = "im done playing and im so tired can you please feed me"
        }

        feed.setOnClickListener{
            petimages.setImageResource(R.drawable.eating)
            feedtextview.text = "the food was nice thank you, im a bit dirty from the play can you please give me a shower"
        }
        clean.setOnClickListener{
            petimages.setImageResource(R.drawable.bathing)
            cleantextview.text = "the shower was so warm thank you "
        }







    }



}