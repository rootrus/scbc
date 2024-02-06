package p040o;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.thunderhead.android.infrastructure.p057ui.views.FontIconDrawableTextView;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatRadioButton;
import com.thunderhead.android.infrastructure.server.entitys.Proposition;
import java.util.ArrayList;
import java.util.List;
import p040o.DeejungTransferMinFullConfirmationActivity;

/* renamed from: o.FragmentBuilder_BindTransferToMeAccountFragment */
public final class FragmentBuilder_BindTransferToMeAccountFragment extends RecyclerView.IconCompatParcelizer<onRetakeClicked> {
    public List<Proposition> MediaBrowserCompat$ItemReceiver;
    public int RatingCompat = -1;
    public final List<FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Proposition>> read = new ArrayList();
    public final List<View.OnClickListener> write = new ArrayList();

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        onRetakeClicked onretakeclicked = (onRetakeClicked) setcontentview;
        Proposition proposition = this.MediaBrowserCompat$ItemReceiver.get(i);
        boolean equals = proposition.getId().equals(Proposition.SEARCH_GROUP_ID);
        if (equals) {
            str = proposition.getName().replace("path_separator", "");
        } else {
            str = proposition.getName();
        }
        onretakeclicked.AlertController$RecycleListView.setText(str);
        if (proposition.getChildren() == null || proposition.getChildren().length <= 0) {
            onretakeclicked.AlertController$RecycleListView.setOnTouchListener((View.OnTouchListener) null);
            TTFAppCompatRadioButton tTFAppCompatRadioButton = onretakeclicked.AlertController$RecycleListView;
            CropDocumentActivity_ViewBinding cropDocumentActivity_ViewBinding = CropDocumentActivity_ViewBinding.RIGHT;
            FontIconDrawableTextView fontIconDrawableTextView = tTFAppCompatRadioButton.IconCompatParcelizer;
            if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.LEFT && fontIconDrawableTextView.write != null) {
                fontIconDrawableTextView.read = null;
                fontIconDrawableTextView.write = null;
                fontIconDrawableTextView.MediaDescriptionCompat.get().setCompoundDrawables(fontIconDrawableTextView.write, (Drawable) null, fontIconDrawableTextView.MediaMetadataCompat, (Drawable) null);
            } else if (cropDocumentActivity_ViewBinding == CropDocumentActivity_ViewBinding.RIGHT && fontIconDrawableTextView.MediaMetadataCompat != null) {
                fontIconDrawableTextView.MediaBrowserCompat$ItemReceiver = null;
                fontIconDrawableTextView.MediaMetadataCompat = null;
                fontIconDrawableTextView.MediaDescriptionCompat.get().setCompoundDrawables(fontIconDrawableTextView.write, (Drawable) null, fontIconDrawableTextView.MediaMetadataCompat, (Drawable) null);
            }
        } else {
            onretakeclicked.AlertController$RecycleListView.setFontIcon(CropDocumentActivity_ViewBinding.RIGHT, C6555xdccae8ee.th_icon_chevron, 0.3f);
            onretakeclicked.AlertController$RecycleListView.setOnTouchListener(new IconCompatParcelizer(onretakeclicked.AlertController$RecycleListView, proposition));
        }
        onretakeclicked.AlertController$RecycleListView.setChecked(this.RatingCompat == i);
        if (equals) {
            onretakeclicked.AlertController$RecycleListView.setOnClickListener((View.OnClickListener) null);
            onretakeclicked.AlertController$RecycleListView.setTag("PropositionHeader");
            return;
        }
        onretakeclicked.AlertController$RecycleListView.setOnClickListener(new C6861xf8613fb(this, i));
    }

    public FragmentBuilder_BindTransferToMeAccountFragment(List<Proposition> list) {
        this.MediaBrowserCompat$ItemReceiver = list;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.MediaBrowserCompat$ItemReceiver.get(i).getId().equals(Proposition.SEARCH_GROUP_ID) ? C6554xc460715d.th_view_list_item_checkable_header : C6554xc460715d.th_view_list_item_checkable;
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        int i;
        if (str != null && !str.equals("")) {
            i = 0;
            while (true) {
                if (i < this.MediaBrowserCompat$ItemReceiver.size()) {
                    if (this.MediaBrowserCompat$ItemReceiver.get(i).getId().equals(str)) {
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
            int i2 = this.RatingCompat;
            this.RatingCompat = i;
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2, 1);
        }
        i = -1;
        int i22 = this.RatingCompat;
        this.RatingCompat = i;
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
        this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i22, 1);
    }

    /* renamed from: o.FragmentBuilder_BindTransferToMeAccountFragment$IconCompatParcelizer */
    class IconCompatParcelizer extends DeejungTransferMinFullConfirmationActivity.write {
        private final Proposition IconCompatParcelizer;

        IconCompatParcelizer(TextView textView, Proposition proposition) {
            super(textView);
            this.IconCompatParcelizer = proposition;
        }

        public final boolean MediaBrowserCompat$CustomActionResultReceiver() {
            for (FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Proposition> MediaBrowserCompat$CustomActionResultReceiver2 : FragmentBuilder_BindTransferToMeAccountFragment.this.read) {
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer);
            }
            return true;
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new onRetakeClicked(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
