package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.PlacePhotoMetadata */
public final class PlacePhotoMetadata extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse write;

    public PlacePhotoMetadata(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getLikelihood getlikelihood = (getLikelihood) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (getlikelihood != getlikelihood.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 291);
            String str = getlikelihood.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (getlikelihood != getlikelihood.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 558);
            String str2 = getlikelihood.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        getLikelihood getlikelihood = new getLikelihood();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 23) {
                if (write2 != 547) {
                    jsonReader.skipValue();
                } else if (z) {
                    getlikelihood.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    getlikelihood.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                getlikelihood.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                getlikelihood.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return getlikelihood;
    }
}
