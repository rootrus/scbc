package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
import java.util.List;
import p040o.C1251R;
import p040o.GoogleAnalytics;
import p040o.evictsBySize;

/* renamed from: o.ShowFirstParty */
public final /* synthetic */ class ShowFirstParty implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver read;

    public /* synthetic */ ShowFirstParty(CustomPinWithMaxInput$MediaBrowserCompat$ItemReceiver customPinWithMaxInput$MediaBrowserCompat$ItemReceiver) {
        this.read = customPinWithMaxInput$MediaBrowserCompat$ItemReceiver;
    }

    public final Object write(Object obj) {
        List<SupportStreetViewPanoramaFragment> list;
        GoogleAnalytics.zzb zzb = this.read.write;
        C1251R.C1252drawable drawable = (C1251R.C1252drawable) ((SingleDataEntity) obj).getData();
        getPanningGesturesEnabled MediaBrowserCompat$ItemReceiver = getPanningGesturesEnabled.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.write = drawable.IconCompatParcelizer;
        if (drawable.MediaBrowserCompat$CustomActionResultReceiver == null) {
            list = null;
        } else {
            list = GoogleAnalytics.zzb.write(drawable.MediaBrowserCompat$CustomActionResultReceiver, new evictsBySize.write(zzb));
        }
        MediaBrowserCompat$ItemReceiver.read = list;
        return DebitCardResetOtpActivity.just(MediaBrowserCompat$ItemReceiver);
    }
}
