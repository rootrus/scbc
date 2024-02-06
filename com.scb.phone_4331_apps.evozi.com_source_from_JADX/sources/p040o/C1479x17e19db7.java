package p040o;

import android.os.Bundle;
import android.widget.RemoteViews;
import p040o.setDropDownHorizontalOffset;

/* renamed from: o.setDropDownHorizontalOffset$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class C1479x17e19db7 {
    CharSequence IconCompatParcelizer;
    CharSequence MediaBrowserCompat$ItemReceiver;
    protected setDropDownHorizontalOffset.IconCompatParcelizer read;
    boolean write = false;

    public RemoteViews IconCompatParcelizer(proxyGetICheckDeserializerRtti proxygeticheckdeserializerrtti) {
        return null;
    }

    public RemoteViews MediaBrowserCompat$CustomActionResultReceiver(proxyGetICheckDeserializerRtti proxygeticheckdeserializerrtti) {
        return null;
    }

    public void read(proxyGetICheckDeserializerRtti proxygeticheckdeserializerrtti) {
    }

    public RemoteViews write(proxyGetICheckDeserializerRtti proxygeticheckdeserializerrtti) {
        return null;
    }

    public void write(Bundle bundle) {
    }

    public void write(setDropDownHorizontalOffset.IconCompatParcelizer iconCompatParcelizer) {
        if (this.read != iconCompatParcelizer) {
            this.read = iconCompatParcelizer;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.write(this);
            }
        }
    }
}
