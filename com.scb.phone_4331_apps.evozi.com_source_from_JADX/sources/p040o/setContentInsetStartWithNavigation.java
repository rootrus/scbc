package p040o;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.ImageView;

/* renamed from: o.setContentInsetStartWithNavigation */
public class setContentInsetStartWithNavigation {
    public static ColorStateList MediaBrowserCompat$ItemReceiver(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintList();
        }
        if (imageView instanceof setContentInsetsRelative) {
            return ((setContentInsetsRelative) imageView).getSupportImageTintList();
        }
        return null;
    }

    public static void read(ImageView imageView, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof setContentInsetsRelative) {
            ((setContentInsetsRelative) imageView).setSupportImageTintList(colorStateList);
        }
    }

    public static PorterDuff.Mode IconCompatParcelizer(ImageView imageView) {
        if (Build.VERSION.SDK_INT >= 21) {
            return imageView.getImageTintMode();
        }
        if (imageView instanceof setContentInsetsRelative) {
            return ((setContentInsetsRelative) imageView).getSupportImageTintMode();
        }
        return null;
    }

    public static void MediaBrowserCompat$ItemReceiver(ImageView imageView, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            imageView.setImageTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = imageView.getDrawable();
                boolean z = (imageView.getImageTintList() == null || imageView.getImageTintMode() == null) ? false : true;
                if (drawable != null && z) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
        } else if (imageView instanceof setContentInsetsRelative) {
            ((setContentInsetsRelative) imageView).setSupportImageTintMode(mode);
        }
    }
}
