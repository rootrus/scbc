package p040o;

import com.adobe.xmp.XMPException;
import com.adobe.xmp.XMPIterator;
import com.adobe.xmp.XMPMeta;
import com.adobe.xmp.XMPMetaFactory;
import com.adobe.xmp.impl.ByteBuffer;
import com.adobe.xmp.impl.XMPMetaImpl;
import com.adobe.xmp.options.IteratorOptions;
import com.adobe.xmp.properties.XMPPropertyInfo;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Executor;

/* renamed from: o.nScriptIntrinsicCreate */
public final class nScriptIntrinsicCreate implements getCarbonStrip {
    public static final Executor MediaBrowserCompat$ItemReceiver = new C1402x7629c0d5();

    private static String IconCompatParcelizer(getSubElementOffsetBytes getsubelementoffsetbytes) {
        Class<getVectorSize> cls = getVectorSize.class;
        ArrayList<getVectorSize> arrayList = new ArrayList<>();
        for (createFromBitmapResource next : getsubelementoffsetbytes.IconCompatParcelizer) {
            if (cls.isAssignableFrom(next.getClass())) {
                arrayList.add(next);
            }
        }
        for (getVectorSize getvectorsize : arrayList) {
            if (getvectorsize.write == null) {
                getvectorsize.write = new XMPMetaImpl();
            }
            try {
                XMPIterator it = getvectorsize.write.iterator("http://ns.adobe.com/xmp/note/", (String) null, (IteratorOptions) null);
                if (it != null) {
                    while (it.hasNext()) {
                        XMPPropertyInfo xMPPropertyInfo = (XMPPropertyInfo) it.next();
                        if ("xmpNote:HasExtendedXMP".equals(xMPPropertyInfo.getPath())) {
                            return xMPPropertyInfo.getValue();
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            } catch (XMPException unused) {
            }
        }
        return null;
    }

    private static byte[] MediaBrowserCompat$CustomActionResultReceiver(getSubElementOffsetBytes getsubelementoffsetbytes, byte[] bArr, String str, byte[] bArr2) {
        int length = bArr.length;
        if (length >= 75) {
            try {
                copyTo copyto = new copyTo(bArr);
                copyto.write(35);
                if (str.equals(new String(copyto.IconCompatParcelizer(32)))) {
                    int MediaMetadataCompat = (int) copyto.MediaMetadataCompat();
                    int MediaMetadataCompat2 = (int) copyto.MediaMetadataCompat();
                    if (bArr2 == null) {
                        bArr2 = new byte[MediaMetadataCompat];
                    }
                    if (bArr2.length == MediaMetadataCompat) {
                        System.arraycopy(bArr, 75, bArr2, MediaMetadataCompat2, length - 75);
                    } else {
                        getVectorSize getvectorsize = new getVectorSize();
                        getvectorsize.IconCompatParcelizer.add(String.format("Inconsistent length for the Extended XMP buffer: %d instead of %d", new Object[]{Integer.valueOf(MediaMetadataCompat), Integer.valueOf(bArr2.length)}));
                        getsubelementoffsetbytes.IconCompatParcelizer.add(getvectorsize);
                    }
                }
            } catch (IOException e) {
                getVectorSize getvectorsize2 = new getVectorSize();
                getvectorsize2.IconCompatParcelizer.add(e.getMessage());
                getsubelementoffsetbytes.IconCompatParcelizer.add(getvectorsize2);
            }
        }
        return bArr2;
    }

    public static void IconCompatParcelizer(byte[] bArr, int i, getSubElementOffsetBytes getsubelementoffsetbytes) {
        XMPMeta xMPMeta;
        getVectorSize getvectorsize = new getVectorSize();
        try {
            if (i == bArr.length) {
                xMPMeta = XMPMetaFactory.parseFromBuffer(bArr);
            } else {
                xMPMeta = XMPMetaFactory.parse(new ByteBuffer(bArr, 0, i).getByteStream());
            }
            getvectorsize.MediaBrowserCompat$ItemReceiver(xMPMeta);
        } catch (XMPException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error processing XMP data: ");
            sb.append(e.getMessage());
            getvectorsize.IconCompatParcelizer.add(sb.toString());
        }
        if (!getvectorsize.IconCompatParcelizer()) {
            getsubelementoffsetbytes.IconCompatParcelizer.add(getvectorsize);
        }
    }

    public static void write(byte[] bArr, getSubElementOffsetBytes getsubelementoffsetbytes, createFromBitmapResource createfrombitmapresource) {
        IconCompatParcelizer(bArr, bArr.length, getsubelementoffsetbytes);
    }

    public final Iterable<setItemAnimator> MediaBrowserCompat$ItemReceiver() {
        return Collections.singletonList(setItemAnimator.APP1);
    }

    public final void IconCompatParcelizer(Iterable<byte[]> iterable, getSubElementOffsetBytes getsubelementoffsetbytes, setItemAnimator setitemanimator) {
        byte[] bArr = null;
        String str = null;
        for (byte[] next : iterable) {
            if (next.length >= 29 && ("http://ns.adobe.com/xap/1.0/\u0000".equalsIgnoreCase(new String(next, 0, 29)) || "XMP".equalsIgnoreCase(new String(next, 0, 3)))) {
                int length = next.length - 29;
                byte[] bArr2 = new byte[length];
                System.arraycopy(next, 29, bArr2, 0, length);
                IconCompatParcelizer(bArr2, length, getsubelementoffsetbytes);
                str = IconCompatParcelizer(getsubelementoffsetbytes);
            } else if (str != null && next.length >= 35 && "http://ns.adobe.com/xmp/extension/\u0000".equalsIgnoreCase(new String(next, 0, 35))) {
                bArr = MediaBrowserCompat$CustomActionResultReceiver(getsubelementoffsetbytes, next, str, bArr);
            }
        }
        if (bArr != null) {
            IconCompatParcelizer(bArr, bArr.length, getsubelementoffsetbytes);
        }
    }
}
