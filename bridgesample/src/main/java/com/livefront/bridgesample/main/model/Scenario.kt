package com.livefront.bridgesample.main.model

import android.content.Context
import com.livefront.bridgesample.R
import com.livefront.bridgesample.scenario.activity.LargeDataActivity
import com.livefront.bridgesample.scenario.activity.NonBridgeLargeDataActivity

/**
 * This is the list of all Bridge scenarios demonstrated in this app.
 */
fun getScenarios(context: Context): List<MainItem> = listOf(
        MainItem(
                R.string.large_data_scenario_title,
                R.string.large_data_scenario_description,
                LargeDataActivity.getNavigationIntent(context)
        ),
        MainItem(
                R.string.non_bridge_large_data_scenario_title,
                R.string.non_bridge_large_data_scenario_description,
                NonBridgeLargeDataActivity.getNavigationIntent(context)
        )
)
