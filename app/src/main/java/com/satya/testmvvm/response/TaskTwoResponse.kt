package com.satya.testmvvm.response

data class TaskTwoResponse(
    var `data`: Data?,
    var message: String?,
    var status: Boolean?
){
    data class Data(
        var created_at: String?,
        var created_by: Int?,
        var icon_image: String?,
        var id: Int?,
        var image: List<Image?>?,
        var image_brochuers: List<ImageBrochuer?>?,
        var image_drawing: List<ImageDrawing?>?,
        var image_installation: List<ImageBrochuer?>?,
        var image_specification: List<ImageBrochuer?>?,
        var main_image: String?,
        var product_code: String?,
        var product_name: String?
    ){
        data class ImageBrochuer(
            var file_type: String?,
            var image: String?,
            var name: String?
        )

        data class ImageDrawing(
            var file_type: String?,
            var filter_name: String?,
            var image: String?,
            var name: String?
        )

        data class Image(
            var file_type: String?,
            var image: String?,
            var main_img: String?,
            var name: String?
        )

        data class ImageInstallation(
            var file_type: String?,
            var image: String?,
            var name: String?
        )

        data class ImageSpecification(
            var file_type: String?,
            var image: String?,
            var name: String?
        )
    }
}