package p040o;

import android.text.TextUtils;
import p040o.GoogleMap;

/* renamed from: o.initialize */
public final class initialize extends FragmentBuilder_BindSummaryFragment {
    private final ScriptIntrinsicConvolve5x5 MediaBrowserCompat$CustomActionResultReceiver;

    @HmlPinActivity
    public initialize(ScriptIntrinsicConvolve5x5 scriptIntrinsicConvolve5x5) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scriptIntrinsicConvolve5x5;
    }

    public final GoogleMap.OnMarkerDragListener IconCompatParcelizer(PINMessageException pINMessageException) {
        String str;
        String str2;
        GoogleMap.OnMarkerDragListener onMarkerDragListener = new GoogleMap.OnMarkerDragListener();
        onMarkerDragListener.setTitle = pINMessageException.setItemInvoker;
        onMarkerDragListener.ExpandedMenuView = pINMessageException.setIcon;
        onMarkerDragListener.MediaBrowserCompat$ItemReceiver = pINMessageException.MediaBrowserCompat$ItemReceiver;
        onMarkerDragListener.MediaBrowserCompat$CustomActionResultReceiver = pINMessageException.write;
        onMarkerDragListener.read = pINMessageException.MediaBrowserCompat$CustomActionResultReceiver;
        onMarkerDragListener.ListMenuItemView = pINMessageException.setPopupCallback;
        onMarkerDragListener.setExpandedFormat = pINMessageException.ActionMenuItemView;
        onMarkerDragListener.setItemInvoker = pINMessageException.setShortcut;
        onMarkerDragListener.setContentView = pINMessageException.setHasDecor;
        onMarkerDragListener.PlaybackStateCompat = pINMessageException.ParcelableVolumeInfo;
        onMarkerDragListener.MediaSessionCompat$QueueItem = pINMessageException.MediaSessionCompat$ResultReceiverWrapper;
        onMarkerDragListener.setShortcut = pINMessageException.setPadding;
        onMarkerDragListener.AppCompatDialogFragment = pINMessageException.PlaybackStateCompat$CustomAction;
        onMarkerDragListener.AlertController$RecycleListView = pINMessageException.f2768x50fd9e4a;
        onMarkerDragListener.ParcelableVolumeInfo = pINMessageException.MediaSessionCompat$QueueItem;
        onMarkerDragListener.MediaDescriptionCompat = pINMessageException.RatingCompat;
        onMarkerDragListener.setCheckable = pINMessageException.setContentView;
        onMarkerDragListener.setPopupCallback = pINMessageException.setExpandedFormat;
        onMarkerDragListener.AppCompatDelegateImpl$ListMenuDecorView = pINMessageException.AppCompatDelegateImpl$ListMenuDecorView;
        onMarkerDragListener.setPadding = pINMessageException.AppCompatViewInflater;
        onMarkerDragListener.ActionMenuItemView = pINMessageException.AppCompatActivity;
        String str3 = pINMessageException.MediaMetadataCompat;
        if (str3 != null) {
            str = str3.toLowerCase();
        } else {
            str = "";
        }
        onMarkerDragListener.f2719x50fd9e4a = str;
        onMarkerDragListener.MediaSessionCompat$ResultReceiverWrapper = pINMessageException.MediaSessionCompat$Token;
        onMarkerDragListener.setBackgroundResource = pINMessageException.setBackgroundResource;
        onMarkerDragListener.Keep = pINMessageException.Keep;
        onMarkerDragListener.MediaBrowserCompat$MediaItem = pINMessageException.MediaBrowserCompat$SearchResultReceiver;
        onMarkerDragListener.write = pINMessageException.read;
        onMarkerDragListener.IconCompatParcelizer = pINMessageException.IconCompatParcelizer;
        onMarkerDragListener.setHasDecor = pINMessageException.PlaybackStateCompat;
        onMarkerDragListener.setIcon = pINMessageException.setChecked;
        onMarkerDragListener.AppCompatActivity = pINMessageException.AppCompatDialogFragment;
        String str4 = "0";
        onMarkerDragListener.MediaBrowserCompat$SearchResultReceiver = TextUtils.isEmpty(pINMessageException.MediaBrowserCompat$MediaItem) ? str4 : pINMessageException.MediaBrowserCompat$MediaItem;
        String str5 = pINMessageException.MediaDescriptionCompat;
        boolean z = false;
        if (!(str5 == null || str5.length() == 0)) {
            str4 = pINMessageException.MediaDescriptionCompat;
        }
        onMarkerDragListener.RatingCompat = str4;
        onMarkerDragListener.setChecked = pINMessageException.setCheckable;
        String str6 = pINMessageException.AlertController$RecycleListView;
        if (str6 == null || str6.length() == 0) {
            z = true;
        }
        if (z) {
            str2 = this.MediaBrowserCompat$CustomActionResultReceiver.write;
        } else {
            str2 = pINMessageException.AlertController$RecycleListView;
        }
        onMarkerDragListener.PlaybackStateCompat$CustomAction = str2;
        return onMarkerDragListener;
    }
}
