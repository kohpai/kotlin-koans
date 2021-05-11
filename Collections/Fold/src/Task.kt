// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll() =
    customers.map { it.orders }.map { it.flatMap { it.products }.toSet() }
        .reduce { acc, set -> acc.intersect(set) }

fun Customer.getOrderedProducts(): List<Product> =
    TODO()