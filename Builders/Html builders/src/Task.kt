fun renderProductTable(): String {
    return html {
        table {
            tr/* TODO */ {
                td(
                    getCellColor(0, 0),
                    init = {
                        text("Product")
                    }
                )
                td(
                    getCellColor(1, 0),
                    init = {
                        text("Price")
                    }
                )
                td(
                    getCellColor(2, 0),
                    init = {
                        text("Popularity")
                    }
                )
            }
            val products = getProducts()

            products.forEachIndexed { index, product ->
                val row = index + 1
                tr {
                    td(
                        getCellColor(0, row),
                        init = {
                            text(product.description)
                        })
                    td(
                        getCellColor(1, row),
                        init = {
                            text(product.price)
                        }
                    )
                    td(
                        getCellColor(2, row),
                        init = {
                            text(product.popularity)
                        }
                    )
                }
            }
        }.set("color", getTitleColor())
    }.toString()
}

fun getTitleColor() = "#b9c9fe"
fun getCellColor(index: Int, row: Int) =
    if ((index + row) % 2 == 0) "#dce4ff" else "#eff2ff"
