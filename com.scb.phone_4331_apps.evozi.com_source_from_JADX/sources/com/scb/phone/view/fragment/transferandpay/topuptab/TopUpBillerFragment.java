package com.scb.phone.view.fragment.transferandpay.topuptab;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.transferandpay.BaseBillersFragment;
import p040o.BillCaptureActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.ETBEligibilityModule;
import p040o.FragmentBuilder_BindATMTabFragment;
import p040o.HmlPinActivity;
import p040o.access$2300;
import p040o.getDefaultProcessingString;
import p040o.getIExtractionServerRtti;
import p040o.getTopLeftCornerWidth;
import p040o.parseEventSignal;
import p040o.setChildDrawingOrderCallback;

public class TopUpBillerFragment extends BaseBillersFragment implements getTopLeftCornerWidth.setShortcut {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getIExtractionServerRtti topUpBillerPresenter;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85792131493806, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.topUpBillerPresenter.MediaBrowserCompat$ItemReceiver(this);
        return inflate;
    }

    public void onStart() {
        super.onStart();
        this.MediaBrowserCompat$CustomActionResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(getContext(), new IntentFilter("FAVORITE")).subscribe(new ETBEligibilityModule(this), FragmentBuilder_BindATMTabFragment.MediaBrowserCompat$ItemReceiver);
    }

    public void onStop() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dispose();
        }
        super.onStop();
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.topUpBillerPresenter.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public void onDestroy() {
        this.topUpBillerPresenter.onDestroy();
        super.onDestroy();
    }

    public final void read(int i) {
        super.read(i);
        read(this.topUpBillerPresenter.read.get(i), false);
    }

    public void onEmptyLayoutClick() {
        super.onEmptyLayoutClick();
        this.topUpBillerPresenter.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void read(parseEventSignal parseeventsignal) {
        read(parseeventsignal, true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.topUpBillerPresenter.MediaBrowserCompat$ItemReceiver(R.string.biller_not_found, access$2300.write.NAVIGATE_BACK);
    }

    private void read(parseEventSignal parseeventsignal, boolean z) {
        Intent intent = new Intent();
        if (z) {
            intent.setAction("com.scb.phone/BROADCAST_TOP_UP_FAVOURITE_NEXT_STEP");
        } else {
            intent.setAction("com.scb.phone/BROADCAST_TOP_UP_NEXT_STEP");
        }
        intent.putExtra("FRAGMENT_TYPE", 0);
        intent.putExtra("com.scb.phone.EXTRA_TOP_DISPLAY", parseeventsignal);
        getContext().sendBroadcast(intent);
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(TopUpBillerFragment topUpBillerFragment) {
        getIExtractionServerRtti getiextractionserverrtti = topUpBillerFragment.topUpBillerPresenter;
        parseEventSignal read = getiextractionserverrtti.write.read(getiextractionserverrtti.MediaBrowserCompat$ItemReceiver, getiextractionserverrtti.IconCompatParcelizer.IconCompatParcelizer.write());
        boolean z = true;
        if (read != null) {
            getDefaultProcessingString getdefaultprocessingstring = new getDefaultProcessingString(read);
            if (getiextractionserverrtti.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getdefaultprocessingstring.IconCompatParcelizer(getiextractionserverrtti.RatingCompat);
                return;
            }
            return;
        }
        BillCaptureActivity billCaptureActivity = BillCaptureActivity.MediaBrowserCompat$ItemReceiver;
        if (getiextractionserverrtti.RatingCompat == null) {
            z = false;
        }
        if (z) {
            billCaptureActivity.IconCompatParcelizer(getiextractionserverrtti.RatingCompat);
        }
    }
}
