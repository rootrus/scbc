package p040o;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.setContentView;
import com.google.android.gms.common.api.Api;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p040o.ScriptGroup;
import p040o.zzgk;

/* renamed from: o.addReference */
public final class addReference<VH extends RecyclerView.setContentView> extends addConnection<VH> {
    ScriptGroup.C1272IO MediaBrowserCompat$ItemReceiver;
    int MediaBrowserCompat$MediaItem = -1;
    int MediaBrowserCompat$SearchResultReceiver = -1;
    ScriptIntrinsic MediaDescriptionCompat;
    RecyclerView.setContentView MediaMetadataCompat;
    private ScriptIntrinsic3DLUT MediaSessionCompat$ResultReceiverWrapper;
    int MediaSessionCompat$Token;
    zzgk.IconCompatParcelizer RatingCompat;
    boolean write;

    public addReference(ScriptIntrinsic3DLUT scriptIntrinsic3DLUT, RecyclerView.IconCompatParcelizer<VH> iconCompatParcelizer) {
        super(iconCompatParcelizer);
        this.MediaSessionCompat$ResultReceiverWrapper = scriptIntrinsic3DLUT;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        super.MediaBrowserCompat$ItemReceiver();
        this.MediaMetadataCompat = null;
        this.MediaBrowserCompat$ItemReceiver = null;
        this.MediaSessionCompat$ResultReceiverWrapper = null;
    }

    public final VH IconCompatParcelizer(ViewGroup viewGroup, int i) {
        VH IconCompatParcelizer = super.IconCompatParcelizer(viewGroup, i);
        if (IconCompatParcelizer instanceof ScriptGroup.Input) {
            ((ScriptGroup.Input) IconCompatParcelizer).MediaBrowserCompat$CustomActionResultReceiver(-1);
        }
        return IconCompatParcelizer;
    }

