package com.lambdaschool.android.organization.model

class Product(
    val productName: String,
    val productDescription: String,
    val productPrice: Double,
    val productDiscount: Double,
    val productTax: Double = productPrice * .045,
    val totalProductPrice: Double = productPrice + productTax
)

//productName - the product's name
////productDescription - the product's description
////productPrice - the product's price
////productTax - the dollar-amount of tax for this item
////productDiscount - the percent discount for this item