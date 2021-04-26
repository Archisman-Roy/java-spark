package roy.javaspark;

import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class JavaSpark {
  public static void main(String[] args) {
    
    SparkSession spark = SparkSession.builder().appName("nyc-trip-processing").getOrCreate();
    
    System.out.println("Test worked");

    spark.stop();
  }
}