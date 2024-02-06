package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.HmlHomeAddressActivity */
public final class HmlHomeAddressActivity extends TypeAdapter implements addKernel {
    private validateDAGRecurse MediaBrowserCompat$ItemReceiver;
    private validateCycle write;

    public HmlHomeAddressActivity(validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.write = validatecycle;
        this.MediaBrowserCompat$ItemReceiver = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.MediaBrowserCompat$ItemReceiver.write(jsonWriter, obj == HmlNTBAdditionalDocumentActivity_ViewBinding.STRING_LIST ? EACTags.DYNAMIC_AUTHENTIFICATION_TEMPLATE : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT ? 364 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.LINKING_OBJECTS ? 36 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY ? 301 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE_LIST ? CipherSuite.TLS_RSA_WITH_AES_256_GCM_SHA384 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN_LIST ? 392 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT_LIST ? 459 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.OBJECT ? 460 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.DATE_LIST ? 537 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN ? 471 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.DATE ? 56 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER_LIST ? 559 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY_LIST ? 434 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.STRING ? 128 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE ? 376 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.LIST ? 41 : obj == HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER ? 485 : -1);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        switch (this.write.IconCompatParcelizer(jsonReader)) {
            case 32:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT_LIST;
            case 58:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.DATE_LIST;
            case 78:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.OBJECT;
            case CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA /*145*/:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE;
            case 151:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER;
            case 205:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.FLOAT;
            case 208:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.STRING_LIST;
            case 226:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.STRING;
            case 249:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN;
            case 320:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY;
            case 363:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.DATE;
            case 436:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.DOUBLE_LIST;
            case 475:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.BOOLEAN_LIST;
            case 501:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.BINARY_LIST;
            case 504:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.LINKING_OBJECTS;
            case 535:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.LIST;
            case 537:
                return HmlNTBAdditionalDocumentActivity_ViewBinding.INTEGER_LIST;
            default:
                return null;
        }
    }
}
