package com.study.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.study.jetpackcompose.ui.theme.JetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            //column(세로정렬), row(가로정렬) -> xml에서는 LinearLayout
            Row(
                modifier = Modifier
                    .background(color = Color.Cyan)
                    //전체화면을 차지
                    .fillMaxSize(),
              horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Greeting("Android")
                Greeting("KMP")
                Greeting("HAPPY")
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(
        text = "Hello $name!",
        //텍스트 사이즈
        fontSize = 20.sp,
        //텍스트 굵기
        fontWeight = FontWeight.Bold,
        //텍스트 컬러
        color = Color.Blue,
        //텍스트 정렬
        textAlign = TextAlign.Center,

        modifier = Modifier
            .background(color = Color.Yellow)
            //테두리
            .border(2.dp, color = Color.Green)
            .padding(10.dp)
            //width 길이를 부모 전체로 설정
            //0.5f는 반을 의미 1.0f가 1(전체)
            .fillMaxWidth(0.5f)
            //height 길이를 부모 전체로 설정
    )
}

//안드로이드 스튜디오에서 프리뷰를 보기위한 주석
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    JetpackComposeTheme {
        Greeting("Yeoooo")
    }
}