package collections

//products
val milk = Product("Milk", 58.0)
val sandwich = Product("Sandwich", 250.0)
val waffles = Product("Waffles", 320.0)
val beer = Product("Beer", 129.0)
val coffee = Product("Coffee", 28.0)
val iceCream = Product("IceCream", 66.0)
val pizza = Product("Pizza", 99.0)
val tea = Product("Tea", 120.0)
val bread = Product("Bread", 370.0)
val cheese = Product("Cheese", 49.0)
val eggs = Product("Eggs", 299.0)
val cake = Product("Cake", 500.0)

//customers
val Aram = "Aram"
val Gohar = "Gohar"
val Hakob = "Hakob"
val Mane = "Mane"
val Lilit = "Lilit"
val Suren = "Suren"
val Martin = "Martin"

//cities
val Yerevan = City("Yerevan")
val Gyumri = City("Gyumri")
val Dilijan = City("Dilijan")
val Vanadzor = City("Vanadzor")
val Hrazdan = City("Hrazdan")

fun customer(name: String, city: City, vararg orders: Order) = Customer(name, city, orders.toList())
fun order(vararg products: Product, isDelivered: Boolean = true) = Order(products.toList(), isDelivered)
fun shop(name: String, vararg customers: Customer) = Shop(name, customers.toList())

val myShop = shop("myShop",
    customer(Aram, Yerevan,
        order(sandwich),
        order(milk),
        order(beer),
        order(waffles)
    ),
    customer(
        Hakob, Yerevan,
        order(milk),
    ),

    customer(Gohar, Yerevan,
        order(iceCream),
        order(milk),
        order(waffles, isDelivered = false),
        order(tea),
        order(coffee),
        order(pizza),
        order(beer, isDelivered = false)
    ),
    customer(Mane, Gyumri,
        order(bread),
        order(milk),
        order(cheese),
        order(beer)
    ),
    customer(Lilit, Dilijan,
        order(milk, isDelivered = false),
        order(milk)
    ),
    customer(Suren, Vanadzor,
        order(sandwich),
        order(milk),
        order(coffee, isDelivered = false),
        order(tea, isDelivered = false),
        order(cake, isDelivered = false)
    ),
    customer(
        Martin, Hrazdan,
        order(milk),
        order(iceCream, isDelivered = false),
        order(pizza),
        order(eggs),
    )
)

fun main() {
    println(myShop)
    // Shop(name=myShop, customers=[Aram from Yerevan, Hakob from Yerevan, Gohar from Yerevan,
    // Mane from Gyumri, Lilit from Dilijan, Suren from Vanadzor, Martin from Hrazdan])

}