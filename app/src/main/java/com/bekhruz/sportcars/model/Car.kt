package com.bekhruz.sportcars.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Car(
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int
)