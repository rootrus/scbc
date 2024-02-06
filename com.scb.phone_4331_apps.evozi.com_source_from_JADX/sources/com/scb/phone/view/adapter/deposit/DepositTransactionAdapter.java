package com.scb.phone.view.adapter.deposit;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.BaseExpandableRecycleViewAdapter;
import com.scb.phone.view.custom.common.NoteEditTextWithButton;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import p040o.AlertController$RecycleListView;
import p040o.BankingAgentService;
import p040o.finalizeSession;
import p040o.generateQRBarcode;
import p040o.getAgents;
import p040o.getShortName;
import p040o.onStart;
import p040o.putQrToPay;
import p040o.setLastBaselineToBottomHeight;
import p040o.validateGER;
import p040o.validateHERK;
import p040o.validateSPMV;
import p040o.writeSessionApp;
import p040o.writeSessionDevice;

public final class DepositTransactionAdapter extends BaseExpandableRecycleViewAdapter {
    public int MediaBrowserCompat$ItemReceiver;
    public List<writeSessionApp> MediaBrowserCompat$MediaItem = new ArrayList();
    public String MediaBrowserCompat$SearchResultReceiver = "";
    /* access modifiers changed from: private */
    public validateGER MediaDescriptionCompat;
    public getShortName MediaMetadataCompat;
    private int MediaSessionCompat$QueueItem = -1;
    /* access modifiers changed from: private */
    public DepositTransactionAdapter$MediaBrowserCompat$ItemReceiver MediaSessionCompat$ResultReceiverWrapper;
    private View.OnClickListener ParcelableVolumeInfo;
    private boolean RatingCompat = false;
    public String read;

