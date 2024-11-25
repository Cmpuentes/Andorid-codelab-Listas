package com.example.listainstrumentosmusicales.data

import com.example.listainstrumentosmusicales.R

data class Instrumento(
    val nombre: Int,
    val descripcion: Int,
    val imagenResId: Int
)

val listaInstrumentos = listOf(
    Instrumento(nombre = R.string.instrumento_acordeon, descripcion = R.string.des_acordeon, imagenResId = R.drawable.acordeon),
    Instrumento(nombre = R.string.instrumento_bateria, descripcion = R.string.des_bateria, imagenResId = R.drawable.bateria),
    Instrumento(nombre = R.string.instrumento_bongos, descripcion = R.string.des_bongos, imagenResId = R.drawable.bongos),
    Instrumento(nombre = R.string.instrumento_campana, descripcion = R.string.des_campana, imagenResId = R.drawable.campana),
    Instrumento(nombre = R.string.instrumento_cascabel, descripcion = R.string.instrumento_cascabel, imagenResId = R.drawable.cascabel),
    Instrumento(nombre = R.string.instrumento_conga, descripcion = R.string.des_conga, imagenResId = R.drawable.conga),
    Instrumento(nombre = R.string.instrumento_flauta, descripcion = R.string.des_flauta, imagenResId = R.drawable.flauta),
    Instrumento(nombre = R.string.instrumento_flauta_pan, descripcion = R.string.des_flauta_de_pan, imagenResId = R.drawable.flauta_de_pan),
    Instrumento(nombre = R.string.instrumento_gaita, descripcion = R.string.des_gaita, imagenResId = R.drawable.gaita),
    Instrumento(nombre = R.string.instrumento_guitarra, descripcion = R.string.des_guitarra, imagenResId = R.drawable.guitarra),
    Instrumento(nombre = R.string.instrumento_guitarra_electrica, descripcion = R.string.des_guitarra_electrica, imagenResId = R.drawable.guitarra_electrica),
    Instrumento(nombre = R.string.instrumento_maracas, descripcion = R.string.des_maracas, imagenResId = R.drawable.maracas),
    Instrumento(nombre = R.string.instrumento_piano_de_cola, descripcion = R.string.des_piano_de_cola, imagenResId = R.drawable.piano_de_cola),
    Instrumento(nombre = R.string.instrumento_platillos, descripcion = R.string.des_platillos, imagenResId = R.drawable.platillos),
    Instrumento(nombre = R.string.instrumento_saxofon, descripcion = R.string.des_saxofon, imagenResId = R.drawable.saxofon),
    Instrumento(nombre = R.string.instrumento_tambor, descripcion = R.string.des_tambor, imagenResId = R.drawable.tambor),
    Instrumento(nombre = R.string.instrumento_trombon, descripcion = R.string.des_trombon, imagenResId = R.drawable.trombon),
    Instrumento(nombre = R.string.instrumento_trompeta, descripcion = R.string.des_trompeta, imagenResId = R.drawable.trompeta),
    Instrumento(nombre = R.string.instrumento_violin, descripcion = R.string.des_violin, imagenResId = R.drawable.violin),
    Instrumento(nombre = R.string.instrumento_xilofono, descripcion = R.string.des_xilofono, imagenResId = R.drawable.xilofono),
    )
