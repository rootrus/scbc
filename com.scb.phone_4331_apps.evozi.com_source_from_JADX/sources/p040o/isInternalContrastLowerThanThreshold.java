package p040o;

import android.net.Uri;
import java.util.Set;

/* renamed from: o.isInternalContrastLowerThanThreshold */
public final class isInternalContrastLowerThanThreshold extends writeUInt64NoTag<CheckCaptureModule_GetICheckDeserializerRttiFactory> {
    @HmlPinActivity
    public isInternalContrastLowerThanThreshold(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(Uri uri) {
        if (uri == null) {
            return null;
        }
        Uri.Builder buildUpon = uri.buildUpon();
        onGetStartedClick.IconCompatParcelizer((Object) buildUpon, "uri.buildUpon()");
        buildUpon.clearQuery();
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) "applicationId", (Object) str)) {
                    buildUpon.appendQueryParameter(str, uri.getQueryParameter(str));
                }
            }
        }
        Uri build = buildUpon.build();
        if (build != null) {
            return build.getQuery();
        }
        return null;
    }

    public static String write(String str, String str2) {
        onGetStartedClick.write((Object) str, "applicationId");
        StringBuilder sb = new StringBuilder();
        sb.append("scbeasy://partner/consent/authorize/application/");
        sb.append(str);
        String obj = sb.toString();
        CharSequence charSequence = str2;
        if (!(!(charSequence == null || charSequence.length() == 0))) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(obj);
        sb2.append('?');
        sb2.append(str2);
        return sb2.toString();
    }
}
