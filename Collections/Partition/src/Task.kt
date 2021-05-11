// Return customers who have more undelivered orders than delivered
fun Shop.getCustomersWithMoreUndeliveredOrders() =
    customers.filter {
        val (delivered, undelivered) = it.orders.partition(Order::isDelivered)

        undelivered.size > delivered.size
    }.toSet()
