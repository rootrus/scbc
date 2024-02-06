package p040o;

import com.kofax.mobile.sdk._internal.impl.extraction.kta.KtaJsonExactionHelper;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import p040o.ILocationSourceDelegate;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.nE$MediaSessionCompat$Token */
public final class nE$MediaSessionCompat$Token implements ActivateChequeDeepLinkActivity<setOnInfoWindowLongClickListener> {
    final /* synthetic */ C5000nE MediaBrowserCompat$CustomActionResultReceiver;

    public final void onSubscribe(BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity) {
        onGetStartedClick.write((Object) bulkTransferDeepLinkActivity, KtaJsonExactionHelper.OBJECT);
    }

    /* renamed from: o.nE$MediaSessionCompat$Token$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getHighestVersionAsync> {
        private /* synthetic */ setOnInfoWindowLongClickListener write;

        read(setOnInfoWindowLongClickListener setoninfowindowlongclicklistener) {
            this.write = setoninfowindowlongclicklistener;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getHighestVersionAsync) obj).MediaBrowserCompat$CustomActionResultReceiver(this.write);
        }
    }

    /* renamed from: o.nE$MediaSessionCompat$Token$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getHighestVersionAsync> {
        private /* synthetic */ nE$MediaSessionCompat$Token IconCompatParcelizer;
        private /* synthetic */ Throwable read;
        private /* synthetic */ ILocationSourceDelegate.zza write;

        write(nE$MediaSessionCompat$Token ne_mediasessioncompat_token, ILocationSourceDelegate.zza zza, Throwable th) {
            this.IconCompatParcelizer = ne_mediasessioncompat_token;
            this.write = zza;
            this.read = th;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            if (r0.equals("3020") != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x002c, code lost:
            if (r0.equals("3019") != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
            if (r0.equals("3018") != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            if (r0.equals("3016") != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
            if (r0.equals("3007") != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
            if (r0.equals("3003") != false) goto L_0x0052;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
            r4.write(r3.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(r3.read, p040o.access$2300.write.JUST_DISMISS));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0065, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
            if (r0.equals("7001") != false) goto L_0x0052;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void IconCompatParcelizer(java.lang.Object r4) {
            /*
                r3 = this;
                o.getHighestVersionAsync r4 = (p040o.getHighestVersionAsync) r4
                o.ILocationSourceDelegate$zza r0 = r3.write
                if (r0 == 0) goto L_0x0009
                java.lang.String r0 = r0.IconCompatParcelizer
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                if (r0 == 0) goto L_0x0066
                int r1 = r0.hashCode()
                switch(r1) {
                    case 1567008: goto L_0x004a;
                    case 1567012: goto L_0x0041;
                    case 1567042: goto L_0x0038;
                    case 1567044: goto L_0x002f;
                    case 1567045: goto L_0x0026;
                    case 1567067: goto L_0x001d;
                    case 1686170: goto L_0x0014;
                    default: goto L_0x0013;
                }
            L_0x0013:
                goto L_0x0066
            L_0x0014:
                java.lang.String r1 = "7001"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
                goto L_0x0052
            L_0x001d:
                java.lang.String r1 = "3020"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
                goto L_0x0052
            L_0x0026:
                java.lang.String r1 = "3019"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
                goto L_0x0052
            L_0x002f:
                java.lang.String r1 = "3018"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
                goto L_0x0052
            L_0x0038:
                java.lang.String r1 = "3016"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
                goto L_0x0052
            L_0x0041:
                java.lang.String r1 = "3007"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
                goto L_0x0052
            L_0x004a:
                java.lang.String r1 = "3003"
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto L_0x0066
            L_0x0052:
                o.nE$MediaSessionCompat$Token r0 = r3.IconCompatParcelizer
                o.nE r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                o.RegularImmutableBiMap r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.Throwable r1 = r3.read
                o.access$2300$write r2 = p040o.access$2300.write.JUST_DISMISS
                o.access$2200 r0 = r0.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (p040o.access$2300.write) r2)
                r4.write((p040o.access$2200) r0)
                return
            L_0x0066:
                o.nE$MediaSessionCompat$Token r0 = r3.IconCompatParcelizer
                o.nE r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.Throwable r1 = r3.read
                boolean r0 = r0.MediaBrowserCompat$SearchResultReceiver(r1)
                if (r0 == 0) goto L_0x0083
                o.nE$MediaSessionCompat$Token r0 = r3.IconCompatParcelizer
                o.nE r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.Throwable r1 = r3.read
                o.nE$MediaSessionCompat$Token$write$4 r2 = new o.nE$MediaSessionCompat$Token$write$4
                r2.<init>(r4)
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2))
                return
            L_0x0083:
                o.nE$MediaSessionCompat$Token r0 = r3.IconCompatParcelizer
                o.nE r0 = r0.MediaBrowserCompat$CustomActionResultReceiver
                java.lang.Throwable r1 = r3.read
                o.nE$MediaSessionCompat$Token$write$1 r2 = new o.nE$MediaSessionCompat$Token$write$1
                r2.<init>(r4)
                java.lang.Runnable r2 = (java.lang.Runnable) r2
                r0.MediaBrowserCompat$ItemReceiver(r0.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver((java.lang.Throwable) r1, (java.lang.Runnable) r2))
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.nE$MediaSessionCompat$Token.write.IconCompatParcelizer(java.lang.Object):void");
        }
    }

    public nE$MediaSessionCompat$Token(C5000nE nEVar) {
        this.MediaBrowserCompat$CustomActionResultReceiver = nEVar;
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        setOnInfoWindowLongClickListener setoninfowindowlongclicklistener = (setOnInfoWindowLongClickListener) obj;
        onGetStartedClick.write((Object) setoninfowindowlongclicklistener, "payNowVerification");
        C5000nE.ParcelableVolumeInfo(this.MediaBrowserCompat$CustomActionResultReceiver);
        C5000nE nEVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        nEVar.MediaSessionCompat$Token = nEVar.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(setoninfowindowlongclicklistener, true);
        if (setoninfowindowlongclicklistener.IconCompatParcelizer) {
            C5000nE nEVar2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer read2 = new read(setoninfowindowlongclicklistener);
            if (nEVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                read2.IconCompatParcelizer(nEVar2.RatingCompat);
                return;
            }
            return;
        }
        C5000nE nEVar3 = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer ne_mediabrowsercompat_searchresultreceiver = new nE$MediaBrowserCompat$SearchResultReceiver(nEVar3);
        if (nEVar3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ne_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(nEVar3.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        C5000nE.ParcelableVolumeInfo(this.MediaBrowserCompat$CustomActionResultReceiver);
        ILocationSourceDelegate.zza MediaBrowserCompat$MediaItem = C5000nE.MediaBrowserCompat$MediaItem(th);
        if (MediaBrowserCompat$MediaItem == null || (th instanceof EntityMappingException)) {
            this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
        C5000nE nEVar = this.MediaBrowserCompat$CustomActionResultReceiver;
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, MediaBrowserCompat$MediaItem, th);
        if (nEVar.RatingCompat != null) {
            write2.IconCompatParcelizer(nEVar.RatingCompat);
        }
    }
}
