package org.github.ivanzhangwb.dal

import org.github.ivanzhangwb.dal.dataobject.TraceEntitry
import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import org.github.ivanzhangwb.dal.dataobject.TraceEntitry

object testmain extends App {

  var resultlist = new java.util.ArrayList[TraceEntitry]
  // 修改类的定义，生成get / set方法
  var entirry = new TraceEntitry()
  entirry.uid = "ivanzhang"
  entirry.ip = "127.0.0.1"
  entirry.accessMode = "2013-03-05 10:11:00"
  entirry.accessTime = "2013-03-05 10:11:00"
  resultlist.add(entirry)

  try {
    val xml = "classpath:applicationContext.xml"
    val appContext: ApplicationContext = new ClassPathXmlApplicationContext(xml)
    var target = appContext.getBean("traceLogDao")

    // 使用模式匹配优于 asInstanceOf.
    target match {
      case c: TraceLogDao => c.batchInsert(resultlist)
      case _ =>
    }

    var list: java.util.List[TraceEntitry] = target.asInstanceOf[TraceLogDao].query

    for (t <- list.toArray()) {
      println(t.toString())
    }
  } catch {
    case e: Exception => println(e.getMessage, e)
  }

}