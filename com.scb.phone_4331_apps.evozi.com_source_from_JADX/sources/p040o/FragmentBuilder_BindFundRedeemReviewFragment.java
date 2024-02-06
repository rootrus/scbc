package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;

/* renamed from: o.FragmentBuilder_BindFundRedeemReviewFragment */
final class FragmentBuilder_BindFundRedeemReviewFragment extends FragmentBuilder_BindEbillSubscriptionInputFragment<FragmentBuilder_BindFundRedeemLandingFragment> {
    FragmentBuilder_BindFundRedeemReviewFragment(Picasso picasso, FragmentBuilder_BindFundRedeemLandingFragment fragmentBuilder_BindFundRedeemLandingFragment, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, fragmentBuilder_BindFundRedeemLandingFragment, fragmentBuilder_BindFixedTransferInputFormFragment, i, 0, i3, drawable, str, (Object) null, false);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Bitmap bitmap, Picasso.read read) {
        if (bitmap != null) {
            WeakReference<T> weakReference = this.ParcelableVolumeInfo;
            FragmentBuilder_BindFundRedeemLandingFragment fragmentBuilder_BindFundRedeemLandingFragment = (FragmentBuilder_BindFundRedeemLandingFragment) (weakReference == null ? null : weakReference.get());
            if (fragmentBuilder_BindFundRedeemLandingFragment != null) {
                fragmentBuilder_BindFundRedeemLandingFragment.read(bitmap);
                if (bitmap.isRecycled()) {
                    throw new IllegalStateException("Target callback must not recycle bitmap!");
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Exception exc) {
        WeakReference<T> weakReference = this.ParcelableVolumeInfo;
        FragmentBuilder_BindFundRedeemLandingFragment fragmentBuilder_BindFundRedeemLandingFragment = (FragmentBuilder_BindFundRedeemLandingFragment) (weakReference == null ? null : weakReference.get());
        if (fragmentBuilder_BindFundRedeemLandingFragment == null) {
            return;
        }
        if (this.write != 0) {
            fragmentBuilder_BindFundRedeemLandingFragment.write(this.MediaDescriptionCompat.IconCompatParcelizer.getResources().getDrawable(this.write));
        } else {
            fragmentBuilder_BindFundRedeemLandingFragment.write(this.IconCompatParcelizer);
        }
    }
}
