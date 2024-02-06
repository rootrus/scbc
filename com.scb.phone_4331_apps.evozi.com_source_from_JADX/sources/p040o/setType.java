package p040o;

import androidx.lifecycle.ReportFragment;
import androidx.media.AudioAttributesCompat;
import java.util.Arrays;

/* renamed from: o.setType */
public class setType implements ReportFragment.write {
    public int IconCompatParcelizer = 0;
    public int MediaBrowserCompat$ItemReceiver = -1;
    public int read = 0;
    public int write = 0;

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.write), Integer.valueOf(this.read), Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.MediaBrowserCompat$ItemReceiver)});
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof setType)) {
            return false;
        }
        setType settype = (setType) obj;
        if (this.write != settype.write) {
            return false;
        }
        int i = this.read;
        int i2 = settype.read;
        int i3 = settype.MediaBrowserCompat$ItemReceiver;
        if (i3 == -1) {
            i3 = AudioAttributesCompat.IconCompatParcelizer(false, i2, settype.IconCompatParcelizer);
        }
        if (i3 == 6) {
            i2 |= 4;
        } else if (i3 == 7) {
            i2 |= 1;
        }
        if (i == (i2 & 273) && this.IconCompatParcelizer == settype.IconCompatParcelizer && this.MediaBrowserCompat$ItemReceiver == settype.MediaBrowserCompat$ItemReceiver) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.MediaBrowserCompat$ItemReceiver != -1) {
            sb.append(" stream=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer));
        sb.append(" content=");
        sb.append(this.write);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.read).toUpperCase());
        return sb.toString();
    }
}
