package xxt.owl

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Url
import ScheduleBean
import retrofit2.Call
import xxt.owl.Owlhelp.logger
import xxt.owl.Owlhelp.sch

class getowlinfo {
    /**
     * stage:regular_season,
     */
    companion object {
        val retrofit: Retrofit = Retrofit.Builder()
            .baseUrl("https://jx3api.com/app/") // 设置 网络请求 Url
            .addConverterFactory(GsonConverterFactory.create()) //设置使用Gson解析(记得加入依赖)
            .build()
        interface owlapi{
            @Headers(
                "origin: https://www.overwatchleague.cn",
                "referer: https://www.overwatchleague.cn/"
            )
            @GET
            fun schedule(@Url url:String): Call<ScheduleBean>
        }
        var owl:owlapi=retrofit.create(owlapi::class.java)
        fun schedule(url: String):ScheduleBean {
            logger.info(owl.schedule(url).execute().body().toString())
            return owl.schedule(url).execute().body()!!
        }
        fun getdata(stage:String,page:String,season:String):Unit {
            var url:String="https://35u5wdmjah.execute-api.us-west-2.amazonaws.com/production/owl/paginator/schedule?stage=${stage}&page=${page}&season=${season}&locale=zh-cn"
            logger.info(schedule(url).toString())
            sch[season.toInt()]= schedule(url)
        }
    }

}