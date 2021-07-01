package xxt.owl

import ScheduleBean
import net.mamoe.mirai.console.data.AutoSavePluginData
import net.mamoe.mirai.console.data.value

object Data : AutoSavePluginData("Data"){
    var openlist:MutableMap<Long,Boolean> by value()
    var schedule:MutableMap<Int,String>by value()
    var week:Int by value()
}
