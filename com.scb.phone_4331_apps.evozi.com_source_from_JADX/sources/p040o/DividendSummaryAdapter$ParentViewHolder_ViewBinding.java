package p040o;

import java.util.Enumeration;

/* renamed from: o.DividendSummaryAdapter$ParentViewHolder_ViewBinding */
public final class DividendSummaryAdapter$ParentViewHolder_ViewBinding extends HmlBanksGridAdapter$HmlBankViewHolder implements FixedTransferSubDepositAdapter$SubDepositViewHolder {
    private static DividendSummaryAdapter$ParentViewHolder MediaBrowserCompat$ItemReceiver = LtfSummaryAdapter$LtfChildViewHolder.read;
    private DividendSummaryAdapter$ParentViewHolder IconCompatParcelizer;
    public DividendSummaryAdapter$ChildViewHolder_ViewBinding[] MediaBrowserCompat$CustomActionResultReceiver;
    private int read;
    private boolean write;

    private DividendSummaryAdapter$ParentViewHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder dividendSummaryAdapter$ParentViewHolder, DividendSummaryAdapter$ParentViewHolder_ViewBinding dividendSummaryAdapter$ParentViewHolder_ViewBinding) {
        this.MediaBrowserCompat$CustomActionResultReceiver = dividendSummaryAdapter$ParentViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer = dividendSummaryAdapter$ParentViewHolder;
    }

    public static DividendSummaryAdapter$ParentViewHolder_ViewBinding read(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write2 = HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, true);
        if (write2 != null) {
            return new DividendSummaryAdapter$ParentViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(write2));
        }
        return null;
    }

    public static DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        if (obj instanceof DividendSummaryAdapter$ParentViewHolder_ViewBinding) {
            return (DividendSummaryAdapter$ParentViewHolder_ViewBinding) obj;
        }
        if (obj != null) {
            return new DividendSummaryAdapter$ParentViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        return null;
    }

    public static DividendSummaryAdapter$ParentViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(DividendSummaryAdapter$ParentViewHolder dividendSummaryAdapter$ParentViewHolder, Object obj) {
        if (obj instanceof DividendSummaryAdapter$ParentViewHolder_ViewBinding) {
            return new DividendSummaryAdapter$ParentViewHolder_ViewBinding(dividendSummaryAdapter$ParentViewHolder, (DividendSummaryAdapter$ParentViewHolder_ViewBinding) obj);
        }
        if (obj != null) {
            return new DividendSummaryAdapter$ParentViewHolder_ViewBinding(dividendSummaryAdapter$ParentViewHolder, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(obj));
        }
        return null;
    }

    private DividendSummaryAdapter$ParentViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        this(MediaBrowserCompat$ItemReceiver, hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder);
    }

    private DividendSummaryAdapter$ParentViewHolder_ViewBinding(DividendSummaryAdapter$ParentViewHolder dividendSummaryAdapter$ParentViewHolder, HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
        DividendSummaryAdapter$ChildViewHolder_ViewBinding dividendSummaryAdapter$ChildViewHolder_ViewBinding;
        this.IconCompatParcelizer = dividendSummaryAdapter$ParentViewHolder;
        this.MediaBrowserCompat$CustomActionResultReceiver = new DividendSummaryAdapter$ChildViewHolder_ViewBinding[hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver()];
        Enumeration write2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        int i = 0;
        while (write2.hasMoreElements()) {
            DividendSummaryAdapter$ChildViewHolder_ViewBinding[] dividendSummaryAdapter$ChildViewHolder_ViewBindingArr = this.MediaBrowserCompat$CustomActionResultReceiver;
            Object nextElement = write2.nextElement();
            if (nextElement instanceof DividendSummaryAdapter$ChildViewHolder_ViewBinding) {
                dividendSummaryAdapter$ChildViewHolder_ViewBinding = (DividendSummaryAdapter$ChildViewHolder_ViewBinding) nextElement;
            } else {
                dividendSummaryAdapter$ChildViewHolder_ViewBinding = nextElement != null ? new DividendSummaryAdapter$ChildViewHolder_ViewBinding(C10403xf0c8ae24.write(nextElement)) : null;
            }
            dividendSummaryAdapter$ChildViewHolder_ViewBindingArr[i] = dividendSummaryAdapter$ChildViewHolder_ViewBinding;
            i++;
        }
    }

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return new InvestmentDetailsTransactionAdapter$TransactionHolder((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[]) this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        if (this.write) {
            return this.read;
        }
        this.write = true;
        int read2 = this.IconCompatParcelizer.read(this);
        this.read = read2;
        return read2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof DividendSummaryAdapter$ParentViewHolder_ViewBinding) && !(obj instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) {
            return false;
        }
        if (MediaBrowserCompat$MediaItem().equals(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem())) {
            return true;
        }
        try {
            return this.IconCompatParcelizer.write(this, new DividendSummaryAdapter$ParentViewHolder_ViewBinding(HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem())));
        } catch (Exception unused) {
            return false;
        }
    }

    public final String toString() {
        return this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this);
    }
}
