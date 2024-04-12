package com.satya.testmvvm.response

data class DataResponse(
    var limit: Int?,
    var products: List<Product?>?,
    var skip: Int?,
    var total: Int?
){
    data class Product(
        var brand: String?,
        var category: String?,
        var description: String?,
        var discountPercentage: Double?,
        var id: Int?,
        var images: List<String?>?,
        var price: Int?,
        var rating: Double?,
        var stock: Int?,
        var thumbnail: String?,
        var title: String?
    )
}