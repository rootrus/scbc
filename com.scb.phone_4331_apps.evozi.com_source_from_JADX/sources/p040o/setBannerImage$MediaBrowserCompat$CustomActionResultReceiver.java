package p040o;

/* renamed from: o.setBannerImage$MediaBrowserCompat$CustomActionResultReceiver */
final class setBannerImage$MediaBrowserCompat$CustomActionResultReceiver {
    Object[] IconCompatParcelizer;
    private int MediaBrowserCompat$ItemReceiver;

    setBannerImage$MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public final void write(Object obj) {
        int i = this.MediaBrowserCompat$ItemReceiver;
        Object[] objArr = this.IconCompatParcelizer;
        if (objArr == null) {
            objArr = new Object[16];
            this.IconCompatParcelizer = objArr;
        } else if (i == objArr.length) {
            Object[] objArr2 = new Object[((i >> 2) + i)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            this.IconCompatParcelizer = objArr2;
            objArr = objArr2;
        }
        objArr[i] = obj;
        this.MediaBrowserCompat$ItemReceiver = i + 1;
    }
}
