// Return a customer who has placed the maximum amount of orders
fun Shop.getCustomerWithMaxOrders() = customers.maxBy { it.orders.size }

// Return the most expensive product that has been ordered by the given customer
fun getMostExpensiveProductBy(customer: Customer) =
    customer.orders.flatMap(Order::products).maxBy(Product::price)
