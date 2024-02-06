package p040o;

import android.net.Uri;
import java.net.URI;
import java.util.Iterator;
import java.util.Set;
import p040o.HmlNTBBusinessURLInformationActivity;

@HmlSetNTBPinActivity
/* renamed from: o.FragmentBuilder_BindProductCatalogFragment */
public final class FragmentBuilder_BindProductCatalogFragment {
    public final zzs MediaBrowserCompat$CustomActionResultReceiver = new zzs();
    public fromRawResSync MediaBrowserCompat$ItemReceiver;
    public fromUrlSync write;

    public static final Uri IconCompatParcelizer(Uri uri) {
        if (uri == null) {
            return uri;
        }
        try {
            Set<URI> MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$CustomActionResultReceiver();
            Set<URI> write2 = FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.write();
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "whiteList");
            onGetStartedClick.IconCompatParcelizer((Object) write2, "blackList");
            URI uri2 = new URI(uri.toString());
            boolean z = true;
            if ((!write2.isEmpty()) || (!MediaBrowserCompat$CustomActionResultReceiver2.isEmpty())) {
                if (write2.isEmpty() || !MediaBrowserCompat$ItemReceiver(uri2, write2)) {
                    if (!MediaBrowserCompat$CustomActionResultReceiver2.isEmpty()) {
                        if (MediaBrowserCompat$ItemReceiver(uri2, MediaBrowserCompat$CustomActionResultReceiver2)) {
                        }
                    }
                }
                z = false;
            }
            if (z) {
                return FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$CustomActionResultReceiver(uri);
            }
            return uri;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return uri;
        }
    }

    private static final boolean MediaBrowserCompat$ItemReceiver(URI uri, Set<URI> set) {
        Object obj;
        boolean z;
        String obj2 = uri.toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj2, "this.toString()");
        Iterable iterable = set;
        onGetStartedClick.write((Object) iterable, "$this$asSequence");
        BaseJuristicPinActivity_ViewBinding iconCompatParcelizer = new HmlNTBBusinessURLInformationActivity.IconCompatParcelizer(iterable);
        FundFactSheetActivity fundFactSheetActivity = read.read;
        onGetStartedClick.write((Object) iconCompatParcelizer, "$this$map");
        onGetStartedClick.write((Object) fundFactSheetActivity, "transform");
        Iterator read2 = new JuristicSetupNewPinActivity(iconCompatParcelizer, fundFactSheetActivity).read();
        do {
            obj = null;
            if (!read2.hasNext()) {
                break;
            }
            obj = read2.next();
            String str = (String) obj;
            onGetStartedClick.IconCompatParcelizer((Object) str, "link");
            CharSequence charSequence = str;
            if (GoodToKnowActivity.read(charSequence, "*", false)) {
                CharSequence charSequence2 = obj2;
                LifestyleCustomizationActivity lifestyleCustomizationActivity = new LifestyleCustomizationActivity(GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, "*", ".*", false));
                onGetStartedClick.write((Object) charSequence2, "input");
                z = lifestyleCustomizationActivity.write.matcher(charSequence2).matches();
                continue;
            } else {
                z = GoodToKnowActivity.read(obj2, charSequence, false);
                continue;
            }
        } while (!z);
        if (((String) obj) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: o.FragmentBuilder_BindProductCatalogFragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<URI, String> {
        public static final read read = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            URI uri = (URI) obj;
            onGetStartedClick.write((Object) uri, "it");
            return uri.toString();
        }
    }
}
