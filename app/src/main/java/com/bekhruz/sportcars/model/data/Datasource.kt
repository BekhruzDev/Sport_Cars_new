package com.bekhruz.sportcars.model.data

import com.bekhruz.sportcars.R
import com.bekhruz.sportcars.model.Car

object Datasource {
    val carList = listOf<Car>(
        Car(R.drawable.bugatti_divo_hd, R.string.bugatti_divo),
        Car(R.drawable.ferrari_458_spider_hd, R.string.ferrari_458_spider),
        Car(R.drawable.lamborghini_aventador_hd, R.string.lamborghini_aventador),
        Car(R.drawable.mclaren_p1_hd, R.string.mc_laren_p1),
        Car(R.drawable.dodge_viper_acr_hd, R.string.dodge_viper_acr),
        Car(R.drawable.mustang_shelby_gt350_hd, R.string.mustang_shelby_gt350),
        Car(R.drawable.dodge_challenger_srt_hellcat_hd, R.string.dodge_challenger_srt_hellcat),
        Car(R.drawable.chevrolet_camaro_zl1_1le_hd, R.string.chevrolet_camaro_zl1_1le),
    )
}