package com.satya.testmvvm.response

import com.google.gson.annotations.SerializedName

data class LoginResponse(
    var message: String?,
    var profile: Profile?,
    var status: Boolean?,
    var token: String?
){
    data class CreatedBy(
        var email: String?,
        var first_name: String?,
        var id: Int?,
        var last_name: String?,
        var role: String?,
        var role_slug: String?,
        var user_name: String?
    )

    data class Profile(
        var account_email_address: String?,
        var badge_number: String?,
        var city: String?,
        var company_name: String?,
        var country: String?,
        var created_by: CreatedBy?,
        var delivery_address: String?,
        var delivery_lattitude: String?,
        var delivery_longitude: String?,
        var device_id: String?,
        var email: String?,
        var fcm_token: String?,
        var first_name: String?,
        var id: Int?,
        var is_allowed_qc: Boolean?,
        var is_available: Int?,
        var is_employee: Boolean?,
        var is_logged_in: Int?,
        var last_login: String?,
        var last_name: String?,
        var latitude: String?,
        var longitude: String?,
        var mobile_number: String?,
        var permissions: Permissions?,
        var profile_image: String?,
        var role: String?,
        var role_id: Int?,
        var role_ids: List<Int?>?,
        var role_names: List<String?>?,
        var state: String?,
        var status: Int?,
        var street_address: String?,
        var street_address_2: String?,
        var user_id: String?,
        var user_name: String?,
        var uuid: String?,
        var zip_code: String?
    ){
        data class Permissions(
            @SerializedName("calendar-read")
            var calendar_read: Boolean?,
            @SerializedName("production_bond-create")
            var production_bond_create: Boolean?,
            @SerializedName("production_bond-read")
            var production_bond_read: Boolean?,
            @SerializedName("production_cut-create")
            var production_cut_create: Boolean?,
            @SerializedName("production_cut-delete")
            var production_cut_delete: Boolean?,
            @SerializedName("production_cut-read")
            var production_cut_read: Boolean?,
            @SerializedName("production_cut-update")
            var production_cut_update: Boolean?,
            @SerializedName("production_fabricate-create")
            var production_fabricate_create: Boolean?,
            @SerializedName("production_fabricate-delete")
            var production_fabricate_delete: Boolean?,
            @SerializedName("production_fabricate-read")
            var production_fabricate_read: Boolean?,
            @SerializedName("production_fabricate-update")
            var production_fabricate_update: Boolean?,
            @SerializedName("production_machine-create")
            var production_machine_create: Boolean?,
            @SerializedName("production_machine-delete")
            var production_machine_delete: Boolean?,
            @SerializedName("production_machine-read")
            var production_machine_read: Boolean?,
            @SerializedName("production_machine-update")
            var production_machine_update: Boolean?,
            @SerializedName("production_position-create")
            var production_position_create: Boolean?,
            @SerializedName("production_position-read")
            var production_position_read: Boolean?,
            @SerializedName("production_quality_control-create")
            var production_quality_control_create: Boolean?,
            @SerializedName("production_quality_control-delete")
            var production_quality_control_delete: Boolean?,
            @SerializedName("production_quality_control-read")
            var production_quality_control_read: Boolean?,
            @SerializedName("production_quality_control-update")
            var production_quality_control_update: Boolean?,
            @SerializedName("production_ready_for_dispatch-create")
            var production_ready_for_dispatch_create: Boolean?,
            @SerializedName("production_ready_for_dispatch-delete")
            var production_ready_for_dispatch_delete: Boolean?,
            @SerializedName("production_ready_for_dispatch-read")
            var production_ready_for_dispatch_read: Boolean?,
            @SerializedName("production_ready_for_dispatch-update")
            var production_ready_for_dispatch_update: Boolean?,
            @SerializedName("productions-read")
            var productions_read: Boolean?,
            @SerializedName("productions-update")
            var productions_update: Boolean?,
            @SerializedName("tasks-read")
            var tasks_read: Boolean?,
            @SerializedName("tasks-update")
            var tasks_update: Boolean?
        )
    }
}