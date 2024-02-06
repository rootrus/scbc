package p040o;

import android.content.Context;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: o.registerOnLoadCanceledListener */
public final class registerOnLoadCanceledListener implements isStateSaved {
    private final isStateSaved IconCompatParcelizer;
    private final int read;

    public static isStateSaved IconCompatParcelizer(Context context) {
        return new registerOnLoadCanceledListener(context.getResources().getConfiguration().uiMode & 48, takeContentChanged.IconCompatParcelizer(context));
    }

    private registerOnLoadCanceledListener(int i, isStateSaved isstatesaved) {
        this.read = i;
        this.IconCompatParcelizer = isstatesaved;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof registerOnLoadCanceledListener)) {
            return false;
        }
        registerOnLoadCanceledListener registeronloadcanceledlistener = (registerOnLoadCanceledListener) obj;
        if (this.read != registeronloadcanceledlistener.read || !this.IconCompatParcelizer.equals(registeronloadcanceledlistener.IconCompatParcelizer)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return LinearLayoutManager.IconCompatParcelizer((Object) this.IconCompatParcelizer, this.read);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MessageDigest messageDigest) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(messageDigest);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.read).array());
    }
}
