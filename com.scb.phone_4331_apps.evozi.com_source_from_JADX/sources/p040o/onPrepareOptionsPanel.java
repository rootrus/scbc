package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Glide;
import java.security.MessageDigest;

/* renamed from: o.onPrepareOptionsPanel */
public final class onPrepareOptionsPanel implements onCreateAnimation<Drawable> {
    private final onCreateAnimation<Bitmap> IconCompatParcelizer;
    private final boolean MediaBrowserCompat$ItemReceiver;

    public onPrepareOptionsPanel(onCreateAnimation<Bitmap> oncreateanimation, boolean z) {
        this.IconCompatParcelizer = oncreateanimation;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final performOptionsMenuClosed<Drawable> MediaBrowserCompat$ItemReceiver(Context context, performOptionsMenuClosed<Drawable> performoptionsmenuclosed, int i, int i2) {
        CheckParameters_MembersInjector checkParameters_MembersInjector = Glide.IconCompatParcelizer(context).MediaBrowserCompat$CustomActionResultReceiver;
        Drawable write = performoptionsmenuclosed.write();
        performOptionsMenuClosed<Bitmap> IconCompatParcelizer2 = onResumeFragments.IconCompatParcelizer(checkParameters_MembersInjector, write, i, i2);
        if (IconCompatParcelizer2 != null) {
            performOptionsMenuClosed<Bitmap> MediaBrowserCompat$ItemReceiver2 = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(context, IconCompatParcelizer2, i, i2);
            if (MediaBrowserCompat$ItemReceiver2.equals(IconCompatParcelizer2)) {
                MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$CustomActionResultReceiver();
                return performoptionsmenuclosed;
            }
            Resources resources = context.getResources();
            if (MediaBrowserCompat$ItemReceiver2 == null) {
                return null;
            }
            return new onRetainCustomNonConfigurationInstance(resources, MediaBrowserCompat$ItemReceiver2);
        } else if (!this.MediaBrowserCompat$ItemReceiver) {
            return performoptionsmenuclosed;
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unable to convert ");
            sb.append(write);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof onPrepareOptionsPanel) {
            return this.IconCompatParcelizer.equals(((onPrepareOptionsPanel) obj).IconCompatParcelizer);
        }
        return false;
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
    }
}
