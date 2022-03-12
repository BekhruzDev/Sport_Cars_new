package com.bekhruz.sportcars

import android.content.Context
import com.bekhruz.sportcars.adapter.ItemAdapter
import com.bekhruz.sportcars.model.Car
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class CarsAdapterTest {
    private val context = mock(Context::class.java)

    @Test
    fun adapter_size() {
        //checking whether the size of the adapter is correct
        val sampleData = listOf(
            Car(R.drawable.lamborghini_aventador_hd, R.string.lamborghini_aventador),
            Car(R.drawable.ferrari_458_spider_hd, R.string.ferrari_458_spider)
        )
        val adapter = ItemAdapter(context, 2, sampleData)
        assertEquals("ItemAdapter has not the correct size", sampleData.size, adapter.itemCount)
    }
}