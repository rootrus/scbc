package p040o;

import com.drew.imaging.jpeg.JpegProcessingException;
import com.drew.imaging.tiff.TiffProcessingException;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Set;
import p040o.C10820Allocation;
import p040o.nAllocationSetSurface;

/* renamed from: o.validateIsInt32 */
public final class validateIsInt32 extends ReviewDocumentActivity_ViewBinding {
    public validateIsInt32(getSubElementOffsetBytes getsubelementoffsetbytes) {
        super(getsubelementoffsetbytes);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) throws TiffProcessingException {
        if (i != 42) {
            if (i == 85) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) copy2DRangeFrom.class);
                return;
            } else if (!(i == 20306 || i == 21330)) {
                throw new TiffProcessingException(String.format("Unexpected TIFF marker: 0x%X", new Object[]{Integer.valueOf(i)}));
            }
        }
        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) typeFromBitmap.class);
    }

    public final boolean IconCompatParcelizer(int i) {
        if (i == 330) {
            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) validateIsInt16.class);
            return true;
        }
        if ((this.MediaBrowserCompat$ItemReceiver instanceof typeFromBitmap) || (this.MediaBrowserCompat$ItemReceiver instanceof copy2DRangeFrom)) {
            if (i == 34665) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) validateIsInt16.class);
                return true;
            } else if (i == 34853) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) validateIsInt8.class);
                return true;
            }
        }
        if ((this.MediaBrowserCompat$ItemReceiver instanceof validateIsInt16) && i == 40965) {
            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) validateIsFloat32.class);
            return true;
        } else if (!(this.MediaBrowserCompat$ItemReceiver instanceof Byte3)) {
            return false;
        } else {
            if (i == 8208) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) setID.class);
                return true;
            } else if (i == 8224) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) getNObj.class);
                return true;
            } else if (i == 8256) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Double4.class);
                return true;
            } else if (i == 8272) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Double2.class);
                return true;
            } else if (i == 12288) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) F64.class);
                return true;
            } else if (i == 16384) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Byte3.class);
                return true;
            } else if (i == 8240) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) A_8.class);
                return true;
            } else if (i != 8241) {
                return false;
            } else {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) BOOLEAN.class);
                return true;
            }
        }
    }

    public final boolean IconCompatParcelizer() {
        if ((this.MediaBrowserCompat$ItemReceiver instanceof typeFromBitmap) || (this.MediaBrowserCompat$ItemReceiver instanceof validate3DRange)) {
            if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.containsKey(297)) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) validate3DRange.class);
            } else {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) validateBitmapSize.class);
            }
            return true;
        } else if (this.MediaBrowserCompat$ItemReceiver instanceof validateBitmapSize) {
            return true;
        } else {
            return false;
        }
    }

    public final Long MediaBrowserCompat$ItemReceiver(int i, long j) {
        if (i == 13) {
            return Long.valueOf(j << 2);
        }
        return i == 0 ? 0L : null;
    }

    public final boolean write(int i, Set<Integer> set, int i2, C10820Allocation allocation, int i3, int i4) throws IOException {
        Boolean bool;
        int i5 = i;
        Set<Integer> set2 = set;
        int i6 = i2;
        C10820Allocation allocation2 = allocation;
        int i7 = i3;
        int i8 = i4;
        Boolean bool2 = Boolean.FALSE;
        if (i7 == 0) {
            if (this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.containsKey(Integer.valueOf(i3))) {
                return false;
            }
            if (i8 == 0) {
                return true;
            }
        }
        if (i7 == 37500 && (this.MediaBrowserCompat$ItemReceiver instanceof validateIsInt16)) {
            return MediaBrowserCompat$ItemReceiver(i, set, i2, allocation);
        }
        if (i7 != 33723 || !(this.MediaBrowserCompat$ItemReceiver instanceof typeFromBitmap)) {
            if (i7 != 700 || !(this.MediaBrowserCompat$ItemReceiver instanceof typeFromBitmap)) {
                createFromBitmapResource createfrombitmapresource = this.MediaBrowserCompat$ItemReceiver;
                Boolean bool3 = Boolean.TRUE;
                if (i7 != 50341 && (i7 != 3584 || (!(createfrombitmapresource instanceof ioReceive) && !(createfrombitmapresource instanceof setAutoPadding) && !(createfrombitmapresource instanceof C10820Allocation.C11351) && !(createfrombitmapresource instanceof Byte3) && !(createfrombitmapresource instanceof F32_4) && !(createfrombitmapresource instanceof F32_3) && !(createfrombitmapresource instanceof I32_2) && !(createfrombitmapresource instanceof I32_3) && !(createfrombitmapresource instanceof I32_4)))) {
                    bool3 = Boolean.FALSE;
                }
                if (bool3.booleanValue()) {
                    copy2DRangeToUnchecked copy2drangetounchecked = new copy2DRangeToUnchecked();
                    this.write.IconCompatParcelizer.add(copy2drangetounchecked);
                    if (i8 == 0) {
                        copy2drangetounchecked.IconCompatParcelizer.add("Empty PrintIM data");
                    } else if (i8 <= 15) {
                        copy2drangetounchecked.IconCompatParcelizer.add("Bad PrintIM data");
                    } else {
                        String str = new String(allocation2.MediaBrowserCompat$ItemReceiver(i, 12), setViewCacheExtension.write.name());
                        if (!str.startsWith("PrintIM")) {
                            copy2drangetounchecked.IconCompatParcelizer.add("Invalid PrintIM header");
                        } else {
                            int i9 = i5 + 14;
                            int MediaSessionCompat$ResultReceiverWrapper = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9);
                            if (i8 < (MediaSessionCompat$ResultReceiverWrapper * 6) + 16) {
                                Boolean valueOf = Boolean.valueOf(allocation2.MediaBrowserCompat$CustomActionResultReceiver);
                                allocation2.MediaBrowserCompat$CustomActionResultReceiver = !allocation2.MediaBrowserCompat$CustomActionResultReceiver;
                                int MediaSessionCompat$ResultReceiverWrapper2 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9);
                                if (i8 < (MediaSessionCompat$ResultReceiverWrapper2 * 6) + 16) {
                                    copy2drangetounchecked.IconCompatParcelizer.add("Bad PrintIM size");
                                } else {
                                    Boolean bool4 = valueOf;
                                    MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper2;
                                    bool = bool4;
                                }
                            } else {
                                bool = null;
                            }
                            copy2drangetounchecked.IconCompatParcelizer(0, str.substring(8, 12));
                            for (int i10 = 0; i10 < MediaSessionCompat$ResultReceiverWrapper; i10++) {
                                int i11 = i5 + 16 + (i10 * 6);
                                copy2drangetounchecked.IconCompatParcelizer(allocation2.MediaSessionCompat$ResultReceiverWrapper(i11), Long.valueOf(allocation2.mo15721x50fd9e4a(i11 + 2)));
                            }
                            if (bool != null) {
                                allocation2.MediaBrowserCompat$CustomActionResultReceiver = bool.booleanValue();
                            }
                        }
                    }
                    return true;
                }
                if (this.MediaBrowserCompat$ItemReceiver instanceof Byte3) {
                    if (i7 == 8208) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) setID.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 8224) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) getNObj.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 8256) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Double4.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 8272) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Double2.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 12288) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) F64.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 16384) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Byte3.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 8240) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) A_8.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    } else if (i7 == 8241) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) BOOLEAN.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i, i6);
                        return true;
                    }
                }
                if (this.MediaBrowserCompat$ItemReceiver instanceof copy2DRangeFrom) {
                    if (i7 == 19) {
                        destroy destroy = new destroy();
                        this.write.IconCompatParcelizer.add(destroy);
                        MediaBrowserCompat$ItemReceiver(destroy, i, allocation, i4, bool2, 2);
                        return true;
                    } else if (i7 == 39) {
                        copy2DRangeFromUnchecked copy2drangefromunchecked = new copy2DRangeFromUnchecked();
                        this.write.IconCompatParcelizer.add(copy2drangefromunchecked);
                        MediaBrowserCompat$ItemReceiver(copy2drangefromunchecked, i, allocation, i4, bool2, 3);
                        return true;
                    } else if (i7 == 281) {
                        validateIsObject validateisobject = new validateIsObject();
                        this.write.IconCompatParcelizer.add(validateisobject);
                        MediaBrowserCompat$ItemReceiver(validateisobject, i, allocation, i4, Boolean.TRUE, 1);
                        return true;
                    }
                }
                if (i7 == 46 && (this.MediaBrowserCompat$ItemReceiver instanceof copy2DRangeFrom)) {
                    try {
                        for (createFromBitmapResource add : setHasFixedSize.MediaBrowserCompat$ItemReceiver(new ByteArrayInputStream(allocation2.MediaBrowserCompat$ItemReceiver(i, i8))).IconCompatParcelizer) {
                            this.write.IconCompatParcelizer.add(add);
                        }
                        return true;
                    } catch (JpegProcessingException e) {
                        createFromBitmapResource createfrombitmapresource2 = this.MediaBrowserCompat$ItemReceiver;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Error processing JpgFromRaw: ");
                        sb.append(e.getMessage());
                        createfrombitmapresource2.IconCompatParcelizer.add(sb.toString());
                    } catch (IOException e2) {
                        createFromBitmapResource createfrombitmapresource3 = this.MediaBrowserCompat$ItemReceiver;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error reading JpgFromRaw: ");
                        sb2.append(e2.getMessage());
                        createfrombitmapresource3.IconCompatParcelizer.add(sb2.toString());
                    }
                }
                return false;
            }
            byte[] MediaBrowserCompat$CustomActionResultReceiver = allocation2.MediaBrowserCompat$CustomActionResultReceiver(i, i8);
            getSubElementOffsetBytes getsubelementoffsetbytes = this.write;
            createFromBitmapResource createfrombitmapresource4 = this.MediaBrowserCompat$ItemReceiver;
            nScriptIntrinsicCreate.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$CustomActionResultReceiver.length, getsubelementoffsetbytes);
            return true;
        } else if (allocation2.RatingCompat(i) != 28) {
            return false;
        } else {
            byte[] MediaBrowserCompat$ItemReceiver = allocation2.MediaBrowserCompat$ItemReceiver(i, i8);
            nAllocationSetSurface.read.write(new copyTo(MediaBrowserCompat$ItemReceiver), this.write, (long) MediaBrowserCompat$ItemReceiver.length);
            return true;
        }
    }

    private static void MediaBrowserCompat$ItemReceiver(createFromBitmapResource createfrombitmapresource, int i, C10820Allocation allocation, int i2, Boolean bool, int i3) throws IOException {
        int i4 = 0;
        while (i4 < i2) {
            if (createfrombitmapresource.ParcelableVolumeInfo(i4)) {
                if (i4 >= i2 - 1 || !createfrombitmapresource.ParcelableVolumeInfo(i4 + 1)) {
                    if (bool.booleanValue()) {
                        short[] sArr = new short[i3];
                        for (int i5 = 0; i5 < i3; i5++) {
                            sArr[i5] = allocation.IconCompatParcelizer(((i4 + i5) << 1) + i);
                        }
                        createfrombitmapresource.MediaBrowserCompat$ItemReceiver(i4, (Object) sArr);
                    } else {
                        int[] iArr = new int[i3];
                        for (int i6 = 0; i6 < i3; i6++) {
                            iArr[i6] = allocation.MediaSessionCompat$ResultReceiverWrapper(((i4 + i6) << 1) + i);
                        }
                        createfrombitmapresource.MediaBrowserCompat$ItemReceiver(i4, (Object) iArr);
                    }
                    i4 += i3 - 1;
                } else if (bool.booleanValue()) {
                    createfrombitmapresource.IconCompatParcelizer(i4, Short.valueOf(allocation.IconCompatParcelizer((i4 << 1) + i)));
                } else {
                    createfrombitmapresource.IconCompatParcelizer(i4, Integer.valueOf(allocation.MediaSessionCompat$ResultReceiverWrapper((i4 << 1) + i)));
                }
            }
            i4++;
        }
    }

    private boolean MediaBrowserCompat$ItemReceiver(int i, Set<Integer> set, int i2, C10820Allocation allocation) throws IOException {
        String str;
        boolean z;
        boolean z2;
        Integer num;
        int i3 = i;
        Set<Integer> set2 = set;
        int i4 = i2;
        C10820Allocation allocation2 = allocation;
        createFromBitmapResource write = this.write.write(typeFromBitmap.class);
        if (write == null) {
            str = null;
        } else {
            str = write.MediaBrowserCompat$SearchResultReceiver(271);
        }
        String str2 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 2), setViewCacheExtension.write.name());
        String str3 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 3), setViewCacheExtension.write.name());
        String str4 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 4), setViewCacheExtension.write.name());
        String str5 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 5), setViewCacheExtension.write.name());
        String str6 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 6), setViewCacheExtension.write.name());
        String str7 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 7), setViewCacheExtension.write.name());
        String str8 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 8), setViewCacheExtension.write.name());
        String str9 = str2;
        String str10 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 9), setViewCacheExtension.write.name());
        String str11 = str10;
        String str12 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 10), setViewCacheExtension.write.name());
        String str13 = str7;
        String str14 = new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 12), setViewCacheExtension.write.name());
        boolean z3 = allocation2.MediaBrowserCompat$CustomActionResultReceiver;
        if ("OLYMP\u0000".equals(str6) || "EPSON".equals(str5) || "AGFA".equals(str4)) {
            z2 = z3;
            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Byte3.class);
            ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i4);
        } else {
            if ("OLYMPUS\u0000II".equals(str12)) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Byte3.class);
                ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 12, i3);
            } else if (str != null && str.toUpperCase().startsWith("MINOLTA")) {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) Byte3.class);
                ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i4);
            } else if (str == null || !str.trim().toUpperCase().startsWith("NIKON")) {
                if ("SONY CAM".equals(str8) || "SONY DSC".equals(str8)) {
                    z2 = z3;
                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I32_4.class);
                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 12, i4);
                } else {
                    if (str == null || !str.startsWith("SONY")) {
                        z2 = z3;
                    } else {
                        z2 = z3;
                        if (!Arrays.equals(allocation2.MediaBrowserCompat$ItemReceiver(i3, 2), new byte[]{1, 0})) {
                            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I32_4.class);
                            ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i4);
                        }
                    }
                    if ("SEMC MS\u0000\u0000\u0000\u0000\u0000".equals(str14)) {
                        allocation2.MediaBrowserCompat$CustomActionResultReceiver = true;
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I8_3.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 20, i4);
                    } else if ("SIGMA\u0000\u0000\u0000".equals(str8) || "FOVEON\u0000\u0000".equals(str8)) {
                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I64_4.class);
                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 10, i4);
                    } else if ("KDK".equals(str3)) {
                        allocation2.MediaBrowserCompat$CustomActionResultReceiver = str13.equals("KDK INFO");
                        getUsage getusage = new getUsage();
                        this.write.IconCompatParcelizer.add(getusage);
                        int i5 = i3 + 8;
                        try {
                            getusage.IconCompatParcelizer(0, new createFromBitmap(allocation2.MediaBrowserCompat$ItemReceiver(i5, 8), setViewCacheExtension.write));
                            getusage.IconCompatParcelizer(9, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 9)));
                            getusage.IconCompatParcelizer(10, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 10)));
                            getusage.IconCompatParcelizer(12, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 12)));
                            getusage.IconCompatParcelizer(14, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 14)));
                            getusage.IconCompatParcelizer(16, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 16)));
                            getusage.MediaBrowserCompat$ItemReceiver(18, allocation2.MediaBrowserCompat$ItemReceiver(i5 + 18, 2));
                            getusage.MediaBrowserCompat$ItemReceiver(20, allocation2.MediaBrowserCompat$ItemReceiver(i5 + 20, 4));
                            getusage.IconCompatParcelizer(24, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 24)));
                            getusage.IconCompatParcelizer(27, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 27)));
                            getusage.IconCompatParcelizer(28, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 28)));
                            getusage.IconCompatParcelizer(29, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 29)));
                            getusage.IconCompatParcelizer(30, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 30)));
                            getusage.IconCompatParcelizer(32, Long.valueOf(allocation2.mo15721x50fd9e4a(i5 + 32)));
                            getusage.IconCompatParcelizer(36, Integer.valueOf(allocation2.IconCompatParcelizer(i5 + 36)));
                            getusage.IconCompatParcelizer(56, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 56)));
                            getusage.IconCompatParcelizer(64, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 64)));
                            getusage.IconCompatParcelizer(92, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 92)));
                            getusage.IconCompatParcelizer(93, Integer.valueOf(allocation2.MediaSessionCompat$QueueItem(i5 + 93)));
                            getusage.IconCompatParcelizer(94, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 94)));
                            getusage.IconCompatParcelizer(96, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 96)));
                            getusage.IconCompatParcelizer(98, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 98)));
                            getusage.IconCompatParcelizer(100, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 100)));
                            getusage.IconCompatParcelizer(102, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 102)));
                            getusage.IconCompatParcelizer(104, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i5 + 104)));
                            getusage.IconCompatParcelizer(107, Integer.valueOf(allocation2.RatingCompat(i5 + 107)));
                        } catch (IOException e) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Error processing Kodak makernote data: ");
                            sb.append(e.getMessage());
                            getusage.IconCompatParcelizer.add(sb.toString());
                        }
                    } else {
                        String str15 = str13;
                        if ("Canon".equalsIgnoreCase(str)) {
                            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) generateMipmaps.class);
                            ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i4);
                        } else if (str == null || !str.toUpperCase().startsWith("CASIO")) {
                            if ("FUJIFILM".equals(str8) || "Fujifilm".equalsIgnoreCase(str)) {
                                allocation2.MediaBrowserCompat$CustomActionResultReceiver = false;
                                int MediaBrowserCompat$MediaItem = allocation2.MediaBrowserCompat$MediaItem(i3 + 8);
                                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) getType.class);
                                ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, MediaBrowserCompat$MediaItem + i3, i3);
                            } else if ("KYOCERA".equals(str15)) {
                                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) setAutoPadding.class);
                                ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 22, i4);
                            } else if ("LEICA".equals(str5)) {
                                allocation2.MediaBrowserCompat$CustomActionResultReceiver = false;
                                if ("LEICA\u0000\u0001\u0000".equals(str8) || "LEICA\u0000\u0004\u0000".equals(str8) || "LEICA\u0000\u0005\u0000".equals(str8) || "LEICA\u0000\u0006\u0000".equals(str8) || "LEICA\u0000\u0007\u0000".equals(str8)) {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) BaseObj.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i3);
                                } else if ("Leica Camera AG".equals(str)) {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) setSurface.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i4);
                                } else if (!"LEICA".equals(str)) {
                                    return false;
                                } else {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) F32_4.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i4);
                                }
                            } else {
                                if ("Panasonic\u0000\u0000\u0000".equals(new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 12), setViewCacheExtension.write.name()))) {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) F32_4.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 12, i4);
                                } else if ("AOC\u0000".equals(str4)) {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) ioReceive.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 6, i3);
                                } else if (str != null && (str.toUpperCase().startsWith("PENTAX") || str.toUpperCase().startsWith("ASAHI"))) {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) F32_3.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i3);
                                } else if ("SANYO\u0000\u0001\u0000".equals(str8)) {
                                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I32_3.class);
                                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i3);
                                } else if (str == null || !str.toLowerCase().startsWith("ricoh")) {
                                    if (str12.equals("Apple iOS\u0000")) {
                                        boolean z4 = allocation2.MediaBrowserCompat$CustomActionResultReceiver;
                                        allocation2.MediaBrowserCompat$CustomActionResultReceiver = true;
                                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) copy3DRangeFrom.class);
                                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 14, i3);
                                        allocation2.MediaBrowserCompat$CustomActionResultReceiver = z4;
                                    } else if (allocation2.MediaSessionCompat$ResultReceiverWrapper(i3) == 61697) {
                                        I16_2 i16_2 = new I16_2();
                                        this.write.IconCompatParcelizer.add(i16_2);
                                        i16_2.IconCompatParcelizer(0, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3)));
                                        int i6 = i3 + 2;
                                        int MediaSessionCompat$ResultReceiverWrapper = allocation2.MediaSessionCompat$ResultReceiverWrapper(i6);
                                        int MediaSessionCompat$ResultReceiverWrapper2 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i6 + 2);
                                        int MediaSessionCompat$ResultReceiverWrapper3 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i6 + 4);
                                        String format = String.format("%04X", new Object[]{Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i6 + 6))});
                                        String format2 = String.format("%04X", new Object[]{Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i6 + 8))});
                                        StringBuilder sb2 = new StringBuilder();
                                        sb2.append(format);
                                        sb2.append(format2);
                                        String obj = sb2.toString();
                                        try {
                                            num = Integer.valueOf(Integer.parseInt(obj));
                                        } catch (NumberFormatException unused) {
                                            num = null;
                                        }
                                        if (num != null) {
                                            String format3 = String.format("%d.%d.%d.%s", new Object[]{Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper2), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper3), num});
                                            if (format3 != null) {
                                                i16_2.IconCompatParcelizer(2, format3);
                                            } else {
                                                throw new NullPointerException("cannot set a null String");
                                            }
                                        } else {
                                            String format4 = String.format("%d.%d.%d", new Object[]{Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper2), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper3)});
                                            if (format4 != null) {
                                                i16_2.IconCompatParcelizer(2, format4);
                                                StringBuilder sb3 = new StringBuilder();
                                                sb3.append("Error processing Reconyx HyperFire makernote data: build '");
                                                sb3.append(obj);
                                                sb3.append("' is not in the expected format and will be omitted from Firmware Version.");
                                                i16_2.IconCompatParcelizer.add(sb3.toString());
                                            } else {
                                                throw new NullPointerException("cannot set a null String");
                                            }
                                        }
                                        String valueOf = String.valueOf((char) allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 12));
                                        if (valueOf != null) {
                                            i16_2.IconCompatParcelizer(12, valueOf);
                                            int i7 = i3 + 14;
                                            i16_2.MediaBrowserCompat$ItemReceiver(14, (Object) new int[]{allocation2.MediaSessionCompat$ResultReceiverWrapper(i7), allocation2.MediaSessionCompat$ResultReceiverWrapper(i7 + 2)});
                                            int i8 = i3 + 18;
                                            int MediaSessionCompat$ResultReceiverWrapper4 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i8);
                                            i16_2.IconCompatParcelizer(18, Integer.valueOf((MediaSessionCompat$ResultReceiverWrapper4 << 16) + allocation2.MediaSessionCompat$ResultReceiverWrapper(i8 + 2)));
                                            int i9 = i3 + 22;
                                            int MediaSessionCompat$ResultReceiverWrapper5 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9);
                                            int MediaSessionCompat$ResultReceiverWrapper6 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9 + 2);
                                            int MediaSessionCompat$ResultReceiverWrapper7 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9 + 4);
                                            int MediaSessionCompat$ResultReceiverWrapper8 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9 + 6);
                                            int MediaSessionCompat$ResultReceiverWrapper9 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9 + 8);
                                            int MediaSessionCompat$ResultReceiverWrapper10 = allocation2.MediaSessionCompat$ResultReceiverWrapper(i9 + 10);
                                            if (MediaSessionCompat$ResultReceiverWrapper5 < 0 || MediaSessionCompat$ResultReceiverWrapper5 >= 60 || MediaSessionCompat$ResultReceiverWrapper6 < 0 || MediaSessionCompat$ResultReceiverWrapper6 >= 60 || MediaSessionCompat$ResultReceiverWrapper7 < 0 || MediaSessionCompat$ResultReceiverWrapper7 >= 24 || MediaSessionCompat$ResultReceiverWrapper8 <= 0 || MediaSessionCompat$ResultReceiverWrapper8 >= 13 || MediaSessionCompat$ResultReceiverWrapper9 <= 0 || MediaSessionCompat$ResultReceiverWrapper9 >= 32 || MediaSessionCompat$ResultReceiverWrapper10 <= 0 || MediaSessionCompat$ResultReceiverWrapper10 > 9999) {
                                                StringBuilder sb4 = new StringBuilder();
                                                sb4.append("Error processing Reconyx HyperFire makernote data: Date/Time Original ");
                                                sb4.append(MediaSessionCompat$ResultReceiverWrapper10);
                                                sb4.append("-");
                                                sb4.append(MediaSessionCompat$ResultReceiverWrapper8);
                                                sb4.append("-");
                                                sb4.append(MediaSessionCompat$ResultReceiverWrapper9);
                                                sb4.append(" ");
                                                sb4.append(MediaSessionCompat$ResultReceiverWrapper7);
                                                sb4.append(":");
                                                sb4.append(MediaSessionCompat$ResultReceiverWrapper6);
                                                sb4.append(":");
                                                sb4.append(MediaSessionCompat$ResultReceiverWrapper5);
                                                sb4.append(" is not a valid date/time.");
                                                i16_2.IconCompatParcelizer.add(sb4.toString());
                                            } else {
                                                String format5 = String.format("%4d:%2d:%2d %2d:%2d:%2d", new Object[]{Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper10), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper8), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper9), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper7), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper6), Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper5)});
                                                if (format5 != null) {
                                                    i16_2.IconCompatParcelizer(22, format5);
                                                } else {
                                                    throw new NullPointerException("cannot set a null String");
                                                }
                                            }
                                            i16_2.IconCompatParcelizer(36, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 36)));
                                            i16_2.IconCompatParcelizer(38, Integer.valueOf(allocation2.IconCompatParcelizer(i3 + 38)));
                                            i16_2.IconCompatParcelizer(40, Integer.valueOf(allocation2.IconCompatParcelizer(i3 + 40)));
                                            i16_2.IconCompatParcelizer(42, new createFromBitmap(allocation2.MediaBrowserCompat$ItemReceiver(i3 + 42, 28), setViewCacheExtension.read));
                                            i16_2.IconCompatParcelizer(72, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 72)));
                                            i16_2.IconCompatParcelizer(74, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 74)));
                                            i16_2.IconCompatParcelizer(76, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 76)));
                                            i16_2.IconCompatParcelizer(78, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 78)));
                                            i16_2.IconCompatParcelizer(80, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 80)));
                                            i16_2.IconCompatParcelizer(82, Integer.valueOf(allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 82)));
                                            i16_2.IconCompatParcelizer(84, Double.valueOf(((double) allocation2.MediaSessionCompat$ResultReceiverWrapper(i3 + 84)) / 1000.0d));
                                            i16_2.IconCompatParcelizer(86, new String(allocation2.MediaBrowserCompat$CustomActionResultReceiver(i3 + 86, 44), setViewCacheExtension.write.name()));
                                        } else {
                                            throw new NullPointerException("cannot set a null String");
                                        }
                                    } else if (str11.equalsIgnoreCase("RECONYXUF")) {
                                        I16 i16 = new I16();
                                        this.write.IconCompatParcelizer.add(i16);
                                        i16.IconCompatParcelizer(0, new String(allocation2.MediaBrowserCompat$ItemReceiver(i3, 9), setViewCacheExtension.write.name()));
                                        i16.IconCompatParcelizer(52, new String(allocation2.MediaBrowserCompat$ItemReceiver(i3 + 52, 1), setViewCacheExtension.write.name()));
                                        int i10 = i3 + 53;
                                        i16.MediaBrowserCompat$ItemReceiver(53, (Object) new int[]{allocation2.read(i10), allocation2.read(i10 + 1)});
                                        int i11 = i3 + 59;
                                        allocation2.read(i11);
                                        allocation2.read(i11 + 1);
                                        allocation2.read(i11 + 2);
                                        allocation2.read(i11 + 3);
                                        allocation2.read(i11 + 4);
                                        i16.IconCompatParcelizer(67, Integer.valueOf(allocation2.read(i3 + 67)));
                                        i16.IconCompatParcelizer(72, Integer.valueOf(allocation2.read(i3 + 72)));
                                        i16.IconCompatParcelizer(75, new createFromBitmap(allocation2.MediaBrowserCompat$ItemReceiver(i3 + 75, 14), setViewCacheExtension.write));
                                        i16.IconCompatParcelizer(80, new String(allocation2.MediaBrowserCompat$CustomActionResultReceiver(i3 + 80, 20), setViewCacheExtension.write.name()));
                                    } else if (!"SAMSUNG".equals(str)) {
                                        return false;
                                    } else {
                                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I16_3.class);
                                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i4);
                                    }
                                } else if (str9.equals("Rv") || str3.equals("Rev")) {
                                    return false;
                                } else {
                                    if (str5.equalsIgnoreCase("Ricoh")) {
                                        allocation2.MediaBrowserCompat$CustomActionResultReceiver = true;
                                        MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) I32_2.class);
                                        ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i3);
                                    }
                                }
                            }
                        } else if ("QVC\u0000\u0000\u0000".equals(str6)) {
                            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) ioReceive.class);
                            ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 6, i4);
                        } else {
                            MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) getByteBuffer.class);
                            ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i4);
                        }
                    }
                }
            } else if ("Nikon".equals(str5)) {
                short MediaSessionCompat$QueueItem = allocation2.MediaSessionCompat$QueueItem(i3 + 6);
                if (MediaSessionCompat$QueueItem == 1) {
                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) syncAll.class);
                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 8, i4);
                } else if (MediaSessionCompat$QueueItem != 2) {
                    this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.add("Unsupported Nikon makernote data ignored.");
                } else {
                    MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) C10820Allocation.C11351.class);
                    ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3 + 18, i3 + 10);
                }
            } else {
                MediaBrowserCompat$ItemReceiver((Class<? extends createFromBitmapResource>) C10820Allocation.C11351.class);
                ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.read(this, allocation2, set2, i3, i4);
            }
            z = z3;
            allocation2.MediaBrowserCompat$CustomActionResultReceiver = z;
            return true;
        }
        z = z2;
        allocation2.MediaBrowserCompat$CustomActionResultReceiver = z;
        return true;
    }
}
