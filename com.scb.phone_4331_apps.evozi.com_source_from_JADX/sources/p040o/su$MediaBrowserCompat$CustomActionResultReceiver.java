package p040o;

import p040o.C3080xc2f5febc;
import p040o.writeUInt64NoTag;

/* renamed from: o.su$MediaBrowserCompat$CustomActionResultReceiver */
public final class su$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMapOptions> {
    private /* synthetic */ C7476su write;

    /* renamed from: o.su$MediaBrowserCompat$CustomActionResultReceiver$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    /* renamed from: o.su$MediaBrowserCompat$CustomActionResultReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).read();
        }
    }

    /* renamed from: o.su$MediaBrowserCompat$CustomActionResultReceiver$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((getTopLeftCornerWidth$MediaBrowserCompat$ItemReceiver) obj).IconCompatParcelizer();
        }
    }

    public su$MediaBrowserCompat$CustomActionResultReceiver(C7476su suVar) {
        this.write = suVar;
    }

    public final /* synthetic */ void onNext(Object obj) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) obj;
        onGetStartedClick.write((Object) googleMapOptions, "billPaymentHistory");
        C7476su.MediaBrowserCompat$ItemReceiver();
        boolean z = true;
        if (this.write.RatingCompat != null) {
            C3080xc2f5febc.Builder read2 = this.write.IconCompatParcelizer.read(googleMapOptions);
            if (read2.write != 0) {
                if (this.write.MediaDescriptionCompat > 0) {
                    C7476su suVar = this.write;
                    writeUInt64NoTag.IconCompatParcelizer su_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver = new C7478x5e6d218b(read2);
                    if (suVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        su_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_itemreceiver.IconCompatParcelizer(suVar.RatingCompat);
                    }
                } else {
                    C7476su suVar2 = this.write;
                    writeUInt64NoTag.IconCompatParcelizer su_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_customactionresultreceiver = new C7477x81c2e9bc(read2);
                    if (suVar2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        su_mediabrowsercompat_customactionresultreceiver_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(suVar2.RatingCompat);
                    }
                }
                C7476su suVar3 = this.write;
                suVar3.MediaDescriptionCompat = suVar3.MediaDescriptionCompat + read2.MediaBrowserCompat$ItemReceiver.size();
            } else if (this.write.MediaDescriptionCompat == 0) {
                C7476su suVar4 = this.write;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
                if (suVar4.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(suVar4.RatingCompat);
                }
            } else {
                C7476su suVar5 = this.write;
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = write.MediaBrowserCompat$ItemReceiver;
                if (suVar5.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(suVar5.RatingCompat);
                }
            }
        }
    }

    public final void onComplete() {
        C7476su.MediaBrowserCompat$CustomActionResultReceiver(this.write);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        boolean z = true;
        if ((this.write.RatingCompat != null) && !this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            C7476su.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            C7476su suVar = this.write;
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = read.MediaBrowserCompat$CustomActionResultReceiver;
            if (suVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(suVar.RatingCompat);
            }
        }
    }
}
