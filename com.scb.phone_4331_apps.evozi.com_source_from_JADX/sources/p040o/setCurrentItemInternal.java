package p040o;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/* renamed from: o.setCurrentItemInternal */
public class setCurrentItemInternal {
    @SerializedName("error")
    public setOnPageChangeListener error;
    @SerializedName("status")
    public setOnPageChangeListener status;

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void read(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 63) {
            if (i != 612) {
                jsonReader.skipValue();
            } else if (z) {
                this.error = gson.getAdapter(setOnPageChangeListener.class).read(jsonReader);
            } else {
                this.error = null;
                jsonReader.nextNull();
            }
        } else if (z) {
            this.status = gson.getAdapter(setOnPageChangeListener.class).read(jsonReader);
        } else {
            this.status = null;
            jsonReader.nextNull();
        }
    }

    public final /* synthetic */ void read(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.error) {
            validatedagrecurse.read(jsonWriter, 226);
            setOnPageChangeListener setonpagechangelistener = this.error;
            findNode.MediaBrowserCompat$ItemReceiver(gson, setOnPageChangeListener.class, (Object) setonpagechangelistener).write(jsonWriter, setonpagechangelistener);
        }
        if (this != this.status) {
            validatedagrecurse.read(jsonWriter, 529);
            setOnPageChangeListener setonpagechangelistener2 = this.status;
            findNode.MediaBrowserCompat$ItemReceiver(gson, setOnPageChangeListener.class, (Object) setonpagechangelistener2).write(jsonWriter, setonpagechangelistener2);
        }
    }

    public final /* synthetic */ void write(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            read(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }

    public setCurrentItemInternal() {
    }

    public setCurrentItemInternal(setOnPageChangeListener setonpagechangelistener) {
        this.status = setonpagechangelistener;
    }

    public setCurrentItemInternal(setOnPageChangeListener setonpagechangelistener, setOnPageChangeListener setonpagechangelistener2) {
        this.status = setonpagechangelistener;
        this.error = setonpagechangelistener2;
    }

    public setOnPageChangeListener getStatus() {
        return this.status;
    }

    public setOnPageChangeListener getError() {
        return this.error;
    }
}
