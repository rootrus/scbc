package p040o;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;
import p040o.createFromBitmapResource;

/* renamed from: o.createTyped */
public abstract class createTyped<T extends createFromBitmapResource> extends createCubemapFromCubeFaces<T> {
    public createTyped(T t) {
        super(t);
    }

    public String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        String str = "";
        String str2 = "unit";
        switch (i) {
            case 1:
                String MediaBrowserCompat$SearchResultReceiver = this.write.MediaBrowserCompat$SearchResultReceiver(1);
                if (MediaBrowserCompat$SearchResultReceiver == null) {
                    return null;
                }
                if ("R98".equalsIgnoreCase(MediaBrowserCompat$SearchResultReceiver.trim())) {
                    return "Recommended Exif Interoperability Rules (ExifR98)";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown (");
                sb.append(MediaBrowserCompat$SearchResultReceiver);
                sb.append(")");
                return sb.toString();
            case 2:
                return IconCompatParcelizer(2, 2);
            case 254:
                return write(254, 0, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image", "Single page of multi-page reduced-resolution image", "Transparency mask", "Transparency mask of reduced-resolution image", "Transparency mask of multi-page image", "Transparency mask of reduced-resolution multi-page image");
            case 255:
                return write(255, 1, "Full-resolution image", "Reduced-resolution image", "Single page of multi-page image");
            case 256:
                String MediaBrowserCompat$SearchResultReceiver2 = this.write.MediaBrowserCompat$SearchResultReceiver(256);
                if (MediaBrowserCompat$SearchResultReceiver2 == null) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(MediaBrowserCompat$SearchResultReceiver2);
                sb2.append(" pixels");
                return sb2.toString();
            case 257:
                String MediaBrowserCompat$SearchResultReceiver3 = this.write.MediaBrowserCompat$SearchResultReceiver(257);
                if (MediaBrowserCompat$SearchResultReceiver3 == null) {
                    return null;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append(MediaBrowserCompat$SearchResultReceiver3);
                sb3.append(" pixels");
                return sb3.toString();
            case 258:
                String MediaBrowserCompat$SearchResultReceiver4 = this.write.MediaBrowserCompat$SearchResultReceiver(258);
                if (MediaBrowserCompat$SearchResultReceiver4 == null) {
                    return null;
                }
                StringBuilder sb4 = new StringBuilder();
                sb4.append(MediaBrowserCompat$SearchResultReceiver4);
                sb4.append(" bits/component/pixel");
                return sb4.toString();
            case 259:
                Integer MediaBrowserCompat$CustomActionResultReceiver = this.write.MediaBrowserCompat$CustomActionResultReceiver(259);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                if (intValue == 32766) {
                    return "Next";
                }
                if (intValue == 32767) {
                    return "Sony ARW Compressed";
                }
                switch (intValue) {
                    case 1:
                        return "Uncompressed";
                    case 2:
                        return "CCITT 1D";
                    case 3:
                        return "T4/Group 3 Fax";
                    case 4:
                        return "T6/Group 4 Fax";
                    case 5:
                        return "LZW";
                    case 6:
                        return "JPEG (old-style)";
                    case 7:
                        return "JPEG";
                    case 8:
                        return "Adobe Deflate";
                    case 9:
                        return "JBIG B&W";
                    case 10:
                        return "JBIG Color";
                    default:
                        switch (intValue) {
                            case 99:
                                return "JPEG";
                            case 262:
                                return "Kodak 262";
                            case 32809:
                                return "Thunderscan";
                            case 32867:
                                return "Kodak KDC Compressed";
                            case 34661:
                                return "JBIG";
                            case 34715:
                                return "JBIG2 TIFF FX";
                            case 34892:
                                return "Lossy JPEG";
                            case 65000:
                                return "Kodak DCR Compressed";
                            case Settings.DEFAULT_INITIAL_WINDOW_SIZE /*65535*/:
                                return "Pentax PEF Compressed";
                            default:
                                switch (intValue) {
                                    case 32769:
                                        return "Packed RAW";
                                    case 32770:
                                        return "Samsung SRW Compressed";
                                    case 32771:
                                        return "CCIRLEW";
                                    case 32772:
                                        return "Samsung SRW Compressed 2";
                                    case 32773:
                                        return "PackBits";
                                    default:
                                        switch (intValue) {
                                            case 32895:
                                                return "IT8CTPAD";
                                            case 32896:
                                                return "IT8LW";
                                            case 32897:
                                                return "IT8MP";
                                            case 32898:
                                                return "IT8BL";
                                            default:
                                                switch (intValue) {
                                                    case 32908:
                                                        return "PixarFilm";
                                                    case 32909:
                                                        return "PixarLog";
                                                    default:
                                                        switch (intValue) {
                                                            case 32946:
                                                                return "Deflate";
                                                            case 32947:
                                                                return "DCS";
                                                            default:
                                                                switch (intValue) {
                                                                    case 34676:
                                                                        return "SGILog";
                                                                    case 34677:
                                                                        return "SGILog24";
                                                                    default:
                                                                        switch (intValue) {
                                                                            case 34712:
                                                                                return "JPEG 2000";
                                                                            case 34713:
                                                                                return "Nikon NEF Compressed";
                                                                            default:
                                                                                switch (intValue) {
                                                                                    case 34718:
                                                                                        return "Microsoft Document Imaging (MDI) Binary Level Codec";
                                                                                    case 34719:
                                                                                        return "Microsoft Document Imaging (MDI) Progressive Transform Codec";
                                                                                    case 34720:
                                                                                        return "Microsoft Document Imaging (MDI) Vector";
                                                                                    default:
                                                                                        StringBuilder sb5 = new StringBuilder();
                                                                                        sb5.append("Unknown (");
                                                                                        sb5.append(MediaBrowserCompat$CustomActionResultReceiver);
                                                                                        sb5.append(")");
                                                                                        return sb5.toString();
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                        }
                }
            case 262:
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = this.write.MediaBrowserCompat$CustomActionResultReceiver(262);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue2 == 32803) {
                    return "Color Filter Array";
                }
                if (intValue2 == 32892) {
                    return "Linear Raw";
                }
                switch (intValue2) {
                    case 0:
                        return "WhiteIsZero";
                    case 1:
                        return "BlackIsZero";
                    case 2:
                        return "RGB";
                    case 3:
                        return "RGB Palette";
                    case 4:
                        return "Transparency Mask";
                    case 5:
                        return "CMYK";
                    case 6:
                        return "YCbCr";
                    default:
                        switch (intValue2) {
                            case 8:
                                return "CIELab";
                            case 9:
                                return "ICCLab";
                            case 10:
                                return "ITULab";
                            default:
                                switch (intValue2) {
                                    case 32844:
                                        return "Pixar LogL";
                                    case 32845:
                                        return "Pixar LogLuv";
                                    default:
                                        return "Unknown colour space";
                                }
                        }
                }
            case 263:
                return write(263, 1, "No dithering or halftoning", "Ordered dither or halftone", "Randomized dither");
            case 266:
                return write(266, 1, "Normal", "Reversed");
            case 274:
                return super.IconCompatParcelizer();
            case 277:
                String MediaBrowserCompat$SearchResultReceiver5 = this.write.MediaBrowserCompat$SearchResultReceiver(277);
                if (MediaBrowserCompat$SearchResultReceiver5 == null) {
                    return null;
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append(MediaBrowserCompat$SearchResultReceiver5);
                sb6.append(" samples/pixel");
                return sb6.toString();
            case 278:
                String MediaBrowserCompat$SearchResultReceiver6 = this.write.MediaBrowserCompat$SearchResultReceiver(278);
                if (MediaBrowserCompat$SearchResultReceiver6 == null) {
                    return null;
                }
                StringBuilder sb7 = new StringBuilder();
                sb7.append(MediaBrowserCompat$SearchResultReceiver6);
                sb7.append(" rows/strip");
                return sb7.toString();
            case 279:
                String MediaBrowserCompat$SearchResultReceiver7 = this.write.MediaBrowserCompat$SearchResultReceiver(279);
                if (MediaBrowserCompat$SearchResultReceiver7 == null) {
                    return null;
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append(MediaBrowserCompat$SearchResultReceiver7);
                sb8.append(" bytes");
                return sb8.toString();
            case 282:
                copy3DRangeFromUnchecked RatingCompat = this.write.RatingCompat(282);
                if (RatingCompat == null) {
                    return null;
                }
                String ParcelableVolumeInfo = ParcelableVolumeInfo();
                Object[] objArr = new Object[2];
                objArr[0] = RatingCompat.IconCompatParcelizer(true);
                if (ParcelableVolumeInfo != null) {
                    str2 = ParcelableVolumeInfo.toLowerCase();
                }
                objArr[1] = str2;
                return String.format("%s dots per %s", objArr);
            case 283:
                copy3DRangeFromUnchecked RatingCompat2 = this.write.RatingCompat(283);
                if (RatingCompat2 == null) {
                    return null;
                }
                String ParcelableVolumeInfo2 = ParcelableVolumeInfo();
                Object[] objArr2 = new Object[2];
                objArr2[0] = RatingCompat2.IconCompatParcelizer(true);
                if (ParcelableVolumeInfo2 != null) {
                    str2 = ParcelableVolumeInfo2.toLowerCase();
                }
                objArr2[1] = str2;
                return String.format("%s dots per %s", objArr2);
            case 284:
                return write(284, 1, "Chunky (contiguous for each subsampling pixel)", "Separate (Y-plane/Cb-plane/Cr-plane format)");
            case 296:
                return ParcelableVolumeInfo();
            case 512:
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = this.write.MediaBrowserCompat$CustomActionResultReceiver(512);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                int intValue3 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                if (intValue3 == 1) {
                    return "Baseline";
                }
                if (intValue3 == 14) {
                    return "Lossless";
                }
                StringBuilder sb9 = new StringBuilder();
                sb9.append("Unknown (");
                sb9.append(MediaBrowserCompat$CustomActionResultReceiver3);
                sb9.append(")");
                return sb9.toString();
            case 530:
                int[] MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(530);
                if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length < 2) {
                    return null;
                }
                if (MediaBrowserCompat$ItemReceiver[0] == 2 && MediaBrowserCompat$ItemReceiver[1] == 1) {
                    return "YCbCr4:2:2";
                }
                return (MediaBrowserCompat$ItemReceiver[0] == 2 && MediaBrowserCompat$ItemReceiver[1] == 2) ? "YCbCr4:2:0" : "(Unknown)";
            case 531:
                return write(531, 1, "Center of pixel array", "Datum point");
            case 532:
                return m3086x50fd9e4a();
            case 33422:
                return MediaMetadataCompat();
            case 33434:
                String MediaBrowserCompat$SearchResultReceiver8 = this.write.MediaBrowserCompat$SearchResultReceiver(33434);
                if (MediaBrowserCompat$SearchResultReceiver8 == null) {
                    return null;
                }
                StringBuilder sb10 = new StringBuilder();
                sb10.append(MediaBrowserCompat$SearchResultReceiver8);
                sb10.append(" sec");
                return sb10.toString();
            case 33437:
                copy3DRangeFromUnchecked RatingCompat3 = this.write.RatingCompat(33437);
                if (RatingCompat3 == null) {
                    return null;
                }
                return write(RatingCompat3.doubleValue());
            case 34850:
                return write(34850, 1, "Manual control", "Program normal", "Aperture priority", "Shutter priority", "Program creative (slow program)", "Program action (high-speed program)", "Portrait mode", "Landscape mode");
            case 34855:
                Integer MediaBrowserCompat$CustomActionResultReceiver4 = this.write.MediaBrowserCompat$CustomActionResultReceiver(34855);
                if (MediaBrowserCompat$CustomActionResultReceiver4 != null) {
                    return Integer.toString(MediaBrowserCompat$CustomActionResultReceiver4.intValue());
                }
                return null;
            case 34864:
                return MediaBrowserCompat$CustomActionResultReceiver(34864, "Unknown", "Standard Output Sensitivity", "Recommended Exposure Index", "ISO Speed", "Standard Output Sensitivity and Recommended Exposure Index", "Standard Output Sensitivity and ISO Speed", "Recommended Exposure Index and ISO Speed", "Standard Output Sensitivity, Recommended Exposure Index and ISO Speed");
            case 36864:
                return IconCompatParcelizer(36864, 2);
            case 37121:
                return MediaBrowserCompat$SearchResultReceiver();
            case 37122:
                return RatingCompat();
            case 37377:
                return super.read(37377);
            case 37378:
                Double read = this.write.read(37378);
                if (read == null) {
                    return null;
                }
                return write(setLayoutFrozen.MediaBrowserCompat$ItemReceiver(read.doubleValue()));
            case 37380:
                copy3DRangeFromUnchecked RatingCompat4 = this.write.RatingCompat(37380);
                if (RatingCompat4 == null) {
                    return null;
                }
                StringBuilder sb11 = new StringBuilder();
                sb11.append(RatingCompat4.IconCompatParcelizer(true));
                sb11.append(" EV");
                return sb11.toString();
            case 37381:
                Double read2 = this.write.read(37381);
                if (read2 == null) {
                    return null;
                }
                return write(setLayoutFrozen.MediaBrowserCompat$ItemReceiver(read2.doubleValue()));
            case 37382:
                copy3DRangeFromUnchecked RatingCompat5 = this.write.RatingCompat(37382);
                if (RatingCompat5 == null) {
                    return null;
                }
                DecimalFormat decimalFormat = new DecimalFormat("0.0##");
                StringBuilder sb12 = new StringBuilder();
                sb12.append(decimalFormat.format(RatingCompat5.doubleValue()));
                sb12.append(" metres");
                return sb12.toString();
            case 37383:
                Integer MediaBrowserCompat$CustomActionResultReceiver5 = this.write.MediaBrowserCompat$CustomActionResultReceiver(37383);
                if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                    return null;
                }
                int intValue4 = MediaBrowserCompat$CustomActionResultReceiver5.intValue();
                if (intValue4 == 255) {
                    return "(Other)";
                }
                switch (intValue4) {
                    case 0:
                        return "Unknown";
                    case 1:
                        return "Average";
                    case 2:
                        return "Center weighted average";
                    case 3:
                        return "Spot";
                    case 4:
                        return "Multi-spot";
                    case 5:
                        return "Multi-segment";
                    case 6:
                        return "Partial";
                    default:
                        StringBuilder sb13 = new StringBuilder();
                        sb13.append("Unknown (");
                        sb13.append(MediaBrowserCompat$CustomActionResultReceiver5);
                        sb13.append(")");
                        return sb13.toString();
                }
            case 37384:
                Integer MediaBrowserCompat$CustomActionResultReceiver6 = this.write.MediaBrowserCompat$CustomActionResultReceiver(37384);
                if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                    return null;
                }
                int intValue5 = MediaBrowserCompat$CustomActionResultReceiver6.intValue();
                if (intValue5 == 0) {
                    return "Unknown";
                }
                if (intValue5 == 1) {
                    return "Daylight";
                }
                if (intValue5 == 2) {
                    return "Florescent";
                }
                if (intValue5 == 3) {
                    return "Tungsten";
                }
                if (intValue5 == 4) {
                    return "Flash";
                }
                if (intValue5 == 255) {
                    return "(Other)";
                }
                switch (intValue5) {
                    case 9:
                        return "Fine Weather";
                    case 10:
                        return "Cloudy";
                    case 11:
                        return "Shade";
                    case 12:
                        return "Daylight Fluorescent";
                    case 13:
                        return "Day White Fluorescent";
                    case 14:
                        return "Cool White Fluorescent";
                    case 15:
                        return "White Fluorescent";
                    case 16:
                        return "Warm White Fluorescent";
                    case 17:
                        return "Standard light";
                    case 18:
                        return "Standard light (B)";
                    case 19:
                        return "Standard light (C)";
                    case 20:
                        return "D55";
                    case 21:
                        return "D65";
                    case 22:
                        return "D75";
                    case 23:
                        return "D50";
                    case 24:
                        return "Studio Tungsten";
                    default:
                        StringBuilder sb14 = new StringBuilder();
                        sb14.append("Unknown (");
                        sb14.append(MediaBrowserCompat$CustomActionResultReceiver6);
                        sb14.append(")");
                        return sb14.toString();
                }
            case 37385:
                Integer MediaBrowserCompat$CustomActionResultReceiver7 = this.write.MediaBrowserCompat$CustomActionResultReceiver(37385);
                if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                    return null;
                }
                StringBuilder sb15 = new StringBuilder();
                if ((MediaBrowserCompat$CustomActionResultReceiver7.intValue() & 1) != 0) {
                    sb15.append("Flash fired");
                } else {
                    sb15.append("Flash did not fire");
                }
                if ((4 & MediaBrowserCompat$CustomActionResultReceiver7.intValue()) != 0) {
                    if ((MediaBrowserCompat$CustomActionResultReceiver7.intValue() & 2) != 0) {
                        sb15.append(", return detected");
                    } else {
                        sb15.append(", return not detected");
                    }
                }
                if ((MediaBrowserCompat$CustomActionResultReceiver7.intValue() & 16) != 0) {
                    sb15.append(", auto");
                }
                if ((MediaBrowserCompat$CustomActionResultReceiver7.intValue() & 64) != 0) {
                    sb15.append(", red-eye reduction");
                }
                return sb15.toString();
            case 37386:
                copy3DRangeFromUnchecked RatingCompat6 = this.write.RatingCompat(37386);
                if (RatingCompat6 == null) {
                    return null;
                }
                return MediaBrowserCompat$CustomActionResultReceiver(RatingCompat6.doubleValue());
            case 37510:
                return MediaSessionCompat$Token();
            case 40091:
                return MediaBrowserCompat$SearchResultReceiver(40091);
            case 40092:
                return MediaBrowserCompat$SearchResultReceiver(40092);
            case 40093:
                return MediaBrowserCompat$SearchResultReceiver(40093);
            case 40094:
                return MediaBrowserCompat$SearchResultReceiver(40094);
            case 40095:
                return MediaBrowserCompat$SearchResultReceiver(40095);
            case 40960:
                return IconCompatParcelizer(40960, 2);
            case 40961:
                Integer MediaBrowserCompat$CustomActionResultReceiver8 = this.write.MediaBrowserCompat$CustomActionResultReceiver(40961);
                if (MediaBrowserCompat$CustomActionResultReceiver8 == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver8.intValue() == 1) {
                    return "sRGB";
                }
                if (MediaBrowserCompat$CustomActionResultReceiver8.intValue() == 65535) {
                    return "Undefined";
                }
                StringBuilder sb16 = new StringBuilder();
                sb16.append("Unknown (");
                sb16.append(MediaBrowserCompat$CustomActionResultReceiver8);
                sb16.append(")");
                return sb16.toString();
            case 40962:
                Integer MediaBrowserCompat$CustomActionResultReceiver9 = this.write.MediaBrowserCompat$CustomActionResultReceiver(40962);
                if (MediaBrowserCompat$CustomActionResultReceiver9 == null) {
                    return null;
                }
                StringBuilder sb17 = new StringBuilder();
                sb17.append(MediaBrowserCompat$CustomActionResultReceiver9);
                sb17.append(" pixels");
                return sb17.toString();
            case 40963:
                Integer MediaBrowserCompat$CustomActionResultReceiver10 = this.write.MediaBrowserCompat$CustomActionResultReceiver(40963);
                if (MediaBrowserCompat$CustomActionResultReceiver10 == null) {
                    return null;
                }
                StringBuilder sb18 = new StringBuilder();
                sb18.append(MediaBrowserCompat$CustomActionResultReceiver10);
                sb18.append(" pixels");
                return sb18.toString();
            case 41486:
                copy3DRangeFromUnchecked RatingCompat7 = this.write.RatingCompat(41486);
                if (RatingCompat7 == null) {
                    return null;
                }
                String MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
                StringBuilder sb19 = new StringBuilder();
                sb19.append(new copy3DRangeFromUnchecked(RatingCompat7.MediaBrowserCompat$ItemReceiver, RatingCompat7.IconCompatParcelizer).IconCompatParcelizer(true));
                if (MediaSessionCompat$ResultReceiverWrapper != null) {
                    StringBuilder sb20 = new StringBuilder();
                    sb20.append(" ");
                    sb20.append(MediaSessionCompat$ResultReceiverWrapper.toLowerCase());
                    str = sb20.toString();
                }
                sb19.append(str);
                return sb19.toString();
            case 41487:
                copy3DRangeFromUnchecked RatingCompat8 = this.write.RatingCompat(41487);
                if (RatingCompat8 == null) {
                    return null;
                }
                String MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
                StringBuilder sb21 = new StringBuilder();
                sb21.append(new copy3DRangeFromUnchecked(RatingCompat8.MediaBrowserCompat$ItemReceiver, RatingCompat8.IconCompatParcelizer).IconCompatParcelizer(true));
                if (MediaSessionCompat$ResultReceiverWrapper2 != null) {
                    StringBuilder sb22 = new StringBuilder();
                    sb22.append(" ");
                    sb22.append(MediaSessionCompat$ResultReceiverWrapper2.toLowerCase());
                    str = sb22.toString();
                }
                sb21.append(str);
                return sb21.toString();
            case 41488:
                return MediaSessionCompat$ResultReceiverWrapper();
            case 41495:
                return write(41495, 1, "(Not defined)", "One-chip color area sensor", "Two-chip color area sensor", "Three-chip color area sensor", "Color sequential area sensor", null, "Trilinear sensor", "Color sequential linear sensor");
            case 41728:
                return write(41728, 1, "Film Scanner", "Reflection Print Scanner", "Digital Still Camera (DSC)");
            case 41729:
                return write(41729, 1, "Directly photographed image");
            case 41730:
                return MediaDescriptionCompat();
            case 41985:
                return MediaBrowserCompat$CustomActionResultReceiver(41985, "Normal process", "Custom process");
            case 41986:
                return MediaBrowserCompat$CustomActionResultReceiver(41986, "Auto exposure", "Manual exposure", "Auto bracket");
            case 41987:
                return MediaBrowserCompat$CustomActionResultReceiver(41987, "Auto white balance", "Manual white balance");
            case 41988:
                copy3DRangeFromUnchecked RatingCompat9 = this.write.RatingCompat(41988);
                if (RatingCompat9 == null) {
                    return null;
                }
                if (RatingCompat9.IconCompatParcelizer == 0) {
                    return "Digital zoom not used";
                }
                return new DecimalFormat("0.#").format(RatingCompat9.doubleValue());
            case 41989:
                Integer MediaBrowserCompat$CustomActionResultReceiver11 = this.write.MediaBrowserCompat$CustomActionResultReceiver(41989);
                if (MediaBrowserCompat$CustomActionResultReceiver11 == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver11.intValue() == 0) {
                    return "Unknown";
                }
                return MediaBrowserCompat$CustomActionResultReceiver((double) MediaBrowserCompat$CustomActionResultReceiver11.intValue());
            case 41990:
                return MediaBrowserCompat$CustomActionResultReceiver(41990, "Standard", "Landscape", "Portrait", "Night scene");
            case 41991:
                return MediaBrowserCompat$CustomActionResultReceiver(41991, "None", "Low gain up", "Low gain down", "High gain up", "High gain down");
            case 41992:
                return MediaBrowserCompat$CustomActionResultReceiver(41992, "None", "Soft", "Hard");
            case 41993:
                return MediaBrowserCompat$CustomActionResultReceiver(41993, "None", "Low saturation", "High saturation");
            case 41994:
                return MediaBrowserCompat$CustomActionResultReceiver(41994, "None", "Low", "Hard");
            case 41996:
                return MediaBrowserCompat$CustomActionResultReceiver(41996, "Unknown", "Macro", "Close view", "Distant view");
            case 42034:
                return write(42034);
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String m3086x50fd9e4a() {
        int[] MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(532);
        if (MediaBrowserCompat$ItemReceiver == null || MediaBrowserCompat$ItemReceiver.length < 6) {
            Object obj = this.write.MediaBrowserCompat$ItemReceiver.get(532);
            if (obj == null || !(obj instanceof long[])) {
                return null;
            }
            long[] jArr = (long[]) obj;
            if (jArr.length < 6) {
                return null;
            }
            int[] iArr = new int[jArr.length];
            for (int i = 0; i < jArr.length; i++) {
                iArr[i] = (int) jArr[i];
            }
            MediaBrowserCompat$ItemReceiver = iArr;
        }
        int i2 = MediaBrowserCompat$ItemReceiver[0];
        int i3 = MediaBrowserCompat$ItemReceiver[1];
        return String.format("[%d,%d,%d] [%d,%d,%d]", new Object[]{Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompat$ItemReceiver[2]), Integer.valueOf(MediaBrowserCompat$ItemReceiver[4]), Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompat$ItemReceiver[3]), Integer.valueOf(MediaBrowserCompat$ItemReceiver[5])});
    }

    private String ParcelableVolumeInfo() {
        return write(296, 1, "(No unit)", "Inch", "cm");
    }

    private String MediaBrowserCompat$SearchResultReceiver(int i) {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(i);
        if (IconCompatParcelizer == null) {
            return null;
        }
        try {
            return new String(IconCompatParcelizer, "UTF-16LE").trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private String MediaSessionCompat$Token() {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(37510);
        if (IconCompatParcelizer == null) {
            return null;
        }
        if (IconCompatParcelizer.length == 0) {
            return "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ASCII", System.getProperty("file.encoding"));
        hashMap.put("UNICODE", "UTF-16LE");
        hashMap.put("JIS", "Shift-JIS");
        try {
            if (IconCompatParcelizer.length >= 10) {
                String str = new String(IconCompatParcelizer, 0, 10);
                for (Map.Entry entry : hashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    String str3 = (String) entry.getValue();
                    if (str.startsWith(str2)) {
                        for (int length = str2.length(); length < 10; length++) {
                            byte b = IconCompatParcelizer[length];
                            if (b != 0 && b != 32) {
                                return new String(IconCompatParcelizer, length, IconCompatParcelizer.length - length, str3).trim();
                            }
                        }
                        return new String(IconCompatParcelizer, 10, IconCompatParcelizer.length - 10, str3).trim();
                    }
                }
            }
            return new String(IconCompatParcelizer, System.getProperty("file.encoding")).trim();
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    private String MediaDescriptionCompat() {
        return write(MediaBrowserCompat$MediaItem());
    }

    private String MediaMetadataCompat() {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(33422);
        if (IconCompatParcelizer == null) {
            return null;
        }
        int[] MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(33421);
        if (MediaBrowserCompat$ItemReceiver == null) {
            return String.format("Repeat Pattern not found for CFAPattern (%s)", new Object[]{super.MediaBrowserCompat$CustomActionResultReceiver(33422)});
        } else if (MediaBrowserCompat$ItemReceiver.length == 2 && IconCompatParcelizer.length == MediaBrowserCompat$ItemReceiver[0] * MediaBrowserCompat$ItemReceiver[1]) {
            int[] iArr = new int[(IconCompatParcelizer.length + 2)];
            iArr[0] = MediaBrowserCompat$ItemReceiver[0];
            iArr[1] = MediaBrowserCompat$ItemReceiver[1];
            for (int i = 0; i < IconCompatParcelizer.length; i++) {
                iArr[i + 2] = IconCompatParcelizer[i] & 255;
            }
            return write(iArr);
        } else {
            return String.format("Unknown Pattern (%s)", new Object[]{super.MediaBrowserCompat$CustomActionResultReceiver(33422)});
        }
    }

    private static String write(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        if (iArr.length < 2) {
            return "<truncated data>";
        }
        if (iArr[0] == 0 && iArr[1] == 0) {
            return "<zero pattern size>";
        }
        int i = (iArr[0] * iArr[1]) + 2;
        if (i > iArr.length) {
            return "<invalid pattern size>";
        }
        String[] strArr = {"Red", "Green", "Blue", "Cyan", "Magenta", "Yellow", "White"};
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i2 = 2; i2 < i; i2++) {
            if (iArr[i2] <= 6) {
                sb.append(strArr[iArr[i2]]);
            } else {
                sb.append("Unknown");
            }
            if ((i2 - 2) % iArr[1] == 0) {
                sb.append(",");
            } else if (i2 != i - 1) {
                sb.append("][");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private int[] MediaBrowserCompat$MediaItem() {
        byte[] IconCompatParcelizer = this.write.IconCompatParcelizer(41730);
        if (IconCompatParcelizer == 0) {
            return null;
        }
        if (IconCompatParcelizer.length < 4) {
            int[] iArr = new int[IconCompatParcelizer.length];
            for (int i = 0; i < IconCompatParcelizer.length; i++) {
                iArr[i] = IconCompatParcelizer[i];
            }
            return iArr;
        }
        int[] iArr2 = new int[(IconCompatParcelizer.length - 2)];
        try {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            int IconCompatParcelizer2 = staggeredGridLayoutManager.IconCompatParcelizer(0);
            int IconCompatParcelizer3 = staggeredGridLayoutManager.IconCompatParcelizer(2);
            Boolean bool = Boolean.FALSE;
            if ((IconCompatParcelizer2 * IconCompatParcelizer3) + 2 > IconCompatParcelizer.length) {
                staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver = !staggeredGridLayoutManager.MediaBrowserCompat$CustomActionResultReceiver;
                IconCompatParcelizer2 = staggeredGridLayoutManager.IconCompatParcelizer(0);
                IconCompatParcelizer3 = staggeredGridLayoutManager.IconCompatParcelizer(2);
                if (IconCompatParcelizer.length >= (IconCompatParcelizer2 * IconCompatParcelizer3) + 2) {
                    bool = Boolean.TRUE;
                }
            } else {
                bool = Boolean.TRUE;
            }
            if (bool.booleanValue()) {
                iArr2[0] = IconCompatParcelizer2;
                iArr2[1] = IconCompatParcelizer3;
                for (int i2 = 4; i2 < IconCompatParcelizer.length; i2++) {
                    iArr2[i2 - 2] = staggeredGridLayoutManager.RatingCompat(i2);
                }
            }
        } catch (IOException e) {
            T t = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append("IO exception processing data: ");
            sb.append(e.getMessage());
            t.IconCompatParcelizer.add(sb.toString());
        }
        return iArr2;
    }

    private String MediaSessionCompat$ResultReceiverWrapper() {
        return write(41488, 1, "(No unit)", "Inches", "cm");
    }

    private String RatingCompat() {
        String str;
        StringBuilder sb;
        copy3DRangeFromUnchecked RatingCompat = this.write.RatingCompat(37122);
        if (RatingCompat == null) {
            return null;
        }
        String IconCompatParcelizer = RatingCompat.IconCompatParcelizer(true);
        if (!RatingCompat.MediaBrowserCompat$ItemReceiver() || RatingCompat.intValue() != 1) {
            sb = new StringBuilder();
            sb.append(IconCompatParcelizer);
            str = " bits/pixel";
        } else {
            sb = new StringBuilder();
            sb.append(IconCompatParcelizer);
            str = " bit/pixel";
        }
        sb.append(str);
        return sb.toString();
    }

    private String MediaBrowserCompat$SearchResultReceiver() {
        int[] MediaBrowserCompat$ItemReceiver = this.write.MediaBrowserCompat$ItemReceiver(37121);
        if (MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        String[] strArr = {"", "Y", "Cb", "Cr", "R", "G", "B"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < Math.min(4, MediaBrowserCompat$ItemReceiver.length); i++) {
            int i2 = MediaBrowserCompat$ItemReceiver[i];
            if (i2 > 0 && i2 < 7) {
                sb.append(strArr[i2]);
            }
        }
        return sb.toString();
    }
}
