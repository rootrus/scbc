package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import java.io.IOException;

/* renamed from: o.BaseChangePinActivity_ViewBinding */
public final class BaseChangePinActivity_ViewBinding extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;

    public BaseChangePinActivity_ViewBinding(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((PropertiesRequest) obj).write(this.MediaBrowserCompat$ItemReceiver, jsonWriter, this.read);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        PropertiesRequest propertiesRequest = new PropertiesRequest();
        propertiesRequest.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, jsonReader, this.MediaBrowserCompat$CustomActionResultReceiver);
        return propertiesRequest;
    }
}
