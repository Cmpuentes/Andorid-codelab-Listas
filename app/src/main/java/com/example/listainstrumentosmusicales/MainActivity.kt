package com.example.listainstrumentosmusicales

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.listainstrumentosmusicales.data.listaInstrumentos
import com.example.listainstrumentosmusicales.ui.theme.ListaInstrumentos
import com.example.listainstrumentosmusicales.ui.theme.ListaInstrumentosMusicalesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ListaInstrumentosMusicalesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ListaInstrumentos(instrumentos = listaInstrumentos)
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListaInstrumentosMusicalesTheme {
        ListaInstrumentos(instrumentos = listaInstrumentos)
    }
}