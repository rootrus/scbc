package p040o;

import p040o.filterByAuthorizedAccounts;

/* renamed from: o.KtaPassportExtractor_Factory$MediaBrowserCompat$CustomActionResultReceiver */
public final class C6931x1c373292 implements getIIdExtractionServerKta {
    private static String write(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            char c = 0;
            char charAt = charSequence.charAt(0);
            char charAt2 = length >= 2 ? charSequence.charAt(1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(3);
            }
            int i = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i >> 8) & 255);
            char c3 = (char) (i & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append((char) ((i >> 16) & 255));
            if (length >= 2) {
                sb.append(c2);
            }
            if (length >= 3) {
                sb.append(c3);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public final void IconCompatParcelizer(filterByAuthorizedAccounts.read read) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!(read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem)) {
                break;
            }
            char charAt = read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver);
            if (charAt >= ' ' && charAt <= '?') {
                sb.append(charAt);
            } else if (charAt < '@' || charAt > '^') {
                AlertController$RecycleListView.write(charAt);
            } else {
                sb.append((char) (charAt - '@'));
            }
            read.MediaBrowserCompat$SearchResultReceiver++;
            if (sb.length() >= 4) {
                read.write.append(write(sb));
                sb.delete(0, 4);
                if (AlertController$RecycleListView.IconCompatParcelizer((CharSequence) read.IconCompatParcelizer, read.MediaBrowserCompat$SearchResultReceiver, 4) != 4) {
                    read.read = 0;
                    break;
                }
            }
        }
        sb.append(31);
        try {
            int length = sb.length();
            if (length != 0) {
                if (length == 1) {
                    read.read(read.write.length());
                    int length2 = read.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver - read.write.length();
                    if ((read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem) - read.MediaBrowserCompat$SearchResultReceiver <= length2 && length2 <= 2) {
                        read.read = 0;
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String write = write(sb);
                    if (!(!(read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem)) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        read.read(read.write.length() + i);
                        if (read.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver - read.write.length() >= 3) {
                            read.read(read.write.length() + write.length());
                            z = false;
                        }
                    }
                    if (z) {
                        read.MediaMetadataCompat = null;
                        read.MediaBrowserCompat$SearchResultReceiver -= i;
                    } else {
                        read.write.append(write);
                    }
                    read.read = 0;
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            read.read = 0;
        }
    }
}
