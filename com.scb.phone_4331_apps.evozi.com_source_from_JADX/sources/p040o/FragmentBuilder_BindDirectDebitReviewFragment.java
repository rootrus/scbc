package p040o;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.io.File;

/* renamed from: o.FragmentBuilder_BindDirectDebitReviewFragment */
public final class FragmentBuilder_BindDirectDebitReviewFragment implements IdExtractor_Factory {
    private final hashCode IconCompatParcelizer;

    public FragmentBuilder_BindDirectDebitReviewFragment(hashCode hashcode) {
        this.IconCompatParcelizer = hashcode;
    }

    public final void write(Object obj, ImageView imageView) {
        getViewModelStore<Bitmap> getviewmodelstore;
        if ((obj instanceof Uri) || obj == null) {
            getviewmodelstore = this.IconCompatParcelizer.read();
            getviewmodelstore.MediaBrowserCompat$ItemReceiver = (Uri) obj;
            getviewmodelstore.IconCompatParcelizer = true;
        } else if (obj instanceof File) {
            getviewmodelstore = this.IconCompatParcelizer.read();
            getviewmodelstore.MediaBrowserCompat$ItemReceiver = (File) obj;
            getviewmodelstore.IconCompatParcelizer = true;
        } else if (obj instanceof byte[]) {
            getviewmodelstore = this.IconCompatParcelizer.read().IconCompatParcelizer((byte[]) obj);
        } else if (obj instanceof Integer) {
            getviewmodelstore = this.IconCompatParcelizer.read().read((Integer) obj);
        } else if (obj instanceof String) {
            getviewmodelstore = this.IconCompatParcelizer.read();
            getviewmodelstore.MediaBrowserCompat$ItemReceiver = (String) obj;
            getviewmodelstore.IconCompatParcelizer = true;
        } else if (obj instanceof Drawable) {
            getviewmodelstore = this.IconCompatParcelizer.read().IconCompatParcelizer((Drawable) obj);
        } else if (obj instanceof Bitmap) {
            getviewmodelstore = this.IconCompatParcelizer.read().IconCompatParcelizer((Bitmap) obj);
        } else {
            getviewmodelstore = this.IconCompatParcelizer.read();
            getviewmodelstore.MediaBrowserCompat$ItemReceiver = obj;
            getviewmodelstore.IconCompatParcelizer = true;
        }
        getviewmodelstore.MediaBrowserCompat$ItemReceiver((abandon<?>) ((isReset) new isReset().read(true)).MediaBrowserCompat$CustomActionResultReceiver(performCreate.read)).MediaBrowserCompat$ItemReceiver(imageView);
    }
}
