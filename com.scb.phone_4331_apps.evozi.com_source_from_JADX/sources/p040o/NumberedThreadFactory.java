package p040o;

import android.text.TextUtils;
import p040o.FragmentBuilder_BindPurchaseProfileManagementFragment;
import p040o.GoogleMap;

/* renamed from: o.NumberedThreadFactory */
public final /* synthetic */ class NumberedThreadFactory implements DirectDebitDeepLinkActivity {
    private final /* synthetic */ orderValuesBy IconCompatParcelizer;
    private final /* synthetic */ FragmentBuilder_BindPurchaseProfileManagementFragment.write write;

    public /* synthetic */ NumberedThreadFactory(FragmentBuilder_BindPurchaseProfileManagementFragment.write write2, orderValuesBy ordervaluesby) {
        this.write = write2;
        this.IconCompatParcelizer = ordervaluesby;
    }

    public final Object write(Object obj) {
        GoogleMap.OnMarkerDragListener onMarkerDragListener;
        FragmentBuilder_BindPurchaseProfileManagementFragment.write write2 = this.write;
        orderValuesBy ordervaluesby = this.IconCompatParcelizer;
        setCurrentItemInternal setcurrentiteminternal = (setCurrentItemInternal) obj;
        if (!TextUtils.isEmpty(ordervaluesby.write)) {
            if (write2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer != null) {
                onMarkerDragListener = write2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                onMarkerDragListener.setBackgroundResource = ordervaluesby.write;
            } else {
                onMarkerDragListener = null;
            }
            write2.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = onMarkerDragListener;
        }
        return DebitCardResetOtpActivity.just(Boolean.valueOf(setcurrentiteminternal.getStatus().write().equals(setPageTransformer.SUCCESS.status)));
    }
}
