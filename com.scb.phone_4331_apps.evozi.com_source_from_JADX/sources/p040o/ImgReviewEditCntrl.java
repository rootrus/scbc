package p040o;

import p040o.CheckWorkflowActivity;
import p040o.StandardTable;
import p040o.immediateFailedCheckedFuture;
import p040o.writeUInt64NoTag;

/* renamed from: o.ImgReviewEditCntrl */
public final /* synthetic */ class ImgReviewEditCntrl implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setCropLineStyle IconCompatParcelizer;

    /* renamed from: o.ImgReviewEditCntrl$a */
    public final /* synthetic */ class C3496a implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ populateBinaryImageData MediaBrowserCompat$CustomActionResultReceiver;

        public /* synthetic */ C3496a(populateBinaryImageData populatebinaryimagedata) {
            this.MediaBrowserCompat$CustomActionResultReceiver = populatebinaryimagedata;
        }

        public final void IconCompatParcelizer(Object obj) {
            ((PassportParameters_Factory) obj).read(this.MediaBrowserCompat$CustomActionResultReceiver);
        }
    }

    public /* synthetic */ ImgReviewEditCntrl(setCropLineStyle setcroplinestyle) {
        this.IconCompatParcelizer = setcroplinestyle;
    }

    /* renamed from: o.ImgReviewEditCntrl$Line_Style_Solid */
    public final /* synthetic */ class Line_Style_Solid implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ LevelnessEvent write;

        public /* synthetic */ Line_Style_Solid(LevelnessEvent levelnessEvent) {
            this.write = levelnessEvent;
        }

        public final void IconCompatParcelizer(Object obj) {
            StandardTable.Column.EntrySetIterator entrySetIterator = this.write.read;
            immediateFailedCheckedFuture.read IconCompatParcelizer = immediateFailedCheckedFuture.IconCompatParcelizer();
            IconCompatParcelizer.read = entrySetIterator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deny_consent_dialog_title);
            IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = entrySetIterator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.deny_consent_dialog_description);
            IconCompatParcelizer.IconCompatParcelizer = entrySetIterator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.partner_consent_deny_button);
            IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = entrySetIterator.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.debit_card_terms_alert_negative_button);
            immediateFailedCheckedFuture immediatefailedcheckedfuture = new immediateFailedCheckedFuture(IconCompatParcelizer, (byte) 0);
            onGetStartedClick.IconCompatParcelizer((Object) immediatefailedcheckedfuture, "TermsAndConditionsDispla…                 .build()");
            ((PassportParameters_MembersInjector) obj).write(immediatefailedcheckedfuture);
        }
    }

    public final void IconCompatParcelizer(Object obj) {
        setCropLineStyle setcroplinestyle = this.IconCompatParcelizer;
        CheckWorkflowActivity.C64001 r6 = (CheckWorkflowActivity.C64001) obj;
        if (setcroplinestyle.MediaSessionCompat$Token > getICheckDeserializerRtti.ParcelableVolumeInfo(setcroplinestyle.MediaSessionCompat$ResultReceiverWrapper.f2845x50fd9e4a).doubleValue()) {
            r6.IconCompatParcelizer("Y");
        } else {
            setcroplinestyle.IconCompatParcelizer("N");
        }
    }
}
