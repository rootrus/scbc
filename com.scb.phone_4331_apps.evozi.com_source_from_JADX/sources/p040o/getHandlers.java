package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getHandlers */
public final class getHandlers extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public getHandlers(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 442);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(((isSet) obj).MediaBrowserCompat$ItemReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        isSet isset = new isSet();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 359) {
                jsonReader.skipValue();
            } else if (z) {
                isset.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            } else {
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return isset;
    }
}
