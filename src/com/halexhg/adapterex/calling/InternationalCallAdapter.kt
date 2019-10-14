package com.halexhg.adapterex.calling;

import com.halexhg.adapterex.models.Contact;

class InternationalCallAdapter : ICallable {

    var phone: Phone;

    constructor(phone: Phone) {
        this.phone = phone;
    }

    override fun call(c: Contact) {
        val number: String = getCountryCode(c.country) + " " + c.phoneNumber;
        this.phone.makeCall(number);
    }

    fun getCountryCode(country: String): String {
        return when(country) {
            "Mexico" -> "+52"
            "United States" -> "+1"
            "United Kingdom" -> "+44"
            else -> ""
        }
    }

}