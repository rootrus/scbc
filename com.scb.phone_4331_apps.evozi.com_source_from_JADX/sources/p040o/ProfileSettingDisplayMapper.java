package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.ContentMessage;
import java.io.IOException;

/* renamed from: o.ProfileSettingDisplayMapper */
public final class ProfileSettingDisplayMapper extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;
    private validateDAGRecurse write;

    public ProfileSettingDisplayMapper(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        ContentMessage contentMessage = (ContentMessage) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (contentMessage != contentMessage.text) {
            validatedagrecurse.read(jsonWriter, 614);
            String str = contentMessage.text;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (contentMessage != contentMessage.textColor) {
            validatedagrecurse.read(jsonWriter, 31);
            String str2 = contentMessage.textColor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        validatedagrecurse.read(jsonWriter, 241);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(contentMessage.textSize);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ContentMessage contentMessage = new ContentMessage();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 129) {
                if (write2 != 185) {
                    if (write2 != 395) {
                        jsonReader.skipValue();
                    } else if (z) {
                        contentMessage.textColor = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        contentMessage.textColor = null;
                    }
                } else if (z) {
                    contentMessage.text = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    contentMessage.text = null;
                }
            } else if (z) {
                contentMessage.textSize = gson.getAdapter(Integer.class).read(jsonReader).intValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return contentMessage;
    }
}
