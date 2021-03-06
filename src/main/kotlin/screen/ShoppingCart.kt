package screen

import data.CartItems

/*
* 장바구니의 내용을 화면에 출력
 */
class ShoppingCart {
    private val products = CartItems.products

    fun showCartItems(){
        if(products.isNotEmpty()){
            //비어잇지 않은 겨우 장바구니 상품 목록 출력
            println(
                products.keys.joinToString (
                    separator = ", \n",
                    prefix = """
                        ***===============================================***
                                       장바구니에 담긴 상품 목록입니다. \n
                    """.trimIndent()

            ){ product -> "카테고리: ${product.categoryLable} / 상품명:${product.name} / 수량:${products[product]}"
                }
            )
        }else{
            println("""
                장바구니에 담긴 상품이 없습니다.
            """.trimIndent())

        }
    }

}