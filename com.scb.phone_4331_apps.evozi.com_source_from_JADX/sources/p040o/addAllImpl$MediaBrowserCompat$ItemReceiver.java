package p040o;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.AlertController$RecycleListView;
import p040o.C7506tP;

/* renamed from: o.addAllImpl$MediaBrowserCompat$ItemReceiver */
public final class addAllImpl$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<C7506tP.read, remainingBytes> {
    private /* synthetic */ addAllImpl MediaBrowserCompat$ItemReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public addAllImpl$MediaBrowserCompat$ItemReceiver(addAllImpl addallimpl) {
        super(1);
        this.MediaBrowserCompat$ItemReceiver = addallimpl;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        C7506tP.read read = (C7506tP.read) obj;
        onGetStartedClick.write((Object) read, "it");
        onGetStartedClick.write((Object) read, "domain");
        String[] strArr = read.IconCompatParcelizer;
        Collection arrayList = new ArrayList();
        for (String str : strArr) {
            if (AlertController$RecycleListView.read.write(str)) {
                arrayList.add(str);
            }
        }
        return new remainingBytes(HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver((List) arrayList, "\n", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (FundFactSheetActivity) null, 62));
    }
}
