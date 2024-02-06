package androidx.media;

import androidx.versionedparcelable.VersionedParcel;
import p040o.setType;

public final class AudioAttributesImplBaseParcelizer {
    public static setType read(VersionedParcel versionedParcel) {
        setType settype = new setType();
        settype.IconCompatParcelizer = versionedParcel.read(settype.IconCompatParcelizer, 1);
        settype.write = versionedParcel.read(settype.write, 2);
        settype.read = versionedParcel.read(settype.read, 3);
        settype.MediaBrowserCompat$ItemReceiver = versionedParcel.read(settype.MediaBrowserCompat$ItemReceiver, 4);
        return settype;
    }

    public static void write(setType settype, VersionedParcel versionedParcel) {
        versionedParcel.write(settype.IconCompatParcelizer, 1);
        versionedParcel.write(settype.write, 2);
        versionedParcel.write(settype.read, 3);
        versionedParcel.write(settype.MediaBrowserCompat$ItemReceiver, 4);
    }
}
