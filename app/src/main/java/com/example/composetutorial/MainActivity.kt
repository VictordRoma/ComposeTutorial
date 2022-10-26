package com.example.composetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
//import androidx.compose.ui.tooling.preview.PreviewParameter
//import com.example.composetutorial.ui.theme.ComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Define o Layout em que as funções são chamadas.
        setContent {
            //quando vc for exibir o app ele vai exibir os dois textos
            //dos MessageCard
            MessageCard("Android")
            }
        }
    }

//@Composable é oq permite criar uma função composta(dois ou mais)
//ele q tambem é resposntavem pelos textos e provavelmente imagens
//para isso sempre usar o @Composable
@Composable
//esse MessageCard pode ser trocado, ele seria o nome de validação?
// esse $name serve pra identificar o nome: String pelo q entendi.
// fun de função (acho q é isso)
fun MessageCard(name: String) {
    Text(text = "Hello $name!")
}



//O @Preview permite visualizar as funções de composição (@Composable) no Android Studio
//sem precisar criar e instalar um emulador ou dispositivo Android
//Sempre q for testar vc vai precisas criar uma segunda função relacionada
//a essa função, a criada no exemplo foi a PreviewMessageCard.
@Preview
@Composable
fun PreviewMessageCard(){
    MessageCard("Android")
}