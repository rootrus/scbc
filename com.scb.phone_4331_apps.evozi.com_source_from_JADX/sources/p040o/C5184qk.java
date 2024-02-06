package p040o;

import java.util.List;
import p040o.ServerProjectProvider;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.qk */
public final class C5184qk extends writeUInt64NoTag<ServerProjectProvider.C706414> {
    public String IconCompatParcelizer;
    public setRamUsed MediaBrowserCompat$ItemReceiver;
    public AutoValue_CrashlyticsReport_Session_Event_Log MediaDescriptionCompat;
    public final MapConstraint MediaMetadataCompat;
    public setBatteryLevel read;
    public String write = "";

    /* renamed from: o.qk$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<setBatteryLevel, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ C5184qk MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C5184qk qkVar) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = qkVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final setBatteryLevel setbatterylevel = (setBatteryLevel) obj;
            onGetStartedClick.write((Object) setbatterylevel, "it");
            C5184qk qkVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706414>(this) {
                private /* synthetic */ IconCompatParcelizer write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((ServerProjectProvider.C706414) obj).aj_();
                    this.write.MediaBrowserCompat$CustomActionResultReceiver.read = setbatterylevel;
                    this.write.MediaBrowserCompat$CustomActionResultReceiver.write();
                }
            };
            if (qkVar.RatingCompat != null) {
                r1.IconCompatParcelizer(qkVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.qk$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<ServerProjectProvider.C706414> {
        private /* synthetic */ List MediaBrowserCompat$CustomActionResultReceiver;

        public read(List list) {
            this.MediaBrowserCompat$CustomActionResultReceiver = list;
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((ServerProjectProvider.C706414) obj).IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.qk$write */
    public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C5184qk read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public write(C5184qk qkVar) {
            super(1);
            this.read = qkVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "throwable");
            this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C5184qk(RegularImmutableBiMap regularImmutableBiMap, MapConstraint mapConstraint) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) mapConstraint, "sequentialSearchController");
        this.MediaMetadataCompat = mapConstraint;
    }

    public final void write() {
        List<String> list;
        setBatteryLevel setbatterylevel = this.read;
        if (setbatterylevel != null && (list = setbatterylevel.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            writeUInt64NoTag.IconCompatParcelizer qk_mediabrowsercompat_customactionresultreceiver = new qk$MediaBrowserCompat$CustomActionResultReceiver(list);
            if (this.RatingCompat != null) {
                qk_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }
}
