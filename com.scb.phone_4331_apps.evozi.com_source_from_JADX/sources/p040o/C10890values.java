package p040o;

import android.media.AudioAttributes;
import androidx.lifecycle.ReportFragment;

/* renamed from: o.values  reason: case insensitive filesystem */
public class C10890values implements ReportFragment.write {
    public AudioAttributes MediaBrowserCompat$ItemReceiver;
    public int write = -1;

    public int hashCode() {
        return this.MediaBrowserCompat$ItemReceiver.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C10890values)) {
            return false;
        }
        return this.MediaBrowserCompat$ItemReceiver.equals(((C10890values) obj).MediaBrowserCompat$ItemReceiver);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AudioAttributesCompat: audioattributes=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        return sb.toString();
    }
}
