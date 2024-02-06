package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getActivityClass */
public final class getActivityClass extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public getActivityClass(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        DeepLinkSpec deepLinkSpec = (DeepLinkSpec) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (deepLinkSpec != deepLinkSpec.read) {
            validatedagrecurse.read(jsonWriter, 518);
            Double d = deepLinkSpec.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d).write(jsonWriter, d);
        }
        if (deepLinkSpec != deepLinkSpec.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 125);
            String str = deepLinkSpec.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (deepLinkSpec != deepLinkSpec.write) {
            validatedagrecurse.read(jsonWriter, 578);
            String str2 = deepLinkSpec.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (deepLinkSpec != deepLinkSpec.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 539);
            String str3 = deepLinkSpec.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (deepLinkSpec != deepLinkSpec.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 20);
            String str4 = deepLinkSpec.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (deepLinkSpec != deepLinkSpec.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 478);
            String str5 = deepLinkSpec.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        DeepLinkSpec deepLinkSpec = new DeepLinkSpec();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 42) {
                if (write != 243) {
                    if (write != 382) {
                        if (write != 387) {
                            if (write != 392) {
                                if (write != 622) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    deepLinkSpec.write = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    deepLinkSpec.write = null;
                                }
                            } else if (z) {
                                deepLinkSpec.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                deepLinkSpec.MediaDescriptionCompat = null;
                            }
                        } else if (z) {
                            deepLinkSpec.read = gson.getAdapter(Double.class).read(jsonReader);
                        } else {
                            deepLinkSpec.read = null;
                        }
                    } else if (z) {
                        deepLinkSpec.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        deepLinkSpec.MediaBrowserCompat$CustomActionResultReceiver = null;
                    }
                } else if (z) {
                    deepLinkSpec.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    deepLinkSpec.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                deepLinkSpec.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                deepLinkSpec.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return deepLinkSpec;
    }
}
