package net.p088sf.scuba.smartcards;

/* renamed from: net.sf.scuba.smartcards.CardServiceException */
public class CardServiceException extends Exception {
    public static final int SW_NONE = -1;
    private static final long serialVersionUID = 4489156194716970879L;

    /* renamed from: sw */
    private int f5464sw = -1;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public CardServiceException(String str) {
        super(str);
    }

    public CardServiceException(String str, int i) {
        super(str);
        this.f5464sw = i;
    }

    public String getMessage() {
        if (this.f5464sw == -1) {
            return super.getMessage();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(super.getMessage());
        sb.append(" (SW = 0x");
        sb.append(Integer.toHexString(this.f5464sw).toUpperCase());
        sb.append(": ");
        sb.append(statusWordToString((short) this.f5464sw));
        sb.append(")");
        return sb.toString();
    }

    public int getSW() {
        return this.f5464sw;
    }

    private static String statusWordToString(short s) {
        switch (s) {
            case -28672:
                return "NO ERROR";
            case 25218:
                return "END OF FILE";
            case 25223:
                return "LESS DATA RESPONDED THAN REQUESTED";
            case 26368:
                return "WRONG LENGTH";
            case 27033:
                return "APPLET SELECT FAILED";
            case 27073:
                return "KEY USAGE ERROR";
            case 27270:
                return "INCORRECT P1P2";
            case 27272:
                return "KEY NOT FOUND";
            case 27392:
                return "WRONG P1P2";
            case 27904:
                return "INS NOT SUPPORTED";
            case 28160:
                return "CLA NOT SUPPORTED";
            case 28416:
                return "UNKNOWN";
            case 28671:
                return "CARD TERMINATED";
            default:
                switch (s) {
                    case 26753:
                        return "LOGICAL CHANNEL NOT SUPPORTED";
                    case 26754:
                        return "SECURE MESSAGING NOT SUPPORTED";
                    case 26755:
                        return "LAST COMMAND EXPECTED";
                    default:
                        switch (s) {
                            case 27010:
                                return "SECURITY STATUS NOT SATISFIED";
                            case 27011:
                                return "FILE INVALID";
                            case 27012:
                                return "DATA INVALID";
                            case 27013:
                                return "CONDITIONS NOT SATISFIED";
                            case 27014:
                                return "COMMAND NOT ALLOWED";
                            case 27015:
                                return "EXPECTED SM DATA OBJECTS MISSING";
                            case 27016:
                                return "SM DATA OBJECTS INCORRECT";
                            default:
                                switch (s) {
                                    case 27264:
                                        return "WRONG DATA or FILEHEADER INCONSISTENT";
                                    case 27265:
                                        return "FUNC NOT SUPPORTED";
                                    case 27266:
                                        return "FILE NOT FOUND";
                                    case 27267:
                                        return "RECORD NOT FOUND";
                                    case 27268:
                                        return "OUT OF MEMORY or FILE FULL";
                                    default:
                                        short s2 = 65280 & s;
                                        if (s2 == 24832) {
                                            StringBuilder sb = new StringBuilder();
                                            sb.append("BYTES REMAINING ");
                                            sb.append(Integer.toString(s & 255));
                                            return sb.toString();
                                        } else if (s2 == 27648) {
                                            StringBuilder sb2 = new StringBuilder();
                                            sb2.append("CORRECT LENGTH ");
                                            sb2.append(Integer.toString(s & 255));
                                            return sb2.toString();
                                        } else if ((65520 & s) != 25536) {
                                            return "Unknown";
                                        } else {
                                            StringBuilder sb3 = new StringBuilder();
                                            sb3.append("NON VOLATILE MEMORY CHANGED COUNT ");
                                            sb3.append(Integer.toString(s & 15));
                                            return sb3.toString();
                                        }
                                }
                        }
                }
        }
    }
}
