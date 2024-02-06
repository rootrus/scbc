package p040o;

/* renamed from: o.getAnimator$MediaBrowserCompat$ItemReceiver */
public class getAnimator$MediaBrowserCompat$ItemReceiver {
    public Class<?> IconCompatParcelizer;
    public Class<?> MediaBrowserCompat$CustomActionResultReceiver;
    public Class<?> MediaBrowserCompat$ItemReceiver;

    public getAnimator$MediaBrowserCompat$ItemReceiver() {
    }

    public getAnimator$MediaBrowserCompat$ItemReceiver(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        this.MediaBrowserCompat$ItemReceiver = cls;
        this.IconCompatParcelizer = cls2;
        this.MediaBrowserCompat$CustomActionResultReceiver = cls3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        getAnimator$MediaBrowserCompat$ItemReceiver getanimator_mediabrowsercompat_itemreceiver = (getAnimator$MediaBrowserCompat$ItemReceiver) obj;
        return this.MediaBrowserCompat$ItemReceiver.equals(getanimator_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver) && this.IconCompatParcelizer.equals(getanimator_mediabrowsercompat_itemreceiver.IconCompatParcelizer) && LinearLayoutManager.MediaBrowserCompat$CustomActionResultReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) getanimator_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        int hashCode = this.MediaBrowserCompat$ItemReceiver.hashCode();
        int hashCode2 = this.IconCompatParcelizer.hashCode();
        Class<?> cls = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (((hashCode * 31) + hashCode2) * 31) + (cls != null ? cls.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("MultiClassKey{first=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", second=");
        sb.append(this.IconCompatParcelizer);
        sb.append('}');
        return sb.toString();
    }
}
