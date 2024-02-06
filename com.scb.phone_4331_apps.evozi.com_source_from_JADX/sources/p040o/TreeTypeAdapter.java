package p040o;

import android.util.MalformedJsonException;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import java.util.Set;
import org.json.JSONException;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.writeUInt64NoTag;

/* renamed from: o.TreeTypeAdapter */
public final /* synthetic */ class TreeTypeAdapter implements findFragmentByWho {
    public static final /* synthetic */ TreeTypeAdapter read = new TreeTypeAdapter();

    private /* synthetic */ TreeTypeAdapter() {
    }

    /* renamed from: o.TreeTypeAdapter$SingleTypeFactory */
    public final class SingleTypeFactory extends RttiJsonBill<IdCaptureModule_GetExtractionParametersFactory> {

        /* renamed from: o.TreeTypeAdapter$SingleTypeFactory$IconCompatParcelizer */
        public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<IdCaptureModule_GetExtractionParametersFactory> {
            private /* synthetic */ JsonObject read;

            public IconCompatParcelizer(JsonObject jsonObject) {
                this.read = jsonObject;
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                JsonElement jsonElement = this.read.get("rquid");
                onGetStartedClick.IconCompatParcelizer((Object) jsonElement, "obj.get(TRACKING_FIELD_NAME)");
                String asString = jsonElement.getAsString();
                onGetStartedClick.IconCompatParcelizer((Object) asString, "obj.get(TRACKING_FIELD_NAME).asString");
                ((IdCaptureModule_GetExtractionParametersFactory) obj).mo15015q_(asString);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public SingleTypeFactory(RegularImmutableBiMap regularImmutableBiMap) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        }

        /* renamed from: o.TreeTypeAdapter$SingleTypeFactory$write */
        public static final class write implements findFragmentByWho {
            private final /* synthetic */ FundFactSheetActivity write;

            private write() {
            }

            public write(FundFactSheetActivity fundFactSheetActivity) {
                this.write = fundFactSheetActivity;
            }

            public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
                return this.write.invoke(obj);
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(Object obj) {
            if (obj == null || !(obj instanceof String)) {
                read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(this));
                return;
            }
            try {
                writeUInt64NoTag.IconCompatParcelizer treeTypeAdapter$SingleTypeFactory$MediaBrowserCompat$ItemReceiver = new C3877x5ba521b7(((JsonObject) new Gson().fromJson(obj.toString(), JsonObject.class)).getAsJsonObject("payload"));
                if (this.RatingCompat != null) {
                    treeTypeAdapter$SingleTypeFactory$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(this.RatingCompat);
                }
            } catch (NullPointerException unused) {
                read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(this));
            } catch (JsonParseException unused2) {
                read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(this));
            } catch (JSONException unused3) {
                read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(this));
            } catch (MalformedJsonException unused4) {
                read(Iterables$3$MediaBrowserCompat$MediaItem.common_error, Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, (Runnable) new C3875x6eb12ce8(this));
            }
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        return ((AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder) obj).read;
    }

    /* renamed from: o.TreeTypeAdapter$GsonContextImpl */
    public final /* synthetic */ class GsonContextImpl implements getAllowReturnTransitionOverlap {
        private final /* synthetic */ Set IconCompatParcelizer;

        public /* synthetic */ GsonContextImpl(Set set) {
            this.IconCompatParcelizer = set;
        }

        public final boolean write(Object obj) {
            return this.IconCompatParcelizer.contains(((AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder) obj).read);
        }
    }
}
