package p040o;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

/* renamed from: o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder */
public abstract class HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder extends C10402xc503e64f implements loadInBackground<HmlAboutAdapter$HmlAboutViewHolder_ViewBinding> {
    protected Vector write;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public static HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        while (obj != null && !(obj instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) {
            if (obj instanceof HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder) {
                obj = ((HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder) obj).MediaBrowserCompat$MediaItem();
            } else if (obj instanceof byte[]) {
                try {
                    return MediaBrowserCompat$CustomActionResultReceiver(read((byte[]) obj));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to construct sequence from byte[]: ");
                    sb.append(e.getMessage());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                if (obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
                    C10402xc503e64f MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem();
                    if (MediaBrowserCompat$MediaItem instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                        return (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) MediaBrowserCompat$MediaItem;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown object in getInstance: ");
                sb2.append(obj.getClass().getName());
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) obj;
    }

    protected HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder() {
        this.write = new Vector();
    }

    protected HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        Vector vector = new Vector();
        this.write = vector;
        vector.addElement(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    protected HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding) {
        this.write = new Vector();
        for (int i = 0; i != companyItemViewHolder_ViewBinding.write.size(); i++) {
            this.write.addElement((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(i));
        }
    }

    protected HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr) {
        this.write = new Vector();
        for (int i = 0; i != hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr.length; i++) {
            this.write.addElement(hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr[i]);
        }
    }

    public final HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] read() {
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr = new HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[MediaBrowserCompat$ItemReceiver()];
        for (int i = 0; i != MediaBrowserCompat$ItemReceiver(); i++) {
            hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr[i] = read(i);
        }
        return hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr;
    }

    public Enumeration write() {
        return this.write.elements();
    }

    public HmlAboutAdapter$HmlAboutViewHolder_ViewBinding read(int i) {
        return (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) this.write.elementAt(i);
    }

    public int MediaBrowserCompat$ItemReceiver() {
        return this.write.size();
    }

    public int hashCode() {
        Enumeration write2 = write();
        int MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver();
        while (write2.hasMoreElements()) {
            MediaBrowserCompat$ItemReceiver = (MediaBrowserCompat$ItemReceiver * 17) ^ ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement()).hashCode();
        }
        return MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder)) {
            return false;
        }
        HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        if (MediaBrowserCompat$ItemReceiver() != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver()) {
            return false;
        }
        Enumeration write2 = write();
        Enumeration write3 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.write();
        while (write2.hasMoreElements()) {
            C10402xc503e64f MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write2.nextElement()).MediaBrowserCompat$MediaItem();
            C10402xc503e64f MediaBrowserCompat$MediaItem2 = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) write3.nextElement()).MediaBrowserCompat$MediaItem();
            if (MediaBrowserCompat$MediaItem != MediaBrowserCompat$MediaItem2 && !MediaBrowserCompat$MediaItem.equals(MediaBrowserCompat$MediaItem2)) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public C10402xc503e64f RatingCompat() {
        InvestmentDetailsTransactionAdapter$TransactionHolder investmentDetailsTransactionAdapter$TransactionHolder = new InvestmentDetailsTransactionAdapter$TransactionHolder();
        investmentDetailsTransactionAdapter$TransactionHolder.write = this.write;
        return investmentDetailsTransactionAdapter$TransactionHolder;
    }

    /* access modifiers changed from: package-private */
    public C10402xc503e64f MediaDescriptionCompat() {
        DiscoverFundFilterAdapter$SelectListHolder discoverFundFilterAdapter$SelectListHolder = new DiscoverFundFilterAdapter$SelectListHolder();
        discoverFundFilterAdapter$SelectListHolder.write = this.write;
        return discoverFundFilterAdapter$SelectListHolder;
    }

    public String toString() {
        return this.write.toString();
    }

    public Iterator<HmlAboutAdapter$HmlAboutViewHolder_ViewBinding> iterator() {
        return new C10417xf35bd475(read());
    }

    public static HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder write(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding, boolean z) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = null;
        if (z) {
            if (hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.read) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
                }
                return MediaBrowserCompat$CustomActionResultReceiver(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem());
            }
            throw new IllegalArgumentException("object implicit - explicit expected.");
        } else if (!hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.read) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem();
            } else {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
            }
            if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding3 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding3 != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding3.MediaBrowserCompat$MediaItem();
                }
                return (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown object in getInstance: ");
            sb.append(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        } else if (hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding instanceof PolicyCardAdapter$PolicyCardViewHolder) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding4 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding4 != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding4.MediaBrowserCompat$MediaItem();
            }
            return new InsurersAdapter$InsurersViewHolder_ViewBinding((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2);
        } else {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding5 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding5 != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding5.MediaBrowserCompat$MediaItem();
            }
            return new DiscoverFundFilterAdapter$SelectListHolder((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2);
        }
    }
}
