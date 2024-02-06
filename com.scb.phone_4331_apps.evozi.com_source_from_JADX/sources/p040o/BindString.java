package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: o.BindString */
public final class BindString extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle write;

    public BindString(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        BindDrawable bindDrawable = (BindDrawable) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (bindDrawable != bindDrawable.read) {
            validatedagrecurse.read(jsonWriter, 330);
            BindFont bindFont = new BindFont();
            List<BindColor> list = bindDrawable.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) bindFont, (Object) list).write(jsonWriter, list);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        BindDrawable bindDrawable = new BindDrawable();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 323) {
                jsonReader.skipValue();
            } else if (z) {
                bindDrawable.read = (List) gson.getAdapter(new BindFont()).read(jsonReader);
            } else {
                bindDrawable.read = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return bindDrawable;
    }
}
