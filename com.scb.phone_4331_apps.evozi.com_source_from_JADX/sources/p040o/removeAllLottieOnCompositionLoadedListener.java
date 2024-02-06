package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.removeAllLottieOnCompositionLoadedListener */
public final class removeAllLottieOnCompositionLoadedListener extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public removeAllLottieOnCompositionLoadedListener(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        removeUpdateListener removeupdatelistener = (removeUpdateListener) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (removeupdatelistener != removeupdatelistener.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 248);
            String str = removeupdatelistener.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (removeupdatelistener != removeupdatelistener.read) {
            validatedagrecurse.read(jsonWriter, 302);
            String str2 = removeupdatelistener.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (removeupdatelistener != removeupdatelistener.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 398);
            String str3 = removeupdatelistener.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (removeupdatelistener != removeupdatelistener.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 30);
            String str4 = removeupdatelistener.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (removeupdatelistener != removeupdatelistener.write) {
            validatedagrecurse.read(jsonWriter, 608);
            String str5 = removeupdatelistener.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        removeUpdateListener removeupdatelistener = new removeUpdateListener();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 54) {
                if (write2 != 170) {
                    if (write2 != 256) {
                        if (write2 != 351) {
                            if (write2 != 451) {
                                jsonReader.skipValue();
                            } else if (z) {
                                removeupdatelistener.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                removeupdatelistener.IconCompatParcelizer = null;
                            }
                        } else if (z) {
                            removeupdatelistener.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            removeupdatelistener.MediaBrowserCompat$ItemReceiver = null;
                        }
                    } else if (z) {
                        removeupdatelistener.write = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        removeupdatelistener.write = null;
                    }
                } else if (z) {
                    removeupdatelistener.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    removeupdatelistener.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                removeupdatelistener.read = gson.getAdapter(String.class).read(jsonReader);
            } else {
                removeupdatelistener.read = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return removeupdatelistener;
    }
}
