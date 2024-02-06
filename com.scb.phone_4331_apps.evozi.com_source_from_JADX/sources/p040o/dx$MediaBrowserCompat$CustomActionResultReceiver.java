package p040o;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import org.json.JSONException;
import p040o.LocalProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.dx$MediaBrowserCompat$CustomActionResultReceiver */
public final class dx$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, HmlVerifyPhoneValidateOtpActivity> {
    final /* synthetic */ C4305dx MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dx$MediaBrowserCompat$CustomActionResultReceiver(C4305dx dxVar) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = dxVar;
    }

    /* renamed from: o.dx$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider.write) obj).MediaDescriptionCompat();
        }
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "response");
        boolean z = true;
        try {
            readLines MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
            onGetStartedClick.write((Object) str, "response");
            JsonObject asJsonObject = ((JsonObject) MediaBrowserCompat$ItemReceiver.read.fromJson(str, JsonObject.class)).getAsJsonObject("data");
            if (asJsonObject != null) {
                C4305dx dxVar = this.MediaBrowserCompat$CustomActionResultReceiver;
                readLines unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
                onGetStartedClick.write((Object) asJsonObject, "data");
                JsonElement jsonElement = asJsonObject.get("isIpo");
                onGetStartedClick.IconCompatParcelizer((Object) jsonElement, "data.get(\"isIpo\")");
                dxVar.MediaMetadataCompat = jsonElement.getAsBoolean();
                if (this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat) {
                    C4305dx dxVar2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C9896x72a4d03d.read;
                    if (dxVar2.RatingCompat != null) {
                        iconCompatParcelizer.IconCompatParcelizer(dxVar2.RatingCompat);
                    }
                } else {
                    C4305dx dxVar3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                    writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = write.read;
                    if (dxVar3.RatingCompat != null) {
                        iconCompatParcelizer2.IconCompatParcelizer(dxVar3.RatingCompat);
                    }
                }
                C4305dx dxVar4 = this.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer dx_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_customactionresultreceiver = new C9895x681f8ee(str);
                if (dxVar4.RatingCompat != null) {
                    dx_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(dxVar4.RatingCompat);
                }
            } else {
                C4305dx dxVar5 = this.MediaBrowserCompat$CustomActionResultReceiver;
                writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write>(this) {
                    private /* synthetic */ dx$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$ItemReceiver;

                    {
                        this.MediaBrowserCompat$ItemReceiver = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
                    }
                };
                if (dxVar5.RatingCompat != null) {
                    r0.IconCompatParcelizer(dxVar5.RatingCompat);
                }
            }
        } catch (JSONException unused2) {
            C4305dx dxVar6 = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r02 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider.write>(this) {
                private /* synthetic */ dx$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver;

                {
                    this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
                }
            };
            if (dxVar6.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r02.IconCompatParcelizer(dxVar6.RatingCompat);
            }
        }
        return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
    }
}
