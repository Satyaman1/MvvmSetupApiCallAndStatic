package com.satya.testmvvm.json

data class ApartmentSizeResponse(
    val _id: String? = null,
    val item_taxes: List<Int>? = null,
    val name: List<String>? = null,
    val price: Int? = null,
    val specifications: List<Specification>? = null
) {
    data class Specification(
        val _id: String? = null,
        val isAssociated: Boolean? = null,
        val isParentAssociate: Boolean? = null,
        val is_required: Boolean? = null,
        val list: ArrayList<ListData> = arrayListOf(),
        val max_range: Int? = null,
        val modifierGroupId: String? = null,
        val modifierGroupName: String? = null,
        val modifierId: String? = null,
        val modifierName: String? = null,
        val name: List<String>? = null,
        val range: Int? = null,
        val sequence_number: Int? = null,
        val type: Int? = null,
        val unique_id: Int? = null,
        val user_can_add_specification_quantity: Boolean? = null
    ) {
        data class ListData(
            val _id: String? = null,
            val is_default_selected: Boolean? = null,
            val name: List<String>? = null,
            val price: Int? = null,
            val sequence_number: Int? = null,
            val specification_group_id: String? = null,
            val unique_id: Int? = null
        )
    }
}