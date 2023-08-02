package com.example.jetpackcomposebasics

import androidx.compose.foundation.layout.padding
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.ExtendedFloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import kotlinx.coroutines.launch

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun SystemComplementsPreview() {
    NewAppBars()
}

@Composable
fun NewAppBars() {
    val scaffoldState = rememberScaffoldState()
    val scope = rememberCoroutineScope()
    Scaffold(
        scaffoldState = scaffoldState,
        topBar = {
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.app_name)) },
                actions = {
                    var isMenuOpened by remember { mutableStateOf(false) }
                    IconButton(onClick = { isMenuOpened = true }) {
                        Icon(
                            imageVector = Icons.Filled.MoreVert,
                            contentDescription = "Menu Options"
                        )
                        NewMenu(isExpanded = isMenuOpened, onItemClick = {
                            scope.launch { scaffoldState.snackbarHostState.showSnackbar(it) }
                        }) {
                            isMenuOpened = false
                        }
                    }
                }
            )
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text(text = "Add") },
                onClick = {
                    scope.launch {
                        scaffoldState
                            .snackbarHostState
                            .showSnackbar("Launch Fragment / Dialog")
                    }
                })
        },
        content = {
            Components(modifier = Modifier.padding(it))
        })
}

@Composable
fun NewMenu(isExpanded: Boolean, onItemClick: (String) -> Unit, onDismiss: () -> Unit) {
    val items = listOf("Favourite", "Save Mode", "History", "Settings")

    DropdownMenu(expanded = isExpanded, onDismissRequest = onDismiss) {
        items.forEach { item ->
            DropdownMenuItem(onClick = {
                onItemClick(item)
                onDismiss()
            }) {
                Text(text = item)
            }
        }
    }
}