package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzwq */
public final class zzwq extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public zzwq(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzwp zzwp = (zzwp) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (zzwp != zzwp.write) {
            validatedagrecurse.read(jsonWriter, 67);
            String str = zzwp.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (zzwp != zzwp.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 417);
            String str2 = zzwp.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (zzwp != zzwp.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 513);
            String str3 = zzwp.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzwp zzwp = new zzwp();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 275) {
                if (write != 364) {
                    if (write != 489) {
                        jsonReader.skipValue();
                    } else if (z) {
                        zzwp.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        zzwp.MediaBrowserCompat$ItemReceiver = null;
                    }
                } else if (z) {
                    zzwp.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    zzwp.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                zzwp.write = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzwp.write = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzwp;
    }
}
