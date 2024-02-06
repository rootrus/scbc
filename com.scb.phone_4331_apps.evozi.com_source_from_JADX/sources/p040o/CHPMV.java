package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider;
import java.io.IOException;

/* renamed from: o.CHPMV */
public final class CHPMV extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public CHPMV(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        LocalProjectProvider.VersionTable.VersionList versionList = (LocalProjectProvider.VersionTable.VersionList) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        if (versionList != versionList.dataVersion) {
            validatedagrecurse.read(jsonWriter, 297);
            String str = versionList.dataVersion;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (versionList != versionList.sdkMajor) {
            validatedagrecurse.read(jsonWriter, 259);
            String str2 = versionList.sdkMajor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (versionList != versionList.sdkMinor) {
            validatedagrecurse.read(jsonWriter, 305);
            String str3 = versionList.sdkMinor;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        LocalProjectProvider.VersionTable.VersionList versionList = new LocalProjectProvider.VersionTable.VersionList();
        Gson gson = this.read;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 19) {
                if (write != 91) {
                    if (write != 347) {
                        jsonReader.skipValue();
                    } else if (z) {
                        versionList.sdkMinor = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        versionList.sdkMinor = null;
                    }
                } else if (z) {
                    versionList.sdkMajor = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    versionList.sdkMajor = null;
                }
            } else if (z) {
                versionList.dataVersion = gson.getAdapter(String.class).read(jsonReader);
            } else {
                versionList.dataVersion = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return versionList;
    }
}
