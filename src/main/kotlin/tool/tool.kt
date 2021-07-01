package tool

import xxt.owl.Owlhelp
import java.text.ParseException
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import java.awt.Graphics

val mapx= mapOf<Int,Int>(1 to 200,2 to 700,3 to 1160)
val mapy= mapOf<Int,Int>(1 to 100,2 to 240,3 to 380,4 to 520,5 to 660,6 to 800)
fun x(index:Int): Int? {
    return when(index){
        1,2,3,4,5,6->mapx[1]
        7,8,9,10,11,12->mapx[2]
        13,14,15,16,17,18->mapx[3]
        else -> 3
    }
}
fun y(index: Int): Int? {
    return when(index){
        1,7,13->mapy[1]
        2,8,14->mapy[2]
        3,9,15->mapy[3]
        4,10,16->mapy[4]
        5,11,17->mapy[5]
        6,12,18->mapy[6]
        else -> mapy[6]
    }
}


fun writeImage(graphics: Graphics, index:Int, text: String,text2:String) {
    writeImage(graphics,x(index)!!, y(index)!!, text)
    writeImage(graphics,x(index)!!, y(index)!!+graphics.fontMetrics.height, text2)
}

private fun writeImage(graphics: Graphics, x: Int, y: Int, text: String?) {
    if (text == null) {
        Owlhelp.logger.error("The text should not be null.")
        return
    }
    graphics.drawString(text, x, y)
}
fun date(time:Long):String{
var theDate=Calendar.getInstance()
    theDate.timeInMillis = time
    return "${theDate.get(Calendar.MONTH)}月${theDate.get(Calendar.DAY_OF_MONTH)}日${theDate.get(Calendar.HOUR_OF_DAY)}:${theDate.get(Calendar.MINUTE)}"
}