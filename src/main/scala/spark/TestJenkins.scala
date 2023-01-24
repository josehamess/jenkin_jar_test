package spark

import org.apache.spark.sql.SparkSession

object TestJenkins {
  def main(args:Array[String]): Unit = {

    // create sparksession
    val spark = SparkSession
      .builder()
      .appName("write_to_kafka_topic")
      .config("spark.master", "local")
      .getOrCreate()

    val numbers = spark.range(1, 10)
    numbers.show()

  }

}
