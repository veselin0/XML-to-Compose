package com.example.filmsjc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ListItem
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import com.example.filmsjc.ui.theme.FilmsJCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FilmsJCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
//                    BasicList(FakeDatabase.getAllFilms())
                    AdvancedList(FakeDatabase.getAllFilms())
                }

            }
        }
    }
}

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AdvancedListCustomizedItem(film: Film, modifier: Modifier) {
    Column(modifier = modifier) {
        ListItem(
            text = {
                Text(
                    text = film.name,
                    style = MaterialTheme.typography.h6
                )
            },
            secondaryText = {
                Text(
                    text = film.description,
                    style = MaterialTheme.typography.subtitle1,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            },
            singleLineSecondaryText = false,
            icon = { Icon(imageVector = Icons.Filled.Star, contentDescription = "Cover film") }
        )
        Divider()
    }
}

@Composable
fun AdvancedListClickableItem(title: String, modifier: Modifier) {
    Text(
        text = title,
        modifier = modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.common_padding_default)),
        style = MaterialTheme.typography.h6
    )
}

@Composable
fun AdvancedList(films: List<Film>) {
    val context = LocalContext.current
    LazyColumn {
        items(films.size) {
//            BasicItemsList(title = films[it].name)
//            AdvancedListClickableItem(title = films[it].name, modifier = Modifier.clickable {
//                Toast.makeText(context, films[it].name, Toast.LENGTH_SHORT).show()
//            })
//            Divider()
            val film = films[it]
            AdvancedListCustomizedItem(film = film, modifier = Modifier.clickable {
                Toast.makeText(context, films[it].name, Toast.LENGTH_SHORT).show()
            })
        }
    }
}

@Composable
fun BasicList(films: List<Film>) {
    Column(modifier = Modifier.verticalScroll(rememberScrollState())) {
        films.forEach { BasicItemsList(it.name) }
    }
}

@Composable
fun BasicItemsList(title: String) {
    Text(
        text = title,
        modifier = Modifier
            .fillMaxSize()
            .padding(dimensionResource(id = R.dimen.common_padding_default)),
        style = MaterialTheme.typography.h6
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FilmsJCTheme {
        AdvancedList(FakeDatabase.getAllFilms())

    }
}