import org.apache.spark.sql.*;

public class SimpleDataFetchAndSave {

    private static final String CSV_URL="/content/sample_data/california_housing_train.csv";

    public static void main(String args[]){

        SparkSession spark=SparkSession.builder().master("local[*]").getOrCreate();
        Dataset<Row> ds = spark.read().format("csv").option("sep", ",").option("inferSchema", "true").option("header", "true").load(CSV_URL);
        
        // print
        System.out.println("Sample output: ");
        ds.filter("housing_median_age >20").show(5);
        ds.printSchema();

        // save as parquet
        final String parquetFile = "/content/sample_data/california_housing_train.parquet";
        final String codec = "parquet";
        ds.write().format(codec).save(parquetFile);
        
    }
}