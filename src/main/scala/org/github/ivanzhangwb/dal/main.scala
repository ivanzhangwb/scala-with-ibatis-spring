package org.github.ivanzhangwb.dal

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext
import java.util.logging.Logger
import org.github.ivanzhangwb.dal.dataobject.TraceEntitry

object main extends App {

  // start service
  var entitylist=new java.util.ArrayList[TraceEntitry]
  entitylist.add(new TraceEntitry("ivanzhan","213","131","2013-03-01 00:59:17"))
  
  try {
    val xml = "classpath:applicationContext.xml"
    val appContext: ApplicationContext = new ClassPathXmlApplicationContext(xml)
    appContext.getBean("traceLogDao").asInstanceOf[TraceLogDao].batchInsert(entitylist)
  } catch {
    case e: Exception => println(e.getMessage, e)
  }
  
}