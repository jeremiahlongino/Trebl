package com.example.trebl.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        enableEdgeToEdge()
        updateWidgetPreview(this)
        setContent {
//            val displayFeatures = calculateDisplayFeatures(this)
//
//            TreblTheme {
//                //TreblApp(
//                    displayFeatures,
//                )
//            }
        }
    }

    private fun updateWidgetPreview(mainActivity: MainActivity) {

    }
}