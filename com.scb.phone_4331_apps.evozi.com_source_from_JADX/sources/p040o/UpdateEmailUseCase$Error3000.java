package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.ContentImage;
import java.io.IOException;

/* renamed from: o.UpdateEmailUseCase$Error3000 */
public final class UpdateEmailUseCase$Error3000 extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public UpdateEmailUseCase$Error3000(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        ContentImage contentImage = (ContentImage) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (contentImage != contentImage.imageUrl) {
            validatedagrecurse.read(jsonWriter, 235);
            String str = contentImage.imageUrl;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ContentImage contentImage = new ContentImage();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 237) {
                jsonReader.skipValue();
            } else if (z) {
                contentImage.imageUrl = gson.getAdapter(String.class).read(jsonReader);
            } else {
                contentImage.imageUrl = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return contentImage;
    }
}
