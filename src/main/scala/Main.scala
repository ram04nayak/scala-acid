object Main {
def main(args:Array[String]): Unit ={
  //println("Hello World")
  //com.mysql.cj.jdbc.Driver
  //com.mysql.jdbc.Driver
  val db_params=Map("url"->"jdbc:mysql://localhost:3306/student","driver"-> "com.mysql.cj.jdbc.Driver","user"->"root","password"->"password")
  val conn=Utility.connectDb(db_params)
  val resultSet=Utility.readData(conn)
  //Loop thru the data
  while(resultSet.next()){
    var id=resultSet.getInt("studentid")
    var marks=resultSet.getInt("marks")
    println("ID -"+ id +" Marks -"+ marks)
  }
  //println(conn)

  conn.close()
}
}
