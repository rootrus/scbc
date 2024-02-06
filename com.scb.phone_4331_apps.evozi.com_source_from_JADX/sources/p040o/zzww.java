package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzww */
public final class zzww extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson read;
    private validateCycle write;

    public zzww(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.write = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzwu zzwu = (zzwu) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (zzwu != zzwu.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 120);
            String str = zzwu.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzwu != zzwu.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 251);
            String str2 = zzwu.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzwu zzwu = new zzwu();
        Gson gson = this.read;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 503) {
                if (write2 != 628) {
                    jsonReader.skipValue();
                } else if (z) {
                    zzwu.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzwu.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                zzwu.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzwu.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzwu;
    }
}
