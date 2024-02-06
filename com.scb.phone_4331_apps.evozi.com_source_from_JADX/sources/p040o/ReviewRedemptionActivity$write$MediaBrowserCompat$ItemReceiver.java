package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.ReviewRedemptionActivity;

/* renamed from: o.ReviewRedemptionActivity$write$MediaBrowserCompat$ItemReceiver */
public class ReviewRedemptionActivity$write$MediaBrowserCompat$ItemReceiver extends TypeAdapter<ReviewRedemptionActivity.write> {
    public final /* synthetic */ Object read(JsonReader jsonReader) throws IOException {
        return ReviewRedemptionActivity.write.IconCompatParcelizer(String.valueOf(jsonReader.nextString()));
    }

    public final /* synthetic */ void write(JsonWriter jsonWriter, Object obj) throws IOException {
        jsonWriter.value(((ReviewRedemptionActivity.write) obj).f5527h);
    }
}
