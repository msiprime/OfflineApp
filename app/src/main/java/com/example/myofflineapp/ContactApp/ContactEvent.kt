package com.example.myofflineapp.ContactApp

sealed interface ContactEvent {
    object saveContact : ContactEvent
    object showDialog : ContactEvent
    object hideDialog : ContactEvent
    data class SetFirstName(val firstName: String) : ContactEvent
    data class SetLastName(val lastName: String) : ContactEvent
    data class SetPhoneNumber(val phoneNumber: String) : ContactEvent

    data class SortContacts(val sortType: SortType) : ContactEvent
    data class DeleteContact(val contact: Contact) : ContactEvent
}