package p040o;

import android.text.TextUtils;
import p040o.PassportWorkflowActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureAnimationsModule */
public final /* synthetic */ class CaptureAnimationsModule implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ CaptureMessage read;

    public /* synthetic */ CaptureAnimationsModule(CaptureMessage captureMessage) {
        this.read = captureMessage;
    }

    public final void IconCompatParcelizer(Object obj) {
        CaptureMessage captureMessage = this.read;
        PassportWorkflowActivity.C6985a aVar = (PassportWorkflowActivity.C6985a) obj;
        boolean isEmpty = TextUtils.isEmpty(captureMessage.ParcelableVolumeInfo.write);
        boolean isEmpty2 = TextUtils.isEmpty(captureMessage.ParcelableVolumeInfo.read);
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(captureMessage.ParcelableVolumeInfo.f2778x50fd9e4a);
        boolean z3 = !TextUtils.isEmpty(captureMessage.ParcelableVolumeInfo.MediaSessionCompat$QueueItem);
        boolean isEmpty3 = TextUtils.isEmpty(captureMessage.ParcelableVolumeInfo.MediaBrowserCompat$MediaItem);
        boolean z4 = (isEmpty ^ true) && (isEmpty2 ^ true);
        if (!z2 || !z3 || !(!isEmpty3)) {
            z = false;
        }
        if (z2 || z3) {
            z4 &= z;
        }
        aVar.IconCompatParcelizer(z4);
    }
}
