package p040o;

/* renamed from: o.clickManageShopAccount */
public class clickManageShopAccount extends onDoneNicknameClick implements MwBankAccountActivity {
    private final boolean MediaBrowserCompat$ItemReceiver;

    public final boolean aT_() {
        return true;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public clickManageShopAccount(clickManagePin clickmanagepin) {
        super(true);
        onDoneNicknameClick ondonenicknameclick;
        boolean z = true;
        MediaBrowserCompat$CustomActionResultReceiver(clickmanagepin);
        MediaImagePreviewActivity MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        uploadCroppedImage uploadcroppedimage = (uploadCroppedImage) (!(MediaSessionCompat$QueueItem instanceof uploadCroppedImage) ? null : MediaSessionCompat$QueueItem);
        if (uploadcroppedimage != null && (ondonenicknameclick = (onDoneNicknameClick) uploadcroppedimage.IconCompatParcelizer) != null) {
            while (true) {
                if (!ondonenicknameclick.aS_()) {
                    MediaImagePreviewActivity MediaSessionCompat$QueueItem2 = ondonenicknameclick.MediaSessionCompat$QueueItem();
                    uploadCroppedImage uploadcroppedimage2 = (uploadCroppedImage) (!(MediaSessionCompat$QueueItem2 instanceof uploadCroppedImage) ? null : MediaSessionCompat$QueueItem2);
                    if (uploadcroppedimage2 != null) {
                        ondonenicknameclick = (onDoneNicknameClick) uploadcroppedimage2.IconCompatParcelizer;
                        if (ondonenicknameclick == null) {
                            break;
                        }
                    } else {
                        break;
                    }
                } else {
                    break;
                }
            }
            this.MediaBrowserCompat$ItemReceiver = z;
        }
        z = false;
        this.MediaBrowserCompat$ItemReceiver = z;
    }

    public final boolean aS_() {
        return this.MediaBrowserCompat$ItemReceiver;
    }
}
