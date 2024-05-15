package com.example.dreamboundadventures.ui.theme.Screens.Services

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.dreamboundadventures.Navigation.ROUTE_BOOKINGTRANS
import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_AIRLINE
import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_CAR
import com.example.dreamboundadventures.Navigation.ROUTE_EXPLORE_TRAIN
import com.example.dreamboundadventures.R

@Composable
fun TransportScreen(navController: NavHostController){
    Column {
        Text(text = "Road Transport")
        Card {
            Image(
                painter = painterResource(id = R.drawable.road), contentDescription = "hoteli",
            )
            Button(
                onClick = { navController.navigate(ROUTE_EXPLORE_CAR) }) {
                Text(text = "Explore More")

            }
            Card {
                Text(text = "Air Transport")
                Image(
                    painter = painterResource(id = R.drawable.british), contentDescription = "taxi",
                )
                Button(
                    onClick = { navController.navigate(ROUTE_EXPLORE_AIRLINE) }) {
                    Text(text = "Explore More")

                }
                Card {
                    Text(text = "Train Transport")
                    Image(
                        painter = painterResource(id = R.drawable.electrictrain),
                        contentDescription = "taxi",
                    )
                    Button(
                        onClick = { navController.navigate(ROUTE_EXPLORE_TRAIN) }) {
                        Text(text = "Explore More")

                    }
//                Card {
//                    Text(text = "StarBucks Hotel")
//                    Image(painter = painterResource(id= R.drawable.endpoint
//                    ), contentDescription ="taxi" ,
//                    )
//                    Button(
//                        onClick = { navController.navigate(ROUTE_BOOKINGTRANS) }) {
//                        Text(text = "Book Now")
//
//                    }

                }
            }

        }
    }
}
