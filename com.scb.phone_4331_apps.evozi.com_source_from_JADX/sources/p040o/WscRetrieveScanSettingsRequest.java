package p040o;

import p040o.getMicrAmount;
import p040o.injectKtaCheckDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.WscRetrieveScanSettingsRequest */
public final /* synthetic */ class WscRetrieveScanSettingsRequest implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getDocumentNote IconCompatParcelizer;

    /* renamed from: o.WscRetrieveScanSettingsRequest$FIELD_INDEXES */
    public final /* synthetic */ class FIELD_INDEXES implements writeUInt64NoTag.IconCompatParcelizer {
        public static final /* synthetic */ FIELD_INDEXES read = new FIELD_INDEXES();

        private /* synthetic */ FIELD_INDEXES() {
        }

        public final void IconCompatParcelizer(Object obj) {
            ((injectKtaCheckDeserializer.read) obj).write();
        }
    }

    public /* synthetic */ WscRetrieveScanSettingsRequest(getDocumentNote getdocumentnote) {
        this.IconCompatParcelizer = getdocumentnote;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.IconCompatParcelizer) obj).read(this.IconCompatParcelizer.IconCompatParcelizer.MediaMetadataCompat);
    }
}
