package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzwr */
public final class zzwr extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public zzwr(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzwm zzwm = (zzwm) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (zzwm != zzwm.write) {
            validatedagrecurse.read(jsonWriter, 19);
            Boolean bool = zzwm.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Boolean.class, (Object) bool).write(jsonWriter, bool);
        }
        if (zzwm != zzwm.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 229);
            Integer num = zzwm.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num).write(jsonWriter, num);
        }
        if (zzwm != zzwm.read) {
            validatedagrecurse.read(jsonWriter, 142);
            Integer num2 = zzwm.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num2).write(jsonWriter, num2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzwm zzwm = new zzwm();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 271) {
                if (write2 != 428) {
                    if (write2 != 538) {
                        jsonReader.skipValue();
                    } else if (z) {
                        zzwm.read = gson.getAdapter(Integer.class).read(jsonReader);
                    } else {
                        zzwm.read = null;
                    }
                } else if (z) {
                    zzwm.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Integer.class).read(jsonReader);
                } else {
                    zzwm.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                zzwm.write = gson.getAdapter(Boolean.class).read(jsonReader);
            } else {
                zzwm.write = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzwm;
    }
}
