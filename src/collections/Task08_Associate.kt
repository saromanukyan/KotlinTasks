package collections

/**********************************************************************************************
 * Associate
 *
 * Build a map from the customer name to the customer
 ***********************************************************************************************/
fun Shop.nameToCustomerMap(): Map<String, Customer> =
    this.customers.associateBy { it.name }

/**********************************************************************************************
 * Build a map from the customer to their city
 ***********************************************************************************************/
fun Shop.customerToCityMap(): Map<Customer, City> =
    this.customers.associateWith { it.city }

/**********************************************************************************************
 * Build a map from the customer name to their city
 ***********************************************************************************************/
fun Shop.customerNameToCityMap(): Map<String, City> =
    this.customers.associate { it.name to it.city }

fun main() {
    println(myShop.nameToCustomerMap())
    // {Aram=Aram from Yerevan, Hakob=Hakob from Yerevan, Gohar=Gohar from Yerevan,
    // Mane=Mane from Gyumri, Lilit=Lilit from Dilijan, Suren=Suren from Vanadzor, Martin=Martin from Hrazdan}
    println(myShop.customerToCityMap())
    // {Aram from Yerevan=Yerevan, Hakob from Yerevan=Yerevan, Gohar from Yerevan=Yerevan,
    // Mane from Gyumri=Gyumri, Lilit from Dilijan=Dilijan,
    // Suren from Vanadzor=Vanadzor, Martin from Hrazdan=Hrazdan}
    println(myShop.customerNameToCityMap())
    // {Aram=Yerevan, Hakob=Yerevan, Gohar=Yerevan, Mane=Gyumri, Lilit=Dilijan, Suren=Vanadzor, Martin=Hrazdan}
}