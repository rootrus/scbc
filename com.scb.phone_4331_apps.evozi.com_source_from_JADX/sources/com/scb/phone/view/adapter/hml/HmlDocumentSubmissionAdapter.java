package com.scb.phone.view.adapter.hml;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import java.util.List;
import kotlin.TypeCastException;
import p040o.CrashlyticsController;
import p040o.HmlNationalIdActivity;
import p040o.activateCard;
import p040o.createReportUploader;
import p040o.getAvailableCycles;
import p040o.onGetStartedClick;
import p040o.onStart;
import p040o.setLastBaselineToBottomHeight;
import p040o.setShortcutName;

public final class HmlDocumentSubmissionAdapter extends RecyclerView.IconCompatParcelizer<RecyclerView.setContentView> {
    public List<? extends CrashlyticsController.C32378> MediaBrowserCompat$ItemReceiver = HmlNationalIdActivity.IconCompatParcelizer;
    private final write write;

    public interface write {
        void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.FileNameContainsFilter fileNameContainsFilter);
    }

    public final class HmlDocumentCategoryViewHolder_ViewBinding implements Unbinder {
        private HmlDocumentCategoryViewHolder write;

        public HmlDocumentCategoryViewHolder_ViewBinding(HmlDocumentCategoryViewHolder hmlDocumentCategoryViewHolder, View view) {
            this.write = hmlDocumentCategoryViewHolder;
            hmlDocumentCategoryViewHolder.categoryType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_document_category, "field 'categoryType'", TextView.class);
        }

        public final void read() {
            HmlDocumentCategoryViewHolder hmlDocumentCategoryViewHolder = this.write;
            if (hmlDocumentCategoryViewHolder != null) {
                this.write = null;
                hmlDocumentCategoryViewHolder.categoryType = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public final class HmlDocumentItemViewHolder_ViewBinding implements Unbinder {
        private HmlDocumentItemViewHolder MediaBrowserCompat$ItemReceiver;

        public HmlDocumentItemViewHolder_ViewBinding(HmlDocumentItemViewHolder hmlDocumentItemViewHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = hmlDocumentItemViewHolder;
            hmlDocumentItemViewHolder.docType = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_document_type, "field 'docType'", TextView.class);
            hmlDocumentItemViewHolder.docNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_document_number, "field 'docNumber'", TextView.class);
            hmlDocumentItemViewHolder.docDetails = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_document_details, "field 'docDetails'", TextView.class);
            hmlDocumentItemViewHolder.toSubmit = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_document_image, "field 'toSubmit'", ImageView.class);
            hmlDocumentItemViewHolder.statusImage = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.hml_document_status_image, "field 'statusImage'", ImageView.class);
        }

        public final void read() {
            HmlDocumentItemViewHolder hmlDocumentItemViewHolder = this.MediaBrowserCompat$ItemReceiver;
            if (hmlDocumentItemViewHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                hmlDocumentItemViewHolder.docType = null;
                hmlDocumentItemViewHolder.docNumber = null;
                hmlDocumentItemViewHolder.docDetails = null;
                hmlDocumentItemViewHolder.toSubmit = null;
                hmlDocumentItemViewHolder.statusImage = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public HmlDocumentSubmissionAdapter(write write2) {
        onGetStartedClick.write((Object) write2, "callback");
        this.write = write2;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        onGetStartedClick.write((Object) viewGroup, "parent");
        if (i == setShortcutName.ITEM.ordinal()) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90402131494267, viewGroup, false);
            onGetStartedClick.IconCompatParcelizer((Object) inflate, "LayoutInflater.from(pare…sion_item, parent, false)");
            return new HmlDocumentItemViewHolder(inflate);
        }
        View inflate2 = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f90392131494266, viewGroup, false);
        onGetStartedClick.IconCompatParcelizer((Object) inflate2, "LayoutInflater.from(pare…_category, parent, false)");
        return new HmlDocumentCategoryViewHolder(inflate2);
    }

    public final int IconCompatParcelizer() {
        return this.MediaBrowserCompat$ItemReceiver.size();
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return ((CrashlyticsController.C32378) this.MediaBrowserCompat$ItemReceiver.get(i)).MediaBrowserCompat$CustomActionResultReceiver().ordinal();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        onGetStartedClick.write((Object) setcontentview, "holder");
        CrashlyticsController.C32378 r12 = (CrashlyticsController.C32378) this.MediaBrowserCompat$ItemReceiver.get(i);
        int i2 = getAvailableCycles.write[r12.MediaBrowserCompat$CustomActionResultReceiver().ordinal()];
        boolean z = true;
        if (i2 == 1) {
            HmlDocumentCategoryViewHolder hmlDocumentCategoryViewHolder = (HmlDocumentCategoryViewHolder) setcontentview;
            if (r12 != null) {
                CrashlyticsController.C32409 r122 = (CrashlyticsController.C32409) r12;
                onGetStartedClick.write((Object) r122, "item");
                TextView textView = hmlDocumentCategoryViewHolder.categoryType;
                if (textView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("categoryType");
                }
                textView.setText(r122.MediaBrowserCompat$CustomActionResultReceiver);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.submission.HmlDocumentCategoryDisplay");
        } else if (i2 == 2) {
            HmlDocumentItemViewHolder hmlDocumentItemViewHolder = (HmlDocumentItemViewHolder) setcontentview;
            if (r12 != null) {
                createReportUploader createreportuploader = (createReportUploader) r12;
                write write2 = this.write;
                onGetStartedClick.write((Object) createreportuploader, "item");
                onGetStartedClick.write((Object) write2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
                TextView textView2 = hmlDocumentItemViewHolder.docType;
                if (textView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("docType");
                }
                HmlDocumentItemViewHolder.write(createreportuploader, textView2);
                TextView textView3 = hmlDocumentItemViewHolder.docNumber;
                if (textView3 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                }
                HmlDocumentItemViewHolder.MediaBrowserCompat$ItemReceiver(createreportuploader, textView3);
                if (hmlDocumentItemViewHolder.statusImage == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("statusImage");
                }
                ImageView imageView = hmlDocumentItemViewHolder.toSubmit;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("toSubmit");
                }
                int i3 = activateCard.MediaBrowserCompat$ItemReceiver[createreportuploader.MediaBrowserCompat$ItemReceiver.ordinal()];
                if (i3 == 1) {
                    Integer num = createreportuploader.RatingCompat;
                    if (num != null) {
                        if (num.intValue() <= 0) {
                            z = false;
                        }
                        if (z) {
                            hmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(R.drawable.ic_uploaded);
                        } else {
                            ImageView imageView2 = hmlDocumentItemViewHolder.toSubmit;
                            if (imageView2 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("toSubmit");
                            }
                            imageView2.setVisibility(0);
                            ImageView imageView3 = hmlDocumentItemViewHolder.statusImage;
                            if (imageView3 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("statusImage");
                            }
                            imageView3.setVisibility(8);
                        }
                    }
                } else if (i3 == 2) {
                    hmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(R.drawable.ic_uploaded);
                } else if (i3 != 3) {
                    imageView.setVisibility(8);
                } else {
                    Integer num2 = createreportuploader.MediaMetadataCompat;
                    if (num2 != null) {
                        if (createreportuploader.MediaDescriptionCompat >= num2.intValue()) {
                            hmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(R.drawable.ic_reuploaded);
                            TextView textView4 = hmlDocumentItemViewHolder.docNumber;
                            if (textView4 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                            }
                            TextView textView5 = hmlDocumentItemViewHolder.docNumber;
                            if (textView5 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                            }
                            textView4.setTextColor(setLastBaselineToBottomHeight.read(textView5.getContext(), R.color.f66422131099798));
                        } else {
                            hmlDocumentItemViewHolder.MediaBrowserCompat$CustomActionResultReceiver(R.drawable.ic_reupload_pending);
                            TextView textView6 = hmlDocumentItemViewHolder.docNumber;
                            if (textView6 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                            }
                            TextView textView7 = hmlDocumentItemViewHolder.docNumber;
                            if (textView7 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                            }
                            textView6.setTextColor(setLastBaselineToBottomHeight.read(textView7.getContext(), R.color.f66452131099801));
                            TextView textView8 = hmlDocumentItemViewHolder.docNumber;
                            if (textView8 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                            }
                            TextView textView9 = hmlDocumentItemViewHolder.docNumber;
                            if (textView9 == null) {
                                onGetStartedClick.MediaBrowserCompat$ItemReceiver("docNumber");
                            }
                            textView8.setText(textView9.getContext().getString(R.string.hml_document_resubmit_files));
                        }
                    }
                }
                TextView textView10 = hmlDocumentItemViewHolder.docDetails;
                if (textView10 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("docDetails");
                }
                HmlDocumentItemViewHolder.IconCompatParcelizer(createreportuploader, textView10);
                hmlDocumentItemViewHolder.write.setOnClickListener(new HmlDocumentItemViewHolder.IconCompatParcelizer(write2, createreportuploader));
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.presentation.model.display.hml.submission.HmlDocumentItemDisplay");
        }
    }

    public final class HmlDocumentItemViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView docDetails;
        @BindView
        public TextView docNumber;
        @BindView
        public TextView docType;
        @BindView
        public ImageView statusImage;
        @BindView
        public ImageView toSubmit;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HmlDocumentItemViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }

        static final class IconCompatParcelizer implements View.OnClickListener {
            private /* synthetic */ createReportUploader MediaBrowserCompat$ItemReceiver;
            private /* synthetic */ write read;

            IconCompatParcelizer(write write, createReportUploader createreportuploader) {
                this.read = write;
                this.MediaBrowserCompat$ItemReceiver = createreportuploader;
            }

            public final void onClick(View view) {
                this.read.MediaBrowserCompat$CustomActionResultReceiver(new CrashlyticsController.FileNameContainsFilter(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver.write));
            }
        }

        /* access modifiers changed from: package-private */
        public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
            ImageView imageView = this.statusImage;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("statusImage");
            }
            imageView.setImageResource(i);
            ImageView imageView2 = this.toSubmit;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("toSubmit");
            }
            imageView2.setVisibility(8);
            ImageView imageView3 = this.statusImage;
            if (imageView3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("statusImage");
            }
            imageView3.setVisibility(0);
        }

        static void MediaBrowserCompat$ItemReceiver(createReportUploader createreportuploader, TextView textView) {
            Integer num = createreportuploader.RatingCompat;
            textView.setText(textView.getContext().getString(R.string.hml_document_uploaded_files, new Object[]{num}));
            if (num == null || num.intValue() != 0) {
                textView.setTextColor(setLastBaselineToBottomHeight.read(textView.getContext(), R.color.f66422131099798));
            } else {
                textView.setTextColor(setLastBaselineToBottomHeight.read(textView.getContext(), R.color.f66182131099773));
            }
        }

        static void IconCompatParcelizer(createReportUploader createreportuploader, TextView textView) {
            if (createreportuploader.read != null) {
                textView.setText(createreportuploader.read);
                textView.setVisibility(0);
            }
        }

        static void write(createReportUploader createreportuploader, TextView textView) {
            textView.setText(createreportuploader.write);
        }
    }

    public final class HmlDocumentCategoryViewHolder extends RecyclerView.setContentView {
        @BindView
        public TextView categoryType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HmlDocumentCategoryViewHolder(View view) {
            super(view);
            onGetStartedClick.write((Object) view, "itemView");
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
