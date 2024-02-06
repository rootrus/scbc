package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.List;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.JsonUtils */
public final class JsonUtils extends TypeAdapter implements addKernel {
    private Gson MediaBrowserCompat$ItemReceiver;
    private validateDAGRecurse read;
    private validateCycle write;

    public JsonUtils(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.write = validatecycle;
        this.read = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        KeyframeParser keyframeParser = (KeyframeParser) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.read;
        jsonWriter.beginObject();
        if (keyframeParser != keyframeParser.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA);
            putInterpolator putinterpolator = new putInterpolator();
            List<jsonObjectToPoint> list = keyframeParser.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) putinterpolator, (Object) list).write(jsonWriter, list);
        }
        if (keyframeParser != keyframeParser.read) {
            validatedagrecurse.read(jsonWriter, 14);
            KeyframesParser keyframesParser = new KeyframesParser();
            List<isScaleIdentity> list2 = keyframeParser.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) keyframesParser, (Object) list2).write(jsonWriter, list2);
        }
        if (keyframeParser != keyframeParser.write) {
            validatedagrecurse.read(jsonWriter, 65);
            parseKeyframe parsekeyframe = new parseKeyframe();
            List<getOpacityAtPosition> list3 = keyframeParser.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) parsekeyframe, (Object) list3).write(jsonWriter, list3);
        }
        validatedagrecurse.read(jsonWriter, 129);
        Class cls = Integer.TYPE;
        Integer valueOf = Integer.valueOf(keyframeParser.IconCompatParcelizer);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (keyframeParser != keyframeParser.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 274);
            parseStaticValue parsestaticvalue = new parseStaticValue();
            List<parseFloat> list4 = keyframeParser.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) parsestaticvalue, (Object) list4).write(jsonWriter, list4);
        }
        validatedagrecurse.read(jsonWriter, 269);
        Class cls2 = Integer.TYPE;
        Integer valueOf2 = Integer.valueOf(keyframeParser.RatingCompat);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls2, (Object) valueOf2).write(jsonWriter, valueOf2);
        if (keyframeParser != keyframeParser.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256);
            parseAssets parseassets = new parseAssets();
            List<getOpacityAtPosition> list5 = keyframeParser.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) parseassets, (Object) list5).write(jsonWriter, list5);
        }
        validatedagrecurse.read(jsonWriter, 462);
        Class cls3 = Integer.TYPE;
        Integer valueOf3 = Integer.valueOf(keyframeParser.MediaBrowserCompat$SearchResultReceiver);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls3, (Object) valueOf3).write(jsonWriter, valueOf3);
        if (keyframeParser != keyframeParser.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 377);
            LottieCompositionMoshiParser lottieCompositionMoshiParser = new LottieCompositionMoshiParser();
            List<jsonObjectToPoint> list6 = keyframeParser.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) lottieCompositionMoshiParser, (Object) list6).write(jsonWriter, list6);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        KeyframeParser keyframeParser = new KeyframeParser();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.write;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 3) {
                if (write2 != 103) {
                    if (write2 != 118) {
                        if (write2 != 247) {
                            if (write2 != 276) {
                                if (write2 != 309) {
                                    if (write2 != 494) {
                                        if (write2 != 532) {
                                            if (write2 != 588) {
                                                jsonReader.skipValue();
                                            } else if (z) {
                                                keyframeParser.MediaBrowserCompat$MediaItem = (List) gson.getAdapter(new LottieCompositionMoshiParser()).read(jsonReader);
                                            } else {
                                                keyframeParser.MediaBrowserCompat$MediaItem = null;
                                            }
                                        } else if (z) {
                                            keyframeParser.MediaBrowserCompat$CustomActionResultReceiver = (List) gson.getAdapter(new parseStaticValue()).read(jsonReader);
                                        } else {
                                            keyframeParser.MediaBrowserCompat$CustomActionResultReceiver = null;
                                        }
                                    } else if (z) {
                                        keyframeParser.read = (List) gson.getAdapter(new KeyframesParser()).read(jsonReader);
                                    } else {
                                        keyframeParser.read = null;
                                    }
                                } else if (z) {
                                    keyframeParser.MediaBrowserCompat$ItemReceiver = (List) gson.getAdapter(new putInterpolator()).read(jsonReader);
                                } else {
                                    keyframeParser.MediaBrowserCompat$ItemReceiver = null;
                                }
                            } else if (z) {
                                keyframeParser.MediaMetadataCompat = (List) gson.getAdapter(new parseAssets()).read(jsonReader);
                            } else {
                                keyframeParser.MediaMetadataCompat = null;
                            }
                        } else if (z) {
                            keyframeParser.IconCompatParcelizer = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                        }
                    } else if (z) {
                        keyframeParser.write = (List) gson.getAdapter(new parseKeyframe()).read(jsonReader);
                    } else {
                        keyframeParser.write = null;
                    }
                } else if (z) {
                    keyframeParser.MediaBrowserCompat$SearchResultReceiver = gson.getAdapter(Integer.class).read(jsonReader).intValue();
                }
            } else if (z) {
                keyframeParser.RatingCompat = gson.getAdapter(Integer.class).read(jsonReader).intValue();
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return keyframeParser;
    }
}
