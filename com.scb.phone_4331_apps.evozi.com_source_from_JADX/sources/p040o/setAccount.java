package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.setAccount */
public final class setAccount extends FragmentBuilder_BindSummaryFragment {

    /* renamed from: o.setAccount$write */
    public static final class write {
        private final List<setVariable$MediaBrowserCompat$CustomActionResultReceiver> IconCompatParcelizer;
        private final rsnScriptSetVarObj MediaBrowserCompat$ItemReceiver;

        private write() {
        }

        public write(rsnScriptSetVarObj rsnscriptsetvarobj) {
            this.MediaBrowserCompat$ItemReceiver = rsnscriptsetvarobj;
            ArrayList arrayList = new ArrayList();
            this.IconCompatParcelizer = arrayList;
            arrayList.add(new setVariable$MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvarobj, new int[]{1}));
        }

        public final void read(int[] iArr, int i) {
            if (i != 0) {
                int length = iArr.length - i;
                if (length > 0) {
                    if (i >= this.IconCompatParcelizer.size()) {
                        List<setVariable$MediaBrowserCompat$CustomActionResultReceiver> list = this.IconCompatParcelizer;
                        setVariable$MediaBrowserCompat$CustomActionResultReceiver setvariable_mediabrowsercompat_customactionresultreceiver = list.get(list.size() - 1);
                        for (int size = this.IconCompatParcelizer.size(); size <= i; size++) {
                            rsnScriptSetVarObj rsnscriptsetvarobj = this.MediaBrowserCompat$ItemReceiver;
                            setvariable_mediabrowsercompat_customactionresultreceiver = setvariable_mediabrowsercompat_customactionresultreceiver.read(new setVariable$MediaBrowserCompat$CustomActionResultReceiver(rsnscriptsetvarobj, new int[]{1, rsnscriptsetvarobj.RatingCompat[(size - 1) + rsnscriptsetvarobj.MediaMetadataCompat]}));
                            this.IconCompatParcelizer.add(setvariable_mediabrowsercompat_customactionresultreceiver);
                        }
                    }
                    int[] iArr2 = new int[length];
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    int[] iArr3 = new setVariable$MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, iArr2).MediaBrowserCompat$CustomActionResultReceiver(i, 1).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.get(i))[1].IconCompatParcelizer;
                    int length2 = i - iArr3.length;
                    for (int i2 = 0; i2 < length2; i2++) {
                        iArr[length + i2] = 0;
                    }
                    System.arraycopy(iArr3, 0, iArr, length + length2, iArr3.length);
                    return;
                }
                throw new IllegalArgumentException("No data bytes provided");
            }
            throw new IllegalArgumentException("No error correction bytes");
        }
    }
}
