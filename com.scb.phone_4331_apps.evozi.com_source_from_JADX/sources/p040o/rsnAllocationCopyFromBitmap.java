package p040o;

import com.google.common.base.Preconditions;
import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: o.rsnAllocationCopyFromBitmap */
public final class rsnAllocationCopyFromBitmap {
    private static final Pattern IconCompatParcelizer = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern MediaBrowserCompat$CustomActionResultReceiver;
    private static final Pattern read;
    private static final Pattern write = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private String MediaBrowserCompat$ItemReceiver;
    private final SortedMap<String, String> MediaBrowserCompat$MediaItem = new TreeMap();
    private String MediaBrowserCompat$SearchResultReceiver = "octet-stream";
    private String MediaMetadataCompat = "application";

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("\\s*(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")/(");
        sb.append("[^\\s/=;\"]+");
        sb.append(")\\s*(");
        sb.append(";.*");
        sb.append(")?");
        read = Pattern.compile(sb.toString(), 32);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\\s*;\\s*(");
        sb2.append("[^\\s/=;\"]+");
        sb2.append(")=(");
        sb2.append("\"([^\"]*)\"|[^\\s;\"]*");
        sb2.append(")");
        MediaBrowserCompat$CustomActionResultReceiver = Pattern.compile(sb2.toString());
    }

    public rsnAllocationCopyFromBitmap(String str) {
        read(str);
    }

    private rsnAllocationCopyFromBitmap read(String str) {
        Matcher matcher = read.matcher(str);
        Preconditions.checkArgument(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String group = matcher.group(1);
        Preconditions.checkArgument(write.matcher(group).matches(), "Type contains reserved characters");
        this.MediaMetadataCompat = group;
        this.MediaBrowserCompat$ItemReceiver = null;
        String group2 = matcher.group(2);
        Preconditions.checkArgument(write.matcher(group2).matches(), "Subtype contains reserved characters");
        this.MediaBrowserCompat$SearchResultReceiver = group2;
        this.MediaBrowserCompat$ItemReceiver = null;
        String group3 = matcher.group(3);
        if (group3 != null) {
            Matcher matcher2 = MediaBrowserCompat$CustomActionResultReceiver.matcher(group3);
            while (matcher2.find()) {
                String group4 = matcher2.group(1);
                String group5 = matcher2.group(3);
                if (group5 == null) {
                    group5 = matcher2.group(2);
                }
                read(group4, group5);
            }
        }
        return this;
    }

    private String write() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaMetadataCompat);
        sb.append('/');
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        SortedMap<String, String> sortedMap = this.MediaBrowserCompat$MediaItem;
        if (sortedMap != null) {
            for (Map.Entry next : sortedMap.entrySet()) {
                String str2 = (String) next.getValue();
                sb.append("; ");
                sb.append((String) next.getKey());
                sb.append("=");
                if (!IconCompatParcelizer.matcher(str2).matches()) {
                    String replace = str2.replace("\\", "\\\\").replace("\"", "\\\"");
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("\"");
                    sb2.append(replace);
                    sb2.append("\"");
                    str2 = sb2.toString();
                }
                sb.append(str2);
            }
        }
        String obj = sb.toString();
        this.MediaBrowserCompat$ItemReceiver = obj;
        return obj;
    }

    public final String toString() {
        return write();
    }

    public final int hashCode() {
        return write().hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof rsnAllocationCopyFromBitmap)) {
            return false;
        }
        rsnAllocationCopyFromBitmap rsnallocationcopyfrombitmap = (rsnAllocationCopyFromBitmap) obj;
        if (!(rsnallocationcopyfrombitmap != null && this.MediaMetadataCompat.equalsIgnoreCase(rsnallocationcopyfrombitmap.MediaMetadataCompat) && this.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(rsnallocationcopyfrombitmap.MediaBrowserCompat$SearchResultReceiver)) || !this.MediaBrowserCompat$MediaItem.equals(rsnallocationcopyfrombitmap.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        return true;
    }

    public final rsnAllocationCopyFromBitmap read(String str, String str2) {
        if (str2 == null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$MediaItem.remove(str.toLowerCase(Locale.US));
            return this;
        }
        Preconditions.checkArgument(IconCompatParcelizer.matcher(str).matches(), "Name contains reserved characters");
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaBrowserCompat$MediaItem.put(str.toLowerCase(Locale.US), str2);
        return this;
    }
}
