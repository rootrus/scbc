package p040o;

import com.scb.phone.data.entity.transfer.SingleDataEntity;
import okhttp3.internal.cache.DiskLruCache;
import org.threeten.p041bp.OffsetDateTime;
import p040o.BaseImplementation;
import p040o.FragmentBuilder_BindRegistrationLandingFragment;

/* renamed from: o.getDelegate */
public final /* synthetic */ class getDelegate implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ FragmentBuilder_BindRegistrationLandingFragment.read MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getDelegate(FragmentBuilder_BindRegistrationLandingFragment.read read) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
    }

    public final Object write(Object obj) {
        BaseImplementation.ApiMethodImpl apiMethodImpl = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        setOnChartValueSelectedListener setonchartvalueselectedlistener = (setOnChartValueSelectedListener) ((SingleDataEntity) obj).getData();
        onStreetViewPanoramaLongClick write = onStreetViewPanoramaLongClick.write();
        write.MediaBrowserCompat$SearchResultReceiver = setonchartvalueselectedlistener.write;
        write.f5555x50fd9e4a = FragmentBuilder_BindSummaryFragment.write(setonchartvalueselectedlistener.IconCompatParcelizer, (OffsetDateTime) null);
        write.ParcelableVolumeInfo = Double.valueOf(setonchartvalueselectedlistener.MediaBrowserCompat$ItemReceiver);
        write.RatingCompat = setonchartvalueselectedlistener.MediaBrowserCompat$CustomActionResultReceiver.equals(DiskLruCache.VERSION_1);
        return DebitCardResetOtpActivity.just(write);
    }
}
