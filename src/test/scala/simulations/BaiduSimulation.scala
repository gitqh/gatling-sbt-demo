package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class BaiduSimulation extends Simulation {
  // 设置请求根路径
  var httpConf = http.baseUrl("https://www.baidu.com")

  // 声明scenario，指定请求动作
  var scn = scenario("BaiduSimulation").during(100) {
    exec(http("baidu_home").get("/"))
  }

  // 设置并发数并组装
  setUp(scn.inject(atOnceUsers(10))).protocols(httpConf)

  // 用10s时间启动500个线程
//  setUp(scn.inject(rampUsers(50) over(10 seconds)).protocols(httpConf)


}
