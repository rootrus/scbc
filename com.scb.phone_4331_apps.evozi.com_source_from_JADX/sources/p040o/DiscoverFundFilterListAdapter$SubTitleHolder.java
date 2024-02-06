package p040o;

/* renamed from: o.DiscoverFundFilterListAdapter$SubTitleHolder */
public final class DiscoverFundFilterListAdapter$SubTitleHolder {
    int MediaBrowserCompat$CustomActionResultReceiver = 0;
    private String MediaBrowserCompat$ItemReceiver;

    public DiscoverFundFilterListAdapter$SubTitleHolder(String str) {
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == -1) {
            return null;
        }
        int indexOf = this.MediaBrowserCompat$ItemReceiver.indexOf(46, i);
        if (indexOf == -1) {
            String substring = this.MediaBrowserCompat$ItemReceiver.substring(this.MediaBrowserCompat$CustomActionResultReceiver);
            this.MediaBrowserCompat$CustomActionResultReceiver = -1;
            return substring;
        }
        String substring2 = this.MediaBrowserCompat$ItemReceiver.substring(this.MediaBrowserCompat$CustomActionResultReceiver, indexOf);
        this.MediaBrowserCompat$CustomActionResultReceiver = indexOf + 1;
        return substring2;
    }
}
