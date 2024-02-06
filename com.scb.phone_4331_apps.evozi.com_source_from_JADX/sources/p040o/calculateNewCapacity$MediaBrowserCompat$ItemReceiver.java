package p040o;

/* renamed from: o.calculateNewCapacity$MediaBrowserCompat$ItemReceiver */
public final class calculateNewCapacity$MediaBrowserCompat$ItemReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ setAnimation MediaBrowserCompat$CustomActionResultReceiver;

    private calculateNewCapacity$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ calculateNewCapacity$MediaBrowserCompat$ItemReceiver(setAnimation setanimation) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setanimation;
    }

    public final boolean write(Object obj) {
        onIndoorLevelActivated onindoorlevelactivated = (onIndoorLevelActivated) obj;
        return onindoorlevelactivated.read != null && onindoorlevelactivated.read.equals(this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
    }
}
