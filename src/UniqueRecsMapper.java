import java.io.IOException;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class UniqueRecsMapper extends Mapper<LongWritable, Text, Text, Text> {
    private Text outKey = new Text();
    private Text outValue = new Text();

    @Override
    protected void map(LongWritable key, Text value, Context context) throws IOException, InterruptedException {
        String[] columns = value.toString().split(",");
        
        if (columns.length >= 11) {
            // Emit "Home Team:" key and the corresponding value
            outKey.set("Home Team:");
            outValue.set(columns[2]);
            context.write(outKey, outValue);

            // Emit "Away Team:" key and the corresponding value
            outKey.set("Away Team:");
            outValue.set(columns[3]);
            context.write(outKey, outValue);

            // Emit "Referee:" key and the corresponding value
            outKey.set("Referee:");
            outValue.set(columns[10]);
            context.write(outKey, outValue);
        }
    }
}
