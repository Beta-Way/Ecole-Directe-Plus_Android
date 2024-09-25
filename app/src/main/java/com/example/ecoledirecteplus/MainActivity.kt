package com.example.ecoledirecteplus

import android.net.Uri
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.browser.customtabs.CustomTabsIntent
import com.example.ecoledirecteplus.ui.theme.EcoleDirectePlusTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            EcoleDirectePlusTheme {
                // Ouvre l'URL dans Custom Tabs
                OpenCustomTab("https://ecole-directe.plus/app/")
            }
        }
    }

    // Fonction pour ouvrir une URL dans Custom Tabs
    private fun OpenCustomTab(url: String) {
        val uri = Uri.parse(url)
        val customTabsIntent = CustomTabsIntent.Builder().build()
        customTabsIntent.launchUrl(this, uri)
    }
}