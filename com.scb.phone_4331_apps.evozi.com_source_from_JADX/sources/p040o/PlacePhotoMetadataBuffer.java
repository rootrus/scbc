package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.PlacePhotoMetadataBuffer */
public final class PlacePhotoMetadataBuffer extends TypeAdapter implements addKernel {
    private Gson IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle write;

    public PlacePhotoMetadataBuffer(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.IconCompatParcelizer = gson;
        this.write = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        PlaceDetectionClient placeDetectionClient = (PlaceDetectionClient) obj;
        Gson gson = this.IconCompatParcelizer;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (placeDetectionClient != placeDetectionClient.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 98);
            String str = placeDetectionClient.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (placeDetectionClient != placeDetectionClient.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 505);
            String str2 = placeDetectionClient.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        PlaceDetectionClient placeDetectionClient = new PlaceDetectionClient();
        Gson gson = this.IconCompatParcelizer;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 331) {
                if (write2 != 399) {
                    jsonReader.skipValue();
                } else if (z) {
                    placeDetectionClient.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    placeDetectionClient.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                placeDetectionClient.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                placeDetectionClient.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return placeDetectionClient;
    }
}
