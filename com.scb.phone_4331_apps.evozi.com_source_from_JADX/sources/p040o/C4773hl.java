package p040o;

import com.scb.phone.data.network.service.DepositService;
import java.util.List;
import p040o.StandardTable;
import p040o.writeUInt64NoTag;

/* renamed from: o.hl */
public final class C4773hl extends writeUInt64NoTag<C6941xae337a3a> {
    public List<isSimulator> IconCompatParcelizer = HmlNationalIdActivity.IconCompatParcelizer;
    public isSimulator MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Flushables MediaBrowserCompat$SearchResultReceiver;
    public final charactersOf MediaMetadataCompat;
    public final StandardTable.RowMap.EntrySet read;
    public String write = "";

    /* renamed from: o.hl$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<C6941xae337a3a> {
        private /* synthetic */ String IconCompatParcelizer;
        private /* synthetic */ C4773hl write;

        public write(C4773hl hlVar, String str) {
            this.write = hlVar;
            this.IconCompatParcelizer = str;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            C6941xae337a3a localProjectProvider_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver = (C6941xae337a3a) obj;
            localProjectProvider_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.write(C4773hl.write(this.IconCompatParcelizer));
            String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver, "Utilities.formatCardInput(cardNumberInput)");
            localProjectProvider_MembersInjector$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    /* renamed from: o.hl$IconCompatParcelizer */
    public static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<onFinish, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ C4773hl MediaBrowserCompat$CustomActionResultReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public IconCompatParcelizer(C4773hl hlVar) {
            super(1);
            this.MediaBrowserCompat$CustomActionResultReceiver = hlVar;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onFinish onfinish = (onFinish) obj;
            onGetStartedClick.write((Object) onfinish, "response");
            C4773hl.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            Flushables unused = this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver;
            String read = this.MediaBrowserCompat$CustomActionResultReceiver.write;
            onGetStartedClick.write((Object) read, "cardNumber");
            onGetStartedClick.write((Object) onfinish, "domain");
            final setModel setmodel = new setModel(read, onfinish.MediaBrowserCompat$ItemReceiver, onfinish.IconCompatParcelizer, onfinish.read);
            C4773hl hlVar = this.MediaBrowserCompat$CustomActionResultReceiver;
            writeUInt64NoTag.IconCompatParcelizer r0 = new writeUInt64NoTag.IconCompatParcelizer<C6941xae337a3a>() {
                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    ((C6941xae337a3a) obj).MediaBrowserCompat$ItemReceiver(setmodel);
                }
            };
            if (hlVar.RatingCompat != null) {
                r0.IconCompatParcelizer(hlVar.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4773hl(RegularImmutableBiMap regularImmutableBiMap, StandardTable.RowMap.EntrySet entrySet, Flushables flushables, charactersOf charactersof) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) entrySet, "cardDisplayMapper");
        onGetStartedClick.write((Object) flushables, "prepaidActivationDisplayMapper");
        onGetStartedClick.write((Object) charactersof, "controller");
        this.read = entrySet;
        this.MediaBrowserCompat$SearchResultReceiver = flushables;
        this.MediaMetadataCompat = charactersof;
    }

    /* renamed from: o.hl$read */
    public static final class read {
        public DepositService MediaBrowserCompat$CustomActionResultReceiver;

        private read() {
        }

        @HmlPinActivity
        public read(DepositService depositService) {
            this.MediaBrowserCompat$CustomActionResultReceiver = depositService;
        }
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4773hl hlVar) {
        if (hlVar.RatingCompat != null) {
            hlVar.RatingCompat.aj_();
        }
    }

    public static final /* synthetic */ boolean write(String str) {
        if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, " ", "", false).length() == 16) {
            return true;
        }
        return false;
    }
}
