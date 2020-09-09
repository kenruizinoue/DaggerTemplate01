package com.kenruizinoue.daggertemplate01

import dagger.Component

@Component
interface AppComponent {
    fun inject(app: MainActivity)
}