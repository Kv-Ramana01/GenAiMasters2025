package Day5

class LoginFailedException(message: String): Exception(message)

fun login(user: String){
    if(user!= "admin") {
        throw LoginFailedException("Login failed for user: $user")
    }else{
        println("Login Successful!!")
    }
}

fun main(){
    try{
        login("admin")
    }catch (e: LoginFailedException){
        println(e.message)
    }
}