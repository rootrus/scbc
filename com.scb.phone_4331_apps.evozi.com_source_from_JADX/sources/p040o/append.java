package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.activity.investment.assessment.C5639xa36eeabf;
import p040o.AutoCrashlyticsReportEncoder;

/* renamed from: o.append */
public final class append extends constrainedListMultimap {
    private final String IconCompatParcelizer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public append(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) str, "language");
        this.IconCompatParcelizer = str;
    }

    public final AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder write(C5639xa36eeabf questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver) {
        String str;
        String str2;
        onGetStartedClick.write((Object) questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver, "shop");
        String str3 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        String str4 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) "th")) {
            str3 = str4;
        }
        String str5 = str3 == null ? "" : str3;
        String str6 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat;
        String str7 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.RatingCompat;
        if (str7 == null) {
            str = "";
        } else {
            str = str7;
        }
        String str8 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        String str9 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        String str10 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$Token;
        String str11 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat;
        String str12 = questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$QueueItem;
        if (str12 == null) {
            str2 = "";
        } else {
            str2 = str12;
        }
        return new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionEventEncoder(str5, str6, str, str8, str9, str10, str11, str2, questionnaireActivity$MediaBrowserCompat$CustomActionResultReceiver.MediaSessionCompat$ResultReceiverWrapper);
    }
}
