package com.thunderhead.android.infrastructure.server.requests;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Property;
import p040o.validateCycle;
import p040o.validateDAGRecurse;

public class ResponseForOptimizationPointsRequest extends BaseRequest {
    private static final String NAME_ATT_VALUE = "_RESP_CODE_";

    public /* synthetic */ ResponseForOptimizationPointsRequest() {
    }

    public ResponseForOptimizationPointsRequest(String str) {
        super(str);
    }

    public void setCode(String str) {
        if (this.properties == null) {
            this.properties = new Property[1];
        }
        this.properties[0] = new Property(NAME_ATT_VALUE, str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("uri:");
        sb.append(this.uri);
        sb.append(", properties:[");
        for (Property obj : this.properties) {
            sb.append("{");
            sb.append(obj.toString());
            sb.append("}");
        }
        sb.append("]");
        return sb.toString();
    }

    public final /* synthetic */ void write(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            jsonReader.peek();
            JsonToken jsonToken = JsonToken.NULL;
            MediaBrowserCompat$ItemReceiver(gson, jsonReader, write);
        }
        jsonReader.endObject();
    }
}
