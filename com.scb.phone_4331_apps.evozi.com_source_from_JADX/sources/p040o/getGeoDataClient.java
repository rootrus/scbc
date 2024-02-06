package p040o;

import okhttp3.internal.cache.DiskLruCache;
import org.jnbis.internal.NistHelper;

/* renamed from: o.getGeoDataClient */
public enum getGeoDataClient {
    BILLER,
    BILLERTOPUP,
    BILLERPAYMENT,
    BILLERSCAN,
    FAVOURITE,
    GROUP,
    WEBVIEWTILE,
    CONTACTUS,
    DONATION,
    QUICKPROMPTPAY,
    QUICKBALANCE,
    ACCOUNT_SUMMARY,
    MANAGE_SCB_PROMPTPAY,
    CHANGE_TRANSFER_LIMIT,
    REQUEST_MONEY,
    CARDLESS_ATM,
    TOP_UP,
    TRANSFER,
    BILL_PAYMENT,
    FIND_US,
    INVESTMENT_TILE,
    FUNCTION,
    APPLICATION,
    PROMTPAY_QR,
    TILES,
    GIFTING,
    SCB_ONE,
    IMAGE,
    NTB_MUTUAL_FUND,
    NTB_SCB_ONE,
    OPEN_SCB_ACCOUNT,
    NTB_INTRODUCTION,
    OPEN_SCB_ACCOUNT_ETB,
    TILE_CATEGORY,
    CARD_TILE_VERTICAL,
    CARD_TILE_HORIZONTAL,
    WEBVIEW_PARTNER,
    MAE_MANEE_SHOP,
    SCBS_INVESTMENT,
    OPEN_ACCOUNT_BY_PASSPORT_EKYC,
    OPEN_ACCOUNT_BY_NATIONAL_ID_NDID,
    OPEN_ACCOUNT_BY_BRANCH,
    OPEN_ACCOUNT_BY_TOUCH_POINT,
    HML_LANDING,
    DEEPLINK,
    REQUEST_TO_ADD_JURISTIC_ACCOUNT,
    DOCUMENT_FORMS,
    GO_TO_PERSONAL,
    SME_SERVICES,
    OPENACCOUNT_NTB,
    FRIENDS_GET_FRIENDS,
    ON_BOARD_ACTIVATE,
    ROBO_ADVISOR;
    
    private static getGeoDataClient[] allValues;

    static {
        allValues = values();
    }

