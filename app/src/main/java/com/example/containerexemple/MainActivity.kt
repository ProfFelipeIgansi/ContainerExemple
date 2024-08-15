package com.example.containerexemple

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.containerexemple.ui.theme.ContainerExempleTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ContainerExempleTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ContainersExemple(padding = innerPadding)
                }
            }
        }
    }
}


@Composable
fun ContainersExemple(padding: PaddingValues) {
    /* val users = listOf(
         "Liam", "Olivia", "Noah", "Emma", "Oliver", "Ava", "Elijah", "Sophia", "William", "Isabella",
         "James", "Mia", "Benjamin", "Evelyn", "Lucas", "Harper", "Henry", "Camila", "Alexander", "Gianna",
         "Michael", "Abigail", "Ethan", "Luna", "Daniel", "Ella", "Jacob", "Elizabeth", "Logan", "Sofia",
         "Jackson", "Avery", "Levi", "Scarlett", "Sebastian", "Emily", "Mateo", "Aria", "Jack", "Penelope",
         "Owen", "Chloe", "Theodore", "Layla", "Aiden", "Mila", "Samuel", "Nora", "Joseph", "Hazel",
         "John", "Madison", "David", "Ellie", "Wyatt", "Lily", "Matthew", "Nova", "Luke", "Isla",
         "Asher", "Grace", "Carter", "Violet", "Julian", "Aurora", "Grayson", "Riley", "Leo", "Zoey",
         "Jayden", "Willow", "Gabriel", "Emilia", "Isaac", "Stella", "Lincoln", "Zoe", "Anthony", "Victoria",
         "Hudson", "Hannah", "Dylan", "Addison", "Ezra", "Lucy", "Thomas", "Paisley", "Charles", "Savannah",
         "Christopher", "Serenity", "Jaxon", "Skylar", "Maverick", "Leah", "Josiah", "Lillian", "Isaiah", "Claire"
     )*/
    val users2 = mapOf(
        1 to "Liam",
        2 to "Olivia",
        3 to "Noah",
        4 to "Emma",
        5 to "Oliver",
        6 to "Ava",
        7 to "Elijah",
        8 to "Sophia",
        9 to "William",
        10 to "Isabella",
        11 to "James",
        12 to "Mia",
        13 to "Benjamin",
        14 to "Evelyn",
        15 to "Lucas",
        16 to "Harper",
        17 to "Henry",
        18 to "Camila",
        19 to "Alexander",
        20 to "Gianna",
        21 to "Michael",
        22 to "Abigail",
        23 to "Ethan",
        24 to "Luna",
        25 to "Daniel",
        26 to "Ella",
        27 to "Jacob",
        28 to "Elizabeth",
        29 to "Logan",
        30 to "Sofia",
        31 to "Jackson",
        32 to "Avery",
        33 to "Levi",
        34 to "Scarlett",
        35 to "Sebastian",
        36 to "Emily",
        37 to "Mateo",
        38 to "Aria",
        39 to "Jack",
        40 to "Penelope",
        41 to "Owen",
        42 to "Chloe",
        43 to "Theodore",
        44 to "Layla",
        45 to "Aiden",
        46 to "Mila",
        47 to "Samuel",
        48 to "Nora",
        49 to "Joseph",
        50 to "Hazel",
        51 to "John",
        52 to "Madison",
        53 to "David",
        54 to "Ellie",
        55 to "Wyatt",
        56 to "Lily",
        57 to "Matthew",
        58 to "Nova",
        59 to "Luke",
        60 to "Isla",
        61 to "Asher",
        62 to "Grace",
        63 to "Carter",
        64 to "Violet",
        65 to "Julian",
        66 to "Aurora",
        67 to "Grayson",
        68 to "Riley",
        69 to "Leo",
        70 to "Zoey",
        71 to "Jayden",
        72 to "Willow",
        73 to "Gabriel",
        74 to "Emilia",
        75 to "Isaac",
        76 to "Stella",
        77 to "Lincoln",
        78 to "Zoe",
        79 to "Anthony",
        80 to "Victoria",
        81 to "Hudson",
        82 to "Hannah",
        83 to "Dylan",
        84 to "Addison",
        85 to "Ezra",
        86 to "Lucy",
        87 to "Thomas",
        88 to "Paisley",
        89 to "Charles",
        90 to "Savannah",
        91 to "Christopher",
        92 to "Serenity",
        93 to "Jaxon",
        94 to "Skylar",
        95 to "Maverick",
        96 to "Leah",
        97 to "Josiah",
        98 to "Lillian",
        99 to "Isaiah",
        100 to "Claire"
    )
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(padding)
    ) {
        LazyColumn(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center
        ) {
            users2.forEach { (key, value) ->
                item {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceAround,
                        modifier = Modifier.fillMaxWidth()
                    ) {
                        Text(text = "Chave $key")
                        Text(
                            text = "Valor $value",
                            fontSize = 18.sp,
                            color = Color.Blue,
                            modifier = Modifier.padding(10.dp)
                        )
                    }
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ContainersExemplesPreview() {
    ContainersExemple(padding = PaddingValues())
}