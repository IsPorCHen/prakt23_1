package com.bignerdranch.android.prakt23_1

import android.os.Bundle
import android.support.wearable.activity.WearableActivity

class Login : WearableActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }
}