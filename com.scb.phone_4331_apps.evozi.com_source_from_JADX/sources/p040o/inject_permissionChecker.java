package p040o;

import android.content.SharedPreferences;
import com.scb.phone.data.network.service.MediaImageService;
import java.util.Arrays;
import java.util.List;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.inject_permissionChecker */
public final class inject_permissionChecker extends getRuntimeTypeIfMoreSpecific {
    private static final List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.inject_permissionChecker$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        public MediaImageService read;

        private IconCompatParcelizer() {
        }

        @HmlPinActivity
        public IconCompatParcelizer(MediaImageService mediaImageService) {
            this.read = mediaImageService;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public inject_permissionChecker(SharedPreferences sharedPreferences) {
        super(sharedPreferences, "cardless_coachmark", MediaBrowserCompat$ItemReceiver);
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    static {
        AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder[] crashlyticsReportSessionEventApplicationEncoderArr = {new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("cardless_coachmark_tabs", Iterables$3$MediaBrowserCompat$ItemReceiver.cardless_coachmark_tabs), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("cardless_coachmark_amount_selection", Iterables$3$MediaBrowserCompat$ItemReceiver.cardless_coachmark_amount_selection), new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder("cardless_coachmark_faq", Iterables$3$MediaBrowserCompat$ItemReceiver.cardless_coachmark_faq)};
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationEncoderArr, "elements");
        onGetStartedClick.write((Object) crashlyticsReportSessionEventApplicationEncoderArr, "$this$asList");
        List<AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventApplicationEncoder> asList = Arrays.asList(crashlyticsReportSessionEventApplicationEncoderArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        MediaBrowserCompat$ItemReceiver = asList;
    }
}
