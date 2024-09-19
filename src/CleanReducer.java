import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class CleanReducer extends Reducer<NullWritable, Text, NullWritable, Text> {

    @Override
    public void reduce(NullWritable key, Iterable<Text> values, Context context) throws IOException, InterruptedException {
        // No reducer logic needed, just write the clean data
        for (Text value : values) {
            context.write(NullWritable.get(), value);
        }
    }
}
