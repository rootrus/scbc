package p040o;

/* renamed from: o.ImageAndTextAdBannerView */
public final class ImageAndTextAdBannerView<T> extends CustomCheckboxGroupView_ViewBinding<T> {
    private final CustomCheckboxGroupView<T> write;

    public ImageAndTextAdBannerView(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding) {
        this(customCheckboxGroupView_ViewBinding, (byte) 0);
    }

    private ImageAndTextAdBannerView(CustomCheckboxGroupView_ViewBinding<? super T> customCheckboxGroupView_ViewBinding, byte b) {
        super(customCheckboxGroupView_ViewBinding, true);
        this.write = new setBannerImage(customCheckboxGroupView_ViewBinding);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.write.MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void IconCompatParcelizer(Throwable th) {
        this.write.IconCompatParcelizer(th);
    }

    public final void IconCompatParcelizer(T t) {
        this.write.IconCompatParcelizer(t);
    }
}
