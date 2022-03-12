package com.bekhruz.sportcars

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions.scrollToPosition
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CarsListTests {
    @get:Rule
    val activity = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun scroll_to_item() {
        //testing whether it scrolls to the last item
        onView(withId(R.id.recyclerview))
            .perform(scrollToPosition<RecyclerView.ViewHolder>(7))

        //testing whether the last item is displayed
        onView(withText(R.string.chevrolet_camaro_zl1_1le))
            .check(matches(isDisplayed()))
    }
}