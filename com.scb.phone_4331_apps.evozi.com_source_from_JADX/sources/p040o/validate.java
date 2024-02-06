package p040o;

import p040o.IParameters;
import p040o.filterByAuthorizedAccounts;

/* renamed from: o.validate */
public final class validate extends IParameters.write {
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        return 3;
    }

    public final void IconCompatParcelizer(filterByAuthorizedAccounts.read read) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!(read.MediaBrowserCompat$SearchResultReceiver < read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem)) {
                break;
            }
            char charAt = read.IconCompatParcelizer.charAt(read.MediaBrowserCompat$SearchResultReceiver);
            read.MediaBrowserCompat$SearchResultReceiver++;
            MediaBrowserCompat$CustomActionResultReceiver(charAt, sb);
            if (sb.length() % 3 == 0) {
                MediaBrowserCompat$ItemReceiver(read, sb);
                if (AlertController$RecycleListView.IconCompatParcelizer((CharSequence) read.IconCompatParcelizer, read.MediaBrowserCompat$SearchResultReceiver, 3) != 3) {
                    read.read = 0;
                    break;
                }
            }
        }
        write(read, sb);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            AlertController$RecycleListView.write(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    public final void write(filterByAuthorizedAccounts.read read, StringBuilder sb) {
        read.read(read.write.length());
        int length = read.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver - read.write.length();
        read.MediaBrowserCompat$SearchResultReceiver -= sb.length();
        if ((read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem) - read.MediaBrowserCompat$SearchResultReceiver > 1 || length > 1 || (read.IconCompatParcelizer.length() - read.MediaBrowserCompat$MediaItem) - read.MediaBrowserCompat$SearchResultReceiver != length) {
            read.write.append(254);
        }
        if (read.read < 0) {
            read.read = 0;
        }
    }
}
