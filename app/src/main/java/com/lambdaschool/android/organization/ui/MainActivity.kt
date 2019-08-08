package com.lambdaschool.android.organization.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.lambdaschool.android.organization.R
import com.lambdaschool.android.organization.model.Product
import com.lambdaschool.android.organization.util.DateUtils
import com.lambdaschool.android.organization.util.TextUtils
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        title = "Product Details"
        setContentView(R.layout.activity_main)

        displayProductDetails(
            Product(
                "Galaxy Fold",
                "The bleeding-edge of phones! IT FOLDS!",
                1980.00, .15
            )
        )
    }

    private fun displayProductDetails(product: Product) {
        // todo: Instantiate a Product, set its characteristics, and
        // set each of the fields on the corresponding TextViews from the layout
        // use the appropriate Util methods for formatting the fields

        ////productName - the product's name
        ////productDescription - the product's description
        ////productPrice - the product's price
        ////productTax - the dollar-amount of tax for this item
        ////productDiscount - the percent discount for this item

        productName.text = product.productName
        productDescription.text = product.productDescription
        productPrice.text = TextUtils.formatCurrency(product.productPrice)
        productTax.text = TextUtils.formatCurrency(product.productTax)
        totalProductPrice.text = TextUtils.formatCurrency(product.totalProductPrice)
        productDiscount.text = TextUtils.formatPercent(product.productDiscount)
        orderDate.text = DateUtils.formatDate(Date())
    }
}
