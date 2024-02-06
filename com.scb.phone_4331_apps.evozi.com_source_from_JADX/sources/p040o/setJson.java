package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setJson */
public final /* synthetic */ class setJson implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ VideoPlayerCameraSourceType MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setJson(VideoPlayerCameraSourceType videoPlayerCameraSourceType) {
        this.MediaBrowserCompat$CustomActionResultReceiver = videoPlayerCameraSourceType;
    }

    public final void IconCompatParcelizer(Object obj) {
        String str;
        getBlackStreakMaxHeight getblackstreakmaxheight = (getBlackStreakMaxHeight) obj;
        insert insert = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem;
        zzwi write = insert.IconCompatParcelizer.write();
        if ((write == null || write.AlertController$RecycleListView == null) ? false : true) {
            str = insert.IconCompatParcelizer.write().AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver;
        } else {
            str = "";
        }
        getblackstreakmaxheight.read(str);
    }
}
