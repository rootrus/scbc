package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/* renamed from: o.fromJsonString */
public final class fromJsonString extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private Gson read;

    public fromJsonString(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        getLayers getlayers = (getLayers) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$ItemReceiver;
        jsonWriter.beginObject();
        validatedagrecurse.read(jsonWriter, 289);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(getlayers.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (getlayers != getlayers.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 92);
            String str = getlayers.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (getlayers != getlayers.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 359);
            getLayers$MediaBrowserCompat$ItemReceiver getlayers_mediabrowsercompat_itemreceiver = getlayers.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, getLayers$MediaBrowserCompat$ItemReceiver.class, (Object) getlayers_mediabrowsercompat_itemreceiver).write(jsonWriter, getlayers_mediabrowsercompat_itemreceiver);
        }
        if (getlayers != getlayers.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 205);
            String str2 = getlayers.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (getlayers != getlayers.read) {
            validatedagrecurse.read(jsonWriter, 437);
            String str3 = getlayers.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (getlayers != getlayers.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, 103);
            String str4 = getlayers.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (getlayers != getlayers.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 303);
            String str5 = getlayers.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (getlayers != getlayers.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 275);
            String str6 = getlayers.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        validatedagrecurse.read(jsonWriter, 336);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(getlayers.RatingCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        getLayers getlayers = new getLayers();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 136) {
                if (write != 143) {
                    if (write != 218) {
                        if (write != 224) {
                            if (write != 443) {
                                if (write != 491) {
                                    if (write != 555) {
                                        if (write != 560) {
                                            if (write != 577) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                getlayers.read = gson.getAdapter(String.class).read(jsonReader);
                                            } else {
                                                getlayers.read = null;
                                            }
                                        } else if (z) {
                                            getlayers.MediaBrowserCompat$MediaItem = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            getlayers.MediaBrowserCompat$MediaItem = null;
                                        }
                                    } else if (z) {
                                        getlayers.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        getlayers.MediaMetadataCompat = null;
                                    }
                                } else if (z) {
                                    getlayers.write = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                                }
                            } else if (z) {
                                getlayers.RatingCompat = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                            }
                        } else if (z) {
                            getlayers.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            getlayers.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        getlayers.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        getlayers.MediaBrowserCompat$ItemReceiver = null;
                    }
                } else if (z) {
                    getlayers.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(getLayers$MediaBrowserCompat$ItemReceiver.class).read(jsonReader);
                } else {
                    getlayers.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                getlayers.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
            } else {
                getlayers.MediaDescriptionCompat = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return getlayers;
    }
}
