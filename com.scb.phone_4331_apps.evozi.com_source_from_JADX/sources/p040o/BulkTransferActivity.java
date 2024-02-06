package p040o;

import android.view.View;
import android.widget.RatingBar;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.BulkTransferActivity */
public final class BulkTransferActivity extends onSaveClick implements RatingBar.OnRatingBarChangeListener {
    private final RatingBar.OnRatingBarChangeListener read;

    private BulkTransferActivity(RatingBar.OnRatingBarChangeListener onRatingBarChangeListener, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungTransferLandingActivity;
        this.read = onRatingBarChangeListener;
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.write;
        StringBuilder sb = new StringBuilder();
        sb.append("Intercept click: ");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver.ParcelableVolumeInfo);
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
        RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = this.read;
        if (onRatingBarChangeListener != null) {
            onRatingBarChangeListener.onRatingChanged(ratingBar, f, z);
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(View view) throws ClassCastException {
        ((RatingBar) view).setOnRatingBarChangeListener(this.read);
    }

    static boolean MediaBrowserCompat$ItemReceiver(DeejungTransferLandingActivity deejungTransferLandingActivity) {
        if (deejungTransferLandingActivity == null || deejungTransferLandingActivity.IconCompatParcelizer == null) {
            return false;
        }
        RatingBar.OnRatingBarChangeListener onRatingBarChangeListener = ((RatingBar) deejungTransferLandingActivity.IconCompatParcelizer).getOnRatingBarChangeListener();
        if (onRatingBarChangeListener == null || !(onRatingBarChangeListener instanceof BulkTransferActivity)) {
            BulkTransferActivity bulkTransferActivity = new BulkTransferActivity(onRatingBarChangeListener, deejungTransferLandingActivity);
            ((RatingBar) deejungTransferLandingActivity.IconCompatParcelizer).setOnRatingBarChangeListener(bulkTransferActivity);
            BankingAgentSuccessActivity_ViewBinding.write(deejungTransferLandingActivity.IconCompatParcelizer, true, bulkTransferActivity);
            return true;
        }
        ((BulkTransferActivity) onRatingBarChangeListener).read(deejungTransferLandingActivity);
        return false;
    }
}
