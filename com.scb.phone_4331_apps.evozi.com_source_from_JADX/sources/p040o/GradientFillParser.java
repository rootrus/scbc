package p040o;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.GradientFillParser */
public final class GradientFillParser extends TypeAdapter implements addKernel {
    private validateCycle MediaBrowserCompat$CustomActionResultReceiver;
    private validateDAGRecurse write;

    public GradientFillParser(validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$CustomActionResultReceiver = validatecycle;
        this.write = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.write.write(jsonWriter, obj == parseChars.LOADING ? 341 : obj == parseChars.NTB_SCB_CUSTOMER ? 454 : obj == parseChars.PREDICTIVE_TILE_LOADING ? 532 : obj == parseChars.HEADER ? 486 : obj == parseChars.SPLASH ? 620 : obj == parseChars.GROUP ? 541 : obj == parseChars.LEARN_MORE ? 512 : obj == parseChars.SCB ? 469 : obj == parseChars.BANNER ? 151 : obj == parseChars.STATIC_ERROR ? 338 : obj == parseChars.ADD_SHORTCUT ? 231 : obj == parseChars.STATIC_LOADING ? 234 : obj == parseChars.ERROR ? 439 : obj == parseChars.EMPTY ? 549 : obj == parseChars.SHORTCUT ? 425 : obj == parseChars.STATIC_SHORTCUT ? 419 : obj == parseChars.NTB_PREDICTIVE ? 126 : obj == parseChars.PREDICTIVE ? 89 : -1);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        switch (this.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(jsonReader)) {
            case 64:
                return parseChars.NTB_SCB_CUSTOMER;
            case CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA /*137*/:
                return parseChars.BANNER;
            case 141:
                return parseChars.PREDICTIVE;
            case CipherSuite.TLS_DH_anon_WITH_AES_256_GCM_SHA384 /*167*/:
                return parseChars.STATIC_SHORTCUT;
            case 206:
                return parseChars.LEARN_MORE;
            case 253:
                return parseChars.EMPTY;
            case 311:
                return parseChars.SHORTCUT;
            case 352:
                return parseChars.NTB_PREDICTIVE;
            case 367:
                return parseChars.ADD_SHORTCUT;
            case 413:
                return parseChars.SPLASH;
            case 419:
                return parseChars.PREDICTIVE_TILE_LOADING;
            case 441:
                return parseChars.LOADING;
            case 468:
                return parseChars.GROUP;
            case 495:
                return parseChars.STATIC_LOADING;
            case 512:
                return parseChars.HEADER;
            case 549:
                return parseChars.ERROR;
            case 590:
                return parseChars.STATIC_ERROR;
            case 613:
                return parseChars.SCB;
            default:
                return null;
        }
    }
}
