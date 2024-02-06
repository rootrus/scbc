package p040o;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: o.HelpAdapter$MoreOptionsHolder_ViewBinding */
public final class HelpAdapter$MoreOptionsHolder_ViewBinding extends C10402xc503e64f {
    private byte[] IconCompatParcelizer;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    HelpAdapter$MoreOptionsHolder_ViewBinding(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    public final String read() {
        String read = MoneyActionAdapter$CustomViewHolder.read(this.IconCompatParcelizer);
        if (read.charAt(read.length() - 1) == 'Z') {
            StringBuilder sb = new StringBuilder();
            sb.append(read.substring(0, read.length() - 1));
            sb.append("GMT+00:00");
            return sb.toString();
        }
        int length = read.length() - 5;
        char charAt = read.charAt(length);
        if (charAt == '-' || charAt == '+') {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(read.substring(0, length));
            sb2.append("GMT");
            int i = length + 3;
            sb2.append(read.substring(length, i));
            sb2.append(":");
            sb2.append(read.substring(i));
            return sb2.toString();
        }
        int length2 = read.length() - 3;
        char charAt2 = read.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(read.substring(0, length2));
            sb3.append("GMT");
            sb3.append(read.substring(length2));
            sb3.append(":00");
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(read);
        sb4.append(write());
        return sb4.toString();
    }

    private String write() {
        String str;
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i = rawOffset / 3600000;
        int i2 = (rawOffset - (((i * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime() && timeZone.inDaylightTime(MediaBrowserCompat$ItemReceiver())) {
                i += str.equals("+") ? 1 : -1;
            }
        } catch (ParseException unused) {
        }
        StringBuilder sb = new StringBuilder();
        sb.append("GMT");
        sb.append(str);
        sb.append(IconCompatParcelizer(i));
        sb.append(":");
        sb.append(IconCompatParcelizer(i2));
        return sb.toString();
    }

    private static String IconCompatParcelizer(int i) {
        if (i >= 10) {
            return Integer.toString(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("0");
        sb.append(i);
        return sb.toString();
    }

    public final Date MediaBrowserCompat$ItemReceiver() throws ParseException {
        SimpleDateFormat simpleDateFormat;
        SimpleDateFormat simpleDateFormat2;
        SimpleDateFormat simpleDateFormat3;
        String read = MoneyActionAdapter$CustomViewHolder.read(this.IconCompatParcelizer);
        if (read.endsWith("Z")) {
            if (MediaMetadataCompat()) {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'");
            } else {
                simpleDateFormat = new SimpleDateFormat("yyyyMMddHHmmss'Z'");
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (read.indexOf(45) > 0 || read.indexOf(43) > 0) {
            read = read();
            if (MediaMetadataCompat()) {
                simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmss.SSSz");
            } else {
                simpleDateFormat2 = new SimpleDateFormat("yyyyMMddHHmmssz");
            }
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else {
            if (MediaMetadataCompat()) {
                simpleDateFormat3 = new SimpleDateFormat("yyyyMMddHHmmss.SSS");
            } else {
                simpleDateFormat3 = new SimpleDateFormat("yyyyMMddHHmmss");
            }
            simpleDateFormat = simpleDateFormat3;
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (MediaMetadataCompat()) {
            String substring = read.substring(14);
            int i = 1;
            while (i < substring.length() && '0' <= (r7 = substring.charAt(i)) && r7 <= '9') {
                i++;
            }
            int i2 = i - 1;
            if (i2 > 3) {
                StringBuilder sb = new StringBuilder();
                sb.append(substring.substring(0, 4));
                sb.append(substring.substring(i));
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(read.substring(0, 14));
                sb2.append(obj);
                read = sb2.toString();
            } else if (i2 == 1) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(substring.substring(0, i));
                sb3.append("00");
                sb3.append(substring.substring(i));
                String obj2 = sb3.toString();
                StringBuilder sb4 = new StringBuilder();
                sb4.append(read.substring(0, 14));
                sb4.append(obj2);
                read = sb4.toString();
            } else if (i2 == 2) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(substring.substring(0, i));
                sb5.append("0");
                sb5.append(substring.substring(i));
                String obj3 = sb5.toString();
                StringBuilder sb6 = new StringBuilder();
                sb6.append(read.substring(0, 14));
                sb6.append(obj3);
                read = sb6.toString();
            }
        }
        return simpleDateFormat.parse(read);
    }

    private boolean MediaMetadataCompat() {
        int i = 0;
        while (true) {
            byte[] bArr = this.IconCompatParcelizer;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        int length = this.IconCompatParcelizer.length;
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(length) + 1 + length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        byte[] bArr = this.IconCompatParcelizer;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(24);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(bArr.length);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read.write(bArr);
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HelpAdapter$MoreOptionsHolder_ViewBinding)) {
            return false;
        }
        return C6958xd50139e8.write(this.IconCompatParcelizer, ((HelpAdapter$MoreOptionsHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).IconCompatParcelizer);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.IconCompatParcelizer);
    }
}
