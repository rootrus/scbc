package p040o;

/* renamed from: o.I16_4 */
public final class I16_4 extends createCubemapFromCubeFaces<I32_3> {
    public I16_4(I32_3 i32_3) {
        super(i32_3);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i == 513) {
            Integer MediaBrowserCompat$CustomActionResultReceiver = ((I32_3) this.write).MediaBrowserCompat$CustomActionResultReceiver(513);
            if (MediaBrowserCompat$CustomActionResultReceiver == null) {
                return null;
            }
            int intValue = MediaBrowserCompat$CustomActionResultReceiver.intValue();
            switch (intValue) {
                case 0:
                    return "Normal/Very Low";
                case 1:
                    return "Normal/Low";
                case 2:
                    return "Normal/Medium Low";
                case 3:
                    return "Normal/Medium";
                case 4:
                    return "Normal/Medium High";
                case 5:
                    return "Normal/High";
                case 6:
                    return "Normal/Very High";
                case 7:
                    return "Normal/Super High";
                default:
                    switch (intValue) {
                        case 256:
                            return "Fine/Very Low";
                        case 257:
                            return "Fine/Low";
                        case 258:
                            return "Fine/Medium Low";
                        case 259:
                            return "Fine/Medium";
                        case 260:
                            return "Fine/Medium High";
                        case 261:
                            return "Fine/High";
                        case 262:
                            return "Fine/Very High";
                        case 263:
                            return "Fine/Super High";
                        default:
                            switch (intValue) {
                                case 512:
                                    return "Super Fine/Very Low";
                                case 513:
                                    return "Super Fine/Low";
                                case 514:
                                    return "Super Fine/Medium Low";
                                case 515:
                                    return "Super Fine/Medium";
                                case 516:
                                    return "Super Fine/Medium High";
                                case 517:
                                    return "Super Fine/High";
                                case 518:
                                    return "Super Fine/Very High";
                                case 519:
                                    return "Super Fine/Super High";
                                default:
                                    StringBuilder sb = new StringBuilder();
                                    sb.append("Unknown (");
                                    sb.append(MediaBrowserCompat$CustomActionResultReceiver);
                                    sb.append(")");
                                    return sb.toString();
                            }
                    }
            }
        } else if (i == 514) {
            return MediaBrowserCompat$CustomActionResultReceiver(514, "Normal", "Macro", "View", "Manual");
        } else {
            if (i == 516) {
                return MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (i == 539) {
                return MediaBrowserCompat$CustomActionResultReceiver(539, "Off", "On");
            }
            if (i == 531) {
                return MediaBrowserCompat$CustomActionResultReceiver(531, "Off", "On");
            }
            if (i == 532) {
                return MediaBrowserCompat$CustomActionResultReceiver(532, "Off", "On");
            }
            if (i == 548) {
                return MediaBrowserCompat$CustomActionResultReceiver(548, "5 frames/sec", "10 frames/sec", "15 frames/sec", "20 frames/sec");
            }
            if (i == 549) {
                return MediaBrowserCompat$CustomActionResultReceiver(549, "Auto", "Force", "Disabled", "Red eye");
            }
            switch (i) {
                case 526:
                    return MediaBrowserCompat$CustomActionResultReceiver(526, "None", "Standard", "Best", "Adjust Exposure");
                case 527:
                    return MediaBrowserCompat$CustomActionResultReceiver(527, "Off", "On");
                case 528:
                    return MediaBrowserCompat$CustomActionResultReceiver(528, "Off", "On");
                default:
                    switch (i) {
                        case 534:
                            return MediaBrowserCompat$CustomActionResultReceiver(534, "Off", "On");
                        case 535:
                            return MediaBrowserCompat$CustomActionResultReceiver(535, "Record while down", "Press start, press stop");
                        case 536:
                            return MediaBrowserCompat$CustomActionResultReceiver(536, "Off", "On");
                        case 537:
                            return MediaBrowserCompat$CustomActionResultReceiver(537, "Off", "On");
                        default:
                            switch (i) {
                                case 541:
                                    return MediaBrowserCompat$CustomActionResultReceiver(541, "Off", "On");
                                case 542:
                                    return MediaBrowserCompat$CustomActionResultReceiver(542, "No", "Yes");
                                case 543:
                                    return MediaBrowserCompat$CustomActionResultReceiver(543, "Off", "Sport", "TV", "Night", "User 1", "User 2", "Lamp");
                                default:
                                    return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                            }
                    }
            }
        }
    }
}
