package com.sachin.heroapp.domain.model

import androidx.annotation.DrawableRes
import com.sachin.heroapp.R

sealed class OnBoardingPage(
    @DrawableRes
    val image:Int,
    val title:String,
    val description:String
){
    object First:OnBoardingPage(
            image= R.drawable.popcorn,
            title = "First Page",
            description = "Welcome to First Page"
    )
    object Second:OnBoardingPage(
        image= R.drawable.smartphone,
        title = "Second Page",
        description = "Welcome to Second Page"
    )
    object Third:OnBoardingPage(
        image= R.drawable.fair,
        title = "Third Page",
        description = "Welcome to Third Page"
    )

}
