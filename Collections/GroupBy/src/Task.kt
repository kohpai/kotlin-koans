// Build a map that stores the customers living in a given city
fun Shop.groupCustomersByCity() = customers.groupBy(Customer::city)
