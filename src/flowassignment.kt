fun main() {
   println(isEven(2))
   println(isEven(7))
   var product=Product("book",3,1000,"hygiene")
    product.getBook()
    println(getFruits("banana"))
    
}
fun isEven(num:Int):Boolean{
   if(num%2==0){
       return  true
   }
    else {
        return false
   }
}
class Product(name:String,weight:Int,price:Int,category:String){
fun getBook(){
    when("category"){
        "groceries"->println("Leave that shop")
        "hygiene"->println("Get a good novel")
    }
}

}
fun getFruits(fruit:String):String {
    var c=""
for (y in fruit){
    if(fruit.indexOf(y)%2==0)
        fruit.indexOf(y)
    println(c.(fruit))


}
    return "${c}"
}



