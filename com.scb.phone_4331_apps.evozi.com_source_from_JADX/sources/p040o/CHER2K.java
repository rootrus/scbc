package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.kofax.mobile.sdk.extract.p018id.LocalProjectProvider;
import java.io.IOException;

/* renamed from: o.CHER2K */
public final class CHER2K extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public CHER2K(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        LocalProjectProvider.VersionTable versionTable = (LocalProjectProvider.VersionTable) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (versionTable != versionTable.VersionList) {
            validatedagrecurse.read(jsonWriter, 394);
            LocalProjectProvider.VersionTable.VersionList[] versionListArr = versionTable.VersionList;
            findNode.MediaBrowserCompat$ItemReceiver(gson, LocalProjectProvider.VersionTable.VersionList[].class, (Object) versionListArr).write(jsonWriter, versionListArr);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        LocalProjectProvider.VersionTable versionTable = new LocalProjectProvider.VersionTable();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 175) {
                jsonReader.skipValue();
            } else if (z) {
                versionTable.VersionList = gson.getAdapter(LocalProjectProvider.VersionTable.VersionList[].class).read(jsonReader);
            } else {
                versionTable.VersionList = null;
                jsonReader.nextNull();
            }
        }
        jsonReader.endObject();
        return versionTable;
    }
}
