package com.example.jetpackcomposebasics

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
<<<<<<< HEAD
=======
import androidx.compose.material.Checkbox
>>>>>>> e71381034fa7ce27db494f96f8532676f8784085
import androidx.compose.material.Chip
import androidx.compose.material.ChipDefaults
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Switch
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.wear.tiles.material.Chip


@Preview(showBackground = true, showSystemUi = true, locale = "bg")
@Composable
private fun ComponentsPreview() {
//    NewTextView()

    Components()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewTextFieldOutlined() {
    var textValue by remember { mutableStateOf("") }
    var passValue by remember { mutableStateOf("") }

    OutlinedTextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = { Text(text = stringResource(id = R.string.moreData)) },
        singleLine = true,
        modifier = Modifier.fillMaxWidth()
    )

    OutlinedTextField(
        value = passValue,
        onValueChange = { passValue = it },
        label = { Text(text = "Enter Password") },
        visualTransformation = PasswordVisualTransformation(),
        trailingIcon = {
            if (passValue.isNotEmpty()) {
                Icon(
                    imageVector = Icons.Filled.Clear,
                    contentDescription = "Clear content icon",
                    modifier = Modifier.clickable { passValue = "" })
            }
        },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun CustomDivider() {
    Spacer(modifier = Modifier.height(8.dp))
    Divider(Modifier.fillMaxWidth())
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun Components(modifier: Modifier = Modifier) {
<<<<<<< HEAD
   Column(modifier = modifier
       .verticalScroll(rememberScrollState())
       .background(Color.Cyan)) {
       Card(
           modifier = modifier
               .fillMaxWidth()
               .padding(8.dp)
       ) {
           Column(Modifier.padding(8.dp)) {
               NewTextView()
               CustomDivider()
               NewTextField()
               NewTextFieldOutlined()
               CustomDivider()
               NewImageView()
               CustomDivider()
               NewChip()
               CustomDivider()
               NewButton()
               CustomDivider()
               NewBadge()
//            CustomDivider()
               NewChecks()
           }
       }
   }
}

@Composable
fun NewChecks() {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        var isCheckboxChecked by remember { mutableStateOf(false) }
        Checkbox(checked = isCheckboxChecked, onCheckedChange = { isCheckboxChecked = it })
        Text(text = "T&C")

        Spacer(modifier = Modifier.weight(1f))

        var isSwitchChecked by remember { mutableStateOf(false) }
        Text(text = "Announcements")
        Switch(checked = isSwitchChecked, onCheckedChange = {isSwitchChecked = it})
=======
    Column(modifier = modifier
        .verticalScroll(rememberScrollState())
        .background(Color.Cyan)) {
        Card(
            modifier = modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column(Modifier.padding(8.dp)) {
                NewTextView()
                CustomDivider()
                NewTextField()
                NewTextFieldOutlined()
                CustomDivider()
                NewImageView()
                CustomDivider()
                NewChip()
                CustomDivider()
                NewButton()
                CustomDivider()
                NewBadge()
                CustomDivider()
                NewChecks()
            }
        }
>>>>>>> e71381034fa7ce27db494f96f8532676f8784085
    }
}

@Composable
fun NewChecks() {
    Row(verticalAlignment = Alignment.CenterVertically) {
        var isCheckboxChecked by remember { mutableStateOf(false) }
        Checkbox(checked = isCheckboxChecked, onCheckedChange = { isCheckboxChecked = it })
        Text(text = "Terms & Conditions")

        Spacer(modifier = Modifier.weight(1f))

        var isSwitchChecked by remember { mutableStateOf(false) }
        Text(text = "Announces")
        Switch(checked = isSwitchChecked, onCheckedChange = { isSwitchChecked = it })

    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewBadge() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        BadgedBox(badge = {
            Badge {
                val badgeNumber = "5"
                Text(
                    text = badgeNumber,
                    modifier = Modifier.semantics { contentDescription = "$badgeNumber items" })
            }
        }) {
            Icon(
                imageVector = Icons.Filled.ShoppingCart,
                contentDescription = "Shopping Cart Icon"
            )
        }

        OutlinedButton(onClick = { }) {
            Text(text = "View Cart")
            BadgedBox(badge = {
                Badge() {
                    val badgeNumber = "5"
                    Text(
                        text = badgeNumber,
                        modifier = Modifier.semantics { contentDescription = "$badgeNumber items" }
                    )
                }
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            }) {
                Icon(
                    imageVector = Icons.Filled.ShoppingCart,
                    contentDescription = "Shopping Cart Icon",

                    )
            }
        }
    }
}

@Composable
fun NewButton() {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Button(onClick = { }) { Text(text = "Finish") }
        Button(onClick = { }) {
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = "Close Icon",
                modifier = Modifier.size(ButtonDefaults.IconSize)
            )
            Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
            Text(text = "Send")
        }
        OutlinedButton(onClick = { }) { Text(text = "Back") }
        TextButton(onClick = { }) { Text(text = "Exit") }
    }
}


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun NewChip() {
    Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
        Chip(onClick = { }) { Text(text = "Label") }
        Chip(onClick = { }, leadingIcon = {
            Icon(
                imageVector = Icons.Filled.Notifications,
                contentDescription = "Notification"
            )
        }, modifier = Modifier.padding(start = 4.dp)) {
            Text(text = "Label")
            Icon(
                imageVector = Icons.Filled.Close,
                contentDescription = "Notification",
                modifier = Modifier.size(16.dp)
            )
        }
        Chip(
            onClick = { },
            border = ChipDefaults.outlinedBorder,
            colors = ChipDefaults.outlinedChipColors()
        ) { Text(text = "Label") }
    }
}

@Composable
fun NewImageView() {
    Row(horizontalArrangement = Arrangement.spacedBy(16.dp)) {
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Image of a kitten",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .clip(CircleShape)
        )

        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Image of a kitten",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(120.dp)
                .aspectRatio(3f / 4f)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_background),
            contentDescription = "Image of a kitten",
            modifier = Modifier
                .size(120.dp)
                .aspectRatio(4f / 3f)
                .blur(
//                    radius = 8.dp, edgeTreatment = BlurredEdgeTreatment(CircleShape)
                    radius = 8.dp, edgeTreatment = BlurredEdgeTreatment(RoundedCornerShape(8.dp))
//                    radius = 8.dp, edgeTreatment = BlurredEdgeTreatment.Unbounded
                )
        )
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewTextField() {
    var textValue by remember { mutableStateOf("Hi!") }

    TextField(
        value = textValue,
        onValueChange = { textValue = it },
        label = { Text(text = "Enter Data") },
        modifier = Modifier.fillMaxWidth()
    )
}

@Composable
fun NewTextView() {
    Column {
        Text(
            text = "Jetpack Compose",
            color = Color.Red,
            fontSize = 28.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.ExtraBold,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Black,
                    offset = Offset(2f, 2f),
                    blurRadius = 4f
                )
            )
        )

        Text(
            text = "Jetpack Compose desde cero, migra tus vistas de Android XML. " +
                    "Jetpack Compose desde cero, migra tus vistas de Android XML",
            style = MaterialTheme.typography.bodyLarge,
            maxLines = 2,
            overflow = TextOverflow.Ellipsis
        )

        Text(text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 24.sp,
                    fontWeight = FontWeight.ExtraBold
                )
            ) { append("Batman") }
            append(", Bruce Wayne")
        })

        Text(
            text = "Diseños avanzados en Text.",
            Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.titleMedium
        )
    }
}
