package com.sachin.heroapp.presentation.screens.home

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.sachin.heroapp.R
import com.sachin.heroapp.ui.theme.topAppBarBackgroundColor
import com.sachin.heroapp.ui.theme.topAppBarContentColor


@Composable
fun HomeTopBar(onSearchClicked: () -> Unit) {
    TopAppBar(
        title = {
            Text(
                text = "Hero",
                color = MaterialTheme.colors.topAppBarContentColor
            )
        },
//        backgroundColor = MaterialTheme.colors.topAppBarBackgroundColor,
//        actions = {
//            IconButton(onClick = onSearchClicked) {
//                Icon(
//                    imageVector = Icons.Default.Search,
//                    contentDescription = stringResource(R.string.Search)
//                )
//            }
//        }
    )
}

@Composable
@Preview
fun HomeTopBarPreview() {
    HomeTopBar {}
}
