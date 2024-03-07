package br.senai.sp.jandira.calculadora_imc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadora_imc.ui.theme.Calculadora_imcTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calculadora_imcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(color = Color(0xFFDA2452))
            .padding(top = 20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Card(
            modifier = Modifier
                .width(60.dp)
                .height(60.dp),
            shape = CircleShape
        ) {
            Image(
                painter = painterResource(id = R.drawable.imc),
                contentDescription = "Imagem calculadora imc"
            )
        }

        Column(
            modifier = Modifier.padding(top = 15.dp)
        ) {
            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold
            )
        }

    }
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .padding(bottom = 10.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Card(
            modifier = Modifier
                .height(350.dp)
                .width(300.dp)


        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = "Seus dados",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFDA2452)
                    )
            }

            Row (
                modifier = Modifier
                    .padding(top = 20.dp)
                    .padding(start = 20.dp)
            ){
                Text(text = "Seu peso:",
                    fontSize = 18.sp,
                    color = Color(0xFFDA2452)
                )

            }

            Column (
                modifier = Modifier
                    .padding(start = 10.dp)
            ){
                OutlinedTextField(
                    value = "Insira seu peso em Kg",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Red,
                        focusedBorderColor = Color.Red,
                        ),
                    shape = RoundedCornerShape(16.dp)
                )

                Row (
                    modifier = Modifier
                        .padding(top = 20.dp)
                        .padding(start = 20.dp)
                ){
                    Text(text = "Sua altura:",
                        fontSize = 18.sp,
                        color = Color(0xFFDA2452)
                    )

                }
                OutlinedTextField(
                    value = "Sua altura em cm",
                    onValueChange = {},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Red,
                        focusedBorderColor = Color.Red,
                    ),
                    shape = RoundedCornerShape(16.dp)
                )

                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier
                        .height(60.dp)
                        .width(275.dp)
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 10.dp)
                        .background(
                            color = Color(0xFFDA2452),
                            shape = RoundedCornerShape(16.dp)
                        ), colors = ButtonDefaults.buttonColors(Color(0xFFDA2452))

                )
                {
                    Text(text = "Calcular",
                        fontSize = 20.sp
                        )
                    
                }
            }
        }
        Card (
            modifier = Modifier
                .height(130.dp)
                .padding(top = 15.dp)
                .width(300.dp)
                .background(
                    color = Color(0xFF149710),
                    shape = RoundedCornerShape(16.dp)
                ),
            colors = CardDefaults.cardColors(Color(0xFF58A056))

            ) {

            Row (
                modifier = Modifier
                    .padding(top = 15.dp)
                    .padding(start = 40.dp)
            ){
                Text(
                    text = "Resultado",
                    fontSize = 20.sp,
                    color = Color.White
                )

            }

            Row (modifier = Modifier
                .padding(start = 25.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ){

                Text(
                    text = "Peso ideal",
                    fontSize = 25.sp,
                    color = Color.White
                )

                Column (
                    modifier = Modifier
                        .padding(start = 45.dp),


                ){
                    Text(
                        text = "21.3",
                        fontSize = 40.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                }
            }



        }
    }


}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    Calculadora_imcTheme {
        Greeting()
    }
}