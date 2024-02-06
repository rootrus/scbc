package p040o;

import android.location.Address;
import java.util.List;
import java.util.NoSuchElementException;

/* renamed from: o.requestGoogleAccountsAccess */
public final class requestGoogleAccountsAccess extends FragmentBuilder_BindSummaryFragment {
    public static setStartCap MediaBrowserCompat$CustomActionResultReceiver(List<Address> list) {
        String str;
        isSupportFragmentClass issupportfragmentclass;
        try {
            show show = new show(list);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, removeAccount.write));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            T t = issupportfragmentclass.IconCompatParcelizer;
            if (t != null) {
                str = ((Address) t).getLocality();
                setStartCap setstartcap = new setStartCap();
                setstartcap.write = str;
                return setstartcap;
            }
            throw new NoSuchElementException("No value present");
        } catch (Exception e) {
            onCheckBoxClick.write((Throwable) e);
            str = "";
        }
    }
}