    @FunctionalInterface
    public interface read {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);
    }

    /* renamed from: a_ */
    public final boolean mo20940a_(RecyclerView.setContentView setcontentview) {
        return false;
    }

    public class GroupItemViewHolder_ViewBinding extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder_ViewBinding {
        private GroupItemViewHolder MediaBrowserCompat$ItemReceiver;

        public GroupItemViewHolder_ViewBinding(GroupItemViewHolder groupItemViewHolder, View view) {
            super(groupItemViewHolder, view);
            this.MediaBrowserCompat$ItemReceiver = groupItemViewHolder;
            groupItemViewHolder.container = onStart.IconCompatParcelizer(view, R.id.container, "field 'container'");
            groupItemViewHolder.viewVerticalLine = onStart.IconCompatParcelizer(view, R.id.view_vertical_line, "field 'viewVerticalLine'");
            groupItemViewHolder.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
            groupItemViewHolder.textAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_amount, "field 'textAmount'", TextView.class);
            groupItemViewHolder.textTimestamp = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_timestamp, "field 'textTimestamp'", TextView.class);
            groupItemViewHolder.textAnnotation = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_annotation, "field 'textAnnotation'", TextView.class);
            groupItemViewHolder.viewVerticalLineBelowDot = onStart.IconCompatParcelizer(view, R.id.view_vertical_line_below_dot, "field 'viewVerticalLineBelowDot'");
        }

        public final void read() {
            GroupItemViewHolder groupItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (groupItemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                groupItemViewHolder.container = null;
                groupItemViewHolder.viewVerticalLine = null;
                groupItemViewHolder.textTitle = null;
                groupItemViewHolder.textAmount = null;
                groupItemViewHolder.textTimestamp = null;
                groupItemViewHolder.textAnnotation = null;
                groupItemViewHolder.viewVerticalLineBelowDot = null;
                super.read();
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ChildViewHolder_ViewBinding implements Unbinder {
        private ChildViewHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ChildViewHolder_ViewBinding(ChildViewHolder childViewHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = childViewHolder;
            childViewHolder.viewGroupTxnDescription = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_txn_description, "field 'viewGroupTxnDescription'", ViewGroup.class);
            childViewHolder.textDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_description, "field 'textDescription'", TextView.class);
            childViewHolder.textAddNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_add_note, "field 'textAddNote'", TextView.class);
            childViewHolder.layoutNoteEdit = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_note_edit, "field 'layoutNoteEdit'", LinearLayout.class);
            childViewHolder.layoutNoteView = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_note_view, "field 'layoutNoteView'", LinearLayout.class);
            childViewHolder.tvNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note, "field 'tvNote'", TextView.class);
            childViewHolder.ivEdit = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_edit, "field 'ivEdit'", ImageView.class);
            childViewHolder.noteEditText = (NoteEditTextWithButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditTextWithButton.class);
            childViewHolder.viewGroupTxnFixed = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_txn_fixed, "field 'viewGroupTxnFixed'", ViewGroup.class);
            childViewHolder.textDepositDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_deposit_date, "field 'textDepositDate'", TextView.class);
            childViewHolder.textTenor = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_tenor, "field 'textTenor'", TextView.class);
            childViewHolder.textTenorTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_tenor_title, "field 'textTenorTitle'", TextView.class);
            childViewHolder.textInterestRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_interest_rate, "field 'textInterestRate'", TextView.class);
            childViewHolder.textInterestAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_txn_interest, "field 'textInterestAmount'", TextView.class);
        }

        public final void read() {
            ChildViewHolder childViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (childViewHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                childViewHolder.viewGroupTxnDescription = null;
                childViewHolder.textDescription = null;
                childViewHolder.textAddNote = null;
                childViewHolder.layoutNoteEdit = null;
                childViewHolder.layoutNoteView = null;
                childViewHolder.tvNote = null;
                childViewHolder.ivEdit = null;
                childViewHolder.noteEditText = null;
                childViewHolder.viewGroupTxnFixed = null;
                childViewHolder.textDepositDate = null;
                childViewHolder.textTenor = null;
                childViewHolder.textTenorTitle = null;
                childViewHolder.textInterestRate = null;
                childViewHolder.textInterestAmount = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public DepositTransactionAdapter(Context context, validateGER validateger, DepositTransactionAdapter$MediaBrowserCompat$ItemReceiver depositTransactionAdapter$MediaBrowserCompat$ItemReceiver) {
        super(context);
        this.MediaDescriptionCompat = validateger;
        this.ParcelableVolumeInfo = new generateQRBarcode(this);
        this.MediaSessionCompat$ResultReceiverWrapper = depositTransactionAdapter$MediaBrowserCompat$ItemReceiver;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, read read2) {
        if (this.RatingCompat != z) {
            this.RatingCompat = z;
            if (z) {
                this.MediaBrowserCompat$MediaItem.add((Object) null);
                this.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$MediaItem.size() - 1, 1);
            } else {
                List<writeSessionApp> list = this.MediaBrowserCompat$MediaItem;
                list.remove(list.size() - 1);
                this.IconCompatParcelizer.write(this.MediaBrowserCompat$MediaItem.size(), 1);
            }
        }
        if (read2 != null) {
            read2.MediaBrowserCompat$CustomActionResultReceiver(z);
        }
    }

    public final int MediaMetadataCompat(int i) {
        return this.MediaBrowserCompat$MediaItem.get(i) == null ? 0 : 1;
    }

    public final int MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$MediaItem.size();
    }

    public final RecyclerView.setContentView write(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new GroupItemViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82612131493487, viewGroup, false), this.ParcelableVolumeInfo);
        }
        if (i == 0) {
            return new write(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83992131493625, viewGroup, false));
        }
        return null;
    }

    public final RecyclerView.setContentView read(ViewGroup viewGroup, int i) {
        return new ChildViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f82622131493488, viewGroup, false));
    }

    public final void MediaBrowserCompat$ItemReceiver(RecyclerView.setContentView setcontentview, int i) {
        if (setcontentview instanceof GroupItemViewHolder) {
            ((GroupItemViewHolder) setcontentview).MediaBrowserCompat$ItemReceiver(i);
        }
    }

    public final void write(RecyclerView.setContentView setcontentview, int i, int i2) {
        if (setcontentview instanceof ChildViewHolder) {
            ChildViewHolder childViewHolder = (ChildViewHolder) setcontentview;
            writeSessionApp writesessionapp = DepositTransactionAdapter.this.MediaBrowserCompat$MediaItem.get(i);
            if (writesessionapp instanceof finalizeSession) {
                childViewHolder.viewGroupTxnFixed.setVisibility(8);
                childViewHolder.viewGroupTxnDescription.setVisibility(0);
                childViewHolder.layoutNoteEdit.setVisibility(8);
                childViewHolder.tvNote.setText(writesessionapp.IconCompatParcelizer);
                childViewHolder.noteEditText.setText(writesessionapp.IconCompatParcelizer);
                if (writesessionapp.MediaBrowserCompat$CustomActionResultReceiver == writeSessionApp.read.NO_ANNOTATION) {
                    childViewHolder.layoutNoteEdit.setVisibility(8);
                    childViewHolder.textAddNote.setVisibility(0);
                    childViewHolder.layoutNoteView.setVisibility(8);
                } else {
                    childViewHolder.layoutNoteEdit.setVisibility(8);
                    childViewHolder.textAddNote.setVisibility(8);
                    childViewHolder.layoutNoteView.setVisibility(0);
                }
                childViewHolder.textDescription.setText(((finalizeSession) writesessionapp).MediaBrowserCompat$ItemReceiver);
                childViewHolder.textAddNote.setOnClickListener(new getAgents(childViewHolder, i));
                childViewHolder.noteEditText.setOnDoneButtonListener(new putQrToPay(childViewHolder, i));
                childViewHolder.ivEdit.setOnClickListener(new BankingAgentService(childViewHolder, i));
            } else if (writesessionapp instanceof writeSessionDevice) {
                childViewHolder.viewGroupTxnDescription.setVisibility(8);
                childViewHolder.viewGroupTxnFixed.setVisibility(0);
                if ("MT".equalsIgnoreCase(DepositTransactionAdapter.this.MediaBrowserCompat$SearchResultReceiver)) {
                    childViewHolder.textTenor.setVisibility(0);
                    childViewHolder.textTenorTitle.setVisibility(0);
                } else {
                    childViewHolder.textTenor.setVisibility(8);
                    childViewHolder.textTenorTitle.setVisibility(8);
                }
                writeSessionDevice writesessiondevice = (writeSessionDevice) writesessionapp;
                childViewHolder.textDepositDate.setText(writesessiondevice.MediaBrowserCompat$ItemReceiver);
                childViewHolder.textTenor.setText(writesessiondevice.MediaSessionCompat$Token);
                childViewHolder.textInterestRate.setText(writesessiondevice.MediaSessionCompat$QueueItem);
                childViewHolder.textInterestAmount.setText(writesessiondevice.f2977x50fd9e4a);
            }
        }
    }

    class write extends validateSPMV {
        write(View view) {
            super(view);
        }
    }

    class GroupItemViewHolder extends BaseExpandableRecycleViewAdapter.BaseParentViewHolder {
        @BindView
        View container;
        @BindView
        TextView textAmount;
        @BindView
        TextView textAnnotation;
        @BindView
        TextView textTimestamp;
        @BindView
        TextView textTitle;
        @BindView
        View viewVerticalLine;
        @BindView
        View viewVerticalLineBelowDot;

        GroupItemViewHolder(View view, View.OnClickListener onClickListener) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
            this.container.setOnClickListener(onClickListener);
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$ItemReceiver(int i) {
            writeSessionApp writesessionapp = (writeSessionApp) DepositTransactionAdapter.this.MediaBrowserCompat$MediaItem.get(i);
            this.textTitle.setText(writesessionapp.MediaBrowserCompat$SearchResultReceiver);
            this.textTimestamp.setText(writesessionapp.MediaDescriptionCompat);
            this.textAnnotation.setText(writesessionapp.IconCompatParcelizer);
            int i2 = 4;
            if (DepositTransactionAdapter.this.MediaDescriptionCompat.IconCompatParcelizer(i)) {
                this.textAnnotation.setVisibility(4);
            } else {
                this.textAnnotation.setVisibility(0);
            }
            boolean z = i == 0;
            View view = this.viewVerticalLine;
            if (!z) {
                i2 = 0;
            }
            view.setVisibility(i2);
            this.viewVerticalLineBelowDot.setVisibility(i == DepositTransactionAdapter.this.MediaBrowserCompat$MediaItem.size() - 1 ? 8 : 0);
            if (!DepositTransactionAdapter.read(DepositTransactionAdapter.this)) {
                this.write.setClickable(false);
                this.expandIcon.setVisibility(8);
            } else {
                this.write.setClickable(true);
                this.expandIcon.setVisibility(0);
            }
            Context context = this.write.getContext();
            this.textAmount.setText(writesessionapp.read);
            this.textAmount.setTextColor(setLastBaselineToBottomHeight.read(context, writesessionapp.RatingCompat));
            BaseExpandableRecycleViewAdapter.MediaBrowserCompat$CustomActionResultReceiver(this);
        }
    }

    public class ChildViewHolder extends validateSPMV {
        @BindView
        ImageView ivEdit;
        @BindView
        public LinearLayout layoutNoteEdit;
        @BindView
        public LinearLayout layoutNoteView;
        @BindView
        public NoteEditTextWithButton noteEditText;
        @BindView
        public TextView textAddNote;
        @BindView
        TextView textDepositDate;
        @BindView
        TextView textDescription;
        @BindView
        TextView textInterestAmount;
        @BindView
        TextView textInterestRate;
        @BindView
        TextView textTenor;
        @BindView
        TextView textTenorTitle;
        @BindView
        TextView tvNote;
        @BindView
        ViewGroup viewGroupTxnDescription;
        @BindView
        ViewGroup viewGroupTxnFixed;

        ChildViewHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public static boolean MediaBrowserCompat$ItemReceiver(String str) {
            return TextUtils.isEmpty(str) || Pattern.compile("^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$").matcher(str).matches();
        }

        public final void read() {
            ((InputMethodManager) DepositTransactionAdapter.this.write.getSystemService("input_method")).showSoftInput(this.noteEditText.mNoteEditText, 1);
            ((InputMethodManager) DepositTransactionAdapter.this.write.getSystemService("input_method")).showSoftInput(this.noteEditText.mNoteEditText, 0);
        }
    }

    static /* synthetic */ boolean read(DepositTransactionAdapter depositTransactionAdapter) {
        return depositTransactionAdapter.MediaMetadataCompat != getShortName.TYPE_LONG_TERM;
    }

    public static /* synthetic */ void write(DepositTransactionAdapter depositTransactionAdapter, View view) {
        int i;
        long j;
        if (view.getId() == R.id.container) {
            if (depositTransactionAdapter.MediaMetadataCompat != getShortName.TYPE_LONG_TERM) {
                if (depositTransactionAdapter.write instanceof BaseActivity) {
                    ((BaseActivity) depositTransactionAdapter.write).PlaybackStateCompat$CustomAction();
                }
                RecyclerView.setContentView IconCompatParcelizer = AlertController$RecycleListView.IconCompatParcelizer(view);
                if (IconCompatParcelizer != null) {
                    RecyclerView recyclerView = IconCompatParcelizer.MediaMetadataCompat;
                    if (recyclerView == null) {
                        i = -1;
                    } else {
                        i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer);
                    }
                    if (i != -1) {
                        validateHERK validateherk = depositTransactionAdapter.MediaDescriptionCompat.MediaDescriptionCompat;
                        if (validateherk == null) {
                            j = -1;
                        } else {
                            j = validateherk.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver(i);
                        }
                        int i2 = (int) j;
                        if (((int) (j >>> 32)) == -1) {
                            View currentFocus = ((Activity) depositTransactionAdapter.write).getCurrentFocus();
                            if (currentFocus != null) {
                                currentFocus.clearFocus();
                            }
                            if (depositTransactionAdapter.MediaDescriptionCompat.IconCompatParcelizer(i2)) {
                                validateHERK validateherk2 = depositTransactionAdapter.MediaDescriptionCompat.MediaDescriptionCompat;
                                if (validateherk2 != null) {
                                    boolean MediaBrowserCompat$ItemReceiver2 = validateherk2.MediaBrowserCompat$ItemReceiver(i2, false, (Object) null);
                                }
                            } else {
                                depositTransactionAdapter.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver();
                                validateHERK validateherk3 = depositTransactionAdapter.MediaDescriptionCompat.MediaDescriptionCompat;
                                if (validateherk3 != null) {
                                    boolean read2 = validateherk3.read(i2, false, (Object) null);
                                }
                            }
                        }
                        if (IconCompatParcelizer instanceof GroupItemViewHolder) {
                            int i3 = depositTransactionAdapter.MediaSessionCompat$QueueItem;
                            if (i3 >= 0 && i3 != i) {
                                depositTransactionAdapter.IconCompatParcelizer.write();
                            }
                            if (depositTransactionAdapter.MediaDescriptionCompat.IconCompatParcelizer(i)) {
                                ((GroupItemViewHolder) IconCompatParcelizer).textAnnotation.setVisibility(4);
                            } else {
                                ((GroupItemViewHolder) IconCompatParcelizer).textAnnotation.setVisibility(0);
                            }
                        }
                        depositTransactionAdapter.MediaSessionCompat$QueueItem = i;
                    }
                }
            }
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(writeSessionApp writesessionapp) {
        if (TextUtils.isEmpty(writesessionapp.IconCompatParcelizer)) {
            writesessionapp.MediaBrowserCompat$CustomActionResultReceiver = writeSessionApp.read.NO_ANNOTATION;
        } else {
            writesessionapp.MediaBrowserCompat$CustomActionResultReceiver = writeSessionApp.read.HAVE_ANNOTATION;
        }
    }
}
