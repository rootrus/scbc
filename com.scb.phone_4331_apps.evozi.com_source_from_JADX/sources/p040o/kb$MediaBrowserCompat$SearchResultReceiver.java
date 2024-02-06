package p040o;

import android.content.DialogInterface;
import p040o.C10100p;
import p040o.access$2300;
import p040o.getCarbonStrip;
import p040o.writeUInt64NoTag;

/* renamed from: o.kb$MediaBrowserCompat$SearchResultReceiver */
public final class kb$MediaBrowserCompat$SearchResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<animateCameraWithDurationAndCallback> {
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    private final animateCameraWithCallback MediaBrowserCompat$ItemReceiver;
    private final Interner read;
    private /* synthetic */ C4895kb write;

    public final /* synthetic */ void onNext(Object obj) {
        animateCameraWithDurationAndCallback animatecamerawithdurationandcallback = (animateCameraWithDurationAndCallback) obj;
        C4895kb kbVar = this.write;
        C4848jF jFVar = C4848jF.write;
        boolean z = true;
        if (kbVar.RatingCompat != null) {
            jFVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
        setUuidFromUtf8Bytes write2 = this.write.PlaybackStateCompat$CustomAction.write(this.MediaBrowserCompat$ItemReceiver, this.read, animatecamerawithdurationandcallback, this.IconCompatParcelizer, (String) null, this.write.f2883x50fd9e4a.IconCompatParcelizer.setItemInvoker(), this.MediaBrowserCompat$CustomActionResultReceiver);
        write2.MediaMetadataCompat("PURCHASE_TRANSFER_FUNCTION");
        if (animatecamerawithdurationandcallback.MediaBrowserCompat$SearchResultReceiver) {
            C4895kb kbVar2 = this.write;
            C10100p.C101024 r2 = new writeUInt64NoTag.IconCompatParcelizer(write2) {
                private final /* synthetic */ setUuidFromUtf8Bytes IconCompatParcelizer;

                {
                    this.IconCompatParcelizer = r2;
                }

                public final void IconCompatParcelizer(Object obj) {
                    ((getCarbonStrip.IconCompatParcelizer) obj).read(animateCameraWithDurationAndCallback.this.f2799x50fd9e4a, animateCameraWithDurationAndCallback.this.RatingCompat, new DialogInterface.OnClickListener(this.IconCompatParcelizer) {
                        private final /* synthetic */ setUuidFromUtf8Bytes read;

                        {
                            this.read = r2;
                        }

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            getCarbonStrip.IconCompatParcelizer.this.read(this.read, IGoogleMapDelegate.PROMPTPAY);
                        }
                    });
                }
            };
            if (kbVar2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                r2.IconCompatParcelizer(kbVar2.RatingCompat);
                return;
            }
            return;
        }
        C4895kb kbVar3 = this.write;
        C10100p.C101036 r1 = new writeUInt64NoTag.IconCompatParcelizer() {
            public final void IconCompatParcelizer(Object obj) {
                ((getCarbonStrip.IconCompatParcelizer) obj).read(setUuidFromUtf8Bytes.this, IGoogleMapDelegate.PROMPTPAY);
            }
        };
        if (kbVar3.RatingCompat == null) {
            z = false;
        }
        if (z) {
            r1.IconCompatParcelizer(kbVar3.RatingCompat);
        }
    }

    public kb$MediaBrowserCompat$SearchResultReceiver(C4895kb kbVar, animateCameraWithCallback animatecamerawithcallback, Interner interner, String str, String str2) {
        this.write = kbVar;
        this.MediaBrowserCompat$ItemReceiver = animatecamerawithcallback;
        this.IconCompatParcelizer = str;
        this.read = interner;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
    }

    public final void onComplete() {
        C4895kb kbVar = this.write;
        C4848jF jFVar = C4848jF.write;
        if (kbVar.RatingCompat != null) {
            jFVar.IconCompatParcelizer(kbVar.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        C4895kb kbVar = this.write;
        kbVar.MediaBrowserCompat$ItemReceiver(kbVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
