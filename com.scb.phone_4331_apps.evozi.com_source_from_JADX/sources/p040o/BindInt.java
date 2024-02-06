package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: o.BindInt */
public final class BindInt extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private Gson write;

    public BindInt(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BindBitmap bindBitmap = (BindBitmap) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (bindBitmap != bindBitmap.write) {
            validatedagrecurse.read(jsonWriter, 330);
            BindBool bindBool = new BindBool();
            List<BindDimen> list = bindBitmap.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) bindBool, (Object) list).write(jsonWriter, list);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BindBitmap bindBitmap = new BindBitmap();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 323) {
                jsonReader.skipValue();
            } else if (z) {
                bindBitmap.write = (List) gson.getAdapter(new BindBool()).read(jsonReader);
            } else {
                bindBitmap.write = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return bindBitmap;
    }
}
