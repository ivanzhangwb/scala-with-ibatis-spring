package org.github.ivanzhangwb.dal.dataobject

class TraceEntitry(var uid: String, var ip: String, var accessMode: String, var accessTime: String) {

  override def toString(): String = {
    "uid=" + uid + ", ip=" + ip + ", accessMode=" + accessMode + ", accessTime=" + accessTime
  }
}