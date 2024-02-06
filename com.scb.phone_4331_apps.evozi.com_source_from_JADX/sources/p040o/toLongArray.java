package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.toLongArray */
public final class toLongArray extends constrainedListMultimap {
    private final String IconCompatParcelizer;
    public final String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public toLongArray(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseStaticURL") String str, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str2) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) str, "baseStaticURL");
        onGetStartedClick.write((Object) str2, "baseAssetsURL");
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final immediateFailedFuture read(String str, String str2, String str3, boolean z, boolean z2, String str4) {
        if (str4 == null) {
            str4 = "TERMS_N_CONDITIONS";
        }
        String str5 = str4;
        if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) onGroundOverlayClick.STATIC_CONTENT.name())) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(str2);
            return MediaBrowserCompat$CustomActionResultReceiver(this, sb.toString(), (String) null, (String) null, str, z, false, str5, 4);
        } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str3, (Object) onGroundOverlayClick.EXTERNAL.name())) {
            return MediaBrowserCompat$CustomActionResultReceiver(this, str2, (String) null, (String) null, str, z, false, str5, 4);
        } else {
            if (str2 == null) {
                str2 = "";
            }
            return MediaBrowserCompat$CustomActionResultReceiver(this, (String) null, (String) null, str2, str, z, false, str5, 3);
        }
    }

    public static /* synthetic */ immediateFailedFuture MediaBrowserCompat$CustomActionResultReceiver(toLongArray tolongarray, String str, String str2, String str3, String str4, boolean z, boolean z2, String str5, int i) {
        toLongArray tolongarray2 = tolongarray;
        return new immediateFailedFuture((i & 64) != 0 ? "TERMS_N_CONDITIONS" : str5, (i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, tolongarray2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.partner_consent_allow_button), tolongarray2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.partner_consent_deny_button), z, z2, 512);
    }

    public final immediateFailedFuture read(String str, onCircleClick oncircleclick, boolean z, boolean z2, String str2) {
        onGetStartedClick.write((Object) oncircleclick, "privacyConsentContent");
        if (str2 == null) {
            str2 = "TERMS_N_CONDITIONS";
        }
        String str3 = str2;
        if (oncircleclick.MediaBrowserCompat$CustomActionResultReceiver == onGroundOverlayClick.STATIC_CONTENT) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(oncircleclick.MediaBrowserCompat$ItemReceiver);
            return MediaBrowserCompat$CustomActionResultReceiver(this, sb.toString(), (String) null, (String) null, str, z, z2, str3, 4);
        } else if (oncircleclick.MediaBrowserCompat$CustomActionResultReceiver == onGroundOverlayClick.EXTERNAL) {
            return MediaBrowserCompat$CustomActionResultReceiver(this, oncircleclick.MediaBrowserCompat$ItemReceiver, (String) null, (String) null, str, z, z2, str3, 4);
        } else {
            String str4 = oncircleclick.IconCompatParcelizer;
            if (str4 == null) {
                str4 = "";
            }
            return MediaBrowserCompat$CustomActionResultReceiver(this, (String) null, (String) null, str4, str, z, z2, str3, 3);
        }
    }
}
