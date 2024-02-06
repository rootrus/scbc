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
import p040o.GoogleMap;

/* renamed from: o.zzva */
public final class zzva extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;
    private Gson write;

    public zzva(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = gson;
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        zzvf zzvf = (zzvf) obj;
        Gson gson = this.write;
        validateDAGRecurse validatedagrecurse = this.IconCompatParcelizer;
        jsonWriter.beginObject();
        if (zzvf != zzvf.read) {
            validatedagrecurse.read(jsonWriter, 544);
            zzve zzve = new zzve();
            List<onIndoorLevelActivated> list = zzvf.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzve, (Object) list).write(jsonWriter, list);
        }
        if (zzvf != zzvf.write) {
            validatedagrecurse.read(jsonWriter, 22);
            zzsd zzsd = new zzsd();
            List<zzrr> list2 = zzvf.write;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzsd, (Object) list2).write(jsonWriter, list2);
        }
        if (zzvf != zzvf.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 79);
            zzrn zzrn = zzvf.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, zzrn.class, (Object) zzrn).write(jsonWriter, zzrn);
        }
        if (zzvf != zzvf.MediaBrowserCompat$CustomActionResultReceiver) {
            validatedagrecurse.read(jsonWriter, 333);
            zzsa zzsa = new zzsa();
            List<zzun> list3 = zzvf.MediaBrowserCompat$CustomActionResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzsa, (Object) list3).write(jsonWriter, list3);
        }
        if (zzvf != zzvf.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 284);
            zzvh zzvh = new zzvh();
            List<zzup> list4 = zzvf.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzvh, (Object) list4).write(jsonWriter, list4);
        }
        if (zzvf != zzvf.MediaBrowserCompat$MediaItem) {
            validatedagrecurse.read(jsonWriter, 484);
            zzvi zzvi = new zzvi();
            List<zzrt> list5 = zzvf.MediaBrowserCompat$MediaItem;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzvi, (Object) list5).write(jsonWriter, list5);
        }
        if (zzvf != zzvf.MediaDescriptionCompat) {
            validatedagrecurse.read(jsonWriter, 448);
            zzsb zzsb = new zzsb();
            List<zzur> list6 = zzvf.MediaDescriptionCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzsb, (Object) list6).write(jsonWriter, list6);
        }
        if (zzvf != zzvf.RatingCompat) {
            validatedagrecurse.read(jsonWriter, 387);
            zzsc zzsc = new zzsc();
            List<zzry> list7 = zzvf.RatingCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzsc, (Object) list7).write(jsonWriter, list7);
        }
        if (zzvf != zzvf.MediaMetadataCompat) {
            validatedagrecurse.read(jsonWriter, CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384);
            GoogleMap.OnMapClickListener onMapClickListener = zzvf.MediaMetadataCompat;
            findNode.MediaBrowserCompat$ItemReceiver(gson, GoogleMap.OnMapClickListener.class, (Object) onMapClickListener).write(jsonWriter, onMapClickListener);
        }
        if (zzvf != zzvf.MediaBrowserCompat$SearchResultReceiver) {
            validatedagrecurse.read(jsonWriter, 17);
            zzse zzse = new zzse();
            List<zzrt> list8 = zzvf.MediaBrowserCompat$SearchResultReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) zzse, (Object) list8).write(jsonWriter, list8);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        zzvf zzvf = new zzvf();
        Gson gson = this.write;
        validateCycle validatecycle = this.MediaBrowserCompat$ItemReceiver;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write2 = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write2 != 106) {
                if (write2 != 171) {
                    if (write2 != 217) {
                        if (write2 != 257) {
                            if (write2 != 264) {
                                if (write2 != 330) {
                                    if (write2 != 463) {
                                        if (write2 != 506) {
                                            if (write2 != 526) {
                                                if (write2 != 603) {
                                                    jsonReader.skipValue();
                                                } else if (z) {
                                                    zzvf.MediaDescriptionCompat = (List) gson.getAdapter(new zzsb()).read(jsonReader);
                                                } else {
                                                    zzvf.MediaDescriptionCompat = null;
                                                }
                                            } else if (z) {
                                                zzvf.write = (List) gson.getAdapter(new zzsd()).read(jsonReader);
                                            } else {
                                                zzvf.write = null;
                                            }
                                        } else if (z) {
                                            zzvf.MediaBrowserCompat$SearchResultReceiver = (List) gson.getAdapter(new zzse()).read(jsonReader);
                                        } else {
                                            zzvf.MediaBrowserCompat$SearchResultReceiver = null;
                                        }
                                    } else if (z) {
                                        zzvf.MediaBrowserCompat$MediaItem = (List) gson.getAdapter(new zzvi()).read(jsonReader);
                                    } else {
                                        zzvf.MediaBrowserCompat$MediaItem = null;
                                    }
                                } else if (z) {
                                    zzvf.RatingCompat = (List) gson.getAdapter(new zzsc()).read(jsonReader);
                                } else {
                                    zzvf.RatingCompat = null;
                                }
                            } else if (z) {
                                zzvf.MediaBrowserCompat$ItemReceiver = (List) gson.getAdapter(new zzvh()).read(jsonReader);
                            } else {
                                zzvf.MediaBrowserCompat$ItemReceiver = null;
                            }
                        } else if (z) {
                            zzvf.IconCompatParcelizer = gson.getAdapter(zzrn.class).read(jsonReader);
                        } else {
                            zzvf.IconCompatParcelizer = null;
                        }
                    } else if (z) {
                        zzvf.read = (List) gson.getAdapter(new zzve()).read(jsonReader);
                    } else {
                        zzvf.read = null;
                    }
                } else if (z) {
                    zzvf.MediaBrowserCompat$CustomActionResultReceiver = (List) gson.getAdapter(new zzsa()).read(jsonReader);
                } else {
                    zzvf.MediaBrowserCompat$CustomActionResultReceiver = null;
                }
            } else if (z) {
                zzvf.MediaMetadataCompat = gson.getAdapter(GoogleMap.OnMapClickListener.class).read(jsonReader);
            } else {
                zzvf.MediaMetadataCompat = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return zzvf;
    }
}
