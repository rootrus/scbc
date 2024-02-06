package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Viewpoint;
import java.io.IOException;

/* renamed from: o.BaseActivity_ViewBinding */
public final class BaseActivity_ViewBinding extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private Gson read;

    public BaseActivity_ViewBinding(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Viewpoint viewpoint = (Viewpoint) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (viewpoint != viewpoint.f3117id) {
            validatedagrecurse.read(jsonWriter, 438);
            String str = viewpoint.f3117id;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (viewpoint != viewpoint.name) {
            validatedagrecurse.read(jsonWriter, 110);
            String str2 = viewpoint.name;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        Viewpoint viewpoint = new Viewpoint();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 142) {
                if (write != 317) {
                    jsonReader.skipValue();
                } else if (z) {
                    viewpoint.name = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    viewpoint.name = null;
                }
            } else if (z) {
                viewpoint.f3117id = gson.getAdapter(String.class).read(jsonReader);
            } else {
                viewpoint.f3117id = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return viewpoint;
    }
}
