package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest;
import java.io.IOException;

/* renamed from: o.BaseOtpActivity */
public final class BaseOtpActivity extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;
    private validateCycle write;

    public BaseOtpActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.write = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((ResponseForOptimizationPointsRequest) obj).write(this.MediaBrowserCompat$ItemReceiver, jsonWriter, this.read);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ResponseForOptimizationPointsRequest responseForOptimizationPointsRequest = new ResponseForOptimizationPointsRequest();
        responseForOptimizationPointsRequest.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver, jsonReader, this.write);
        return responseForOptimizationPointsRequest;
    }
}
