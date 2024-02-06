package p040o;

@Deprecated
/* renamed from: o.AmountDetailsSuccessAdapter$SuccessRow */
public abstract class AmountDetailsSuccessAdapter$SuccessRow implements AmountDetailsSuccessAdapter$SuccessRow_ViewBinding {
    public final long MediaBrowserCompat$CustomActionResultReceiver(String str, long j) {
        Object IconCompatParcelizer = IconCompatParcelizer(str);
        if (IconCompatParcelizer == null) {
            return j;
        }
        return ((Long) IconCompatParcelizer).longValue();
    }

    public final int MediaBrowserCompat$ItemReceiver(String str, int i) {
        Object IconCompatParcelizer = IconCompatParcelizer(str);
        if (IconCompatParcelizer == null) {
            return i;
        }
        return ((Integer) IconCompatParcelizer).intValue();
    }

    public final AmountDetailsSuccessAdapter$SuccessRow_ViewBinding write(String str, int i) {
        MediaBrowserCompat$ItemReceiver(str, (Object) Integer.valueOf(i));
        return this;
    }

    public final boolean IconCompatParcelizer(String str, boolean z) {
        Object IconCompatParcelizer = IconCompatParcelizer(str);
        if (IconCompatParcelizer == null) {
            return z;
        }
        return ((Boolean) IconCompatParcelizer).booleanValue();
    }

    public final AmountDetailsSuccessAdapter$SuccessRow_ViewBinding read(String str, boolean z) {
        MediaBrowserCompat$ItemReceiver(str, (Object) z ? Boolean.TRUE : Boolean.FALSE);
        return this;
    }
}
