package com.thunderhead.android.infrastructure.server.requests;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import p040o.findNode;
import p040o.validateCycle;
import p040o.validateDAGRecurse;

public class DeviceInfoRequest {
    protected DeviceInfo device = null;

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        MediaBrowserCompat$ItemReceiver(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            write(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.device) {
            validatedagrecurse.read(jsonWriter, 268);
            DeviceInfo deviceInfo = this.device;
            findNode.MediaBrowserCompat$ItemReceiver(gson, DeviceInfo.class, (Object) deviceInfo).write(jsonWriter, deviceInfo);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void write(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 545) {
            jsonReader.skipValue();
        } else if (z) {
            this.device = gson.getAdapter(DeviceInfo.class).read(jsonReader);
        } else {
            this.device = null;
            jsonReader.nextNull();
        }
    }

    public DeviceInfo getDeviceInfo() {
        return this.device;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("device:[");
        DeviceInfo deviceInfo = this.device;
        if (deviceInfo != null) {
            sb.append(deviceInfo.toString());
        } else {
            sb.append("null");
        }
        sb.append("]");
        return sb.toString();
    }

    public void setDeviceInfo(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            this.device = deviceInfo;
        }
    }
}
