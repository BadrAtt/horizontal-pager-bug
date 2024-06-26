package com.example.horizontalpagerbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.horizontalpagerbug.ui.theme.HorizontalPagerBugTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            HorizontalPagerBugTheme {
                val pagerState = rememberPagerState { 2 }
                val verticalScrollState = rememberScrollState()

                Column(
                    modifier = Modifier.verticalScroll(
                        enabled = true,
                        state = verticalScrollState
                    ),
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(300.dp)
                            .background(color = Color.Gray)
                    )

                    HorizontalPager(
                        state = pagerState,
                        pageSize = PageSize.Fill,
                        userScrollEnabled = true,
                        beyondBoundsPageCount = 1,
                    ) {
                        if (it == 0) {
                            FirstScreen()
                        } else {
                            SecondScreen()
                        }
                    }
                }
            }
        }
    }
}
