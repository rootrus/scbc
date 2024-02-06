package p040o;

import org.jmrtd.cbeff.ISO781611;
import p040o.filterByAuthorizedAccounts;

/* renamed from: o.setProjectProvider */
public interface setProjectProvider extends CheckCaptureModule_GetICheckDeserializerRttiFactory {
    void IconCompatParcelizer();

    void MediaBrowserCompat$CustomActionResultReceiver();

    void MediaBrowserCompat$ItemReceiver();

    void read();

    void read(boolean z);

    void write();

    /* renamed from: o.setProjectProvider$write */
    public static final class write implements getIIdExtractionServerKta {
        public final void IconCompatParcelizer(filterByAuthorizedAccounts.read read) {
            int i;
            String str = read.IconCompatParcelizer;
            int i2 = read.MediaBrowserCompat$SearchResultReceiver;
            int length = str.length();
            boolean z = false;
            if (i2 < length) {
                char charAt = str.charAt(i2);
                i = 0;
                while (true) {
                    if (!(charAt >= '0' && charAt <= '9') || i2 >= length) {
                        break;
                    }
                    i++;
                    i2++;
                    if (i2 < length) {
                        charAt = str.charAt(i2);
                    }
                }
            } else {
                i = 0;
            }
            if (i >= 2) {
                char charAt2 = read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver);
                char charAt3 = read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver + 1);
                if (charAt2 >= '0' && charAt2 <= '9') {
                    if (charAt3 >= '0' && charAt3 <= '9') {
                        z = true;
                    }
                    if (z) {
                        read.write.append((char) (((charAt2 - '0') * 10) + (charAt3 - '0') + ISO781611.BIOMETRIC_SUBTYPE_TAG));
                        read.MediaBrowserCompat$SearchResultReceiver += 2;
                        return;
                    }
                }
                StringBuilder sb = new StringBuilder("not digits: ");
                sb.append(charAt2);
                sb.append(charAt3);
                throw new IllegalArgumentException(sb.toString());
            }
            char charAt4 = read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver);
            int IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer((CharSequence) read.IconCompatParcelizer, read.MediaBrowserCompat$SearchResultReceiver, 0);
            if (IconCompatParcelizer == 0) {
                if (charAt4 >= 128 && charAt4 <= 255) {
                    z = true;
                }
                if (z) {
                    read.write.append(235);
                    read.write.append((char) ((charAt4 - 128) + 1));
                    read.MediaBrowserCompat$SearchResultReceiver++;
                    return;
                }
                read.write.append((char) (charAt4 + 1));
                read.MediaBrowserCompat$SearchResultReceiver++;
            } else if (IconCompatParcelizer == 1) {
                read.write.append(230);
                read.read = 1;
            } else if (IconCompatParcelizer == 2) {
                read.write.append(239);
                read.read = 2;
            } else if (IconCompatParcelizer == 3) {
                read.write.append(238);
                read.read = 3;
            } else if (IconCompatParcelizer == 4) {
                read.write.append(240);
                read.read = 4;
            } else if (IconCompatParcelizer == 5) {
                read.write.append(231);
                read.read = 5;
            } else {
                StringBuilder sb2 = new StringBuilder("Illegal mode: ");
                sb2.append(IconCompatParcelizer);
                throw new IllegalStateException(sb2.toString());
            }
        }
    }
}
