package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;
import org.bouncycastle.math.Primes;
import p040o.setFontAssetDelegate;

/* renamed from: o.setMaxProgress */
public final class setMaxProgress extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private Gson MediaBrowserCompat$CustomActionResultReceiver;
    private validateCycle MediaBrowserCompat$ItemReceiver;

    public setMaxProgress(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        setFontAssetDelegate.read read = (setFontAssetDelegate.read) obj;
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (read != read.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 5);
            String str = read.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (read != read.read) {
            validatedagrecurse.read(jsonWriter, 470);
            String str2 = read.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (read != read.write) {
            validatedagrecurse.read(jsonWriter, 227);
            String str3 = read.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (read != read.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 321);
            String str4 = read.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        if (read != read.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 110);
            String str5 = read.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (read != read.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DHE_PSK_WITH_AES_256_GCM_SHA384);
            String str6 = read.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        if (read != read.RatingCompat) {
            validatedagrecurse.read(jsonWriter, Primes.SMALL_FACTOR_LIMIT);
            String str7 = read.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str7).write(jsonWriter, str7);
        }
        if (read != read.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 355);
            String str8 = read.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str8).write(jsonWriter, str8);
        }
        if (read != read.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 267);
            String str9 = read.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str9).write(jsonWriter, str9);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        setFontAssetDelegate.read read = new setFontAssetDelegate.read();
        Gson gson = this.MediaBrowserCompat$CustomActionResultReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 122) {
                if (write != 178) {
                    if (write != 235) {
                        if (write != 317) {
                            if (write != 340) {
                                if (write != 422) {
                                    if (write != 438) {
                                        if (write != 500) {
                                            if (write != 621) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                read.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                            } else {
                                                read.MediaBrowserCompat$CustomActionResultReceiver = null;
                                            }
                                        } else if (z) {
                                            read.read = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            read.read = null;
                                        }
                                    } else if (z) {
                                        read.write = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        read.write = null;
                                    }
                                } else if (z) {
                                    read.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                } else {
                                    read.MediaBrowserCompat$SearchResultReceiver = null;
                                }
                            } else if (z) {
                                read.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                            } else {
                                read.RatingCompat = null;
                            }
                        } else if (z) {
                            read.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            read.MediaBrowserCompat$ItemReceiver = null;
                        }
                    } else if (z) {
                        read.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        read.IconCompatParcelizer = null;
                    }
                } else if (z) {
                    read.MediaDescriptionCompat = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    read.MediaDescriptionCompat = null;
                }
            } else if (z) {
                read.MediaMetadataCompat = gson.getAdapter(String.class).read(jsonReader);
            } else {
                read.MediaMetadataCompat = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return read;
    }
}
