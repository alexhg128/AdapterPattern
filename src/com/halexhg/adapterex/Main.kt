package com.halexhg.adapterex;

import com.halexhg.adapterex.models.*;
import com.halexhg.adapterex.calling.*;

fun main() {
    val c1: Contact = Contact("Alex", "Hahn", "6271111111", "Cantera Avenue 5000", "Chihuahua", "Mexico");
    val c2: Contact = Contact("Tony", "Stark", "6168318328", "Cantera Avenue 5000", "Malibu", "United States");
    val c3: Contact = Contact("Sherlock", "Holmes", "4616683211", "Cantera Avenue 5000", "London", "United Kingdom");

    val callingObject: ICallable = InternationalCallAdapter(Phone());
    callingObject.call(c1);
    callingObject.call(c2);
    callingObject.call(c3);
}
