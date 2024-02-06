package p040o;

import android.net.Uri;
import java.net.URI;
import java.util.HashSet;
import java.util.Set;

/* renamed from: o.onRotateClicked */
public final class onRotateClicked {
    private static Set<String> read;

    static {
        HashSet hashSet = new HashSet();
        read = hashSet;
        hashSet.add("about:blank");
    }

    public static String write(String str) {
        Uri read2;
        if (str != null) {
            try {
                if (!read.contains(str)) {
                    Uri MediaBrowserCompat$ItemReceiver = ReviewDocumentActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(str);
                    if (!(MediaBrowserCompat$ItemReceiver == null || (read2 = read(MediaBrowserCompat$ItemReceiver)) == null)) {
                        return read2.toString();
                    }
                }
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
        return str;
    }

    public static Uri read(Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
            if (Boolean.FALSE.equals(Boolean.valueOf(FragmentBuilder_BindPreloadConfigFragment.write(MediaBrowserCompat$ItemReceiver)))) {
                FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.write(URI.create(uri.toString()));
            }
            if (Boolean.FALSE.equals(FragmentBuilder_BindPrepaidWalletTabFragment.write(MediaBrowserCompat$ItemReceiver))) {
                return FragmentBuilder_BindProductCatalogFragment.IconCompatParcelizer(uri);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException unused) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationFragment.SEND_OUTBOUND_INVALID_URI_SCHEME);
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
        }
        return uri;
    }
}
