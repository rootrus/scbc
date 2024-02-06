package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.getMaxHeight */
public final class getMaxHeight extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson read;
    private validateDAGRecurse write;

    public getMaxHeight(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.read = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = (isRestrictedToPlacesOpenNow) obj;
        Gson gson = this.read;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 482);
            String str = isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.read) {
            validatedagrecurse.read(jsonWriter, 103);
            String str2 = isrestrictedtoplacesopennow.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 438);
            String str3 = isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.write) {
            validatedagrecurse.read(jsonWriter, 60);
            String str4 = isrestrictedtoplacesopennow.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA256);
            String str5 = isrestrictedtoplacesopennow.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 410);
            String str6 = isrestrictedtoplacesopennow.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 110);
            String str7 = isrestrictedtoplacesopennow.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 435);
            String str8 = isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (isrestrictedtoplacesopennow != isrestrictedtoplacesopennow.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
            String str9 = isrestrictedtoplacesopennow.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver(gson, jsonWriter, validatedagrecurse);
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        isRestrictedToPlacesOpenNow isrestrictedtoplacesopennow = new isRestrictedToPlacesOpenNow();
        Gson gson = this.read;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 55) {
                if (write2 != 126) {
                    if (write2 != 142) {
                        if (write2 != 188) {
                            if (write2 != 317) {
                                if (write2 != 459) {
                                    if (write2 != 533) {
                                        if (write2 != 555) {
                                            if (write2 != 559) {
                                                isrestrictedtoplacesopennow.IconCompatParcelizer(gson, jsonReader, write2);
                                            } else if (z) {
                                                isrestrictedtoplacesopennow.MediaBrowserCompat$MediaItem = gson.getAdapter(String.class).read(jsonReader);
                                            } else {
                                                isrestrictedtoplacesopennow.MediaBrowserCompat$MediaItem = null;
                                            }
                                        } else if (z) {
                                            isrestrictedtoplacesopennow.read = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            isrestrictedtoplacesopennow.read = null;
                                        }
                                    } else if (z) {
                                        isrestrictedtoplacesopennow.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        isrestrictedtoplacesopennow.MediaMetadataCompat = null;
                                    }
                                } else if (z) {
                                    isrestrictedtoplacesopennow.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    isrestrictedtoplacesopennow.RatingCompat = null;
                                }
                            } else if (z) {
                                isrestrictedtoplacesopennow.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                isrestrictedtoplacesopennow.MediaDescriptionCompat = null;
                            }
                        } else if (z) {
                            isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            isrestrictedtoplacesopennow.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                    } else if (z) {
                        isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        isrestrictedtoplacesopennow.MediaBrowserCompat$ItemReceiver = null;
                    }
                } else if (z) {
                    isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    isrestrictedtoplacesopennow.MediaBrowserCompat$SearchResultReceiver = null;
                }
            } else if (z) {
                isrestrictedtoplacesopennow.write = gson.getAdapter(String.class).read(jsonReader);
            } else {
                isrestrictedtoplacesopennow.write = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return isrestrictedtoplacesopennow;
    }
}
