package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzwv */
public final class zzwv extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;

    public zzwv(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzwo zzwo = (zzwo) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (zzwo != zzwo.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 160);
            String str = zzwo.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzwo zzwo = new zzwo();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 244) {
                jsonReader.skipValue();
            } else if (z) {
                zzwo.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzwo.MediaBrowserCompat$CustomActionResultReceiver = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return zzwo;
    }
}
