package com.satya.testmvvm.response

data class ServiceModel(
    val `data`: List<Data>,
    val status: String
) {
    data class Data(
        val _id: String,
        val asstTimeInHours: Any,
        val serviceName: String,
        val subServices: List<SubService>
    ) {
        data class SubService(
            val _id: String,
            val assistanceTime: Int,
            val brand: String,
            val brandName: String,
            val gender: String,
            val isActive: Boolean,
            val name: String,
            val offerPercentage: Int,
            val offerPrice: String,
            val orderNo: Int,
            val price: String,
            val priceType: String,
            val product: String,
            val productDescription: String,
            val productDisplayName: String,
            val serviceName: String,
            val service_id: String,
            val subServiceid: Int,
            val taxableprice: String,
            var isSelected: Boolean? = false
        )
    }
}