package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setUserEmailAddress$MediaBrowserCompat$ItemReceiver */
public final class setUserEmailAddress$MediaBrowserCompat$ItemReceiver<V> implements writeUInt64NoTag.IconCompatParcelizer<T> {
    private /* synthetic */ setUserEmailAddress MediaBrowserCompat$CustomActionResultReceiver;

    public setUserEmailAddress$MediaBrowserCompat$ItemReceiver(setUserEmailAddress setuseremailaddress) {
        this.MediaBrowserCompat$CustomActionResultReceiver = setuseremailaddress;
    }

    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
        IParameters iParameters = (IParameters) obj;
        if (!this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor.IconCompatParcelizer || !onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor.MediaBrowserCompat$ItemReceiver, (Object) Boolean.TRUE)) {
            iParameters.setContentView();
            return;
        }
        CharSequence charSequence = this.MediaBrowserCompat$CustomActionResultReceiver.setHasDecor.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        if (!(charSequence == null || charSequence.length() == 0)) {
            z = false;
        }
        if (z) {
            iParameters.MediaSessionCompat$QueueItem();
        } else if (!this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat()) {
            iParameters.AppCompatDelegateImpl$ListMenuDecorView();
        } else {
            iParameters.setContentView();
        }
    }
}
