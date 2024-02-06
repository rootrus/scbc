package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import com.bumptech.glide.Glide;

/* renamed from: o.getSupportLoaderManager */
public abstract class getSupportLoaderManager implements onCreateAnimation<Bitmap> {
    /* access modifiers changed from: protected */
    public abstract Bitmap IconCompatParcelizer(CheckParameters_MembersInjector checkParameters_MembersInjector, Bitmap bitmap, int i, int i2);

    public final performOptionsMenuClosed<Bitmap> MediaBrowserCompat$ItemReceiver(Context context, performOptionsMenuClosed<Bitmap> performoptionsmenuclosed, int i, int i2) {
        if (LinearLayoutManager.write(i, i2)) {
            CheckParameters_MembersInjector checkParameters_MembersInjector = Glide.IconCompatParcelizer(context).MediaBrowserCompat$CustomActionResultReceiver;
            Bitmap write = performoptionsmenuclosed.write();
            if (i == Integer.MIN_VALUE) {
                i = write.getWidth();
            }
            if (i2 == Integer.MIN_VALUE) {
                i2 = write.getHeight();
            }
            Bitmap IconCompatParcelizer = IconCompatParcelizer(checkParameters_MembersInjector, write, i, i2);
            if (write.equals(IconCompatParcelizer)) {
                return performoptionsmenuclosed;
            }
            if (IconCompatParcelizer == null) {
                return null;
            }
            return new getLastCustomNonConfigurationInstance(IconCompatParcelizer, checkParameters_MembersInjector);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot apply transformation on width: ");
        sb.append(i);
        sb.append(" or height: ");
        sb.append(i2);
        sb.append(" less than or equal to zero and not Target.SIZE_ORIGINAL");
        throw new IllegalArgumentException(sb.toString());
    }
}
