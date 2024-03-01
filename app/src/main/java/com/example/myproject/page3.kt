import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myproject.R
import com.example.myproject.ui.theme.MyProjectTheme
import org.intellij.lang.annotations.JdkConstants

@Preview(showBackground = true)
@Composable
fun Page3Preview() {
    Column(
        Modifier.fillMaxSize()

    ) {
        Image(
            painter = painterResource(id = R.drawable.cartoon_squirrel_make_welcome_gesture_26558107),
            contentDescription = null,
            modifier = Modifier

        )
        Text(
            text = "WELCOME",
            color = Color.Black,
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(
                start = 30.dp,
                end = 16.dp,
                top = 8.dp,
                bottom = 8.dp
            )
        )
        Column(
            Modifier.padding(start=30.dp)
        )
        {
            Text(
                text = "hope you will enjoy"
                        ,
                color = Color.Magenta,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(
                    start = 30.dp,
                    end = 16.dp,
                    top = 8.dp,

                )
            )
            Text(
                text = "your flat maintanance" ,
                color = Color.Magenta,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(
                    start = 16.dp,
                    end = 16.dp,


                )
            )
            Text(
                text = "journey !",
                color = Color.Magenta,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(
                    start = 100.dp,
                    end = 16.dp,


                )
            )
        }
        Spacer(modifier = Modifier.height(25.dp))
        Column(
            Modifier.padding(start=90.dp)
        ) {
            RoundedButton(
                modifier = Modifier.padding(top = 40.dp),
                text = "Get Started",
                buttonColor = Color.Black,
                textColor = Color.White,
                height = 48.dp,
                width = 200.dp,
                onClick = { /* Define action on button click */ }
            )
        }
    }
}