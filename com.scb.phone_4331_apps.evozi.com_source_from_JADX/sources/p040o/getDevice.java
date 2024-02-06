package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getDevice */
public final class getDevice extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public getDevice(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = (AutoValue_CrashlyticsReport_Session) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (autoValue_CrashlyticsReport_Session != autoValue_CrashlyticsReport_Session.write) {
            validatedagrecurse.read(jsonWriter, 354);
            String str = autoValue_CrashlyticsReport_Session.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (autoValue_CrashlyticsReport_Session != autoValue_CrashlyticsReport_Session.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 384);
            String str2 = autoValue_CrashlyticsReport_Session.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = new AutoValue_CrashlyticsReport_Session();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 117) {
                if (write2 != 254) {
                    jsonReader.skipValue();
                } else if (z) {
                    autoValue_CrashlyticsReport_Session.write = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    autoValue_CrashlyticsReport_Session.write = null;
                }
            } else if (z) {
                autoValue_CrashlyticsReport_Session.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                autoValue_CrashlyticsReport_Session.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return autoValue_CrashlyticsReport_Session;
    }
}
