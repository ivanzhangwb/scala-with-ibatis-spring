package org.github.ivanzhangwb.dal

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport
import com.ibatis.sqlmap.client.SqlMapClient
import java.sql.SQLException
import org.github.ivanzhangwb.dal.dataobject.TraceEntitry
import org.github.ivanzhangwb.dal.dataobject.TraceEntitry

class TraceLogDao extends SqlMapClientDaoSupport {

  def batchInsert(entitryList: java.util.List[TraceEntitry]) {
    var client = getSqlMapClientTemplate().getSqlMapClient();
    client.startBatch();
    val it: java.util.Iterator[TraceEntitry] = entitryList.iterator()
    while (it.hasNext()) {
      val e = it.next()
      client.insert("tracelog.insert", e)
    }
    client.executeBatch();
  }

  def query(): java.util.List[TraceEntitry] = {
    getSqlMapClientTemplate().getSqlMapClient().queryForList("tracelog.query").asInstanceOf[java.util.List[TraceEntitry]]
  }
}