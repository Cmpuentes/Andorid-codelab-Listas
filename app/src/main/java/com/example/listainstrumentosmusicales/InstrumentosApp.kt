package com.example.listainstrumentosmusicales

import android.annotation.SuppressLint
import android.icu.text.CaseMap.Title
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.backgroundLight
import com.example.listainstrumentosmusicales.data.listaInstrumentos
import com.example.listainstrumentosmusicales.ui.theme.ListaInstrumentos

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun InstrumentosApp(){
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                    ){
                        Image(
                            painter = painterResource(R.drawable.carta),
                            contentDescription = null,
                        )
                        Text(text = "oof!", style = MaterialTheme.typography.displaySmall)
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) {
        ListaInstrumentos(instrumentos = listaInstrumentos)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewInstrumentosApp(){
    InstrumentosApp()
}