package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzru */
public final class zzru extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;

    public zzru(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzrp zzrp = (zzrp) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (zzrp != zzrp.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 548);
            Integer num = zzrp.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num).write(jsonWriter, num);
        }
        if (zzrp != zzrp.write) {
            validatedagrecurse.read(jsonWriter, 625);
            Long l = zzrp.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Long.class, (Object) l).write(jsonWriter, l);
        }
        if (zzrp != zzrp.read) {
            validatedagrecurse.read(jsonWriter, 113);
            Boolean bool = zzrp.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Boolean.class, (Object) bool).write(jsonWriter, bool);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzrp zzrp = new zzrp();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 60) {
                if (write != 245) {
                    if (write != 474) {
                        jsonReader.skipValue();
                    } else if (z) {
                        zzrp.read = gson.getAdapter(Boolean.class).read(jsonReader);
                    } else {
                        zzrp.read = null;
                    }
                } else if (z) {
                    zzrp.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Integer.class).read(jsonReader);
                } else {
                    zzrp.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                zzrp.write = gson.getAdapter(Long.class).read(jsonReader);
            } else {
                zzrp.write = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzrp;
    }
}
