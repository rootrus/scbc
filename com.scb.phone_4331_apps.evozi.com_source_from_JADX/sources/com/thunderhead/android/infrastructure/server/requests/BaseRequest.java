package com.thunderhead.android.infrastructure.server.requests;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Property;
import java.util.List;
import p040o.findNode;
import p040o.setTextAppearance;
import p040o.validateCycle;
import p040o.validateDAGRecurse;

public class BaseRequest extends DeviceInfoRequest {
    protected Property[] properties;
    private String requestType;
    private Long timestamp;
    protected String uri;

    public /* synthetic */ BaseRequest() {
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Gson gson, JsonReader jsonReader, int i) {
        boolean z = jsonReader.peek() != JsonToken.NULL;
        if (i != 72) {
            if (i != 349) {
                if (i != 374) {
                    if (i != 448) {
                        write(gson, jsonReader, i);
                    } else if (z) {
                        this.properties = gson.getAdapter(Property[].class).read(jsonReader);
                    } else {
                        this.properties = null;
                        jsonReader.nextNull();
                    }
                } else if (z) {
                    this.uri = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    this.uri = null;
                    jsonReader.nextNull();
                }
            } else if (z) {
                this.timestamp = gson.getAdapter(Long.class).read(jsonReader);
            } else {
                this.timestamp = null;
                jsonReader.nextNull();
            }
        } else if (z) {
            this.requestType = gson.getAdapter(String.class).read(jsonReader);
        } else {
            this.requestType = null;
            jsonReader.nextNull();
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void read(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        if (this != this.properties) {
            validatedagrecurse.read(jsonWriter, 609);
            Property[] propertyArr = this.properties;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Property[].class, (Object) propertyArr).write(jsonWriter, propertyArr);
        }
        if (this != this.requestType) {
            validatedagrecurse.read(jsonWriter, 427);
            String str = this.requestType;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (this != this.timestamp) {
            validatedagrecurse.read(jsonWriter, 270);
            Long l = this.timestamp;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Long.class, (Object) l).write(jsonWriter, l);
        }
        if (this != this.uri) {
            validatedagrecurse.read(jsonWriter, 158);
            String str2 = this.uri;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        MediaBrowserCompat$ItemReceiver(gson, jsonWriter, validatedagrecurse);
    }

    public final /* synthetic */ void write(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            MediaBrowserCompat$ItemReceiver(gson, jsonReader, validatecycle.write(jsonReader));
        }
        jsonReader.endObject();
    }

    public BaseRequest(String str) {
        this.properties = null;
        this.timestamp = null;
        this.requestType = null;
        this.uri = str;
    }

    public String getUri() {
        return this.uri;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setTimestamp(long j) {
        this.timestamp = Long.valueOf(j);
    }

    public void voidTimestamp() {
        this.timestamp = null;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public Property[] getProperties() {
        return this.properties;
    }

    public void setProperties(Property[] propertyArr) {
        this.properties = propertyArr;
    }

    public void setProperties(setTextAppearance<String, String> settextappearance) {
        this.properties = new Property[settextappearance.size()];
        for (int i = 0; i < settextappearance.size(); i++) {
            int i2 = i << 1;
            this.properties[i] = new Property((String) settextappearance.read[i2], (String) settextappearance.read[i2 + 1]);
        }
    }

    public void setEmptyProperties(List<String> list) {
        this.properties = new Property[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.properties[i] = new Property(list.get(i), "");
        }
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
        String deviceInfoRequest = super.toString();
        if (!deviceInfoRequest.isEmpty()) {
            sb.append(", ");
            sb.append(deviceInfoRequest);
        }
        sb.append("]");
        return sb.toString();
    }

    public void setRequestType(String str) {
        this.requestType = str;
    }

    public String getRequestType() {
        return this.requestType;
    }
}
