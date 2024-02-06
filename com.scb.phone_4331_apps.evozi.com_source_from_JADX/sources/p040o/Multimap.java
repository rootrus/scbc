package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import p040o.SignedBytes;

/* renamed from: o.Multimap */
public final class Multimap extends SignedBytes.LexicographicalComparator {
    @HmlPinActivity
    public Multimap(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
    }

    public final List<access$lambda$0> IconCompatParcelizer(List<EasycashHeaderAdapter$LoanHeaderViewHolder> list, String str) {
        ArrayList arrayList = new ArrayList();
        for (EasycashHeaderAdapter$LoanHeaderViewHolder next : list) {
            if ("th".equals(str)) {
                arrayList.add(new access$lambda$0(next.MediaBrowserCompat$ItemReceiver.write, next.MediaBrowserCompat$CustomActionResultReceiver.write, mo26549c_(next.read)));
            } else {
                arrayList.add(new access$lambda$0(next.MediaBrowserCompat$ItemReceiver.read, next.MediaBrowserCompat$CustomActionResultReceiver.read, mo26549c_(next.read)));
            }
        }
        return arrayList;
    }
}
