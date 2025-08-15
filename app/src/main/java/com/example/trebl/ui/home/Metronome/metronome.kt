package com.example.trebl.ui.home.metronome

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Metronome(
    tempo: Int,
    onTempoChange: (Int) -> Unit,
    label: String,
    modifier: Modifier = Modifier   
) {

    // I for some reason want three options of inputting a bpm because in a pinch I just want ease
    // of use
    var inputValue by remember { mutableStateOf("") }

    Column (
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
//        // Here all UI elements will be stacked below each other
//        OutlinedTextField(
//            value = inputValue,
//            onValueChange = {
//                inputValue = it
//                // Here goes what should happen, when the Value of our OutliedTexField changes}
//            },
//            label = {  })

        Text(
                text = label,
                style = MaterialTheme.typography.labelMedium,
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center
            )

        Row (
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            //Metronome - Tempo
            Text(
                text = tempo.toString(),
                style = MaterialTheme.typography.titleLarge,
                modifier = Modifier.width(ButtonDefaults.MinWidth),
                textAlign = TextAlign.Center
            )

            Box(
                contentAlignment = Alignment.Center,
//                modifier = Modifier.clip(CircleShape)

            ) {
//
//                Button(onClick = { iExpanded = true }) {
//                    Text(text = inputUnit)
//                    Icon(
//                        Icons.Default.ArrowDropDown,
//                        contentDescription = "Arrow Down"
//                    )
//                }
//
//
//                Spacer(modifier = Modifier.width(16.dp))
//
//                //Output Box
//                Box {
//                    Button(onClick = { oExpanded = true }) {
//                        Text(text = outputUnit)
//                        Icon(
//                            Icons.Default.ArrowDropDown,
//                            contentDescription = "Arrow Down"
//                        )
//                    }
//                    DropdownMenu(expanded = , onDismissRequest = {  }) {
//                        DropdownMenuItem(
//                            text = { Text("Centimeters") },
//                            onClick = {
//
//                            }
//                        )
//                        DropdownMenuItem(
//                            text = { Text("Meters") },
//                            onClick = {
//
//                            }
//                        )
//                        DropdownMenuItem(
//                            text = { Text("Feet") },
//                            onClick = {
//
//                            }
//                        )
//                        DropdownMenuItem(
//                            text = { Text("Millimeters") },
//                            onClick = {
//
//                            }
//                        )
//                        DropdownMenuItem(
//                            text = { Text("Inches") },
//                            onClick = {
//
//                            }
                        //)
                    }
                }
            }
        }
    //}
//}



