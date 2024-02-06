package p040o;

import p040o.isHideReplaced;

/* renamed from: o.isHideReplaced */
public abstract class isHideReplaced<CHILD extends isHideReplaced<CHILD, TranscodeType>, TranscodeType> implements Cloneable {
    registerListener<? super TranscodeType> MediaBrowserCompat$ItemReceiver = onStopLoading.MediaBrowserCompat$ItemReceiver();

    /* renamed from: MediaBrowserCompat$CustomActionResultReceiver */
    public final CHILD clone() {
        try {
            return (isHideReplaced) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
