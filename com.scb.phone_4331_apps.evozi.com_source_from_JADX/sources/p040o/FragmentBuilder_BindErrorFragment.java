package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

/* renamed from: o.FragmentBuilder_BindErrorFragment */
final class FragmentBuilder_BindErrorFragment extends FragmentBuilder_BindEbillSubscriptionInputFragment<ImageView> {

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private FragmentBuilder_BindEkycFragment f3140x50fd9e4a;

    FragmentBuilder_BindErrorFragment(Picasso picasso, ImageView imageView, FragmentBuilder_BindFixedTransferInputFormFragment fragmentBuilder_BindFixedTransferInputFormFragment, int i, int i2, int i3, Drawable drawable, String str, Object obj, FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment, boolean z) {
        super(picasso, imageView, fragmentBuilder_BindFixedTransferInputFormFragment, i, 0, i3, drawable, str, (Object) null, z);
        this.f3140x50fd9e4a = fragmentBuilder_BindEkycFragment;
    }

    public final void MediaBrowserCompat$ItemReceiver(Bitmap bitmap, Picasso.read read) {
        if (bitmap != null) {
            ImageView imageView = (ImageView) this.ParcelableVolumeInfo.get();
            if (imageView != null) {
                Bitmap bitmap2 = bitmap;
                Picasso.read read2 = read;
                FragmentBuilder_BindFundActionsSearchFragment.MediaBrowserCompat$ItemReceiver(imageView, this.MediaDescriptionCompat.IconCompatParcelizer, bitmap2, read2, this.MediaBrowserCompat$MediaItem, this.MediaDescriptionCompat.MediaMetadataCompat);
                FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment = this.f3140x50fd9e4a;
                if (fragmentBuilder_BindEkycFragment != null) {
                    fragmentBuilder_BindEkycFragment.MediaBrowserCompat$ItemReceiver();
                    return;
                }
                return;
            }
            return;
        }
        throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", new Object[]{this}));
    }

    public final void MediaBrowserCompat$ItemReceiver(Exception exc) {
        ImageView imageView = (ImageView) this.ParcelableVolumeInfo.get();
        if (imageView != null) {
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof Animatable) {
                ((Animatable) drawable).stop();
            }
            if (this.write != 0) {
                imageView.setImageResource(this.write);
            } else if (this.IconCompatParcelizer != null) {
                imageView.setImageDrawable(this.IconCompatParcelizer);
            }
            FragmentBuilder_BindEkycFragment fragmentBuilder_BindEkycFragment = this.f3140x50fd9e4a;
            if (fragmentBuilder_BindEkycFragment != null) {
                fragmentBuilder_BindEkycFragment.MediaBrowserCompat$CustomActionResultReceiver(exc);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.f3140x50fd9e4a != null) {
            this.f3140x50fd9e4a = null;
        }
    }
}
