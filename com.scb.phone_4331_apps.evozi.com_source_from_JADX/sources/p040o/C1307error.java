package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.error */
public final class C1307error extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public C1307error(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        decodeHexDigit decodehexdigit = (decodeHexDigit) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (decodehexdigit != decodehexdigit.write) {
            validatedagrecurse.read(jsonWriter, 222);
            String str = decodehexdigit.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (decodehexdigit != decodehexdigit.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 310);
            String str2 = decodehexdigit.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (decodehexdigit != decodehexdigit.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 445);
            String str3 = decodehexdigit.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        decodeHexDigit decodehexdigit = new decodeHexDigit();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 238) {
                if (write != 324) {
                    if (write != 403) {
                        jsonReader.skipValue();
                    } else if (z) {
                        decodehexdigit.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        decodehexdigit.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                } else if (z) {
                    decodehexdigit.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    decodehexdigit.write = null;
                }
            } else if (z) {
                decodehexdigit.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                decodehexdigit.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return decodehexdigit;
    }
}
