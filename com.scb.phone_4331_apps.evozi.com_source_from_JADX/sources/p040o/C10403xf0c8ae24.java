package p040o;

import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import org.bouncycastle.asn1.ASN1Encoding;

/* renamed from: o.HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding */
public abstract class C10403xf0c8ae24 extends C10402xc503e64f implements loadInBackground<HmlAboutAdapter$HmlAboutViewHolder_ViewBinding> {
    public Vector IconCompatParcelizer;
    private boolean read;

    /* access modifiers changed from: package-private */
    public abstract void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return true;
    }

    public static C10403xf0c8ae24 write(Object obj) {
        while (obj != null && !(obj instanceof C10403xf0c8ae24)) {
            if (obj instanceof HmlDocumentsUploadedAdapter$GroupTitleViewHolder) {
                obj = ((HmlDocumentsUploadedAdapter$GroupTitleViewHolder) obj).MediaBrowserCompat$MediaItem();
            } else if (obj instanceof byte[]) {
                try {
                    return write((Object) C10402xc503e64f.read((byte[]) obj));
                } catch (IOException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("failed to construct set from byte[]: ");
                    sb.append(e.getMessage());
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                if (obj instanceof HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
                    C10402xc503e64f MediaBrowserCompat$MediaItem = ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) obj).MediaBrowserCompat$MediaItem();
                    if (MediaBrowserCompat$MediaItem instanceof C10403xf0c8ae24) {
                        return (C10403xf0c8ae24) MediaBrowserCompat$MediaItem;
                    }
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unknown object in getInstance: ");
                sb2.append(obj.getClass().getName());
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return (C10403xf0c8ae24) obj;
    }

    protected C10403xf0c8ae24() {
        this.IconCompatParcelizer = new Vector();
        this.read = false;
    }

    protected C10403xf0c8ae24(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        Vector vector = new Vector();
        this.IconCompatParcelizer = vector;
        this.read = false;
        vector.addElement(hmlAboutAdapter$HmlAboutViewHolder_ViewBinding);
    }

    protected C10403xf0c8ae24(CompanyItemViewHolder_ViewBinding companyItemViewHolder_ViewBinding, boolean z) {
        this.IconCompatParcelizer = new Vector();
        this.read = false;
        for (int i = 0; i != companyItemViewHolder_ViewBinding.write.size(); i++) {
            this.IconCompatParcelizer.addElement((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) companyItemViewHolder_ViewBinding.write.elementAt(i));
        }
        if (z) {
            read();
        }
    }

    protected C10403xf0c8ae24(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr, boolean z) {
        this.IconCompatParcelizer = new Vector();
        this.read = false;
        for (int i = 0; i != hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr.length; i++) {
            this.IconCompatParcelizer.addElement(hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr[i]);
        }
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f RatingCompat() {
        if (this.read) {
            BasicAssetAllocationAdapter$BaaHolder_ViewBinding basicAssetAllocationAdapter$BaaHolder_ViewBinding = new BasicAssetAllocationAdapter$BaaHolder_ViewBinding();
            basicAssetAllocationAdapter$BaaHolder_ViewBinding.IconCompatParcelizer = this.IconCompatParcelizer;
            return basicAssetAllocationAdapter$BaaHolder_ViewBinding;
        }
        Vector vector = new Vector();
        for (int i = 0; i != this.IconCompatParcelizer.size(); i++) {
            vector.addElement(this.IconCompatParcelizer.elementAt(i));
        }
        BasicAssetAllocationAdapter$BaaHolder_ViewBinding basicAssetAllocationAdapter$BaaHolder_ViewBinding2 = new BasicAssetAllocationAdapter$BaaHolder_ViewBinding();
        basicAssetAllocationAdapter$BaaHolder_ViewBinding2.IconCompatParcelizer = vector;
        basicAssetAllocationAdapter$BaaHolder_ViewBinding2.read();
        return basicAssetAllocationAdapter$BaaHolder_ViewBinding2;
    }

    /* access modifiers changed from: package-private */
    public final C10402xc503e64f MediaDescriptionCompat() {
        DiscoverFundFilterAdapter$SubTitleHolder discoverFundFilterAdapter$SubTitleHolder = new DiscoverFundFilterAdapter$SubTitleHolder();
        discoverFundFilterAdapter$SubTitleHolder.IconCompatParcelizer = this.IconCompatParcelizer;
        return discoverFundFilterAdapter$SubTitleHolder;
    }

    /* access modifiers changed from: package-private */
    public final boolean write(C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding) {
        if (!(hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10403xf0c8ae24)) {
            return false;
        }
        C10403xf0c8ae24 hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding = (C10403xf0c8ae24) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        if (this.IconCompatParcelizer.size() != hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding.IconCompatParcelizer.size()) {
            return false;
        }
        Enumeration elements = this.IconCompatParcelizer.elements();
        Enumeration elements2 = hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder_ViewBinding.IconCompatParcelizer.elements();
        while (elements.hasMoreElements()) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement();
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding == null) {
                hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = InvestmentDetailsClientListAdapter$NoFundViewHolder.write;
            }
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements2.nextElement();
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 == null) {
                hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = InvestmentDetailsClientListAdapter$NoFundViewHolder.write;
            }
            C10402xc503e64f MediaBrowserCompat$MediaItem = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
            C10402xc503e64f MediaBrowserCompat$MediaItem2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem();
            if (MediaBrowserCompat$MediaItem != MediaBrowserCompat$MediaItem2 && !MediaBrowserCompat$MediaItem.equals(MediaBrowserCompat$MediaItem2)) {
                return false;
            }
        }
        return true;
    }

    private static byte[] IconCompatParcelizer(HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding) {
        try {
            return hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem().write(ASN1Encoding.DER);
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0051, code lost:
        if ((r5[r10] & 255) < (r7[r10] & 255)) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0053, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0055, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r9 == r5.length) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        if (r9 == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        r5 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        r2 = r13.IconCompatParcelizer.elementAt(r6);
        r4 = r13.IconCompatParcelizer;
        r4.setElementAt(r4.elementAt(r8), r6);
        r13.IconCompatParcelizer.setElementAt(r2, r8);
        r4 = true;
        r2 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0078, code lost:
        r6 = r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void read() {
        /*
            r13 = this;
            boolean r0 = r13.read
            if (r0 != 0) goto L_0x007d
            r0 = 1
            r13.read = r0
            java.util.Vector r1 = r13.IconCompatParcelizer
            int r1 = r1.size()
            if (r1 <= r0) goto L_0x007d
            java.util.Vector r1 = r13.IconCompatParcelizer
            int r1 = r1.size()
            int r1 = r1 - r0
            r2 = r0
        L_0x0017:
            if (r2 == 0) goto L_0x007d
            java.util.Vector r2 = r13.IconCompatParcelizer
            r3 = 0
            java.lang.Object r2 = r2.elementAt(r3)
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r2 = (p040o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) r2
            byte[] r2 = IconCompatParcelizer((p040o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) r2)
            r5 = r2
            r2 = r3
            r4 = r2
            r6 = r4
        L_0x002a:
            if (r6 == r1) goto L_0x007a
            java.util.Vector r7 = r13.IconCompatParcelizer
            int r8 = r6 + 1
            java.lang.Object r7 = r7.elementAt(r8)
            o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding r7 = (p040o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) r7
            byte[] r7 = IconCompatParcelizer((p040o.HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) r7)
            int r9 = r5.length
            int r10 = r7.length
            int r9 = java.lang.Math.min(r9, r10)
            r10 = r3
        L_0x0041:
            if (r10 == r9) goto L_0x005a
            byte r11 = r5[r10]
            byte r12 = r7[r10]
            if (r11 == r12) goto L_0x0057
            byte r9 = r5[r10]
            r9 = r9 & 255(0xff, float:3.57E-43)
            byte r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            if (r9 >= r10) goto L_0x0055
        L_0x0053:
            r9 = r0
            goto L_0x005e
        L_0x0055:
            r9 = r3
            goto L_0x005e
        L_0x0057:
            int r10 = r10 + 1
            goto L_0x0041
        L_0x005a:
            int r10 = r5.length
            if (r9 != r10) goto L_0x0055
            goto L_0x0053
        L_0x005e:
            if (r9 == 0) goto L_0x0062
            r5 = r7
            goto L_0x0078
        L_0x0062:
            java.util.Vector r2 = r13.IconCompatParcelizer
            java.lang.Object r2 = r2.elementAt(r6)
            java.util.Vector r4 = r13.IconCompatParcelizer
            java.lang.Object r7 = r4.elementAt(r8)
            r4.setElementAt(r7, r6)
            java.util.Vector r4 = r13.IconCompatParcelizer
            r4.setElementAt(r2, r8)
            r4 = r0
            r2 = r6
        L_0x0078:
            r6 = r8
            goto L_0x002a
        L_0x007a:
            r1 = r2
            r2 = r4
            goto L_0x0017
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.C10403xf0c8ae24.read():void");
    }

    public String toString() {
        return this.IconCompatParcelizer.toString();
    }

    public Iterator<HmlAboutAdapter$HmlAboutViewHolder_ViewBinding> iterator() {
        return new C10417xf35bd475(MediaBrowserCompat$ItemReceiver());
    }

    public static C10403xf0c8ae24 read(HmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding) {
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding;
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2;
        C10402xc503e64f hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 = null;
        if (!hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.read) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding.MediaBrowserCompat$MediaItem();
            } else {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding = null;
            }
            if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding instanceof C10403xf0c8ae24) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2 != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding2.MediaBrowserCompat$MediaItem();
                }
                return (C10403xf0c8ae24) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3;
            }
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding3 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding3 != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding3.MediaBrowserCompat$MediaItem();
            } else {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 = null;
            }
            if (hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding2 instanceof HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) {
                HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding4 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
                if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding4 != null) {
                    hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding4.MediaBrowserCompat$MediaItem();
                }
                HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder = (HmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3;
                if (hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding instanceof PolicyCardAdapter$PolicyCardViewHolder) {
                    return new SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read());
                }
                return new DiscoverFundFilterAdapter$SubTitleHolder(hmlDocumentSubmissionAdapter$HmlDocumentItemViewHolder.read());
            }
            StringBuilder sb = new StringBuilder();
            sb.append("unknown object in getInstance: ");
            sb.append(hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.getClass().getName());
            throw new IllegalArgumentException(sb.toString());
        } else if (hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding instanceof PolicyCardAdapter$PolicyCardViewHolder) {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding5 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding5 != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding5.MediaBrowserCompat$MediaItem();
            }
            return new SimulatorTutorialViewPagerAdapter$TutorialItemHolder_ViewBinding((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3);
        } else {
            HmlAboutAdapter$HmlAboutViewHolder_ViewBinding hmlAboutAdapter$HmlAboutViewHolder_ViewBinding6 = hmlDocumentsUploadedAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver;
            if (hmlAboutAdapter$HmlAboutViewHolder_ViewBinding6 != null) {
                hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3 = hmlAboutAdapter$HmlAboutViewHolder_ViewBinding6.MediaBrowserCompat$MediaItem();
            }
            return new DiscoverFundFilterAdapter$SubTitleHolder((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) hmlDocumentSubmissionAdapter$HmlDocumentCategoryViewHolder_ViewBinding3);
        }
    }

    public int hashCode() {
        Enumeration elements = this.IconCompatParcelizer.elements();
        int size = this.IconCompatParcelizer.size();
        while (elements.hasMoreElements()) {
            Object obj = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) elements.nextElement();
            if (obj == null) {
                obj = InvestmentDetailsClientListAdapter$NoFundViewHolder.write;
            }
            size = (size * 17) ^ obj.hashCode();
        }
        return size;
    }

    private HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] MediaBrowserCompat$ItemReceiver() {
        HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[] hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr = new HmlAboutAdapter$HmlAboutViewHolder_ViewBinding[this.IconCompatParcelizer.size()];
        for (int i = 0; i != this.IconCompatParcelizer.size(); i++) {
            hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr[i] = (HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) this.IconCompatParcelizer.elementAt(i);
        }
        return hmlAboutAdapter$HmlAboutViewHolder_ViewBindingArr;
    }
}
