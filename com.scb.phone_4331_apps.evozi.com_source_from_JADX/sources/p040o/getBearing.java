package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.getBearing */
public final class getBearing extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;

    public getBearing(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        setBearing setbearing = (setBearing) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (setbearing != setbearing.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 279);
            String str = setbearing.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (setbearing != setbearing.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 227);
            String str2 = setbearing.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (setbearing != setbearing.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 262);
            String str3 = setbearing.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (setbearing != setbearing.read) {
            validatedagrecurse.read(jsonWriter, 321);
            String str4 = setbearing.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (setbearing != setbearing.write) {
            validatedagrecurse.read(jsonWriter, 110);
            String str5 = setbearing.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (setbearing != setbearing.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 201);
            Boolean bool = setbearing.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Boolean.class, (Object) bool).write(jsonWriter, bool);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        setBearing setbearing = new setBearing();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 235) {
                if (write != 236) {
                    if (write != 317) {
                        if (write != 438) {
                            if (write != 509) {
                                if (write != 519) {
                                    jsonReader.skipValue();
                                } else if (z) {
                                    setbearing.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    setbearing.MediaBrowserCompat$ItemReceiver = null;
                                }
                            } else if (z) {
                                setbearing.MediaBrowserCompat$MediaItem = gson.getAdapter(Boolean.class).read(jsonReader);
                            } else {
                                setbearing.MediaBrowserCompat$MediaItem = null;
                            }
                        } else if (z) {
                            setbearing.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            setbearing.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                    } else if (z) {
                        setbearing.write = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        setbearing.write = null;
                    }
                } else if (z) {
                    setbearing.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    setbearing.IconCompatParcelizer = null;
                }
            } else if (z) {
                setbearing.read = gson.getAdapter(String.class).read(jsonReader);
            } else {
                setbearing.read = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return setbearing;
    }
}
