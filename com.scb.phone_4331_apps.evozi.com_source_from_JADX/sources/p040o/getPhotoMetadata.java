package p040o;

import com.google.android.gms.dynamite.descriptors.com.google.android.gms.tagmanager.ModuleDescriptor;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import org.bouncycastle.crypto.tls.CipherSuite;

/* renamed from: o.getPhotoMetadata */
public final class getPhotoMetadata extends TypeAdapter implements addKernel {
    private validateDAGRecurse IconCompatParcelizer;
    private validateCycle MediaBrowserCompat$ItemReceiver;

    public getPhotoMetadata(validateCycle validatecycle, validateDAGRecurse validatedagrecurse) {
        this.MediaBrowserCompat$ItemReceiver = validatecycle;
        this.IconCompatParcelizer = validatedagrecurse;
    }

    public final void write(JsonWriter jsonWriter, Object obj) throws IOException {
        if (obj == null) {
            jsonWriter.nullValue();
        } else {
            this.IconCompatParcelizer.write(jsonWriter, obj == getGeoDataClient.OPEN_ACCOUNT_BY_PASSPORT_EKYC ? 215 : obj == getGeoDataClient.CONTACTUS ? 587 : obj == getGeoDataClient.TILE_CATEGORY ? 567 : obj == getGeoDataClient.PROMTPAY_QR ? 322 : obj == getGeoDataClient.ACCOUNT_SUMMARY ? 619 : obj == getGeoDataClient.IMAGE ? 107 : obj == getGeoDataClient.FIND_US ? 554 : obj == getGeoDataClient.TRANSFER ? 347 : obj == getGeoDataClient.OPEN_ACCOUNT_BY_NATIONAL_ID_NDID ? CipherSuite.TLS_RSA_PSK_WITH_AES_128_CBC_SHA : obj == getGeoDataClient.NTB_INTRODUCTION ? CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA256 : obj == getGeoDataClient.SME_SERVICES ? 38 : obj == getGeoDataClient.DONATION ? 458 : obj == getGeoDataClient.FRIENDS_GET_FRIENDS ? 134 : obj == getGeoDataClient.MANAGE_SCB_PROMPTPAY ? 43 : obj == getGeoDataClient.WEBVIEWTILE ? 353 : obj == getGeoDataClient.GO_TO_PERSONAL ? 280 : obj == getGeoDataClient.TILES ? 23 : obj == getGeoDataClient.FUNCTION ? 603 : obj == getGeoDataClient.OPEN_SCB_ACCOUNT ? 580 : obj == getGeoDataClient.OPEN_SCB_ACCOUNT_ETB ? 622 : obj == getGeoDataClient.CHANGE_TRANSFER_LIMIT ? 225 : obj == getGeoDataClient.SCB_ONE ? 335 : obj == getGeoDataClient.NTB_SCB_ONE ? 396 : obj == getGeoDataClient.REQUEST_TO_ADD_JURISTIC_ACCOUNT ? 379 : obj == getGeoDataClient.TOP_UP ? 287 : obj == getGeoDataClient.BILL_PAYMENT ? 325 : obj == getGeoDataClient.NTB_MUTUAL_FUND ? 516 : obj == getGeoDataClient.ON_BOARD_ACTIVATE ? 615 : obj == getGeoDataClient.BILLER ? 495 : obj == getGeoDataClient.CARD_TILE_HORIZONTAL ? 75 : obj == getGeoDataClient.DEEPLINK ? 618 : obj == getGeoDataClient.QUICKBALANCE ? CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA384 : obj == getGeoDataClient.CARD_TILE_VERTICAL ? 389 : obj == getGeoDataClient.REQUEST_MONEY ? 216 : obj == getGeoDataClient.APPLICATION ? 239 : obj == getGeoDataClient.OPEN_ACCOUNT_BY_TOUCH_POINT ? CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256 : obj == getGeoDataClient.BILLERTOPUP ? 404 : obj == getGeoDataClient.QUICKPROMPTPAY ? 62 : obj == getGeoDataClient.GROUP ? 541 : obj == getGeoDataClient.FAVOURITE ? 534 : obj == getGeoDataClient.OPEN_ACCOUNT_BY_BRANCH ? 237 : obj == getGeoDataClient.ROBO_ADVISOR ? 61 : obj == getGeoDataClient.SCBS_INVESTMENT ? 521 : obj == getGeoDataClient.HML_LANDING ? 33 : obj == getGeoDataClient.WEBVIEW_PARTNER ? 153 : obj == getGeoDataClient.BILLERPAYMENT ? CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256 : obj == getGeoDataClient.CARDLESS_ATM ? 348 : obj == getGeoDataClient.MAE_MANEE_SHOP ? 598 : obj == getGeoDataClient.INVESTMENT_TILE ? 3 : obj == getGeoDataClient.DOCUMENT_FORMS ? 561 : obj == getGeoDataClient.OPENACCOUNT_NTB ? 479 : obj == getGeoDataClient.BILLERSCAN ? 45 : obj == getGeoDataClient.GIFTING ? 304 : -1);
        }
    }

