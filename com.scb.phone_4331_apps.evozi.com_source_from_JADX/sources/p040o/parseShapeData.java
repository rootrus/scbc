package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.parseShapeData */
public final class parseShapeData extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson write;

    public parseShapeData(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        isRotationIdentity isrotationidentity = (isRotationIdentity) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (isrotationidentity != isrotationidentity.read) {
            validatedagrecurse.read(jsonWriter, 98);
            String str = isrotationidentity.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (isrotationidentity != isrotationidentity.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 505);
            String str2 = isrotationidentity.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        isRotationIdentity isrotationidentity = new isRotationIdentity();
        Gson gson = this.write;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 331) {
                if (write2 != 399) {
                    jsonReader.skipValue();
                } else if (z) {
                    isrotationidentity.read = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    isrotationidentity.read = null;
                }
            } else if (z) {
                isrotationidentity.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                isrotationidentity.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return isrotationidentity;
    }
}
