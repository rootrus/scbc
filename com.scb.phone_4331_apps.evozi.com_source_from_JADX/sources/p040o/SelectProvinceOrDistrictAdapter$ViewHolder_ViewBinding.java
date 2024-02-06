package p040o;

import java.io.IOException;
import java.util.Vector;
import org.xmlpull.repackaged.p103v1.XmlPullParserException;

/* renamed from: o.SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding */
public final class SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding extends DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding {
    protected String IconCompatParcelizer;
    DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding MediaBrowserCompat$CustomActionResultReceiver;
    protected String MediaBrowserCompat$ItemReceiver;
    private Vector MediaMetadataCompat;
    private Vector read;

    public final SelectProvinceOrDistrictAdapter$ViewHolder_ViewBinding write(String str, String str2) {
        DepositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding = this.MediaBrowserCompat$CustomActionResultReceiver;
        return depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding == null ? super.write(str, str2) : depositDetailRecyclerViewAdapter$DepositViewHolder_ViewBinding.write(str, str2);
    }

    public final String read() {
        return this.IconCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$ItemReceiver(HistoryAdapter$GroupErrorViewHolder_ViewBinding historyAdapter$GroupErrorViewHolder_ViewBinding) throws IOException, XmlPullParserException {
        int i;
        int MediaBrowserCompat$ItemReceiver2 = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding.read() - 1);
        while (true) {
            if (MediaBrowserCompat$ItemReceiver2 >= historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding.read())) {
                break;
            }
            String IconCompatParcelizer2 = historyAdapter$GroupErrorViewHolder_ViewBinding.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2);
            String MediaDescriptionCompat = historyAdapter$GroupErrorViewHolder_ViewBinding.MediaDescriptionCompat(MediaBrowserCompat$ItemReceiver2);
            if (this.MediaMetadataCompat == null) {
                this.MediaMetadataCompat = new Vector();
            }
            this.MediaMetadataCompat.addElement(new String[]{IconCompatParcelizer2, MediaDescriptionCompat});
            MediaBrowserCompat$ItemReceiver2++;
        }
        for (i = 0; i < historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(); i++) {
            MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding.write(i), historyAdapter$GroupErrorViewHolder_ViewBinding.read(i), historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(i));
        }
        if (historyAdapter$GroupErrorViewHolder_ViewBinding.mo60423x50fd9e4a()) {
            historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$Token();
        } else {
            historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$Token();
            super.MediaBrowserCompat$ItemReceiver(historyAdapter$GroupErrorViewHolder_ViewBinding);
            if (MediaBrowserCompat$ItemReceiver() == 0) {
                MediaBrowserCompat$ItemReceiver(7, "");
            }
        }
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(3, this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
        historyAdapter$GroupErrorViewHolder_ViewBinding.MediaSessionCompat$Token();
    }

    private void MediaBrowserCompat$ItemReceiver(String str, String str2, String str3) {
        if (this.read == null) {
            this.read = new Vector();
        }
        if (str == null) {
            str = "";
        }
        int size = this.read.size() - 1;
        while (size >= 0) {
            String[] strArr = (String[]) this.read.elementAt(size);
            if (!strArr[0].equals(str) || !strArr[1].equals(str2)) {
                size--;
            } else if (str3 == null) {
                this.read.removeElementAt(size);
                return;
            } else {
                strArr[2] = str3;
                return;
            }
        }
        this.read.addElement(new String[]{str, str2, str3});
    }

    public final void write(HistoryAdapter$GroupItemViewHolder_ViewBinding historyAdapter$GroupItemViewHolder_ViewBinding) throws IOException {
        if (this.MediaMetadataCompat != null) {
            for (int i = 0; i < this.MediaMetadataCompat.size(); i++) {
                historyAdapter$GroupItemViewHolder_ViewBinding.IconCompatParcelizer(((String[]) this.MediaMetadataCompat.elementAt(i))[0], ((String[]) this.MediaMetadataCompat.elementAt(i))[1]);
            }
        }
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
        Vector vector = this.read;
        int size = vector == null ? 0 : vector.size();
        for (int i2 = 0; i2 < size; i2++) {
            historyAdapter$GroupItemViewHolder_ViewBinding.read(((String[]) this.read.elementAt(i2))[0], ((String[]) this.read.elementAt(i2))[1], ((String[]) this.read.elementAt(i2))[2]);
        }
        read(historyAdapter$GroupItemViewHolder_ViewBinding);
        historyAdapter$GroupItemViewHolder_ViewBinding.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, this.IconCompatParcelizer);
    }
}