    public final Object read(JsonReader jsonReader) throws IOException {
        switch (this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(jsonReader)) {
            case 8:
                return getGeoDataClient.NTB_INTRODUCTION;
            case 15:
                return getGeoDataClient.CARDLESS_ATM;
            case 22:
                return getGeoDataClient.BILLERSCAN;
            case 29:
                return getGeoDataClient.PROMTPAY_QR;
            case 43:
                return getGeoDataClient.BILLER;
            case 61:
                return getGeoDataClient.GIFTING;
            case 65:
                return getGeoDataClient.WEBVIEWTILE;
            case 73:
                return getGeoDataClient.BILL_PAYMENT;
            case 75:
                return getGeoDataClient.DEEPLINK;
            case 87:
                return getGeoDataClient.CHANGE_TRANSFER_LIMIT;
            case 90:
                return getGeoDataClient.WEBVIEW_PARTNER;
            case 95:
                return getGeoDataClient.OPEN_ACCOUNT_BY_PASSPORT_EKYC;
            case 97:
                return getGeoDataClient.SCBS_INVESTMENT;
            case CipherSuite.TLS_PSK_WITH_RC4_128_SHA /*138*/:
                return getGeoDataClient.OPEN_ACCOUNT_BY_NATIONAL_ID_NDID;
            case CipherSuite.TLS_PSK_WITH_NULL_SHA384 /*177*/:
                return getGeoDataClient.TILES;
            case CipherSuite.TLS_RSA_WITH_CAMELLIA_128_CBC_SHA256 /*186*/:
                return getGeoDataClient.MANAGE_SCB_PROMPTPAY;
            case 198:
                return getGeoDataClient.MAE_MANEE_SHOP;
            case ModuleDescriptor.MODULE_VERSION /*214*/:
                return getGeoDataClient.FUNCTION;
            case 221:
                return getGeoDataClient.TOP_UP;
            case 230:
                return getGeoDataClient.CARD_TILE_VERTICAL;
            case 232:
                return getGeoDataClient.ON_BOARD_ACTIVATE;
            case 239:
                return getGeoDataClient.APPLICATION;
            case 251:
                return getGeoDataClient.BILLERPAYMENT;
            case 269:
                return getGeoDataClient.HML_LANDING;
            case 285:
                return getGeoDataClient.NTB_SCB_ONE;
            case 288:
                return getGeoDataClient.GO_TO_PERSONAL;
            case 294:
                return getGeoDataClient.QUICKPROMPTPAY;
            case 297:
                return getGeoDataClient.TRANSFER;
            case 307:
                return getGeoDataClient.FAVOURITE;
            case 310:
                return getGeoDataClient.TILE_CATEGORY;
            case 315:
                return getGeoDataClient.CARD_TILE_HORIZONTAL;
            case 319:
                return getGeoDataClient.OPEN_ACCOUNT_BY_BRANCH;
            case 339:
                return getGeoDataClient.IMAGE;
            case 343:
                return getGeoDataClient.OPEN_SCB_ACCOUNT;
            case 344:
                return getGeoDataClient.DOCUMENT_FORMS;
            case 357:
                return getGeoDataClient.SCB_ONE;
            case 379:
                return getGeoDataClient.OPEN_ACCOUNT_BY_TOUCH_POINT;
            case 416:
                return getGeoDataClient.ROBO_ADVISOR;
            case 445:
                return getGeoDataClient.INVESTMENT_TILE;
            case 446:
                return getGeoDataClient.SME_SERVICES;
            case 455:
                return getGeoDataClient.QUICKBALANCE;
            case 468:
                return getGeoDataClient.GROUP;
            case 471:
                return getGeoDataClient.ACCOUNT_SUMMARY;
            case 498:
                return getGeoDataClient.FIND_US;
            case 511:
                return getGeoDataClient.FRIENDS_GET_FRIENDS;
            case 524:
                return getGeoDataClient.DONATION;
            case 536:
                return getGeoDataClient.REQUEST_TO_ADD_JURISTIC_ACCOUNT;
            case 556:
                return getGeoDataClient.BILLERTOPUP;
            case 567:
                return getGeoDataClient.OPEN_SCB_ACCOUNT_ETB;
            case 568:
                return getGeoDataClient.CONTACTUS;
            case 596:
                return getGeoDataClient.BILLER;
            case 601:
                return getGeoDataClient.NTB_MUTUAL_FUND;
            case 618:
                return getGeoDataClient.REQUEST_MONEY;
            case 619:
                return getGeoDataClient.OPENACCOUNT_NTB;
            default:
                return null;
        }
    }
}
