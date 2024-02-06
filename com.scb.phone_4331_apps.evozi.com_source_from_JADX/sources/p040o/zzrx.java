package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.zzrx */
public final class zzrx extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;
    private Gson write;

    public zzrx(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzrt zzrt = (zzrt) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (zzrt != zzrt.read) {
            validatedagrecurse.read(jsonWriter, 46);
            String str = zzrt.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        zzrt.write(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzrt zzrt = new zzrt();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 432) {
                zzrt.IconCompatParcelizer(gson, jsonReader, write2);
            } else if (z) {
                zzrt.read = gson.getAdapter(String.class).read(jsonReader);
            } else {
                zzrt.read = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return zzrt;
    }
}
