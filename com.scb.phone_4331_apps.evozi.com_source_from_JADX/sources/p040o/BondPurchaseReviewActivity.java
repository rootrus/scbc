package p040o;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;

/* renamed from: o.BondPurchaseReviewActivity */
public final class BondPurchaseReviewActivity {
    private View IconCompatParcelizer = null;
    int[] MediaBrowserCompat$CustomActionResultReceiver = new int[2];
    private View MediaBrowserCompat$ItemReceiver = null;
    private View read = null;
    private View write = null;

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Activity activity, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (activity != null) {
            Point point = new Point();
            activity.getWindowManager().getDefaultDisplay().getSize(point);
            int[] iArr = new int[2];
            View view = deejungTransferLandingActivity.IconCompatParcelizer;
            view.getLocationOnScreen(iArr);
            iArr[1] = iArr[1] - deejungTransferLandingActivity.MediaBrowserCompat$CustomActionResultReceiver;
            Rect rect = new Rect(iArr[0], iArr[1], iArr[0] + view.getWidth(), iArr[1] + view.getHeight() + deejungTransferLandingActivity.MediaBrowserCompat$CustomActionResultReceiver);
            if (rect.top > this.MediaBrowserCompat$CustomActionResultReceiver[0]) {
                int i = point.x;
                int abs = Math.abs(rect.top - this.MediaBrowserCompat$CustomActionResultReceiver[0]);
                int[] iArr2 = this.MediaBrowserCompat$CustomActionResultReceiver;
                View read2 = BondSelectionActivity.read(activity, i, abs, 0, iArr2[0], iArr2);
                this.MediaBrowserCompat$ItemReceiver = read2;
                read2.setBackgroundResource(17170444);
                BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver().write(activity, "dimViewTop", this.MediaBrowserCompat$ItemReceiver);
            }
            if (rect.bottom < this.MediaBrowserCompat$CustomActionResultReceiver[1]) {
                View read3 = BondSelectionActivity.read(activity, point.x, Math.abs(rect.bottom - this.MediaBrowserCompat$CustomActionResultReceiver[1]), 0, rect.bottom, this.MediaBrowserCompat$CustomActionResultReceiver);
                this.write = read3;
                read3.setBackgroundResource(17170444);
                BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver().write(activity, "dimViewBottom", this.write);
            }
            if (rect.left > 0) {
                View read4 = BondSelectionActivity.read(activity, rect.left, rect.height(), 0, rect.top, this.MediaBrowserCompat$CustomActionResultReceiver);
                this.IconCompatParcelizer = read4;
                read4.setBackgroundResource(17170444);
                BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver().write(activity, "dimViewLeft", this.IconCompatParcelizer);
            }
            if (rect.right < point.x) {
                View read5 = BondSelectionActivity.read(activity, point.x - rect.right, rect.height(), rect.right, rect.top, this.MediaBrowserCompat$CustomActionResultReceiver);
                this.read = read5;
                read5.setBackgroundResource(17170444);
                BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver().write(activity, "dimViewRight", this.read);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            BondSelectionActivity MediaBrowserCompat$CustomActionResultReceiver2 = BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver();
            View view = this.MediaBrowserCompat$ItemReceiver;
            BondSelectionActivity.IconCompatParcelizer(activity, view);
            MediaBrowserCompat$CustomActionResultReceiver2.RatingCompat.remove("dimViewTop");
            MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat.remove(view);
            this.MediaBrowserCompat$ItemReceiver = null;
        }
        if (this.write != null) {
            BondSelectionActivity MediaBrowserCompat$CustomActionResultReceiver3 = BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver();
            View view2 = this.write;
            BondSelectionActivity.IconCompatParcelizer(activity, view2);
            MediaBrowserCompat$CustomActionResultReceiver3.RatingCompat.remove("dimViewBottom");
            MediaBrowserCompat$CustomActionResultReceiver3.MediaMetadataCompat.remove(view2);
            this.write = null;
        }
        if (this.read != null) {
            BondSelectionActivity MediaBrowserCompat$CustomActionResultReceiver4 = BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver();
            View view3 = this.read;
            BondSelectionActivity.IconCompatParcelizer(activity, view3);
            MediaBrowserCompat$CustomActionResultReceiver4.RatingCompat.remove("dimViewRight");
            MediaBrowserCompat$CustomActionResultReceiver4.MediaMetadataCompat.remove(view3);
            this.read = null;
        }
        if (this.IconCompatParcelizer != null) {
            BondSelectionActivity MediaBrowserCompat$CustomActionResultReceiver5 = BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver();
            View view4 = this.IconCompatParcelizer;
            BondSelectionActivity.IconCompatParcelizer(activity, view4);
            MediaBrowserCompat$CustomActionResultReceiver5.RatingCompat.remove("dimViewLeft");
            MediaBrowserCompat$CustomActionResultReceiver5.MediaMetadataCompat.remove(view4);
            this.IconCompatParcelizer = null;
        }
    }
}
