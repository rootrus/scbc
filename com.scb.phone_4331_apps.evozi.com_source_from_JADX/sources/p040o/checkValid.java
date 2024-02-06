package p040o;

import java.text.DecimalFormat;
import java.util.HashMap;

/* renamed from: o.checkValid */
public final class checkValid extends createCubemapFromCubeFaces<setID> {
    private static final HashMap<String, String> IconCompatParcelizer = new HashMap<>();
    private static final HashMap<String, String> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();

    public checkValid(setID setid) {
        super(setid);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 0) {
            return IconCompatParcelizer(0, 4);
        }
        if (i == 256) {
            String MediaBrowserCompat$SearchResultReceiver = ((setID) this.write).MediaBrowserCompat$SearchResultReceiver(256);
            if (MediaBrowserCompat$SearchResultReceiver == null) {
                return null;
            }
            return Byte3.read.containsKey(MediaBrowserCompat$SearchResultReceiver) ? Byte3.read.get(MediaBrowserCompat$SearchResultReceiver) : MediaBrowserCompat$SearchResultReceiver;
        } else if (i == 513) {
            return RatingCompat();
        } else {
            if (i == 769) {
                return MediaBrowserCompat$MediaItem();
            }
            if (i == 259) {
                StringBuilder sb = new StringBuilder();
                sb.append(((setID) this.write).MediaBrowserCompat$SearchResultReceiver(259));
                sb.append(" mm");
                return sb.toString();
            } else if (i == 260) {
                Integer MediaBrowserCompat$CustomActionResultReceiver2 = ((setID) this.write).MediaBrowserCompat$CustomActionResultReceiver(260);
                if (MediaBrowserCompat$CustomActionResultReceiver2 == null) {
                    return null;
                }
                String format = String.format("%04X", new Object[]{MediaBrowserCompat$CustomActionResultReceiver2});
                return String.format("%s.%s", new Object[]{format.substring(0, format.length() - 3), format.substring(format.length() - 3)});
            } else if (i == 522) {
                Integer MediaBrowserCompat$CustomActionResultReceiver3 = ((setID) this.write).MediaBrowserCompat$CustomActionResultReceiver(522);
                if (MediaBrowserCompat$CustomActionResultReceiver3 == null) {
                    return null;
                }
                return new DecimalFormat("0.#").format(Math.pow(Math.sqrt(2.0d), ((double) MediaBrowserCompat$CustomActionResultReceiver3.intValue()) / 256.0d));
            } else if (i == 523) {
                Integer MediaBrowserCompat$CustomActionResultReceiver4 = ((setID) this.write).MediaBrowserCompat$CustomActionResultReceiver(523);
                if (MediaBrowserCompat$CustomActionResultReceiver4 == null) {
                    return null;
                }
                return String.format("0x%04X", new Object[]{MediaBrowserCompat$CustomActionResultReceiver4});
            } else if (i == 4096) {
                return MediaBrowserCompat$CustomActionResultReceiver(4096, "None", null, "Simple E-System", "E-System");
            } else {
                if (i == 4097) {
                    return MediaBrowserCompat$CustomActionResultReceiver(4097, "None", "FL-20", "FL-50", "RF-11", "TF-22", "FL-36", "FL-50R", "FL-36R");
                }
                switch (i) {
                    case 516:
                        Integer MediaBrowserCompat$CustomActionResultReceiver5 = ((setID) this.write).MediaBrowserCompat$CustomActionResultReceiver(516);
                        if (MediaBrowserCompat$CustomActionResultReceiver5 == null) {
                            return null;
                        }
                        String format2 = String.format("%04X", new Object[]{MediaBrowserCompat$CustomActionResultReceiver5});
                        return String.format("%s.%s", new Object[]{format2.substring(0, format2.length() - 3), format2.substring(format2.length() - 3)});
                    case 517:
                        Integer MediaBrowserCompat$CustomActionResultReceiver6 = ((setID) this.write).MediaBrowserCompat$CustomActionResultReceiver(517);
                        if (MediaBrowserCompat$CustomActionResultReceiver6 == null) {
                            return null;
                        }
                        return new DecimalFormat("0.#").format(Math.pow(Math.sqrt(2.0d), ((double) MediaBrowserCompat$CustomActionResultReceiver6.intValue()) / 256.0d));
                    case 518:
                        Integer MediaBrowserCompat$CustomActionResultReceiver7 = ((setID) this.write).MediaBrowserCompat$CustomActionResultReceiver(518);
                        if (MediaBrowserCompat$CustomActionResultReceiver7 == null) {
                            return null;
                        }
                        return new DecimalFormat("0.#").format(Math.pow(Math.sqrt(2.0d), ((double) MediaBrowserCompat$CustomActionResultReceiver7.intValue()) / 256.0d));
                    default:
                        return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                }
            }
        }
    }

    private String RatingCompat() {
        String MediaBrowserCompat$SearchResultReceiver = ((setID) this.write).MediaBrowserCompat$SearchResultReceiver(513);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        String[] split = MediaBrowserCompat$SearchResultReceiver.split(" ");
        if (split.length < 6) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(split[0]);
            int parseInt2 = Integer.parseInt(split[2]);
            int parseInt3 = Integer.parseInt(split[3]);
            return MediaBrowserCompat$CustomActionResultReceiver.get(String.format("%X %02X %02X", new Object[]{Integer.valueOf(parseInt), Integer.valueOf(parseInt2), Integer.valueOf(parseInt3)}));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private String MediaBrowserCompat$MediaItem() {
        String MediaBrowserCompat$SearchResultReceiver = ((setID) this.write).MediaBrowserCompat$SearchResultReceiver(769);
        if (MediaBrowserCompat$SearchResultReceiver == null) {
            return null;
        }
        String[] split = MediaBrowserCompat$SearchResultReceiver.split(" ");
        if (split.length < 6) {
            return null;
        }
        try {
            return IconCompatParcelizer.get(String.format("%X %02X", new Object[]{Integer.valueOf(Integer.parseInt(split[0])), Integer.valueOf(Integer.parseInt(split[2]))}));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    static {
        MediaBrowserCompat$CustomActionResultReceiver.put("0 00 00", "None");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 01 00", "Olympus Zuiko Digital ED 50mm F2.0 Macro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 01 01", "Olympus Zuiko Digital 40-150mm F3.5-4.5");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 01 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 02 00", "Olympus Zuiko Digital ED 150mm F2.0");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 02 10", "Olympus M.Zuiko Digital 17mm F2.8 Pancake");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 03 00", "Olympus Zuiko Digital ED 300mm F2.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 03 10", "Olympus M.Zuiko Digital ED 14-150mm F4.0-5.6 [II]");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 04 10", "Olympus M.Zuiko Digital ED 9-18mm F4.0-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 05 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 05 01", "Olympus Zuiko Digital Pro ED 90-250mm F2.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 05 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 L");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 06 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 06 01", "Olympus Zuiko Digital ED 8mm F3.5 Fisheye");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 06 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 07 00", "Olympus Zuiko Digital 11-22mm F2.8-3.5");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 07 01", "Olympus Zuiko Digital 18-180mm F3.5-6.3");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 07 10", "Olympus M.Zuiko Digital ED 12mm F2.0");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 08 01", "Olympus Zuiko Digital 70-300mm F4.0-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 08 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 09 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 10 01", "Kenko Tokina Reflex 300mm F6.3 MF Macro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 10 10", "Olympus M.Zuiko Digital ED 12-50mm F3.5-6.3 EZ");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 11 10", "Olympus M.Zuiko Digital 45mm F1.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 12 10", "Olympus M.Zuiko Digital ED 60mm F2.8 Macro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 13 10", "Olympus M.Zuiko Digital 14-42mm F3.5-5.6 II R");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 14 10", "Olympus M.Zuiko Digital ED 40-150mm F4.0-5.6 R");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 15 00", "Olympus Zuiko Digital ED 7-14mm F4.0");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 15 10", "Olympus M.Zuiko Digital ED 75mm F1.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 16 10", "Olympus M.Zuiko Digital 17mm F1.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 17 00", "Olympus Zuiko Digital Pro ED 35-100mm F2.0");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 18 00", "Olympus Zuiko Digital 14-45mm F3.5-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 18 10", "Olympus M.Zuiko Digital ED 75-300mm F4.8-6.7 II");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 19 10", "Olympus M.Zuiko Digital ED 12-40mm F2.8 Pro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 20 00", "Olympus Zuiko Digital 35mm F3.5 Macro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 20 10", "Olympus M.Zuiko Digital ED 40-150mm F2.8 Pro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 21 10", "Olympus M.Zuiko Digital ED 14-42mm F3.5-5.6 EZ");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 22 00", "Olympus Zuiko Digital 17.5-45mm F3.5-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 22 10", "Olympus M.Zuiko Digital 25mm F1.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 23 00", "Olympus Zuiko Digital ED 14-42mm F3.5-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 23 10", "Olympus M.Zuiko Digital ED 7-14mm F2.8 Pro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 24 00", "Olympus Zuiko Digital ED 40-150mm F4.0-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 24 10", "Olympus M.Zuiko Digital ED 300mm F4.0 IS Pro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 25 10", "Olympus M.Zuiko Digital ED 8mm F1.8 Fisheye Pro");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 30 00", "Olympus Zuiko Digital ED 50-200mm F2.8-3.5 SWD");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 31 00", "Olympus Zuiko Digital ED 12-60mm F2.8-4.0 SWD");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 32 00", "Olympus Zuiko Digital ED 14-35mm F2.0 SWD");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 33 00", "Olympus Zuiko Digital 25mm F2.8");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 34 00", "Olympus Zuiko Digital ED 9-18mm F4.0-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("0 35 00", "Olympus Zuiko Digital 14-54mm F2.8-3.5 II");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 01 00", "Sigma 18-50mm F3.5-5.6 DC");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 01 10", "Sigma 30mm F2.8 EX DN");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 02 00", "Sigma 55-200mm F4.0-5.6 DC");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 02 10", "Sigma 19mm F2.8 EX DN");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 03 00", "Sigma 18-125mm F3.5-5.6 DC");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 03 10", "Sigma 30mm F2.8 DN | A");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 04 00", "Sigma 18-125mm F3.5-5.6 DC");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 04 10", "Sigma 19mm F2.8 DN | A");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 05 00", "Sigma 30mm F1.4 EX DC HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 05 10", "Sigma 60mm F2.8 DN | A");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 06 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 07 00", "Sigma Macro 105mm F2.8 EX DG");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 08 00", "Sigma APO Macro 150mm F2.8 EX DG HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 09 00", "Sigma 18-50mm F2.8 EX DC Macro");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 10 00", "Sigma 24mm F1.8 EX DG Aspherical Macro");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 11 00", "Sigma APO 135-400mm F4.5-5.6 DG");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 12 00", "Sigma APO 300-800mm F5.6 EX DG HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 13 00", "Sigma 30mm F1.4 EX DC HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 14 00", "Sigma APO 50-500mm F4.0-6.3 EX DG HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 15 00", "Sigma 10-20mm F4.0-5.6 EX DC HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 16 00", "Sigma APO 70-200mm F2.8 II EX DG Macro HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("1 17 00", "Sigma 50mm F1.4 EX DG HSM");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 01 10", "Lumix G Vario 14-45mm F3.5-5.6 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 02 00", "Leica D Summilux 25mm F1.4 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 02 10", "Lumix G Vario 45-200mm F4.0-5.6 Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 03 00", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 03 01", "Leica D Vario Elmar 14-50mm F3.8-5.6 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 03 10", "Lumix G Vario HD 14-140mm F4.0-5.8 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 04 00", "Leica D Vario Elmar 14-150mm F3.5-5.6");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 04 10", "Lumix G Vario 7-14mm F4.0 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 05 10", "Lumix G 20mm F1.7 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 06 10", "Leica DG Macro-Elmarit 45mm F2.8 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 07 10", "Lumix G Vario 14-42mm F3.5-5.6 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 08 10", "Lumix G Fisheye 8mm F3.5");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 09 10", "Lumix G Vario 100-300mm F4.0-5.6 Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 10 10", "Lumix G 14mm F2.5 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 11 10", "Lumix G 12.5mm F12 3D");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 12 10", "Leica DG Summilux 25mm F1.4 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 13 10", "Lumix G X Vario PZ 45-175mm F4.0-5.6 Asph. Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 14 10", "Lumix G X Vario PZ 14-42mm F3.5-5.6 Asph. Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 15 10", "Lumix G X Vario 12-35mm F2.8 Asph. Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 16 10", "Lumix G Vario 45-150mm F4.0-5.6 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 17 10", "Lumix G X Vario 35-100mm F2.8 Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 18 10", "Lumix G Vario 14-42mm F3.5-5.6 II Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 19 10", "Lumix G Vario 14-140mm F3.5-5.6 Asph. Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 20 10", "Lumix G Vario 12-32mm F3.5-5.6 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 21 10", "Leica DG Nocticron 42.5mm F1.2 Asph. Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 22 10", "Leica DG Summilux 15mm F1.7 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 24 10", "Lumix G Macro 30mm F2.8 Asph. Mega OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("2 25 10", "Lumix G 42.5mm F1.7 Asph. Power OIS");
        MediaBrowserCompat$CustomActionResultReceiver.put("3 01 00", "Leica D Vario Elmarit 14-50mm F2.8-3.5 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("3 02 00", "Leica D Summilux 25mm F1.4 Asph.");
        MediaBrowserCompat$CustomActionResultReceiver.put("5 01 10", "Tamron 14-150mm F3.5-5.8 Di III");
        IconCompatParcelizer.put("0 00", "None");
        IconCompatParcelizer.put("0 04", "Olympus Zuiko Digital EC-14 1.4x Teleconverter");
        IconCompatParcelizer.put("0 08", "Olympus EX-25 Extension Tube");
        IconCompatParcelizer.put("0 10", "Olympus Zuiko Digital EC-20 2.0x Teleconverter");
    }
}
