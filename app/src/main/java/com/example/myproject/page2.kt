import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Send
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomTextField(
    labelText: String,
    icon: ImageVector,
    height: Dp,
    width: Dp,
    value: String,
    onValueChange: (String) -> Unit
) {

    TextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier
            .height(height)
            .fillMaxWidth().padding(
                start=16.dp,
                end=16.dp,
                top=16.dp,
                bottom = 16.dp
            ),
        label = {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Icon(
                    imageVector = icon,
                    contentDescription = null,
                    modifier = Modifier.padding(end = 8.dp)
                )
                Text(text = labelText)
            }
        }
    )
}


@Preview
@Composable
fun PreviewMyScreen() {
    val name = remember { mutableStateOf("") }
    val adress = remember { mutableStateOf("") }
    val mobile = remember { mutableStateOf("") }
    val gmail = remember { mutableStateOf("") }
    val bkash = remember { mutableStateOf("") }
    val password = remember { mutableStateOf("") }

Column(
modifier = Modifier.fillMaxSize().background(Color.White)
) {
    Text(
        text = "RentCare",
        color = Color.Blue,
        fontSize = 80.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(
            start = 30.dp,
            end = 16.dp,
            top = 8.dp,
            bottom = 8.dp
        )
    )
    Text(
        text = "Create an Account",
        color = Color.Gray,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.padding(
            start = 30.dp,
            end = 16.dp,
            top = 8.dp,
            bottom = 8.dp
        )
    )
    CustomTextField(
        labelText = "Full name",
        icon = Icons.Default.Person,
        height = 80.dp,
        width = 200.dp,
        value = name.value,
        onValueChange = { newText -> name.value = newText }
    )
    CustomTextField(
        labelText = "Adress",
        icon = Icons.Default.Home,
        height = 80.dp,
        width = 200.dp,
        value = adress.value,
        onValueChange = { newText -> adress.value = newText }
    )
    CustomTextField(
        labelText = "Mobile Number",
        icon = Icons.Default.Call,
        height = 80.dp,
        width = 200.dp,
        value = mobile.value,
        onValueChange = { newText -> mobile.value = newText }
    )
    CustomTextField(
        labelText = "Gmail",
        icon = Icons.Default.Email,
        height = 80.dp,
        width = 200.dp,
        value = gmail.value,
        onValueChange = { newText -> gmail.value = newText }
    )
    CustomTextField(
        labelText = "Bkash",
        icon = Icons.Default.Send,
        height = 80.dp,
        width = 200.dp,
        value = bkash.value,
        onValueChange = { newText -> bkash.value = newText }
    )
    CustomTextField(
        labelText = "Password",
        icon = Icons.Default.AccountCircle,
        height = 80.dp,
        width = 200.dp,
        value = password.value,
        onValueChange = { newText -> password.value = newText }
    )
    Spacer(modifier = Modifier.height(25.dp))
    Column(
        Modifier.padding(start=90.dp)
    ) {
        RoundedButton(
            modifier = Modifier.padding(top = 40.dp),
            text = "Sign Up",
            buttonColor = Color.Black,
            textColor = Color.White,
            height = 48.dp,
            width = 200.dp,
            onClick = { /* Define action on button click */ }
        )
    }

}
}
