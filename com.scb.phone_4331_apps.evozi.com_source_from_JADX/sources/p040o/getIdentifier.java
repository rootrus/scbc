package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getIdentifier */
public final class getIdentifier extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle write;

    public getIdentifier(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.write = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getGenerator getgenerator = (getGenerator) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (getgenerator != getgenerator.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 102);
            String str = getgenerator.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (getgenerator != getgenerator.read) {
            validatedagrecurse.read(jsonWriter, 298);
            AutoValue_CrashlyticsReport_Session autoValue_CrashlyticsReport_Session = getgenerator.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, AutoValue_CrashlyticsReport_Session.class, (Object) autoValue_CrashlyticsReport_Session).write(jsonWriter, autoValue_CrashlyticsReport_Session);
        }
        if (getgenerator != getgenerator.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 219);
            String str2 = getgenerator.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (getgenerator != getgenerator.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 529);
            setEvents setevents = getgenerator.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, setEvents.class, (Object) setevents).write(jsonWriter, setevents);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        getGenerator getgenerator = new getGenerator();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 63) {
                if (write2 != 119) {
                    if (write2 != 176) {
                        if (write2 != 586) {
                            jsonReader.skipValue();
                        } else if (z) {
                            getgenerator.read = gson.getAdapter(AutoValue_CrashlyticsReport_Session.class).read(jsonReader);
                        } else {
                            getgenerator.read = null;
                        }
                    } else if (z) {
                        getgenerator.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        getgenerator.MediaBrowserCompat$ItemReceiver = null;
                    }
                } else if (z) {
                    getgenerator.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    getgenerator.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                getgenerator.IconCompatParcelizer = gson.getAdapter(setEvents.class).read(jsonReader);
            } else {
                getgenerator.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return getgenerator;
    }
}
