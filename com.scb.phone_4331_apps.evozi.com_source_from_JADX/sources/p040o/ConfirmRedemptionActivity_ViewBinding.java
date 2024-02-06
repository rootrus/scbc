package p040o;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: o.ConfirmRedemptionActivity_ViewBinding */
public final class ConfirmRedemptionActivity_ViewBinding extends TypeAdapter implements addKernel {
    private validateCycle IconCompatParcelizer;
    private validateDAGRecurse MediaBrowserCompat$CustomActionResultReceiver;
    private Gson MediaBrowserCompat$ItemReceiver;

    public ConfirmRedemptionActivity_ViewBinding(Gson gson, validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = gson;
        this.IconCompatParcelizer = validatecycle;
        this.MediaBrowserCompat$CustomActionResultReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
            return;
        }
        ECouponCommonActivity eCouponCommonActivity = (ECouponCommonActivity) obj;
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateDAGRecurse validatedagrecurse = this.MediaBrowserCompat$CustomActionResultReceiver;
        jsonWriter.beginObject();
        if (eCouponCommonActivity != eCouponCommonActivity.MediaBrowserCompat$ItemReceiver) {
            validatedagrecurse.read(jsonWriter, 70);
            String str = eCouponCommonActivity.MediaBrowserCompat$ItemReceiver;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str).write(jsonWriter, str);
        }
        if (eCouponCommonActivity != eCouponCommonActivity.read) {
            validatedagrecurse.read(jsonWriter, 300);
            ECouponRedemptionDetailActivity eCouponRedemptionDetailActivity = new ECouponRedemptionDetailActivity();
            HashMap<String, String> hashMap = eCouponCommonActivity.read;
            findNode.MediaBrowserCompat$ItemReceiver(gson, (TypeToken) eCouponRedemptionDetailActivity, (Object) hashMap).write(jsonWriter, hashMap);
        }
        validatedagrecurse.read(jsonWriter, 270);
        Class cls = Long.TYPE;
        Long valueOf = Long.valueOf(eCouponCommonActivity.write);
        findNode.MediaBrowserCompat$ItemReceiver(gson, cls, (Object) valueOf).write(jsonWriter, valueOf);
        if (eCouponCommonActivity != eCouponCommonActivity.IconCompatParcelizer) {
            validatedagrecurse.read(jsonWriter, 435);
            String str2 = eCouponCommonActivity.IconCompatParcelizer;
            findNode.MediaBrowserCompat$ItemReceiver(gson, String.class, (Object) str2).write(jsonWriter, str2);
        }
        jsonWriter.endObject();
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.skipValue();
            return null;
        }
        ECouponCommonActivity eCouponCommonActivity = new ECouponCommonActivity();
        Gson gson = this.MediaBrowserCompat$ItemReceiver;
        validateCycle validatecycle = this.IconCompatParcelizer;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            int write = validatecycle.write(jsonReader);
            boolean z = jsonReader.peek() != JsonToken.NULL;
            if (write != 126) {
                if (write != 154) {
                    if (write != 179) {
                        if (write != 349) {
                            jsonReader.skipValue();
                        } else if (z) {
                            eCouponCommonActivity.write = gson.getAdapter(Long.class).read(jsonReader).longValue();
                        }
                    } else if (z) {
                        eCouponCommonActivity.read = (HashMap) gson.getAdapter(new ECouponRedemptionDetailActivity()).read(jsonReader);
                    } else {
                        eCouponCommonActivity.read = null;
                    }
                } else if (z) {
                    eCouponCommonActivity.MediaBrowserCompat$ItemReceiver = gson.getAdapter(String.class).read(jsonReader);
                } else {
                    eCouponCommonActivity.MediaBrowserCompat$ItemReceiver = null;
                }
            } else if (z) {
                eCouponCommonActivity.IconCompatParcelizer = gson.getAdapter(String.class).read(jsonReader);
            } else {
                eCouponCommonActivity.IconCompatParcelizer = null;
            }
            jsonReader.nextNull();
        }
        jsonReader.endObject();
        return eCouponCommonActivity;
    }
}
