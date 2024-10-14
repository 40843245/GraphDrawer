package com.jay30.graphdrawer.frame

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.jay30.graphdrawer.piechart.PieChart
import com.tibame.tip101.group_02.healthhelp_v2.util.graph.piechart.PieChartEntry

@Composable
fun DrawPieChartFrame1(){
    val pieChartEntries = listOf<PieChartEntry>(
        PieChartEntry(color = Color.Blue, percentage = 30f/100),
        PieChartEntry(color = Color.Yellow, percentage = 70f/100),
    )

    Column(modifier = Modifier.fillMaxSize()) {
        PieChart(
            entries = pieChartEntries,
            300u
        )
    }
}
