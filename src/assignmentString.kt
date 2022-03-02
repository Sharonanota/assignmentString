fun main(){
    var y = "AkiraChix"

    var w = y[3].toString() + y[4]
    println(w)

    var e = "sharon".length
    println(e)
    var t=Fact("sharon",23)
    println(t)
    var f=statment("Sharon","Sharon")
println(f)

}
fun Fact(name:String,age:Int):String{
    var d=("Hi, my name is $name and i am $age year old")
    return d
}

fun statment(x:String,y:String){
    if(x==y) {println("that's me")}
    else{println("I don't know who that is")}
}