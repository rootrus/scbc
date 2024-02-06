package p040o;

import java.util.ArrayList;
import p040o.DeepLinkUri;
import p040o.PersonalizeActivity;

/* renamed from: o.ProductAction */
public final class ProductAction extends FragmentBuilder_BindSummaryFragment {
    public static C5111open write(DeepLinkUri.Builder.ParseResult parseResult) {
        readStringList readstringlist;
        ArrayList arrayList = new ArrayList();
        for (Cancellable next : parseResult.MediaBrowserCompat$CustomActionResultReceiver) {
            if (next.IconCompatParcelizer == Parser.OPR) {
                readstringlist = readStringList.OPR;
            } else {
                readstringlist = next.IconCompatParcelizer == Parser.ECOUPON ? readStringList.ECOUPON : readStringList.NORMAL;
            }
            arrayList.add(new PersonalizeActivity.IconCompatParcelizer(next.MediaBrowserCompat$ItemReceiver, next.read, next.MediaBrowserCompat$CustomActionResultReceiver, readstringlist));
        }
        C5111open open = new C5111open(arrayList);
        open.read(IconCompatParcelizer((setCurrentItemInternal) parseResult));
        return open;
    }
}
