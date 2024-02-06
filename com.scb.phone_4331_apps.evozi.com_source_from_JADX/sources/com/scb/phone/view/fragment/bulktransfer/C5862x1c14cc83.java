package com.scb.phone.view.fragment.bulktransfer;

import android.net.Uri;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.R;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.getOversizeImage;

/* renamed from: com.scb.phone.view.fragment.bulktransfer.BulkTransferSuccessFragment$MediaBrowserCompat$CustomActionResultReceiver */
class C5862x1c14cc83 extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Uri> {
    private /* synthetic */ BulkTransferSuccessFragment write;

    C5862x1c14cc83(BulkTransferSuccessFragment bulkTransferSuccessFragment) {
        this.write = bulkTransferSuccessFragment;
    }

    public final void onError(Throwable th) {
        super.onError(th);
        FragmentActivity activity = this.write.getActivity();
        if (!this.write.isDetached() && activity != null) {
            BulkTransferSuccessFragment.read(this.write, R.string.saved_slip_error, getOversizeImage.ERROR);
        }
    }

    public final void onComplete() {
        super.onComplete();
        FragmentActivity activity = this.write.getActivity();
        if (this.write.getUserVisibleHint() && activity != null) {
            BulkTransferSuccessFragment.read(this.write, R.string.saved_slip, getOversizeImage.SUCCESS);
        }
    }
}
