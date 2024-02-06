package p040o;

import p040o.getUsable;

/* renamed from: o.SelfieDetectionSettings */
public class SelfieDetectionSettings extends writeUInt64NoTag<getUsable.read> {
    private final strokeJointType IconCompatParcelizer;

    @HmlPinActivity
    public SelfieDetectionSettings(strokeJointType strokejointtype, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = strokejointtype;
    }

    public void onDestroy() {
        strokeJointType strokejointtype = this.IconCompatParcelizer;
        if (!strokejointtype.MediaBrowserCompat$MediaItem.isDisposed()) {
            strokejointtype.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
