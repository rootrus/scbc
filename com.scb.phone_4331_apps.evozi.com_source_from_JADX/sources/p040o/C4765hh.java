package p040o;

import p040o.ImmutableBiMap;
import p040o.Joiner;
import p040o.writeUInt32;
import p040o.writeUInt64NoTag;

/* renamed from: o.hh */
public final class C4765hh extends writeUInt32<LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver> {
    private boolean IconCompatParcelizer;
    private final Joiner.C35523 MediaBrowserCompat$MediaItem;
    private String write;

    /* renamed from: o.hh$IconCompatParcelizer */
    static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$MediaItem();
        }
    }

    /* renamed from: o.hh$write */
    static final class write<T> implements DebitCardMarketConductDeepLinkActivity<ImmutableBiMap.SerializedForm> {
        private /* synthetic */ C4765hh IconCompatParcelizer;

        write(C4765hh hhVar) {
            this.IconCompatParcelizer = hhVar;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            final ImmutableBiMap.SerializedForm serializedForm = (ImmutableBiMap.SerializedForm) obj;
            C4765hh.IconCompatParcelizer(this.IconCompatParcelizer);
            C4765hh hhVar = this.IconCompatParcelizer;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((LocalProjectProvider$5$MediaBrowserCompat$ItemReceiver) obj).write(serializedForm);
                }
            };
            if (hhVar.RatingCompat != null) {
                r1.IconCompatParcelizer(hhVar.RatingCompat);
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4765hh(performActionWithResponse performactionwithresponse, RegularImmutableBiMap regularImmutableBiMap, FileBackedOutputStream fileBackedOutputStream, Joiner.C35523 r5) {
        super(performactionwithresponse, regularImmutableBiMap, fileBackedOutputStream);
        onGetStartedClick.write((Object) performactionwithresponse, "validatePinCase");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) fileBackedOutputStream, "pinStrengthMapper");
        onGetStartedClick.write((Object) r5, "prepaidConfirmPinCase");
        this.MediaBrowserCompat$MediaItem = r5;
    }

    public final void write(String str, boolean z) {
        onGetStartedClick.write((Object) str, "cardNumber");
        this.IconCompatParcelizer = z;
        this.write = str;
        super.IconCompatParcelizer();
    }

    public static final /* synthetic */ void IconCompatParcelizer(C4765hh hhVar) {
        if (hhVar.RatingCompat != null) {
            hhVar.RatingCompat.aj_();
        }
    }

    public final void write(String str) {
        DebitCardResetOtpActivity<R> debitCardResetOtpActivity;
        onGetStartedClick.write((Object) str, "newPin");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        Joiner.C35523 r0 = this.MediaBrowserCompat$MediaItem;
        String str2 = this.write;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("cardNumber");
        }
        boolean z = this.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "pin");
        onGetStartedClick.write((Object) str2, "cardNumber");
        if (z) {
            debitCardResetOtpActivity = r0.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver().map(new Joiner$3$MediaBrowserCompat$ItemReceiver(r0, str2)).flatMap(new Joiner.C35523.write(r0, str2)).flatMap(new Joiner$3$MediaBrowserCompat$CustomActionResultReceiver(r0, str));
            onGetStartedClick.IconCompatParcelizer((Object) debitCardResetOtpActivity, "iSprintRepositoryContrac…in, it)\n                }");
        } else {
            debitCardResetOtpActivity = r0.IconCompatParcelizer.write(str2).flatMap(new Joiner.C35523.read(r0, str2, str));
            onGetStartedClick.IconCompatParcelizer((Object) debitCardResetOtpActivity, "iSprintRepositoryContrac…in, it)\n                }");
        }
        r0.read(debitCardResetOtpActivity, new write(this), new hh$MediaBrowserCompat$CustomActionResultReceiver(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        boolean z = true;
        if (this.read == writeUInt32.read.CONFIRM) {
            write();
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.write;
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
    }
}
