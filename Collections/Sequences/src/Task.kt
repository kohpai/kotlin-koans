// Find the most expensive product among all the delivered products
// ordered by the customer. Use `Order.isDelivered` flag.
fun findMostExpensiveProductBy(customer: Customer) =
    customer.orders.asSequence().filter { it.isDelivered }
        .flatMap { it.products.asSequence() }
        .maxBy { it.price }

// Count the amount of times a product was ordered.
// Note that a customer may order the same product several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product) =
    customers.asSequence().flatMap { it.orders.asSequence() }
        .flatMap { it.products.asSequence() }
        .count { it == product }

fun Customer.getOrderedProducts(): Sequence<Product> =
    TODO()
