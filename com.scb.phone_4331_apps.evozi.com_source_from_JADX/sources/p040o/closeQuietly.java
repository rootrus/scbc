package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;

/* renamed from: o.closeQuietly */
public final class closeQuietly extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;

    public closeQuietly(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        addPoints addpoints = (addPoints) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (addpoints != addpoints.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 412);
            floorMod floormod = new floorMod();
            List<Utils> list = addpoints.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) floormod, (Object) list).write(jsonWriter, list);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        addPoints addpoints = new addPoints();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 397) {
                jsonReader.skipValue();
            } else if (z) {
                addpoints.MediaBrowserCompat$CustomActionResultReceiver = (List) gson.getAdapter(new floorMod()).read(jsonReader);
            } else {
                addpoints.MediaBrowserCompat$CustomActionResultReceiver = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return addpoints;
    }
}
