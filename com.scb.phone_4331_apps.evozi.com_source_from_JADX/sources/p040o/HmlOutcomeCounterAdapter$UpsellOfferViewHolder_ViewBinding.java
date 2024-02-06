package p040o;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* renamed from: o.HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding */
public final class HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding extends C10905onItemClick {
    C10905onItemClick[] write;

    /* access modifiers changed from: package-private */
    public final boolean IconCompatParcelizer() {
        return true;
    }

    private static byte[] MediaBrowserCompat$CustomActionResultReceiver(C10905onItemClick[] onitemclickArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (i != onitemclickArr.length) {
            try {
                byteArrayOutputStream.write(onitemclickArr[i].write());
                i++;
            } catch (ClassCastException unused) {
                StringBuilder sb = new StringBuilder();
                sb.append(onitemclickArr[i].getClass().getName());
                sb.append(" found in input should only contain DEROctetString");
                throw new IllegalArgumentException(sb.toString());
            } catch (IOException e) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("exception converting octets ");
                sb2.append(e.toString());
                throw new IllegalArgumentException(sb2.toString());
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding(byte[] bArr) {
        super(bArr);
    }

    public HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding(C10905onItemClick[] onitemclickArr) {
        super(MediaBrowserCompat$CustomActionResultReceiver(onitemclickArr));
        this.write = onitemclickArr;
    }

    public final byte[] write() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    /* access modifiers changed from: package-private */
    public final Vector MediaBrowserCompat$SearchResultReceiver() {
        Vector vector = new Vector();
        int i = 0;
        while (i < this.MediaBrowserCompat$ItemReceiver.length) {
            int i2 = i + 1000;
            int length = (i2 > this.MediaBrowserCompat$ItemReceiver.length ? this.MediaBrowserCompat$ItemReceiver.length : i2) - i;
            byte[] bArr = new byte[length];
            System.arraycopy(this.MediaBrowserCompat$ItemReceiver, i, bArr, 0, length);
            vector.addElement(new C10407x3ea8e030(bArr));
            i = i2;
        }
        return vector;
    }

    public final void IconCompatParcelizer(HmlDocumentListAdapter$DocumentViewHolder_ViewBinding hmlDocumentListAdapter$DocumentViewHolder_ViewBinding) throws IOException {
        Enumeration enumeration;
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(36);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(128);
        if (this.write == null) {
            enumeration = MediaBrowserCompat$SearchResultReceiver().elements();
        } else {
            enumeration = new Enumeration() {
                private int IconCompatParcelizer = 0;

                public final boolean hasMoreElements() {
                    return this.IconCompatParcelizer < HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding.this.write.length;
                }

                public final Object nextElement() {
                    C10905onItemClick[] onitemclickArr = HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding.this.write;
                    int i = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = i + 1;
                    return onitemclickArr[i];
                }
            };
        }
        while (enumeration.hasMoreElements()) {
            hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) enumeration.nextElement());
        }
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
        hmlDocumentListAdapter$DocumentViewHolder_ViewBinding.IconCompatParcelizer(0);
    }

    /* access modifiers changed from: package-private */
    public final int MediaBrowserCompat$CustomActionResultReceiver() throws IOException {
        Enumeration enumeration;
        if (this.write == null) {
            enumeration = MediaBrowserCompat$SearchResultReceiver().elements();
        } else {
            enumeration = new Enumeration() {
                private int IconCompatParcelizer = 0;

                public final boolean hasMoreElements() {
                    return this.IconCompatParcelizer < HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding.this.write.length;
                }

                public final Object nextElement() {
                    C10905onItemClick[] onitemclickArr = HmlOutcomeCounterAdapter$UpsellOfferViewHolder_ViewBinding.this.write;
                    int i = this.IconCompatParcelizer;
                    this.IconCompatParcelizer = i + 1;
                    return onitemclickArr[i];
                }
            };
        }
        int i = 0;
        while (enumeration.hasMoreElements()) {
            i += ((HmlAboutAdapter$HmlAboutViewHolder_ViewBinding) enumeration.nextElement()).MediaBrowserCompat$MediaItem().MediaBrowserCompat$CustomActionResultReceiver();
        }
        return i + 2 + 2;
    }
}
