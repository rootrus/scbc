package p040o;

import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.thunderhead.android.infrastructure.p057ui.views.TTFAppCompatRadioButton;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import java.lang.ref.WeakReference;
import java.util.List;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;

/* renamed from: o.FragmentBuilder_BindPersonalInformationFragment */
public final class FragmentBuilder_BindPersonalInformationFragment extends RecyclerView.IconCompatParcelizer<onRetakeClicked> {
    public int MediaBrowserCompat$ItemReceiver = -1;
    private final boolean MediaDescriptionCompat;
    private final WeakReference<Context> RatingCompat;
    private final View.OnClickListener read;
    public List<AttributeData> write;

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        int i3;
        onRetakeClicked onretakeclicked = (onRetakeClicked) setcontentview;
        AttributeData attributeData = this.write.get(i);
        if (attributeData != null && attributeData.getDisplayName() != null) {
            boolean z = true;
            if (this.MediaDescriptionCompat) {
                String dataType = attributeData.getDataType();
                char c = 65535;
                int hashCode = dataType.hashCode();
                if (hashCode != -1724355406) {
                    if (hashCode != -1282431251) {
                        if (hashCode == 782694408 && dataType.equals(AttributeData.BOOLEAN_TYPE)) {
                            c = 0;
                        }
                    } else if (dataType.equals(AttributeData.NUMERIC_TYPE)) {
                        c = 1;
                    }
                } else if (dataType.equals(AttributeData.SYMBOLIC_TYPE)) {
                    c = 2;
                }
                if (c == 0) {
                    i3 = C6555xdccae8ee.th_icon_boolean;
                    i2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_icon_boolean;
                } else if (c != 1) {
                    i3 = C6555xdccae8ee.th_icon_symbolic;
                    i2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_icon_symbolic;
                } else {
                    i3 = C6555xdccae8ee.th_icon_numeric;
                    i2 = FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.write.th_icon_numeric;
                }
                onretakeclicked.AlertController$RecycleListView.setFontIcon(CropDocumentActivity_ViewBinding.RIGHT, i3, i2);
            }
            String displayName = attributeData.getDisplayName();
            if (attributeData.getKeyApiName() == null || attributeData.getKeyApiName().equals("") || this.RatingCompat.get() == null) {
                onretakeclicked.AlertController$RecycleListView.setText(displayName);
            } else {
                Context context = this.RatingCompat.get();
                String string = context.getString(C6555xdccae8ee.th_icon_key);
                StringBuilder sb = new StringBuilder();
                sb.append(displayName);
                sb.append("    ");
                sb.append(string);
                String obj = sb.toString();
                onDoneClicked ondoneclicked = new onDoneClicked(Typeface.createFromAsset(context.getAssets(), context.getApplicationContext().getResources().getString(C6555xdccae8ee.th_fontello_ttf_file)));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(obj);
                spannableStringBuilder.setSpan(ondoneclicked, obj.indexOf(string), obj.length(), 0);
                onretakeclicked.AlertController$RecycleListView.setText(spannableStringBuilder);
            }
            TTFAppCompatRadioButton tTFAppCompatRadioButton = onretakeclicked.AlertController$RecycleListView;
            if (this.MediaBrowserCompat$ItemReceiver != i) {
                z = false;
            }
            tTFAppCompatRadioButton.setChecked(z);
            onretakeclicked.AlertController$RecycleListView.setOnClickListener(new C6638x49df1eb8(this, i, this.read));
        }
    }

    public FragmentBuilder_BindPersonalInformationFragment(Context context, boolean z, List<AttributeData> list, View.OnClickListener onClickListener) {
        this.write = list;
        this.RatingCompat = new WeakReference<>(context);
        this.read = onClickListener;
        this.MediaDescriptionCompat = z;
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return C6554xc460715d.th_view_list_item_checkable;
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        if (str != null && str.length() != 0) {
            int i = 0;
            while (true) {
                if (i >= this.write.size()) {
                    i = -1;
                    break;
                } else if (this.write.get(i).getId().equals(str)) {
                    break;
                } else {
                    i++;
                }
            }
            int i2 = this.MediaBrowserCompat$ItemReceiver;
            this.MediaBrowserCompat$ItemReceiver = i;
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i, 1);
            this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(i2, 1);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new onRetakeClicked(LayoutInflater.from(viewGroup.getContext()).inflate(i, viewGroup, false));
    }
}
