package io.saagie.spark

import org.apache.spark.sql.SparkSession

import scala.util.Try

object SparkFinalProject {

  def main(args: Array[String]) {
    val sparkEventLogDir = Try(args(0)).getOrElse("hdfs://cluster/tmp/spark-events")
    print(sparkEventLogDir)

    val spark = SparkSession.builder()
      .appName("TODO - Put your name here")
      .config("spark.eventLog.enabled", true)
      .config("spark.eventLog.dir", sparkEventLogDir)
      .getOrCreate()

    spark.sparkContext.parallelize(Array(1, 2, 3)).collect()


  }

}
