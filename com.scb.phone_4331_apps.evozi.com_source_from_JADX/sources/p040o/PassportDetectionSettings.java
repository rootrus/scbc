package p040o;

import p040o.CheckCaptureModule_RttiExceptionResponseDeserializer_Factory;
import p040o.CrashlyticsReport;
import p040o.Ordering;

/* renamed from: o.PassportDetectionSettings */
public class PassportDetectionSettings extends writeUInt64NoTag<CheckCaptureModule_RttiExceptionResponseDeserializer_Factory.write> {
    public boolean IconCompatParcelizer;
    public CrashlyticsReport.Session.Event.Application.Execution MediaBrowserCompat$ItemReceiver;
    public final title read;
    /* access modifiers changed from: private */
    public Ordering.ArbitraryOrdering.C37211 write;

    @HmlPinActivity
    PassportDetectionSettings(RegularImmutableBiMap regularImmutableBiMap, title title, Ordering.ArbitraryOrdering.C37211 r3) {
        super(regularImmutableBiMap);
        this.write = r3;
        this.read = title;
    }

    /* renamed from: o.PassportDetectionSettings$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setSessionTimeoutDuration> {
        private processPendingCleanup IconCompatParcelizer;

        public final /* synthetic */ void onNext(Object obj) {
            setSessionTimeoutDuration setsessiontimeoutduration = (setSessionTimeoutDuration) obj;
            boolean z = true;
            if (PassportDetectionSettings.this.RatingCompat != null) {
                getUuidUtf8Bytes MediaBrowserCompat$CustomActionResultReceiver = PassportDetectionSettings.this.write.MediaBrowserCompat$ItemReceiver(new C3722x684a8170(setsessiontimeoutduration, this.IconCompatParcelizer));
                PassportDetectionSettings passportDetectionSettings = PassportDetectionSettings.this;
                PassportDetectionResult passportDetectionResult = new PassportDetectionResult(this, MediaBrowserCompat$CustomActionResultReceiver);
                if (passportDetectionSettings.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    passportDetectionResult.IconCompatParcelizer(passportDetectionSettings.RatingCompat);
                }
                PassportDetectionSettings.MediaBrowserCompat$ItemReceiver(PassportDetectionSettings.this);
            }
            boolean unused = PassportDetectionSettings.this.IconCompatParcelizer = false;
        }

        public IconCompatParcelizer(processPendingCleanup processpendingcleanup) {
            this.IconCompatParcelizer = processpendingcleanup;
        }

        public final void onError(Throwable th) {
            if (!PassportDetectionSettings.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                PassportDetectionSettings.write(PassportDetectionSettings.this);
                PassportDetectionSettings passportDetectionSettings = PassportDetectionSettings.this;
                setUseTargetFrameCrop setusetargetframecrop = new setUseTargetFrameCrop(this, th);
                if (passportDetectionSettings.RatingCompat != null) {
                    setusetargetframecrop.IconCompatParcelizer(passportDetectionSettings.RatingCompat);
                }
                boolean unused = PassportDetectionSettings.this.IconCompatParcelizer = false;
            }
        }
    }

    static /* synthetic */ void write(PassportDetectionSettings passportDetectionSettings) {
        if (passportDetectionSettings.RatingCompat != null) {
            passportDetectionSettings.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(PassportDetectionSettings passportDetectionSettings) {
        if (passportDetectionSettings.RatingCompat != null) {
            passportDetectionSettings.RatingCompat.aj_();
        }
    }
}
