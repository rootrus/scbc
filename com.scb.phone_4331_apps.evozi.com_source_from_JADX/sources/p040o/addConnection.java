package p040o;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;
import java.util.Collections;
import java.util.List;

/* renamed from: o.addConnection */
public class addConnection<VH extends RecyclerView.setContentView> extends RecyclerView.IconCompatParcelizer<VH> implements addInvokeInternal<VH>, validateDAG$MediaBrowserCompat$CustomActionResultReceiver {
    private static List<Object> write = Collections.emptyList();
    private validateDAG MediaBrowserCompat$ItemReceiver;
    public RecyclerView.IconCompatParcelizer<VH> read;

    public void MediaBrowserCompat$ItemReceiver() {
    }

    public addConnection(RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer) {
        this.read = iconCompatParcelizer;
        validateDAG validatedag = new validateDAG(this, iconCompatParcelizer);
        this.MediaBrowserCompat$ItemReceiver = validatedag;
        this.read.IconCompatParcelizer.registerObserver(validatedag);
        super.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(List<RecyclerView.IconCompatParcelizer> list) {
        RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
        if (iconCompatParcelizer != null) {
            list.add(iconCompatParcelizer);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        validateDAG validatedag;
        MediaBrowserCompat$ItemReceiver();
        RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
        if (!(iconCompatParcelizer == null || (validatedag = this.MediaBrowserCompat$ItemReceiver) == null)) {
            iconCompatParcelizer.IconCompatParcelizer.unregisterObserver(validatedag);
        }
        this.read = null;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        super.MediaBrowserCompat$ItemReceiver(z);
        if (this.read != null) {
            this.read.MediaBrowserCompat$ItemReceiver(z);
        }
    }

    public VH IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return this.read.IconCompatParcelizer(viewGroup, i);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(VH vh, int i) {
        write(vh, i, write);
    }

    public long MediaBrowserCompat$ItemReceiver(int i) {
        return this.read.MediaBrowserCompat$ItemReceiver(i);
    }

    public int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.read.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final int read(zzge$zzh$zza$MediaBrowserCompat$ItemReceiver zzge_zzh_zza_mediabrowsercompat_itemreceiver, int i) {
        if (zzge_zzh_zza_mediabrowsercompat_itemreceiver.read == this.read) {
            return i;
        }
        return -1;
    }

    public final void write() {
        read();
    }

    /* renamed from: a_ */
    public final void mo17990a_(int i, int i2) {
        MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    public final void IconCompatParcelizer(int i, int i2) {
        MediaBrowserCompat$ItemReceiver(i, i2);
    }

    /* renamed from: b_ */
    public final void mo17992b_(int i, int i2) {
        MediaBrowserCompat$SearchResultReceiver(i, i2);
    }

    public final void IconCompatParcelizer(int i, int i2, int i3) {
        read(i, i2, 1);
    }

    public int IconCompatParcelizer() {
        if (this.read != null) {
            return this.read.IconCompatParcelizer();
        }
        return 0;
    }

    public final void write(RecyclerView recyclerView) {
        if (this.read != null) {
            this.read.write(recyclerView);
        }
    }

    public void write(VH vh, int i, List<Object> list) {
        if (this.read != null) {
            this.read.write(vh, i, list);
        }
    }

    public final void write(int i, int i2, Object obj) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i2, obj);
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView recyclerView) {
        if (this.read != null) {
            this.read.MediaBrowserCompat$ItemReceiver(recyclerView);
        }
    }

    public final boolean MediaBrowserCompat$ItemReceiver(VH vh) {
        return read(vh, vh.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final boolean read(VH vh, int i) {
        boolean z;
        boolean z2 = false;
        if (this.read != null) {
            RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
            if (iconCompatParcelizer instanceof addKernelInternal) {
                z = ((addKernelInternal) iconCompatParcelizer).read(vh, i);
            } else {
                z = iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(vh);
            }
            z2 = z;
        }
        if (z2) {
            return true;
        }
        return super.MediaBrowserCompat$ItemReceiver(vh);
    }

    public void read() {
        this.IconCompatParcelizer.write();
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, i2);
    }

    public void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    public void MediaBrowserCompat$SearchResultReceiver(int i, int i2) {
        this.IconCompatParcelizer.write(i, i2);
    }

    public void read(int i, int i2, int i3) {
        if (i3 == 1) {
            this.IconCompatParcelizer.IconCompatParcelizer(i, i2);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("itemCount should be always 1  (actual: ");
        sb.append(i3);
        sb.append(")");
        throw new IllegalStateException(sb.toString());
    }

    public final void IconCompatParcelizer(VH vh) {
        int i = vh.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.read != null) {
            RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
            if (iconCompatParcelizer instanceof addKernelInternal) {
                ((addKernelInternal) iconCompatParcelizer).write(vh, i);
            } else {
                iconCompatParcelizer.IconCompatParcelizer(vh);
            }
        }
    }

    public final void write(VH vh, int i) {
        if (this.read != null) {
            RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
            if (iconCompatParcelizer instanceof addKernelInternal) {
                ((addKernelInternal) iconCompatParcelizer).write(vh, i);
            } else {
                iconCompatParcelizer.IconCompatParcelizer(vh);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(VH vh) {
        int i = vh.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.read != null) {
            RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
            if (iconCompatParcelizer instanceof addKernelInternal) {
                ((addKernelInternal) iconCompatParcelizer).mo17991a_(vh, i);
            } else {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(vh);
            }
        }
    }

    /* renamed from: a_ */
    public final void mo17991a_(VH vh, int i) {
        if (this.read != null) {
            RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
            if (iconCompatParcelizer instanceof addKernelInternal) {
                ((addKernelInternal) iconCompatParcelizer).mo17991a_(vh, i);
            } else {
                iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(vh);
            }
        }
    }

    public final void write(VH vh) {
        MediaBrowserCompat$ItemReceiver(vh, vh.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void MediaBrowserCompat$ItemReceiver(VH vh, int i) {
        if (this.read != null) {
            RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer = this.read;
            if (iconCompatParcelizer instanceof addInvokeInternal) {
                ((addInvokeInternal) iconCompatParcelizer).MediaBrowserCompat$ItemReceiver(vh, i);
            } else {
                iconCompatParcelizer.write(vh);
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(C1188xc0532a8d fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver, int i) {
        fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.read = this.read;
        fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.write = i;
    }
}
