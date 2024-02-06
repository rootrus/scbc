package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.smoothScrollTo */
public final class smoothScrollTo extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle read;

    public smoothScrollTo(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.read = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        ((setOnPageChangeListener) obj).read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        setOnPageChangeListener setonpagechangelistener = new setOnPageChangeListener();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            setonpagechangelistener.read(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
        return setonpagechangelistener;
    }
}
