package com.example.Avangers.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Images (@DrawableRes val imageResourceId: Int,
                   @StringRes val stringResourceId: Int) {
}