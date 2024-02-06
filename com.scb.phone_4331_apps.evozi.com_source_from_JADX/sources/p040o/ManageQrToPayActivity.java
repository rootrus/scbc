package p040o;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.view.activity.hml.HmlBaseConsentActivity;
import java.util.List;
import p040o.AbstractMultimap;
import p040o.zzge;

/* renamed from: o.ManageQrToPayActivity */
public final class ManageQrToPayActivity implements AbstractMultimap.KeySet {
    private HmlBaseConsentActivity.read write;

    ManageQrToPayActivity() {
    }

    public static List<View> read(Activity activity, List<View> list) {
        int i = 0;
        while (i < list.size()) {
            if (!IconCompatParcelizer(activity, list.get(i))) {
                list.remove(i);
                i--;
            }
            i++;
        }
        return list;
    }

    private static boolean IconCompatParcelizer(Activity activity, View view) {
        boolean z;
        String MediaBrowserCompat$CustomActionResultReceiver;
        boolean z2 = view.getVisibility() == 0;
        if (!z2 || !(view instanceof ViewGroup)) {
            z = false;
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            z = false;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                z = z || viewGroup.getChildAt(i).getVisibility() == 0;
            }
        }
        if ((!z2 || !z) && activity != null && (MediaBrowserCompat$CustomActionResultReceiver = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(view)) != null && FragmentBuilder_BindHmlExternalAuthenticationFragment.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver) && FragmentBuilder_BindHmlExternalAuthenticationFragment.IconCompatParcelizer("", AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(activity, view))) {
            return true;
        }
        if (!z2 || !z) {
            return false;
        }
        return true;
    }

    public ManageQrToPayActivity(HmlBaseConsentActivity.read read, setAccountName setaccountname) {
        this.write = read;
    }

    public final DebitCardResetOtpActivity<String> MediaBrowserCompat$ItemReceiver(String str, String str2) {
        return this.write.IconCompatParcelizer.getCMContent(str).flatMap(new zzge.zzo.zza(this, str2));
    }
}
