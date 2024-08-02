package com.satya.testmvvm.response

data class NavigationResponse(
    var result: Result? = null,
    var session_id: String? = null
) {
    data class Result(
        var title :String?=null,
        var user_photo :String?=null,
        var friend_req_count: Int? = null,
        var loggedin_user_id: Int? = null,
        var menus: List<Menu?>? = null,
        var message_count: Int? = null,
        var notification_count: Int? = null
    ) {
        data class Menu(
            var `class`: String? = null,
            var icon: String? = null,
            var label: String? = null,
            var module: String? = null,
            var type: Int? = null,
            var url: String? = null
        )
    }
}
