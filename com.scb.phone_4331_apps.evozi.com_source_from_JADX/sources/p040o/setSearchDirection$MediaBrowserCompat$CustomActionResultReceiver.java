package p040o;

import p040o.ExecutorUtils;
import p040o.access$2300;
import p040o.writeUInt64NoTag;
import scb.yek.GetKey$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver */
public final class setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<GetKey$MediaBrowserCompat$CustomActionResultReceiver> {
    final /* synthetic */ setSearchDirection IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final String read;
    /* access modifiers changed from: private */
    public final ExecutorUtils.C33371 write;

    /* renamed from: o.setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<newCheckParameters> {
        private /* synthetic */ setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
        private /* synthetic */ GetKey$MediaBrowserCompat$CustomActionResultReceiver read;

        read(setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver setsearchdirection_mediabrowsercompat_customactionresultreceiver, GetKey$MediaBrowserCompat$CustomActionResultReceiver getKey$MediaBrowserCompat$CustomActionResultReceiver) {
            this.IconCompatParcelizer = setsearchdirection_mediabrowsercompat_customactionresultreceiver;
            this.read = getKey$MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str;
            int i;
            newCheckParameters newcheckparameters = (newCheckParameters) obj;
            fromMap write = this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver;
            GetKey$MediaBrowserCompat$CustomActionResultReceiver getKey$MediaBrowserCompat$CustomActionResultReceiver = this.read;
            isBuildIdValid MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer.write.MediaBrowserCompat$CustomActionResultReceiver();
            String read2 = this.IconCompatParcelizer.read;
            checkForPreviousCrash write2 = checkForPreviousCrash.write();
            write2.IconCompatParcelizer = MediaBrowserCompat$CustomActionResultReceiver;
            if (getKey$MediaBrowserCompat$CustomActionResultReceiver.read == null) {
                str = "";
            } else {
                str = write.IconCompatParcelizer("dd MMM yyyy - HH:mm", getKey$MediaBrowserCompat$CustomActionResultReceiver.read);
            }
            write2.read = str;
            write2.MediaBrowserCompat$ItemReceiver = write.MediaBrowserCompat$CustomActionResultReceiver.getString("Y".equals(read2) ? Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark_post : Iterables$3$MediaBrowserCompat$MediaItem.purchase_remark_no_post);
            if (MediaBrowserCompat$CustomActionResultReceiver.setHasDecor == null) {
                i = Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_successful_1;
            } else {
                i = Iterables$3$MediaBrowserCompat$MediaItem.mf_switch_successful_scheduled;
            }
            write2.MediaBrowserCompat$CustomActionResultReceiver = write.MediaBrowserCompat$CustomActionResultReceiver.getString(i);
            onGetStartedClick.IconCompatParcelizer((Object) write2, "switchConfirmationDispla…      statementOfHolding)");
            newcheckparameters.read(write2);
        }
    }

    public setSearchDirection$MediaBrowserCompat$CustomActionResultReceiver(setSearchDirection setsearchdirection, ExecutorUtils.C33371 r3, String str) {
        onGetStartedClick.write((Object) r3, "switchVerificationDisplay");
        onGetStartedClick.write((Object) str, "statementOfHolding");
        this.IconCompatParcelizer = setsearchdirection;
        this.write = r3;
        this.read = str;
    }

    public final /* synthetic */ void onNext(Object obj) {
        GetKey$MediaBrowserCompat$CustomActionResultReceiver getKey$MediaBrowserCompat$CustomActionResultReceiver = (GetKey$MediaBrowserCompat$CustomActionResultReceiver) obj;
        onGetStartedClick.write((Object) getKey$MediaBrowserCompat$CustomActionResultReceiver, "switchConfirmation");
        setSearchDirection.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        setSearchDirection setsearchdirection = this.IconCompatParcelizer;
        writeUInt64NoTag.IconCompatParcelizer read2 = new read(this, getKey$MediaBrowserCompat$CustomActionResultReceiver);
        if (setsearchdirection.RatingCompat != null) {
            read2.IconCompatParcelizer(setsearchdirection.RatingCompat);
        }
    }

    public final void onComplete() {
        setSearchDirection.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        onGetStartedClick.write((Object) th, "exception");
        setSearchDirection.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
        if (!this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }
}
