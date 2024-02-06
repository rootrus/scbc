package p040o;

import android.view.View;
import android.widget.RatingBar;

/* renamed from: o.clickReturnToAccount */
final class clickReturnToAccount extends BankingAgentSuccessActivity<RatingBar.OnRatingBarChangeListener, RatingBar> implements RatingBar.OnRatingBarChangeListener {
    protected clickReturnToAccount(String str, String str2) {
        super(str, str2);
    }

    public final void read(View view) {
        if (!(view instanceof RatingBar)) {
            MyECouponActivity_ViewBinding.write("View should be a sibling of RatingBar");
        }
        RatingBar ratingBar = (RatingBar) view;
        T onRatingBarChangeListener = ratingBar.getOnRatingBarChangeListener();
        if (onRatingBarChangeListener != this) {
            this.IconCompatParcelizer = onRatingBarChangeListener;
            ratingBar.setOnRatingBarChangeListener(this);
        }
    }

    public final void write(View view) throws ClassCastException {
        super.write(view);
        ((RatingBar) view).setOnRatingBarChangeListener((RatingBar.OnRatingBarChangeListener) this.IconCompatParcelizer);
    }

    public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
        if (this.IconCompatParcelizer != null) {
            ((RatingBar.OnRatingBarChangeListener) this.IconCompatParcelizer).onRatingChanged(ratingBar, f, z);
        }
        MediaBrowserCompat$ItemReceiver(String.valueOf(f));
    }
}
