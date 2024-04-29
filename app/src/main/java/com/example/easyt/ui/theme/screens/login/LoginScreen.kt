package com.example.easyt.ui.theme.screens.login

@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)

    )
    {

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 120.dp)
                    .padding(top = 20.dp)
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.icon),
                        contentDescription = "print",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "BelizziTravel",
                        fontWeight = FontWeight.Bold,
                        fontSize = 35.sp,
                        fontFamily = FontFamily.Cursive,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "email",
                color = Color.White) },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password",
                color = Color.White) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = {
                authViewModel.login(email, password)
            }) {
                Text(text = "Sign In")
            }
        }
    }
}
@Composable
@Preview(showBackground = true, showSystemUi = true)
fun LoginScreenPreview() {
    EasyTravelsTheme {
        LoginScreen(navController = rememberNavController())
    }
}