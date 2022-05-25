import java.sql.{Connection, DriverManager, ResultSet}

import com.mysql.cj.protocol.Resultset

object Utility {
def connectDb(connProperties:Map[String,String]): Connection ={
  var connection: Connection = null
  val user:String=connProperties.get("user").get
  val password:String=connProperties.get("password").get
  val url:String=connProperties.get("url").get
  val driver:String=connProperties.get("driver").get
  Class.forName(driver)
  connection=DriverManager.getConnection(url,user,password)
  connection
}
  def readData(conn:Connection): ResultSet ={
    conn.createStatement().executeQuery("select * from student")
  }
}
