package p040o;

import com.thunderhead.android.infrastructure.server.entitys.Proposition;
import com.thunderhead.trackoption.fragments.PropositionsRootListFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/* renamed from: o.ExportCardStatementActivity_ViewBinding */
public final class ExportCardStatementActivity_ViewBinding {
    public Proposition[] IconCompatParcelizer;
    public HashMap<String, ArrayList<Proposition>> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();
    public PropositionsRootListFragment.read read;
    public LinkedList<Proposition> write = new LinkedList<>();

    public final void IconCompatParcelizer(boolean z) {
        this.write.clear();
        PropositionsRootListFragment.read read2 = this.read;
        read2.IconCompatParcelizer.setText("");
        read2.IconCompatParcelizer.clearFocus();
        IconCompatParcelizer("", this.IconCompatParcelizer);
        if (z) {
            MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        CropDocumentActivity cropDocumentActivity = this.read.write;
        if (cropDocumentActivity != null) {
            cropDocumentActivity.write(false);
        }
        if (onClickActionNext.IconCompatParcelizer == null) {
            onClickActionNext.IconCompatParcelizer = new onClickActionNext();
        }
        if (onClickActionNext.IconCompatParcelizer.write != null) {
            for (Proposition id : this.IconCompatParcelizer) {
                String id2 = id.getId();
                if (onClickActionNext.IconCompatParcelizer == null) {
                    onClickActionNext.IconCompatParcelizer = new onClickActionNext();
                }
                if (id2.equals(onClickActionNext.IconCompatParcelizer.write.getId())) {
                    CropDocumentActivity cropDocumentActivity2 = this.read.write;
                    if (cropDocumentActivity2 != null) {
                        cropDocumentActivity2.write(true);
                        return;
                    }
                    return;
                }
            }
        }
    }

    private void IconCompatParcelizer(String str, Proposition[] propositionArr) {
        String str2;
        for (Proposition proposition : propositionArr) {
            proposition.setPath(str);
            this.write.add(proposition);
            if (proposition.getChildren().length != 0) {
                if (str.equals("")) {
                    str2 = proposition.getName();
                } else {
                    String[] split = str.split("path_separator");
                    if (split.length == 1) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(" ");
                        sb.append("path_separator");
                        sb.append("/");
                        sb.append("path_separator");
                        sb.append(" ");
                        sb.append(proposition.getName());
                        str2 = sb.toString();
                    } else if (split[1].length() < 10) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(split[0]);
                        sb2.append("path_separator");
                        sb2.append(split[1]);
                        sb2.append("/");
                        sb2.append("path_separator");
                        sb2.append(" ");
                        sb2.append(proposition.getName());
                        str2 = sb2.toString();
                    } else {
                        str2 = "";
                    }
                }
                if (!str2.equals("")) {
                    IconCompatParcelizer(str2, proposition.getChildren());
                }
            }
        }
    }
}
