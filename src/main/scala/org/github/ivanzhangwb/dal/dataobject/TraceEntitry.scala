package org.github.ivanzhangwb.dal.dataobject

import scala.reflect.BeanProperty

class TraceEntitry() {
  @BeanProperty var uid: String = ""
  @BeanProperty var ip: String = ""
  @BeanProperty var accessMode: String = ""
  @BeanProperty var accessTime: String = ""

  //  object TraceEntitry {
  //    def apply(_uid: String, _ip: String, accessMode: String, accessTime: String) {
  //    	val entry= new TraceEntitry
  //    	entry.uid = _uid
  //    	entry.ip = _ip
  //    }
  //  }
  override def toString(): String = {
    "uid=" + uid + ", ip=" + ip + ", accessMode=" + accessMode + ", accessTime=" + accessTime
  }

}