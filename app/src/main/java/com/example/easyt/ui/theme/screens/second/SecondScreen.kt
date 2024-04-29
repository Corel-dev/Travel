package com.example.easyt.ui.theme.screens.second

@Composable
fun SecondScreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)) {
        Box (modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Box (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, top = 20.dp)){
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.icon) ,
                        contentDescription = "print",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                }

            }

        }

    }
    Column(modifier = Modifier
        .padding(top = 400.dp, start = 70.dp)) {
        Box (modifier = Modifier
            .padding(start = 80.dp)){
            Button(onClick = { navController.navigate(LOGIN_URL)}) {
                Text(text = "Login")

            }

        }
        Spacer(modifier = Modifier.height(5.dp))
        Row {
            Spacer(modifier = Modifier.height(25.dp))
            Divider(modifier = Modifier
                .width(110.dp)
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .height(2.dp),
                color = Color.Black)
            Text(text = "or")
            Divider(modifier = Modifier
                .width(110.dp)
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .height(2.dp),
                color = Color.Black)
        }
        Text(text = "Don't have an Account ?",
            modifier = Modifier
                .padding(start = 42.dp))
        Spacer(modifier = Modifier.height(15.dp))
        Box (modifier = Modifier
            .padding(start = 80.dp)){
            Button(onClick = { navController.navigate(SIGNUP_URL) }) {
                Text(text = "Sign Up")

            }

        }

    }

}
@Composable
@Preview(showBackground = true)
fun SecondScreenPreview(){
    EasyTravelsTheme {
        SecondScreen(navController = rememberNavController())
    }
}