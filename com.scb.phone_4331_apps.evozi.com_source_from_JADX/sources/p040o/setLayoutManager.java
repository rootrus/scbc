package p040o;

import com.drew.imaging.png.PngProcessingException;
import com.google.common.base.Ascii;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.zip.InflaterInputStream;
import java.util.zip.ZipException;

/* renamed from: o.setLayoutManager */
public final class setLayoutManager {
    private static Charset IconCompatParcelizer = setViewCacheExtension.IconCompatParcelizer;
    private static Set<setOnScrollListener> MediaBrowserCompat$CustomActionResultReceiver;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(setOnScrollListener.MediaBrowserCompat$ItemReceiver);
        hashSet.add(setOnScrollListener.IconCompatParcelizer);
        hashSet.add(setOnScrollListener.ParcelableVolumeInfo);
        hashSet.add(setOnScrollListener.read);
        hashSet.add(setOnScrollListener.MediaSessionCompat$Token);
        hashSet.add(setOnScrollListener.MediaBrowserCompat$SearchResultReceiver);
        hashSet.add(setOnScrollListener.MediaDescriptionCompat);
        hashSet.add(setOnScrollListener.MediaBrowserCompat$CustomActionResultReceiver);
        hashSet.add(setOnScrollListener.f2636x50fd9e4a);
        hashSet.add(setOnScrollListener.MediaSessionCompat$ResultReceiverWrapper);
        hashSet.add(setOnScrollListener.MediaMetadataCompat);
        hashSet.add(setOnScrollListener.MediaSessionCompat$QueueItem);
        hashSet.add(setOnScrollListener.RatingCompat);
        hashSet.add(setOnScrollListener.MediaBrowserCompat$MediaItem);
        MediaBrowserCompat$CustomActionResultReceiver = Collections.unmodifiableSet(hashSet);
    }

    public static getSubElementOffsetBytes read(InputStream inputStream) throws PngProcessingException, IOException {
        byte[] bArr;
        byte[] bArr2;
        new setOnFlingListener();
        Iterable<getViewLifecycleOwnerLiveData> IconCompatParcelizer2 = setOnFlingListener.IconCompatParcelizer(new copyFromUnchecked(inputStream), MediaBrowserCompat$CustomActionResultReceiver);
        getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
        for (getViewLifecycleOwnerLiveData next : IconCompatParcelizer2) {
            try {
                setOnScrollListener setonscrolllistener = next.MediaBrowserCompat$ItemReceiver;
                byte[] bArr3 = next.write;
                if (setonscrolllistener.equals(setOnScrollListener.MediaBrowserCompat$ItemReceiver)) {
                    C1350xd1aa6b47 getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver = new C1350xd1aa6b47(bArr3);
                    getDataType getdatatype = new getDataType(setOnScrollListener.MediaBrowserCompat$ItemReceiver);
                    getdatatype.IconCompatParcelizer(1, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem));
                    getdatatype.IconCompatParcelizer(2, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.write));
                    getdatatype.IconCompatParcelizer(3, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver));
                    getdatatype.IconCompatParcelizer(4, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer._numericValue));
                    getdatatype.IconCompatParcelizer(5, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.read & 255));
                    getdatatype.IconCompatParcelizer(6, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver));
                    getdatatype.IconCompatParcelizer(7, Integer.valueOf(getviewlifecycleownerlivedata_mediabrowsercompat_customactionresultreceiver.MediaDescriptionCompat));
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype);
                } else if (setonscrolllistener.equals(setOnScrollListener.IconCompatParcelizer)) {
                    getDataType getdatatype2 = new getDataType(setOnScrollListener.IconCompatParcelizer);
                    getdatatype2.IconCompatParcelizer(8, Integer.valueOf(bArr3.length / 3));
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype2);
                } else if (setonscrolllistener.equals(setOnScrollListener.ParcelableVolumeInfo)) {
                    getDataType getdatatype3 = new getDataType(setOnScrollListener.ParcelableVolumeInfo);
                    getdatatype3.IconCompatParcelizer(9, 1);
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype3);
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaSessionCompat$Token)) {
                    byte b = bArr3[0];
                    getDataType getdatatype4 = new getDataType(setOnScrollListener.MediaSessionCompat$Token);
                    getdatatype4.IconCompatParcelizer(10, Integer.valueOf(b));
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype4);
                } else if (setonscrolllistener.equals(setOnScrollListener.read)) {
                    getViewLifecycleOwner getviewlifecycleowner = new getViewLifecycleOwner(bArr3);
                    getDataKind getdatakind = new getDataKind();
                    getdatakind.IconCompatParcelizer(1, Integer.valueOf(getviewlifecycleowner.MediaDescriptionCompat));
                    getdatakind.IconCompatParcelizer(2, Integer.valueOf(getviewlifecycleowner.RatingCompat));
                    getdatakind.IconCompatParcelizer(3, Integer.valueOf(getviewlifecycleowner.IconCompatParcelizer));
                    getdatakind.IconCompatParcelizer(4, Integer.valueOf(getviewlifecycleowner.MediaBrowserCompat$SearchResultReceiver));
                    getdatakind.IconCompatParcelizer(5, Integer.valueOf(getviewlifecycleowner.write));
                    getdatakind.IconCompatParcelizer(6, Integer.valueOf(getviewlifecycleowner.MediaBrowserCompat$ItemReceiver));
                    getdatakind.IconCompatParcelizer(7, Integer.valueOf(getviewlifecycleowner.MediaBrowserCompat$CustomActionResultReceiver));
                    getdatakind.IconCompatParcelizer(8, Integer.valueOf(getviewlifecycleowner.read));
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatakind);
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaBrowserCompat$SearchResultReceiver)) {
                    byte b2 = ((bArr3[0] << Ascii.CAN) & -16777216) | ((bArr3[1] << 16) & 16711680) | ((bArr3[2] << 8) & 65280);
                    new copyTo(bArr3).MediaBrowserCompat$CustomActionResultReceiver();
                    getDataType getdatatype5 = new getDataType(setOnScrollListener.MediaBrowserCompat$SearchResultReceiver);
                    getdatatype5.IconCompatParcelizer(11, Double.valueOf(((double) (b2 | (bArr3[3] & 255))) / 100000.0d));
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype5);
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaDescriptionCompat)) {
                    copyTo copyto = new copyTo(bArr3);
                    byte[] MediaBrowserCompat$ItemReceiver = copyto.MediaBrowserCompat$ItemReceiver(80);
                    getDataType getdatatype6 = new getDataType(setOnScrollListener.MediaDescriptionCompat);
                    getdatatype6.IconCompatParcelizer(12, new createFromBitmap(MediaBrowserCompat$ItemReceiver, IconCompatParcelizer));
                    if (copyto.MediaBrowserCompat$ItemReceiver() == 0) {
                        try {
                            InflaterInputStream inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(copyto.IconCompatParcelizer(bArr3.length - ((MediaBrowserCompat$ItemReceiver.length + 1) + 1))));
                            nAllocationSetSurface.MediaBrowserCompat$CustomActionResultReceiver((C10820Allocation) new copy1DRangeToUnchecked(inflaterInputStream), getsubelementoffsetbytes);
                            inflaterInputStream.close();
                        } catch (ZipException e) {
                            getdatatype6.IconCompatParcelizer.add(String.format("Exception decompressing PNG iCCP chunk : %s", new Object[]{e.getMessage()}));
                            getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype6);
                        }
                    } else {
                        getdatatype6.IconCompatParcelizer.add("Invalid compression method value");
                    }
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype6);
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaBrowserCompat$CustomActionResultReceiver)) {
                    getDataType getdatatype7 = new getDataType(setOnScrollListener.MediaBrowserCompat$CustomActionResultReceiver);
                    getdatatype7.MediaBrowserCompat$ItemReceiver(15, bArr3);
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype7);
                } else if (setonscrolllistener.equals(setOnScrollListener.f2636x50fd9e4a)) {
                    copyTo copyto2 = new copyTo(bArr3);
                    createFromBitmap MediaBrowserCompat$ItemReceiver2 = copyto2.MediaBrowserCompat$ItemReceiver(80, IconCompatParcelizer);
                    String obj = MediaBrowserCompat$ItemReceiver2.toString();
                    createFromBitmap MediaBrowserCompat$ItemReceiver3 = copyto2.MediaBrowserCompat$ItemReceiver(bArr3.length - (MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver.length + 1), IconCompatParcelizer);
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new C1390x230a8146(obj, MediaBrowserCompat$ItemReceiver3));
                    getDataType getdatatype8 = new getDataType(setOnScrollListener.f2636x50fd9e4a);
                    getdatatype8.IconCompatParcelizer(13, arrayList);
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype8);
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaSessionCompat$ResultReceiverWrapper)) {
                    copyTo copyto3 = new copyTo(bArr3);
                    createFromBitmap MediaBrowserCompat$ItemReceiver4 = copyto3.MediaBrowserCompat$ItemReceiver(80, IconCompatParcelizer);
                    String obj2 = MediaBrowserCompat$ItemReceiver4.toString();
                    byte MediaBrowserCompat$ItemReceiver5 = copyto3.MediaBrowserCompat$ItemReceiver();
                    int length = bArr3.length - ((MediaBrowserCompat$ItemReceiver4.MediaBrowserCompat$ItemReceiver.length + 1) + 1);
                    if (MediaBrowserCompat$ItemReceiver5 == 0) {
                        try {
                            bArr2 = getChildFragmentManager.IconCompatParcelizer((InputStream) new InflaterInputStream(new ByteArrayInputStream(bArr3, bArr3.length - length, length)));
                        } catch (ZipException e2) {
                            getDataType getdatatype9 = new getDataType(setOnScrollListener.MediaSessionCompat$ResultReceiverWrapper);
                            getdatatype9.IconCompatParcelizer.add(String.format("Exception decompressing PNG zTXt chunk with keyword \"%s\": %s", new Object[]{obj2, e2.getMessage()}));
                            getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype9);
                        }
                    } else {
                        getDataType getdatatype10 = new getDataType(setOnScrollListener.MediaSessionCompat$ResultReceiverWrapper);
                        getdatatype10.IconCompatParcelizer.add("Invalid compression method value");
                        getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype10);
                        bArr2 = null;
                    }
                    if (bArr2 != null) {
                        if (obj2.equals("XML:com.adobe.xmp")) {
                            new nScriptIntrinsicCreate();
                            nScriptIntrinsicCreate.write(bArr2, getsubelementoffsetbytes, (createFromBitmapResource) null);
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(new C1390x230a8146(obj2, new createFromBitmap(bArr2, IconCompatParcelizer)));
                            getDataType getdatatype11 = new getDataType(setOnScrollListener.MediaSessionCompat$ResultReceiverWrapper);
                            getdatatype11.IconCompatParcelizer(13, arrayList2);
                            getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype11);
                        }
                    }
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaMetadataCompat)) {
                    copyTo copyto4 = new copyTo(bArr3);
                    createFromBitmap MediaBrowserCompat$ItemReceiver6 = copyto4.MediaBrowserCompat$ItemReceiver(80, IconCompatParcelizer);
                    String obj3 = MediaBrowserCompat$ItemReceiver6.toString();
                    byte MediaBrowserCompat$ItemReceiver7 = copyto4.MediaBrowserCompat$ItemReceiver();
                    byte MediaBrowserCompat$ItemReceiver8 = copyto4.MediaBrowserCompat$ItemReceiver();
                    int length2 = bArr3.length - (((((((MediaBrowserCompat$ItemReceiver6.MediaBrowserCompat$ItemReceiver.length + 1) + 1) + 1) + copyto4.MediaBrowserCompat$ItemReceiver(bArr3.length).length) + 1) + copyto4.MediaBrowserCompat$ItemReceiver(bArr3.length).length) + 1);
                    if (MediaBrowserCompat$ItemReceiver7 == 0) {
                        bArr = copyto4.MediaBrowserCompat$ItemReceiver(length2);
                    } else {
                        if (MediaBrowserCompat$ItemReceiver7 != 1) {
                            getDataType getdatatype12 = new getDataType(setOnScrollListener.MediaMetadataCompat);
                            getdatatype12.IconCompatParcelizer.add("Invalid compression flag value");
                            getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype12);
                        } else if (MediaBrowserCompat$ItemReceiver8 == 0) {
                            try {
                                bArr = getChildFragmentManager.IconCompatParcelizer((InputStream) new InflaterInputStream(new ByteArrayInputStream(bArr3, bArr3.length - length2, length2)));
                            } catch (ZipException e3) {
                                getDataType getdatatype13 = new getDataType(setOnScrollListener.MediaMetadataCompat);
                                getdatatype13.IconCompatParcelizer.add(String.format("Exception decompressing PNG iTXt chunk with keyword \"%s\": %s", new Object[]{obj3, e3.getMessage()}));
                                getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype13);
                            }
                        } else {
                            getDataType getdatatype14 = new getDataType(setOnScrollListener.MediaMetadataCompat);
                            getdatatype14.IconCompatParcelizer.add("Invalid compression method value");
                            getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype14);
                        }
                        bArr = null;
                    }
                    if (bArr != null) {
                        if (obj3.equals("XML:com.adobe.xmp")) {
                            new nScriptIntrinsicCreate();
                            nScriptIntrinsicCreate.write(bArr, getsubelementoffsetbytes, (createFromBitmapResource) null);
                        } else {
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(new C1390x230a8146(obj3, new createFromBitmap(bArr, IconCompatParcelizer)));
                            getDataType getdatatype15 = new getDataType(setOnScrollListener.MediaMetadataCompat);
                            getdatatype15.IconCompatParcelizer(13, arrayList3);
                            getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype15);
                        }
                    }
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaSessionCompat$QueueItem)) {
                    copyTo copyto5 = new copyTo(bArr3);
                    int RatingCompat = copyto5.RatingCompat();
                    short MediaBrowserCompat$ItemReceiver9 = (short) (copyto5.MediaBrowserCompat$ItemReceiver() & 255);
                    short MediaBrowserCompat$ItemReceiver10 = (short) (copyto5.MediaBrowserCompat$ItemReceiver() & 255);
                    short MediaBrowserCompat$ItemReceiver11 = (short) (copyto5.MediaBrowserCompat$ItemReceiver() & 255);
                    short MediaBrowserCompat$ItemReceiver12 = (short) (copyto5.MediaBrowserCompat$ItemReceiver() & 255);
                    short MediaBrowserCompat$ItemReceiver13 = (short) (copyto5.MediaBrowserCompat$ItemReceiver() & 255);
                    getDataType getdatatype16 = new getDataType(setOnScrollListener.MediaSessionCompat$QueueItem);
                    if (!setRecyclerListener.write(RatingCompat, MediaBrowserCompat$ItemReceiver9 - 1, MediaBrowserCompat$ItemReceiver10) || !setRecyclerListener.read(MediaBrowserCompat$ItemReceiver11, MediaBrowserCompat$ItemReceiver12, MediaBrowserCompat$ItemReceiver13)) {
                        getdatatype16.IconCompatParcelizer.add(String.format("PNG tIME data describes an invalid date/time: year=%d month=%d day=%d hour=%d minute=%d second=%d", new Object[]{Integer.valueOf(RatingCompat), Integer.valueOf(MediaBrowserCompat$ItemReceiver9), Integer.valueOf(MediaBrowserCompat$ItemReceiver10), Integer.valueOf(MediaBrowserCompat$ItemReceiver11), Integer.valueOf(MediaBrowserCompat$ItemReceiver12), Integer.valueOf(MediaBrowserCompat$ItemReceiver13)}));
                    } else {
                        String format = String.format("%04d:%02d:%02d %02d:%02d:%02d", new Object[]{Integer.valueOf(RatingCompat), Integer.valueOf(MediaBrowserCompat$ItemReceiver9), Integer.valueOf(MediaBrowserCompat$ItemReceiver10), Integer.valueOf(MediaBrowserCompat$ItemReceiver11), Integer.valueOf(MediaBrowserCompat$ItemReceiver12), Integer.valueOf(MediaBrowserCompat$ItemReceiver13)});
                        if (format != null) {
                            getdatatype16.IconCompatParcelizer(14, format);
                        } else {
                            throw new NullPointerException("cannot set a null String");
                        }
                    }
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype16);
                } else if (setonscrolllistener.equals(setOnScrollListener.RatingCompat)) {
                    copyTo copyto6 = new copyTo(bArr3);
                    int MediaBrowserCompat$CustomActionResultReceiver2 = copyto6.MediaBrowserCompat$CustomActionResultReceiver();
                    int MediaBrowserCompat$CustomActionResultReceiver3 = copyto6.MediaBrowserCompat$CustomActionResultReceiver();
                    byte MediaBrowserCompat$ItemReceiver14 = copyto6.MediaBrowserCompat$ItemReceiver();
                    getDataType getdatatype17 = new getDataType(setOnScrollListener.RatingCompat);
                    getdatatype17.IconCompatParcelizer(16, Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver2));
                    getdatatype17.IconCompatParcelizer(17, Integer.valueOf(MediaBrowserCompat$CustomActionResultReceiver3));
                    getdatatype17.IconCompatParcelizer(18, Integer.valueOf(MediaBrowserCompat$ItemReceiver14));
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype17);
                } else if (setonscrolllistener.equals(setOnScrollListener.MediaBrowserCompat$MediaItem)) {
                    getDataType getdatatype18 = new getDataType(setOnScrollListener.MediaBrowserCompat$MediaItem);
                    getdatatype18.MediaBrowserCompat$ItemReceiver(19, bArr3);
                    getsubelementoffsetbytes.IconCompatParcelizer.add(getdatatype18);
                }
            } catch (Exception e4) {
                e4.printStackTrace(System.err);
            }
        }
        return getsubelementoffsetbytes;
    }
}
