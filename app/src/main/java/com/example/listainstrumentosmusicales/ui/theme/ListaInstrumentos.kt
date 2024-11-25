package com.example.listainstrumentosmusicales.ui.theme

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.listainstrumentosmusicales.data.Instrumento

@Composable
fun ListaInstrumentos (instrumentos: List<Instrumento>){
    LazyColumn {
        items(instrumentos) { instrumento ->
            InstrumentoItem(instrumento = instrumento)
        }
    }
}