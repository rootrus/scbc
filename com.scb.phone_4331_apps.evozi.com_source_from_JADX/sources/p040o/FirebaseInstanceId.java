package p040o;

import android.content.SharedPreferences;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.CreditCardCaptureModule_GetIParametersFactory;
import p040o.SignInButton;
import p040o.onCreateQrClick;
import p040o.writeUInt64NoTag;

/* renamed from: o.FirebaseInstanceId */
public final class FirebaseInstanceId extends getRuntimeTypeIfMoreSpecific {
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> MediaBrowserCompat$ItemReceiver = Arrays.asList(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[]{new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("coachmark_myqr", Iterables$3$MediaBrowserCompat$ItemReceiver.coachmark_myqr)});
    private static final String read = "KEY_MYQR_COACH_MARKS";

    /* renamed from: o.FirebaseInstanceId$zza */
    public final class zza extends writeUInt64NoTag<CreditCardCaptureModule_GetIParametersFactory.write> {
        public final FirebaseInstanceId read;
        private final shouldSendSdkHeartBeat write;

        /* renamed from: o.FirebaseInstanceId$zza$IconCompatParcelizer */
        static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule_GetIParametersFactory.write> {
            public static final IconCompatParcelizer write = new IconCompatParcelizer();

            IconCompatParcelizer() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((CreditCardCaptureModule_GetIParametersFactory.write) obj).MediaBrowserCompat$CustomActionResultReceiver();
            }
        }

        /* renamed from: o.FirebaseInstanceId$zza$read */
        public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CreditCardCaptureModule_GetIParametersFactory.write> {
            public static final read IconCompatParcelizer = new read();

            read() {
            }

            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                ((CreditCardCaptureModule_GetIParametersFactory.write) obj).write();
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public zza(RegularImmutableBiMap regularImmutableBiMap, FirebaseInstanceId firebaseInstanceId, shouldSendSdkHeartBeat shouldsendsdkheartbeat) {
            super(regularImmutableBiMap);
            onGetStartedClick.write((Object) firebaseInstanceId, "myQrCoachMarkPresenter");
            onGetStartedClick.write((Object) shouldsendsdkheartbeat, "qrPaymentCoachMarkPresenter");
            this.read = firebaseInstanceId;
            this.write = shouldsendsdkheartbeat;
        }

        public final void IconCompatParcelizer() {
            boolean z = true;
            if (!this.write.MediaBrowserCompat$CustomActionResultReceiver().isEmpty()) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = FirebaseInstanceId$zza$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = IconCompatParcelizer.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public FirebaseInstanceId(SharedPreferences sharedPreferences) {
        super(sharedPreferences, read, MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    /* renamed from: o.FirebaseInstanceId$IconCompatParcelizer */
    public static final class IconCompatParcelizer implements findFragmentByWho {
        private final /* synthetic */ SignInButton.ColorScheme MediaBrowserCompat$CustomActionResultReceiver;

        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(SignInButton.ColorScheme colorScheme) {
            this.MediaBrowserCompat$CustomActionResultReceiver = colorScheme;
        }

        public final Object IconCompatParcelizer(Object obj) {
            PathParser pathParser = (PathParser) obj;
            onCreateQrClick.read read = new onCreateQrClick.read();
            read.write = pathParser.MediaBrowserCompat$CustomActionResultReceiver;
            read.MediaBrowserCompat$CustomActionResultReceiver = pathParser.write;
            return read;
        }
    }
}
