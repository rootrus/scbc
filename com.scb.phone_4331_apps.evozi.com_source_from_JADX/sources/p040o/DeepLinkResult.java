package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.DeepLinkResult */
public final class DeepLinkResult extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;

    public DeepLinkResult(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        canonicalize canonicalize = (canonicalize) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (canonicalize != canonicalize.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 409);
            decodeHexDigit decodehexdigit = canonicalize.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, decodeHexDigit.class, (Object) decodehexdigit).write(jsonWriter, decodehexdigit);
        }
        if (canonicalize != canonicalize.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 59);
            String str = canonicalize.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (canonicalize != canonicalize.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 203);
            String str2 = canonicalize.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (canonicalize != canonicalize.write) {
            validatedagrecurse.read(jsonWriter, 466);
            String str3 = canonicalize.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (canonicalize != canonicalize.read) {
            validatedagrecurse.read(jsonWriter, 116);
            decodeHexDigit decodehexdigit2 = canonicalize.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, decodeHexDigit.class, (Object) decodehexdigit2).write(jsonWriter, decodehexdigit2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        canonicalize canonicalize = new canonicalize();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 101) {
                if (write != 110) {
                    if (write != 267) {
                        if (write != 329) {
                            if (write != 401) {
                                jsonReader.skipValue();
                            } else if (z) {
                                canonicalize.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                canonicalize.IconCompatParcelizer = null;
                            }
                        } else if (z) {
                            canonicalize.write = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            canonicalize.write = null;
                        }
                    } else if (z) {
                        canonicalize.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        canonicalize.MediaBrowserCompat$ItemReceiver = null;
                    }
                } else if (z) {
                    canonicalize.read = gson.getAdapter(decodeHexDigit.class).read(jsonReader);
                } else {
                    canonicalize.read = null;
                }
            } else if (z) {
                canonicalize.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(decodeHexDigit.class).read(jsonReader);
            } else {
                canonicalize.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return canonicalize;
    }
}
