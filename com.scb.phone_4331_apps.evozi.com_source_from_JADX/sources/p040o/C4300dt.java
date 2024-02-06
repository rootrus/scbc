package p040o;

import android.os.Build;
import com.scb.phone.domain.interactor.PinCase;
import dagger.Lazy;
import p040o.FinalizableReferenceQueue;
import p040o.MapDifference;
import p040o.printStackTrace;
import p040o.zzmd;

/* renamed from: o.dt */
public abstract class C4300dt extends writeUInt64NoTag<printStackTrace> implements printStackTrace.write, KtaJsonCheck_MembersInjector {
    PinCase IconCompatParcelizer;
    protected final compose MediaBrowserCompat$ItemReceiver;
    private Lazy<RttiJsonCheck_MembersInjector> MediaBrowserCompat$MediaItem;
    private onStopJob MediaBrowserCompat$SearchResultReceiver;
    private snippet MediaDescriptionCompat;
    private MapDifference.ValueDifference MediaMetadataCompat;
    private zzmd.zzm.zzb.zza MediaSessionCompat$ResultReceiverWrapper;
    protected RttiJsonCheck_MembersInjector read;
    protected boolean write = false;

    public final /* synthetic */ void write(printStackTrace printstacktrace) {
        super.MediaBrowserCompat$ItemReceiver(printstacktrace);
    }

    public C4300dt(RegularImmutableBiMap regularImmutableBiMap, PinCase pinCase, compose compose, snippet snippet, MapDifference.ValueDifference valueDifference, onStopJob onstopjob, Lazy<RttiJsonCheck_MembersInjector> lazy) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = pinCase;
        this.MediaBrowserCompat$ItemReceiver = compose;
        this.MediaDescriptionCompat = snippet;
        this.MediaMetadataCompat = valueDifference;
        this.MediaBrowserCompat$MediaItem = lazy;
        this.MediaBrowserCompat$SearchResultReceiver = onstopjob;
    }

    public final void MediaBrowserCompat$MediaItem() {
        C9887db dbVar = C9887db.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            dbVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        boolean z = true;
        if (zzmd.zzm.zzb.zza.JURISTIC == this.MediaSessionCompat$ResultReceiverWrapper) {
            C9886dX dXVar = C9886dX.read;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dXVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C9884dM dMVar = C9884dM.read;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            dMVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write(zzmd.zzm.zzb.zza zza) {
        this.MediaSessionCompat$ResultReceiverWrapper = zza;
        boolean z = true;
        if (this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer.IconCompatParcelizer()) {
            C4266dS dSVar = new C4266dS(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dSVar.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C4274da daVar = new C4274da(this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.AppCompatActivity()));
        if (this.RatingCompat != null) {
            daVar.IconCompatParcelizer(this.RatingCompat);
        }
        compose compose = this.MediaBrowserCompat$ItemReceiver;
        compose.read(compose.IconCompatParcelizer.MediaBrowserCompat$MediaItem().map(FinalizableReferenceQueue.SystemLoader.read), new C4272dZ(this), new C4265dR(this));
        if (zzmd.zzm.zzb.zza.INDIVIDUAL != zza) {
            C4294dp dpVar = C4294dp.write;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dpVar.IconCompatParcelizer(this.RatingCompat);
            }
        } else if (this.IconCompatParcelizer.RatingCompat.MediaBrowserCompat$ItemReceiver() && !this.IconCompatParcelizer.RatingCompat.write()) {
            C4271dY dYVar = new C4271dY(this);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                dYVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
        MediaMetadataCompat();
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(printStackTrace printstacktrace) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write();
        printstacktrace.read();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        C4288dm dmVar = C4288dm.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            dmVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void read() {
        boolean z = true;
        this.write = true;
        C4268dU dUVar = C4268dU.IconCompatParcelizer;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            dUVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write() {
        C4264dQ dQVar = C4264dQ.MediaBrowserCompat$CustomActionResultReceiver;
        if (this.RatingCompat != null) {
            dQVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        C4276dd ddVar = C4276dd.write;
        if (this.RatingCompat != null) {
            ddVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        C4276dd ddVar = C4276dd.write;
        if (this.RatingCompat != null) {
            ddVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void MediaMetadataCompat() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.read = this.MediaBrowserCompat$MediaItem.get();
            C4267dT dTVar = new C4267dT(this);
            if (this.RatingCompat != null) {
                dTVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(printStackTrace printstacktrace) {
        RttiJsonCheck_MembersInjector rttiJsonCheck_MembersInjector;
        if (printstacktrace.IconCompatParcelizer() && (rttiJsonCheck_MembersInjector = this.read) != null && rttiJsonCheck_MembersInjector.write() && this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.setPopupCallback()) {
            this.read.MediaBrowserCompat$ItemReceiver(this);
        }
    }

    public final void RatingCompat() {
        C4269dV dVVar = new C4269dV(this);
        if (this.RatingCompat != null) {
            dVVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final /* synthetic */ void read(printStackTrace printstacktrace) {
        if (printstacktrace.IconCompatParcelizer()) {
            this.read.IconCompatParcelizer();
        }
    }

    public final boolean MediaBrowserCompat$SearchResultReceiver() {
        String MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver();
        return !(MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver.length() == 0);
    }
}
