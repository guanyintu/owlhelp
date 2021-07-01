package xxt.owl

import ScheduleBean
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import net.mamoe.mirai.Bot
import net.mamoe.mirai.console.extension.PluginComponentStorage
import net.mamoe.mirai.console.plugin.jvm.JvmPluginDescription
import net.mamoe.mirai.console.plugin.jvm.KotlinPlugin
import net.mamoe.mirai.utils.info
import xxt.owl.getowlinfo.Companion.getdata
import java.lang.reflect.Type
import java.util.Calendar
import java.time.Instant







object Owlhelp : KotlinPlugin(
    JvmPluginDescription(
        id = "xxt.owl.owlhelp",
        version = "1.0-SNAPSHOT",
    )
) {
    lateinit var bot : Bot
    var sch:MutableMap<Int,ScheduleBean> = mutableMapOf(1 to ScheduleBean())
    override fun onEnable() {
        logger.info { "Plugin loaded" }

        Owlhelp.launch {
            var type:Type=object:TypeToken<ScheduleBean>(){}.type
        for((key,value)in Data.schedule){
            sch[key]=Gson().fromJson(value,type)
        }
            val cal = Calendar.getInstance()
            for(index in 1..19){
                getdata("regular_season",index.toString(),cal.get(Calendar.YEAR).toString())
                logger.info(sch.toString())
                val startime=sch[index]?.content?.tableData?.startDate

                val instant = Instant.parse(startime)
                if(instant.isBefore(Instant.now()))continue
                else{
                    Data.week=index-1
                    break
                }

            }
            logger.info { "owl插件初始化完成" }
            logger.info("forward......")

            while (true){
                try {
                    bot = Bot.instances[0]
                    bot
                    break
                }catch (e:Exception){
                    delay(1000)
                }
            }
            delay(1000)
            logger.info("工作Bot："+ bot.id)
            bot.eventChannel.registerListenerHost(Listener)
        }
    }

    override fun onDisable() {
        for((key,value )in sch){
            Data.schedule[key]=Gson().toJson(sch[key])
        }
        super.onDisable()
    }
}