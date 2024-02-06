package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.MicrLine */
public final /* synthetic */ class MicrLine implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ discardOldLogFiles MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: o.MicrLine$CheckType */
    public final /* synthetic */ class CheckType implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ CheckType IconCompatParcelizer = new CheckType();

        private /* synthetic */ CheckType() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((getPayee) obj).AppCompatDelegateImpl$ListMenuDecorView();
        }
    }

    public /* synthetic */ MicrLine(discardOldLogFiles discardoldlogfiles) {
        this.MediaBrowserCompat$CustomActionResultReceiver = discardoldlogfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        registerNewObjectListener.write(this.MediaBrowserCompat$CustomActionResultReceiver, (C7138hs) obj);
    }
}
