/* mainApp.java */
import org.apache.spark.sql.SparkSession;
import org.apache.spark.sql.Dataset;

public class MainApp {
  public static void main(String[] args) {
    String logFile = ""; // Should be some file on your system
    SparkSession spark = SparkSession.builder().appName("nyc-trip-processing").getOrCreate();
    
    System.out.println("Test worked");

    spark.stop();
  }
}