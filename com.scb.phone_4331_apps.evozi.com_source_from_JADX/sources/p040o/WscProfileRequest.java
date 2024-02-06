package p040o;

import java.util.ArrayList;
import p040o.getMicrAmount;
import p040o.injectKtaCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.WscProfileRequest */
public final /* synthetic */ class WscProfileRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ WscSubmitRequest MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ checkForPreviousCrash write;

    /* renamed from: o.WscProfileRequest$PROFILE_INDEXES */
    public final /* synthetic */ class PROFILE_INDEXES implements writeUInt64NoTag.IconCompatParcelizer {
        private final /* synthetic */ ArrayList read;

        public /* synthetic */ PROFILE_INDEXES(ArrayList arrayList) {
            this.read = arrayList;
        }

        public final void IconCompatParcelizer(Object obj) {
            getDocumentNote.read(this.read, (getMicrAmount.IconCompatParcelizer) obj);
        }
    }

    public /* synthetic */ WscProfileRequest(WscSubmitRequest wscSubmitRequest, checkForPreviousCrash checkforpreviouscrash) {
        this.MediaBrowserCompat$ItemReceiver = wscSubmitRequest;
        this.write = checkforpreviouscrash;
    }

    public final void IconCompatParcelizer(Object obj) {
        WscSubmitRequest wscSubmitRequest = this.MediaBrowserCompat$ItemReceiver;
        checkForPreviousCrash checkforpreviouscrash = this.write;
        injectKtaCheckDeserializer.read read = (injectKtaCheckDeserializer.read) obj;
        read.MediaBrowserCompat$ItemReceiver();
        read.IconCompatParcelizer();
        read.read();
        read.MediaBrowserCompat$CustomActionResultReceiver();
        read.MediaBrowserCompat$CustomActionResultReceiver(wscSubmitRequest.write.MediaBrowserCompat$ItemReceiver(checkforpreviouscrash.IconCompatParcelizer.setHasDecor));
    }
}
