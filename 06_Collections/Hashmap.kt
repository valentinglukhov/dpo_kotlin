fun main () {
    val numberOfUsers = 3
    var currentUser = 1
    val authorizationData = hashMapOf<String, String>()
    while (currentUser <= numberOfUsers) {
        authorizationData += authorizationDataInput(authorizationData, numberOfUsers, currentUser)
        currentUser++
    }
    println()
    for ((user, password) in authorizationData) println("$user - $password")

    println("Авторизация пользователей:")
    authorizationForm(authorizationData)
}

fun authorizationForm (authorizationData: HashMap<String, String>) {
    print("Введите логин: ")
    val userLogin = readln()
    val userExists = authorizationData.keys.contains(userLogin)
    if (userLogin != null && userLogin.isNotEmpty() && userExists) {
        do {
            print("Введите пароль: ")
            val userPassword = readln()
            val loginSuccess = (userPassword != null && userPassword.isNotEmpty() && userPassword == authorizationData[userLogin])
            if (!loginSuccess) println("Указан неверный логин или пароль.")
        } while (!loginSuccess)
        println("Добро пожаловать $userLogin!")
    } else {
        println("Указан несуществующий или пустой логин.")
        authorizationForm(authorizationData)
    }
}

fun authorizationDataInput (authorizationData: HashMap<String, String>, numberOfUsers: Int, currentUser: Int, cycleStatus: Int = 0) : HashMap<String, String> {
    if (cycleStatus == 0) println ("Подготовка данных начата:")
    print("Введите логин для пользователя №$currentUser: ")
    var userPassword = ""
    val userLogin: String = readln()
    if (userLogin != null && userLogin.isNotEmpty()) {
        val userAlreadyExists = authorizationData.keys.contains(userLogin)
        if (userAlreadyExists) {
            println("Предупреждение. Пользователь с указанным логином уже существует, введите пожалуйста другой логин.")
            authorizationDataInput(authorizationData, numberOfUsers, currentUser, 1)
        } else {
            print("Введите пароль для пользователя №$currentUser: ")
            var isBlanc = 1
            while (isBlanc == 1) {
                userPassword = readln()
                if (!userPassword.isNotEmpty()) {
                        print("Предупреждение! Пароль не может быть пустым.\nВведите пароль для пользователя №$currentUser: ")
                    } else {
                        isBlanc++
                }
            }
            authorizationData.put(userLogin, userPassword)
        }
    } else {
        print("Логин не может быть пустым, пожалуйста введите логин для пользователя №$currentUser: ")
        authorizationDataInput(authorizationData, numberOfUsers, currentUser, 1)
    }
    return authorizationData
}