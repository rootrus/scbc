package com.scb.phone.view.adapter.deposit;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import java.util.LinkedHashMap;
import java.util.List;
import p040o.BillPaymentService;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.doWriteNonFatal;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;

public final class FatcaQuestionnaireAdapter extends RecyclerView.IconCompatParcelizer<ViewHolder> {
    public LinkedHashMap<String, String> MediaBrowserCompat$ItemReceiver = new LinkedHashMap<>();
    /* access modifiers changed from: private */
    public final write MediaDescriptionCompat;
    private Context RatingCompat;
    public List<doWriteNonFatal> read;
    public final IconCompatParcelizer write;

    public interface IconCompatParcelizer {
        void read(boolean z);
    }

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(int i, String str);
    }

    public class ViewHolder_ViewBinding implements Unbinder {
        private ViewHolder MediaBrowserCompat$ItemReceiver;

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = viewHolder;
            viewHolder.imageQuestion = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_question, "field 'imageQuestion'", ImageView.class);
            viewHolder.textQuestion = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_question, "field 'textQuestion'", TextView.class);
            viewHolder.radioGroupYesOrNo = (RadioGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.rdg_yes_no, "field 'radioGroupYesOrNo'", RadioGroup.class);
            viewHolder.textNotSure = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_not_sure, "field 'textNotSure'", TextView.class);
        }

        public final void read() {
            ViewHolder viewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (viewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                viewHolder.imageQuestion = null;
                viewHolder.textQuestion = null;
                viewHolder.radioGroupYesOrNo = null;
                viewHolder.textNotSure = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        ViewHolder viewHolder = (ViewHolder) setcontentview;
        doWriteNonFatal dowritenonfatal = this.read.get(i);
        if (!TextUtils.isEmpty(dowritenonfatal.IconCompatParcelizer)) {
            viewHolder.textNotSure.setVisibility(0);
            viewHolder.textNotSure.setOnClickListener(new FatcaQuestionnaireAdapter$MediaBrowserCompat$ItemReceiver(this, i, dowritenonfatal.IconCompatParcelizer));
        } else {
            viewHolder.textNotSure.setVisibility(8);
        }
        viewHolder.textQuestion.setText(dowritenonfatal.MediaBrowserCompat$ItemReceiver);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$ItemReceiver(setLastBaselineToBottomHeight.write(this.RatingCompat, R.drawable.shape_circle_fake_white), viewHolder.imageQuestion, dowritenonfatal.read, (int) this.RatingCompat.getResources().getDimension(R.dimen.f73272131165582));
        viewHolder.radioGroupYesOrNo.setOnCheckedChangeListener(new BillPaymentService(this, dowritenonfatal));
    }

    public FatcaQuestionnaireAdapter(List<doWriteNonFatal> list, write write2, IconCompatParcelizer iconCompatParcelizer) {
        this.read = list;
        this.MediaDescriptionCompat = write2;
        this.write = iconCompatParcelizer;
        MediaBrowserCompat$CustomActionResultReceiver(list);
    }

    public final int IconCompatParcelizer() {
        return this.read.size();
    }

    class ViewHolder extends RecyclerView.setContentView {
        @BindView
        ImageView imageQuestion;
        @BindView
        RadioGroup radioGroupYesOrNo;
        @BindView
        TextView textNotSure;
        @BindView
        TextView textQuestion;

        public ViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteNonFatal> list) {
        for (doWriteNonFatal dowritenonfatal : list) {
            this.MediaBrowserCompat$ItemReceiver.put(dowritenonfatal.MediaBrowserCompat$CustomActionResultReceiver, (Object) null);
        }
    }

    public final /* synthetic */ RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        this.RatingCompat = context;
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.f84532131493679, (ViewGroup) null));
    }
}
