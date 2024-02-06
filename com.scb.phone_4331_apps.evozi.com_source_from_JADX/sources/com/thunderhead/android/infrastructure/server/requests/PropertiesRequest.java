package com.thunderhead.android.infrastructure.server.requests;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Property;
import p040o.validateCycle;
import p040o.validateDAGRecurse;

public class PropertiesRequest extends BaseRequest {
    public /* synthetic */ PropertiesRequest() {
    }

    public PropertiesRequest(String str) {
        super(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[uri:");
        sb.append(this.uri);
        if (this.properties != null) {
            sb.append(", properties:[");
            for (Property obj : this.properties) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("{");
                sb2.append(obj.toString());
                sb2.append("}");
                sb.append(sb2.toString());
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public final /* synthetic */ void write(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            MediaBrowserCompat$ItemReceiver(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }
}
