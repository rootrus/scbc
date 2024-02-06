package p040o;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import org.xmlpull.p042v1.XmlPullParser;

/* renamed from: o.ActionBarOverlayLayout$MediaBrowserCompat$ItemReceiver */
class ActionBarOverlayLayout$MediaBrowserCompat$ItemReceiver implements C1127x32570a8a {
    ActionBarOverlayLayout$MediaBrowserCompat$ItemReceiver() {
    }

    public Drawable write(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        try {
            return dismiss.MediaBrowserCompat$ItemReceiver(context, context.getResources(), xmlPullParser, attributeSet, theme);
        } catch (Exception e) {
            Log.e("AvdcInflateDelegate", "Exception while inflating <animated-vector>", e);
            return null;
        }
    }
}
