package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.AutoValue_CrashlyticsReport_FilesPayload_File;

/* renamed from: o.getApp */
public final class getApp extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;

    public getApp(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AutoValue_CrashlyticsReport_FilesPayload_File.C30621 r6 = (AutoValue_CrashlyticsReport_FilesPayload_File.C30621) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 221);
        Class cls = Boolean.TYPE;
        Boolean valueOf = Boolean.valueOf(r6.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (r6 != r6.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 265);
            String str = r6.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (r6 != r6.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_NULL_SHA256);
            String str2 = r6.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (r6 != r6.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 529);
            setEvents setevents = r6.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, setEvents.class, (Object) setevents).write(jsonWriter, setevents);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AutoValue_CrashlyticsReport_FilesPayload_File.C30621 r0 = new AutoValue_CrashlyticsReport_FilesPayload_File.C30621();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 63) {
                if (write != 225) {
                    if (write != 321) {
                        if (write != 440) {
                            jsonReader.skipValue();
                        } else if (z) {
                            r0.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            r0.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        r0.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        r0.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                } else if (z) {
                    r0.write = gson.getAdapter(Boolean.class).read(jsonReader).booleanValue();
                }
            } else if (z) {
                r0.MediaBrowserCompat$ItemReceiver = gson.getAdapter(setEvents.class).read(jsonReader);
            } else {
                r0.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return r0;
    }
}
