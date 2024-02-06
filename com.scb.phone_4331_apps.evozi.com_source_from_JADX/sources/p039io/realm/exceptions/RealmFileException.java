package p039io.realm.exceptions;

import java.util.Locale;

/* renamed from: io.realm.exceptions.RealmFileException */
public class RealmFileException extends RuntimeException {
    private final IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    /* renamed from: io.realm.exceptions.RealmFileException$IconCompatParcelizer */
    public enum IconCompatParcelizer {
        ACCESS_ERROR,
        BAD_HISTORY,
        PERMISSION_DENIED,
        EXISTS,
        NOT_FOUND,
        INCOMPATIBLE_LOCK_FILE,
        FORMAT_UPGRADE_REQUIRED,
        INCOMPATIBLE_SYNC_FILE
    }

    public RealmFileException(IconCompatParcelizer iconCompatParcelizer, String str) {
        super(str);
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public RealmFileException(IconCompatParcelizer iconCompatParcelizer, Throwable th) {
        super(th);
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public RealmFileException(IconCompatParcelizer iconCompatParcelizer, String str, Throwable th) {
        super(str, th);
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
    }

    public String toString() {
        return String.format(Locale.US, "%s Kind: %s.", new Object[]{super.toString(), this.MediaBrowserCompat$ItemReceiver});
    }
}
