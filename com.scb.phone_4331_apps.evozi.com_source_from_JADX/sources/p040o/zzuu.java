package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzuu */
public final class zzuu extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson read;
    private validateCycle write;

    public zzuu(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzrn zzrn = (zzrn) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (zzrn != zzrn.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 316);
            String str = zzrn.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzrn != zzrn.write) {
            validatedagrecurse.read(jsonWriter, 323);
            String str2 = zzrn.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzrn zzrn = new zzrn();
        Gson gson = this.read;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 434) {
                if (write2 != 605) {
                    jsonReader.skipValue();
                } else if (z) {
                    zzrn.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzrn.write = null;
                }
            } else if (z) {
                zzrn.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzrn.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzrn;
    }
}
