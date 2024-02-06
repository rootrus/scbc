package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Property;
import java.io.IOException;

/* renamed from: o.AddressSearchActivity */
public final class AddressSearchActivity extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public AddressSearchActivity(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Property property = (Property) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (property != property.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str = property.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (property != property.value) {
            validatedagrecurse.read(jsonWriter, 505);
            String str2 = property.value;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Property property = new Property();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 317) {
                if (write != 331) {
                    jsonReader.skipValue();
                } else if (z) {
                    property.value = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    property.value = null;
                }
            } else if (z) {
                property.name = gson.getAdapter(String.class).read(jsonReader);
            } else {
                property.name = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return property;
    }
}
