package p040o;

import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.domain.errors.RetrofitException;
import p040o.CreditCardParameters;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.HeartBeatInfoStorage */
public final class HeartBeatInfoStorage extends writeUInt64NoTag<CreditCardParameters.CardStyle> {
    public final getKeepAlive IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final MapMaker read;

    /* renamed from: o.HeartBeatInfoStorage$read */
    public static final class read<T> implements DebitCardMarketConductDeepLinkActivity<Throwable> {
        final /* synthetic */ HeartBeatInfoStorage read;

        public read(HeartBeatInfoStorage heartBeatInfoStorage) {
            this.read = heartBeatInfoStorage;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final Throwable th = (Throwable) obj;
            HeartBeatInfoStorage.write(this.read);
            if (writeUInt64NoTag.write(th) || writeUInt64NoTag.MediaBrowserCompat$CustomActionResultReceiver(th)) {
                HeartBeatInfoStorage heartBeatInfoStorage = this.read;
                writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<CreditCardParameters.CardStyle>(this) {
                    private /* synthetic */ read MediaBrowserCompat$CustomActionResultReceiver;

                    {
                        this.MediaBrowserCompat$CustomActionResultReceiver = r1;
                    }

                    public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                        access$2200 MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$CustomActionResultReceiver.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "errorDisplayMapper.transform(throwable)");
                        String str = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
                        onGetStartedClick.IconCompatParcelizer((Object) str, "errorDisplayMapper.transform(throwable).message");
                        ((CreditCardParameters.CardStyle) obj).write(str);
                    }
                };
                if (heartBeatInfoStorage.RatingCompat != null) {
                    r1.IconCompatParcelizer(heartBeatInfoStorage.RatingCompat);
                }
            } else if (writeUInt64NoTag.read(th)) {
                HeartBeatInfoStorage heartBeatInfoStorage2 = this.read;
                heartBeatInfoStorage2.MediaBrowserCompat$ItemReceiver(heartBeatInfoStorage2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(th, access$2300.write.NAVIGATE_BACK));
            } else if (th instanceof EntityMappingException) {
                this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                    private /* synthetic */ read read;

                    {
                        this.read = r1;
                    }

                    public final void run() {
                        HeartBeatInfoStorage heartBeatInfoStorage = this.read.read;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C34384.MediaBrowserCompat$ItemReceiver;
                        if (heartBeatInfoStorage.RatingCompat != null) {
                            iconCompatParcelizer.IconCompatParcelizer(heartBeatInfoStorage.RatingCompat);
                        }
                    }
                }));
            } else if (th instanceof RetrofitException) {
                this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                    private /* synthetic */ read IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r1;
                    }

                    public final void run() {
                        HeartBeatInfoStorage heartBeatInfoStorage = this.IconCompatParcelizer.read;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C34412.write;
                        if (heartBeatInfoStorage.RatingCompat != null) {
                            iconCompatParcelizer.IconCompatParcelizer(heartBeatInfoStorage.RatingCompat);
                        }
                    }
                }));
            } else {
                this.read.MediaBrowserCompat$ItemReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, (Runnable) new Runnable(this) {
                    private /* synthetic */ read IconCompatParcelizer;

                    {
                        this.IconCompatParcelizer = r1;
                    }

                    public final void run() {
                        HeartBeatInfoStorage heartBeatInfoStorage = this.IconCompatParcelizer.read;
                        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C34364.read;
                        if (heartBeatInfoStorage.RatingCompat != null) {
                            iconCompatParcelizer.IconCompatParcelizer(heartBeatInfoStorage.RatingCompat);
                        }
                    }
                }));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public HeartBeatInfoStorage(RegularImmutableBiMap regularImmutableBiMap, getKeepAlive getkeepalive, MapMaker mapMaker) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) getkeepalive, "bScanCCase");
        onGetStartedClick.write((Object) mapMaker, "qrBScanCDisplayMapper");
        this.IconCompatParcelizer = getkeepalive;
        this.read = mapMaker;
    }

    public static final /* synthetic */ void write(HeartBeatInfoStorage heartBeatInfoStorage) {
        if (heartBeatInfoStorage.RatingCompat != null) {
            heartBeatInfoStorage.RatingCompat.aj_();
        }
    }
}
