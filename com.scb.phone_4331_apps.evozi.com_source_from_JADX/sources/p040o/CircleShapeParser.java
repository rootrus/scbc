package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.CircleShapeParser */
public final class CircleShapeParser extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;

    public CircleShapeParser(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        isScaleIdentity isscaleidentity = (isScaleIdentity) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (isscaleidentity != isscaleidentity.write) {
            validatedagrecurse.read(jsonWriter, 444);
            String str = isscaleidentity.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (isscaleidentity != isscaleidentity.read) {
            validatedagrecurse.read(jsonWriter, 312);
            String str2 = isscaleidentity.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        if (isscaleidentity != isscaleidentity.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA);
            String str3 = isscaleidentity.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str3).write(jsonWriter, str3);
        }
        if (isscaleidentity != isscaleidentity.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 357);
            String str4 = isscaleidentity.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str4).write(jsonWriter, str4);
        }
        validatedagrecurse.read(jsonWriter, 374);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(isscaleidentity.MediaBrowserCompat$CustomActionResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        validatedagrecurse.read(jsonWriter, 336);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(isscaleidentity.MediaMetadataCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (isscaleidentity != isscaleidentity.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 252);
            String str5 = isscaleidentity.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str5).write(jsonWriter, str5);
        }
        if (isscaleidentity != isscaleidentity.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 501);
            String str6 = isscaleidentity.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str6).write(jsonWriter, str6);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        isScaleIdentity isscaleidentity = new isScaleIdentity();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 184) {
                if (write != 209) {
                    if (write != 246) {
                        if (write != 301) {
                            if (write != 443) {
                                if (write != 493) {
                                    if (write != 592) {
                                        if (write != 624) {
                                            jsonReader.skipValue();
                                        } else if (z) {
                                            isscaleidentity.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(String.class).read(jsonReader);
                                        } else {
                                            isscaleidentity.MediaBrowserCompat$SearchResultReceiver = null;
                                        }
                                    } else if (z) {
                                        isscaleidentity.RatingCompat = gson.getAdapter(String.class).read(jsonReader);
                                    } else {
                                        isscaleidentity.RatingCompat = null;
                                    }
                                } else if (z) {
                                    isscaleidentity.MediaBrowserCompat$CustomActionResultReceiver = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                                }
                            } else if (z) {
                                isscaleidentity.MediaMetadataCompat = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                            }
                        } else if (z) {
                            isscaleidentity.write = gson.getAdapter(String.class).read(jsonReader);
                        } else {
                            isscaleidentity.write = null;
                        }
                    } else if (z) {
                        isscaleidentity.read = gson.getAdapter(String.class).read(jsonReader);
                    } else {
                        isscaleidentity.read = null;
                    }
                } else if (z) {
                    isscaleidentity.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    isscaleidentity.IconCompatParcelizer = null;
                }
            } else if (z) {
                isscaleidentity.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
            } else {
                isscaleidentity.MediaBrowserCompat$ItemReceiver = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return isscaleidentity;
    }
}
