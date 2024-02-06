package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.AdvertisingIdClient;

/* renamed from: o.getBoolean */
public final class getBoolean extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse write;

    public getBoolean(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        AdvertisingIdClient.Info info = (AdvertisingIdClient.Info) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.write;
        jsonWriter.beginObject();
        if (info != info.read) {
            validatedagrecurse.read(jsonWriter, 582);
            String str = info.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (info != info.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 204);
            String str2 = info.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (info != info.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 408);
            String str3 = info.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (info != info.write) {
            validatedagrecurse.read(jsonWriter, 627);
            String str4 = info.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (info != info.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 438);
            Integer num = info.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Integer.class, (Object) num).write(jsonWriter, num);
        }
        if (info != info.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 358);
            Double d = info.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, Double.class, (Object) d).write(jsonWriter, d);
        }
        if (info != info.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256);
            String str5 = info.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (info != info.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 533);
            String str6 = info.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (info != info.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 489);
            String str7 = info.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        AdvertisingIdClient.Info info = new AdvertisingIdClient.Info();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 74) {
                if (write2 != 142) {
                    if (write2 != 182) {
                        if (write2 != 215) {
                            if (write2 != 394) {
                                if (write2 != 502) {
                                    if (write2 != 530) {
                                        if (write2 != 476) {
                                            if (write2 != 477) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                info.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
                                            } else {
                                                info.MediaDescriptionCompat = null;
                                            }
                                        } else if (z) {
                                            info.MediaBrowserCompat$MediaItem = gson.getAdapter(Double.class).read(jsonReader);
                                        } else {
                                            info.MediaBrowserCompat$MediaItem = null;
                                        }
                                    } else if (z) {
                                        info.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        info.RatingCompat = null;
                                    }
                                } else if (z) {
                                    info.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    info.IconCompatParcelizer = null;
                                }
                            } else if (z) {
                                info.read = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                info.read = null;
                            }
                        } else if (z) {
                            info.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            info.MediaBrowserCompat$CustomActionResultReceiver = null;
                        }
                    } else if (z) {
                        info.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        info.MediaMetadataCompat = null;
                    }
                } else if (z) {
                    info.MediaBrowserCompat$ItemReceiver = gson.getAdapter(Integer.class).read(jsonReader);
                } else {
                    info.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                info.write = gson.getAdapter(String.class).read(jsonReader);
            } else {
                info.write = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return info;
    }
}
