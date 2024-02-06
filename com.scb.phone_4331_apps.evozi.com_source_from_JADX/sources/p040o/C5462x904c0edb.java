package p040o;

import java.util.List;

/* renamed from: o.writeSessionPartsToSessionFile$MediaBrowserCompat$CustomActionResultReceiver */
public final class C5462x904c0edb {
    public final List<getFilesDir> IconCompatParcelizer;
    public final getFilesDir MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    private final String MediaDescriptionCompat;
    public final List<getFilesDir> read;
    public final getFilesDir write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5462x904c0edb)) {
            return false;
        }
        C5462x904c0edb writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver = (C5462x904c0edb) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaDescriptionCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        getFilesDir getfilesdir = this.write;
        int hashCode3 = getfilesdir != null ? getfilesdir.hashCode() : 0;
        List<getFilesDir> list = this.IconCompatParcelizer;
        int hashCode4 = list != null ? list.hashCode() : 0;
        List<getFilesDir> list2 = this.read;
        int hashCode5 = list2 != null ? list2.hashCode() : 0;
        getFilesDir getfilesdir2 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getfilesdir2 != null) {
            i = getfilesdir2.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public C5462x904c0edb(String str, String str2, getFilesDir getfilesdir, List<getFilesDir> list, List<getFilesDir> list2, getFilesDir getfilesdir2) {
        onGetStartedClick.write((Object) str, "code");
        onGetStartedClick.write((Object) str2, "description");
        onGetStartedClick.write((Object) getfilesdir, "defaultOption");
        onGetStartedClick.write((Object) list, "options");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaDescriptionCompat = str2;
        this.write = getfilesdir;
        this.IconCompatParcelizer = list;
        this.read = list2;
        this.MediaBrowserCompat$CustomActionResultReceiver = getfilesdir2;
    }

    public final String toString() {
        return this.MediaDescriptionCompat;
    }
}
