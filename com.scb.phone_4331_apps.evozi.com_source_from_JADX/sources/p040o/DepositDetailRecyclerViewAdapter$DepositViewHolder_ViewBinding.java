package p040o;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding */
public class DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding {
    private StringBuffer MediaBrowserCompat$CustomActionResultReceiver;
    public Vector write;

    private void write(int i, int i2, Object obj) {
        if (obj != null) {
            if (this.write == null) {
                this.write = new Vector();
                this.MediaBrowserCompat$CustomActionResultReceiver = new StringBuffer();
            }
            if (i2 == 2) {
                if (obj instanceof SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) {
                    ((SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) obj).MediaBrowserCompat$CustomActionResultReceiver = this;
                } else {
                    throw new RuntimeException("Element obj expected)");
                }
            } else if (!(obj instanceof String)) {
                throw new RuntimeException("String expected");
            }
            this.write.insertElementAt(obj, i);
            this.MediaBrowserCompat$CustomActionResultReceiver.insert(i, (char) i2);
            return;
        }
        throw null;
    }

    public SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding write(String str, String str2) {
        SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding = new SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding();
        if (str == null) {
            str = "";
        }
        selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver = str;
        selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding.IconCompatParcelizer = str2;
        return selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        Vector vector = this.write;
        if (vector == null) {
            return 0;
        }
        return vector.size();
    }

    public final SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding read(String str, String str2) {
        int write2 = write(str, str2, 0);
        int write3 = write(str, str2, write2 + 1);
        if (write2 == -1 || write3 != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append("Element {");
            sb.append(str);
            sb.append("}");
            sb.append(str2);
            sb.append(write2 == -1 ? " not found in " : " more than once in ");
            sb.append(this);
            throw new RuntimeException(sb.toString());
        }
        Object elementAt = this.write.elementAt(write2);
        if (elementAt instanceof SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) {
            return (SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) elementAt;
        }
        return null;
    }

    public void MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        boolean z = false;
        do {
            int write2 = historyAdapter$GroupErrorViewHolder_ViewBinding.write();
            if (write2 != 1) {
                if (write2 == 2) {
                    SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding write3 = write(historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$MediaItem(), historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat());
                    Vector vector = this.write;
                    write(vector == null ? 0 : vector.size(), 2, (Object) write3);
                    write3.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
                    continue;
                } else if (write2 != 3) {
                    if (historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat() != null) {
                        if (write2 == 6) {
                            write2 = 4;
                        }
                        String RatingCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.RatingCompat();
                        Vector vector2 = this.write;
                        write(vector2 == null ? 0 : vector2.size(), write2, (Object) RatingCompat);
                    } else if (write2 == 6 && historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat() != null) {
                        String MediaDescriptionCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat();
                        Vector vector3 = this.write;
                        write(vector3 == null ? 0 : vector3.size(), 6, (Object) MediaDescriptionCompat);
                    }
                    historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$Token();
                    continue;
                }
            }
            z = true;
            continue;
        } while (!z);
    }

    public void write(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding) throws IOException {
        read(historyAdapter$GroupItemViewHolder_ViewBinding);
        historyAdapter$GroupItemViewHolder_ViewBinding.read();
    }

    public final void read(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding) throws IOException {
        Vector vector = this.write;
        if (vector != null) {
            int size = vector.size();
            for (int i = 0; i < size; i++) {
                char charAt = this.MediaBrowserCompat$CustomActionResultReceiver.charAt(i);
                Object elementAt = this.write.elementAt(i);
                switch (charAt) {
                    case 2:
                        ((SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) elementAt).write(historyAdapter$GroupItemViewHolder_ViewBinding);
                        break;
                    case 4:
                        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$MediaItem((String) elementAt);
                        break;
                    case 5:
                        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((String) elementAt);
                        break;
                    case 6:
                        historyAdapter$GroupItemViewHolder_ViewBinding.read((String) elementAt);
                        break;
                    case 7:
                        historyAdapter$GroupItemViewHolder_ViewBinding.write((String) elementAt);
                        break;
                    case 8:
                        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$SearchResultReceiver((String) elementAt);
                        break;
                    case 9:
                        historyAdapter$GroupItemViewHolder_ViewBinding.IconCompatParcelizer((String) elementAt);
                        break;
                    case 10:
                        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver((String) elementAt);
                        break;
                    default:
                        StringBuilder sb = new StringBuilder();
                        sb.append("Illegal type: ");
                        sb.append(charAt);
                        throw new RuntimeException(sb.toString());
                }
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(int i, Object obj) {
        Vector vector = this.write;
        write(vector == null ? 0 : vector.size(), i, obj);
    }

    private int write(String str, String str2, int i) {
        Vector vector = this.write;
        int size = vector == null ? 0 : vector.size();
        while (i < size) {
            Object elementAt = this.write.elementAt(i);
            SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding = elementAt instanceof SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding ? (SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding) elementAt : null;
            if (selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding != null && str2.equals(selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding.read()) && (str == null || str.equals(selectProvinceOrDistrictAdapter$ViewHolder_ViewBinding.IconCompatParcelizer()))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public boolean IconCompatParcelizer(int i) {
        char charAt = this.MediaBrowserCompat$CustomActionResultReceiver.charAt(0);
        return charAt == 4 || charAt == 7 || charAt == 5;
    }
}
