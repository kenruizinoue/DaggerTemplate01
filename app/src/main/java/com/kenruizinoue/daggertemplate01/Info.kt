package com.kenruizinoue.daggertemplate01

import javax.inject.Inject

class Info @Inject constructor() {
    val text = "Hello Dagger 2"
}