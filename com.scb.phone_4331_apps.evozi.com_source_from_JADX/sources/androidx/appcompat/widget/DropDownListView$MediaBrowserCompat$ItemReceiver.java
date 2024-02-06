package androidx.appcompat.widget;

class DropDownListView$MediaBrowserCompat$ItemReceiver implements Runnable {
    final /* synthetic */ DropDownListView MediaBrowserCompat$ItemReceiver;

    DropDownListView$MediaBrowserCompat$ItemReceiver(DropDownListView dropDownListView) {
        this.MediaBrowserCompat$ItemReceiver = dropDownListView;
    }

    public final void run() {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = null;
        this.MediaBrowserCompat$ItemReceiver.drawableStateChanged();
    }
}
