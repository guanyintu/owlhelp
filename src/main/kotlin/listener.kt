package xxt.owl

import net.mamoe.mirai.event.EventHandler
import net.mamoe.mirai.event.ListenerHost
import net.mamoe.mirai.event.events.MessageEvent
import net.mamoe.mirai.event.events.NewFriendRequestEvent
import net.mamoe.mirai.message.data.content
import tool.buildSchedule
import xxt.owl.Owlhelp.sch


object Listener: ListenerHost{
    @EventHandler
    suspend fun MessageEvent.onMessage(){
        if(message.content=="开启owl插件"){
            Data.openlist[subject.id] = true
        }else if (message.content=="关闭owl插件"){
            Data.openlist[subject.id] = true
        }
        if (Data.openlist[subject.id]==true){
            val content:MutableList<String> = message.content.split(("\\s+").toRegex()) as MutableList<String>
            when(content[0]){
                "赛程查询"->subject.sendMessage(buildSchedule(sch[11]!!))
            }

        }
    }
}
