package p040o;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: o.zzuj */
public class zzuj extends zzuh {
    private int MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ zzuj() {
    }

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 443) {
            if (i != 525) {
                read(gson, jsonReader, i);
            } else if (z) {
                this.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                this.MediaBrowserCompat$ItemReceiver = null;
                jsonReader.nextNull();
            }
        } else if (z) {
            this.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(Integer.class).read(jsonReader).intValue();
        } else {
            jsonReader.nextNull();
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            IconCompatParcelizer(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        write(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void write(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 223);
            String str = this.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        validatedagrecurse.read(jsonWriter, 336);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        read(gson, jsonWriter, validatedagrecurse);
    }

    public zzuj(int i, String str, zzrm zzrm) {
        super(zzrm);
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.MediaBrowserCompat$ItemReceiver = str;
    }
}
