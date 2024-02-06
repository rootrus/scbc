package p040o;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: o.setMaxWidth */
public abstract class setMaxWidth {
    private final Context MediaBrowserCompat$ItemReceiver;
    private write read;
    private IconCompatParcelizer write;

    /* renamed from: o.setMaxWidth$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void IconCompatParcelizer(boolean z);
    }

    /* renamed from: o.setMaxWidth$write */
    public interface write {
        void MediaBrowserCompat$ItemReceiver();
    }

    public boolean IconCompatParcelizer() {
        return false;
    }

    public boolean MediaBrowserCompat$CustomActionResultReceiver() {
        return false;
    }

    public boolean MediaBrowserCompat$ItemReceiver() {
        return true;
    }

    public abstract View read();

    public void read(SubMenu subMenu) {
    }

    public boolean write() {
        return false;
    }

    public setMaxWidth(Context context) {
        this.MediaBrowserCompat$ItemReceiver = context;
    }

    public View MediaBrowserCompat$CustomActionResultReceiver(MenuItem menuItem) {
        return read();
    }

    public void write(boolean z) {
        IconCompatParcelizer iconCompatParcelizer = this.write;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer(z);
        }
    }

    public void MediaBrowserCompat$ItemReceiver(IconCompatParcelizer iconCompatParcelizer) {
        this.write = iconCompatParcelizer;
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(write write2) {
        if (!(this.read == null || write2 == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            sb.append(getClass().getSimpleName());
            sb.append(" instance while it is still in use somewhere else?");
            Log.w("ActionProvider(support)", sb.toString());
        }
        this.read = write2;
    }

    public void MediaDescriptionCompat() {
        this.read = null;
        this.write = null;
    }
}
