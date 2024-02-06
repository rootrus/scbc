package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.NoWhenBranchMatchedException;
import p040o.SignedBytes;

/* renamed from: o.newWriterSupplier */
public final class newWriterSupplier extends SignedBytes.LexicographicalComparator {
    private final String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public newWriterSupplier(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language") String str2) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) str, "baseAssetURL");
        onGetStartedClick.write((Object) str2, "lang");
        this.read = str2;
    }

    public final getStartedAt write(setMyLocationEnabled setmylocationenabled) {
        String str;
        onGetStartedClick.write((Object) setmylocationenabled, "partnerConsent");
        String MediaMetadataCompat = MediaMetadataCompat(setmylocationenabled.write);
        setOnCameraChangeListener setoncamerachangelistener = setmylocationenabled.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = null;
        String str3 = setoncamerachangelistener != null ? setoncamerachangelistener.read : null;
        String str4 = "";
        if (str3 == null) {
            str3 = str4;
        }
        setOnCameraChangeListener setoncamerachangelistener2 = setmylocationenabled.MediaBrowserCompat$CustomActionResultReceiver;
        if (setoncamerachangelistener2 != null) {
            str = setoncamerachangelistener2.write;
        } else {
            str = null;
        }
        String c_ = mo26549c_(str);
        onGetStartedClick.IconCompatParcelizer((Object) c_, "transformAssetUrl(partne…onsent.information?.icon)");
        getEndedAt getendedat = new getEndedAt(str3, c_);
        String str5 = setmylocationenabled.MediaBrowserCompat$ItemReceiver;
        if (str5 == null) {
            str5 = str4;
        }
        setOnCameraChangeListener setoncamerachangelistener3 = setmylocationenabled.MediaBrowserCompat$CustomActionResultReceiver;
        String str6 = setoncamerachangelistener3 != null ? setoncamerachangelistener3.IconCompatParcelizer : null;
        if (str6 == null) {
            str6 = str4;
        }
        setOnCameraChangeListener setoncamerachangelistener4 = setmylocationenabled.MediaBrowserCompat$CustomActionResultReceiver;
        if (setoncamerachangelistener4 != null) {
            str2 = setoncamerachangelistener4.MediaBrowserCompat$ItemReceiver;
        }
        if (str2 != null) {
            str4 = str2;
        }
        onGetStartedClick.write((Object) str6, "$this$or");
        onGetStartedClick.write((Object) str4, "en");
        String read2 = read(str4, str6);
        onGetStartedClick.IconCompatParcelizer((Object) read2, "getLocalizedName(en, this)");
        return new getStartedAt(getendedat, MediaMetadataCompat, str5, read2);
    }

    public final String MediaMetadataCompat(String str) {
        onGetStartedClick.write((Object) str, ImagesContract.URL);
        boolean z = false;
        boolean read2 = GoodToKnowActivity.read(str, "http", false) | GoodToKnowActivity.read(str, "scbeasy://webview", false) | GoodToKnowActivity.read(str, "scbeasy://external", false) | GoodToKnowActivity.read(str, "scbeasy://internal", false);
        if (read2) {
            if (GoodToKnowActivity.read((CharSequence) str, "?", 0, false) > 0) {
                z = true;
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("&lang=");
                sb.append(this.read);
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("?lang=");
            sb2.append(this.read);
            return sb2.toString();
        } else if (!read2) {
            return str;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
