package p040o;

import com.google.android.gms.location.places.Place;
import java.io.IOException;
import java.text.DecimalFormat;
import okhttp3.internal.http2.Settings;

/* renamed from: o.updateVisibleSubElements */
public final class updateVisibleSubElements extends createCubemapFromCubeFaces<createVector> {
    public updateVisibleSubElements(createVector createvector) {
        super(createvector);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i != 1002) {
            if (i == 1005) {
                return MediaBrowserCompat$MediaItem();
            }
            if (i == 1028) {
                byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(i);
                if (IconCompatParcelizer == null) {
                    return null;
                }
                return String.format("%d bytes binary data", new Object[]{Integer.valueOf(IconCompatParcelizer.length)});
            } else if (i == 1030) {
                return MediaMetadataCompat();
            } else {
                if (!(i == 1044 || i == 1054)) {
                    if (i == 1057) {
                        return MediaSessionCompat$QueueItem();
                    }
                    if (i == 1062) {
                        return MediaBrowserCompat$SearchResultReceiver();
                    }
                    if (i == 1064) {
                        return RatingCompat();
                    }
                    if (i != 1049) {
                        if (i == 1050) {
                            return MediaDescriptionCompat();
                        }
                        switch (i) {
                            case 1033:
                            case 1036:
                                return MediaMetadataCompat(i);
                            case 1034:
                                byte[] IconCompatParcelizer2 = ((createVector) this.write).IconCompatParcelizer(i);
                                if (IconCompatParcelizer2 == null || IconCompatParcelizer2.length == 0) {
                                    return null;
                                }
                                return IconCompatParcelizer2[0] == 0 ? "No" : "Yes";
                            case 1035:
                                break;
                            case 1037:
                                break;
                            default:
                                return super.MediaBrowserCompat$CustomActionResultReceiver(i);
                        }
                    }
                }
                return RatingCompat(i);
            }
        }
        byte[] IconCompatParcelizer3 = ((createVector) this.write).IconCompatParcelizer(i);
        if (IconCompatParcelizer3 == null) {
            return null;
        }
        return new String(IconCompatParcelizer3);
    }

    private String MediaMetadataCompat() {
        String str;
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(Place.TYPE_TRANSIT_STATION);
            if (IconCompatParcelizer == null) {
                return ((createVector) this.write).MediaBrowserCompat$SearchResultReceiver(Place.TYPE_TRANSIT_STATION);
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            int MediaSessionCompat$ResultReceiverWrapper = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(0);
            int MediaSessionCompat$ResultReceiverWrapper2 = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(2);
            int MediaSessionCompat$ResultReceiverWrapper3 = staggeredGridLayoutManager.MediaSessionCompat$ResultReceiverWrapper(4);
            int i = (MediaSessionCompat$ResultReceiverWrapper > 65535 || MediaSessionCompat$ResultReceiverWrapper < 65533) ? MediaSessionCompat$ResultReceiverWrapper <= 8 ? MediaSessionCompat$ResultReceiverWrapper + 4 : MediaSessionCompat$ResultReceiverWrapper : MediaSessionCompat$ResultReceiverWrapper - 65532;
            switch (MediaSessionCompat$ResultReceiverWrapper) {
                case 0:
                    str = "Low";
                    break;
                case 1:
                case 2:
                case 3:
                    str = "Medium";
                    break;
                case 4:
                case 5:
                    str = "High";
                    break;
                case 6:
                case 7:
                case 8:
                    str = "Maximum";
                    break;
                default:
                    switch (MediaSessionCompat$ResultReceiverWrapper) {
                        case 65533:
                        case 65534:
                        case Settings.DEFAULT_INITIAL_WINDOW_SIZE /*65535*/:
                            break;
                        default:
                            str = "Unknown";
                            break;
                    }
                    str = "Low";
                    break;
            }
            return String.format("%d (%s), %s format, %s scans", new Object[]{Integer.valueOf(i), str, MediaSessionCompat$ResultReceiverWrapper2 != 0 ? MediaSessionCompat$ResultReceiverWrapper2 != 1 ? MediaSessionCompat$ResultReceiverWrapper2 != 257 ? String.format("Unknown 0x%04X", new Object[]{Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper2)}) : "Progressive" : "Optimised" : "Standard", (MediaSessionCompat$ResultReceiverWrapper3 <= 0 || MediaSessionCompat$ResultReceiverWrapper3 > 3) ? String.format("Unknown 0x%04X", new Object[]{Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper3)}) : String.format("%d", new Object[]{Integer.valueOf(MediaSessionCompat$ResultReceiverWrapper3 + 2)})});
        } catch (IOException unused) {
            return null;
        }
    }

    private String RatingCompat() {
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(1064);
            if (IconCompatParcelizer == null) {
                return null;
            }
            return Double.toString(new StaggeredGridLayoutManager(IconCompatParcelizer).write(4));
        } catch (Exception unused) {
            return null;
        }
    }

    private String MediaBrowserCompat$SearchResultReceiver() {
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(1062);
            if (IconCompatParcelizer == null) {
                return null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            int MediaBrowserCompat$MediaItem = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(0);
            float MediaBrowserCompat$ItemReceiver = staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(2);
            float MediaBrowserCompat$ItemReceiver2 = staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(6);
            float MediaBrowserCompat$ItemReceiver3 = staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(10);
            if (MediaBrowserCompat$MediaItem == 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("Centered, Scale ");
                sb.append(MediaBrowserCompat$ItemReceiver3);
                return sb.toString();
            } else if (MediaBrowserCompat$MediaItem == 1) {
                return "Size to fit";
            } else {
                if (MediaBrowserCompat$MediaItem != 2) {
                    return String.format("Unknown %04X, X:%s Y:%s, Scale:%s", new Object[]{Integer.valueOf(MediaBrowserCompat$MediaItem), Float.valueOf(MediaBrowserCompat$ItemReceiver), Float.valueOf(MediaBrowserCompat$ItemReceiver2), Float.valueOf(MediaBrowserCompat$ItemReceiver3)});
                }
                return String.format("User defined, X:%s Y:%s, Scale:%s", new Object[]{Float.valueOf(MediaBrowserCompat$ItemReceiver), Float.valueOf(MediaBrowserCompat$ItemReceiver2), Float.valueOf(MediaBrowserCompat$ItemReceiver3)});
            }
        } catch (Exception unused) {
            return null;
        }
    }

    private String MediaBrowserCompat$MediaItem() {
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(1005);
            if (IconCompatParcelizer == null) {
                return null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            float MediaMetadataCompat = staggeredGridLayoutManager.MediaMetadataCompat(0);
            float MediaMetadataCompat2 = staggeredGridLayoutManager.MediaMetadataCompat(8);
            DecimalFormat decimalFormat = new DecimalFormat("0.##");
            StringBuilder sb = new StringBuilder();
            sb.append(decimalFormat.format((double) MediaMetadataCompat));
            sb.append("x");
            sb.append(decimalFormat.format((double) MediaMetadataCompat2));
            sb.append(" DPI");
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    private String MediaSessionCompat$QueueItem() {
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(1057);
            if (IconCompatParcelizer == null) {
                return null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            int MediaBrowserCompat$MediaItem = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(0);
            int MediaBrowserCompat$MediaItem2 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(5) << 1;
            String MediaBrowserCompat$ItemReceiver = staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(9, MediaBrowserCompat$MediaItem2, "UTF-16");
            int i = MediaBrowserCompat$MediaItem2 + 9;
            int MediaBrowserCompat$MediaItem3 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(i);
            int i2 = i + 4;
            int i3 = MediaBrowserCompat$MediaItem3 << 1;
            return String.format("%d (%s, %s) %d", new Object[]{Integer.valueOf(MediaBrowserCompat$MediaItem), MediaBrowserCompat$ItemReceiver, staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(i2, i3, "UTF-16"), Integer.valueOf(staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(i2 + i3))});
        } catch (IOException unused) {
            return null;
        }
    }

    private String MediaDescriptionCompat() {
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(1050);
            if (IconCompatParcelizer == null) {
                return null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            int MediaBrowserCompat$MediaItem = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(20) << 1;
            return String.format("%s (%d,%d,%d,%d) %d Slices", new Object[]{staggeredGridLayoutManager.MediaBrowserCompat$ItemReceiver(24, MediaBrowserCompat$MediaItem, "UTF-16"), Integer.valueOf(staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(4)), Integer.valueOf(staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(8)), Integer.valueOf(staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(12)), Integer.valueOf(staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(16)), Integer.valueOf(staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(MediaBrowserCompat$MediaItem + 24))});
        } catch (IOException unused) {
            return null;
        }
    }

    private String MediaMetadataCompat(int i) {
        try {
            byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(i);
            if (IconCompatParcelizer == null) {
                return null;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(IconCompatParcelizer);
            int MediaBrowserCompat$MediaItem = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(0);
            int MediaBrowserCompat$MediaItem2 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(4);
            int MediaBrowserCompat$MediaItem3 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(8);
            int MediaBrowserCompat$MediaItem4 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(16);
            int MediaBrowserCompat$MediaItem5 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(20);
            int MediaBrowserCompat$MediaItem6 = staggeredGridLayoutManager.MediaBrowserCompat$MediaItem(24);
            Object[] objArr = new Object[6];
            objArr[0] = MediaBrowserCompat$MediaItem == 1 ? "JpegRGB" : "RawRGB";
            objArr[1] = Integer.valueOf(MediaBrowserCompat$MediaItem2);
            objArr[2] = Integer.valueOf(MediaBrowserCompat$MediaItem3);
            objArr[3] = Integer.valueOf(MediaBrowserCompat$MediaItem4);
            objArr[4] = Integer.valueOf(MediaBrowserCompat$MediaItem6);
            objArr[5] = Integer.valueOf(MediaBrowserCompat$MediaItem5);
            return String.format("%s, %dx%d, Decomp %d bytes, %d bpp, %d bytes", objArr);
        } catch (IOException unused) {
            return null;
        }
    }

    private String RatingCompat(int i) {
        byte[] IconCompatParcelizer = ((createVector) this.write).IconCompatParcelizer(i);
        if (IconCompatParcelizer == null) {
            return null;
        }
        try {
            return String.format("%d", new Object[]{Integer.valueOf(new StaggeredGridLayoutManager(IconCompatParcelizer).MediaBrowserCompat$MediaItem(0))});
        } catch (IOException unused) {
            return null;
        }
    }
}
