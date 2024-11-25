package com.example.listainstrumentosmusicales.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExpandMore
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.listainstrumentosmusicales.R
import com.example.listainstrumentosmusicales.data.Instrumento

/*
Ahora vamos a crear una Composable Function para representar cada instrumento en la lista.
La imagen será circular y estará acompañada por el nombre y la descripción a su derecha.
 */
@Composable
fun InstrumentoItem(instrumento: Instrumento){
    var expanded by remember { mutableStateOf(false) }
    Card (
        modifier = Modifier.padding(10.dp),
        shape = RoundedCornerShape(
        topStart = 15.dp,
        bottomStart = 50.dp,
        topEnd = 50.dp,
        bottomEnd = 15.dp
        )
    ){
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            Image(
                painter = painterResource(instrumento.imagenResId),
                contentDescription = null,
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp))
            Column {
                Text(text = stringResource(instrumento.nombre), style = MaterialTheme.typography.bodyLarge)
                Text(text = stringResource(instrumento.descripcion), style = MaterialTheme.typography.bodySmall)
            }
            
            ItemInstrumentoButton(
                expanded = expanded,
                onClick = { /*TODO*/ }
            )
        }
    }
}

@Composable
private fun ItemInstrumentoButton(
    expanded: Boolean,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    IconButton(
        onClick = onClick,
        modifier = modifier
    ) {
        Icon(imageVector = Icons.Filled.ExpandMore, contentDescription = stringResource(androidx.compose.material3.R.string.bottom_sheet_expand_description),
            tint = MaterialTheme.colorScheme.secondary
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCarditem(){
    InstrumentoItem(instrumento = Instrumento(R.string.instrumento_guitarra, R.string.des_guitarra, R.drawable.guitarra))
}
        
