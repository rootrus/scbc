package p040o;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.LtfSummaryAdapter$ParentViewHolder */
public final class LtfSummaryAdapter$ParentViewHolder {
    public List<UnselectedTileAdapter$Holder> IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public int read;
    public int write;

    public LtfSummaryAdapter$ParentViewHolder() {
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) || (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding instanceof DiscoverFundFilterAdapter$CheckListHolder_ViewBinding)) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append("#");
                sb.append(IconCompatParcelizer(onSelectType.write(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER))));
                stringBuffer.append(sb.toString());
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String MediaMetadataCompat = ((HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) hmlAboutAdapter$HmlAboutViewHolder_ViewBinding).MediaMetadataCompat();
            if (MediaMetadataCompat.length() <= 0 || MediaMetadataCompat.charAt(0) != '#') {
                stringBuffer.append(MediaMetadataCompat);
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\\");
                sb2.append(MediaMetadataCompat);
                stringBuffer.append(sb2.toString());
            }
        }
        int length = stringBuffer.length();
        int i2 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i2 = 0;
        }
        while (i2 != length) {
            if (stringBuffer.charAt(i2) == ',' || stringBuffer.charAt(i2) == '\"' || stringBuffer.charAt(i2) == '\\' || stringBuffer.charAt(i2) == '+' || stringBuffer.charAt(i2) == '=' || stringBuffer.charAt(i2) == '<' || stringBuffer.charAt(i2) == '>' || stringBuffer.charAt(i2) == ';') {
                stringBuffer.insert(i2, "\\");
                i2++;
                length++;
            }
            i2++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= 0 && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }

    private static String IconCompatParcelizer(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return new String(cArr);
    }

    public static String IconCompatParcelizer(String str) {
        String write2 = MoneyActionAdapter$CustomViewHolder.write(str);
        int i = 0;
        if (write2.length() > 0 && write2.charAt(0) == '#') {
            C10402xc503e64f write3 = write(write2);
            if (write3 instanceof HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) {
                write2 = MoneyActionAdapter$CustomViewHolder.write(((HmlDocumentsUploadedAdapter$GroupTitleViewHolder_ViewBinding) write3).MediaMetadataCompat());
            }
        }
        if (write2.length() > 1) {
            while (true) {
                int i2 = i + 1;
                if (i2 < write2.length() && write2.charAt(i) == '\\' && write2.charAt(i2) == ' ') {
                    i += 2;
                } else {
                    int length = write2.length() - 1;
                }
            }
            int length2 = write2.length() - 1;
            while (true) {
                int i3 = length2 - 1;
                if (i3 > 0 && write2.charAt(i3) == '\\' && write2.charAt(length2) == ' ') {
                    length2 -= 2;
                } else if (i > 0 || length2 < write2.length() - 1) {
                    write2 = write2.substring(i, length2 + 1);
                }
            }
            write2 = write2.substring(i, length2 + 1);
        }
        return MediaBrowserCompat$ItemReceiver(write2);
    }

    private static C10402xc503e64f write(String str) {
        try {
            return C10402xc503e64f.read(onSelectType.MediaBrowserCompat$CustomActionResultReceiver(str.substring(1)));
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("unknown encoding in name: ");
            sb.append(e);
            throw new IllegalStateException(sb.toString());
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        if (str.length() != 0) {
            char charAt = str.charAt(0);
            stringBuffer.append(charAt);
            int i = 1;
            while (i < str.length()) {
                char charAt2 = str.charAt(i);
                if (charAt != ' ' || charAt2 != ' ') {
                    stringBuffer.append(charAt2);
                }
                i++;
                charAt = charAt2;
            }
        }
        return stringBuffer.toString();
    }

    public static void read(StringBuffer stringBuffer, DividendSummaryAdapter$ChildViewHolder_ViewBinding dividendSummaryAdapter$ChildViewHolder_ViewBinding, Hashtable hashtable) {
        boolean z = true;
        if (dividendSummaryAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer.IconCompatParcelizer.size() > 1) {
            InvestmentDetailsFundListAdapter$ItemViewHolder[] IconCompatParcelizer2 = dividendSummaryAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer();
            for (int i = 0; i != IconCompatParcelizer2.length; i++) {
                if (z) {
                    z = false;
                } else {
                    stringBuffer.append('+');
                }
                MediaBrowserCompat$CustomActionResultReceiver(stringBuffer, IconCompatParcelizer2[i], hashtable);
            }
        } else if (dividendSummaryAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver() != null) {
            MediaBrowserCompat$CustomActionResultReceiver(stringBuffer, dividendSummaryAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(), hashtable);
        }
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(StringBuffer stringBuffer, InvestmentDetailsFundListAdapter$ItemViewHolder investmentDetailsFundListAdapter$ItemViewHolder, Hashtable hashtable) {
        String str = (String) hashtable.get(investmentDetailsFundListAdapter$ItemViewHolder.IconCompatParcelizer);
        if (str != null) {
            stringBuffer.append(str);
        } else {
            stringBuffer.append(investmentDetailsFundListAdapter$ItemViewHolder.IconCompatParcelizer.write);
        }
        stringBuffer.append('=');
        stringBuffer.append(MediaBrowserCompat$CustomActionResultReceiver(investmentDetailsFundListAdapter$ItemViewHolder.write));
    }

    private static boolean MediaBrowserCompat$ItemReceiver(InvestmentDetailsFundListAdapter$ItemViewHolder investmentDetailsFundListAdapter$ItemViewHolder, InvestmentDetailsFundListAdapter$ItemViewHolder investmentDetailsFundListAdapter$ItemViewHolder2) {
        if (investmentDetailsFundListAdapter$ItemViewHolder == investmentDetailsFundListAdapter$ItemViewHolder2) {
            return true;
        }
        return investmentDetailsFundListAdapter$ItemViewHolder != null && investmentDetailsFundListAdapter$ItemViewHolder2 != null && investmentDetailsFundListAdapter$ItemViewHolder.IconCompatParcelizer.equals(investmentDetailsFundListAdapter$ItemViewHolder2.IconCompatParcelizer) && IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver(investmentDetailsFundListAdapter$ItemViewHolder.write)).equals(IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver(investmentDetailsFundListAdapter$ItemViewHolder2.write)));
    }

    public static boolean MediaBrowserCompat$ItemReceiver(DividendSummaryAdapter$ChildViewHolder_ViewBinding dividendSummaryAdapter$ChildViewHolder_ViewBinding, DividendSummaryAdapter$ChildViewHolder_ViewBinding dividendSummaryAdapter$ChildViewHolder_ViewBinding2) {
        boolean z = true;
        if (dividendSummaryAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer.IconCompatParcelizer.size() > 1) {
            if (!(dividendSummaryAdapter$ChildViewHolder_ViewBinding2.IconCompatParcelizer.IconCompatParcelizer.size() > 1)) {
                return false;
            }
            InvestmentDetailsFundListAdapter$ItemViewHolder[] IconCompatParcelizer2 = dividendSummaryAdapter$ChildViewHolder_ViewBinding.IconCompatParcelizer();
            InvestmentDetailsFundListAdapter$ItemViewHolder[] IconCompatParcelizer3 = dividendSummaryAdapter$ChildViewHolder_ViewBinding2.IconCompatParcelizer();
            if (IconCompatParcelizer2.length != IconCompatParcelizer3.length) {
                return false;
            }
            for (int i = 0; i != IconCompatParcelizer2.length; i++) {
                if (!MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2[i], IconCompatParcelizer3[i])) {
                    return false;
                }
            }
            return true;
        }
        if (dividendSummaryAdapter$ChildViewHolder_ViewBinding2.IconCompatParcelizer.IconCompatParcelizer.size() <= 1) {
            z = false;
        }
        if (!z) {
            return MediaBrowserCompat$ItemReceiver(dividendSummaryAdapter$ChildViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(), dividendSummaryAdapter$ChildViewHolder_ViewBinding2.MediaBrowserCompat$ItemReceiver());
        }
        return false;
    }

    public LtfSummaryAdapter$ParentViewHolder(int i, String str, int i2, List<UnselectedTileAdapter$Holder> list) {
        onGetStartedClick.write((Object) str, "accountName");
        onGetStartedClick.write((Object) list, "subList");
        this.read = i;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = i2;
        this.IconCompatParcelizer = list;
    }
}
