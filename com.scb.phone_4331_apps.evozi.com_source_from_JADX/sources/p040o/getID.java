package p040o;

import com.google.android.gms.location.places.Place;
import java.text.DecimalFormat;
import java.util.HashMap;

/* renamed from: o.getID */
public final class getID extends createCubemapFromCubeFaces<getNObj> {
    private static final HashMap<Integer, String> MediaBrowserCompat$ItemReceiver = new HashMap<>();
    private static final HashMap<Integer, String> read;

    public getID(getNObj getnobj) {
        super(getnobj);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        char c;
        String str;
        char c2;
        char c3;
        int i2 = i;
        if (i2 != 0) {
            if (i2 == 1280) {
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(1280);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                if (intValue == 0) {
                    return "Auto";
                }
                if (intValue == 1) {
                    return "Auto (Keep Warm Color Off)";
                }
                if (intValue == 48) {
                    return "3600K (Tungsten light-like)";
                }
                if (intValue == 67) {
                    return "Underwater";
                }
                switch (intValue) {
                    case 16:
                        return "7500K (Fine Weather with Shade)";
                    case 17:
                        return "6000K (Cloudy)";
                    case 18:
                        return "5300K (Fine Weather)";
                    default:
                        switch (intValue) {
                            case 20:
                                return "3000K (Tungsten light)";
                            case 21:
                                return "3600K (Tungsten light-like)";
                            case 22:
                                return "Auto Setup";
                            case 23:
                                return "5500K (Flash)";
                            default:
                                switch (intValue) {
                                    case 33:
                                        return "6600K (Daylight fluorescent)";
                                    case 34:
                                        return "4500K (Neutral white fluorescent)";
                                    case 35:
                                        return "4000K (Cool white fluorescent)";
                                    case 36:
                                        return "White Fluorescent";
                                    default:
                                        switch (intValue) {
                                            case 256:
                                                return "One Touch WB 1";
                                            case 257:
                                                return "One Touch WB 2";
                                            case 258:
                                                return "One Touch WB 3";
                                            case 259:
                                                return "One Touch WB 4";
                                            default:
                                                switch (intValue) {
                                                    case 512:
                                                        return "Custom WB 1";
                                                    case 513:
                                                        return "Custom WB 2";
                                                    case 514:
                                                        return "Custom WB 3";
                                                    case 515:
                                                        return "Custom WB 4";
                                                    default:
                                                        StringBuilder sb = new StringBuilder();
                                                        sb.append("Unknown (");
                                                        sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                                                        sb.append(")");
                                                        return sb.toString();
                                                }
                                        }
                                }
                        }
                }
            } else if (i2 == 1281) {
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(1281);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver2.intValue() == 0) {
                    return "Auto";
                }
                return MediaBrowserCompat$CustomActionResultReceiver2.toString();
            } else if (i2 == 1312) {
                int[] MediaBrowserCompat$ItemReceiver2 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1312);
                if (MediaBrowserCompat$ItemReceiver2 == null) {
                    Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(1290);
                    if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                        return null;
                    }
                    c = 0;
                    MediaBrowserCompat$ItemReceiver2 = new int[]{MediaBrowserCompat$CustomActionResultReceiver3.intValue()};
                } else {
                    c = 0;
                }
                if (MediaBrowserCompat$ItemReceiver2.length == 0) {
                    return null;
                }
                StringBuilder sb2 = new StringBuilder();
                int i3 = MediaBrowserCompat$ItemReceiver2[c];
                if (i3 == 1) {
                    sb2.append("Vivid");
                } else if (i3 == 2) {
                    sb2.append("Natural");
                } else if (i3 == 3) {
                    sb2.append("Muted");
                } else if (i3 == 4) {
                    sb2.append("Portrait");
                } else if (i3 == 5) {
                    sb2.append("i-Enhance");
                } else if (i3 == 256) {
                    sb2.append("Monotone");
                } else if (i3 != 512) {
                    sb2.append("Unknown (");
                    sb2.append(MediaBrowserCompat$ItemReceiver2[c]);
                    sb2.append(")");
                } else {
                    sb2.append("Sepia");
                }
                if (MediaBrowserCompat$ItemReceiver2.length > 1) {
                    sb2.append("; ");
                    sb2.append(MediaBrowserCompat$ItemReceiver2[1]);
                }
                return sb2.toString();
            } else if (i2 == 1313) {
                return RatingCompat(1313);
            } else {
                if (i2 == 1536) {
                    int[] MediaBrowserCompat$ItemReceiver3 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1536);
                    if (MediaBrowserCompat$ItemReceiver3 == null) {
                        return null;
                    }
                    if (MediaBrowserCompat$ItemReceiver3.length == 0 || MediaBrowserCompat$ItemReceiver3[0] == 0) {
                        return "Single Shot";
                    }
                    StringBuilder sb3 = new StringBuilder();
                    if (MediaBrowserCompat$ItemReceiver3[0] != 5 || MediaBrowserCompat$ItemReceiver3.length < 3) {
                        int i4 = MediaBrowserCompat$ItemReceiver3[0];
                        if (i4 == 1) {
                            sb3.append("Continuous Shooting");
                        } else if (i4 == 2) {
                            sb3.append("Exposure Bracketing");
                        } else if (i4 == 3) {
                            sb3.append("White Balance Bracketing");
                        } else if (i4 != 4) {
                            sb3.append("Unknown (");
                            sb3.append(MediaBrowserCompat$ItemReceiver3[0]);
                            sb3.append(")");
                        } else {
                            sb3.append("Exposure+WB Bracketing");
                        }
                    } else {
                        int i5 = MediaBrowserCompat$ItemReceiver3[2];
                        if ((i5 & 1) > 0) {
                            sb3.append("AE");
                        }
                        if (((i5 >> 1) & 1) > 0) {
                            sb3.append("WB");
                        }
                        if (((i5 >> 2) & 1) > 0) {
                            sb3.append("FL");
                        }
                        if (((i5 >> 3) & 1) > 0) {
                            sb3.append("MF");
                        }
                        if (((i5 >> 6) & 1) > 0) {
                            sb3.append("Focus");
                        }
                        sb3.append(" Bracketing");
                    }
                    sb3.append(", Shot ");
                    sb3.append(MediaBrowserCompat$ItemReceiver3[1]);
                    return sb3.toString();
                } else if (i2 == 1537) {
                    int[] MediaBrowserCompat$ItemReceiver4 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1537);
                    if (MediaBrowserCompat$ItemReceiver4 == null) {
                        return null;
                    }
                    if (MediaBrowserCompat$ItemReceiver4.length == 0 || MediaBrowserCompat$ItemReceiver4[0] == 0) {
                        return "Off";
                    }
                    int i6 = MediaBrowserCompat$ItemReceiver4[0];
                    if (i6 == 1) {
                        str = "Left to Right";
                    } else if (i6 == 2) {
                        str = "Right to Left";
                    } else if (i6 == 3) {
                        str = "Bottom to Top";
                    } else if (i6 != 4) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append("Unknown (");
                        sb4.append(MediaBrowserCompat$ItemReceiver4[0]);
                        sb4.append(")");
                        str = sb4.toString();
                    } else {
                        str = "Top to Bottom";
                    }
                    return String.format("%s, Shot %d", new Object[]{str, Integer.valueOf(MediaBrowserCompat$ItemReceiver4[1])});
                } else if (i2 != 0) {
                    if (i2 == 256) {
                        return MediaBrowserCompat$CustomActionResultReceiver(256, "No", "Yes");
                    }
                    if (i2 != 1024) {
                        String str2 = "n/a";
                        if (i2 == 1295) {
                            int[] MediaBrowserCompat$ItemReceiver5 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1295);
                            if (MediaBrowserCompat$ItemReceiver5 == null || MediaBrowserCompat$ItemReceiver5.length < 3) {
                                return null;
                            }
                            String format = String.format("%d %d %d", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver5[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver5[1]), Integer.valueOf(MediaBrowserCompat$ItemReceiver5[2])});
                            if (!format.equals("0 0 0")) {
                                if (format.equals("-1 -1 1")) {
                                    str2 = "Low Key";
                                } else if (format.equals("0 -1 1")) {
                                    str2 = "Normal";
                                } else if (format.equals("1 -1 1")) {
                                    str2 = "High Key";
                                } else {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("Unknown (");
                                    sb5.append(format);
                                    sb5.append(")");
                                    str2 = sb5.toString();
                                }
                            }
                            String str3 = str2;
                            if (MediaBrowserCompat$ItemReceiver5.length <= 3) {
                                return str3;
                            }
                            if (MediaBrowserCompat$ItemReceiver5[3] == 0) {
                                StringBuilder sb6 = new StringBuilder();
                                sb6.append(str3);
                                sb6.append("; User-Selected");
                                return sb6.toString();
                            } else if (MediaBrowserCompat$ItemReceiver5[3] != 1) {
                                return str3;
                            } else {
                                StringBuilder sb7 = new StringBuilder();
                                sb7.append(str3);
                                sb7.append("; Auto-Override");
                                return sb7.toString();
                            }
                        } else if (i2 == 1321) {
                            return MediaBrowserCompat$MediaItem();
                        } else {
                            if (i2 == 1330) {
                                return MediaBrowserCompat$SearchResultReceiver();
                            }
                            if (i2 == 2052) {
                                int[] MediaBrowserCompat$ItemReceiver6 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(2052);
                                if (MediaBrowserCompat$ItemReceiver6 == null || MediaBrowserCompat$ItemReceiver6.length < 2) {
                                    return null;
                                }
                                int i7 = MediaBrowserCompat$ItemReceiver6[0];
                                int i8 = MediaBrowserCompat$ItemReceiver6[1];
                                if (i7 == 0 && i8 == 0) {
                                    return "No";
                                }
                                if (i7 == 9 && i8 == 8) {
                                    return "Focus-stacked (8 images)";
                                }
                                return String.format("Unknown (%d %d)", new Object[]{Integer.valueOf(i7), Integer.valueOf(i8)});
                            } else if (i2 == 2312) {
                                Object obj = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver.get(2312);
                                if (obj == null) {
                                    return null;
                                }
                                return obj.toString();
                            } else if (i2 == 1539) {
                                return write(1539, 1, "SQ", "HQ", "SHQ", "RAW", "SQ (5)");
                            } else {
                                if (i2 == 1540) {
                                    return MediaBrowserCompat$CustomActionResultReceiver(1540, "Off", "On, Mode 1", "On, Mode 2", "On, Mode 3", "On, Mode 4");
                                }
                                switch (i2) {
                                    case 768:
                                        return MediaBrowserCompat$CustomActionResultReceiver(768, "Off", "On", "Super Macro");
                                    case 769:
                                        int[] MediaBrowserCompat$ItemReceiver7 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(769);
                                        if (MediaBrowserCompat$ItemReceiver7 == null) {
                                            Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(769);
                                            if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                                                return null;
                                            }
                                            c2 = 0;
                                            MediaBrowserCompat$ItemReceiver7 = new int[]{MediaBrowserCompat$CustomActionResultReceiver4.intValue()};
                                        } else {
                                            c2 = 0;
                                        }
                                        if (MediaBrowserCompat$ItemReceiver7.length == 0) {
                                            return null;
                                        }
                                        StringBuilder sb8 = new StringBuilder();
                                        int i9 = MediaBrowserCompat$ItemReceiver7[c2];
                                        if (i9 == 0) {
                                            sb8.append("Single AF");
                                        } else if (i9 == 1) {
                                            sb8.append("Sequential shooting AF");
                                        } else if (i9 == 2) {
                                            sb8.append("Continuous AF");
                                        } else if (i9 == 3) {
                                            sb8.append("Multi AF");
                                        } else if (i9 == 4) {
                                            sb8.append("Face detect");
                                        } else if (i9 != 10) {
                                            StringBuilder sb9 = new StringBuilder();
                                            sb9.append("Unknown (");
                                            sb9.append(MediaBrowserCompat$ItemReceiver7[c2]);
                                            sb9.append(")");
                                            sb8.append(sb9.toString());
                                        } else {
                                            sb8.append("MF");
                                        }
                                        if (MediaBrowserCompat$ItemReceiver7.length > 1) {
                                            sb8.append("; ");
                                            int i10 = MediaBrowserCompat$ItemReceiver7[1];
                                            if (i10 == 0) {
                                                sb8.append("(none)");
                                            } else {
                                                if ((i10 & 1) > 0) {
                                                    sb8.append("S-AF, ");
                                                }
                                                if (((i10 >> 2) & 1) > 0) {
                                                    sb8.append("C-AF, ");
                                                }
                                                if (((i10 >> 4) & 1) > 0) {
                                                    sb8.append("MF, ");
                                                }
                                                if (((i10 >> 5) & 1) > 0) {
                                                    sb8.append("Face detect, ");
                                                }
                                                if (((i10 >> 6) & 1) > 0) {
                                                    sb8.append("Imager AF, ");
                                                }
                                                if (((i10 >> 7) & 1) > 0) {
                                                    sb8.append("Live View Magnification Frame, ");
                                                }
                                                if (((i10 >> 8) & 1) > 0) {
                                                    sb8.append("AF sensor, ");
                                                }
                                                sb8.setLength(sb8.length() - 2);
                                            }
                                        }
                                        return sb8.toString();
                                    case 770:
                                        int[] MediaBrowserCompat$ItemReceiver8 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(770);
                                        if (MediaBrowserCompat$ItemReceiver8 == null) {
                                            Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(770);
                                            if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                                                return null;
                                            }
                                            c3 = 0;
                                            MediaBrowserCompat$ItemReceiver8 = new int[]{MediaBrowserCompat$CustomActionResultReceiver5.intValue()};
                                        } else {
                                            c3 = 0;
                                        }
                                        if (MediaBrowserCompat$ItemReceiver8.length == 0) {
                                            return null;
                                        }
                                        StringBuilder sb10 = new StringBuilder();
                                        int i11 = MediaBrowserCompat$ItemReceiver8[c3];
                                        if (i11 == 0) {
                                            sb10.append("AF not used");
                                        } else if (i11 != 1) {
                                            StringBuilder sb11 = new StringBuilder();
                                            sb11.append("Unknown (");
                                            sb11.append(MediaBrowserCompat$ItemReceiver8[c3]);
                                            sb11.append(")");
                                            sb10.append(sb11.toString());
                                        } else {
                                            sb10.append("AF used");
                                        }
                                        if (MediaBrowserCompat$ItemReceiver8.length > 1) {
                                            StringBuilder sb12 = new StringBuilder();
                                            sb12.append("; ");
                                            sb12.append(MediaBrowserCompat$ItemReceiver8[1]);
                                            sb10.append(sb12.toString());
                                        }
                                        return sb10.toString();
                                    case 771:
                                        return MediaBrowserCompat$CustomActionResultReceiver(771, "Not Ready", "Ready");
                                    case 772:
                                        return MediaDescriptionCompat();
                                    case 773:
                                        copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem = ((getNObj) this.write).MediaBrowserCompat$MediaItem(773);
                                        if (MediaBrowserCompat$MediaItem == null) {
                                            return str2;
                                        }
                                        if (MediaBrowserCompat$MediaItem.length < 4) {
                                            return null;
                                        }
                                        int i12 = (MediaBrowserCompat$MediaItem.length == 5 && MediaBrowserCompat$MediaItem[0].longValue() == 0) ? 1 : 0;
                                        int doubleValue = (int) (MediaBrowserCompat$MediaItem[i12].doubleValue() * 100.0d);
                                        int doubleValue2 = (int) (MediaBrowserCompat$MediaItem[i12 + 1].doubleValue() * 100.0d);
                                        int doubleValue3 = (int) (MediaBrowserCompat$MediaItem[i12 + 2].doubleValue() * 100.0d);
                                        int doubleValue4 = (int) (MediaBrowserCompat$MediaItem[i12 + 3].doubleValue() * 100.0d);
                                        if (doubleValue + doubleValue2 + doubleValue3 + doubleValue4 == 0) {
                                            return str2;
                                        }
                                        return String.format("(%d%%,%d%%) (%d%%,%d%%)", new Object[]{Integer.valueOf(doubleValue), Integer.valueOf(doubleValue2), Integer.valueOf(doubleValue3), Integer.valueOf(doubleValue4)});
                                    case 774:
                                        return MediaBrowserCompat$CustomActionResultReceiver(774, "Off", "On");
                                    default:
                                        switch (i2) {
                                            case 2304:
                                                Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(2304);
                                                if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                                                    return null;
                                                }
                                                return String.format("%s kPa", new Object[]{new DecimalFormat("#.##").format(((double) MediaBrowserCompat$CustomActionResultReceiver6.intValue()) / 10.0d)});
                                            case 2305:
                                                int[] MediaBrowserCompat$ItemReceiver9 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(2305);
                                                if (MediaBrowserCompat$ItemReceiver9 == null || MediaBrowserCompat$ItemReceiver9.length < 2) {
                                                    return null;
                                                }
                                                DecimalFormat decimalFormat = new DecimalFormat("#.##");
                                                return String.format("%s m, %s ft", new Object[]{decimalFormat.format(((double) MediaBrowserCompat$ItemReceiver9[0]) / 10.0d), decimalFormat.format(((double) MediaBrowserCompat$ItemReceiver9[1]) / 10.0d)});
                                            case 2306:
                                                return MediaBrowserCompat$CustomActionResultReceiver(2306, "Off", "On");
                                            case 2307:
                                                int[] MediaBrowserCompat$ItemReceiver10 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(2307);
                                                if (MediaBrowserCompat$ItemReceiver10 == null || MediaBrowserCompat$ItemReceiver10.length < 2) {
                                                    return null;
                                                }
                                                if (MediaBrowserCompat$ItemReceiver10[0] != 0) {
                                                    str2 = Double.toString(((double) (-MediaBrowserCompat$ItemReceiver10[0])) / 10.0d);
                                                }
                                                return String.format("%s %d", new Object[]{str2, Integer.valueOf(MediaBrowserCompat$ItemReceiver10[1])});
                                            case 2308:
                                                int[] MediaBrowserCompat$ItemReceiver11 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(2308);
                                                if (MediaBrowserCompat$ItemReceiver11 == null || MediaBrowserCompat$ItemReceiver11.length < 2) {
                                                    return null;
                                                }
                                                if (MediaBrowserCompat$ItemReceiver11[0] != 0) {
                                                    str2 = Double.toString(((double) MediaBrowserCompat$ItemReceiver11[0]) / 10.0d);
                                                }
                                                return String.format("%s %d", new Object[]{str2, Integer.valueOf(MediaBrowserCompat$ItemReceiver11[1])});
                                            default:
                                                switch (i2) {
                                                    case 512:
                                                        return write(512, 1, "Manual", "Program", "Aperture-priority AE", "Shutter speed priority", "Program-shift");
                                                    case 513:
                                                        return MediaBrowserCompat$CustomActionResultReceiver(513, "Off", "On");
                                                    case 514:
                                                        Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(514);
                                                        if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                                                            return null;
                                                        }
                                                        int intValue2 = MediaBrowserCompat$CustomActionResultReceiver7.intValue();
                                                        if (intValue2 == 2) {
                                                            return "Center-weighted average";
                                                        }
                                                        if (intValue2 == 3) {
                                                            return "Spot";
                                                        }
                                                        if (intValue2 == 5) {
                                                            return "ESP";
                                                        }
                                                        if (intValue2 == 261) {
                                                            return "Pattern+AF";
                                                        }
                                                        if (intValue2 == 515) {
                                                            return "Spot+Highlight control";
                                                        }
                                                        if (intValue2 == 1027) {
                                                            return "Spot+Shadow control";
                                                        }
                                                        StringBuilder sb13 = new StringBuilder();
                                                        sb13.append("Unknown (");
                                                        sb13.append(MediaBrowserCompat$CustomActionResultReceiver7);
                                                        sb13.append(")");
                                                        return sb13.toString();
                                                    case 515:
                                                        return MediaBrowserCompat$ItemReceiver();
                                                    case 516:
                                                        return MediaBrowserCompat$CustomActionResultReceiver(516, "Off", "On");
                                                    default:
                                                        switch (i2) {
                                                            case Place.TYPE_SUBLOCALITY_LEVEL_5:
                                                                Integer MediaBrowserCompat$CustomActionResultReceiver8 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(Place.TYPE_SUBLOCALITY_LEVEL_5);
                                                                if (MediaBrowserCompat$CustomActionResultReceiver8 == null) {
                                                                    return null;
                                                                }
                                                                int intValue3 = MediaBrowserCompat$CustomActionResultReceiver8.intValue();
                                                                if (intValue3 == 0) {
                                                                    return "Off";
                                                                }
                                                                if (intValue3 == 1) {
                                                                    return "Channel 1, Low";
                                                                }
                                                                if (intValue3 == 2) {
                                                                    return "Channel 2, Low";
                                                                }
                                                                if (intValue3 == 3) {
                                                                    return "Channel 3, Low";
                                                                }
                                                                if (intValue3 == 4) {
                                                                    return "Channel 4, Low";
                                                                }
                                                                switch (intValue3) {
                                                                    case 9:
                                                                        return "Channel 1, Mid";
                                                                    case 10:
                                                                        return "Channel 2, Mid";
                                                                    case 11:
                                                                        return "Channel 3, Mid";
                                                                    case 12:
                                                                        return "Channel 4, Mid";
                                                                    default:
                                                                        switch (intValue3) {
                                                                            case 17:
                                                                                return "Channel 1, High";
                                                                            case 18:
                                                                                return "Channel 2, High";
                                                                            case 19:
                                                                                return "Channel 3, High";
                                                                            case 20:
                                                                                return "Channel 4, High";
                                                                            default:
                                                                                StringBuilder sb14 = new StringBuilder();
                                                                                sb14.append("Unknown (");
                                                                                sb14.append(MediaBrowserCompat$CustomActionResultReceiver8);
                                                                                sb14.append(")");
                                                                                return sb14.toString();
                                                                        }
                                                                }
                                                            case Place.TYPE_SUBPREMISE:
                                                                return MediaMetadataCompat();
                                                            case Place.TYPE_SYNTHETIC_GEOCODE:
                                                                return RatingCompat();
                                                            case Place.TYPE_TRANSIT_STATION:
                                                                return MediaSessionCompat$Token();
                                                            default:
                                                                switch (i2) {
                                                                    case 1283:
                                                                        return RatingCompat(1283);
                                                                    case 1284:
                                                                        return MediaBrowserCompat$CustomActionResultReceiver(1284, "Off", "CM1 (Red Enhance)", "CM2 (Green Enhance)", "CM3 (Blue Enhance)", "CM4 (Skin Tones)");
                                                                    case 1285:
                                                                        return RatingCompat(1285);
                                                                    case 1286:
                                                                        return RatingCompat(1286);
                                                                    case 1287:
                                                                        return MediaBrowserCompat$CustomActionResultReceiver(1287, "sRGB", "Adobe RGB", "Pro Photo RGB");
                                                                    default:
                                                                        switch (i2) {
                                                                            case 1289:
                                                                                Integer MediaBrowserCompat$CustomActionResultReceiver9 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(1289);
                                                                                if (MediaBrowserCompat$CustomActionResultReceiver9 == null) {
                                                                                    return null;
                                                                                }
                                                                                int intValue4 = MediaBrowserCompat$CustomActionResultReceiver9.intValue();
                                                                                if (intValue4 == 0) {
                                                                                    return "Standard";
                                                                                }
                                                                                if (intValue4 == 54) {
                                                                                    return "Face Portrait";
                                                                                }
                                                                                if (intValue4 == 57) {
                                                                                    return "Bulb";
                                                                                }
                                                                                if (intValue4 == 142) {
                                                                                    return "Hand-held Starlight";
                                                                                }
                                                                                if (intValue4 == 154) {
                                                                                    return "HDR";
                                                                                }
                                                                                if (intValue4 == 59) {
                                                                                    return "Smile Shot";
                                                                                }
                                                                                if (intValue4 == 60) {
                                                                                    return "Quick Shutter";
                                                                                }
                                                                                switch (intValue4) {
                                                                                    case 6:
                                                                                        return "Auto";
                                                                                    case 7:
                                                                                        return "Sport";
                                                                                    case 8:
                                                                                        return "Portrait";
                                                                                    case 9:
                                                                                        return "Landscape+Portrait";
                                                                                    case 10:
                                                                                        return "Landscape";
                                                                                    case 11:
                                                                                        return "Night Scene";
                                                                                    case 12:
                                                                                        return "Self Portrait";
                                                                                    case 13:
                                                                                        return "Panorama";
                                                                                    case 14:
                                                                                        return "2 in 1";
                                                                                    case 15:
                                                                                        return "Movie";
                                                                                    case 16:
                                                                                        return "Landscape+Portrait";
                                                                                    case 17:
                                                                                        return "Night+Portrait";
                                                                                    case 18:
                                                                                        return "Indoor";
                                                                                    case 19:
                                                                                        return "Fireworks";
                                                                                    case 20:
                                                                                        return "Sunset";
                                                                                    case 21:
                                                                                        return "Beauty Skin";
                                                                                    case 22:
                                                                                        return "Macro";
                                                                                    case 23:
                                                                                        return "Super Macro";
                                                                                    case 24:
                                                                                        return "Food";
                                                                                    case 25:
                                                                                        return "Documents";
                                                                                    case 26:
                                                                                        return "Museum";
                                                                                    case 27:
                                                                                        return "Shoot & Select";
                                                                                    case 28:
                                                                                        return "Beach & Snow";
                                                                                    case 29:
                                                                                        return "Self Portrait+Timer";
                                                                                    case 30:
                                                                                        return "Candle";
                                                                                    case 31:
                                                                                        return "Available Light";
                                                                                    case 32:
                                                                                        return "Behind Glass";
                                                                                    case 33:
                                                                                        return "My Mode";
                                                                                    case 34:
                                                                                        return "Pet";
                                                                                    case 35:
                                                                                        return "Underwater Wide1";
                                                                                    case 36:
                                                                                        return "Underwater Macro";
                                                                                    case 37:
                                                                                        return "Shoot & Select1";
                                                                                    case 38:
                                                                                        return "Shoot & Select2";
                                                                                    case 39:
                                                                                        return "High Key";
                                                                                    case 40:
                                                                                        return "Digital Image Stabilization";
                                                                                    case 41:
                                                                                        return "Auction";
                                                                                    case 42:
                                                                                        return "Beach";
                                                                                    case 43:
                                                                                        return "Snow";
                                                                                    case 44:
                                                                                        return "Underwater Wide2";
                                                                                    case 45:
                                                                                        return "Low Key";
                                                                                    case 46:
                                                                                        return "Children";
                                                                                    case 47:
                                                                                        return "Vivid";
                                                                                    case 48:
                                                                                        return "Nature Macro";
                                                                                    case 49:
                                                                                        return "Underwater Snapshot";
                                                                                    case 50:
                                                                                        return "Shooting Guide";
                                                                                    default:
                                                                                        switch (intValue4) {
                                                                                            case 63:
                                                                                                return "Slow Shutter";
                                                                                            case 64:
                                                                                                return "Bird Watching";
                                                                                            case 65:
                                                                                                return "Multiple Exposure";
                                                                                            case 66:
                                                                                                return "e-Portrait";
                                                                                            case 67:
                                                                                                return "Soft Background Shot";
                                                                                            default:
                                                                                                StringBuilder sb15 = new StringBuilder();
                                                                                                sb15.append("Unknown (");
                                                                                                sb15.append(MediaBrowserCompat$CustomActionResultReceiver9);
                                                                                                sb15.append(")");
                                                                                                return sb15.toString();
                                                                                        }
                                                                                }
                                                                            case 1290:
                                                                                Integer MediaBrowserCompat$CustomActionResultReceiver10 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(1290);
                                                                                if (MediaBrowserCompat$CustomActionResultReceiver10 == null) {
                                                                                    return null;
                                                                                }
                                                                                if (MediaBrowserCompat$CustomActionResultReceiver10.intValue() == 0) {
                                                                                    return "(none)";
                                                                                }
                                                                                StringBuilder sb16 = new StringBuilder();
                                                                                int intValue5 = MediaBrowserCompat$CustomActionResultReceiver10.intValue();
                                                                                if ((intValue5 & 1) != 0) {
                                                                                    sb16.append("Noise Reduction, ");
                                                                                }
                                                                                if (((intValue5 >> 1) & 1) != 0) {
                                                                                    sb16.append("Noise Filter, ");
                                                                                }
                                                                                if (((intValue5 >> 2) & 1) != 0) {
                                                                                    sb16.append("Noise Filter (ISO Boost), ");
                                                                                }
                                                                                if (((intValue5 >> 3) & 1) != 0) {
                                                                                    sb16.append("Auto, ");
                                                                                }
                                                                                if (sb16.length() != 0) {
                                                                                    return sb16.substring(0, sb16.length() - 2);
                                                                                }
                                                                                return "(none)";
                                                                            case 1291:
                                                                                return MediaBrowserCompat$CustomActionResultReceiver(1291, "Off", "On");
                                                                            case 1292:
                                                                                return MediaBrowserCompat$CustomActionResultReceiver(1292, "Off", "On");
                                                                            default:
                                                                                switch (i2) {
                                                                                    case 1315:
                                                                                        return RatingCompat(1315);
                                                                                    case 1316:
                                                                                        return RatingCompat(1316);
                                                                                    case 1317:
                                                                                        return MediaBrowserCompat$CustomActionResultReceiver(1317, "n/a", "Neutral", "Yellow", "Orange", "Red", "Green");
                                                                                    case 1318:
                                                                                        return MediaBrowserCompat$CustomActionResultReceiver(1318, "n/a", "Neutral", "Sepia", "Blue", "Purple", "Green");
                                                                                    case 1319:
                                                                                        int[] MediaBrowserCompat$ItemReceiver12 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1319);
                                                                                        if (MediaBrowserCompat$ItemReceiver12 == null) {
                                                                                            return null;
                                                                                        }
                                                                                        String format2 = String.format("%d %d %d", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver12[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver12[1]), Integer.valueOf(MediaBrowserCompat$ItemReceiver12[2])});
                                                                                        if (format2.equals("0 0 0")) {
                                                                                            return str2;
                                                                                        }
                                                                                        if (format2.equals("-2 -2 1")) {
                                                                                            return "Off";
                                                                                        }
                                                                                        if (format2.equals("-1 -2 1")) {
                                                                                            return "Low";
                                                                                        }
                                                                                        if (format2.equals("0 -2 1")) {
                                                                                            return "Standard";
                                                                                        }
                                                                                        if (format2.equals("1 -2 1")) {
                                                                                            return "High";
                                                                                        }
                                                                                        StringBuilder sb17 = new StringBuilder();
                                                                                        sb17.append("Unknown (");
                                                                                        sb17.append(format2);
                                                                                        sb17.append(")");
                                                                                        return sb17.toString();
                                                                                    default:
                                                                                        switch (i2) {
                                                                                            case 1324:
                                                                                                return MediaBrowserCompat$MediaItem(1324);
                                                                                            case 1325:
                                                                                                int[] MediaBrowserCompat$ItemReceiver13 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1325);
                                                                                                if (MediaBrowserCompat$ItemReceiver13 == null) {
                                                                                                    return null;
                                                                                                }
                                                                                                String format3 = String.format("%d %d %d", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver13[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver13[1]), Integer.valueOf(MediaBrowserCompat$ItemReceiver13[2])});
                                                                                                if (format3.equals("0 0 0")) {
                                                                                                    return str2;
                                                                                                }
                                                                                                if (format3.equals("-1 -1 1")) {
                                                                                                    return "Low";
                                                                                                }
                                                                                                if (format3.equals("0 -1 1")) {
                                                                                                    return "Standard";
                                                                                                }
                                                                                                if (format3.equals("1 -1 1")) {
                                                                                                    return "High";
                                                                                                }
                                                                                                StringBuilder sb18 = new StringBuilder();
                                                                                                sb18.append("Unknown (");
                                                                                                sb18.append(format3);
                                                                                                sb18.append(")");
                                                                                                return sb18.toString();
                                                                                            case 1326:
                                                                                                return MediaSessionCompat$ResultReceiverWrapper();
                                                                                            case 1327:
                                                                                                int[] MediaBrowserCompat$ItemReceiver14 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1327);
                                                                                                if (MediaBrowserCompat$ItemReceiver14 == null) {
                                                                                                    return null;
                                                                                                }
                                                                                                StringBuilder sb19 = new StringBuilder();
                                                                                                for (int i13 = 0; i13 < MediaBrowserCompat$ItemReceiver14.length; i13++) {
                                                                                                    if (i13 == 0) {
                                                                                                        sb19.append(read.containsKey(Integer.valueOf(MediaBrowserCompat$ItemReceiver14[i13])) ? read.get(Integer.valueOf(MediaBrowserCompat$ItemReceiver14[i13])) : "[unknown]");
                                                                                                        sb19.append("; ");
                                                                                                    } else if (i13 == 3) {
                                                                                                        sb19.append("Partial Color ");
                                                                                                        sb19.append(MediaBrowserCompat$ItemReceiver14[i13]);
                                                                                                        sb19.append("; ");
                                                                                                    } else if (i13 == 4) {
                                                                                                        switch (MediaBrowserCompat$ItemReceiver14[i13]) {
                                                                                                            case 0:
                                                                                                                sb19.append("No Effect");
                                                                                                                break;
                                                                                                            case 32784:
                                                                                                                sb19.append("Star Light");
                                                                                                                break;
                                                                                                            case 32800:
                                                                                                                sb19.append("Pin Hole");
                                                                                                                break;
                                                                                                            case 32816:
                                                                                                                sb19.append("Frame");
                                                                                                                break;
                                                                                                            case 32832:
                                                                                                                sb19.append("Soft Focus");
                                                                                                                break;
                                                                                                            case 32848:
                                                                                                                sb19.append("White Edge");
                                                                                                                break;
                                                                                                            case 32864:
                                                                                                                sb19.append("B&W");
                                                                                                                break;
                                                                                                            default:
                                                                                                                sb19.append("Unknown (");
                                                                                                                sb19.append(MediaBrowserCompat$ItemReceiver14[i13]);
                                                                                                                sb19.append(")");
                                                                                                                break;
                                                                                                        }
                                                                                                        sb19.append("; ");
                                                                                                    } else if (i13 == 6) {
                                                                                                        int i14 = MediaBrowserCompat$ItemReceiver14[i13];
                                                                                                        if (i14 == 0) {
                                                                                                            sb19.append("No Color Filter");
                                                                                                        } else if (i14 == 1) {
                                                                                                            sb19.append("Yellow Color Filter");
                                                                                                        } else if (i14 == 2) {
                                                                                                            sb19.append("Orange Color Filter");
                                                                                                        } else if (i14 == 3) {
                                                                                                            sb19.append("Red Color Filter");
                                                                                                        } else if (i14 != 4) {
                                                                                                            sb19.append("Unknown (");
                                                                                                            sb19.append(MediaBrowserCompat$ItemReceiver14[i13]);
                                                                                                            sb19.append(")");
                                                                                                        } else {
                                                                                                            sb19.append("Green Color Filter");
                                                                                                        }
                                                                                                        sb19.append("; ");
                                                                                                    } else {
                                                                                                        sb19.append(MediaBrowserCompat$ItemReceiver14[i13]);
                                                                                                        sb19.append("; ");
                                                                                                    }
                                                                                                }
                                                                                                return sb19.substring(0, sb19.length() - 2);
                                                                                            default:
                                                                                                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                                                                                        }
                                                                                }
                                                                        }
                                                                }
                                                        }
                                                }
                                        }
                                }
                            }
                        }
                    } else {
                        Integer MediaBrowserCompat$CustomActionResultReceiver11 = ((getNObj) this.write).MediaBrowserCompat$CustomActionResultReceiver(1024);
                        if (MediaBrowserCompat$CustomActionResultReceiver11 == null) {
                            return null;
                        }
                        if (MediaBrowserCompat$CustomActionResultReceiver11.intValue() == 0) {
                            return "Off";
                        }
                        StringBuilder sb20 = new StringBuilder();
                        int intValue6 = MediaBrowserCompat$CustomActionResultReceiver11.intValue();
                        if ((intValue6 & 1) != 0) {
                            sb20.append("On, ");
                        }
                        if (((intValue6 >> 1) & 1) != 0) {
                            sb20.append("Fill-in, ");
                        }
                        if (((intValue6 >> 2) & 1) != 0) {
                            sb20.append("Red-eye, ");
                        }
                        if (((intValue6 >> 3) & 1) != 0) {
                            sb20.append("Slow-sync, ");
                        }
                        if (((intValue6 >> 4) & 1) != 0) {
                            sb20.append("Forced On, ");
                        }
                        if (((intValue6 >> 5) & 1) != 0) {
                            sb20.append("2nd Curtain, ");
                        }
                        return sb20.substring(0, sb20.length() - 2);
                    }
                }
            }
        }
        return IconCompatParcelizer(0, 4);
    }

    private String MediaDescriptionCompat() {
        Object obj = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver.get(772);
        if (obj == null || !(obj instanceof long[])) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (long j : (long[]) obj) {
            if (j != 0) {
                if (sb.length() != 0) {
                    sb.append(", ");
                }
                if (j == 913916549) {
                    sb.append("Left ");
                } else if (j == 2038007173) {
                    sb.append("Center ");
                } else if (j == 3178875269L) {
                    sb.append("Right ");
                }
                sb.append(String.format("(%d/255,%d/255)-(%d/255,%d/255)", new Object[]{Long.valueOf((j >> 24) & 255), Long.valueOf((j >> 16) & 255), Long.valueOf((j >> 8) & 255), Long.valueOf(j & 255)}));
            }
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    private String MediaMetadataCompat() {
        int[] MediaBrowserCompat$ItemReceiver2 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(Place.TYPE_SUBPREMISE);
        if (MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int i = MediaBrowserCompat$ItemReceiver2[0];
        if (i == 0) {
            sb.append("Off");
        } else if (i == 3) {
            sb.append("TTL");
        } else if (i == 4) {
            sb.append("Auto");
        } else if (i != 5) {
            sb.append("Unknown (");
            sb.append(MediaBrowserCompat$ItemReceiver2[0]);
            sb.append(")");
        } else {
            sb.append("Manual");
        }
        for (int i2 = 1; i2 < MediaBrowserCompat$ItemReceiver2.length; i2++) {
            sb.append("; ");
            sb.append(MediaBrowserCompat$ItemReceiver2[i2]);
        }
        return sb.toString();
    }

    private String RatingCompat() {
        copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem = ((getNObj) this.write).MediaBrowserCompat$MediaItem(Place.TYPE_SYNTHETIC_GEOCODE);
        if (MediaBrowserCompat$MediaItem == null || MediaBrowserCompat$MediaItem.length == 0) {
            return null;
        }
        if (MediaBrowserCompat$MediaItem.length == 3) {
            if (MediaBrowserCompat$MediaItem[0].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[1].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[2].MediaBrowserCompat$ItemReceiver == 0) {
                return "n/a";
            }
        } else if (MediaBrowserCompat$MediaItem.length == 4 && MediaBrowserCompat$MediaItem[0].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[1].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[2].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[3].MediaBrowserCompat$ItemReceiver == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (copy3DRangeFromUnchecked append : MediaBrowserCompat$MediaItem) {
            sb.append(append);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    private String MediaSessionCompat$Token() {
        copy3DRangeFromUnchecked[] MediaBrowserCompat$MediaItem = ((getNObj) this.write).MediaBrowserCompat$MediaItem(Place.TYPE_TRANSIT_STATION);
        if (MediaBrowserCompat$MediaItem == null || MediaBrowserCompat$MediaItem.length == 0) {
            return "n/a";
        }
        if (MediaBrowserCompat$MediaItem.length == 3) {
            if (MediaBrowserCompat$MediaItem[0].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[1].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[2].MediaBrowserCompat$ItemReceiver == 0) {
                return "n/a";
            }
        } else if (MediaBrowserCompat$MediaItem.length == 4 && MediaBrowserCompat$MediaItem[0].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[1].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[2].MediaBrowserCompat$ItemReceiver == 0 && MediaBrowserCompat$MediaItem[3].MediaBrowserCompat$ItemReceiver == 0) {
            return "n/a (x4)";
        }
        StringBuilder sb = new StringBuilder();
        for (copy3DRangeFromUnchecked append : MediaBrowserCompat$MediaItem) {
            sb.append(append);
            sb.append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    private String MediaBrowserCompat$MediaItem() {
        return MediaBrowserCompat$MediaItem(1321);
    }

    private String MediaSessionCompat$ResultReceiverWrapper() {
        int[] MediaBrowserCompat$ItemReceiver2 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1326);
        if (MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.length; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 12 || i == 16 || i == 20 || i == 24) {
                sb.append(MediaBrowserCompat$ItemReceiver.get(Integer.valueOf(MediaBrowserCompat$ItemReceiver2[i])));
                sb.append("; ");
            } else {
                sb.append(MediaBrowserCompat$ItemReceiver2[i]);
                sb.append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    private String MediaBrowserCompat$SearchResultReceiver() {
        int[] MediaBrowserCompat$ItemReceiver2 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(1330);
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.length; i++) {
            if (i == 0) {
                sb.append("Color ");
                sb.append(MediaBrowserCompat$ItemReceiver2[i]);
                sb.append("; ");
            } else if (i == 3) {
                sb.append("Strength ");
                sb.append(MediaBrowserCompat$ItemReceiver2[i]);
                sb.append("; ");
            } else {
                sb.append(MediaBrowserCompat$ItemReceiver2[i]);
                sb.append("; ");
            }
        }
        return sb.substring(0, sb.length() - 2);
    }

    private String RatingCompat(int i) {
        int[] MediaBrowserCompat$ItemReceiver2 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(i);
        if (MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.length < 3) {
            return null;
        }
        return String.format("%d (min %d, max %d)", new Object[]{Integer.valueOf(MediaBrowserCompat$ItemReceiver2[0]), Integer.valueOf(MediaBrowserCompat$ItemReceiver2[1]), Integer.valueOf(MediaBrowserCompat$ItemReceiver2[2])});
    }

    private String MediaBrowserCompat$MediaItem(int i) {
        int[] MediaBrowserCompat$ItemReceiver2 = ((getNObj) this.write).MediaBrowserCompat$ItemReceiver(i);
        if (MediaBrowserCompat$ItemReceiver2 == null || MediaBrowserCompat$ItemReceiver2.length == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < MediaBrowserCompat$ItemReceiver2.length; i2++) {
            if (i2 == 0) {
                sb.append(read.containsKey(Integer.valueOf(MediaBrowserCompat$ItemReceiver2[i2])) ? read.get(Integer.valueOf(MediaBrowserCompat$ItemReceiver2[i2])) : "[unknown]");
            } else {
                sb.append(MediaBrowserCompat$ItemReceiver2[i2]);
            }
            sb.append("; ");
        }
        return sb.substring(0, sb.length() - 2);
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        read = hashMap;
        hashMap.put(0, "Off");
        read.put(1, "Soft Focus");
        read.put(2, "Pop Art");
        read.put(3, "Pale & Light Color");
        read.put(4, "Light Tone");
        read.put(5, "Pin Hole");
        read.put(6, "Grainy Film");
        read.put(9, "Diorama");
        read.put(10, "Cross Process");
        read.put(12, "Fish Eye");
        read.put(13, "Drawing");
        read.put(14, "Gentle Sepia");
        read.put(15, "Pale & Light Color II");
        read.put(16, "Pop Art II");
        read.put(17, "Pin Hole II");
        read.put(18, "Pin Hole III");
        read.put(19, "Grainy Film II");
        read.put(20, "Dramatic Tone");
        read.put(21, "Punk");
        read.put(22, "Soft Focus 2");
        read.put(23, "Sparkle");
        read.put(24, "Watercolor");
        read.put(25, "Key Line");
        read.put(26, "Key Line II");
        read.put(27, "Miniature");
        read.put(28, "Reflection");
        read.put(29, "Fragmented");
        read.put(31, "Cross Process II");
        read.put(32, "Dramatic Tone II");
        read.put(33, "Watercolor I");
        read.put(34, "Watercolor II");
        read.put(35, "Diorama II");
        read.put(36, "Vintage");
        read.put(37, "Vintage II");
        read.put(38, "Vintage III");
        read.put(39, "Partial Color");
        read.put(40, "Partial Color II");
        read.put(41, "Partial Color III");
        MediaBrowserCompat$ItemReceiver.put(0, "0");
        MediaBrowserCompat$ItemReceiver.put(-31999, "Highlights ");
        MediaBrowserCompat$ItemReceiver.put(-31998, "Shadows ");
        MediaBrowserCompat$ItemReceiver.put(-31997, "Midtones ");
    }
}
