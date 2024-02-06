package p040o;

/* renamed from: o.setUiOptions$MediaBrowserCompat$CustomActionResultReceiver */
class setUiOptions$MediaBrowserCompat$CustomActionResultReceiver implements Runnable {
    final /* synthetic */ setUiOptions IconCompatParcelizer;

    setUiOptions$MediaBrowserCompat$CustomActionResultReceiver(setUiOptions setuioptions) {
        this.IconCompatParcelizer = setuioptions;
    }

    public final void run() {
        if (this.IconCompatParcelizer.write != null && SwitchCompat.setExpandedFormat(this.IconCompatParcelizer.write) && this.IconCompatParcelizer.write.getCount() > this.IconCompatParcelizer.write.getChildCount() && this.IconCompatParcelizer.write.getChildCount() <= this.IconCompatParcelizer.IconCompatParcelizer) {
            this.IconCompatParcelizer.RatingCompat.setInputMethodMode(2);
            this.IconCompatParcelizer.MediaDescriptionCompat();
        }
    }
}
