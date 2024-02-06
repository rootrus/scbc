package p040o;

import p040o.LinkedListMultimap;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getErrorMsg */
public final class getErrorMsg extends convertBytesToHex {
    /* access modifiers changed from: private */
    public final readCount IconCompatParcelizer;
    private final LinkedListMultimap.C35711 MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.getErrorMsg$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Throwable, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ getErrorMsg write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(getErrorMsg geterrormsg) {
            super(1);
            this.write = geterrormsg;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Throwable th = (Throwable) obj;
            onGetStartedClick.write((Object) th, "e");
            this.write.MediaBrowserCompat$ItemReceiver(this.write.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.getErrorMsg$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<zzwe, HmlVerifyPhoneValidateOtpActivity> {
        final /* synthetic */ getErrorMsg read;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(getErrorMsg geterrormsg) {
            super(1);
            this.read = geterrormsg;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            final zzwe zzwe = (zzwe) obj;
            onGetStartedClick.write((Object) zzwe, "documents");
            getErrorMsg geterrormsg = this.read;
            writeUInt64NoTag.IconCompatParcelizer r1 = new writeUInt64NoTag.IconCompatParcelizer<IPassportDeserializer>(this) {
                private /* synthetic */ write write;

                {
                    this.write = r1;
                }

                public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                    IPassportDeserializer iPassportDeserializer = (IPassportDeserializer) obj;
                    iPassportDeserializer.aj_();
                    iPassportDeserializer.MediaBrowserCompat$ItemReceiver(this.write.read.IconCompatParcelizer.write(zzwe));
                }
            };
            if (geterrormsg.RatingCompat != null) {
                r1.IconCompatParcelizer(geterrormsg.RatingCompat);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public getErrorMsg(LinkedListMultimap.C35711 r2, RegularImmutableBiMap regularImmutableBiMap, LinkedHashMultiset linkedHashMultiset, readCount readcount) {
        super(regularImmutableBiMap, linkedHashMultiset, readcount);
        onGetStartedClick.write((Object) r2, "controller");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) linkedHashMultiset, "hmlDocumentsController");
        onGetStartedClick.write((Object) readcount, "documentsMapper");
        this.MediaBrowserCompat$ItemReceiver = r2;
        this.IconCompatParcelizer = readcount;
    }

    public final void read(VisibilityAwareImageButton visibilityAwareImageButton, String str) {
        onGetStartedClick.write((Object) visibilityAwareImageButton, "type");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.C35711 r4 = this.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity write2 = new write(this);
        FundFactSheetActivity iconCompatParcelizer = new IconCompatParcelizer(this);
        onGetStartedClick.write((Object) write2, "onSuccess");
        onGetStartedClick.write((Object) iconCompatParcelizer, "onError");
        r4.IconCompatParcelizer.IconCompatParcelizer(write2, iconCompatParcelizer, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), r4.MediaBrowserCompat$ItemReceiver);
    }
}
