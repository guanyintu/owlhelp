package tool

import ScheduleBean
import net.mamoe.mirai.contact.Contact.Companion.uploadImage
import xxt.owl.getowlinfo
import java.awt.image.BufferedImage
import javax.imageio.ImageIO
import xxt.owl.Owlhelp
import java.awt.Graphics2D
import java.io.InputStream
import java.net.URL
import java.io.ByteArrayInputStream

import java.io.ByteArrayOutputStream


suspend fun buildSchedule(schedule: ScheduleBean):String {
        var url: InputStream? = Owlhelp.getResourceAsStream("texture-background.png")
        var bufImage:BufferedImage  = ImageIO.read(url)
        var g:Graphics2D=bufImage.createGraphics()
        g.font
        var w=bufImage.width
        var h=bufImage.height
            schedule.content.tableData.events[0].matches.forEachIndexed { index, it ->
                    writeImage(g, index + 1, date(it.startDate), it.competitors[0].name.substring(0..1)+"VS"+it.competitors[1].name.substring(0..1))
            }
        val os = ByteArrayOutputStream()
        ImageIO.write(bufImage, "png", os);
        val pic: InputStream = ByteArrayInputStream(os.toByteArray())
    return (Owlhelp.bot.getFriend(11411788L)?.uploadImage(pic)?.imageId)!!
    }

