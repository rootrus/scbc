package p040o;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;

/* renamed from: o.onMobileCheckBoxClick */
public class onMobileCheckBoxClick implements BankAccountAdapter$BankAccountViewHolder {
    private BigInteger IconCompatParcelizer;
    private NotificationAdapter$NotificationHolder MediaBrowserCompat$CustomActionResultReceiver;
    private MobileListAdapter$MobileListCustomView MediaBrowserCompat$ItemReceiver;
    private Collection MediaBrowserCompat$MediaItem = new HashSet();
    private Collection RatingCompat = new HashSet();
    private Date read;
    private UserProfileImageSelectionAdapter$ItemViewHolder_ViewBinding write;

    public Object clone() {
        onMobileCheckBoxClick onmobilecheckboxclick = new onMobileCheckBoxClick();
        onmobilecheckboxclick.MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$ItemReceiver;
        onmobilecheckboxclick.read = this.read != null ? new Date(this.read.getTime()) : null;
        onmobilecheckboxclick.write = this.write;
        onmobilecheckboxclick.MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        onmobilecheckboxclick.IconCompatParcelizer = this.IconCompatParcelizer;
        onmobilecheckboxclick.MediaBrowserCompat$MediaItem = Collections.unmodifiableCollection(this.MediaBrowserCompat$MediaItem);
        onmobilecheckboxclick.RatingCompat = Collections.unmodifiableCollection(this.RatingCompat);
        return onmobilecheckboxclick;
    }
}
