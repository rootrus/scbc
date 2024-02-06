package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.fromJsonSync */
public final class fromJsonSync extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateCycle read;

    public fromJsonSync(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.read = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getLayers$MediaBrowserCompat$ItemReceiver getlayers_mediabrowsercompat_itemreceiver = (getLayers$MediaBrowserCompat$ItemReceiver) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.write) {
            validatedagrecurse.read(jsonWriter, 314);
            String str = getlayers_mediabrowsercompat_itemreceiver.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 25);
            String str2 = getlayers_mediabrowsercompat_itemreceiver.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 292);
            String str3 = getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.read) {
            validatedagrecurse.read(jsonWriter, 456);
            String str4 = getlayers_mediabrowsercompat_itemreceiver.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 351);
            String str5 = getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 373);
            String str6 = getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (getlayers_mediabrowsercompat_itemreceiver != getlayers_mediabrowsercompat_itemreceiver.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 343);
            String str7 = getlayers_mediabrowsercompat_itemreceiver.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        getLayers$MediaBrowserCompat$ItemReceiver getlayers_mediabrowsercompat_itemreceiver = new getLayers$MediaBrowserCompat$ItemReceiver();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.read;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 37) {
                if (write != 114) {
                    if (write != 140) {
                        if (write != 377) {
                            if (write != 483) {
                                if (write != 584) {
                                    if (write != 606) {
                                        jsonReader.skipValue();
                                    } else if (z) {
                                        getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
                                    }
                                } else if (z) {
                                    getlayers_mediabrowsercompat_itemreceiver.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    getlayers_mediabrowsercompat_itemreceiver.IconCompatParcelizer = null;
                                }
                            } else if (z) {
                                getlayers_mediabrowsercompat_itemreceiver.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                getlayers_mediabrowsercompat_itemreceiver.MediaMetadataCompat = null;
                            }
                        } else if (z) {
                            getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver = null;
                        }
                    } else if (z) {
                        getlayers_mediabrowsercompat_itemreceiver.write = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        getlayers_mediabrowsercompat_itemreceiver.write = null;
                    }
                } else if (z) {
                    getlayers_mediabrowsercompat_itemreceiver.read = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    getlayers_mediabrowsercompat_itemreceiver.read = null;
                }
            } else if (z) {
                getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                getlayers_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return getlayers_mediabrowsercompat_itemreceiver;
    }
}
