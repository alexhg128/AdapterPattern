package com.halexhg.adapterex.calling;

class Phone {
    
    fun makeCall(phoneNumber: String) {
        if(phoneNumber.length < 12) {
            return;
        }
        println("Calling -> " + phoneNumber);
    }

}