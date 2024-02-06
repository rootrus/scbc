package p040o;

import java.io.IOException;

/* renamed from: o.HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding */
public final class HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding extends C10402xc503e64f {
    private byte[] IconCompatParcelizer;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return false;
    }

    HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding(byte[] bArr) {
        this.IconCompatParcelizer = bArr;
    }

    public final String write() {
        String read = MoneyActionAdapter$CustomViewHolder.read(this.IconCompatParcelizer);
        if (read.indexOf(45) >= 0 || read.indexOf(43) >= 0) {
            int indexOf = read.indexOf(45);
            if (indexOf < 0) {
                indexOf = read.indexOf(43);
            }
            if (indexOf == read.length() - 3) {
                StringBuilder sb = new StringBuilder();
                sb.append(read);
                sb.append("00");
                read = sb.toString();
            }
            if (indexOf == 10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(read.substring(0, 10));
                sb2.append("00GMT");
                sb2.append(read.substring(10, 13));
                sb2.append(":");
                sb2.append(read.substring(13, 15));
                return sb2.toString();
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(read.substring(0, 12));
            sb3.append("GMT");
            sb3.append(read.substring(12, 15));
            sb3.append(":");
            sb3.append(read.substring(15, 17));
            return sb3.toString();
        } else if (read.length() == 11) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(read.substring(0, 10));
            sb4.append("00GMT+00:00");
            return sb4.toString();
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(read.substring(0, 12));
            sb5.append("GMT+00:00");
            return sb5.toString();
        }
    }

    public final String read() {
        String write = write();
        if (write.charAt(0) < '5') {
            StringBuilder sb = new StringBuilder();
            sb.append("20");
            sb.append(write);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("19");
        sb2.append(write);
        return sb2.toString();
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() {
        int length = this.IconCompatParcelizer.length;
        return DiscoverTopListItemRecyclerAdapter$FundViewHolder.write(length) + 1 + length;
    }

    /* access modifiers changed from: package-private */
    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(23);
        int length = this.IconCompatParcelizer.length;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.read(length);
        for (int i = 0; i != length; i++) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(this.IconCompatParcelizer[i]);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding)) {
            return false;
        }
        return C6958xd50139e8.write(this.IconCompatParcelizer, ((HmlOutcomeCounterAdapter$CounterOfferViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding).IconCompatParcelizer);
    }

    public final int hashCode() {
        return C6958xd50139e8.read(this.IconCompatParcelizer);
    }

    public final String toString() {
        return MoneyActionAdapter$CustomViewHolder.read(this.IconCompatParcelizer);
    }
}
