package p040o;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import org.xmlpull.p042v1.XmlPullParser;
import p040o.getTheme;

/* renamed from: o.getTheme$MediaBrowserCompat$ItemReceiver */
class getTheme$MediaBrowserCompat$ItemReceiver extends getTheme.write {
    public boolean IconCompatParcelizer() {
        return true;
    }

    public getTheme$MediaBrowserCompat$ItemReceiver() {
    }

    public getTheme$MediaBrowserCompat$ItemReceiver(getTheme$MediaBrowserCompat$ItemReceiver gettheme_mediabrowsercompat_itemreceiver) {
        super(gettheme_mediabrowsercompat_itemreceiver);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(TypedArray typedArray) {
        String string = typedArray.getString(0);
        if (string != null) {
            this.ParcelableVolumeInfo = string;
        }
        String string2 = typedArray.getString(1);
        if (string2 != null) {
            this.MediaSessionCompat$ResultReceiverWrapper = ButtonBarLayout.write(string2);
        }
    }

    public void read(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
        TypedArray typedArray;
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", "pathData") != null) {
            int[] iArr = DialogFragment.MediaDescriptionCompat;
            if (theme == null) {
                typedArray = resources.obtainAttributes(attributeSet, iArr);
            } else {
                typedArray = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            }
            MediaBrowserCompat$CustomActionResultReceiver(typedArray);
            typedArray.recycle();
        }
    }
}
