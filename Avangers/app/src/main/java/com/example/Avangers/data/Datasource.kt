package com.example.Avangers.data

import com.example.Avangers.R
import com.example.Avangers.model.Images

class Datasource {
    fun loadImages (): List<Images> {
        return listOf<Images>(
            Images(R.drawable.img1, R.string.Hero1),
            Images(R.drawable.img2, R.string.Hero2),
            Images (R.drawable.img3, R.string.Hero3),
            Images (R.drawable.img4, R.string.Hero4),
            Images (R.drawable.img5, R.string.Hero5),
            Images (R.drawable.img6, R.string.Hero6),
            Images (R.drawable.img7, R.string.Hero7)
        )
    }
}