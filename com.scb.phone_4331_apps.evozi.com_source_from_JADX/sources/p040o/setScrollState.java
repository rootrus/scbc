package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.setScrollState */
public final class setScrollState extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle read;
    private Gson write;

    public setScrollState(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            ((setCurrentItemInternal) obj).MediaBrowserCompat$ItemReceiver(this.write, jsonWriter, this.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        setCurrentItemInternal setcurrentiteminternal = new setCurrentItemInternal();
        setcurrentiteminternal.write(this.write, jsonReader, this.read);
        return setcurrentiteminternal;
    }
}
