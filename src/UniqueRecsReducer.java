import java.io.IOException;
import java.util.HashSet;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class UniqueRecsReducer extends Reducer<Text, Text, Text, Text> {
    @Override
    protected void reduce(Text key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        HashSet<String> uniqueValues = new HashSet<>();

        for (Text value : values) {
            uniqueValues.add(value.toString());
        }

        // Initialize a StringBuilder to collect the unique values
        StringBuilder result = new StringBuilder();

        for (String uniqueValue : uniqueValues) {
            result.append(uniqueValue).append(", "); // Append the unique value and a comma
        }

        // Remove the trailing comma and space
        String resultStr = result.toString().replaceAll(", $", "");

        // Output the key and the aggregated unique values
        context.write(key, new Text(resultStr));
    }
}
