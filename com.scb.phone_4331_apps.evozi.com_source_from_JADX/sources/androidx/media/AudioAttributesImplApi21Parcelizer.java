package androidx.media;

import android.media.AudioAttributes;
import androidx.versionedparcelable.VersionedParcel;
import p040o.C10890values;

public final class AudioAttributesImplApi21Parcelizer {
    public static C10890values read(VersionedParcel versionedParcel) {
        C10890values values = new C10890values();
        values.MediaBrowserCompat$ItemReceiver = (AudioAttributes) versionedParcel.write(values.MediaBrowserCompat$ItemReceiver, 1);
        values.write = versionedParcel.read(values.write, 2);
        return values;
    }

    public static void write(C10890values values, VersionedParcel versionedParcel) {
        versionedParcel.IconCompatParcelizer(values.MediaBrowserCompat$ItemReceiver, 1);
        versionedParcel.write(values.write, 2);
    }
}
