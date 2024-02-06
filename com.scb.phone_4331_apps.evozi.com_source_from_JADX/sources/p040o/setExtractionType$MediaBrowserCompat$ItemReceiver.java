package p040o;

import org.bouncycastle.crypto.tls.CipherSuite;
import p040o.filterByAuthorizedAccounts;

/* renamed from: o.setExtractionType$MediaBrowserCompat$ItemReceiver */
public final class setExtractionType$MediaBrowserCompat$ItemReceiver implements getIIdExtractionServerKta {
    public final void IconCompatParcelizer(filterByAuthorizedAccounts.read read) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!(read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem)) {
                break;
            }
            sb.append(read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver));
            read.MediaBrowserCompat$SearchResultReceiver++;
            if (AlertController$RecycleListView.IconCompatParcelizer((CharSequence) read.IconCompatParcelizer, read.MediaBrowserCompat$SearchResultReceiver, 5) != 5) {
                read.read = 0;
                break;
            }
        }
        int length = sb.length() - 1;
        int length2 = read.write.length() + length + 1;
        read.read(length2);
        boolean z = read.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver - length2 > 0;
        if ((read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem) || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                StringBuilder sb2 = new StringBuilder("Message length not in valid ranges: ");
                sb2.append(length);
                throw new IllegalStateException(sb2.toString());
            }
        }
        int length3 = sb.length();
        for (int i = 0; i < length3; i++) {
            int charAt = sb.charAt(i) + (((read.write.length() + 1) * CipherSuite.TLS_RSA_PSK_WITH_AES_256_CBC_SHA) % 255) + 1;
            if (charAt > 255) {
                charAt -= 256;
            }
            read.write.append((char) charAt);
        }
    }
}
