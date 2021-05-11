// Return all products the given customer has ordered
fun Customer.getOrderedProducts() = orders.flatMap { it.products }

// Return all products that were ordered by at least one customer
fun Shop.getOrderedProducts() =
    customers.flatMap(Customer::orders).flatMap(Order::products).toSet()