    static int MediaBrowserCompat$ItemReceiver(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i3 < 0) {
            return i;
        }
        if (i4 == 0) {
            if (i2 == i3) {
                return i;
            }
            if (i < i2 && i < i3) {
                return i;
            }
            if (i <= i2 || i <= i3) {
                return i3 < i2 ? i == i3 ? i2 : i - 1 : i == i3 ? i2 : i + 1;
            }
            return i;
        } else if (i4 != 1) {
            throw new IllegalStateException("unexpected state");
        } else if (i == i3) {
            return i2;
        } else {
            return i == i2 ? i3 : i;
        }
    }

    public final void read() {
        if (MediaBrowserCompat$MediaItem()) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
            if (scriptIntrinsic3DLUT != null) {
                scriptIntrinsic3DLUT.write(false);
                return;
            }
            return;
        }
        super.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        if (MediaBrowserCompat$MediaItem()) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
            if (scriptIntrinsic3DLUT != null) {
                scriptIntrinsic3DLUT.write(false);
                return;
            }
            return;
        }
        super.MediaBrowserCompat$CustomActionResultReceiver(i, i2);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (MediaBrowserCompat$MediaItem()) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
            if (scriptIntrinsic3DLUT != null) {
                scriptIntrinsic3DLUT.write(false);
                return;
            }
            return;
        }
        super.MediaBrowserCompat$ItemReceiver(i, i2);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(int i, int i2) {
        if (MediaBrowserCompat$MediaItem()) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
            if (scriptIntrinsic3DLUT != null) {
                scriptIntrinsic3DLUT.write(false);
                return;
            }
            return;
        }
        super.MediaBrowserCompat$SearchResultReceiver(i, i2);
    }

    public final void read(int i, int i2, int i3) {
        if (MediaBrowserCompat$MediaItem()) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
            if (scriptIntrinsic3DLUT != null) {
                scriptIntrinsic3DLUT.write(false);
                return;
            }
            return;
        }
        super.read(i, i2, i3);
    }

    private static void MediaBrowserCompat$SearchResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof ScriptGroup.Input) {
            ScriptGroup.Input input = (ScriptGroup.Input) setcontentview;
            int write2 = input.write();
            if (write2 == -1 || ((write2 ^ i) & Api.BaseClientBuilder.API_PRIORITY_OTHER) != 0) {
                i |= PKIFailureInfo.systemUnavail;
            }
            input.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    private boolean MediaBrowserCompat$MediaItem() {
        return (this.RatingCompat != null) && !this.write;
    }

    public final long MediaBrowserCompat$ItemReceiver(int i) {
        if (this.RatingCompat != null) {
            return super.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver(i, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, this.MediaSessionCompat$Token));
        }
        return super.MediaBrowserCompat$ItemReceiver(i);
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.RatingCompat != null) {
            return super.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver(i, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, this.MediaSessionCompat$Token));
        }
        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
    }

    public final void write(VH vh, int i, List<Object> list) {
        boolean z = true;
        if (this.RatingCompat != null) {
            long j = this.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver;
            long j2 = vh.MediaBrowserCompat$ItemReceiver;
            int MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(i, this.MediaBrowserCompat$MediaItem, this.MediaBrowserCompat$SearchResultReceiver, this.MediaSessionCompat$Token);
            int i2 = (j2 > j ? 1 : (j2 == j ? 0 : -1));
            if (i2 == 0 && vh != this.MediaMetadataCompat) {
                Log.i("ARVDraggableWrapper", "a new view holder object for the currently dragging item is assigned");
                this.MediaMetadataCompat = vh;
                ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
                if (scriptIntrinsic3DLUT.MediaSessionCompat$ResultReceiverWrapper != null) {
                    Log.i("ARVDragDropManager", "a view holder object which is bound to currently dragging item is recycled");
                    scriptIntrinsic3DLUT.MediaSessionCompat$ResultReceiverWrapper = null;
                    scriptIntrinsic3DLUT.MediaBrowserCompat$SearchResultReceiver.read();
                }
                scriptIntrinsic3DLUT.MediaSessionCompat$ResultReceiverWrapper = vh;
                scriptIntrinsic3DLUT.MediaBrowserCompat$SearchResultReceiver.write((RecyclerView.setContentView) vh);
            }
            int i3 = i2 == 0 ? 3 : 1;
            ScriptIntrinsic scriptIntrinsic = this.MediaDescriptionCompat;
            if (i < scriptIntrinsic.MediaBrowserCompat$ItemReceiver || i > scriptIntrinsic.MediaBrowserCompat$CustomActionResultReceiver) {
                z = false;
            }
            if (z) {
                i3 |= 4;
            }
            MediaBrowserCompat$SearchResultReceiver((RecyclerView.setContentView) vh, i3);
            super.write(vh, MediaBrowserCompat$ItemReceiver2, list);
            return;
        }
        MediaBrowserCompat$SearchResultReceiver((RecyclerView.setContentView) vh, 0);
        super.write(vh, i, list);
    }

    public final void MediaBrowserCompat$ItemReceiver(VH vh, int i) {
        if (this.RatingCompat != null) {
            ScriptIntrinsic3DLUT scriptIntrinsic3DLUT = this.MediaSessionCompat$ResultReceiverWrapper;
            if (vh == scriptIntrinsic3DLUT.MediaSessionCompat$ResultReceiverWrapper) {
                Log.i("ARVDragDropManager", "a view holder object which is bound to currently dragging item is recycled");
                scriptIntrinsic3DLUT.MediaSessionCompat$ResultReceiverWrapper = null;
                scriptIntrinsic3DLUT.MediaBrowserCompat$SearchResultReceiver.read();
            } else {
                validateGEMV validategemv = scriptIntrinsic3DLUT.setIcon;
                if (validategemv != null && vh == validategemv.read) {
                    validategemv.write((RecyclerView.setContentView) null);
                }
            }
            this.MediaMetadataCompat = this.MediaSessionCompat$ResultReceiverWrapper.MediaSessionCompat$ResultReceiverWrapper;
        }
        super.MediaBrowserCompat$ItemReceiver(vh, i);
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(zzgk.IconCompatParcelizer iconCompatParcelizer, RecyclerView.setContentView setcontentview, ScriptIntrinsic scriptIntrinsic, int i, int i2) {
        if (setcontentview.MediaBrowserCompat$ItemReceiver != -1) {
            ScriptGroup.C1272IO io = (ScriptGroup.C1272IO) AlertController$RecycleListView.read((RecyclerView.IconCompatParcelizer) this, ScriptGroup.C1272IO.class, i);
            this.MediaBrowserCompat$ItemReceiver = io;
            if (io != null) {
                this.MediaBrowserCompat$SearchResultReceiver = i;
                this.MediaBrowserCompat$MediaItem = i;
                this.RatingCompat = iconCompatParcelizer;
                this.MediaMetadataCompat = setcontentview;
                this.MediaDescriptionCompat = scriptIntrinsic;
                this.MediaSessionCompat$Token = i2;
                return;
            }
            throw new IllegalStateException("DraggableItemAdapter not found!");
        }
        throw new IllegalStateException("dragging target must provides valid ID");
    }
}
