package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import p040o.GoogleMap;

/* renamed from: o.onInfoWindowClose */
public final class onInfoWindowClose extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;

    public onInfoWindowClose(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        GoogleMap.OnMapClickListener onMapClickListener = (GoogleMap.OnMapClickListener) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 536);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(onMapClickListener.MediaBrowserCompat$ItemReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, 362);
        Class cls2 = Boolean.TYPE;
        Boolean valueOf2 = Boolean.valueOf(onMapClickListener.read);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        GoogleMap.OnMapClickListener onMapClickListener = new GoogleMap.OnMapClickListener();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 546) {
                if (write != 571) {
                    jsonReader.skipValue();
                } else if (z) {
                    onMapClickListener.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                }
            } else if (z) {
                onMapClickListener.read = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return onMapClickListener;
    }
}
