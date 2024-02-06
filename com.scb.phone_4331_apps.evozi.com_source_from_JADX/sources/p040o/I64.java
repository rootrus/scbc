package p040o;

import com.kofax.kmc.kut.utilities.IpLibUtil;

/* renamed from: o.I64 */
public final class I64 extends createCubemapFromCubeFaces<I32_4> {
    public I64(I32_4 i32_4) {
        super(i32_4);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        switch (i) {
            case 258:
                return MediaBrowserCompat$CustomActionResultReceiver(258, "RAW", "Super Fine", "Fine", "Standard", "Economy", "Extra Fine", "RAW + JPEG", "Compressed RAW", "Compressed RAW + JPEG");
            case 260:
                return read(260, "%d EV");
            case 261:
                Integer MediaBrowserCompat$CustomActionResultReceiver = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(261);
                if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                    return null;
                }
                int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
                if (intValue == 0) {
                    return "None";
                }
                if (intValue == 72) {
                    return "Minolta/Sony AF 2x APO (D)";
                }
                if (intValue == 80) {
                    return "Minolta AF 2x APO II";
                }
                if (intValue == 96) {
                    return "Minolta AF 2x APO";
                }
                if (intValue == 136) {
                    return "Minolta/Sony AF 1.4x APO (D)";
                }
                if (intValue == 144) {
                    return "Minolta AF 1.4x APO II";
                }
                if (intValue == 160) {
                    return "Minolta AF 1.4x APO";
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Unknown (");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                sb.append(")");
                return sb.toString();
            case 277:
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(277);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                int intValue2 = MediaBrowserCompat$CustomActionResultReceiver2.intValue();
                if (intValue2 == 0) {
                    return "Auto";
                }
                if (intValue2 == 1) {
                    return "Color Temperature/Color Filter";
                }
                if (intValue2 == 16) {
                    return "Daylight";
                }
                if (intValue2 == 32) {
                    return "Cloudy";
                }
                if (intValue2 == 48) {
                    return "Shade";
                }
                if (intValue2 == 64) {
                    return "Tungsten";
                }
                if (intValue2 == 80) {
                    return "Flash";
                }
                if (intValue2 == 96) {
                    return "Fluorescent";
                }
                if (intValue2 == 112) {
                    return "Custom";
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Unknown (");
                sb2.append(MediaBrowserCompat$CustomActionResultReceiver2);
                sb2.append(")");
                return sb2.toString();
            case 8201:
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(8201);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                int intValue3 = MediaBrowserCompat$CustomActionResultReceiver3.intValue();
                if (intValue3 == 0) {
                    return "Off";
                }
                if (intValue3 == 1) {
                    return "On";
                }
                if (intValue3 == 2) {
                    return "Normal";
                }
                if (intValue3 == 3) {
                    return "High";
                }
                if (intValue3 == 256) {
                    return "Auto";
                }
                if (intValue3 == 65535) {
                    return "N/A";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver3});
            case 8206:
                Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(8206);
                if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                    return null;
                }
                int intValue4 = MediaBrowserCompat$CustomActionResultReceiver4.intValue();
                if (intValue4 == 13) {
                    return "High Contrast Monochrome";
                }
                if (intValue4 == 80) {
                    return "Rich-tone Monochrome";
                }
                if (intValue4 == 97) {
                    return "Water Color";
                }
                if (intValue4 == 98) {
                    return "Water Color 2";
                }
                switch (intValue4) {
                    case 0:
                        return "Off";
                    case 1:
                        return "Toy Camera";
                    case 2:
                        return "Pop Color";
                    case 3:
                        return "Posterization";
                    case 4:
                        return "Posterization B/W";
                    case 5:
                        return "Retro Photo";
                    case 6:
                        return "Soft High Key";
                    case 7:
                        return "Partial Color (red)";
                    case 8:
                        return "Partial Color (green)";
                    case 9:
                        return "Partial Color (blue)";
                    case 10:
                        return "Partial Color (yellow)";
                    default:
                        switch (intValue4) {
                            case 16:
                                return "Toy Camera (normal)";
                            case 17:
                                return "Toy Camera (cool)";
                            case 18:
                                return "Toy Camera (warm)";
                            case 19:
                                return "Toy Camera (green)";
                            case 20:
                                return "Toy Camera (magenta)";
                            default:
                                switch (intValue4) {
                                    case 32:
                                        return "Soft Focus (low)";
                                    case 33:
                                        return "Soft Focus";
                                    case 34:
                                        return "Soft Focus (high)";
                                    default:
                                        switch (intValue4) {
                                            case 48:
                                                return "Miniature (auto)";
                                            case 49:
                                                return "Miniature (top)";
                                            case 50:
                                                return "Miniature (middle horizontal)";
                                            case 51:
                                                return "Miniature (bottom)";
                                            case 52:
                                                return "Miniature (left)";
                                            case 53:
                                                return "Miniature (middle vertical)";
                                            case 54:
                                                return "Miniature (right)";
                                            default:
                                                switch (intValue4) {
                                                    case 64:
                                                        return "HDR Painting (low)";
                                                    case 65:
                                                        return "HDR Painting";
                                                    case 66:
                                                        return "HDR Painting (high)";
                                                    default:
                                                        switch (intValue4) {
                                                            case 112:
                                                                return "Illustration (low)";
                                                            case 113:
                                                                return "Illustration";
                                                            case 114:
                                                                return "Illustration (high)";
                                                            default:
                                                                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver4});
                                                        }
                                                }
                                        }
                                }
                        }
                }
            case 8207:
                return MediaBrowserCompat$CustomActionResultReceiver(8207, "Off", "Low", "Mid", "High");
            case 8209:
                Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(8209);
                if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                    return null;
                }
                int intValue5 = MediaBrowserCompat$CustomActionResultReceiver5.intValue();
                if (intValue5 == -1) {
                    return "N/A";
                }
                if (intValue5 == 0) {
                    return "Off";
                }
                if (intValue5 == 2) {
                    return "Auto";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver5});
            case 8210:
                Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(8210);
                if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                    return null;
                }
                int intValue6 = MediaBrowserCompat$CustomActionResultReceiver6.intValue();
                if (intValue6 == -1) {
                    return "N/A";
                }
                if (intValue6 == 0) {
                    return "Off";
                }
                if (intValue6 == 2) {
                    return "Auto";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver6});
            case 8211:
                Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(8211);
                if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                    return null;
                }
                int intValue7 = MediaBrowserCompat$CustomActionResultReceiver7.intValue();
                if (intValue7 == -1) {
                    return "N/A";
                }
                if (intValue7 == 0) {
                    return "Off";
                }
                if (intValue7 == 2) {
                    return "Auto";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver7});
            case 8214:
                return MediaBrowserCompat$CustomActionResultReceiver(8214, "No", "Yes");
            case 8219:
                return MediaBrowserCompat$CustomActionResultReceiver(8219, "Manual", null, "AF-A", "AF-C", "AF-S", null, "DMF", "AF-D");
            case 8222:
                return MediaBrowserCompat$CustomActionResultReceiver(8222, "Auto", "Center", "Top", "Upper-right", "Right", "Lower-right", "Bottom", "Lower-left", "Left", "Upper-left\t  \t", "Far Right", "Far Left", "Upper-middle", "Near Right", "Lower-middle", "Near Left", "Upper Far Right", "Lower Far Right", "Lower Far Left", "Upper Far Left");
            case 45057:
                Integer MediaBrowserCompat$CustomActionResultReceiver8 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45057);
                if (MediaBrowserCompat$CustomActionResultReceiver8 == null) {
                    return null;
                }
                int intValue8 = MediaBrowserCompat$CustomActionResultReceiver8.intValue();
                if (intValue8 == 2) {
                    return "DSC-R1";
                }
                if (intValue8 == 269) {
                    return "DSLR-A850";
                }
                if (intValue8 == 270) {
                    return "DSLR-A850 (APS-C mode)";
                }
                switch (intValue8) {
                    case 256:
                        return "DSLR-A100";
                    case 257:
                        return "DSLR-A900";
                    case 258:
                        return "DSLR-A700";
                    case 259:
                        return "DSLR-A200";
                    case 260:
                        return "DSLR-A350";
                    case 261:
                        return "DSLR-A300";
                    case 262:
                        return "DSLR-A900 (APS-C mode)";
                    case 263:
                        return "DSLR-A380/A390";
                    case 264:
                        return "DSLR-A330";
                    case 265:
                        return "DSLR-A230";
                    case 266:
                        return "DSLR-A290";
                    default:
                        switch (intValue8) {
                            case 273:
                                return "DSLR-A550";
                            case 274:
                                return "DSLR-A500";
                            case 275:
                                return "DSLR-A450";
                            default:
                                switch (intValue8) {
                                    case 278:
                                        return "NEX-5";
                                    case 279:
                                        return "NEX-3";
                                    case 280:
                                        return "SLT-A33";
                                    case 281:
                                        return "SLT-A55V";
                                    case 282:
                                        return "DSLR-A560";
                                    case 283:
                                        return "DSLR-A580";
                                    case 284:
                                        return "NEX-C3";
                                    case 285:
                                        return "SLT-A35";
                                    case 286:
                                        return "SLT-A65V";
                                    case 287:
                                        return "SLT-A77V";
                                    case 288:
                                        return "NEX-5N";
                                    case 289:
                                        return "NEX-7";
                                    case 290:
                                        return "NEX-VG20E";
                                    case 291:
                                        return "SLT-A37";
                                    case 292:
                                        return "SLT-A57";
                                    case 293:
                                        return "NEX-F3";
                                    case 294:
                                        return "SLT-A99V";
                                    case 295:
                                        return "NEX-6";
                                    case 296:
                                        return "NEX-5R";
                                    case 297:
                                        return "DSC-RX100";
                                    case 298:
                                        return "DSC-RX1";
                                    default:
                                        StringBuilder sb3 = new StringBuilder();
                                        sb3.append("Unknown (");
                                        sb3.append(MediaBrowserCompat$CustomActionResultReceiver8);
                                        sb3.append(")");
                                        return sb3.toString();
                                }
                        }
                }
            case 45089:
                Integer MediaBrowserCompat$CustomActionResultReceiver9 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45089);
                if (MediaBrowserCompat$CustomActionResultReceiver9 == null) {
                    return null;
                }
                if (MediaBrowserCompat$CustomActionResultReceiver9.intValue() == 0) {
                    return "Auto";
                }
                return String.format("%d K", new Object[]{Integer.valueOf((MediaBrowserCompat$CustomActionResultReceiver9.intValue() >> 24) | ((MediaBrowserCompat$CustomActionResultReceiver9.intValue() & 16711680) >> 8))});
            case 45091:
                Integer MediaBrowserCompat$CustomActionResultReceiver10 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45091);
                if (MediaBrowserCompat$CustomActionResultReceiver10 == null) {
                    return null;
                }
                int intValue9 = MediaBrowserCompat$CustomActionResultReceiver10.intValue();
                switch (intValue9) {
                    case 0:
                        return "Standard";
                    case 1:
                        return "Portrait";
                    case 2:
                        return "Text";
                    case 3:
                        return "Night Scene";
                    case 4:
                        return "Sunset";
                    case 5:
                        return "Sports";
                    case 6:
                        return "Landscape";
                    case 7:
                        return "Night Portrait";
                    case 8:
                        return "Macro";
                    case 9:
                        return "Super Macro";
                    default:
                        switch (intValue9) {
                            case 16:
                                return "Auto";
                            case 17:
                                return "Night View/Portrait";
                            case 18:
                                return "Sweep Panorama";
                            case 19:
                                return "Handheld Night Shot";
                            case 20:
                                return "Anti Motion Blur";
                            case 21:
                                return "Cont. Priority AE";
                            case 22:
                                return "Auto+";
                            case 23:
                                return "3D Sweep Panorama";
                            case 24:
                                return "Superior Auto";
                            case 25:
                                return "High Sensitivity";
                            case 26:
                                return "Fireworks";
                            case 27:
                                return "Food";
                            case 28:
                                return "Pet";
                            default:
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("Unknown (");
                                sb4.append(MediaBrowserCompat$CustomActionResultReceiver10);
                                sb4.append(")");
                                return sb4.toString();
                        }
                }
            case 45092:
                return MediaBrowserCompat$CustomActionResultReceiver(45092, "ISO Setting Used", "High Key", "Low Key");
            case 45093:
                Integer MediaBrowserCompat$CustomActionResultReceiver11 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45093);
                if (MediaBrowserCompat$CustomActionResultReceiver11 == null) {
                    return null;
                }
                int intValue10 = MediaBrowserCompat$CustomActionResultReceiver11.intValue();
                if (intValue10 == 0) {
                    return "Off";
                }
                if (intValue10 == 1) {
                    return "Standard";
                }
                if (intValue10 == 2) {
                    return "Advanced Auto";
                }
                if (intValue10 == 3) {
                    return "Auto";
                }
                switch (intValue10) {
                    case 8:
                        return "Advanced LV1";
                    case 9:
                        return "Advanced LV2";
                    case 10:
                        return "Advanced LV3";
                    case 11:
                        return "Advanced LV4";
                    case 12:
                        return "Advanced LV5";
                    default:
                        switch (intValue10) {
                            case 16:
                                return "LV1";
                            case 17:
                                return "LV2";
                            case 18:
                                return "LV3";
                            case 19:
                                return "LV4";
                            case 20:
                                return "LV5";
                            default:
                                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver11});
                        }
                }
            case 45094:
                Integer MediaBrowserCompat$CustomActionResultReceiver12 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45094);
                if (MediaBrowserCompat$CustomActionResultReceiver12 == null) {
                    return null;
                }
                int intValue11 = MediaBrowserCompat$CustomActionResultReceiver12.intValue();
                if (intValue11 != 0) {
                    return intValue11 != 1 ? "N/A" : "On";
                }
                return "Off";
            case 45097:
                Integer MediaBrowserCompat$CustomActionResultReceiver13 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45097);
                if (MediaBrowserCompat$CustomActionResultReceiver13 == null) {
                    return null;
                }
                int intValue12 = MediaBrowserCompat$CustomActionResultReceiver13.intValue();
                switch (intValue12) {
                    case 0:
                        return "Standard";
                    case 1:
                        return "Vivid";
                    case 2:
                        return "Portrait";
                    case 3:
                        return "Landscape";
                    case 4:
                        return "Sunset";
                    case 5:
                        return "Night Portrait";
                    case 6:
                        return "Black & White";
                    case 7:
                        return "Adobe RGB";
                    default:
                        switch (intValue12) {
                            case 12:
                                return "Neutral";
                            case 13:
                                return "Clear";
                            case 14:
                                return "Deep";
                            case 15:
                                return "Light";
                            case 16:
                                return "Autumn";
                            case 17:
                                return "Sepia";
                            default:
                                switch (intValue12) {
                                    case 100:
                                        return "Neutral";
                                    case 101:
                                        return "Clear";
                                    case 102:
                                        return "Deep";
                                    case 103:
                                        return "Light";
                                    case 104:
                                        return "Night View";
                                    case 105:
                                        return "Autumn Leaves";
                                    default:
                                        return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver13});
                                }
                        }
                }
            case 45120:
                Integer MediaBrowserCompat$CustomActionResultReceiver14 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45120);
                if (MediaBrowserCompat$CustomActionResultReceiver14 == null) {
                    return null;
                }
                int intValue13 = MediaBrowserCompat$CustomActionResultReceiver14.intValue();
                if (intValue13 == 0) {
                    return "Off";
                }
                if (intValue13 == 1) {
                    return "On";
                }
                if (intValue13 == 2) {
                    return "Magnifying Glass/Super Macro";
                }
                if (intValue13 == 65535) {
                    return "N/A";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver14});
            case 45121:
                Integer MediaBrowserCompat$CustomActionResultReceiver15 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45121);
                if (MediaBrowserCompat$CustomActionResultReceiver15 == null) {
                    return null;
                }
                int intValue14 = MediaBrowserCompat$CustomActionResultReceiver15.intValue();
                if (intValue14 == 29) {
                    return "Underwater";
                }
                if (intValue14 == 65535) {
                    return "N/A";
                }
                switch (intValue14) {
                    case 0:
                        return "Program";
                    case 1:
                        return "Portrait";
                    case 2:
                        return "Beach";
                    case 3:
                        return "Sports";
                    case 4:
                        return "Snow";
                    case 5:
                        return "Landscape";
                    case 6:
                        return "Auto";
                    case 7:
                        return "Aperture Priority";
                    case 8:
                        return "Shutter Priority";
                    case 9:
                        return "Night Scene / Twilight";
                    case 10:
                        return "Hi-Speed Shutter";
                    case 11:
                        return "Twilight Portrait";
                    case 12:
                        return "Soft Snap/Portrait";
                    case 13:
                        return "Fireworks";
                    case 14:
                        return "Smile Shutter";
                    case 15:
                        return "Manual";
                    default:
                        switch (intValue14) {
                            case 18:
                                return "High Sensitivity";
                            case 19:
                                return "Macro";
                            case 20:
                                return "Advanced Sports Shooting";
                            default:
                                switch (intValue14) {
                                    case 33:
                                        return "Food";
                                    case 34:
                                        return "Panorama";
                                    case 35:
                                        return "Handheld Night Shot";
                                    case 36:
                                        return "Anti Motion Blur";
                                    case 37:
                                        return "Pet";
                                    case 38:
                                        return "Backlight Correction HDR";
                                    case 39:
                                        return "Superior Auto";
                                    case 40:
                                        return "Background Defocus";
                                    case 41:
                                        return "Soft Skin";
                                    case 42:
                                        return "3D Image";
                                    default:
                                        return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver15});
                                }
                        }
                }
            case 45123:
                Integer MediaBrowserCompat$CustomActionResultReceiver16 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45123);
                if (MediaBrowserCompat$CustomActionResultReceiver16 == null) {
                    return null;
                }
                int intValue15 = MediaBrowserCompat$CustomActionResultReceiver16.intValue();
                if (intValue15 == 0) {
                    return "Default";
                }
                if (intValue15 == 1) {
                    return "Multi";
                }
                if (intValue15 == 2) {
                    return "Center";
                }
                if (intValue15 == 3) {
                    return "Spot";
                }
                if (intValue15 == 4) {
                    return "Flexible Spot";
                }
                if (intValue15 == 6) {
                    return "Touch";
                }
                if (intValue15 == 65535) {
                    return "n/a";
                }
                if (intValue15 == 14) {
                    return "Manual Focus";
                }
                if (intValue15 == 15) {
                    return "Face Detected";
                }
                StringBuilder sb5 = new StringBuilder();
                sb5.append("Unknown (");
                sb5.append(MediaBrowserCompat$CustomActionResultReceiver16);
                sb5.append(")");
                return sb5.toString();
            case 45124:
                Integer MediaBrowserCompat$CustomActionResultReceiver17 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45124);
                if (MediaBrowserCompat$CustomActionResultReceiver17 == null) {
                    return null;
                }
                int intValue16 = MediaBrowserCompat$CustomActionResultReceiver17.intValue();
                if (intValue16 == 0) {
                    return "Off";
                }
                if (intValue16 == 1) {
                    return "Auto";
                }
                if (intValue16 == 65535) {
                    return "n/a";
                }
                StringBuilder sb6 = new StringBuilder();
                sb6.append("Unknown (");
                sb6.append(MediaBrowserCompat$CustomActionResultReceiver17);
                sb6.append(")");
                return sb6.toString();
            case 45127:
                Integer MediaBrowserCompat$CustomActionResultReceiver18 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45127);
                if (MediaBrowserCompat$CustomActionResultReceiver18 == null) {
                    return null;
                }
                int intValue17 = MediaBrowserCompat$CustomActionResultReceiver18.intValue();
                if (intValue17 == 0) {
                    return "Normal";
                }
                if (intValue17 == 1) {
                    return "Fine";
                }
                if (intValue17 == 2) {
                    return "Extra Fine";
                }
                if (intValue17 == 65535) {
                    return "N/A";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver18});
            case 45128:
                Integer MediaBrowserCompat$CustomActionResultReceiver19 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45128);
                if (MediaBrowserCompat$CustomActionResultReceiver19 == null) {
                    return null;
                }
                int intValue18 = MediaBrowserCompat$CustomActionResultReceiver19.intValue();
                if (intValue18 == -32768) {
                    return "Low";
                }
                if (intValue18 == 128) {
                    return "n/a";
                }
                if (intValue18 == 32767) {
                    return "High";
                }
                switch (intValue18) {
                    case IpLibUtil.KIPP_IP_BAD_DPI_ERROR:
                        return "-3/3";
                    case -2:
                        return "-2/3";
                    case -1:
                        return "-1/3";
                    case 0:
                        return "Normal";
                    case 1:
                        return "+1/3";
                    case 2:
                        return "+2/3";
                    case 3:
                        return "+3/3";
                    default:
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("Unknown (");
                        sb7.append(MediaBrowserCompat$CustomActionResultReceiver19);
                        sb7.append(")");
                        return sb7.toString();
                }
            case 45129:
                Integer MediaBrowserCompat$CustomActionResultReceiver20 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45129);
                if (MediaBrowserCompat$CustomActionResultReceiver20 == null) {
                    return null;
                }
                int intValue19 = MediaBrowserCompat$CustomActionResultReceiver20.intValue();
                if (intValue19 == 0) {
                    return "Normal";
                }
                if (intValue19 == 2) {
                    return "Continuous";
                }
                if (intValue19 == 65535) {
                    return "n/a";
                }
                if (intValue19 == 5) {
                    return "Exposure Bracketing";
                }
                if (intValue19 == 6) {
                    return "White Balance Bracketing";
                }
                StringBuilder sb8 = new StringBuilder();
                sb8.append("Unknown (");
                sb8.append(MediaBrowserCompat$CustomActionResultReceiver20);
                sb8.append(")");
                return sb8.toString();
            case 45130:
                Integer MediaBrowserCompat$CustomActionResultReceiver21 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45129);
                if (MediaBrowserCompat$CustomActionResultReceiver21 == null) {
                    return null;
                }
                int intValue20 = MediaBrowserCompat$CustomActionResultReceiver21.intValue();
                if (intValue20 == 0) {
                    return "Single";
                }
                if (intValue20 != 65535) {
                    return MediaBrowserCompat$CustomActionResultReceiver21.toString();
                }
                return "n/a";
            case 45131:
                Integer MediaBrowserCompat$CustomActionResultReceiver22 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45131);
                if (MediaBrowserCompat$CustomActionResultReceiver22 == null) {
                    return null;
                }
                int intValue21 = MediaBrowserCompat$CustomActionResultReceiver22.intValue();
                if (intValue21 == 0) {
                    return "Off";
                }
                if (intValue21 == 1) {
                    return "On (Continuous)";
                }
                if (intValue21 == 2) {
                    return "On (Shooting)";
                }
                if (intValue21 == 65535) {
                    return "N/A";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver22});
            case 45134:
                Integer MediaBrowserCompat$CustomActionResultReceiver23 = ((I32_4) this.write).MediaBrowserCompat$CustomActionResultReceiver(45134);
                if (MediaBrowserCompat$CustomActionResultReceiver23 == null) {
                    return null;
                }
                int intValue22 = MediaBrowserCompat$CustomActionResultReceiver23.intValue();
                if (intValue22 == 0) {
                    return "Off";
                }
                if (intValue22 == 1) {
                    return "On";
                }
                if (intValue22 == 65535) {
                    return "N/A";
                }
                return String.format("Unknown (%d)", new Object[]{MediaBrowserCompat$CustomActionResultReceiver23});
            default:
                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
        }
    }
}
