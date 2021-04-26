# Learning Java and Spark
## Setup instructions

Run the following in shell to setup spark:
```shell 
chmod +x spark_install.sh
./spark_install.sh
```

Run the following in shell to submit a spark job:
```shell
../spark/bin/spark-submit --class "roy.javaspark.JavaSpark" --master local[4] target/javaspark-1.0-SNAPSHOT.jar
  ```