    public static getGeoDataClient IconCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != 1602) {
            if (hashCode != 1605) {
                if (hashCode != 1606) {
                    if (hashCode != 1637) {
                        if (hashCode != 1638) {
                            if (hashCode != 1691) {
                                if (hashCode != 1692) {
                                    switch (hashCode) {
                                        case 49:
                                            if (str.equals(DiskLruCache.VERSION_1)) {
                                                c = 0;
                                                break;
                                            }
                                            break;
                                        case 50:
                                            if (str.equals("2")) {
                                                c = 1;
                                                break;
                                            }
                                            break;
                                        case 51:
                                            if (str.equals("3")) {
                                                c = 2;
                                                break;
                                            }
                                            break;
                                        case 52:
                                            if (str.equals("4")) {
                                                c = 3;
                                                break;
                                            }
                                            break;
                                        case 53:
                                            if (str.equals("5")) {
                                                c = 4;
                                                break;
                                            }
                                            break;
                                        case 54:
                                            if (str.equals("6")) {
                                                c = 5;
                                                break;
                                            }
                                            break;
                                        case 55:
                                            if (str.equals("7")) {
                                                c = 6;
                                                break;
                                            }
                                            break;
                                        case 56:
                                            if (str.equals("8")) {
                                                c = 7;
                                                break;
                                            }
                                            break;
                                        case 57:
                                            if (str.equals("9")) {
                                                c = 8;
                                                break;
                                            }
                                            break;
                                        default:
                                            switch (hashCode) {
                                                case 1567:
                                                    if (str.equals("10")) {
                                                        c = 9;
                                                        break;
                                                    }
                                                    break;
                                                case 1568:
                                                    if (str.equals("11")) {
                                                        c = 10;
                                                        break;
                                                    }
                                                    break;
                                                case 1569:
                                                    if (str.equals("12")) {
                                                        c = 11;
                                                        break;
                                                    }
                                                    break;
                                                default:
                                                    switch (hashCode) {
                                                        case 1629:
                                                            if (str.equals("30")) {
                                                                c = 15;
                                                                break;
                                                            }
                                                            break;
                                                        case 1630:
                                                            if (str.equals("31")) {
                                                                c = 16;
                                                                break;
                                                            }
                                                            break;
                                                        case 1631:
                                                            if (str.equals("32")) {
                                                                c = 17;
                                                                break;
                                                            }
                                                            break;
                                                        case 1632:
                                                            if (str.equals("33")) {
                                                                c = 18;
                                                                break;
                                                            }
                                                            break;
                                                        case 1633:
                                                            if (str.equals("34")) {
                                                                c = 19;
                                                                break;
                                                            }
                                                            break;
                                                        case 1634:
                                                            if (str.equals("35")) {
                                                                c = 20;
                                                                break;
                                                            }
                                                            break;
                                                        default:
                                                            switch (hashCode) {
                                                                case 1660:
                                                                    if (str.equals("40")) {
                                                                        c = 23;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1661:
                                                                    if (str.equals("41")) {
                                                                        c = 24;
                                                                        break;
                                                                    }
                                                                    break;
                                                                case 1662:
                                                                    if (str.equals("42")) {
                                                                        c = 25;
                                                                        break;
                                                                    }
                                                                    break;
                                                                default:
                                                                    switch (hashCode) {
                                                                        case 1664:
                                                                            if (str.equals("44")) {
                                                                                c = 26;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1665:
                                                                            if (str.equals("45")) {
                                                                                c = 27;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1666:
                                                                            if (str.equals("46")) {
                                                                                c = NistHelper.SEP_FS;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1667:
                                                                            if (str.equals("47")) {
                                                                                c = 29;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1668:
                                                                            if (str.equals("48")) {
                                                                                c = 30;
                                                                                break;
                                                                            }
                                                                            break;
                                                                        case 1669:
                                                                            if (str.equals("49")) {
                                                                                c = 31;
                                                                                break;
                                                                            }
                                                                            break;
                                                                    }
                                                            }
                                                    }
                                            }
                                    }
                                } else if (str.equals("51")) {
                                    c = '!';
                                }
                            } else if (str.equals("50")) {
                                c = ' ';
                            }
                        } else if (str.equals("39")) {
                            c = 22;
                        }
                    } else if (str.equals("38")) {
                        c = 21;
                    }
                } else if (str.equals("28")) {
                    c = 14;
                }
            } else if (str.equals("27")) {
                c = 13;
            }
        } else if (str.equals("24")) {
            c = 12;
        }
        switch (c) {
            case 0:
                return ACCOUNT_SUMMARY;
            case 1:
                return MANAGE_SCB_PROMPTPAY;
            case 2:
                return CHANGE_TRANSFER_LIMIT;
            case 3:
                return REQUEST_MONEY;
            case 4:
                return CARDLESS_ATM;
            case 5:
                return BILLERSCAN;
            case 6:
                return TOP_UP;
            case 7:
                return TRANSFER;
            case 8:
                return BILL_PAYMENT;
            case 9:
                return DONATION;
            case 10:
                return CONTACTUS;
            case 11:
                return FIND_US;
            case 12:
                return INVESTMENT_TILE;
            case 13:
                return PROMTPAY_QR;
            case 14:
                return GIFTING;
            case 15:
                return SCB_ONE;
            case 16:
                return NTB_MUTUAL_FUND;
            case 17:
                return NTB_SCB_ONE;
            case 18:
                return OPEN_SCB_ACCOUNT;
            case 19:
                return NTB_INTRODUCTION;
            case 20:
                return OPEN_SCB_ACCOUNT_ETB;
            case 21:
                return MAE_MANEE_SHOP;
            case 22:
                return SCBS_INVESTMENT;
            case 23:
                return OPEN_ACCOUNT_BY_PASSPORT_EKYC;
            case 24:
                return OPEN_ACCOUNT_BY_NATIONAL_ID_NDID;
            case 25:
                return HML_LANDING;
            case 26:
                return DOCUMENT_FORMS;
            case 27:
                return GO_TO_PERSONAL;
            case 28:
                return REQUEST_TO_ADD_JURISTIC_ACCOUNT;
            case 29:
                return OPEN_ACCOUNT_BY_BRANCH;
            case 30:
                return FRIENDS_GET_FRIENDS;
            case 31:
                return OPEN_ACCOUNT_BY_TOUCH_POINT;
            case ' ':
                return ON_BOARD_ACTIVATE;
            case '!':
                return ROBO_ADVISOR;
            default:
                return null;
        }
    }
}
