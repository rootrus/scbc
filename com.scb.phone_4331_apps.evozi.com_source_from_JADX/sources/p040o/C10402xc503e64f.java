package p040o;

import java.io.IOException;

/* renamed from: o.HmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding */
public abstract class C10402xc503e64f extends HmlBanksGridAdapter$HmlBankViewHolder {
    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException;

    /* access modifiers changed from: package-private */
    public abstract boolean IconCompatParcelizer();

    /* access modifiers changed from: package-private */
    public abstract int MediaBrowserCompat$CustomActionResultReceiver() throws IOException;

    public final C10402xc503e64f MediaBrowserCompat$MediaItem() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public C10402xc503e64f MediaDescriptionCompat() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public C10402xc503e64f RatingCompat() {
        return this;
    }

    /* access modifiers changed from: package-private */
    public abstract boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding);

    C10402xc503e64f() {
    }

    public static C10402xc503e64f read(byte[] bArr) throws IOException {
        CompanyItemViewHolder companyItemViewHolder = new CompanyItemViewHolder(bArr);
        try {
            C10402xc503e64f MediaBrowserCompat$ItemReceiver = companyItemViewHolder.MediaBrowserCompat$ItemReceiver();
            if (companyItemViewHolder.available() == 0) {
                return MediaBrowserCompat$ItemReceiver;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) && write(((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem());
    }
}
