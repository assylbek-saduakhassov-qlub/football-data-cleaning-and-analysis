import java.io.IOException;
import org.apache.hadoop.io.*;
import org.apache.hadoop.mapreduce.*;

public class CleanMapper extends Mapper<LongWritable, Text, NullWritable, Text> {

    @Override
    public void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        // Split the CSV line into an array
        String[] values = value.toString().split(",");

        // Check if the row should be included based on conditions
        if (values.length >= 26 && !values[1].isEmpty() && !values[2].isEmpty() && !values[9].isEmpty()) {
            // Trim leading and trailing spaces from each column
            for (int i = 0; i < values.length; i++) {
                values[i] = values[i].trim();
            }

            // Keep only the first 26 columns
            StringBuilder cleanRow = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                if (i > 0) {
                    cleanRow.append(",");
                }
                cleanRow.append(values[i]);
            }

            context.write(NullWritable.get(), new Text(cleanRow.toString()));
        }
    }
}
