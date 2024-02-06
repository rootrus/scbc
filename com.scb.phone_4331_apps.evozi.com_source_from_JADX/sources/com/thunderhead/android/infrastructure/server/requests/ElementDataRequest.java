package com.thunderhead.android.infrastructure.server.requests;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.thunderhead.android.infrastructure.server.entitys.Property;
import p040o.findNode;
import p040o.validateCycle;
import p040o.validateDAGRecurse;

public class ElementDataRequest extends BaseRequest {
    private String elementId;
    private String elementValue;
    private String interactionName;
    private String pathForMatching;

    public /* synthetic */ ElementDataRequest() {
    }

    public ElementDataRequest(String str, String str2) {
        super(str);
        this.pathForMatching = "";
        this.elementValue = "";
        this.elementId = "";
        this.interactionName = "";
        this.properties = null;
        this.interactionName = str2;
    }

    public void setValue(String str) {
        this.elementValue = str;
    }

    public void setElementId(String str) {
        this.elementId = str;
    }

    public void setInteractionName(String str) {
        this.interactionName = str;
    }

    public void setJsonBody() {
        if (this.properties == null) {
            this.properties = new Property[1];
            this.properties[0] = new Property(this.elementId, this.elementValue);
        } else {
            int length = this.properties.length;
            Property[] propertyArr = new Property[(length + 1)];
            for (int i = 0; i < length; i++) {
                propertyArr[i] = this.properties[i];
            }
            propertyArr[length] = new Property(this.elementId, this.elementValue);
            this.properties = propertyArr;
        }
        this.elementId = null;
        this.elementValue = null;
        this.pathForMatching = null;
        this.interactionName = null;
    }

    public void setProperties(Property[] propertyArr) {
        this.properties = propertyArr;
    }

    public void setPathForMatching(String str) {
        this.pathForMatching = str;
    }

    public String getInteractionName() {
        return this.interactionName;
    }

    public String getPathForMatching() {
        return this.pathForMatching;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("uri:");
        sb.append(this.uri);
        sb.append(", properties:[");
        for (Property obj : this.properties) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("{");
            sb2.append(obj.toString());
            sb2.append("}");
            sb.append(sb2.toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public final /* synthetic */ void write(Gson gson, JsonWriter jsonWriter, validateDAGRecurse validatedagrecurse) {
        jsonWriter.beginObject();
        if (this != this.elementId) {
            validatedagrecurse.read(jsonWriter, 281);
            String str = this.elementId;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (this != this.elementValue) {
            validatedagrecurse.read(jsonWriter, 366);
            String str2 = this.elementValue;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (this != this.interactionName) {
            validatedagrecurse.read(jsonWriter, 319);
            String str3 = this.interactionName;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (this != this.pathForMatching) {
            validatedagrecurse.read(jsonWriter, 74);
            String str4 = this.pathForMatching;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        read(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final /* synthetic */ void IconCompatParcelizer(Gson gson, JsonReader jsonReader, validateCycle validatecycle) {
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 62) {
                if (write != 300) {
                    if (write != 376) {
                        if (write != 439) {
                            MediaBrowserCompat$ItemReceiver(gson, jsonReader, write);
                        } else if (z) {
                            this.interactionName = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            this.interactionName = null;
                        }
                    } else if (z) {
                        this.pathForMatching = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        this.pathForMatching = null;
                    }
                } else if (z) {
                    this.elementId = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    this.elementId = null;
                }
            } else if (z) {
                this.elementValue = gson.getAdapter(String.class).read(jsonReader);
            } else {
                this.elementValue = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
    }
}
