package p040o;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/* renamed from: o.Double3 */
public final class Double3 extends createCubemapFromCubeFaces<Byte3> {
    public Double3(Byte3 byte3) {
        super(byte3);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        int i2;
        int i3 = i;
        boolean z = false;
        if (i3 == 0) {
            return IconCompatParcelizer(0, 2);
        }
        if (i3 == 519) {
            String MediaBrowserCompat$SearchResultReceiver = ((Byte3) this.write).MediaBrowserCompat$SearchResultReceiver(519);
            if (MediaBrowserCompat$SearchResultReceiver == null) {
                return null;
            }
            return Byte3.read.containsKey(MediaBrowserCompat$SearchResultReceiver) ? Byte3.read.get(MediaBrowserCompat$SearchResultReceiver) : MediaBrowserCompat$SearchResultReceiver;
        } else if (i3 == 521) {
            byte[] IconCompatParcelizer = ((Byte3) this.write).IconCompatParcelizer(521);
            if (IconCompatParcelizer == null) {
                return null;
            }
            return new String(IconCompatParcelizer);
        } else if (i3 == 770) {
            return MediaBrowserCompat$CustomActionResultReceiver(770, "Off", "On", "On (Preset)");
        } else {
            if (i3 == 4100) {
                return MediaBrowserCompat$CustomActionResultReceiver(4100, null, null, "On", "Off");
            }
            if (i3 == 4111) {
                return MediaBrowserCompat$CustomActionResultReceiver(4111, "Normal", "Hard", "Soft");
            }
            if (i3 == 4113) {
                return MediaMetadataCompat();
            }
            if (i3 == 4117) {
                int[] MediaBrowserCompat$ItemReceiver = ((Byte3) this.write).MediaBrowserCompat$ItemReceiver(4117);
                if (MediaBrowserCompat$ItemReceiver == null) {
                    return null;
                }
                String format = String.format("%d %d", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver[1])});
                if (format.equals("1 0")) {
                    return "Auto";
                }
                if (format.equals("1 2")) {
                    return "Auto (2)";
                }
                if (format.equals("1 4")) {
                    return "Auto (4)";
                }
                if (format.equals("2 2")) {
                    return "3000 Kelvin";
                }
                if (format.equals("2 3")) {
                    return "3700 Kelvin";
                }
                if (format.equals("2 4")) {
                    return "4000 Kelvin";
                }
                if (format.equals("2 5")) {
                    return "4500 Kelvin";
                }
                if (format.equals("2 6")) {
                    return "5500 Kelvin";
                }
                if (format.equals("2 7")) {
                    return "6500 Kelvin";
                }
                if (format.equals("2 8")) {
                    return "7500 Kelvin";
                }
                if (format.equals("3 0")) {
                    return "One-touch";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown ");
                sb.append(format);
                return sb.toString();
            } else if (i3 == 4137) {
                return MediaBrowserCompat$CustomActionResultReceiver(4137, "High", "Normal", "Low");
            } else {
                if (i3 == 4149) {
                    return MediaBrowserCompat$CustomActionResultReceiver(4149, "No", "Yes");
                }
                if (i3 == 4106) {
                    return MediaBrowserCompat$CustomActionResultReceiver(4106, "Normal", "Macro");
                }
                if (i3 == 4107) {
                    return MediaBrowserCompat$CustomActionResultReceiver(4107, "Auto", "Manual");
                }
                if (i3 == 4119) {
                    int[] MediaBrowserCompat$ItemReceiver2 = ((Byte3) this.write).MediaBrowserCompat$ItemReceiver(4119);
                    if (MediaBrowserCompat$ItemReceiver2 == null) {
                        return null;
                    }
                    return String.valueOf(((double) ((short) MediaBrowserCompat$ItemReceiver2[0])) / 256.0d);
                } else if (i3 != 4120) {
                    switch (i3) {
                        case 257:
                            return MediaBrowserCompat$CustomActionResultReceiver(257, "Natural Colour", "Black & White", "Vivid Colour", "Solarization", "AdobeRGB");
                        case 258:
                            return MediaBrowserCompat$CustomActionResultReceiver(258, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
                        case 259:
                            return MediaBrowserCompat$CustomActionResultReceiver(259, "Raw", "Super Fine", "Fine", "Standard", "Extra Fine");
                        default:
                            switch (i3) {
                                case 512:
                                    long[] jArr = (long[]) ((Byte3) this.write).MediaBrowserCompat$ItemReceiver.get(512);
                                    if (jArr == null) {
                                        return null;
                                    }
                                    if (jArr.length <= 0) {
                                        return "";
                                    }
                                    StringBuilder sb2 = new StringBuilder();
                                    int i4 = (int) jArr[0];
                                    if (i4 == 0) {
                                        sb2.append("Normal picture taking mode");
                                    } else if (i4 == 1) {
                                        sb2.append("Unknown picture taking mode");
                                    } else if (i4 == 2) {
                                        sb2.append("Fast picture taking mode");
                                    } else if (i4 != 3) {
                                        sb2.append("Unknown picture taking mode");
                                    } else {
                                        sb2.append("Panorama picture taking mode");
                                    }
                                    if (jArr.length >= 2 && (i2 = (int) jArr[1]) != 0) {
                                        if (i2 == 1) {
                                            sb2.append(" / 1st in a sequence");
                                        } else if (i2 == 2) {
                                            sb2.append(" / 2nd in a sequence");
                                        } else if (i2 != 3) {
                                            sb2.append(" / ");
                                            sb2.append(jArr[1]);
                                            sb2.append("th in a sequence");
                                        } else {
                                            sb2.append(" / 3rd in a sequence");
                                        }
                                    }
                                    if (jArr.length >= 3) {
                                        int i5 = (int) jArr[2];
                                        if (i5 == 1) {
                                            sb2.append(" / Left to right panorama direction");
                                        } else if (i5 == 2) {
                                            sb2.append(" / Right to left panorama direction");
                                        } else if (i5 == 3) {
                                            sb2.append(" / Bottom to top panorama direction");
                                        } else if (i5 == 4) {
                                            sb2.append(" / Top to bottom panorama direction");
                                        }
                                    }
                                    return sb2.toString();
                                case 513:
                                    String MediaBrowserCompat$SearchResultReceiver2 = ((Byte3) this.write).MediaBrowserCompat$SearchResultReceiver(519);
                                    if (MediaBrowserCompat$SearchResultReceiver2 == null) {
                                        return write(513, 1, "Standard Quality", "High Quality", "Super High Quality");
                                    }
                                    Integer MediaBrowserCompat$CustomActionResultReceiver = ((Byte3) this.write).MediaBrowserCompat$CustomActionResultReceiver(513);
                                    if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                                        return null;
                                    }
                                    if ((!MediaBrowserCompat$SearchResultReceiver2.startsWith("SX") || MediaBrowserCompat$SearchResultReceiver2.startsWith("SX151")) && !MediaBrowserCompat$SearchResultReceiver2.startsWith("D4322")) {
                                        int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                                        if (intValue == 0) {
                                            return "Standard Quality (Low)";
                                        }
                                        if (intValue == 1) {
                                            return "High Quality (Normal)";
                                        }
                                        if (intValue == 2) {
                                            return "Super High Quality (Fine)";
                                        }
                                        if (intValue == 4) {
                                            return "RAW";
                                        }
                                        if (intValue == 5) {
                                            return "Medium-Fine";
                                        }
                                        if (intValue == 6) {
                                            return "Small-Fine";
                                        }
                                        if (intValue == 33) {
                                            return "Uncompressed";
                                        }
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Unknown (");
                                        sb3.append(MediaBrowserCompat$CustomActionResultReceiver.toString());
                                        sb3.append(")");
                                        return sb3.toString();
                                    }
                                    int intValue2 = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                                    if (intValue2 == 0) {
                                        return "Standard Quality (Low)";
                                    }
                                    if (intValue2 == 1) {
                                        return "High Quality (Normal)";
                                    }
                                    if (intValue2 == 2) {
                                        return "Super High Quality (Fine)";
                                    }
                                    if (intValue2 == 6) {
                                        return "RAW";
                                    }
                                    StringBuilder sb4 = new StringBuilder();
                                    sb4.append("Unknown (");
                                    sb4.append(MediaBrowserCompat$CustomActionResultReceiver.toString());
                                    sb4.append(")");
                                    return sb4.toString();
                                case 514:
                                    return MediaBrowserCompat$CustomActionResultReceiver(514, "Normal (no macro)", "Macro");
                                case 515:
                                    return MediaBrowserCompat$CustomActionResultReceiver(515, "Off", "On");
                                case 516:
                                    copy3DRangeFromUnchecked RatingCompat = ((Byte3) this.write).RatingCompat(516);
                                    if (RatingCompat == null) {
                                        return null;
                                    }
                                    return RatingCompat.IconCompatParcelizer(false);
                                case 517:
                                    copy3DRangeFromUnchecked RatingCompat2 = ((Byte3) this.write).RatingCompat(517);
                                    if (RatingCompat2 == null) {
                                        return null;
                                    }
                                    DecimalFormat decimalFormat = new DecimalFormat("0.###");
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append(decimalFormat.format(RatingCompat2.doubleValue()));
                                    sb5.append(" mm");
                                    return sb5.toString();
                                default:
                                    switch (i3) {
                                        case 4096:
                                            return super.read(4096);
                                        case 4097:
                                            copy3DRangeFromUnchecked RatingCompat3 = ((Byte3) this.write).RatingCompat(4097);
                                            if (RatingCompat3 == null) {
                                                return null;
                                            }
                                            return String.valueOf(Math.round(Math.pow(2.0d, RatingCompat3.doubleValue() - 5.0d) * 100.0d));
                                        case 4098:
                                            Double read = ((Byte3) this.write).read(4098);
                                            if (read == null) {
                                                return null;
                                            }
                                            return write(setLayoutFrozen.MediaBrowserCompat$ItemReceiver(read.doubleValue()));
                                        default:
                                            switch (i3) {
                                                case 61442:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61442, "P", "A", "S", "M");
                                                case 61443:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61443, "Normal", "Red-eye reduction", "Rear flash sync", "Wireless");
                                                case 61444:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61444, "Auto", "Daylight", "Cloudy", "Tungsten", null, "Custom", null, "Fluorescent", "Fluorescent 2", null, null, "Custom 2", "Custom 3");
                                                case 61445:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61445, "2560 x 1920", "1600 x 1200", "1280 x 960", "640 x 480");
                                                case 61446:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61446, "Raw", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine");
                                                case 61447:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61447, "Single", "Continuous", "Self Timer", null, "Bracketing", "Interval", "UHS Continuous", "HS Continuous");
                                                case 61448:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61448, "Multi-Segment", "Centre Weighted", "Spot");
                                                case 61449:
                                                    Long MediaDescriptionCompat = ((Byte3) this.write).MediaDescriptionCompat(61449);
                                                    if (MediaDescriptionCompat == null) {
                                                        return null;
                                                    }
                                                    double pow = Math.pow((((double) MediaDescriptionCompat.longValue()) / 8.0d) - 1.0d, 2.0d);
                                                    DecimalFormat decimalFormat2 = new DecimalFormat("0.##");
                                                    decimalFormat2.setRoundingMode(RoundingMode.HALF_UP);
                                                    return decimalFormat2.format(pow * 3.125d);
                                                case 61450:
                                                    Long MediaDescriptionCompat2 = ((Byte3) this.write).MediaDescriptionCompat(61450);
                                                    if (MediaDescriptionCompat2 == null) {
                                                        return null;
                                                    }
                                                    double pow2 = Math.pow(((double) (49 - MediaDescriptionCompat2.longValue())) / 8.0d, 2.0d);
                                                    DecimalFormat decimalFormat3 = new DecimalFormat("0.###");
                                                    decimalFormat3.setRoundingMode(RoundingMode.HALF_UP);
                                                    StringBuilder sb6 = new StringBuilder();
                                                    sb6.append(decimalFormat3.format(pow2));
                                                    sb6.append(" sec");
                                                    return sb6.toString();
                                                case 61451:
                                                    Long MediaDescriptionCompat3 = ((Byte3) this.write).MediaDescriptionCompat(61451);
                                                    if (MediaDescriptionCompat3 == null) {
                                                        return null;
                                                    }
                                                    return write(Math.pow((((double) MediaDescriptionCompat3.longValue()) / 16.0d) - 0.5d, 2.0d));
                                                case 61452:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61452, "Off", "On");
                                                case 61453:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61453, "Off", "Electronic magnification", "Digital zoom 2x");
                                                case 61454:
                                                    Long MediaDescriptionCompat4 = ((Byte3) this.write).MediaDescriptionCompat(61454);
                                                    DecimalFormat decimalFormat4 = new DecimalFormat("0.##");
                                                    if (MediaDescriptionCompat4 == null) {
                                                        return null;
                                                    }
                                                    StringBuilder sb7 = new StringBuilder();
                                                    sb7.append(decimalFormat4.format((((double) MediaDescriptionCompat4.longValue()) / 3.0d) - 2.0d));
                                                    sb7.append(" EV");
                                                    return sb7.toString();
                                                case 61455:
                                                    return MediaBrowserCompat$CustomActionResultReceiver(61455, "1/3 EV", "2/3 EV", "1 EV");
                                                default:
                                                    switch (i3) {
                                                        case 61457:
                                                            Long MediaDescriptionCompat5 = ((Byte3) this.write).MediaDescriptionCompat(61447);
                                                            if (MediaDescriptionCompat5 != null && MediaDescriptionCompat5.longValue() == 5) {
                                                                z = true;
                                                            }
                                                            if (!z) {
                                                                return "N/A";
                                                            }
                                                            Long MediaDescriptionCompat6 = ((Byte3) this.write).MediaDescriptionCompat(61457);
                                                            if (MediaDescriptionCompat6 == null) {
                                                                return null;
                                                            }
                                                            StringBuilder sb8 = new StringBuilder();
                                                            sb8.append(MediaDescriptionCompat6);
                                                            sb8.append(" min");
                                                            return sb8.toString();
                                                        case 61458:
                                                            Long MediaDescriptionCompat7 = ((Byte3) this.write).MediaDescriptionCompat(61447);
                                                            if (MediaDescriptionCompat7 != null && MediaDescriptionCompat7.longValue() == 5) {
                                                                z = true;
                                                            }
                                                            if (!z) {
                                                                return "N/A";
                                                            }
                                                            Long MediaDescriptionCompat8 = ((Byte3) this.write).MediaDescriptionCompat(61458);
                                                            if (MediaDescriptionCompat8 == null) {
                                                                return null;
                                                            }
                                                            return Long.toString(MediaDescriptionCompat8.longValue());
                                                        case 61459:
                                                            Long MediaDescriptionCompat9 = ((Byte3) this.write).MediaDescriptionCompat(61459);
                                                            if (MediaDescriptionCompat9 == null) {
                                                                return null;
                                                            }
                                                            return MediaBrowserCompat$CustomActionResultReceiver(((double) MediaDescriptionCompat9.longValue()) / 256.0d);
                                                        case 61460:
                                                            Long MediaDescriptionCompat10 = ((Byte3) this.write).MediaDescriptionCompat(61460);
                                                            if (MediaDescriptionCompat10 == null) {
                                                                return null;
                                                            }
                                                            if (MediaDescriptionCompat10.longValue() == 0) {
                                                                return "Infinity";
                                                            }
                                                            StringBuilder sb9 = new StringBuilder();
                                                            sb9.append(MediaDescriptionCompat10);
                                                            sb9.append(" mm");
                                                            return sb9.toString();
                                                        case 61461:
                                                            return MediaBrowserCompat$CustomActionResultReceiver(61461, "No", "Yes");
                                                        case 61462:
                                                            Long MediaDescriptionCompat11 = ((Byte3) this.write).MediaDescriptionCompat(61462);
                                                            if (MediaDescriptionCompat11 == null) {
                                                                return null;
                                                            }
                                                            int longValue = (int) (MediaDescriptionCompat11.longValue() & 255);
                                                            int longValue2 = (int) ((MediaDescriptionCompat11.longValue() >> 16) & 255);
                                                            int longValue3 = ((int) ((MediaDescriptionCompat11.longValue() >> 8) & 255)) + 1970;
                                                            if (!setRecyclerListener.write(longValue3, longValue2, longValue)) {
                                                                return "Invalid date";
                                                            }
                                                            return String.format("%04d-%02d-%02d", new Object[]{Integer.valueOf(longValue3), Integer.valueOf(longValue2 + 1), Integer.valueOf(longValue)});
                                                        case 61463:
                                                            Long MediaDescriptionCompat12 = ((Byte3) this.write).MediaDescriptionCompat(61463);
                                                            if (MediaDescriptionCompat12 == null) {
                                                                return null;
                                                            }
                                                            int longValue4 = (int) ((MediaDescriptionCompat12.longValue() >> 8) & 255);
                                                            int longValue5 = (int) ((MediaDescriptionCompat12.longValue() >> 16) & 255);
                                                            int longValue6 = (int) (MediaDescriptionCompat12.longValue() & 255);
                                                            if (!setRecyclerListener.read(longValue4, longValue5, longValue6)) {
                                                                return "Invalid time";
                                                            }
                                                            return String.format("%02d:%02d:%02d", new Object[]{Integer.valueOf(longValue4), Integer.valueOf(longValue5), Integer.valueOf(longValue6)});
                                                        case 61464:
                                                            Long MediaDescriptionCompat13 = ((Byte3) this.write).MediaDescriptionCompat(61463);
                                                            if (MediaDescriptionCompat13 == null) {
                                                                return null;
                                                            }
                                                            return write(Math.pow((((double) MediaDescriptionCompat13.longValue()) / 16.0d) - 0.5d, 2.0d));
                                                        default:
                                                            switch (i3) {
                                                                case 61467:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61467, "Off", "On");
                                                                case 61468:
                                                                    Long MediaDescriptionCompat14 = ((Byte3) this.write).MediaDescriptionCompat(61468);
                                                                    if (MediaDescriptionCompat14 == null) {
                                                                        return null;
                                                                    }
                                                                    return MediaDescriptionCompat14.longValue() == 0 ? "File Number Memory Off" : Long.toString(MediaDescriptionCompat14.longValue());
                                                                case 61469:
                                                                    Long MediaDescriptionCompat15 = ((Byte3) this.write).MediaDescriptionCompat(61469);
                                                                    DecimalFormat decimalFormat5 = new DecimalFormat("0.##");
                                                                    if (MediaDescriptionCompat15 == null) {
                                                                        return null;
                                                                    }
                                                                    return decimalFormat5.format(((double) MediaDescriptionCompat15.longValue()) / 256.0d);
                                                                case 61470:
                                                                    Long MediaDescriptionCompat16 = ((Byte3) this.write).MediaDescriptionCompat(61470);
                                                                    DecimalFormat decimalFormat6 = new DecimalFormat("0.##");
                                                                    if (MediaDescriptionCompat16 == null) {
                                                                        return null;
                                                                    }
                                                                    return decimalFormat6.format(((double) MediaDescriptionCompat16.longValue()) / 256.0d);
                                                                case 61471:
                                                                    Long MediaDescriptionCompat17 = ((Byte3) this.write).MediaDescriptionCompat(61471);
                                                                    DecimalFormat decimalFormat7 = new DecimalFormat("0.##");
                                                                    if (MediaDescriptionCompat17 == null) {
                                                                        return null;
                                                                    }
                                                                    return decimalFormat7.format(((double) MediaDescriptionCompat17.longValue()) / 256.0d);
                                                                case 61472:
                                                                    Long MediaDescriptionCompat18 = ((Byte3) this.write).MediaDescriptionCompat(61472);
                                                                    if (MediaDescriptionCompat18 == null) {
                                                                        return null;
                                                                    }
                                                                    return Long.toString(MediaDescriptionCompat18.longValue() - 3);
                                                                case 61473:
                                                                    Long MediaDescriptionCompat19 = ((Byte3) this.write).MediaDescriptionCompat(61473);
                                                                    if (MediaDescriptionCompat19 == null) {
                                                                        return null;
                                                                    }
                                                                    return Long.toString(MediaDescriptionCompat19.longValue() - 3);
                                                                case 61474:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61474, "Hard", "Normal", "Soft");
                                                                case 61475:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61475, "None", "Portrait", "Text", "Night Portrait", "Sunset", "Sports Action");
                                                                case 61476:
                                                                    Long MediaDescriptionCompat20 = ((Byte3) this.write).MediaDescriptionCompat(61476);
                                                                    DecimalFormat decimalFormat8 = new DecimalFormat("0.##");
                                                                    if (MediaDescriptionCompat20 == null) {
                                                                        return null;
                                                                    }
                                                                    StringBuilder sb10 = new StringBuilder();
                                                                    sb10.append(decimalFormat8.format(((double) (MediaDescriptionCompat20.longValue() - 6)) / 3.0d));
                                                                    sb10.append(" EV");
                                                                    return sb10.toString();
                                                                case 61477:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61477, "100", "200", "400", "800", "Auto", "64");
                                                                case 61478:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61478, "DiMAGE 7", "DiMAGE 5", "DiMAGE S304", "DiMAGE S404", "DiMAGE 7i", "DiMAGE 7Hi", "DiMAGE A1", "DiMAGE S414");
                                                                case 61479:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61479, "Still Image", "Time Lapse Movie");
                                                                case 61480:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61480, "Standard Form", "Data Form");
                                                                case 61481:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61481, "Natural Color", "Black & White", "Vivid Color", "Solarization", "AdobeRGB");
                                                                case 61482:
                                                                    Long MediaDescriptionCompat21 = ((Byte3) this.write).MediaDescriptionCompat(61482);
                                                                    if (MediaDescriptionCompat21 == null) {
                                                                        return null;
                                                                    }
                                                                    return Long.toString(MediaDescriptionCompat21.longValue() - 3);
                                                                case 61483:
                                                                    return super.MediaBrowserCompat$CustomActionResultReceiver(61483);
                                                                case 61484:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61484, "Did Not Fire", "Fired");
                                                                case 61485:
                                                                    Long MediaDescriptionCompat22 = ((Byte3) this.write).MediaDescriptionCompat(61485);
                                                                    DecimalFormat decimalFormat9 = new DecimalFormat("0.##");
                                                                    if (MediaDescriptionCompat22 == null) {
                                                                        return null;
                                                                    }
                                                                    return decimalFormat9.format((((double) MediaDescriptionCompat22.longValue()) / 8.0d) - 6.0d);
                                                                case 61486:
                                                                    return super.MediaBrowserCompat$CustomActionResultReceiver(61486);
                                                                case 61487:
                                                                    return super.MediaBrowserCompat$CustomActionResultReceiver(61487);
                                                                case 61488:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61488, "No Zone or AF Failed", "Center Zone (Horizontal Orientation)", "Center Zone (Vertical Orientation)", "Left Zone", "Right Zone");
                                                                case 61489:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61489, "Auto Focus", "Manual Focus");
                                                                case 61490:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61490, "Wide Focus (Normal)", "Spot Focus");
                                                                case 61491:
                                                                    return MediaBrowserCompat$CustomActionResultReceiver(61491, "Exposure", "Contrast", "Saturation", "Filter");
                                                                default:
                                                                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                                                            }
                                                    }
                                            }
                                    }
                            }
                    }
                } else {
                    int[] MediaBrowserCompat$ItemReceiver3 = ((Byte3) this.write).MediaBrowserCompat$ItemReceiver(4120);
                    if (MediaBrowserCompat$ItemReceiver3 == null) {
                        return null;
                    }
                    return String.valueOf(((double) ((short) MediaBrowserCompat$ItemReceiver3[0])) / 256.0d);
                }
            }
        }
    }

    private String MediaMetadataCompat() {
        int[] MediaBrowserCompat$ItemReceiver = ((Byte3) this.write).MediaBrowserCompat$ItemReceiver(4113);
        if (MediaBrowserCompat$ItemReceiver == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver.length; i++) {
            sb.append((short) MediaBrowserCompat$ItemReceiver[i]);
            if (i < MediaBrowserCompat$ItemReceiver.length - 1) {
                sb.append(" ");
            }
        }
        if (sb.length() != 0) {
            return sb.toString();
        }
        return null;
    }
}
