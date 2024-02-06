package p040o;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.app.Activity;
import android.app.Application;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.Process;
import android.os.RemoteException;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$MediaBrowserCompat$SearchResultReceiver;
import com.androidadvance.topsnackbar.TSnackbar;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.ImageHeaderParser;
import com.drew.imaging.ImageProcessingException;
import com.drew.imaging.jpeg.JpegProcessingException;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.google.common.base.Ascii;
import com.google.gson.Gson;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import com.scb.phone.view.activity.AddressSearchActivity;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.ReviewSuccessfulActivity;
import com.scb.phone.view.activity.additionaldocument.CaptureDocumentActivity;
import com.scb.phone.view.activity.additionaldocument.CropDocumentActivity;
import com.scb.phone.view.activity.additionaldocument.DocumentInstructionsActivity;
import com.scb.phone.view.activity.additionaldocument.HmlApiBasedDocumentInstructionsActivity;
import com.scb.phone.view.activity.additionaldocument.ReviewDocumentActivity;
import com.scb.phone.view.activity.bankingaccount.BankingActionActivity;
import com.scb.phone.view.activity.bankingagent.BankingAgentReviewActivity;
import com.scb.phone.view.activity.bankingagent.BankingAgentSuccessActivity;
import com.scb.phone.view.activity.bankingagent.BankingAgentTCActivity;
import com.scb.phone.view.activity.bankingagent.BankingEnterAmountActivity;
import com.scb.phone.view.activity.bankingagent.GenerateQRActivity;
import com.scb.phone.view.activity.bankingagent.ServiceAtBankingAgentActivity;
import com.scb.phone.view.activity.bankingagent.ServiceAtBankingAgentCoachMarkActivity;
import com.scb.phone.view.activity.bond.BondLandingActivity;
import com.scb.phone.view.activity.bond.BondPurchaseReviewActivity;
import com.scb.phone.view.activity.bond.BondTermsAndConditionsActivity;
import com.scb.phone.view.activity.bscanc.BScanCEntryPointActivity;
import com.scb.phone.view.activity.bscanc.ManageQrToPayActivity;
import com.scb.phone.view.activity.bscanc.QRPaymentActivity;
import com.scb.phone.view.activity.bscanc.QrToPayOtpActivity;
import com.scb.phone.view.activity.bulktransfer.AddNewRecipientActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferInfoActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferInputActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferOtpActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferReviewActivity;
import com.scb.phone.view.activity.bulktransfer.BulkTransferSuccessActivity;
import com.scb.phone.view.activity.bulktransfer.CreateRecipientGroupActivity;
import com.scb.phone.view.activity.bulktransfer.EditRecipientActivity;
import com.scb.phone.view.activity.bulktransfer.ManageRecipientGroupActivity;
import com.scb.phone.view.activity.bulktransfer.SelectRecipientFromFavouriteActivity;
import com.scb.phone.view.activity.cardmanagement.ActivationSuccessfulActivity;
import com.scb.phone.view.activity.cardmanagement.AmortizationActivity;
import com.scb.phone.view.activity.cardmanagement.AmortizationMerchantsActivity;
import com.scb.phone.view.activity.cardmanagement.CCAboutActivity;
import com.scb.phone.view.activity.cardmanagement.CardActivationActivity;
import com.scb.phone.view.activity.cardmanagement.DeejungInstallmentsConfirmationActivity;
import com.scb.phone.view.activity.cardmanagement.DeejungInstallmentsReviewActivity;
import com.scb.phone.view.activity.cardmanagement.DeejungPlansActivity;
import com.scb.phone.view.activity.cardmanagement.EStatementsSuccessfulActivity;
import com.scb.phone.view.activity.cardmanagement.ExportCardStatementActivity;
import com.scb.phone.view.activity.cardmanagement.SelectPurchasesActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelChooseAddressActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelCommonActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelLandingActivity;
import com.scb.phone.view.activity.cardmanagement.StatementChannelSuccessfulActivity;
import com.scb.phone.view.activity.cardmanagement.TempLimitConfirmationActivity;
import com.scb.phone.view.activity.cardmanagement.TempLimitHomeActivity;
import com.scb.phone.view.activity.cardmanagement.TempLimitReviewActivity;
import com.scb.phone.view.activity.cardmanagement.TermAndConditionStatementChannelActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferInstallmentOtpActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferInstallmentsConfirmationActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferInstallmentsReviewActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferMinFullOtpActivity;
import com.scb.phone.view.activity.ccrredemption.categories.RewardsHomeActivity;
import com.scb.phone.view.activity.ccrredemption.confirm.ConfirmRedemptionActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponCommonActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponDetailActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponRedemptionDetailActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.ECouponSuccessfulActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageAirlineMembershipDetailsActivity;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageConfirmRedemptionActivity;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageQuantitySelectionActivity;
import com.scb.phone.view.activity.ccrredemption.mileage.MileageReviewRedemptionActivity;
import com.scb.phone.view.activity.ccrredemption.product.ProductDetailActivity;
import com.scb.phone.view.activity.ccrredemption.product.ProductListActivity;
import com.scb.phone.view.activity.ccrredemption.product.QuantitySelectionActivity;
import com.scb.phone.view.activity.ccrredemption.review.ReviewRedemptionActivity;
import com.scb.phone.view.activity.ccrredemption.search.RewardSearchActivity;
import com.scb.phone.view.activity.ccrredemption.search.RewardSearchResultActivity;
import com.scb.phone.view.activity.ccsof.CcSofCreditCardOnlyActivity;
import com.scb.phone.view.activity.ccsof.CcSofHybridActivity;
import com.scb.phone.view.activity.ccsof.CcSofReviewActivity;
import com.scb.phone.view.activity.ccsof.CcSofReviewTermsAndConditionsActivity;
import com.scb.phone.view.activity.ccsof.CcSofSuccessActivity;
import com.scb.phone.view.activity.chequemanagement.ChequeAnnouncementActivity;
import com.scb.phone.view.activity.chequemanagement.ChequeReviewActivity;
import com.scb.phone.view.activity.chequemanagement.ChequeSuccessActivity;
import com.scb.phone.view.activity.chequemanagement.ManageChequeActivity;
import com.scb.phone.view.activity.chequemanagement.activatecheque.ActivateChequeLandingActivity;
import com.scb.phone.view.activity.chequemanagement.activatecheque.ActivateChequeReviewActivity;
import com.scb.phone.view.activity.chequemanagement.chequestatus.ChequeStatusActivity;
import com.scb.phone.view.activity.chequemanagement.ordercheque.OrderChequeHelpActivity;
import com.scb.phone.view.activity.chequemanagement.ordercheque.OrderChequeLandingActivity;
import com.scb.phone.view.activity.chequemanagement.ordercheque.OrderChequeReviewActivity;
import com.scb.phone.view.activity.chequemanagement.stopcheque.StopChequeLandingActivity;
import com.scb.phone.view.activity.chequemanagement.stopcheque.StopChequeReviewActivity;
import com.scb.phone.view.activity.chubb.ChubbPaySuccessActivity;
import com.scb.phone.view.activity.chubb.review.ChubbReviewActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountAmountDetailsActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountConfirmationOtpActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountEligibilityActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountReviewActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountSelectionActivity;
import com.scb.phone.view.activity.closeaccount.CloseAccountSuccessActivity;
import com.scb.phone.view.activity.common.ThirdPartySlipActivity;
import com.scb.phone.view.activity.common.ThirdPartyWebActivity;
import com.scb.phone.view.activity.contactus.ContactUsActivity;
import com.scb.phone.view.activity.creditcard.CreditCardBilledDetailActivity;
import com.scb.phone.view.activity.creditcard.CreditCardDetailActivity;
import com.scb.phone.view.activity.customizeyourpages.CustomizeYourPageActivity;
import com.scb.phone.view.activity.debitatm.AddAccountOtpActivity;
import com.scb.phone.view.activity.debitatm.DebitCardDetailActivity;
import com.scb.phone.view.activity.debitatm.DebitLimitOtpActivity;
import com.scb.phone.view.activity.debitatm.DebitWithdrawalLimitActivity;
import com.scb.phone.view.activity.debitcard.DebitCardActivationActivity;
import com.scb.phone.view.activity.debitcard.DebitCardCoachMarkActivity;
import com.scb.phone.view.activity.debitcard.DebitCardConfirmPinActivity;
import com.scb.phone.view.activity.debitcard.DebitCardLandingActivity;
import com.scb.phone.view.activity.debitcard.DebitCardMarketConductActivity;
import com.scb.phone.view.activity.debitcard.DebitCardOtpActivationActivity;
import com.scb.phone.view.activity.debitcard.DebitCardProductCatalogActivity;
import com.scb.phone.view.activity.debitcard.DebitCardRequestInputActivity;
import com.scb.phone.view.activity.debitcard.DebitCardRequestPayOtpActivity;
import com.scb.phone.view.activity.debitcard.DebitCardRequestReviewActivity;
import com.scb.phone.view.activity.debitcard.DebitCardRequestSuccessActivity;
import com.scb.phone.view.activity.debitcard.DebitCardRequestTermsConditionsActivity;
import com.scb.phone.view.activity.debitcard.DebitCardSaleSheetActivity;
import com.scb.phone.view.activity.debitcard.DebitCardSuccessfulActivationActivity;
import com.scb.phone.view.activity.debitcard.reset.DebitCardResetOtpActivity;
import com.scb.phone.view.activity.debitcard.reset.DebitCardResetPinSuccessActivity;
import com.scb.phone.view.activity.debitprepaid.DebitPrepaidMenuActivity;
import com.scb.phone.view.activity.deeplink.BankingAgentTransactionsDeepLinkActivity;
import com.scb.phone.view.activity.deposit.DepositDetailActivity;
import com.scb.phone.view.activity.deposit.DepositOpenAccountActivity;
import com.scb.phone.view.activity.deposit.DepositProductCatalogActivity;
import com.scb.phone.view.activity.deposit.exportstatement.DepositExportStatementActivity;
import com.scb.phone.view.activity.deposit.exportstatement.ExportStatementSuccessfulActivity;
import com.scb.phone.view.activity.device.DeviceSettingsActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitBillerSearchActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitInputActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitOtpActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitReviewActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitSuccessActivity;
import com.scb.phone.view.activity.directdebit.DirectDebitTermsAndConditionsActivity;
import com.scb.phone.view.activity.donations.DonationsFoundationDetailsActivity;
import com.scb.phone.view.activity.donations.DonationsLandingActivity;
import com.scb.phone.view.activity.donations.SharingMomentsPreviewActivity;
import com.scb.phone.view.activity.easycash.CommercialReferralNCBConsentActivity;
import com.scb.phone.view.activity.easycash.EasycashActivity;
import com.scb.phone.view.activity.easycash.EasycashAdditionalDocumentTypeActivity;
import com.scb.phone.view.activity.easycash.EasycashCarInformationActivity;
import com.scb.phone.view.activity.easycash.EasycashCollateralInformationActivity;
import com.scb.phone.view.activity.easycash.EasycashCommonNCBConsentActivity;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.activity.easycash.EasycashInputIncomeActivity;
import com.scb.phone.view.activity.easycash.EasycashIssuerSearchActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.activity.easycash.EasycashLoanTrackActivity;
import com.scb.phone.view.activity.easycash.EasycashNCBConsentActivity;
import com.scb.phone.view.activity.easycash.EasycashOccupationSearchActivity;
import com.scb.phone.view.activity.easycash.EasycashReferralSendProductActivity;
import com.scb.phone.view.activity.easycash.EasycashSubDistrictSearchActivity;
import com.scb.phone.view.activity.easycash.EasycashSuccessActivity;
import com.scb.phone.view.activity.easycash.creditpower.EasycashCreditPowerInformationActivity;
import com.scb.phone.view.activity.easycash.creditpower.EasycashCreditPowerSummaryActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashCommercialLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashCreditCardIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashMCMCIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashMortgageIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashPurposefulLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyCashIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyLoanIntroductionActivity;
import com.scb.phone.view.activity.easycash.introduction.EasycashSpeedyLoanTopupIntroductionActivity;
import com.scb.phone.view.activity.easycash.search.EasycashSequentialSearchActivity;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionInputActivity;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionReviewActivity;
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionSearchActivity;
import com.scb.phone.view.activity.ebillsubscription.RtpEBillSubscriptionDetailActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailInputActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailLandingActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationActivity;
import com.scb.phone.view.activity.emailverification.ManageEmailVerificationSuccessActivity;
import com.scb.phone.view.activity.etb.ETBCheckEligibilityActivity;
import com.scb.phone.view.activity.etb.ETBSaleSheetAccountTypeActivity;
import com.scb.phone.view.activity.etb.ETBSaleSheetProductListActivity;
import com.scb.phone.view.activity.etb.ETBSetDetailNoteActivity;
import com.scb.phone.view.activity.etb.EtbActivity;
import com.scb.phone.view.activity.etb.EtbOtpActivity;
import com.scb.phone.view.activity.etb.EtbSuccessActivity;
import com.scb.phone.view.activity.etb.PdfViewerActivity;
import com.scb.phone.view.activity.fastpay.FastPayInputActivity;
import com.scb.phone.view.activity.fastpay.FastPayOtpActivity;
import com.scb.phone.view.activity.fastpay.FastPaySettingActivity;
import com.scb.phone.view.activity.fastpay.ManageFastPayQrScanActivity;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.activity.findus.SelectProvinceOrDistrictActivity;
import com.scb.phone.view.activity.friends.FriendsLandingActivity;
import com.scb.phone.view.activity.help.HelpActivity;
import com.scb.phone.view.activity.hml.HmlAdditionalDocumentActivity;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlBusinessAddressActivity;
import com.scb.phone.view.activity.hml.HmlBusinessETBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.HmlBusinessEmailAboutActivity;
import com.scb.phone.view.activity.hml.HmlBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.hml.HmlCaptureDocumentActivity;
import com.scb.phone.view.activity.hml.HmlCompanyNameActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlConsumerEmailAboutActivity;
import com.scb.phone.view.activity.hml.HmlDocumentListActivity;
import com.scb.phone.view.activity.hml.HmlDocumentUploadGuidelineActivity;
import com.scb.phone.view.activity.hml.HmlETBAccountSetupActivity;
import com.scb.phone.view.activity.hml.HmlETBBusinessInformationActivity;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanReviewActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlETBManageEmailVerificationActivity;
import com.scb.phone.view.activity.hml.HmlETBOperatingAccountActivity;
import com.scb.phone.view.activity.hml.HmlETBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.HmlETBReviewActivity;
import com.scb.phone.view.activity.hml.HmlETBSuccessActivity;
import com.scb.phone.view.activity.hml.HmlETBSummaryActivity;
import com.scb.phone.view.activity.hml.HmlEtbConfirmationOtpActivity;
import com.scb.phone.view.activity.hml.HmlEtbSubmissionOtpActivity;
import com.scb.phone.view.activity.hml.HmlIssuerInputActivity;
import com.scb.phone.view.activity.hml.HmlIssuerLandingActivity;
import com.scb.phone.view.activity.hml.HmlLaserIdAboutActivity;
import com.scb.phone.view.activity.hml.HmlMonthlyIncomeAboutActivity;
import com.scb.phone.view.activity.hml.HmlOccupationInfoActivity;
import com.scb.phone.view.activity.hml.HmlRepaymentAboutActivity;
import com.scb.phone.view.activity.hml.HmlRepaymentMethodAboutActivity;
import com.scb.phone.view.activity.hml.HmlSelectedOfferReviewActivity;
import com.scb.phone.view.activity.hml.HmlSimulatorAboutActivity;
import com.scb.phone.view.activity.hml.HmlSimulatorTutorialActivity;
import com.scb.phone.view.activity.hml.HmlVerifyEmailActivity;
import com.scb.phone.view.activity.hml.HmlVerifyEmailSuccessfulActivity;
import com.scb.phone.view.activity.hml.HmlWorkAddressActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessIndustrySelectionActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerAccountSetupActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerDocumentSubmissionActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerLoanSetupActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerReviewSubmissionActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessOwnerSubmissionReviewStepTwoActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlBusinessURLInformationActivity;
import com.scb.phone.view.activity.hml.businessowner.HmlETBOperatingBankActivity;
import com.scb.phone.view.activity.hml.submission.HmlCropDocumentActivity;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionActivity;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionTutorialsActivity;
import com.scb.phone.view.activity.insurance.InsurancePortfolioActivity;
import com.scb.phone.view.activity.investment.FundActionsSearchActivity;
import com.scb.phone.view.activity.investment.FundActionsSuccessActivity;
import com.scb.phone.view.activity.investment.InvestmentDetailsActivity;
import com.scb.phone.view.activity.investment.assessment.AssessmentPopupActivity;
import com.scb.phone.view.activity.investment.assessment.QuestionnaireActivity;
import com.scb.phone.view.activity.investment.assessment.RiskAssessmentSuccessActivity;
import com.scb.phone.view.activity.investment.assessment.RiskLevelAssessmentActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverDisclaimerActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverFundFilterActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverFundFilterListActivity;
import com.scb.phone.view.activity.investment.discover.DiscoverSearchActivity;
import com.scb.phone.view.activity.investment.funddetails.InvestmentFundDetailsActivity;
import com.scb.phone.view.activity.investment.fundswitch.FundSwitchLandingActivity;
import com.scb.phone.view.activity.investment.fundswitch.FundSwitchReviewActivity;
import com.scb.phone.view.activity.investment.onboarding.CheckEligibilityActivity;
import com.scb.phone.view.activity.investment.onboarding.FatcaActivity;
import com.scb.phone.view.activity.investment.onboarding.FundAppFormActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingLandingActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOnboardingSuccessActivity;
import com.scb.phone.view.activity.investment.onboarding.FundOtpActivity;
import com.scb.phone.view.activity.investment.purchase.FundPurchaseLandingActivity;
import com.scb.phone.view.activity.investment.purchase.FundPurchaseReviewActivity;
import com.scb.phone.view.activity.investment.redeem.FundRedeemLandingActivity;
import com.scb.phone.view.activity.investment.redeem.FundRedeemReviewActivity;
import com.scb.phone.view.activity.investment.roboadvisor.RoboAdvisorLandingActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountConsentActivity;
import com.scb.phone.view.activity.investment.scbs.AddAccountInfoActivity;
import com.scb.phone.view.activity.investment.scbs.OffshoreCurrencyActivity;
import com.scb.phone.view.activity.investment.scbs.SCBSProductDetailActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsAccountDetailActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsInputActivity;
import com.scb.phone.view.activity.investment.scbs.ScbsLandingActivity;
import com.scb.phone.view.activity.investment.scbs.open.CheckSCBSEligibilityActivity;
import com.scb.phone.view.activity.investment.scbs.open.OnboardingFatcaQuestionsActivity;
import com.scb.phone.view.activity.investment.scbs.open.SCBSFormActivity;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingConsentActivity;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingLaserIdActivity;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingProductCatalogActivity;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingTcActivity;
import com.scb.phone.view.activity.investment.select.SelectInvestmentActivity;
import com.scb.phone.view.activity.juristic.JuristicOnboardingLandingActivity;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import com.scb.phone.view.activity.justforyou.JustForYouLandingActivity;
import com.scb.phone.view.activity.landingpage.GroupBillerActivity;
import com.scb.phone.view.activity.landingpage.GroupFavoriteActivity;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.activity.loan.LoanDetailActivity;
import com.scb.phone.view.activity.loan.LoanInputActivity;
import com.scb.phone.view.activity.loan.LoanPaymentReviewActivity;
import com.scb.phone.view.activity.loan.SmeLoanDetailActivity;
import com.scb.phone.view.activity.mailingaddress.GoodToKnowActivity;
import com.scb.phone.view.activity.mailingaddress.MailingAddressInputActivity;
import com.scb.phone.view.activity.mediaimage.MediaImagePreviewActivity;
import com.scb.phone.view.activity.merchant.MerchantWalletDetailActivity;
import com.scb.phone.view.activity.mwpartner.MwBankAccountActivity;
import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;
import com.scb.phone.view.activity.mwpartner.MwCasaOtpActivity;
import com.scb.phone.view.activity.mwpartner.MwChangeCasaSuccessActivity;
import com.scb.phone.view.activity.mwpartner.MwCoachMarkActivity;
import com.scb.phone.view.activity.mwpartner.MwCreateQrActivity;
import com.scb.phone.view.activity.mwpartner.MwCurrentUserEwalletActivity;
import com.scb.phone.view.activity.mwpartner.MwEditCreateQrActivity;
import com.scb.phone.view.activity.mwpartner.MwLandingActivity;
import com.scb.phone.view.activity.mwpartner.MwManageReceivingAccountActivity;
import com.scb.phone.view.activity.mwpartner.MwManageWalletActivity;
import com.scb.phone.view.activity.mwpartner.MwOnBoardSuccessActivity;
import com.scb.phone.view.activity.mwpartner.MwOnboardInfoActivity;
import com.scb.phone.view.activity.mwpartner.MwPartnerCropPhotoActivity;
import com.scb.phone.view.activity.mwpartner.MwPinShopLocationActivity;
import com.scb.phone.view.activity.mwpartner.MwPinnedSuccessActivity;
import com.scb.phone.view.activity.mwpartner.MwReviewActivity;
import com.scb.phone.view.activity.mwpartner.MwSearchMarketMallActivity;
import com.scb.phone.view.activity.mwpartner.MwShopAddressActivity;
import com.scb.phone.view.activity.mwpartner.MwShopTypeActivity;
import com.scb.phone.view.activity.mwpartner.MwSubDistrictSearchActivity;
import com.scb.phone.view.activity.mwpartner.MwTermsAndConditionsActivity;
import com.scb.phone.view.activity.ndid.IdpLivenessCheckActivity;
import com.scb.phone.view.activity.ndid.IdpShareInformationActivity;
import com.scb.phone.view.activity.ndid.NdidIdpShareSuccessActivity;
import com.scb.phone.view.activity.ndid.NdidIdpVerificationActivity;
import com.scb.phone.view.activity.p038tc.EasyAppTermsAndConditionsActivity;
import com.scb.phone.view.activity.p038tc.MutualFundTermsAndConditionsActivity;
import com.scb.phone.view.activity.partner.PartnerDiscoverWebViewActivity;
import com.scb.phone.view.activity.partner.PartnerLandingActivity;
import com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentOtpActivity;
import com.scb.phone.view.activity.partner.nsip.NsipPartnerPaymentReviewActivity;
import com.scb.phone.view.activity.partner.nsip.NsipPaymentLandingActivity;
import com.scb.phone.view.activity.paynow.PayNowReviewActivity;
import com.scb.phone.view.activity.paynow.PayNowSuccessActivity;
import com.scb.phone.view.activity.personalize.PersonalizeActivity;
import com.scb.phone.view.activity.personalize.ShortcutRouterActivity;
import com.scb.phone.view.activity.personallimit.PersonalLimitActivity;
import com.scb.phone.view.activity.pinchange.PinChangeActivity;
import com.scb.phone.view.activity.pinchange.PinChangeSuccessActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.activity.prelogin.QuickOperationSuccessActivity;
import com.scb.phone.view.activity.prelogin.quickbalance.ModifyQuickBalanceActivity;
import com.scb.phone.view.activity.prelogin.quickbalance.SetupQuickBalanceActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.ModifyQuickPromptPayActivity;
import com.scb.phone.view.activity.prelogin.quickpromptpay.SetupQuickPromptPayActivity;
import com.scb.phone.view.activity.prepaid.AddNewCurrencyActivity;
import com.scb.phone.view.activity.prepaid.PrepaidConfirmPinActivity;
import com.scb.phone.view.activity.prepaid.PrepaidDetailsActivity;
import com.scb.phone.view.activity.prepaid.PrepaidOtpActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelConversionReviewActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelConversionSuccessActivity;
import com.scb.phone.view.activity.prepaid.PrepaidTravelForeignCurrencyWalletDetailActivity;
import com.scb.phone.view.activity.prepaid.activation.PrepaidActivationLandingActivity;
import com.scb.phone.view.activity.prepaid.activation.PrepaidActivationSuccessfulActivity;
import com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutLandingAndInputActivity;
import com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutReviewActivity;
import com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutSuccessActivity;
import com.scb.phone.view.activity.prepaid.detail.PrepaidTravelConversionLandingActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestLandingActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestMarketConductActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestProductCatalogActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestReviewActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestTermConditionsActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetOtpActivity;
import com.scb.phone.view.activity.prepaid.reset.PrepaidResetPinSuccessActivity;
import com.scb.phone.view.activity.privacymanagement.PrivacyManagementLandingActivity;
import com.scb.phone.view.activity.profile_management.manageaccountinbound.ManageAccountInboundActivity;
import com.scb.phone.view.activity.profilemanagement.ProfileManagementActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.AddAccountsActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.ReviewAccountsActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.VerifyIdentityActivity;
import com.scb.phone.view.activity.profilemanagement.accounts.VerifyIdentityTipsActivity;
import com.scb.phone.view.activity.profilemanagement.manageaccounts.AccountManagementActivity;
import com.scb.phone.view.activity.profilemanagement.manageaccounts.AccountManagementSuccessActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.LinkAndUnlinkPromptPayActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.ManagePromptpayLandingActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.ManagePromptpaySuccessActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayOtpActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayTermsAndConditionsActivity;
import com.scb.phone.view.activity.profilemanagement.promptpay.PromptPayTermsAndConditionsLandingActivity;
import com.scb.phone.view.activity.promptpay.PromptPayQRActivity;
import com.scb.phone.view.activity.purchase.PurchaseInputActivity;
import com.scb.phone.view.activity.purchase.PurchaseReviewActivity;
import com.scb.phone.view.activity.registration.RegistrationNoDataActivity;
import com.scb.phone.view.activity.registration.friends.FriendsRegistrationActivity;
import com.scb.phone.view.activity.remittance.RemittanceAddFavouriteInputActivity;
import com.scb.phone.view.activity.remittance.RemittanceAddFavouriteRecipientDetailActivity;
import com.scb.phone.view.activity.remittance.RemittanceAddressSearchActivity;
import com.scb.phone.view.activity.remittance.RemittanceFaqActivity;
import com.scb.phone.view.activity.remittance.RemittanceInputActivity;
import com.scb.phone.view.activity.remittance.RemittanceLandingActivity;
import com.scb.phone.view.activity.remittance.RemittanceRecipientDetailActivity;
import com.scb.phone.view.activity.remittance.RemittanceReviewActivity;
import com.scb.phone.view.activity.remittance.RemittanceSenderAddressActivity;
import com.scb.phone.view.activity.remittance.RemittanceSenderAddressReviewActivity;
import com.scb.phone.view.activity.remittance.RemittanceSuccessActivity;
import com.scb.phone.view.activity.requesttopay.EnterProxyActivity;
import com.scb.phone.view.activity.requesttopay.GoManagePromptPayActivity;
import com.scb.phone.view.activity.requesttopay.InputDetailsActivity;
import com.scb.phone.view.activity.requesttopay.PayerReviewActivity;
import com.scb.phone.view.activity.requesttopay.RequestToPayActivity;
import com.scb.phone.view.activity.requesttopay.RequestToPayInfoActivity;
import com.scb.phone.view.activity.requesttopay.RequesterReviewActivity;
import com.scb.phone.view.activity.requesttopay.SummaryDetailActivity;
import com.scb.phone.view.activity.scheduledtransaction.CalendarDialogActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleBulkTransferActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleTransactionActivity;
import com.scb.phone.view.activity.sme.deals.DealsBuyReviewActivity;
import com.scb.phone.view.activity.sme.deals.DealsSuccessActivity;
import com.scb.phone.view.activity.sme.gifting.GiftOpenSharingMomentActivity;
import com.scb.phone.view.activity.sme.gifting.GiftPreviewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftRecipientActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingAboutActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingMoneyReviewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingOpenedActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingPresentReviewActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingSelectRecipientActivity;
import com.scb.phone.view.activity.sme.gifting.GiftingTransferLandingActivity;
import com.scb.phone.view.activity.theme.ThemesActivity;
import com.scb.phone.view.activity.transferandpay.CardPaySelectedActivity;
import com.scb.phone.view.activity.transferandpay.CardlessATMActivity;
import com.scb.phone.view.activity.transferandpay.CardlessATMTermsConditionsActivity;
import com.scb.phone.view.activity.transferandpay.EDonationConsentActivity;
import com.scb.phone.view.activity.transferandpay.EditFavouriteActivity;
import com.scb.phone.view.activity.transferandpay.FavouriteSelectedActivity;
import com.scb.phone.view.activity.transferandpay.FixedTransferSuccessActivity;
import com.scb.phone.view.activity.transferandpay.NewTransactionActivity;
import com.scb.phone.view.activity.transferandpay.PullSlipActivity;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.activity.transferandpay.SuccessActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentReviewActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSearchCoachMarkActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentSuccessActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.RtpEBillPaymentDetailActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.RtpEBillPaymentReviewActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMReviewActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMSuccessfulRequestActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMTutorialActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessAtmInfoActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpReviewActivity;
import com.scb.phone.view.activity.transferandpay.transfer.AddFavoriteTransferActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferGiftingInputActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferReviewActivity;
import com.scb.phone.view.adapter.chubb.PaymentInfoAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.easycash.EasycashScreenShotFragment;
import com.scb.phone.view.fragment.registration.RegistrationFacialRecognitionLandingActivity;
import com.scb.phone.view.fragment.registration.RegistrationFacialVerificationLockedActivity;
import com.thunderhead.android.api.responsetypes.OneSDKError;
import com.thunderhead.android.aspects.WebViewAsp;
import com.thunderhead.android.infrastructure.server.entitys.Captures;
import com.thunderhead.android.infrastructure.server.entitys.DeviceInfo;
import com.thunderhead.android.infrastructure.server.entitys.OptimizationActions;
import com.thunderhead.android.infrastructure.server.entitys.Optimizations;
import com.thunderhead.android.infrastructure.server.entitys.Trackers;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.TypeCastException;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.MainDispatcherFactory;
import net.p088sf.scuba.smartcards.ISO7816;
import net.p088sf.scuba.smartcards.ISOFileInfo;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;
import org.bouncycastle.asn1.ASN1EncodableVector;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Integer;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.asn1.DEROutputStream;
import org.bouncycastle.asn1.DERSequence;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.i18n.LocalizedMessage;
import org.ejbca.cvc.CVCAuthorizationTemplate;
import org.ejbca.cvc.CVCertificate;
import org.ejbca.cvc.exception.ConstructionException;
import org.ejbca.cvc.exception.ParseException;
import org.json.JSONObject;
import org.threeten.p041bp.OffsetDateTime;
import org.threeten.p041bp.format.DateTimeParseException;
import org.xmlpull.p042v1.XmlPullParser;
import p039io.beid.beidk.definitions.LivenessStatus;
import p039io.github.inflationx.calligraphy3.CalligraphyUtils;
import p039io.reactivex.exceptions.CompositeException;
import p039io.reactivex.exceptions.MissingBackpressureException;
import p039io.reactivex.exceptions.OnErrorNotImplementedException;
import p039io.reactivex.exceptions.UndeliverableException;
import p040o.CheckParameters;
import p040o.CrashlyticsReport;
import p040o.EasycashHeaderAdapter$LoanHeaderViewHolder;
import p040o.ExtendedAccountSelectorAdapter$ExtendedItemViewHolder;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment;
import p040o.HmlPromptPayVerificationActivity;
import p040o.HmlVerifyIdentifyActivity;
import p040o.MwCreateQrActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlacePicker;
import p040o.Utils;
import p040o.nAllocationSetSurface;
import p040o.onDestroyView;
import p040o.setBackgroundDrawable;
import p040o.setExpandActivityOverflowButtonContentDescription;
import p040o.setImageResource;
import p040o.setSupportImageTintList;
import p040o.setTvRemark;
import p040o.setupDialog;
import p040o.verifyReferral;
import p040o.wrapCollection;
import p040o.zzge;
import p043rx.exceptions.OnCompletedFailedException;
import p043rx.exceptions.OnErrorFailedException;

@Deprecated
/* renamed from: o.AlertController$RecycleListView */
public final class AlertController$RecycleListView {
    private static Method AlertController$RecycleListView = null;
    public static boolean IconCompatParcelizer = false;
    private static boolean Keep = false;
    public static boolean MediaBrowserCompat$CustomActionResultReceiver = false;
    public static Field MediaBrowserCompat$ItemReceiver = null;
    public static final String MediaBrowserCompat$MediaItem = "Sitekey: %s\nReleaseId: %s\nTID: %s\nBaseRequest: %s";

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private static Field f2529x50fd9e4a = null;
    public static final String MediaMetadataCompat = "Success: %s\nHTTP Code: %s\nBody: %s";
    private static boolean MediaSessionCompat$QueueItem = false;
    private static Class MediaSessionCompat$ResultReceiverWrapper = null;
    private static boolean MediaSessionCompat$Token = false;
    private static volatile boolean ParcelableVolumeInfo = true;
    public static AlertController$RecycleListView read;
    public static Field write;
    public long MediaBrowserCompat$SearchResultReceiver;
    public long MediaDescriptionCompat;
    public int RatingCompat;

    /* renamed from: o.AlertController$RecycleListView$write */
    public static final class write implements Cloneable, Serializable {
        public static final int abc_ab_share_pack_mtrl_alpha = 2131230728;
        public static final int abc_action_bar_item_background_material = 2131230729;
        public static final int abc_btn_borderless_material = 2131230730;
        public static final int abc_btn_check_material = 2131230731;
        public static final int abc_btn_check_to_on_mtrl_000 = 2131230732;
        public static final int abc_btn_check_to_on_mtrl_015 = 2131230733;
        public static final int abc_btn_colored_material = 2131230734;
        public static final int abc_btn_default_mtrl_shape = 2131230735;
        public static final int abc_btn_radio_material = 2131230736;
        public static final int abc_btn_radio_to_on_mtrl_000 = 2131230737;
        public static final int abc_btn_radio_to_on_mtrl_015 = 2131230738;
        public static final int abc_btn_switch_to_on_mtrl_00001 = 2131230739;
        public static final int abc_btn_switch_to_on_mtrl_00012 = 2131230740;
        public static final int abc_cab_background_internal_bg = 2131230741;
        public static final int abc_cab_background_top_material = 2131230742;
        public static final int abc_cab_background_top_mtrl_alpha = 2131230743;
        public static final int abc_control_background_material = 2131230744;
        public static final int abc_dialog_material_background = 2131230745;
        public static final int abc_edit_text_material = 2131230746;
        public static final int abc_ic_ab_back_material = 2131230747;
        public static final int abc_ic_arrow_drop_right_black_24dp = 2131230748;
        public static final int abc_ic_clear_material = 2131230749;
        public static final int abc_ic_commit_search_api_mtrl_alpha = 2131230750;
        public static final int abc_ic_go_search_api_material = 2131230751;
        public static final int abc_ic_menu_copy_mtrl_am_alpha = 2131230752;
        public static final int abc_ic_menu_cut_mtrl_alpha = 2131230753;
        public static final int abc_ic_menu_overflow_material = 2131230754;
        public static final int abc_ic_menu_paste_mtrl_am_alpha = 2131230755;
        public static final int abc_ic_menu_selectall_mtrl_alpha = 2131230756;
        public static final int abc_ic_menu_share_mtrl_alpha = 2131230757;
        public static final int abc_ic_search_api_material = 2131230758;
        public static final int abc_ic_star_black_16dp = 2131230759;
        public static final int abc_ic_star_black_36dp = 2131230760;
        public static final int abc_ic_star_black_48dp = 2131230761;
        public static final int abc_ic_star_half_black_16dp = 2131230762;
        public static final int abc_ic_star_half_black_36dp = 2131230763;
        public static final int abc_ic_star_half_black_48dp = 2131230764;
        public static final int abc_ic_voice_search_api_material = 2131230765;
        public static final int abc_item_background_holo_dark = 2131230766;
        public static final int abc_item_background_holo_light = 2131230767;
        public static final int abc_list_divider_material = 2131230768;
        public static final int abc_list_divider_mtrl_alpha = 2131230769;
        public static final int abc_list_focused_holo = 2131230770;
        public static final int abc_list_longpressed_holo = 2131230771;
        public static final int abc_list_pressed_holo_dark = 2131230772;
        public static final int abc_list_pressed_holo_light = 2131230773;
        public static final int abc_list_selector_background_transition_holo_dark = 2131230774;
        public static final int abc_list_selector_background_transition_holo_light = 2131230775;
        public static final int abc_list_selector_disabled_holo_dark = 2131230776;
        public static final int abc_list_selector_disabled_holo_light = 2131230777;
        public static final int abc_list_selector_holo_dark = 2131230778;
        public static final int abc_list_selector_holo_light = 2131230779;
        public static final int abc_menu_hardkey_panel_mtrl_mult = 2131230780;
        public static final int abc_popup_background_mtrl_mult = 2131230781;
        public static final int abc_ratingbar_indicator_material = 2131230782;
        public static final int abc_ratingbar_material = 2131230783;
        public static final int abc_ratingbar_small_material = 2131230784;
        public static final int abc_scrubber_control_off_mtrl_alpha = 2131230785;
        public static final int abc_scrubber_control_to_pressed_mtrl_000 = 2131230786;
        public static final int abc_scrubber_control_to_pressed_mtrl_005 = 2131230787;
        public static final int abc_scrubber_primary_mtrl_alpha = 2131230788;
        public static final int abc_scrubber_track_mtrl_alpha = 2131230789;
        public static final int abc_seekbar_thumb_material = 2131230790;
        public static final int abc_seekbar_tick_mark_material = 2131230791;
        public static final int abc_seekbar_track_material = 2131230792;
        public static final int abc_spinner_mtrl_am_alpha = 2131230793;
        public static final int abc_spinner_textfield_background_material = 2131230794;
        public static final int abc_switch_thumb_material = 2131230795;
        public static final int abc_switch_track_mtrl_alpha = 2131230796;
        public static final int abc_tab_indicator_material = 2131230797;
        public static final int abc_tab_indicator_mtrl_alpha = 2131230798;
        public static final int abc_text_cursor_material = 2131230799;
        public static final int abc_text_select_handle_left_mtrl_dark = 2131230800;
        public static final int abc_text_select_handle_left_mtrl_light = 2131230801;
        public static final int abc_text_select_handle_middle_mtrl_dark = 2131230802;
        public static final int abc_text_select_handle_middle_mtrl_light = 2131230803;
        public static final int abc_text_select_handle_right_mtrl_dark = 2131230804;
        public static final int abc_text_select_handle_right_mtrl_light = 2131230805;
        public static final int abc_textfield_activated_mtrl_alpha = 2131230806;
        public static final int abc_textfield_default_mtrl_alpha = 2131230807;
        public static final int abc_textfield_search_activated_mtrl_alpha = 2131230808;
        public static final int abc_textfield_search_default_mtrl_alpha = 2131230809;
        public static final int abc_textfield_search_material = 2131230810;
        public static final int abc_vector_test = 2131230811;
        public static final int notification_action_background = 2131231489;
        public static final int notification_bg = 2131231490;
        public static final int notification_bg_low = 2131231491;
        public static final int notification_bg_low_normal = 2131231492;
        public static final int notification_bg_low_pressed = 2131231493;
        public static final int notification_bg_normal = 2131231494;
        public static final int notification_bg_normal_pressed = 2131231495;
        public static final int notification_icon_background = 2131231496;
        public static final int notification_template_icon_bg = 2131231497;
        public static final int notification_template_icon_low_bg = 2131231498;
        public static final int notification_tile_bg = 2131231499;
        public static final int notify_panel_notification_icon_bg = 2131231501;
        public static final int tooltip_frame_dark = 2131231717;
        public static final int tooltip_frame_light = 2131231718;
        public PorterDuff.Mode IconCompatParcelizer;
        public ColorStateList MediaBrowserCompat$ItemReceiver;
        public boolean read;
        public boolean write;
    }

    public static boolean IconCompatParcelizer(int i) {
        int i2 = 3;
        while (i2 >= 0 && ((255 << (i2 << 3)) & i) == 0) {
            i2--;
        }
        int i3 = i2 << 3;
        return ((((i & (255 << i3)) >> i3) & 255) & 32) == 0;
    }

    private static boolean MediaBrowserCompat$CustomActionResultReceiver(char c) {
        return (c == 13 || c == '*' || c == '>') || c == ' ' || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z');
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
        return i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && i <= 512 && i2 <= 384;
    }

    private static int RatingCompat(int i) {
        int i2 = 3;
        while (i2 >= 0 && ((255 << (i2 << 3)) & i) == 0) {
            i2--;
        }
        int i3 = i2 << 3;
        int i4 = ((i & (255 << i3)) >> i3) & 255 & 192;
        if (i4 == 0) {
            return 0;
        }
        if (i4 != 64) {
            return i4 != 128 ? 3 : 2;
        }
        return 1;
    }

    /* renamed from: o.AlertController$RecycleListView$MediaMetadataCompat */
    public static final class MediaMetadataCompat {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
        public static final int abc_action_bar_title_item = 2131492864;
        public static final int abc_action_bar_up_container = 2131492865;
        public static final int abc_action_menu_item_layout = 2131492866;
        public static final int abc_action_menu_layout = 2131492867;
        public static final int abc_action_mode_bar = 2131492868;
        public static final int abc_action_mode_close_item_material = 2131492869;
        public static final int abc_activity_chooser_view = 2131492870;
        public static final int abc_activity_chooser_view_list_item = 2131492871;
        public static final int abc_alert_dialog_button_bar_material = 2131492872;
        public static final int abc_alert_dialog_material = 2131492873;
        public static final int abc_alert_dialog_title_material = 2131492874;
        public static final int abc_cascading_menu_item_layout = 2131492875;
        public static final int abc_dialog_title_material = 2131492876;
        public static final int abc_expanded_menu_layout = 2131492877;
        public static final int abc_list_menu_item_checkbox = 2131492878;
        public static final int abc_list_menu_item_icon = 2131492879;
        public static final int abc_list_menu_item_layout = 2131492880;
        public static final int abc_list_menu_item_radio = 2131492881;
        public static final int abc_popup_menu_header_item_layout = 2131492882;
        public static final int abc_popup_menu_item_layout = 2131492883;
        public static final int abc_screen_content_include = 2131492884;
        public static final int abc_screen_simple = 2131492885;
        public static final int abc_screen_simple_overlay_action_mode = 2131492886;
        public static final int abc_screen_toolbar = 2131492887;
        public static final int abc_search_dropdown_item_icons_2line = 2131492888;
        public static final int abc_search_view = 2131492889;
        public static final int abc_select_dialog_material = 2131492890;
        public static final int abc_tooltip = 2131492891;
        public static final int notification_action = 2131494435;
        public static final int notification_action_tombstone = 2131494436;
        public static final int notification_template_custom_big = 2131494443;
        public static final int notification_template_icon_group = 2131494444;
        public static final int notification_template_part_chronometer = 2131494448;
        public static final int notification_template_part_time = 2131494449;
        public static final int select_dialog_item_material = 2131494469;
        public static final int select_dialog_multichoice_material = 2131494470;
        public static final int select_dialog_singlechoice_material = 2131494471;
        public static final int support_simple_spinner_dropdown_item = 2131494475;
        public final int[] IconCompatParcelizer;
        public final Context MediaBrowserCompat$CustomActionResultReceiver;
        public final View MediaBrowserCompat$ItemReceiver;
        public final Rect MediaBrowserCompat$MediaItem;
        public final int[] MediaDescriptionCompat;
        public final TextView read;
        public final WindowManager.LayoutParams write;

        public MediaMetadataCompat(Context context) {
            this.write = new WindowManager.LayoutParams();
            this.MediaBrowserCompat$MediaItem = new Rect();
            this.IconCompatParcelizer = new int[2];
            this.MediaDescriptionCompat = new int[2];
            this.MediaBrowserCompat$CustomActionResultReceiver = context;
            View inflate = LayoutInflater.from(context).inflate(abc_tooltip, (ViewGroup) null);
            this.MediaBrowserCompat$ItemReceiver = inflate;
            this.read = (TextView) inflate.findViewById(MediaDescriptionCompat.message);
            this.write.setTitle(getClass().getSimpleName());
            this.write.packageName = this.MediaBrowserCompat$CustomActionResultReceiver.getPackageName();
            this.write.type = 1002;
            this.write.width = -2;
            this.write.height = -2;
            this.write.format = -3;
            this.write.windowAnimations = C1134xe5b94a38.Animation_AppCompat_Tooltip;
            this.write.flags = 24;
        }

        public final void MediaBrowserCompat$ItemReceiver() {
            if (this.MediaBrowserCompat$ItemReceiver.getParent() != null) {
                ((WindowManager) this.MediaBrowserCompat$CustomActionResultReceiver.getSystemService("window")).removeView(this.MediaBrowserCompat$ItemReceiver);
            }
        }

        public MediaMetadataCompat() {
        }

        public static getSubElementOffsetBytes IconCompatParcelizer(InputStream inputStream) {
            getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
            getViewLifecycleOwnerLiveData.read(new copyFromUnchecked(inputStream), getsubelementoffsetbytes);
            return getsubelementoffsetbytes;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(28:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(29:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Can't wrap try/catch for region: R(30:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|21|22|23|25|26|27|28|29|30|31|32|34) */
        /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0033 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0085 */
        static {
            /*
                o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
                r1 = 1
                o.BillerAdapter$ItemViewHolder_ViewBinding r2 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BillerAdapter$ItemViewHolder_ViewBinding r3 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MINUTES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r6 = 5
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HOURS     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6 = 6
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.HALF_DAYS     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r6 = 7
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.DAYS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r6 = 8
                r4[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r4 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r4 = r4.length
                int[] r4 = new int[r4]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r4
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r5 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x007b }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r4 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MICRO_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x007b }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r4] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0085 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MILLI_OF_SECOND     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x008f }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.INSTANT_SECONDS     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaMetadataCompat.<clinit>():void");
        }
    }

    /* renamed from: o.AlertController$RecycleListView$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
        public static final int action_bar = 2131296304;
        public static final int action_bar_activity_content = 2131296305;
        public static final int action_bar_container = 2131296306;
        public static final int action_bar_root = 2131296307;
        public static final int action_bar_spinner = 2131296308;
        public static final int action_bar_subtitle = 2131296309;
        public static final int action_bar_title = 2131296310;
        public static final int action_container = 2131296313;
        public static final int action_context_bar = 2131296314;
        public static final int action_divider = 2131296315;
        public static final int action_image = 2131296316;
        public static final int action_menu_divider = 2131296317;
        public static final int action_menu_presenter = 2131296318;
        public static final int action_mode_bar = 2131296319;
        public static final int action_mode_bar_stub = 2131296320;
        public static final int action_mode_close_button = 2131296321;
        public static final int action_text = 2131296326;
        public static final int actions = 2131296327;
        public static final int activity_chooser_view_content = 2131296332;
        public static final int add = 2131296335;
        public static final int alertTitle = 2131296375;
        public static final int async = 2131296431;
        public static final int blocking = 2131296572;
        public static final int bottom = 2131296590;
        public static final int buttonPanel = 2131296807;
        public static final int checkbox = 2131297017;
        public static final int chronometer = 2131297036;
        public static final int content = 2131297129;
        public static final int contentPanel = 2131297130;
        public static final int custom = 2131297227;
        public static final int customPanel = 2131297228;
        public static final int decor_content_parent = 2131297356;
        public static final int default_activity_button = 2131297372;
        public static final int edit_query = 2131297589;
        public static final int end = 2131297635;
        public static final int expand_activities_button = 2131297713;
        public static final int expanded_menu = 2131297717;
        public static final int forever = 2131297802;
        public static final int group_divider = 2131298047;
        public static final int home = 2131298105;
        public static final int icon = 2131298138;
        public static final int icon_group = 2131298145;
        public static final int image = 2131298163;
        public static final int info = 2131298278;
        public static final int italic = 2131298360;
        public static final int left = 2131298906;
        public static final int line1 = 2131298936;
        public static final int line3 = 2131298937;
        public static final int listMode = 2131298971;
        public static final int list_item = 2131298972;
        public static final int message = 2131299248;
        public static final int multiply = 2131299319;
        public static final int none = 2131299386;
        public static final int normal = 2131299387;
        public static final int notification_background = 2131299393;
        public static final int notification_main_column = 2131299394;
        public static final int notification_main_column_container = 2131299395;
        public static final int parentPanel = 2131299493;
        public static final int progress_circular = 2131299616;
        public static final int progress_horizontal = 2131299617;
        public static final int radio = 2131299671;
        public static final int right = 2131299897;
        public static final int right_icon = 2131299901;
        public static final int right_side = 2131299902;
        public static final int screen = 2131300061;
        public static final int scrollIndicatorDown = 2131300064;
        public static final int scrollIndicatorUp = 2131300065;
        public static final int scrollView = 2131300066;
        public static final int search_badge = 2131300071;
        public static final int search_bar = 2131300072;
        public static final int search_button = 2131300074;
        public static final int search_close_btn = 2131300075;
        public static final int search_edit_frame = 2131300078;
        public static final int search_go_btn = 2131300081;
        public static final int search_mag_icon = 2131300084;
        public static final int search_plate = 2131300085;
        public static final int search_src_text = 2131300086;
        public static final int search_voice_btn = 2131300087;
        public static final int select_dialog_listview = 2131300112;
        public static final int shortcut = 2131300174;
        public static final int spacer = 2131300247;
        public static final int split_action_bar = 2131300259;
        public static final int src_atop = 2131300273;
        public static final int src_in = 2131300274;
        public static final int src_over = 2131300275;
        public static final int start = 2131300277;
        public static final int submenuarrow = 2131300304;
        public static final int submit_area = 2131300306;
        public static final int tabMode = 2131300347;
        public static final int tag_transition_group = 2131300355;
        public static final int tag_unhandled_key_event_manager = 2131300356;
        public static final int tag_unhandled_key_listeners = 2131300357;
        public static final int text = 2131300379;
        public static final int text2 = 2131300381;
        public static final int textSpacerNoButtons = 2131300383;
        public static final int textSpacerNoTitle = 2131300384;
        public static final int time = 2131300688;
        public static final int title = 2131300689;
        public static final int titleDividerNoCustom = 2131300690;
        public static final int title_template = 2131300703;
        public static final int top = 2131300717;
        public static final int topPanel = 2131300719;
        public static final int uniform = 2131302087;

        /* renamed from: up */
        public static final int f2530up = 2131302096;
        public static final int wrap_content = 2131302363;
        public TypedValue IconCompatParcelizer;
        public final TypedArray MediaBrowserCompat$ItemReceiver;
        public final Context read;

        public MediaDescriptionCompat(Context context, TypedArray typedArray) {
            this.read = context;
            this.MediaBrowserCompat$ItemReceiver = typedArray;
        }

        public final ColorStateList MediaBrowserCompat$CustomActionResultReceiver(int i) {
            int resourceId;
            ColorStateList MediaBrowserCompat$CustomActionResultReceiver;
            if (!this.MediaBrowserCompat$ItemReceiver.hasValue(i) || (resourceId = this.MediaBrowserCompat$ItemReceiver.getResourceId(i, 0)) == 0 || (MediaBrowserCompat$CustomActionResultReceiver = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(this.read, resourceId)) == null) {
                return this.MediaBrowserCompat$ItemReceiver.getColorStateList(i);
            }
            return MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final Drawable MediaBrowserCompat$ItemReceiver(int i) {
            int resourceId;
            if (!this.MediaBrowserCompat$ItemReceiver.hasValue(i) || (resourceId = this.MediaBrowserCompat$ItemReceiver.getResourceId(i, 0)) == 0) {
                return this.MediaBrowserCompat$ItemReceiver.getDrawable(i);
            }
            return AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(this.read, resourceId);
        }

        public final Drawable IconCompatParcelizer(int i) {
            int resourceId;
            if (!this.MediaBrowserCompat$ItemReceiver.hasValue(i) || (resourceId = this.MediaBrowserCompat$ItemReceiver.getResourceId(i, 0)) == 0) {
                return null;
            }
            return ActionBarOverlayLayout.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver(this.read, resourceId, true);
        }

        public MediaDescriptionCompat() {
        }

        @SafeVarargs
        public static <E> E[] MediaBrowserCompat$CustomActionResultReceiver(int i, E... eArr) {
            try {
                return Arrays.copyOf(eArr, i);
            } catch (NoSuchMethodError unused) {
                E[] eArr2 = (Object[]) Array.newInstance(eArr.getClass().getComponentType(), i);
                System.arraycopy(eArr, 0, eArr2, 0, Math.min(i, 0));
                return eArr2;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
                o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.NANOS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MICROS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLIS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r1 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.SECONDS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaDescriptionCompat.<clinit>():void");
        }
    }

    /* renamed from: o.AlertController$RecycleListView$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private static final FragmentBuilder_BindPdfViewerFragment MediaBrowserCompat$MediaItem = new FragmentBuilder_BindPdfViewerFragment("PhoneskyVerificationUtils");
        public static final int abc_action_bar_content_inset_material = 2131165184;
        public static final int abc_action_bar_content_inset_with_nav = 2131165185;
        public static final int abc_action_bar_default_height_material = 2131165186;
        public static final int abc_action_bar_default_padding_end_material = 2131165187;
        public static final int abc_action_bar_default_padding_start_material = 2131165188;
        public static final int abc_action_bar_elevation_material = 2131165189;
        public static final int abc_action_bar_icon_vertical_padding_material = 2131165190;
        public static final int abc_action_bar_overflow_padding_end_material = 2131165191;
        public static final int abc_action_bar_overflow_padding_start_material = 2131165192;
        public static final int abc_action_bar_stacked_max_height = 2131165193;
        public static final int abc_action_bar_stacked_tab_max_width = 2131165194;
        public static final int abc_action_bar_subtitle_bottom_margin_material = 2131165195;
        public static final int abc_action_bar_subtitle_top_margin_material = 2131165196;
        public static final int abc_action_button_min_height_material = 2131165197;
        public static final int abc_action_button_min_width_material = 2131165198;
        public static final int abc_action_button_min_width_overflow_material = 2131165199;
        public static final int abc_alert_dialog_button_bar_height = 2131165200;
        public static final int abc_alert_dialog_button_dimen = 2131165201;
        public static final int abc_button_inset_horizontal_material = 2131165202;
        public static final int abc_button_inset_vertical_material = 2131165203;
        public static final int abc_button_padding_horizontal_material = 2131165204;
        public static final int abc_button_padding_vertical_material = 2131165205;
        public static final int abc_cascading_menus_min_smallest_width = 2131165206;
        public static final int abc_config_prefDialogWidth = 2131165207;
        public static final int abc_control_corner_material = 2131165208;
        public static final int abc_control_inset_material = 2131165209;
        public static final int abc_control_padding_material = 2131165210;
        public static final int abc_dialog_corner_radius_material = 2131165211;
        public static final int abc_dialog_fixed_height_major = 2131165212;
        public static final int abc_dialog_fixed_height_minor = 2131165213;
        public static final int abc_dialog_fixed_width_major = 2131165214;
        public static final int abc_dialog_fixed_width_minor = 2131165215;
        public static final int abc_dialog_list_padding_bottom_no_buttons = 2131165216;
        public static final int abc_dialog_list_padding_top_no_title = 2131165217;
        public static final int abc_dialog_min_width_major = 2131165218;
        public static final int abc_dialog_min_width_minor = 2131165219;
        public static final int abc_dialog_padding_material = 2131165220;
        public static final int abc_dialog_padding_top_material = 2131165221;
        public static final int abc_dialog_title_divider_material = 2131165222;
        public static final int abc_disabled_alpha_material_dark = 2131165223;
        public static final int abc_disabled_alpha_material_light = 2131165224;
        public static final int abc_dropdownitem_icon_width = 2131165225;
        public static final int abc_dropdownitem_text_padding_left = 2131165226;
        public static final int abc_dropdownitem_text_padding_right = 2131165227;
        public static final int abc_edit_text_inset_bottom_material = 2131165228;
        public static final int abc_edit_text_inset_horizontal_material = 2131165229;
        public static final int abc_edit_text_inset_top_material = 2131165230;
        public static final int abc_floating_window_z = 2131165231;
        public static final int abc_list_item_padding_horizontal_material = 2131165232;
        public static final int abc_panel_menu_list_width = 2131165233;
        public static final int abc_progress_bar_height_material = 2131165234;
        public static final int abc_search_view_preferred_height = 2131165235;
        public static final int abc_search_view_preferred_width = 2131165236;
        public static final int abc_seekbar_track_background_height_material = 2131165237;
        public static final int abc_seekbar_track_progress_height_material = 2131165238;
        public static final int abc_select_dialog_padding_start_material = 2131165239;
        public static final int abc_switch_padding = 2131165240;
        public static final int abc_text_size_body_1_material = 2131165241;
        public static final int abc_text_size_body_2_material = 2131165242;
        public static final int abc_text_size_button_material = 2131165243;
        public static final int abc_text_size_caption_material = 2131165244;
        public static final int abc_text_size_display_1_material = 2131165245;
        public static final int abc_text_size_display_2_material = 2131165246;
        public static final int abc_text_size_display_3_material = 2131165247;
        public static final int abc_text_size_display_4_material = 2131165248;
        public static final int abc_text_size_headline_material = 2131165249;
        public static final int abc_text_size_large_material = 2131165250;
        public static final int abc_text_size_medium_material = 2131165251;
        public static final int abc_text_size_menu_header_material = 2131165252;
        public static final int abc_text_size_menu_material = 2131165253;
        public static final int abc_text_size_small_material = 2131165254;
        public static final int abc_text_size_subhead_material = 2131165255;
        public static final int abc_text_size_subtitle_material_toolbar = 2131165256;
        public static final int abc_text_size_title_material = 2131165257;
        public static final int abc_text_size_title_material_toolbar = 2131165258;
        public static final int compat_button_inset_horizontal_material = 2131165317;
        public static final int compat_button_inset_vertical_material = 2131165318;
        public static final int compat_button_padding_horizontal_material = 2131165319;
        public static final int compat_button_padding_vertical_material = 2131165320;
        public static final int compat_control_corner_material = 2131165321;
        public static final int compat_notification_large_icon_max_height = 2131165322;
        public static final int compat_notification_large_icon_max_width = 2131165323;
        public static final int disabled_alpha_material_dark = 2131165527;
        public static final int disabled_alpha_material_light = 2131165528;
        public static final int highlight_alpha_material_colored = 2131165566;
        public static final int highlight_alpha_material_dark = 2131165567;
        public static final int highlight_alpha_material_light = 2131165568;
        public static final int hint_alpha_material_dark = 2131165569;
        public static final int hint_alpha_material_light = 2131165570;
        public static final int hint_pressed_alpha_material_dark = 2131165571;
        public static final int hint_pressed_alpha_material_light = 2131165572;
        public static final int notification_action_icon_size = 2131165789;
        public static final int notification_action_text_size = 2131165790;
        public static final int notification_big_circle_margin = 2131165791;
        public static final int notification_content_margin_start = 2131165792;
        public static final int notification_large_icon_height = 2131165793;
        public static final int notification_large_icon_width = 2131165794;
        public static final int notification_main_column_padding_top = 2131165795;
        public static final int notification_media_narrow_margin = 2131165796;
        public static final int notification_right_icon_size = 2131165797;
        public static final int notification_right_side_padding_top = 2131165798;
        public static final int notification_small_icon_background_padding = 2131165799;
        public static final int notification_small_icon_size_as_large = 2131165800;
        public static final int notification_subtext_size = 2131165801;
        public static final int notification_top_pad = 2131165802;
        public static final int notification_top_pad_large_text = 2131165803;
        public static final int tooltip_corner_radius = 2131166004;
        public static final int tooltip_horizontal_padding = 2131166005;
        public static final int tooltip_margin = 2131166006;
        public static final int tooltip_precise_anchor_extra_offset = 2131166007;
        public static final int tooltip_precise_anchor_threshold = 2131166008;
        public static final int tooltip_vertical_padding = 2131166009;
        public static final int tooltip_y_offset_non_touch = 2131166010;
        public static final int tooltip_y_offset_touch = 2131166011;
        public int IconCompatParcelizer = PKIFailureInfo.systemUnavail;
        public int MediaBrowserCompat$CustomActionResultReceiver = 0;
        public int MediaBrowserCompat$ItemReceiver = 0;
        public int MediaBrowserCompat$SearchResultReceiver = PKIFailureInfo.systemUnavail;
        public int MediaMetadataCompat = 0;
        public int RatingCompat = 0;
        public boolean read = false;
        public boolean write = false;

        public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2) {
            this.read = false;
            if (i != Integer.MIN_VALUE) {
                this.MediaBrowserCompat$CustomActionResultReceiver = i;
                this.RatingCompat = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.MediaBrowserCompat$ItemReceiver = i2;
                this.MediaMetadataCompat = i2;
            }
        }

        public final void read(int i, int i2) {
            this.MediaBrowserCompat$SearchResultReceiver = i;
            this.IconCompatParcelizer = i2;
            this.read = true;
            if (this.write) {
                if (i2 != Integer.MIN_VALUE) {
                    this.RatingCompat = i2;
                }
                if (i != Integer.MIN_VALUE) {
                    this.MediaMetadataCompat = i;
                    return;
                }
                return;
            }
            if (i != Integer.MIN_VALUE) {
                this.RatingCompat = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.MediaMetadataCompat = i2;
            }
        }

        public static boolean MediaBrowserCompat$ItemReceiver(Context context) {
            try {
                Signature[] signatureArr = context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures;
                if (signatureArr == null || signatureArr.length == 0) {
                    FragmentBuilder_BindPdfViewerFragment fragmentBuilder_BindPdfViewerFragment = MediaBrowserCompat$MediaItem;
                    Object[] objArr = new Object[0];
                    if (Log.isLoggable("PlayCore", 5)) {
                        Log.i("PlayCore", FragmentBuilder_BindPdfViewerFragment.read(fragmentBuilder_BindPdfViewerFragment.MediaBrowserCompat$CustomActionResultReceiver, "Phonesky package is not signed -- possibly self-built package. Could not verify.", objArr));
                    }
                    return false;
                }
                for (Signature byteArray : signatureArr) {
                    String read2 = RttiJsonBill_MembersInjector.read(byteArray.toByteArray());
                    if ("8P1sW0EPJcslw7UzRsiXL64w-O50Ed-RBICtay1g24M".equals(read2) || "GXWy8XF3vIml3_MfnmSmyuKBpT3B0dWbHRR_4cgq-gA".equals(read2)) {
                        return true;
                    }
                }
                return false;
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    /* renamed from: o.AlertController$RecycleListView$RatingCompat */
    public static final class RatingCompat {
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoField;
        public static final /* synthetic */ int[] $SwitchMap$org$threeten$bp$temporal$ChronoUnit;
        public static final int abc_action_bar_home_description = 2131755528;
        public static final int abc_action_bar_up_description = 2131755529;
        public static final int abc_action_menu_overflow_description = 2131755530;
        public static final int abc_action_mode_done = 2131755531;
        public static final int abc_activity_chooser_view_see_all = 2131755532;
        public static final int abc_activitychooserview_choose_application = 2131755533;
        public static final int abc_capital_off = 2131755534;
        public static final int abc_capital_on = 2131755535;
        public static final int abc_font_family_body_1_material = 2131755536;
        public static final int abc_font_family_body_2_material = 2131755537;
        public static final int abc_font_family_button_material = 2131755538;
        public static final int abc_font_family_caption_material = 2131755539;
        public static final int abc_font_family_display_1_material = 2131755540;
        public static final int abc_font_family_display_2_material = 2131755541;
        public static final int abc_font_family_display_3_material = 2131755542;
        public static final int abc_font_family_display_4_material = 2131755543;
        public static final int abc_font_family_headline_material = 2131755544;
        public static final int abc_font_family_menu_material = 2131755545;
        public static final int abc_font_family_subhead_material = 2131755546;
        public static final int abc_font_family_title_material = 2131755547;
        public static final int abc_menu_alt_shortcut_label = 2131755548;
        public static final int abc_menu_ctrl_shortcut_label = 2131755549;
        public static final int abc_menu_delete_shortcut_label = 2131755550;
        public static final int abc_menu_enter_shortcut_label = 2131755551;
        public static final int abc_menu_function_shortcut_label = 2131755552;
        public static final int abc_menu_meta_shortcut_label = 2131755553;
        public static final int abc_menu_shift_shortcut_label = 2131755554;
        public static final int abc_menu_space_shortcut_label = 2131755555;
        public static final int abc_menu_sym_shortcut_label = 2131755556;
        public static final int abc_prepend_shortcut_label = 2131755557;
        public static final int abc_search_hint = 2131755558;
        public static final int abc_searchview_description_clear = 2131755559;
        public static final int abc_searchview_description_query = 2131755560;
        public static final int abc_searchview_description_search = 2131755561;
        public static final int abc_searchview_description_submit = 2131755562;
        public static final int abc_searchview_description_voice = 2131755563;
        public static final int abc_shareactionprovider_share_with = 2131755564;
        public static final int abc_shareactionprovider_share_with_application = 2131755565;
        public static final int abc_toolbar_collapse_description = 2131755566;
        public static final int search_menu_title = 2131760798;
        public static final int status_bar_notification_info_overflow = 2131760987;
        private final MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
        private final ComponentName MediaBrowserCompat$ItemReceiver;
        private final write read;
        private final Object write;

        public RatingCompat() {
        }

        public RatingCompat(MediaBrowserCompat$ItemReceiver mediaBrowserCompat$ItemReceiver, write write2, ComponentName componentName) {
            this.write = new Object();
            this.IconCompatParcelizer = mediaBrowserCompat$ItemReceiver;
            this.read = write2;
            this.MediaBrowserCompat$ItemReceiver = componentName;
        }

        public final boolean read(Uri uri) {
            try {
                return this.IconCompatParcelizer.read(this.read, uri, (Bundle) null, (List<Bundle>) null);
            } catch (RemoteException unused) {
                return false;
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(46:0|(2:1|2)|3|(2:5|6)|7|9|10|11|(2:13|14)|15|(2:17|18)|19|21|22|23|(2:25|26)|27|(2:29|30)|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(49:0|(2:1|2)|3|5|6|7|9|10|11|(2:13|14)|15|17|18|19|21|22|23|(2:25|26)|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Can't wrap try/catch for region: R(52:0|1|2|3|5|6|7|9|10|11|13|14|15|17|18|19|21|22|23|25|26|27|29|30|31|33|34|35|36|37|38|39|40|41|42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|60) */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0071 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x007b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0085 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x008f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x0099 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00a3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:47:0x00ad */
        /* JADX WARNING: Missing exception handler attribute for start block: B:49:0x00b7 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:51:0x00c3 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:53:0x00cf */
        /* JADX WARNING: Missing exception handler attribute for start block: B:55:0x00db */
        /* JADX WARNING: Missing exception handler attribute for start block: B:57:0x00e7 */
        static {
            /*
                o.BillerAdapter$ItemViewHolder_ViewBinding[] r0 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                $SwitchMap$org$threeten$bp$temporal$ChronoUnit = r0
                r1 = 1
                o.BillerAdapter$ItemViewHolder_ViewBinding r2 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.DAYS     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x001d }
                o.BillerAdapter$ItemViewHolder_ViewBinding r3 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.WEEKS     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0028 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r4 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MONTHS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                r3 = 4
                int[] r4 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0033 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r5 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.YEARS     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                r4 = 5
                int[] r5 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x003e }
                o.BillerAdapter$ItemViewHolder_ViewBinding r6 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.DECADES     // Catch:{ NoSuchFieldError -> 0x003e }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r5[r6] = r4     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                r5 = 6
                int[] r6 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0049 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r7 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.CENTURIES     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r7 = r7.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r6[r7] = r5     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                r6 = 7
                int[] r7 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0054 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r8 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.MILLENNIA     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r7[r8] = r6     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                r7 = 8
                int[] r8 = $SwitchMap$org$threeten$bp$temporal$ChronoUnit     // Catch:{ NoSuchFieldError -> 0x0060 }
                o.BillerAdapter$ItemViewHolder_ViewBinding r9 = p040o.BillerAdapter$ItemViewHolder_ViewBinding.ERAS     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r8[r9] = r7     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                o.TierPricingInstallmentAdapter$InstallmentViewHolder[] r8 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.values()
                int r8 = r8.length
                int[] r8 = new int[r8]
                $SwitchMap$org$threeten$bp$temporal$ChronoField = r8
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r9 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0071 }
                int r9 = r9.ordinal()     // Catch:{ NoSuchFieldError -> 0x0071 }
                r8[r9] = r1     // Catch:{ NoSuchFieldError -> 0x0071 }
            L_0x0071:
                int[] r1 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x007b }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r8 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x007b }
                int r8 = r8.ordinal()     // Catch:{ NoSuchFieldError -> 0x007b }
                r1[r8] = r0     // Catch:{ NoSuchFieldError -> 0x007b }
            L_0x007b:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0085 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_MONTH     // Catch:{ NoSuchFieldError -> 0x0085 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0085 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0085 }
            L_0x0085:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x008f }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR_OF_ERA     // Catch:{ NoSuchFieldError -> 0x008f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008f }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x008f }
            L_0x008f:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x0099 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.DAY_OF_WEEK     // Catch:{ NoSuchFieldError -> 0x0099 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0099 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0099 }
            L_0x0099:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00a3 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_MONTH     // Catch:{ NoSuchFieldError -> 0x00a3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00a3 }
                r0[r1] = r5     // Catch:{ NoSuchFieldError -> 0x00a3 }
            L_0x00a3:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00ad }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_DAY_OF_WEEK_IN_YEAR     // Catch:{ NoSuchFieldError -> 0x00ad }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00ad }
                r0[r1] = r6     // Catch:{ NoSuchFieldError -> 0x00ad }
            L_0x00ad:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00b7 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.EPOCH_DAY     // Catch:{ NoSuchFieldError -> 0x00b7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00b7 }
                r0[r1] = r7     // Catch:{ NoSuchFieldError -> 0x00b7 }
            L_0x00b7:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00c3 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ALIGNED_WEEK_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00c3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00c3 }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00c3 }
            L_0x00c3:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00cf }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.MONTH_OF_YEAR     // Catch:{ NoSuchFieldError -> 0x00cf }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00cf }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00cf }
            L_0x00cf:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00db }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.PROLEPTIC_MONTH     // Catch:{ NoSuchFieldError -> 0x00db }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00db }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00db }
            L_0x00db:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00e7 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.YEAR     // Catch:{ NoSuchFieldError -> 0x00e7 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00e7 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00e7 }
            L_0x00e7:
                int[] r0 = $SwitchMap$org$threeten$bp$temporal$ChronoField     // Catch:{ NoSuchFieldError -> 0x00f3 }
                o.TierPricingInstallmentAdapter$InstallmentViewHolder r1 = p040o.TierPricingInstallmentAdapter$InstallmentViewHolder.ERA     // Catch:{ NoSuchFieldError -> 0x00f3 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x00f3 }
                r2 = 13
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x00f3 }
            L_0x00f3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.RatingCompat.<clinit>():void");
        }
    }

    /* renamed from: o.AlertController$RecycleListView$read */
    public static final class read implements TransformationMethod {
        public static final int[] MediaBrowserCompat$ItemReceiver = {nAllocationSetSurface.read.colorPrimary};
        public static final int actionBarDivider = 2130968576;
        public static final int actionBarItemBackground = 2130968577;
        public static final int actionBarPopupTheme = 2130968578;
        public static final int actionBarSize = 2130968579;
        public static final int actionBarSplitStyle = 2130968580;
        public static final int actionBarStyle = 2130968581;
        public static final int actionBarTabBarStyle = 2130968582;
        public static final int actionBarTabStyle = 2130968583;
        public static final int actionBarTabTextStyle = 2130968584;
        public static final int actionBarTheme = 2130968585;
        public static final int actionBarWidgetTheme = 2130968586;
        public static final int actionButtonStyle = 2130968587;
        public static final int actionDropDownStyle = 2130968588;
        public static final int actionLayout = 2130968589;
        public static final int actionMenuTextAppearance = 2130968590;
        public static final int actionMenuTextColor = 2130968591;
        public static final int actionModeBackground = 2130968592;
        public static final int actionModeCloseButtonStyle = 2130968593;
        public static final int actionModeCloseDrawable = 2130968594;
        public static final int actionModeCopyDrawable = 2130968595;
        public static final int actionModeCutDrawable = 2130968596;
        public static final int actionModeFindDrawable = 2130968597;
        public static final int actionModePasteDrawable = 2130968598;
        public static final int actionModePopupWindowStyle = 2130968599;
        public static final int actionModeSelectAllDrawable = 2130968600;
        public static final int actionModeShareDrawable = 2130968601;
        public static final int actionModeSplitBackground = 2130968602;
        public static final int actionModeStyle = 2130968603;
        public static final int actionModeWebSearchDrawable = 2130968604;
        public static final int actionOverflowButtonStyle = 2130968605;
        public static final int actionOverflowMenuStyle = 2130968606;
        public static final int actionProviderClass = 2130968607;
        public static final int actionViewClass = 2130968608;
        public static final int activityChooserViewStyle = 2130968609;
        public static final int alertDialogButtonGroupStyle = 2130968612;
        public static final int alertDialogCenterButtons = 2130968613;
        public static final int alertDialogStyle = 2130968614;
        public static final int alertDialogTheme = 2130968615;
        public static final int allowStacking = 2130968619;
        public static final int alpha = 2130968620;
        public static final int alphabeticModifiers = 2130968621;
        public static final int arrowHeadLength = 2130968625;
        public static final int arrowShaftLength = 2130968626;
        public static final int autoCompleteTextViewStyle = 2130968628;
        public static final int autoSizeMaxTextSize = 2130968630;
        public static final int autoSizeMinTextSize = 2130968631;
        public static final int autoSizePresetSizes = 2130968632;
        public static final int autoSizeStepGranularity = 2130968633;
        public static final int autoSizeTextType = 2130968634;
        public static final int background = 2130968635;
        public static final int backgroundSplit = 2130968637;
        public static final int backgroundStacked = 2130968638;
        public static final int backgroundTint = 2130968639;
        public static final int backgroundTintMode = 2130968640;
        public static final int barLength = 2130968641;
        public static final int borderlessButtonStyle = 2130968665;
        public static final int buttonBarButtonStyle = 2130968682;
        public static final int buttonBarNegativeButtonStyle = 2130968683;
        public static final int buttonBarNeutralButtonStyle = 2130968684;
        public static final int buttonBarPositiveButtonStyle = 2130968685;
        public static final int buttonBarStyle = 2130968686;
        public static final int buttonGravity = 2130968687;
        public static final int buttonIconDimen = 2130968688;
        public static final int buttonPanelSideLayout = 2130968689;
        public static final int buttonStyle = 2130968691;
        public static final int buttonStyleSmall = 2130968692;
        public static final int buttonTint = 2130968693;
        public static final int buttonTintMode = 2130968694;
        public static final int checkboxStyle = 2130968744;
        public static final int checkedTextViewStyle = 2130968749;
        public static final int closeIcon = 2130968778;
        public static final int closeItemLayout = 2130968785;
        public static final int collapseContentDescription = 2130968787;
        public static final int collapseIcon = 2130968788;
        public static final int color = 2130968791;
        public static final int colorAccent = 2130968792;
        public static final int colorBackgroundFloating = 2130968793;
        public static final int colorButtonNormal = 2130968794;
        public static final int colorControlActivated = 2130968795;
        public static final int colorControlHighlight = 2130968796;
        public static final int colorControlNormal = 2130968797;
        public static final int colorError = 2130968798;
        public static final int colorPrimary = 2130968799;
        public static final int colorPrimaryDark = 2130968800;
        public static final int colorSwitchThumbNormal = 2130968803;
        public static final int commitIcon = 2130968806;
        public static final int contentDescription = 2130968820;
        public static final int contentInsetEnd = 2130968821;
        public static final int contentInsetEndWithActions = 2130968822;
        public static final int contentInsetLeft = 2130968823;
        public static final int contentInsetRight = 2130968824;
        public static final int contentInsetStart = 2130968825;
        public static final int contentInsetStartWithNavigation = 2130968826;
        public static final int controlBackground = 2130968833;
        public static final int coordinatorLayoutStyle = 2130968834;
        public static final int customNavigationLayout = 2130968852;
        public static final int defaultQueryHint = 2130968868;
        public static final int dialogCornerRadius = 2130968870;
        public static final int dialogPreferredPadding = 2130968871;
        public static final int dialogTheme = 2130968872;
        public static final int displayOptions = 2130968874;
        public static final int divider = 2130968875;
        public static final int dividerHorizontal = 2130968880;
        public static final int dividerPadding = 2130968881;
        public static final int dividerVertical = 2130968882;
        public static final int drawableSize = 2130968883;
        public static final int drawerArrowStyle = 2130968884;
        public static final int dropDownListViewStyle = 2130968885;
        public static final int dropdownListPreferredItemHeight = 2130968886;
        public static final int editTextBackground = 2130968888;
        public static final int editTextColor = 2130968889;
        public static final int editTextStyle = 2130968894;
        public static final int elevation = 2130968897;
        public static final int expandActivityOverflowButtonDrawable = 2130968914;
        public static final int firstBaselineToTopHeight = 2130968937;
        public static final int font = 2130968941;
        public static final int fontFamily = 2130968942;
        public static final int fontProviderAuthority = 2130968944;
        public static final int fontProviderCerts = 2130968945;
        public static final int fontProviderFetchStrategy = 2130968946;
        public static final int fontProviderFetchTimeout = 2130968947;
        public static final int fontProviderPackage = 2130968948;
        public static final int fontProviderQuery = 2130968949;
        public static final int fontStyle = 2130968950;
        public static final int fontVariationSettings = 2130968951;
        public static final int fontWeight = 2130968952;
        public static final int gapBetweenBars = 2130968954;
        public static final int goIcon = 2130968966;
        public static final int height = 2130968971;
        public static final int hideOnContentScroll = 2130968976;
        public static final int homeAsUpIndicator = 2130968982;
        public static final int homeLayout = 2130968983;
        public static final int icon = 2130968988;
        public static final int iconTint = 2130968996;
        public static final int iconTintMode = 2130968998;
        public static final int iconifiedByDefault = 2130968999;
        public static final int imageButtonStyle = 2130969005;
        public static final int indeterminateProgressStyle = 2130969007;
        public static final int initialActivityCount = 2130969009;
        public static final int isLightTheme = 2130969015;
        public static final int itemPadding = 2130969023;
        public static final int keylines = 2130969031;
        public static final int lastBaselineToBottomHeight = 2130969039;
        public static final int layout = 2130969044;
        public static final int layout_anchor = 2130969047;
        public static final int layout_anchorGravity = 2130969048;
        public static final int layout_behavior = 2130969049;
        public static final int layout_dodgeInsetEdges = 2130969096;
        public static final int layout_insetEdge = 2130969109;
        public static final int layout_keyline = 2130969110;
        public static final int lineHeight = 2130969127;
        public static final int listChoiceBackgroundIndicator = 2130969129;
        public static final int listDividerAlertDialog = 2130969130;
        public static final int listItemLayout = 2130969131;
        public static final int listLayout = 2130969132;
        public static final int listMenuViewStyle = 2130969133;
        public static final int listPopupWindowStyle = 2130969134;
        public static final int listPreferredItemHeight = 2130969135;
        public static final int listPreferredItemHeightLarge = 2130969136;
        public static final int listPreferredItemHeightSmall = 2130969137;
        public static final int listPreferredItemPaddingLeft = 2130969138;
        public static final int listPreferredItemPaddingRight = 2130969139;
        public static final int logo = 2130969144;
        public static final int logoDescription = 2130969145;
        public static final int maxButtonHeight = 2130969172;
        public static final int measureWithLargestChild = 2130969203;
        public static final int multiChoiceItemLayout = 2130969209;
        public static final int navigationContentDescription = 2130969210;
        public static final int navigationIcon = 2130969211;
        public static final int navigationMode = 2130969212;
        public static final int numericModifiers = 2130969215;
        public static final int overlapAnchor = 2130969219;
        public static final int paddingBottomNoButtons = 2130969223;
        public static final int paddingEnd = 2130969224;
        public static final int paddingStart = 2130969225;
        public static final int paddingTopNoTitle = 2130969226;
        public static final int panelBackground = 2130969228;
        public static final int panelMenuListTheme = 2130969229;
        public static final int panelMenuListWidth = 2130969230;
        public static final int popupMenuStyle = 2130969255;
        public static final int popupTheme = 2130969256;
        public static final int popupWindowStyle = 2130969257;
        public static final int preserveIconSpacing = 2130969258;
        public static final int progressBarPadding = 2130969261;
        public static final int progressBarStyle = 2130969262;
        public static final int queryBackground = 2130969264;
        public static final int queryHint = 2130969265;
        public static final int radioButtonStyle = 2130969268;
        public static final int ratingBarStyle = 2130969270;
        public static final int ratingBarStyleIndicator = 2130969271;
        public static final int ratingBarStyleSmall = 2130969272;
        public static volatile boolean read = false;
        public static final int searchHintIcon = 2130969303;
        public static final int searchIcon = 2130969304;
        public static final int searchViewStyle = 2130969305;
        public static final int seekBarStyle = 2130969307;
        public static final int selectableItemBackground = 2130969308;
        public static final int selectableItemBackgroundBorderless = 2130969309;
        public static final int showAsAction = 2130969315;
        public static final int showDividers = 2130969321;
        public static final int showText = 2130969323;
        public static final int showTitle = 2130969324;
        public static final int singleChoiceItemLayout = 2130969325;
        public static final int spinBars = 2130969339;
        public static final int spinnerDropDownItemStyle = 2130969340;
        public static final int spinnerStyle = 2130969341;
        public static final int splitTrack = 2130969342;
        public static final int srcCompat = 2130969344;
        public static final int state_above_anchor = 2130969346;
        public static final int statusBarBackground = 2130969351;
        public static final int subMenuArrow = 2130969355;
        public static final int submitBackground = 2130969356;
        public static final int subtitle = 2130969357;
        public static final int subtitleTextAppearance = 2130969358;
        public static final int subtitleTextColor = 2130969359;
        public static final int subtitleTextStyle = 2130969360;
        public static final int suggestionRowLayout = 2130969361;
        public static final int switchMinWidth = 2130969362;
        public static final int switchPadding = 2130969363;
        public static final int switchStyle = 2130969364;
        public static final int switchTextAppearance = 2130969365;
        public static final int textAllCaps = 2130969393;
        public static final int textAppearanceLargePopupMenu = 2130969404;
        public static final int textAppearanceListItem = 2130969405;
        public static final int textAppearanceListItemSecondary = 2130969406;
        public static final int textAppearanceListItemSmall = 2130969407;
        public static final int textAppearancePopupMenuHeader = 2130969409;
        public static final int textAppearanceSearchResultSubtitle = 2130969410;
        public static final int textAppearanceSearchResultTitle = 2130969411;
        public static final int textAppearanceSmallPopupMenu = 2130969412;
        public static final int textColorAlertDialogListItem = 2130969416;
        public static final int textColorSearchUrl = 2130969417;
        public static final int theme = 2130969479;
        public static final int thickness = 2130969480;
        public static final int thumbTextPadding = 2130969481;
        public static final int thumbTint = 2130969482;
        public static final int thumbTintMode = 2130969483;
        public static final int tickMark = 2130969484;
        public static final int tickMarkTint = 2130969485;
        public static final int tickMarkTintMode = 2130969486;
        public static final int tint = 2130969488;
        public static final int tintMode = 2130969489;
        public static final int title = 2130969490;
        public static final int titleMargin = 2130969495;
        public static final int titleMarginBottom = 2130969496;
        public static final int titleMarginEnd = 2130969497;
        public static final int titleMarginStart = 2130969498;
        public static final int titleMarginTop = 2130969499;
        public static final int titleMargins = 2130969500;
        public static final int titleTextAppearance = 2130969503;
        public static final int titleTextColor = 2130969504;
        public static final int titleTextStyle = 2130969506;
        public static final int toolbarNavigationButtonStyle = 2130969508;
        public static final int toolbarStyle = 2130969509;
        public static final int tooltipForegroundColor = 2130969510;
        public static final int tooltipFrameBackground = 2130969511;
        public static final int tooltipText = 2130969512;
        public static final int track = 2130969513;
        public static final int trackTint = 2130969514;
        public static final int trackTintMode = 2130969515;
        public static final int ttcIndex = 2130969516;
        public static final int viewInflaterClass = 2130969536;
        public static final int voiceIcon = 2130969538;
        public static final int windowActionBar = 2130969539;
        public static final int windowActionBarOverlay = 2130969540;
        public static final int windowActionModeOverlay = 2130969541;
        public static final int windowFixedHeightMajor = 2130969542;
        public static final int windowFixedHeightMinor = 2130969543;
        public static final int windowFixedWidthMajor = 2130969544;
        public static final int windowFixedWidthMinor = 2130969545;
        public static final int windowMinWidthMajor = 2130969546;
        public static final int windowMinWidthMinor = 2130969547;
        public static final int windowNoTitle = 2130969548;
        private static final int[] write = {nAllocationSetSurface.read.colorSecondary};
        private Locale MediaBrowserCompat$CustomActionResultReceiver;

        public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        }

        public read(Context context) {
            this.MediaBrowserCompat$CustomActionResultReceiver = context.getResources().getConfiguration().locale;
        }

        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            if (charSequence != null) {
                return charSequence.toString().toUpperCase(this.MediaBrowserCompat$CustomActionResultReceiver);
            }
            return null;
        }

        read() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
            if (r7.Keep == 2) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
            if (r7.setStackedBackground == 2) goto L_0x008c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0091, code lost:
            r12 = r21;
            r18 = false;
         */
        /* JADX WARNING: Removed duplicated region for block: B:303:0x060d  */
        /* JADX WARNING: Removed duplicated region for block: B:308:0x061f  */
        /* JADX WARNING: Removed duplicated region for block: B:309:0x0621  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void read(p040o.setImageDrawable r40, p040o.AppCompatCheckedTextView r41, int r42) {
            /*
                r0 = r40
                r10 = r41
                r11 = r42
                if (r11 != 0) goto L_0x0010
                int r1 = r0.setActionBarVisibilityCallback
                o.setExpandActivityOverflowButtonContentDescription$4[] r2 = r0.ActionBarOverlayLayout
                r14 = r1
                r15 = r2
                r8 = 0
                goto L_0x0017
            L_0x0010:
                int r1 = r0.ActionMenuView
                o.setExpandActivityOverflowButtonContentDescription$4[] r2 = r0.setMenu
                r14 = r1
                r15 = r2
                r8 = 2
            L_0x0017:
                r9 = 0
            L_0x0018:
                if (r9 >= r14) goto L_0x0641
                r1 = r15[r9]
                r1.MediaBrowserCompat$ItemReceiver()
                int r2 = r0.setMenuPrepared
                r7 = 4
                r2 = r2 & r7
                if (r2 != r7) goto L_0x0027
                r2 = 1
                goto L_0x0028
            L_0x0027:
                r2 = 0
            L_0x0028:
                if (r2 == 0) goto L_0x003e
                boolean r2 = p040o.getSupportBackgroundTintMode.read(r10, r11, r8, r1)
                if (r2 != 0) goto L_0x0031
                goto L_0x003e
            L_0x0031:
                r20 = r9
                r29 = r14
                r28 = r15
                r16 = 2
                r26 = 0
                r14 = r8
                goto L_0x0636
            L_0x003e:
                o.setImageResource r6 = r1.IconCompatParcelizer
                o.setImageResource r5 = r1.MediaMetadataCompat
                o.setImageResource r4 = r1.MediaBrowserCompat$CustomActionResultReceiver
                o.setImageResource r2 = r1.MediaBrowserCompat$MediaItem
                o.setImageResource r7 = r1.write
                float r13 = r1.MediaDescriptionCompat
                o.setImageResource$read[] r12 = r0.AppCompatDelegateImpl$ListMenuDecorView
                r12 = r12[r11]
                o.setImageResource$read r3 = p040o.setImageResource.read.WRAP_CONTENT
                if (r12 != r3) goto L_0x0054
                r3 = 1
                goto L_0x0055
            L_0x0054:
                r3 = 0
            L_0x0055:
                if (r11 != 0) goto L_0x0072
                int r12 = r7.Keep
                r20 = r9
                if (r12 != 0) goto L_0x005f
                r12 = 1
                goto L_0x0060
            L_0x005f:
                r12 = 0
            L_0x0060:
                int r9 = r7.Keep
                r21 = r12
                r12 = 1
                if (r9 != r12) goto L_0x0069
                r9 = 1
                goto L_0x006a
            L_0x0069:
                r9 = 0
            L_0x006a:
                int r12 = r7.Keep
                r22 = r9
                r9 = 2
                if (r12 != r9) goto L_0x0091
                goto L_0x008c
            L_0x0072:
                r20 = r9
                int r9 = r7.setStackedBackground
                if (r9 != 0) goto L_0x007a
                r9 = 1
                goto L_0x007b
            L_0x007a:
                r9 = 0
            L_0x007b:
                int r12 = r7.setStackedBackground
                r21 = r9
                r9 = 1
                if (r12 != r9) goto L_0x0084
                r9 = 1
                goto L_0x0085
            L_0x0084:
                r9 = 0
            L_0x0085:
                int r12 = r7.setStackedBackground
                r22 = r9
                r9 = 2
                if (r12 != r9) goto L_0x0091
            L_0x008c:
                r12 = r21
                r18 = 1
                goto L_0x0095
            L_0x0091:
                r12 = r21
                r18 = 0
            L_0x0095:
                r9 = r6
                r24 = r13
                r21 = 0
            L_0x009a:
                r25 = 0
                if (r21 != 0) goto L_0x0182
                o.setSupportImageTintList[] r13 = r9.setContentView
                r13 = r13[r8]
                if (r3 != 0) goto L_0x00a9
                if (r18 != 0) goto L_0x00a9
                r27 = 4
                goto L_0x00ab
            L_0x00a9:
                r27 = 1
            L_0x00ab:
                int r28 = r13.read()
                r29 = r14
                o.setSupportImageTintList r14 = r13.RatingCompat
                if (r14 == 0) goto L_0x00bf
                if (r9 == r6) goto L_0x00bf
                o.setSupportImageTintList r14 = r13.RatingCompat
                int r14 = r14.read()
                int r28 = r28 + r14
            L_0x00bf:
                r14 = r28
                if (r18 == 0) goto L_0x00cd
                if (r9 == r6) goto L_0x00cd
                if (r9 == r4) goto L_0x00cd
                r27 = r12
                r28 = r15
                r15 = 6
                goto L_0x00dd
            L_0x00cd:
                if (r12 == 0) goto L_0x00d7
                if (r3 == 0) goto L_0x00d7
                r27 = r12
                r28 = r15
                r15 = 4
                goto L_0x00dd
            L_0x00d7:
                r28 = r15
                r15 = r27
                r27 = r12
            L_0x00dd:
                o.setSupportImageTintList r12 = r13.RatingCompat
                if (r12 == 0) goto L_0x010a
                if (r9 != r4) goto L_0x00f2
                o.setCheckMarkDrawable r12 = r13.MediaBrowserCompat$ItemReceiver
                r30 = r7
                o.setSupportImageTintList r7 = r13.RatingCompat
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                r31 = r6
                r6 = 5
                r10.read(r12, r7, r14, r6)
                goto L_0x0100
            L_0x00f2:
                r31 = r6
                r30 = r7
                o.setCheckMarkDrawable r6 = r13.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList r7 = r13.RatingCompat
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                r12 = 6
                r10.read(r6, r7, r14, r12)
            L_0x0100:
                o.setCheckMarkDrawable r6 = r13.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList r7 = r13.RatingCompat
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                r10.write(r6, r7, r14, r15)
                goto L_0x010e
            L_0x010a:
                r31 = r6
                r30 = r7
            L_0x010e:
                if (r3 == 0) goto L_0x0143
                int r6 = r9.setTitleOptional
                r7 = 8
                if (r6 == r7) goto L_0x0132
                o.setImageResource$read[] r6 = r9.AppCompatDelegateImpl$ListMenuDecorView
                r6 = r6[r11]
                o.setImageResource$read r7 = p040o.setImageResource.read.MATCH_CONSTRAINT
                if (r6 != r7) goto L_0x0132
                o.setSupportImageTintList[] r6 = r9.setContentView
                int r7 = r8 + 1
                r6 = r6[r7]
                o.setCheckMarkDrawable r6 = r6.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r7 = r9.setContentView
                r7 = r7[r8]
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                r12 = 5
                r13 = 0
                r10.read(r6, r7, r13, r12)
                goto L_0x0133
            L_0x0132:
                r13 = 0
            L_0x0133:
                o.setSupportImageTintList[] r6 = r9.setContentView
                r6 = r6[r8]
                o.setCheckMarkDrawable r6 = r6.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r7 = r0.setContentView
                r7 = r7[r8]
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                r12 = 6
                r10.read(r6, r7, r13, r12)
            L_0x0143:
                o.setSupportImageTintList[] r6 = r9.setContentView
                int r7 = r8 + 1
                r6 = r6[r7]
                o.setSupportImageTintList r6 = r6.RatingCompat
                if (r6 == 0) goto L_0x0164
                o.setImageResource r6 = r6.IconCompatParcelizer
                o.setSupportImageTintList[] r7 = r6.setContentView
                r7 = r7[r8]
                o.setSupportImageTintList r7 = r7.RatingCompat
                if (r7 == 0) goto L_0x0164
                o.setSupportImageTintList[] r7 = r6.setContentView
                r7 = r7[r8]
                o.setSupportImageTintList r7 = r7.RatingCompat
                o.setImageResource r7 = r7.IconCompatParcelizer
                if (r7 == r9) goto L_0x0162
                goto L_0x0164
            L_0x0162:
                r25 = r6
            L_0x0164:
                if (r25 == 0) goto L_0x0174
                r9 = r25
                r12 = r27
                r15 = r28
                r14 = r29
                r7 = r30
                r6 = r31
                goto L_0x009a
            L_0x0174:
                r12 = r27
                r15 = r28
                r14 = r29
                r7 = r30
                r6 = r31
                r21 = 1
                goto L_0x009a
            L_0x0182:
                r31 = r6
                r30 = r7
                r27 = r12
                r29 = r14
                r28 = r15
                if (r2 == 0) goto L_0x01af
                o.setSupportImageTintList[] r6 = r5.setContentView
                int r7 = r8 + 1
                r6 = r6[r7]
                o.setSupportImageTintList r6 = r6.RatingCompat
                if (r6 == 0) goto L_0x01af
                o.setSupportImageTintList[] r6 = r2.setContentView
                r6 = r6[r7]
                o.setCheckMarkDrawable r9 = r6.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r12 = r5.setContentView
                r7 = r12[r7]
                o.setSupportImageTintList r7 = r7.RatingCompat
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                int r6 = r6.read()
                int r6 = -r6
                r12 = 5
                r10.IconCompatParcelizer(r9, r7, r6, r12)
            L_0x01af:
                if (r3 == 0) goto L_0x01cb
                o.setSupportImageTintList[] r3 = r0.setContentView
                int r6 = r8 + 1
                r3 = r3[r6]
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r7 = r5.setContentView
                r7 = r7[r6]
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r9 = r5.setContentView
                r6 = r9[r6]
                int r6 = r6.read()
                r9 = 6
                r10.read(r3, r7, r6, r9)
            L_0x01cb:
                java.util.ArrayList<o.setImageResource> r3 = r1.RatingCompat
                if (r3 == 0) goto L_0x0301
                int r6 = r3.size()
                r7 = 1
                if (r6 <= r7) goto L_0x0301
                boolean r9 = r1.MediaBrowserCompat$ItemReceiver
                if (r9 == 0) goto L_0x01e2
                boolean r9 = r1.read
                if (r9 != 0) goto L_0x01e2
                int r9 = r1.ParcelableVolumeInfo
                float r13 = (float) r9
                goto L_0x01e4
            L_0x01e2:
                r13 = r24
            L_0x01e4:
                r9 = 0
                r15 = r9
                r14 = r25
                r12 = 0
            L_0x01e9:
                if (r12 >= r6) goto L_0x0301
                java.lang.Object r19 = r3.get(r12)
                r7 = r19
                o.setImageResource r7 = (p040o.setImageResource) r7
                float[] r0 = r7.setSubtitle
                r0 = r0[r11]
                int r19 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
                if (r19 >= 0) goto L_0x0220
                boolean r0 = r1.read
                if (r0 == 0) goto L_0x0219
                o.setSupportImageTintList[] r0 = r7.setContentView
                int r9 = r8 + 1
                r0 = r0[r9]
                o.setCheckMarkDrawable r0 = r0.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r7 = r7.setContentView
                r7 = r7[r8]
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                r16 = r3
                r3 = 0
                r9 = 4
                r10.write(r0, r7, r3, r9)
                r19 = r9
                r7 = 6
                r9 = r3
                goto L_0x023c
            L_0x0219:
                r16 = r3
                r19 = 4
                r0 = 1065353216(0x3f800000, float:1.0)
                goto L_0x0224
            L_0x0220:
                r16 = r3
                r19 = 4
            L_0x0224:
                r3 = 0
                int r32 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r32 != 0) goto L_0x0248
                o.setSupportImageTintList[] r0 = r7.setContentView
                int r3 = r8 + 1
                r0 = r0[r3]
                o.setCheckMarkDrawable r0 = r0.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r3 = r7.setContentView
                r3 = r3[r8]
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                r7 = 6
                r9 = 0
                r10.write(r0, r3, r9, r7)
            L_0x023c:
                r35 = r1
                r34 = r6
                r17 = r7
                r26 = r9
                r24 = 0
                goto L_0x02f2
            L_0x0248:
                r17 = 6
                r26 = 0
                if (r14 == 0) goto L_0x02e4
                o.setSupportImageTintList[] r3 = r14.setContentView
                r3 = r3[r8]
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r14 = r14.setContentView
                int r33 = r8 + 1
                r14 = r14[r33]
                o.setCheckMarkDrawable r14 = r14.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r9 = r7.setContentView
                r9 = r9[r8]
                o.setCheckMarkDrawable r9 = r9.MediaBrowserCompat$ItemReceiver
                r34 = r6
                o.setSupportImageTintList[] r6 = r7.setContentView
                r6 = r6[r33]
                o.setCheckMarkDrawable r6 = r6.MediaBrowserCompat$ItemReceiver
                r33 = r7
                o.setTextSize r7 = r41.MediaBrowserCompat$CustomActionResultReceiver()
                r35 = r1
                r1 = 0
                r7.MediaBrowserCompat$ItemReceiver = r1
                int r24 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                if (r24 == 0) goto L_0x02c4
                int r24 = (r15 > r0 ? 1 : (r15 == r0 ? 0 : -1))
                if (r24 == 0) goto L_0x02c4
                r24 = 0
                int r36 = (r15 > r24 ? 1 : (r15 == r24 ? 0 : -1))
                if (r36 != 0) goto L_0x0294
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r6 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r9 = 1065353216(0x3f800000, float:1.0)
                r6.IconCompatParcelizer(r3, r9)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r3 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r3.IconCompatParcelizer(r14, r1)
            L_0x0291:
                r32 = r0
                goto L_0x02e0
            L_0x0294:
                r1 = 1065353216(0x3f800000, float:1.0)
                if (r32 != 0) goto L_0x02a5
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r3 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r3.IconCompatParcelizer(r9, r1)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r1 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                r1.IconCompatParcelizer(r6, r3)
                goto L_0x0291
            L_0x02a5:
                float r15 = r15 / r13
                float r32 = r0 / r13
                float r15 = r15 / r32
                r32 = r0
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r0.IconCompatParcelizer(r3, r1)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r1 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0.IconCompatParcelizer(r14, r1)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r0.IconCompatParcelizer(r6, r15)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                float r1 = -r15
                r0.IconCompatParcelizer(r9, r1)
                goto L_0x02e0
            L_0x02c4:
                r32 = r0
                r24 = 0
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r1 = 1065353216(0x3f800000, float:1.0)
                r0.IconCompatParcelizer(r3, r1)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r3 = -1082130432(0xffffffffbf800000, float:-1.0)
                r0.IconCompatParcelizer(r14, r3)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r0.IconCompatParcelizer(r6, r1)
                o.AlertController$RecycleListView$MediaBrowserCompat$SearchResultReceiver r0 = r7.MediaBrowserCompat$CustomActionResultReceiver
                r0.IconCompatParcelizer(r9, r3)
            L_0x02e0:
                r10.read(r7)
                goto L_0x02ee
            L_0x02e4:
                r32 = r0
                r35 = r1
                r34 = r6
                r33 = r7
                r24 = 0
            L_0x02ee:
                r15 = r32
                r14 = r33
            L_0x02f2:
                int r12 = r12 + 1
                r0 = r40
                r3 = r16
                r9 = r24
                r6 = r34
                r1 = r35
                r7 = 1
                goto L_0x01e9
            L_0x0301:
                r35 = r1
                r17 = 6
                r19 = 4
                r26 = 0
                if (r4 == 0) goto L_0x0387
                if (r4 == r2) goto L_0x030f
                if (r18 == 0) goto L_0x0387
            L_0x030f:
                r0 = r31
                o.setSupportImageTintList[] r1 = r0.setContentView
                r1 = r1[r8]
                o.setSupportImageTintList[] r3 = r5.setContentView
                int r6 = r8 + 1
                r3 = r3[r6]
                o.setSupportImageTintList[] r7 = r0.setContentView
                r7 = r7[r8]
                o.setSupportImageTintList r7 = r7.RatingCompat
                if (r7 == 0) goto L_0x032c
                o.setSupportImageTintList[] r0 = r0.setContentView
                r0 = r0[r8]
                o.setSupportImageTintList r0 = r0.RatingCompat
                o.setCheckMarkDrawable r0 = r0.MediaBrowserCompat$ItemReceiver
                goto L_0x032e
            L_0x032c:
                r0 = r25
            L_0x032e:
                o.setSupportImageTintList[] r7 = r5.setContentView
                r7 = r7[r6]
                o.setSupportImageTintList r7 = r7.RatingCompat
                if (r7 == 0) goto L_0x033f
                o.setSupportImageTintList[] r7 = r5.setContentView
                r7 = r7[r6]
                o.setSupportImageTintList r7 = r7.RatingCompat
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                goto L_0x0341
            L_0x033f:
                r7 = r25
            L_0x0341:
                if (r4 != r2) goto L_0x034b
                o.setSupportImageTintList[] r1 = r4.setContentView
                r1 = r1[r8]
                o.setSupportImageTintList[] r3 = r4.setContentView
                r3 = r3[r6]
            L_0x034b:
                if (r0 == 0) goto L_0x037f
                if (r7 == 0) goto L_0x037f
                if (r11 != 0) goto L_0x0356
                r6 = r30
                float r6 = r6.setHasDecor
                goto L_0x035a
            L_0x0356:
                r6 = r30
                float r6 = r6.setTabContainer
            L_0x035a:
                int r9 = r1.read()
                int r12 = r3.read()
                o.setCheckMarkDrawable r13 = r1.MediaBrowserCompat$ItemReceiver
                o.setCheckMarkDrawable r14 = r3.MediaBrowserCompat$ItemReceiver
                r15 = 5
                r1 = r41
                r3 = r2
                r2 = r13
                r13 = r3
                r3 = r0
                r0 = r4
                r4 = r9
                r9 = r5
                r5 = r6
                r6 = r7
                r7 = r14
                r14 = r8
                r8 = r12
                r12 = r9
                r16 = 2
                r9 = r15
                r1.write(r2, r3, r4, r5, r6, r7, r8, r9)
                r15 = r0
                goto L_0x05d1
            L_0x037f:
                r13 = r2
                r12 = r5
                r14 = r8
                r16 = 2
                r15 = r4
                goto L_0x05d1
            L_0x0387:
                r13 = r2
                r15 = r4
                r12 = r5
                r14 = r8
                r0 = r31
                r16 = 2
                if (r27 == 0) goto L_0x049c
                if (r15 == 0) goto L_0x049c
                r1 = r35
                int r2 = r1.ParcelableVolumeInfo
                if (r2 <= 0) goto L_0x03a2
                int r2 = r1.MediaBrowserCompat$SearchResultReceiver
                int r1 = r1.ParcelableVolumeInfo
                if (r2 != r1) goto L_0x03a2
                r21 = 1
                goto L_0x03a4
            L_0x03a2:
                r21 = r26
            L_0x03a4:
                r8 = r15
                r9 = r8
            L_0x03a6:
                if (r9 == 0) goto L_0x05d1
                o.setImageResource[] r1 = r9.setTitle
                r1 = r1[r11]
                r7 = r1
            L_0x03ad:
                if (r7 == 0) goto L_0x03ba
                int r1 = r7.setTitleOptional
                r2 = 8
                if (r1 != r2) goto L_0x03ba
                o.setImageResource[] r1 = r7.setTitle
                r7 = r1[r11]
                goto L_0x03ad
            L_0x03ba:
                if (r7 != 0) goto L_0x03c7
                if (r9 == r13) goto L_0x03c7
                r37 = r0
                r18 = r7
                r23 = r8
                r0 = r9
                goto L_0x048c
            L_0x03c7:
                o.setSupportImageTintList[] r1 = r9.setContentView
                r1 = r1[r14]
                o.setCheckMarkDrawable r2 = r1.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList r3 = r1.RatingCompat
                if (r3 == 0) goto L_0x03d6
                o.setSupportImageTintList r3 = r1.RatingCompat
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                goto L_0x03d8
            L_0x03d6:
                r3 = r25
            L_0x03d8:
                if (r8 == r9) goto L_0x03e3
                o.setSupportImageTintList[] r3 = r8.setContentView
                int r4 = r14 + 1
                r3 = r3[r4]
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                goto L_0x03fa
            L_0x03e3:
                if (r9 != r15) goto L_0x03fa
                if (r8 != r9) goto L_0x03fa
                o.setSupportImageTintList[] r3 = r0.setContentView
                r3 = r3[r14]
                o.setSupportImageTintList r3 = r3.RatingCompat
                if (r3 == 0) goto L_0x03f8
                o.setSupportImageTintList[] r3 = r0.setContentView
                r3 = r3[r14]
                o.setSupportImageTintList r3 = r3.RatingCompat
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                goto L_0x03fa
            L_0x03f8:
                r3 = r25
            L_0x03fa:
                int r1 = r1.read()
                o.setSupportImageTintList[] r4 = r9.setContentView
                int r5 = r14 + 1
                r4 = r4[r5]
                int r4 = r4.read()
                if (r7 == 0) goto L_0x041b
                o.setSupportImageTintList[] r6 = r7.setContentView
                r6 = r6[r14]
                r31 = r0
                o.setCheckMarkDrawable r0 = r6.MediaBrowserCompat$ItemReceiver
                r18 = r0
                o.setSupportImageTintList[] r0 = r9.setContentView
                r0 = r0[r5]
                o.setCheckMarkDrawable r0 = r0.MediaBrowserCompat$ItemReceiver
                goto L_0x0432
            L_0x041b:
                r31 = r0
                o.setSupportImageTintList[] r0 = r12.setContentView
                r0 = r0[r5]
                o.setSupportImageTintList r6 = r0.RatingCompat
                if (r6 == 0) goto L_0x042a
                o.setCheckMarkDrawable r0 = r6.MediaBrowserCompat$ItemReceiver
                r18 = r0
                goto L_0x042c
            L_0x042a:
                r18 = r25
            L_0x042c:
                o.setSupportImageTintList[] r0 = r9.setContentView
                r0 = r0[r5]
                o.setCheckMarkDrawable r0 = r0.MediaBrowserCompat$ItemReceiver
            L_0x0432:
                if (r6 == 0) goto L_0x0439
                int r6 = r6.read()
                int r4 = r4 + r6
            L_0x0439:
                if (r8 == 0) goto L_0x0444
                o.setSupportImageTintList[] r6 = r8.setContentView
                r6 = r6[r5]
                int r6 = r6.read()
                int r1 = r1 + r6
            L_0x0444:
                if (r2 == 0) goto L_0x0485
                if (r3 == 0) goto L_0x0485
                if (r18 == 0) goto L_0x0485
                if (r0 == 0) goto L_0x0485
                if (r9 != r15) goto L_0x0456
                o.setSupportImageTintList[] r1 = r15.setContentView
                r1 = r1[r14]
                int r1 = r1.read()
            L_0x0456:
                r6 = r1
                if (r9 != r13) goto L_0x0464
                o.setSupportImageTintList[] r1 = r13.setContentView
                r1 = r1[r5]
                int r1 = r1.read()
                r23 = r1
                goto L_0x0466
            L_0x0464:
                r23 = r4
            L_0x0466:
                if (r21 == 0) goto L_0x046b
                r24 = r17
                goto L_0x046d
            L_0x046b:
                r24 = r19
            L_0x046d:
                r5 = 1056964608(0x3f000000, float:0.5)
                r1 = r41
                r4 = r6
                r37 = r31
                r6 = r18
                r18 = r7
                r7 = r0
                r0 = r8
                r8 = r23
                r23 = r0
                r0 = r9
                r9 = r24
                r1.write(r2, r3, r4, r5, r6, r7, r8, r9)
                goto L_0x048c
            L_0x0485:
                r18 = r7
                r23 = r8
                r0 = r9
                r37 = r31
            L_0x048c:
                int r1 = r0.setTitleOptional
                r2 = 8
                if (r1 == r2) goto L_0x0494
                r8 = r0
                goto L_0x0496
            L_0x0494:
                r8 = r23
            L_0x0496:
                r9 = r18
                r0 = r37
                goto L_0x03a6
            L_0x049c:
                r37 = r0
                r1 = r35
                if (r22 == 0) goto L_0x05d1
                if (r15 == 0) goto L_0x05d1
                int r0 = r1.ParcelableVolumeInfo
                if (r0 <= 0) goto L_0x04b1
                int r0 = r1.MediaBrowserCompat$SearchResultReceiver
                int r1 = r1.ParcelableVolumeInfo
                if (r0 != r1) goto L_0x04b1
                r21 = 1
                goto L_0x04b3
            L_0x04b1:
                r21 = r26
            L_0x04b3:
                r0 = r15
                r9 = r0
            L_0x04b5:
                if (r0 == 0) goto L_0x056f
                o.setImageResource[] r1 = r0.setTitle
                r1 = r1[r11]
            L_0x04bb:
                if (r1 == 0) goto L_0x04c8
                int r2 = r1.setTitleOptional
                r3 = 8
                if (r2 != r3) goto L_0x04c8
                o.setImageResource[] r1 = r1.setTitle
                r1 = r1[r11]
                goto L_0x04bb
            L_0x04c8:
                if (r0 == r15) goto L_0x055f
                if (r0 == r13) goto L_0x055f
                if (r1 == 0) goto L_0x055f
                if (r1 != r13) goto L_0x04d3
                r8 = r25
                goto L_0x04d4
            L_0x04d3:
                r8 = r1
            L_0x04d4:
                o.setSupportImageTintList[] r1 = r0.setContentView
                r1 = r1[r14]
                o.setCheckMarkDrawable r2 = r1.MediaBrowserCompat$ItemReceiver
                o.setSupportImageTintList[] r3 = r9.setContentView
                int r4 = r14 + 1
                r3 = r3[r4]
                o.setCheckMarkDrawable r3 = r3.MediaBrowserCompat$ItemReceiver
                int r1 = r1.read()
                o.setSupportImageTintList[] r5 = r0.setContentView
                r5 = r5[r4]
                int r5 = r5.read()
                if (r8 == 0) goto L_0x0504
                o.setSupportImageTintList[] r6 = r8.setContentView
                r6 = r6[r14]
                o.setCheckMarkDrawable r7 = r6.MediaBrowserCompat$ItemReceiver
                r18 = r7
                o.setSupportImageTintList r7 = r6.RatingCompat
                if (r7 == 0) goto L_0x0501
                o.setSupportImageTintList r7 = r6.RatingCompat
                o.setCheckMarkDrawable r7 = r7.MediaBrowserCompat$ItemReceiver
                goto L_0x0522
            L_0x0501:
                r7 = r25
                goto L_0x0522
            L_0x0504:
                o.setSupportImageTintList[] r6 = r0.setContentView
                r6 = r6[r4]
                o.setSupportImageTintList r6 = r6.RatingCompat
                if (r6 == 0) goto L_0x0511
                o.setCheckMarkDrawable r7 = r6.MediaBrowserCompat$ItemReceiver
                r18 = r6
                goto L_0x0515
            L_0x0511:
                r18 = r6
                r7 = r25
            L_0x0515:
                o.setSupportImageTintList[] r6 = r0.setContentView
                r6 = r6[r4]
                o.setCheckMarkDrawable r6 = r6.MediaBrowserCompat$ItemReceiver
                r39 = r7
                r7 = r6
                r6 = r18
                r18 = r39
            L_0x0522:
                if (r6 == 0) goto L_0x0529
                int r6 = r6.read()
                int r5 = r5 + r6
            L_0x0529:
                r23 = r5
                if (r9 == 0) goto L_0x0536
                o.setSupportImageTintList[] r5 = r9.setContentView
                r4 = r5[r4]
                int r4 = r4.read()
                int r1 = r1 + r4
            L_0x0536:
                r4 = r1
                if (r21 == 0) goto L_0x053c
                r24 = r17
                goto L_0x053e
            L_0x053c:
                r24 = r19
            L_0x053e:
                if (r2 == 0) goto L_0x0558
                if (r3 == 0) goto L_0x0558
                if (r18 == 0) goto L_0x0558
                if (r7 == 0) goto L_0x0558
                r5 = 1056964608(0x3f000000, float:0.5)
                r1 = r41
                r6 = r18
                r18 = r8
                r8 = r23
                r23 = r9
                r9 = r24
                r1.write(r2, r3, r4, r5, r6, r7, r8, r9)
                goto L_0x055c
            L_0x0558:
                r18 = r8
                r23 = r9
            L_0x055c:
                r4 = r18
                goto L_0x0562
            L_0x055f:
                r23 = r9
                r4 = r1
            L_0x0562:
                int r1 = r0.setTitleOptional
                r2 = 8
                if (r1 != r2) goto L_0x056b
                r9 = r23
                goto L_0x056c
            L_0x056b:
                r9 = r0
            L_0x056c:
                r0 = r4
                goto L_0x04b5
            L_0x056f:
                o.setSupportImageTintList[] r0 = r15.setContentView
                r0 = r0[r14]
                r1 = r37
                o.setSupportImageTintList[] r1 = r1.setContentView
                r1 = r1[r14]
                o.setSupportImageTintList r1 = r1.RatingCompat
                o.setSupportImageTintList[] r2 = r13.setContentView
                int r8 = r14 + 1
                r9 = r2[r8]
                o.setSupportImageTintList[] r2 = r12.setContentView
                r2 = r2[r8]
                o.setSupportImageTintList r8 = r2.RatingCompat
                if (r1 == 0) goto L_0x05be
                if (r15 == r13) goto L_0x059a
                o.setCheckMarkDrawable r2 = r0.MediaBrowserCompat$ItemReceiver
                o.setCheckMarkDrawable r1 = r1.MediaBrowserCompat$ItemReceiver
                int r0 = r0.read()
                r3 = 5
                r10.write(r2, r1, r0, r3)
                r1 = r8
                r0 = r9
                goto L_0x05c0
            L_0x059a:
                if (r8 == 0) goto L_0x05be
                o.setCheckMarkDrawable r2 = r0.MediaBrowserCompat$ItemReceiver
                o.setCheckMarkDrawable r3 = r1.MediaBrowserCompat$ItemReceiver
                int r4 = r0.read()
                o.setCheckMarkDrawable r6 = r9.MediaBrowserCompat$ItemReceiver
                o.setCheckMarkDrawable r7 = r8.MediaBrowserCompat$ItemReceiver
                int r0 = r9.read()
                r5 = 1056964608(0x3f000000, float:0.5)
                r17 = 5
                r1 = r41
                r38 = r8
                r8 = r0
                r0 = r9
                r9 = r17
                r1.write(r2, r3, r4, r5, r6, r7, r8, r9)
                r1 = r38
                goto L_0x05c0
            L_0x05be:
                r0 = r9
                r1 = r8
            L_0x05c0:
                if (r1 == 0) goto L_0x05d1
                if (r15 == r13) goto L_0x05d1
                o.setCheckMarkDrawable r2 = r0.MediaBrowserCompat$ItemReceiver
                o.setCheckMarkDrawable r1 = r1.MediaBrowserCompat$ItemReceiver
                int r0 = r0.read()
                int r0 = -r0
                r3 = 5
                r10.write(r2, r1, r0, r3)
            L_0x05d1:
                if (r27 != 0) goto L_0x05d5
                if (r22 == 0) goto L_0x0636
            L_0x05d5:
                if (r15 == 0) goto L_0x0636
                o.setSupportImageTintList[] r0 = r15.setContentView
                r0 = r0[r14]
                o.setSupportImageTintList[] r1 = r13.setContentView
                int r8 = r14 + 1
                r1 = r1[r8]
                o.setSupportImageTintList r2 = r0.RatingCompat
                if (r2 == 0) goto L_0x05eb
                o.setSupportImageTintList r2 = r0.RatingCompat
                o.setCheckMarkDrawable r2 = r2.MediaBrowserCompat$ItemReceiver
                r3 = r2
                goto L_0x05ed
            L_0x05eb:
                r3 = r25
            L_0x05ed:
                o.setSupportImageTintList r2 = r1.RatingCompat
                if (r2 == 0) goto L_0x05f6
                o.setSupportImageTintList r2 = r1.RatingCompat
                o.setCheckMarkDrawable r2 = r2.MediaBrowserCompat$ItemReceiver
                goto L_0x05f8
            L_0x05f6:
                r2 = r25
            L_0x05f8:
                if (r12 == r13) goto L_0x060a
                o.setSupportImageTintList[] r2 = r12.setContentView
                r2 = r2[r8]
                o.setSupportImageTintList r4 = r2.RatingCompat
                if (r4 == 0) goto L_0x0607
                o.setSupportImageTintList r2 = r2.RatingCompat
                o.setCheckMarkDrawable r2 = r2.MediaBrowserCompat$ItemReceiver
                goto L_0x060a
            L_0x0607:
                r6 = r25
                goto L_0x060b
            L_0x060a:
                r6 = r2
            L_0x060b:
                if (r15 != r13) goto L_0x0615
                o.setSupportImageTintList[] r0 = r15.setContentView
                r0 = r0[r14]
                o.setSupportImageTintList[] r1 = r15.setContentView
                r1 = r1[r8]
            L_0x0615:
                if (r3 == 0) goto L_0x0636
                if (r6 == 0) goto L_0x0636
                int r4 = r0.read()
                if (r13 != 0) goto L_0x0621
                r5 = r12
                goto L_0x0622
            L_0x0621:
                r5 = r13
            L_0x0622:
                o.setSupportImageTintList[] r2 = r5.setContentView
                r2 = r2[r8]
                int r8 = r2.read()
                o.setCheckMarkDrawable r2 = r0.MediaBrowserCompat$ItemReceiver
                r5 = 1056964608(0x3f000000, float:0.5)
                o.setCheckMarkDrawable r7 = r1.MediaBrowserCompat$ItemReceiver
                r9 = 5
                r1 = r41
                r1.write(r2, r3, r4, r5, r6, r7, r8, r9)
            L_0x0636:
                int r9 = r20 + 1
                r0 = r40
                r8 = r14
                r15 = r28
                r14 = r29
                goto L_0x0018
            L_0x0641:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.read.read(o.setImageDrawable, o.AppCompatCheckedTextView, int):void");
        }

        public static getSubElementOffsetBytes MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream) throws JpegProcessingException, IOException {
            if (inputStream.markSupported()) {
                inputStream.mark(512);
                byte[] bArr = new byte[512];
                int read2 = inputStream.read(bArr);
                if (read2 != -1) {
                    inputStream.reset();
                    int i = 0;
                    while (true) {
                        if (i >= read2 - 2) {
                            break;
                        } else if (bArr[i] == -1 && bArr[i + 1] == -40 && bArr[i + 2] == -1) {
                            long j = (long) i;
                            if (inputStream.skip(j) != j) {
                                throw new IOException("Skipping stream bytes failed");
                            }
                        } else {
                            i++;
                        }
                    }
                    return setHasFixedSize.MediaBrowserCompat$ItemReceiver(inputStream);
                }
                throw new IOException("Stream is empty");
            }
            throw new IOException("Stream must support mark/reset");
        }

        public static void MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet, int i, int i2) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, nAllocationSetSurface$MediaSessionCompat$Token.ThemeEnforcement, i, i2);
            boolean z = obtainStyledAttributes.getBoolean(nAllocationSetSurface$MediaSessionCompat$Token.ThemeEnforcement_enforceMaterialTheme, false);
            obtainStyledAttributes.recycle();
            if (z) {
                MediaBrowserCompat$ItemReceiver(context, write, "Theme.MaterialComponents");
            }
            MediaBrowserCompat$ItemReceiver(context, MediaBrowserCompat$ItemReceiver, "Theme.AppCompat");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
            if (r0.getResourceId(p040o.nAllocationSetSurface$MediaSessionCompat$Token.ThemeEnforcement_android_textAppearance, -1) != -1) goto L_0x003d;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static void read(android.content.Context r5, android.util.AttributeSet r6, int[] r7, int r8, int r9, int... r10) {
            /*
                int[] r0 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.ThemeEnforcement
                android.content.res.TypedArray r0 = r5.obtainStyledAttributes(r6, r0, r8, r9)
                int r1 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.ThemeEnforcement_enforceTextAppearance
                r2 = 0
                boolean r1 = r0.getBoolean(r1, r2)
                if (r1 != 0) goto L_0x0013
                r0.recycle()
                return
            L_0x0013:
                r1 = 1
                r3 = -1
                if (r10 == 0) goto L_0x0035
                int r4 = r10.length
                if (r4 == 0) goto L_0x0035
                android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r7, r8, r9)
                int r6 = r10.length
                r7 = r2
            L_0x0020:
                if (r7 >= r6) goto L_0x0031
                r8 = r10[r7]
                int r8 = r5.getResourceId(r8, r3)
                if (r8 != r3) goto L_0x002e
                r5.recycle()
                goto L_0x003e
            L_0x002e:
                int r7 = r7 + 1
                goto L_0x0020
            L_0x0031:
                r5.recycle()
                goto L_0x003d
            L_0x0035:
                int r5 = p040o.nAllocationSetSurface$MediaSessionCompat$Token.ThemeEnforcement_android_textAppearance
                int r5 = r0.getResourceId(r5, r3)
                if (r5 == r3) goto L_0x003e
            L_0x003d:
                r2 = r1
            L_0x003e:
                r0.recycle()
                if (r2 == 0) goto L_0x0044
                return
            L_0x0044:
                java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
                java.lang.String r6 = "This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant)."
                r5.<init>(r6)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.read.read(android.content.Context, android.util.AttributeSet, int[], int, int, int[]):void");
        }

        public static void MediaBrowserCompat$ItemReceiver(Context context, int[] iArr, String str) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
            boolean hasValue = obtainStyledAttributes.hasValue(0);
            obtainStyledAttributes.recycle();
            if (!hasValue) {
                StringBuilder sb = new StringBuilder();
                sb.append("The style on this component requires your app theme to be ");
                sb.append(str);
                sb.append(" (or a descendant).");
                throw new IllegalArgumentException(sb.toString());
            }
        }

        public static TypedArray MediaBrowserCompat$ItemReceiver(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
            MediaBrowserCompat$ItemReceiver(context, attributeSet, i, i2);
            read(context, attributeSet, iArr, i, i2, iArr2);
            return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        }

        public static MediaDescriptionCompat IconCompatParcelizer(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
            MediaBrowserCompat$ItemReceiver(context, attributeSet, i, i2);
            read(context, attributeSet, iArr, i, i2, iArr2);
            return new MediaDescriptionCompat(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
        }

        public static setHint write(endObject endobject) {
            onGetStartedClick.write((Object) endobject, "$this$toDomain");
            Integer num = endobject.read;
            if (num != null) {
                int intValue = num.intValue();
                String str = endobject.IconCompatParcelizer;
                if (str != null) {
                    String str2 = endobject.write;
                    if (str2 != null) {
                        String str3 = endobject.MediaBrowserCompat$CustomActionResultReceiver;
                        if (str3 != null) {
                            skipValue skipvalue = endobject.MediaBrowserCompat$ItemReceiver;
                            if (skipvalue != null) {
                                return new setHint(intValue, str, (String) null, str2, str3, (String) null, read(skipvalue), 36);
                            }
                            throw new EntityMappingException("Some mandatory is missing.");
                        }
                        throw new EntityMappingException("Some mandatory is missing.");
                    }
                    throw new EntityMappingException("Some mandatory is missing.");
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }

        public static setHint MediaBrowserCompat$CustomActionResultReceiver(nextInt nextint) {
            onGetStartedClick.write((Object) nextint, "$this$toDomain");
            Integer num = nextint.IconCompatParcelizer;
            if (num != null) {
                int intValue = num.intValue();
                String str = nextint.read;
                if (str != null) {
                    String str2 = nextint.write;
                    if (str2 != null) {
                        skipValue skipvalue = nextint.MediaBrowserCompat$CustomActionResultReceiver;
                        if (skipvalue != null) {
                            return new setHint(intValue, str, str2, (String) null, (String) null, (String) null, read(skipvalue), 56);
                        }
                        throw new EntityMappingException("Some mandatory is missing.");
                    }
                    throw new EntityMappingException("Some mandatory is missing.");
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }

        private static PlacePicker.IntentBuilder read(skipValue skipvalue) {
            onGetStartedClick.write((Object) skipvalue, "$this$toDomain");
            String str = skipvalue.IconCompatParcelizer;
            if (str != null) {
                String str2 = skipvalue.MediaBrowserCompat$CustomActionResultReceiver;
                if (str2 != null) {
                    return new PlacePicker.IntentBuilder(str, str2);
                }
                throw new EntityMappingException("Some mandatory is missing.");
            }
            throw new EntityMappingException("Some mandatory is missing.");
        }

        public static String IconCompatParcelizer(String str) {
            double d;
            if (str != null) {
                try {
                    CharSequence charSequence = str;
                    onGetStartedClick.write((Object) charSequence, "$this$contains");
                    if (GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(charSequence, '.', 0, false) >= 0) {
                        List<String> read2 = GoodToKnowActivity.read((CharSequence) str, new char[]{'.'}, false, 0);
                        String str2 = read2.get(0);
                        Double valueOf = Double.valueOf((double) Integer.parseInt(str2));
                        if (valueOf != null) {
                            d = valueOf.doubleValue();
                        } else {
                            d = 0.0d;
                        }
                        NumberFormat currencyInstance = NumberFormat.getCurrencyInstance(Locale.ENGLISH);
                        currencyInstance.setMinimumFractionDigits(0);
                        currencyInstance.setMaximumFractionDigits(0);
                        String format = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(currencyInstance).format(d);
                        onGetStartedClick.IconCompatParcelizer((Object) format, "Utilities.currencyNumber…onDigits(0).format(value)");
                        String str3 = read2.get(1);
                        if ((true ^ GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(format, '-', false)) && GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str2, '-', false)) {
                            StringBuilder sb = new StringBuilder();
                            sb.append('-');
                            sb.append(format);
                            sb.append('.');
                            sb.append(str3);
                            return sb.toString();
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(format);
                        sb2.append('.');
                        sb2.append(str3);
                        return sb2.toString();
                    }
                } catch (NumberFormatException e) {
                    onCheckBoxClick.write(e, "formatDoubleString error", new Object[0]);
                }
            }
            return str;
        }

        public static String read(String str, String str2) {
            onGetStartedClick.write((Object) str2, "defaultValue");
            CharSequence charSequence = str;
            if (charSequence == null || GoodToKnowActivity.read(charSequence)) {
                return str2;
            }
            if (str != null) {
                return str;
            }
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
            return str;
        }

        public static boolean write(String str) {
            CharSequence charSequence = str;
            return !(charSequence == null || GoodToKnowActivity.read(charSequence));
        }

        public static boolean MediaBrowserCompat$ItemReceiver(String str) {
            if (str == null) {
                return true;
            }
            return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString().length() == 0;
        }

        public static String MediaBrowserCompat$CustomActionResultReceiver(String str) {
            if (str == null) {
                return null;
            }
            return new LifestyleCustomizationActivity("\\s+").read(str, "");
        }

        public static String read(String str) {
            if (str == null) {
                return null;
            }
            if (str != null) {
                return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str).toString();
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
        }

        public static /* synthetic */ Uri read(setCrashlyticsOriginEventListener setcrashlyticsorigineventlistener, boolean z, List list, Context context, boolean z2, int i, boolean z3) throws Exception {
            Uri uri;
            setCrashlyticsOriginEventListener setcrashlyticsorigineventlistener2 = setcrashlyticsorigineventlistener;
            Context context2 = context;
            String obj = UUID.randomUUID().toString();
            StringBuilder sb = new StringBuilder();
            String str = setcrashlyticsorigineventlistener2.read;
            onGetStartedClick.write((Object) obj, "defaultValue");
            if (str == null) {
                str = obj;
            }
            sb.append(str);
            if (z) {
                sb.append("_");
                sb.append(obj);
            }
            String format = String.format("lending_%s.jpg", new Object[]{sb.toString()});
            Bitmap bitmap = null;
            try {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                View inflate = LayoutInflater.from(context).inflate(R.layout.f91362131494363, linearLayout, false);
                if (z2) {
                    inflate.findViewById(R.id.end_slip).setVisibility(0);
                    inflate.findViewById(R.id.root_layout).setBackground(setLastBaselineToBottomHeight.write(context, R.drawable.slip_bg));
                } else {
                    inflate.findViewById(R.id.root_layout).setBackgroundColor(setLastBaselineToBottomHeight.read(context, R.color.f71012131100257));
                }
                if (setcrashlyticsorigineventlistener2.write != null) {
                    TextView textView = (TextView) inflate.findViewById(R.id.text_reference_id);
                    textView.setVisibility(0);
                    textView.setText(setcrashlyticsorigineventlistener2.write);
                }
                if (setcrashlyticsorigineventlistener2.MediaBrowserCompat$ItemReceiver != null) {
                    TextView textView2 = (TextView) inflate.findViewById(R.id.text_loan_app_id);
                    textView2.setVisibility(0);
                    textView2.setText(setcrashlyticsorigineventlistener2.MediaBrowserCompat$ItemReceiver);
                }
                new EasycashScreenShotFragment().write(list, setcrashlyticsorigineventlistener, inflate, context, z2, i);
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                bitmap = AlertController$RecycleListView.IconCompatParcelizer(inflate, displayMetrics.widthPixels, displayMetrics.widthPixels << 2);
                if (z3) {
                    uri = AlertController$RecycleListView.read(bitmap, format, context);
                } else {
                    uri = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bitmap, context, "screen_image.jpg");
                }
                return uri;
            } finally {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
        }

        public static DebitCardResetOtpActivity<Uri> read(List<dropBreadcrumb> list, setCrashlyticsOriginEventListener setcrashlyticsorigineventlistener, Context context, boolean z, boolean z2, int i, boolean z3) {
            return DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDiscoverTopFundListFragment(setcrashlyticsorigineventlistener, z3, list, context, z2, i, z)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer());
        }

        public static Object read(boolean z, FundFactSheetActivity<? super C1192xa602430c, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity, HmlNTBPromptPayNotFoundActivity<? super FragmentBuilder_BindHmlNtbOutcomeApproveFragment> hmlNTBPromptPayNotFoundActivity) {
            MailingAddressReviewActivity mailingAddressReviewActivity = new MailingAddressReviewActivity(HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity), 1);
            onGetStartedClick.write((Object) fundFactSheetActivity, "initializer");
            C1192xa602430c fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver = new C1192xa602430c();
            fundFactSheetActivity.invoke(fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver);
            FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindHmlNTBSummaryFragment(fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver, fragmentBuilder_BindHmlNTBSummaryFragment$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver, (byte) 0)).read(new FragmentBuilder_BindHmlNTBPersonalInfoFragment(mailingAddressReviewActivity, false));
            Object MediaBrowserCompat$CustomActionResultReceiver2 = mailingAddressReviewActivity.MediaBrowserCompat$CustomActionResultReceiver();
            if (MediaBrowserCompat$CustomActionResultReceiver2 == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
            }
            return MediaBrowserCompat$CustomActionResultReceiver2;
        }

        public static void write(Throwable th) {
            if (th instanceof VirtualMachineError) {
                throw ((VirtualMachineError) th);
            } else if (th instanceof ThreadDeath) {
                throw ((ThreadDeath) th);
            } else if (th instanceof LinkageError) {
                throw ((LinkageError) th);
            }
        }

        public static BankingAgentDeepLinkActivity IconCompatParcelizer(Callable<BankingAgentDeepLinkActivity> callable) {
            try {
                return (BankingAgentDeepLinkActivity) HmlLatestPersonalInformationDeepLinkActivity.write(callable.call(), "Scheduler Callable result can't be null");
            } catch (Throwable th) {
                throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
            }
        }

        public static void read(Throwable th) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            } else {
                boolean z = true;
                if (!(th instanceof OnErrorNotImplementedException) && !(th instanceof MissingBackpressureException) && !(th instanceof IllegalStateException) && !(th instanceof NullPointerException) && !(th instanceof IllegalArgumentException) && !(th instanceof CompositeException)) {
                    z = false;
                }
                if (!z) {
                    th = new UndeliverableException(th);
                }
            }
            th.printStackTrace();
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }

        public static <T> MwCoachMarkActivity_ViewBinding<T> read(MwCasaOtpActivity mwCasaOtpActivity, HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, onDeleteClick ondeleteclick, BaseDiscoverFundFilterActivity<? super MwCasaOtpActivity, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity) {
            MwCoachMarkActivity mwCoachMarkActivity;
            onGetStartedClick.write((Object) mwCasaOtpActivity, "$this$async");
            onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
            onGetStartedClick.write((Object) ondeleteclick, "start");
            onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
            HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver2 = onChoosePhotoClick.MediaBrowserCompat$ItemReceiver(mwCasaOtpActivity, hmlPromptPayVerificationActivity);
            if (ondeleteclick == onDeleteClick.LAZY) {
                mwCoachMarkActivity = new onClearNicknameClick(MediaBrowserCompat$ItemReceiver2, baseDiscoverFundFilterActivity);
            } else {
                mwCoachMarkActivity = new MwCoachMarkActivity(MediaBrowserCompat$ItemReceiver2, true);
            }
            mwCoachMarkActivity.MediaBrowserCompat$ItemReceiver(ondeleteclick, mwCoachMarkActivity, baseDiscoverFundFilterActivity);
            return mwCoachMarkActivity;
        }

        public static clickManagePin MediaBrowserCompat$ItemReceiver(MwCasaOtpActivity mwCasaOtpActivity, HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, onDeleteClick ondeleteclick, BaseDiscoverFundFilterActivity<? super MwCasaOtpActivity, ? super HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, ? extends Object> baseDiscoverFundFilterActivity) {
            cancelClick cancelclick;
            onGetStartedClick.write((Object) mwCasaOtpActivity, "$this$launch");
            onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
            onGetStartedClick.write((Object) ondeleteclick, "start");
            onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
            HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver2 = onChoosePhotoClick.MediaBrowserCompat$ItemReceiver(mwCasaOtpActivity, hmlPromptPayVerificationActivity);
            if (ondeleteclick == onDeleteClick.LAZY) {
                cancelclick = new onCreateNicknameClick(MediaBrowserCompat$ItemReceiver2, baseDiscoverFundFilterActivity);
            } else {
                cancelclick = new cancelClick(MediaBrowserCompat$ItemReceiver2, true);
            }
            cancelclick.MediaBrowserCompat$ItemReceiver(ondeleteclick, cancelclick, baseDiscoverFundFilterActivity);
            return cancelclick;
        }

        /* JADX INFO: finally extract failed */
        public static <T> Object write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, BaseDiscoverFundFilterActivity<? super MwCasaOtpActivity, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
            Object obj;
            boolean z;
            HmlPromptPayVerificationActivity context = hmlNTBPromptPayNotFoundActivity.getContext();
            HmlPromptPayVerificationActivity MediaBrowserCompat$ItemReceiver2 = context.MediaBrowserCompat$ItemReceiver(hmlPromptPayVerificationActivity);
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
            if (MediaBrowserCompat$ItemReceiver2 == context) {
                BaseNtbInstructionActivity_ViewBinding baseNtbInstructionActivity_ViewBinding = new BaseNtbInstructionActivity_ViewBinding(MediaBrowserCompat$ItemReceiver2, hmlNTBPromptPayNotFoundActivity);
                obj = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(baseNtbInstructionActivity_ViewBinding, baseNtbInstructionActivity_ViewBinding, baseDiscoverFundFilterActivity);
            } else if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) (HmlNTBPromptPayNotFoundActivity_ViewBinding) MediaBrowserCompat$ItemReceiver2.IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity_ViewBinding.write), (Object) (HmlNTBPromptPayNotFoundActivity_ViewBinding) context.IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity_ViewBinding.write))) {
                editPinLocation editpinlocation = new editPinLocation(MediaBrowserCompat$ItemReceiver2, hmlNTBPromptPayNotFoundActivity);
                Object MediaBrowserCompat$ItemReceiver3 = EkycSuccessActivity.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver2, (Object) null);
                try {
                    Object MediaBrowserCompat$ItemReceiver4 = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(editpinlocation, editpinlocation, baseDiscoverFundFilterActivity);
                    EkycSuccessActivity.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3);
                    obj = MediaBrowserCompat$ItemReceiver4;
                } catch (Throwable th) {
                    EkycSuccessActivity.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver2, MediaBrowserCompat$ItemReceiver3);
                    throw th;
                }
            } else {
                onShareButtonClick onsharebuttonclick = new onShareButtonClick(MediaBrowserCompat$ItemReceiver2, hmlNTBPromptPayNotFoundActivity);
                onsharebuttonclick.MediaBrowserCompat$CustomActionResultReceiver((clickManagePin) onsharebuttonclick.IconCompatParcelizer.IconCompatParcelizer(clickManagePin.write));
                AlertController$RecycleListView.IconCompatParcelizer(baseDiscoverFundFilterActivity, onsharebuttonclick, onsharebuttonclick);
                while (true) {
                    int i = onsharebuttonclick._decision;
                    z = true;
                    if (i == 0) {
                        if (onShareButtonClick.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(onsharebuttonclick, 0, 1)) {
                            break;
                        }
                    } else if (i == 2) {
                        z = false;
                    } else {
                        throw new IllegalStateException("Already suspended".toString());
                    }
                }
                if (z) {
                    obj = HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
                } else {
                    obj = MwOnBoardSuccessActivity.read(onsharebuttonclick.MediaSessionCompat$ResultReceiverWrapper());
                    if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
                        throw ((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer;
                    }
                }
            }
            if (obj == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "frame");
            }
            return obj;
        }

        public static MwCurrentUserEwalletActivity read(clickManagePin clickmanagepin, MwCurrentUserEwalletActivity mwCurrentUserEwalletActivity) {
            onGetStartedClick.write((Object) clickmanagepin, "$this$disposeOnCompletion");
            onGetStartedClick.write((Object) mwCurrentUserEwalletActivity, "handle");
            return clickmanagepin.write(new onAddWalletClick(clickmanagepin, mwCurrentUserEwalletActivity));
        }

        public static long MediaBrowserCompat$ItemReceiver(String str, long j, long j2, long j3) {
            onGetStartedClick.write((Object) str, "propertyName");
            String IconCompatParcelizer = EkycSuccessActivity_ViewBinding.IconCompatParcelizer(str);
            if (IconCompatParcelizer == null) {
                return j;
            }
            onGetStartedClick.write((Object) IconCompatParcelizer, "$this$toLongOrNull");
            Long MediaBrowserCompat$MediaItem = GoodToKnowActivity.MediaBrowserCompat$MediaItem(IconCompatParcelizer);
            if (MediaBrowserCompat$MediaItem != null) {
                long longValue = MediaBrowserCompat$MediaItem.longValue();
                if (j2 <= longValue && j3 >= longValue) {
                    return longValue;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("System property '");
                sb.append(str);
                sb.append("' should be in range ");
                sb.append(j2);
                sb.append("..");
                sb.append(j3);
                sb.append(", but is '");
                sb.append(longValue);
                sb.append('\'');
                throw new IllegalStateException(sb.toString().toString());
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("System property '");
            sb2.append(str);
            sb2.append("' has unrecognized value '");
            sb2.append(IconCompatParcelizer);
            sb2.append('\'');
            throw new IllegalStateException(sb2.toString().toString());
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        LongSparseArray longSparseArray;
        if (!MediaSessionCompat$QueueItem) {
            try {
                MediaSessionCompat$ResultReceiverWrapper = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e);
            }
            MediaSessionCompat$QueueItem = true;
        }
        Class cls = MediaSessionCompat$ResultReceiverWrapper;
        if (cls != null) {
            if (!MediaSessionCompat$Token) {
                try {
                    Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                    f2529x50fd9e4a = declaredField;
                    declaredField.setAccessible(true);
                } catch (NoSuchFieldException e2) {
                    Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e2);
                }
                MediaSessionCompat$Token = true;
            }
            Field field = f2529x50fd9e4a;
            if (field != null) {
                try {
                    longSparseArray = (LongSparseArray) field.get(obj);
                } catch (IllegalAccessException e3) {
                    Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e3);
                    longSparseArray = null;
                }
                if (longSparseArray != null) {
                    longSparseArray.clear();
                }
            }
        }
    }

    public final void IconCompatParcelizer(long j, double d, double d2) {
        float f = ((float) (j - 946728000000L)) / 8.64E7f;
        float f2 = (0.01720197f * f) + 6.24006f;
        double d3 = (double) f2;
        double sin = (Math.sin(d3) * 0.03341960161924362d) + d3 + (Math.sin((double) (2.0f * f2)) * 3.4906598739326E-4d) + (Math.sin((double) (f2 * 3.0f)) * 5.236000106378924E-6d) + 1.796593063d + 3.141592653589793d;
        double d4 = (-d2) / 360.0d;
        double round = ((double) (((float) Math.round(((double) (f - 9.0E-4f)) - d4)) + 9.0E-4f)) + d4 + (Math.sin(d3) * 0.0053d) + (Math.sin(2.0d * sin) * -0.0069d);
        double asin = Math.asin(Math.sin(sin) * Math.sin(0.4092797040939331d));
        double d5 = 0.01745329238474369d * d;
        double sin2 = (Math.sin(-0.10471975803375244d) - (Math.sin(d5) * Math.sin(asin))) / (Math.cos(d5) * Math.cos(asin));
        if (sin2 >= 1.0d) {
            this.RatingCompat = 1;
            this.MediaDescriptionCompat = -1;
            this.MediaBrowserCompat$SearchResultReceiver = -1;
        } else if (sin2 <= -1.0d) {
            this.RatingCompat = 0;
            this.MediaDescriptionCompat = -1;
            this.MediaBrowserCompat$SearchResultReceiver = -1;
        } else {
            double acos = (double) ((float) (Math.acos(sin2) / 6.283185307179586d));
            this.MediaDescriptionCompat = Math.round((round + acos) * 8.64E7d) + 946728000000L;
            long round2 = Math.round((round - acos) * 8.64E7d) + 946728000000L;
            this.MediaBrowserCompat$SearchResultReceiver = round2;
            if (round2 >= j || this.MediaDescriptionCompat <= j) {
                this.RatingCompat = 1;
            } else {
                this.RatingCompat = 0;
            }
        }
    }

    public static void write(setImageDrawable setimagedrawable) {
        int i;
        int i2 = 0;
        if ((setimagedrawable.setMenuPrepared & 32) != 32) {
            setimagedrawable.setWindowTitle.clear();
            setimagedrawable.setWindowTitle.add(0, new setExpandActivityOverflowButtonContentDescription.C14841(setimagedrawable.setExpandedActionViewsExclusive, (byte) 0));
            return;
        }
        setimagedrawable.setOverlayMode = true;
        setimagedrawable.write = false;
        setimagedrawable.setShowingForActionMode = false;
        setimagedrawable.setWindowCallback = false;
        ArrayList<setImageResource> arrayList = setimagedrawable.setExpandedActionViewsExclusive;
        List<setExpandActivityOverflowButtonContentDescription.C14841> list = setimagedrawable.setWindowTitle;
        boolean z = setimagedrawable.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.WRAP_CONTENT;
        boolean z2 = setimagedrawable.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.WRAP_CONTENT;
        boolean z3 = z || z2;
        list.clear();
        for (setImageResource next : arrayList) {
            next.MediaDescriptionCompat = null;
            next.PlaybackStateCompat$CustomAction = false;
            next.read();
        }
        for (setImageResource next2 : arrayList) {
            if (next2.MediaDescriptionCompat == null) {
                setExpandActivityOverflowButtonContentDescription.C14841 r8 = new setExpandActivityOverflowButtonContentDescription.C14841(new ArrayList());
                list.add(r8);
                if (!IconCompatParcelizer(next2, r8, list, z3)) {
                    setimagedrawable.setWindowTitle.clear();
                    setimagedrawable.setWindowTitle.add(0, new setExpandActivityOverflowButtonContentDescription.C14841(setimagedrawable.setExpandedActionViewsExclusive, (byte) 0));
                    setimagedrawable.setOverlayMode = false;
                    return;
                }
            }
        }
        int i3 = 0;
        int i4 = 0;
        for (setExpandActivityOverflowButtonContentDescription.C14841 next3 : list) {
            i3 = Math.max(i3, MediaBrowserCompat$CustomActionResultReceiver(next3, 0));
            i4 = Math.max(i4, MediaBrowserCompat$CustomActionResultReceiver(next3, 1));
        }
        if (z) {
            setimagedrawable.IconCompatParcelizer(setImageResource.read.FIXED);
            setimagedrawable.IconCompatParcelizer(i3);
            setimagedrawable.write = true;
            setimagedrawable.setShowingForActionMode = true;
            setimagedrawable.setOnMenuItemClickListener = i3;
        }
        if (z2) {
            setimagedrawable.MediaBrowserCompat$ItemReceiver(setImageResource.read.FIXED);
            setimagedrawable.MediaBrowserCompat$CustomActionResultReceiver(i4);
            setimagedrawable.write = true;
            setimagedrawable.setWindowCallback = true;
            setimagedrawable.ActionMenuPresenter$OverflowMenuButton = i4;
        }
        if (setimagedrawable.setTitleOptional == 8) {
            i = 0;
        } else {
            i = setimagedrawable.ActionBarContextView;
        }
        write(list, 0, i);
        if (setimagedrawable.setTitleOptional != 8) {
            i2 = setimagedrawable.PlaybackStateCompat;
        }
        write(list, 1, i2);
    }

    private static int MediaBrowserCompat$CustomActionResultReceiver(setExpandActivityOverflowButtonContentDescription.C14841 r10, int i) {
        List<setImageResource> list;
        int i2 = i << 1;
        if (i == 0) {
            list = r10.MediaBrowserCompat$CustomActionResultReceiver;
        } else if (i == 1) {
            list = r10.read;
        } else {
            list = null;
        }
        int size = list.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            setImageResource setimageresource = list.get(i4);
            int i5 = i2 + 1;
            i3 = Math.max(i3, MediaBrowserCompat$CustomActionResultReceiver(setimageresource, i, setimageresource.setContentView[i5].RatingCompat == null || !(setimageresource.setContentView[i2].RatingCompat == null || setimageresource.setContentView[i5].RatingCompat == null), 0));
        }
        r10.IconCompatParcelizer[i] = i3;
        return i3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01c7  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0093 A[LOOP:0: B:39:0x008d->B:41:0x0093, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00be A[LOOP:1: B:43:0x00b8->B:45:0x00be, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0177  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01a4  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01aa  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int MediaBrowserCompat$CustomActionResultReceiver(p040o.setImageResource r20, int r21, boolean r22, int r23) {
        /*
            r0 = r20
            r1 = r21
            r2 = r22
            boolean r3 = r0.setGroupDividerEnabled
            r4 = 0
            if (r3 != 0) goto L_0x000c
            return r4
        L_0x000c:
            o.setSupportImageTintList r3 = r0.read
            o.setSupportImageTintList r3 = r3.RatingCompat
            r5 = 1
            if (r3 == 0) goto L_0x0017
            if (r1 != r5) goto L_0x0017
            r3 = r5
            goto L_0x0018
        L_0x0017:
            r3 = r4
        L_0x0018:
            r6 = 8
            if (r2 == 0) goto L_0x002e
            int r7 = r0.MediaBrowserCompat$ItemReceiver
            int r8 = r0.setTitleOptional
            if (r8 != r6) goto L_0x0024
            r8 = r4
            goto L_0x0026
        L_0x0024:
            int r8 = r0.PlaybackStateCompat
        L_0x0026:
            int r9 = r0.MediaBrowserCompat$ItemReceiver
            int r8 = r8 - r9
            int r9 = r1 << 1
            int r10 = r9 + 1
            goto L_0x003f
        L_0x002e:
            int r7 = r0.setTitleOptional
            if (r7 != r6) goto L_0x0034
            r7 = r4
            goto L_0x0036
        L_0x0034:
            int r7 = r0.PlaybackStateCompat
        L_0x0036:
            int r8 = r0.MediaBrowserCompat$ItemReceiver
            int r7 = r7 - r8
            int r8 = r0.MediaBrowserCompat$ItemReceiver
            int r10 = r1 << 1
            int r9 = r10 + 1
        L_0x003f:
            o.setSupportImageTintList[] r11 = r0.setContentView
            r11 = r11[r10]
            o.setSupportImageTintList r11 = r11.RatingCompat
            if (r11 == 0) goto L_0x0056
            o.setSupportImageTintList[] r11 = r0.setContentView
            r11 = r11[r9]
            o.setSupportImageTintList r11 = r11.RatingCompat
            if (r11 != 0) goto L_0x0056
            r11 = -1
            r19 = r10
            r10 = r9
            r9 = r19
            goto L_0x0057
        L_0x0056:
            r11 = r5
        L_0x0057:
            if (r3 == 0) goto L_0x005c
            int r13 = r23 - r7
            goto L_0x005e
        L_0x005c:
            r13 = r23
        L_0x005e:
            o.setSupportImageTintList[] r14 = r0.setContentView
            r14 = r14[r9]
            int r14 = r14.read()
            int r14 = r14 * r11
            int r15 = IconCompatParcelizer((p040o.setImageResource) r20, (int) r21)
            int r14 = r14 + r15
            int r13 = r13 + r14
            if (r1 != 0) goto L_0x0078
            int r15 = r0.setTitleOptional
            if (r15 != r6) goto L_0x0075
        L_0x0073:
            r15 = r4
            goto L_0x007f
        L_0x0075:
            int r15 = r0.ActionBarContextView
            goto L_0x007f
        L_0x0078:
            int r15 = r0.setTitleOptional
            if (r15 != r6) goto L_0x007d
            goto L_0x0073
        L_0x007d:
            int r15 = r0.PlaybackStateCompat
        L_0x007f:
            int r15 = r15 * r11
            o.setSupportImageTintList[] r4 = r0.setContentView
            r4 = r4[r9]
            o.AppCompatImageView r4 = r4.write
            java.util.HashSet<o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> r4 = r4.write
            java.util.Iterator r4 = r4.iterator()
            r12 = 0
        L_0x008d:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x00ab
            java.lang.Object r16 = r4.next()
            o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver r16 = (p040o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver) r16
            r5 = r16
            o.AppCompatImageView r5 = (p040o.AppCompatImageView) r5
            o.setSupportImageTintList r5 = r5.MediaBrowserCompat$CustomActionResultReceiver
            o.setImageResource r5 = r5.IconCompatParcelizer
            int r5 = MediaBrowserCompat$CustomActionResultReceiver((p040o.setImageResource) r5, (int) r1, (boolean) r2, (int) r13)
            int r12 = java.lang.Math.max(r12, r5)
            r5 = 1
            goto L_0x008d
        L_0x00ab:
            o.setSupportImageTintList[] r4 = r0.setContentView
            r4 = r4[r10]
            o.AppCompatImageView r4 = r4.write
            java.util.HashSet<o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> r4 = r4.write
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
        L_0x00b8:
            boolean r16 = r4.hasNext()
            if (r16 == 0) goto L_0x00dd
            java.lang.Object r16 = r4.next()
            o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver r16 = (p040o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver) r16
            r6 = r16
            o.AppCompatImageView r6 = (p040o.AppCompatImageView) r6
            o.setSupportImageTintList r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.setImageResource r6 = r6.IconCompatParcelizer
            r23 = r4
            int r4 = r15 + r13
            int r4 = MediaBrowserCompat$CustomActionResultReceiver((p040o.setImageResource) r6, (int) r1, (boolean) r2, (int) r4)
            int r5 = java.lang.Math.max(r5, r4)
            r4 = r23
            r6 = 8
            goto L_0x00b8
        L_0x00dd:
            if (r3 == 0) goto L_0x00e3
            int r12 = r12 - r7
            int r5 = r5 + r8
        L_0x00e1:
            r4 = 1
            goto L_0x00fc
        L_0x00e3:
            if (r1 != 0) goto L_0x00f0
            int r4 = r0.setTitleOptional
            r6 = 8
            if (r4 != r6) goto L_0x00ed
        L_0x00eb:
            r4 = 0
            goto L_0x00f9
        L_0x00ed:
            int r4 = r0.ActionBarContextView
            goto L_0x00f9
        L_0x00f0:
            r6 = 8
            int r4 = r0.setTitleOptional
            if (r4 != r6) goto L_0x00f7
            goto L_0x00eb
        L_0x00f7:
            int r4 = r0.PlaybackStateCompat
        L_0x00f9:
            int r4 = r4 * r11
            int r5 = r5 + r4
            goto L_0x00e1
        L_0x00fc:
            if (r1 != r4) goto L_0x0168
            o.setSupportImageTintList r6 = r0.read
            o.AppCompatImageView r6 = r6.write
            java.util.HashSet<o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> r6 = r6.write
            java.util.Iterator r6 = r6.iterator()
            r18 = 0
        L_0x010a:
            boolean r16 = r6.hasNext()
            if (r16 == 0) goto L_0x014b
            java.lang.Object r16 = r6.next()
            o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver r16 = (p040o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver) r16
            r23 = r6
            r6 = r16
            o.AppCompatImageView r6 = (p040o.AppCompatImageView) r6
            if (r11 != r4) goto L_0x0131
            o.setSupportImageTintList r4 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.setImageResource r4 = r4.IconCompatParcelizer
            int r6 = r7 + r13
            int r4 = MediaBrowserCompat$CustomActionResultReceiver((p040o.setImageResource) r4, (int) r1, (boolean) r2, (int) r6)
            r6 = r18
            int r18 = java.lang.Math.max(r6, r4)
            r6 = r23
            goto L_0x0149
        L_0x0131:
            r4 = r18
            o.setSupportImageTintList r6 = r6.MediaBrowserCompat$CustomActionResultReceiver
            o.setImageResource r6 = r6.IconCompatParcelizer
            int r16 = r8 * r11
            r17 = r14
            int r14 = r16 + r13
            int r6 = MediaBrowserCompat$CustomActionResultReceiver((p040o.setImageResource) r6, (int) r1, (boolean) r2, (int) r14)
            int r18 = java.lang.Math.max(r4, r6)
            r6 = r23
            r14 = r17
        L_0x0149:
            r4 = 1
            goto L_0x010a
        L_0x014b:
            r17 = r14
            r4 = r18
            o.setSupportImageTintList r6 = r0.read
            o.AppCompatImageView r6 = r6.write
            java.util.HashSet<o.AppCompatAutoCompleteTextView$MediaBrowserCompat$ItemReceiver> r6 = r6.write
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x016b
            if (r3 != 0) goto L_0x016b
            r3 = 1
            if (r11 != r3) goto L_0x0163
            int r18 = r4 + r7
            goto L_0x0165
        L_0x0163:
            int r18 = r4 - r8
        L_0x0165:
            r4 = r18
            goto L_0x016b
        L_0x0168:
            r17 = r14
            r4 = 0
        L_0x016b:
            int r3 = java.lang.Math.max(r5, r4)
            int r3 = java.lang.Math.max(r12, r3)
            int r15 = r15 + r13
            r4 = -1
            if (r11 != r4) goto L_0x017c
            r19 = r15
            r15 = r13
            r13 = r19
        L_0x017c:
            if (r2 == 0) goto L_0x0186
            p040o.getSupportBackgroundTintMode.read(r0, r1, r13)
            r0.MediaBrowserCompat$CustomActionResultReceiver(r13, r15, r1)
            r4 = 1
            goto L_0x01a2
        L_0x0186:
            o.setExpandActivityOverflowButtonContentDescription$1 r2 = r0.MediaDescriptionCompat
            if (r1 != 0) goto L_0x0191
            java.util.HashSet<o.setImageResource> r2 = r2.MediaDescriptionCompat
            r2.add(r0)
            r4 = 1
            goto L_0x0199
        L_0x0191:
            r4 = 1
            if (r1 != r4) goto L_0x0199
            java.util.HashSet<o.setImageResource> r2 = r2.MediaBrowserCompat$SearchResultReceiver
            r2.add(r0)
        L_0x0199:
            if (r1 != 0) goto L_0x019e
            r0.MenuItemImpl = r13
            goto L_0x01a2
        L_0x019e:
            if (r1 != r4) goto L_0x01a2
            r0.setContentHeight = r13
        L_0x01a2:
            if (r1 != 0) goto L_0x01aa
            o.setImageResource$read[] r2 = r0.AppCompatDelegateImpl$ListMenuDecorView
            r5 = 0
            r2 = r2[r5]
            goto L_0x01b2
        L_0x01aa:
            if (r1 != r4) goto L_0x01b1
            o.setImageResource$read[] r2 = r0.AppCompatDelegateImpl$ListMenuDecorView
            r2 = r2[r4]
            goto L_0x01b2
        L_0x01b1:
            r2 = 0
        L_0x01b2:
            o.setImageResource$read r4 = p040o.setImageResource.read.MATCH_CONSTRAINT
            if (r2 != r4) goto L_0x01cf
            float r2 = r0.f2633x50fd9e4a
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L_0x01cf
            o.setExpandActivityOverflowButtonContentDescription$1 r2 = r0.MediaDescriptionCompat
            if (r1 != 0) goto L_0x01c7
            java.util.HashSet<o.setImageResource> r2 = r2.MediaDescriptionCompat
            r2.add(r0)
            goto L_0x01cf
        L_0x01c7:
            r4 = 1
            if (r1 != r4) goto L_0x01cf
            java.util.HashSet<o.setImageResource> r2 = r2.MediaBrowserCompat$SearchResultReceiver
            r2.add(r0)
        L_0x01cf:
            o.setSupportImageTintList[] r2 = r0.setContentView
            r2 = r2[r9]
            o.setSupportImageTintList r2 = r2.RatingCompat
            if (r2 == 0) goto L_0x0207
            o.setSupportImageTintList[] r2 = r0.setContentView
            r2 = r2[r10]
            o.setSupportImageTintList r2 = r2.RatingCompat
            if (r2 == 0) goto L_0x0207
            o.setImageResource r2 = r0.AbsActionBarView
            o.setSupportImageTintList[] r4 = r0.setContentView
            r4 = r4[r9]
            o.setSupportImageTintList r4 = r4.RatingCompat
            o.setImageResource r4 = r4.IconCompatParcelizer
            if (r4 != r2) goto L_0x0207
            o.setSupportImageTintList[] r4 = r0.setContentView
            r4 = r4[r10]
            o.setSupportImageTintList r4 = r4.RatingCompat
            o.setImageResource r4 = r4.IconCompatParcelizer
            if (r4 != r2) goto L_0x0207
            o.setExpandActivityOverflowButtonContentDescription$1 r2 = r0.MediaDescriptionCompat
            if (r1 != 0) goto L_0x01ff
            java.util.HashSet<o.setImageResource> r1 = r2.MediaDescriptionCompat
            r1.add(r0)
            goto L_0x0207
        L_0x01ff:
            r4 = 1
            if (r1 != r4) goto L_0x0207
            java.util.HashSet<o.setImageResource> r1 = r2.MediaBrowserCompat$SearchResultReceiver
            r1.add(r0)
        L_0x0207:
            int r14 = r17 + r3
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(o.setImageResource, int, boolean, int):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004c A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int IconCompatParcelizer(p040o.setImageResource r7, int r8) {
        /*
            int r0 = r8 << 1
            o.setSupportImageTintList[] r1 = r7.setContentView
            r1 = r1[r0]
            o.setSupportImageTintList[] r2 = r7.setContentView
            r3 = 1
            int r0 = r0 + r3
            r0 = r2[r0]
            o.setSupportImageTintList r2 = r1.RatingCompat
            r4 = 0
            if (r2 == 0) goto L_0x0063
            o.setSupportImageTintList r2 = r1.RatingCompat
            o.setImageResource r2 = r2.IconCompatParcelizer
            o.setImageResource r5 = r7.AbsActionBarView
            if (r2 != r5) goto L_0x0063
            o.setSupportImageTintList r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x0063
            o.setSupportImageTintList r2 = r0.RatingCompat
            o.setImageResource r2 = r2.IconCompatParcelizer
            o.setImageResource r5 = r7.AbsActionBarView
            if (r2 != r5) goto L_0x0063
            o.setImageResource r2 = r7.AbsActionBarView
            r5 = 8
            if (r8 != 0) goto L_0x0032
            int r6 = r2.setTitleOptional
            if (r6 == r5) goto L_0x003b
            int r2 = r2.ActionBarContextView
            goto L_0x003c
        L_0x0032:
            if (r8 != r3) goto L_0x003b
            int r6 = r2.setTitleOptional
            if (r6 == r5) goto L_0x003b
            int r2 = r2.PlaybackStateCompat
            goto L_0x003c
        L_0x003b:
            r2 = r4
        L_0x003c:
            if (r8 != 0) goto L_0x0041
            float r6 = r7.setHasDecor
            goto L_0x0043
        L_0x0041:
            float r6 = r7.setTabContainer
        L_0x0043:
            if (r8 != 0) goto L_0x004c
            int r8 = r7.setTitleOptional
            if (r8 == r5) goto L_0x0054
            int r4 = r7.ActionBarContextView
            goto L_0x0054
        L_0x004c:
            if (r8 != r3) goto L_0x0054
            int r8 = r7.setTitleOptional
            if (r8 == r5) goto L_0x0054
            int r4 = r7.PlaybackStateCompat
        L_0x0054:
            int r7 = r1.read()
            int r2 = r2 - r7
            int r7 = r0.read()
            int r2 = r2 - r7
            int r2 = r2 - r4
            float r7 = (float) r2
            float r7 = r7 * r6
            int r7 = (int) r7
            return r7
        L_0x0063:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.IconCompatParcelizer(o.setImageResource, int):int");
    }

    private static int write(setImageResource setimageresource) {
        float f;
        float f2;
        int i = 0;
        if (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.MATCH_CONSTRAINT) {
            if (setimageresource.MediaSessionCompat$ResultReceiverWrapper == 0) {
                if (setimageresource.setTitleOptional != 8) {
                    i = setimageresource.PlaybackStateCompat;
                }
                f2 = ((float) i) * setimageresource.f2633x50fd9e4a;
            } else {
                if (setimageresource.setTitleOptional != 8) {
                    i = setimageresource.PlaybackStateCompat;
                }
                f2 = ((float) i) / setimageresource.f2633x50fd9e4a;
            }
            int i2 = (int) f2;
            setimageresource.IconCompatParcelizer(i2);
            return i2;
        } else if (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[1] != setImageResource.read.MATCH_CONSTRAINT) {
            return -1;
        } else {
            if (setimageresource.MediaSessionCompat$ResultReceiverWrapper == 1) {
                if (setimageresource.setTitleOptional != 8) {
                    i = setimageresource.ActionBarContextView;
                }
                f = ((float) i) * setimageresource.f2633x50fd9e4a;
            } else {
                if (setimageresource.setTitleOptional != 8) {
                    i = setimageresource.ActionBarContextView;
                }
                f = ((float) i) / setimageresource.f2633x50fd9e4a;
            }
            int i3 = (int) f;
            setimageresource.MediaBrowserCompat$CustomActionResultReceiver(i3);
            return i3;
        }
    }

    public static void write(List<setExpandActivityOverflowButtonContentDescription.C14841> list, int i, int i2) {
        HashSet<setImageResource> hashSet;
        int i3;
        int i4;
        setImageResource.read read2;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            setExpandActivityOverflowButtonContentDescription.C14841 r3 = list.get(i5);
            if (i == 0) {
                hashSet = r3.MediaDescriptionCompat;
            } else if (i == 1) {
                hashSet = r3.MediaBrowserCompat$SearchResultReceiver;
            } else {
                hashSet = null;
            }
            for (setImageResource next : hashSet) {
                if (next.setGroupDividerEnabled) {
                    int i6 = i << 1;
                    setSupportImageTintList setsupportimagetintlist = next.setContentView[i6];
                    setSupportImageTintList setsupportimagetintlist2 = next.setContentView[i6 + 1];
                    if ((setsupportimagetintlist.RatingCompat == null || setsupportimagetintlist2.RatingCompat == null) ? false : true) {
                        getSupportBackgroundTintMode.read(next, i, IconCompatParcelizer(next, i) + setsupportimagetintlist.read());
                    } else {
                        if (next.f2633x50fd9e4a != BitmapDescriptorFactory.HUE_RED) {
                            if (i == 0) {
                                read2 = next.AppCompatDelegateImpl$ListMenuDecorView[0];
                            } else {
                                read2 = i == 1 ? next.AppCompatDelegateImpl$ListMenuDecorView[1] : null;
                            }
                            if (read2 == setImageResource.read.MATCH_CONSTRAINT) {
                                int write2 = write(next);
                                int i7 = (int) next.setContentView[i6].write.MediaBrowserCompat$SearchResultReceiver;
                                setsupportimagetintlist2.write.MediaBrowserCompat$MediaItem = setsupportimagetintlist.write;
                                setsupportimagetintlist2.write.MediaBrowserCompat$SearchResultReceiver = (float) write2;
                                setsupportimagetintlist2.write.IconCompatParcelizer = 1;
                                next.MediaBrowserCompat$CustomActionResultReceiver(i7, write2 + i7, i);
                            }
                        }
                        if (i == 0) {
                            i3 = next.MenuItemImpl;
                        } else if (i == 1) {
                            i3 = next.setContentHeight;
                        } else {
                            i3 = 0;
                        }
                        int i8 = i2 - i3;
                        if (i == 0) {
                            if (next.setTitleOptional != 8) {
                                i4 = next.ActionBarContextView;
                                int i9 = i8 - i4;
                                next.MediaBrowserCompat$CustomActionResultReceiver(i9, i8, i);
                                getSupportBackgroundTintMode.read(next, i, i9);
                            }
                        } else if (i == 1 && next.setTitleOptional != 8) {
                            i4 = next.PlaybackStateCompat;
                            int i92 = i8 - i4;
                            next.MediaBrowserCompat$CustomActionResultReceiver(i92, i8, i);
                            getSupportBackgroundTintMode.read(next, i, i92);
                        }
                        i4 = 0;
                        int i922 = i8 - i4;
                        next.MediaBrowserCompat$CustomActionResultReceiver(i922, i8, i);
                        getSupportBackgroundTintMode.read(next, i, i922);
                    }
                }
            }
        }
    }

    private static boolean IconCompatParcelizer(setImageResource setimageresource, setExpandActivityOverflowButtonContentDescription.C14841 r9, List<setExpandActivityOverflowButtonContentDescription.C14841> list, boolean z) {
        if (setimageresource == null) {
            return true;
        }
        setimageresource.ListMenuItemView = false;
        setImageDrawable setimagedrawable = (setImageDrawable) setimageresource.AbsActionBarView;
        if (setimageresource.MediaDescriptionCompat == null) {
            setimageresource.setGroupDividerEnabled = true;
            r9.write.add(setimageresource);
            setimageresource.MediaDescriptionCompat = r9;
            if (setimageresource.AppCompatDialogFragment.RatingCompat == null && setimageresource.setSplitBackground.RatingCompat == null && setimageresource.setPrimaryBackground.RatingCompat == null && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat == null && setimageresource.read.RatingCompat == null && setimageresource.RatingCompat.RatingCompat == null) {
                r9.MediaBrowserCompat$ItemReceiver = false;
                setimagedrawable.setOverlayMode = false;
                setimageresource.setGroupDividerEnabled = false;
                if (z) {
                    return false;
                }
            }
            if (!(setimageresource.setPrimaryBackground.RatingCompat == null || setimageresource.MediaBrowserCompat$MediaItem.RatingCompat == null)) {
                setImageResource.read read2 = setimagedrawable.AppCompatDelegateImpl$ListMenuDecorView[1];
                setImageResource.read read3 = setImageResource.read.WRAP_CONTENT;
                if (z) {
                    r9.MediaBrowserCompat$ItemReceiver = false;
                    setimagedrawable.setOverlayMode = false;
                    setimageresource.setGroupDividerEnabled = false;
                    return false;
                } else if (!(setimageresource.setPrimaryBackground.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView)) {
                    r9.MediaBrowserCompat$ItemReceiver = false;
                    setimagedrawable.setOverlayMode = false;
                    setimageresource.setGroupDividerEnabled = false;
                }
            }
            if (!(setimageresource.AppCompatDialogFragment.RatingCompat == null || setimageresource.setSplitBackground.RatingCompat == null)) {
                setImageResource.read read4 = setimagedrawable.AppCompatDelegateImpl$ListMenuDecorView[0];
                setImageResource.read read5 = setImageResource.read.WRAP_CONTENT;
                if (z) {
                    r9.MediaBrowserCompat$ItemReceiver = false;
                    setimagedrawable.setOverlayMode = false;
                    setimageresource.setGroupDividerEnabled = false;
                    return false;
                } else if (!(setimageresource.AppCompatDialogFragment.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.setSplitBackground.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView)) {
                    r9.MediaBrowserCompat$ItemReceiver = false;
                    setimagedrawable.setOverlayMode = false;
                    setimageresource.setGroupDividerEnabled = false;
                }
            }
            if (((setimageresource.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.MATCH_CONSTRAINT) ^ (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.MATCH_CONSTRAINT)) && setimageresource.f2633x50fd9e4a != BitmapDescriptorFactory.HUE_RED) {
                write(setimageresource);
            } else if (setimageresource.AppCompatDelegateImpl$ListMenuDecorView[0] == setImageResource.read.MATCH_CONSTRAINT || setimageresource.AppCompatDelegateImpl$ListMenuDecorView[1] == setImageResource.read.MATCH_CONSTRAINT) {
                r9.MediaBrowserCompat$ItemReceiver = false;
                setimagedrawable.setOverlayMode = false;
                setimageresource.setGroupDividerEnabled = false;
                if (z) {
                    return false;
                }
            }
            if (((setimageresource.AppCompatDialogFragment.RatingCompat == null && setimageresource.setSplitBackground.RatingCompat == null) || ((setimageresource.AppCompatDialogFragment.RatingCompat != null && setimageresource.AppCompatDialogFragment.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.setSplitBackground.RatingCompat == null) || ((setimageresource.setSplitBackground.RatingCompat != null && setimageresource.setSplitBackground.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.AppCompatDialogFragment.RatingCompat == null) || (setimageresource.AppCompatDialogFragment.RatingCompat != null && setimageresource.AppCompatDialogFragment.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.setSplitBackground.RatingCompat != null && setimageresource.setSplitBackground.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView)))) && setimageresource.RatingCompat.RatingCompat == null && !(setimageresource instanceof setImageBitmap) && !(setimageresource instanceof setImageURI)) {
                r9.MediaBrowserCompat$CustomActionResultReceiver.add(setimageresource);
            }
            if (((setimageresource.setPrimaryBackground.RatingCompat == null && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat == null) || ((setimageresource.setPrimaryBackground.RatingCompat != null && setimageresource.setPrimaryBackground.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat == null) || ((setimageresource.MediaBrowserCompat$MediaItem.RatingCompat != null && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.setPrimaryBackground.RatingCompat == null) || (setimageresource.setPrimaryBackground.RatingCompat != null && setimageresource.setPrimaryBackground.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat != null && setimageresource.MediaBrowserCompat$MediaItem.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView)))) && setimageresource.RatingCompat.RatingCompat == null && setimageresource.read.RatingCompat == null && !(setimageresource instanceof setImageBitmap) && !(setimageresource instanceof setImageURI)) {
                r9.read.add(setimageresource);
            }
            if (setimageresource instanceof setImageURI) {
                r9.MediaBrowserCompat$ItemReceiver = false;
                setimagedrawable.setOverlayMode = false;
                setimageresource.setGroupDividerEnabled = false;
                if (z) {
                    return false;
                }
                setImageURI setimageuri = (setImageURI) setimageresource;
                for (int i = 0; i < setimageuri.ActionBarOverlayLayout; i++) {
                    if (!IconCompatParcelizer(setimageuri.setActionBarVisibilityCallback[i], r9, list, z)) {
                        return false;
                    }
                }
            }
            for (setSupportImageTintList setsupportimagetintlist : setimageresource.setContentView) {
                if (!(setsupportimagetintlist.RatingCompat == null || setsupportimagetintlist.RatingCompat.IconCompatParcelizer == setimageresource.AbsActionBarView)) {
                    if (setsupportimagetintlist.MediaBrowserCompat$SearchResultReceiver == setSupportImageTintList.read.CENTER) {
                        r9.MediaBrowserCompat$ItemReceiver = false;
                        setimagedrawable.setOverlayMode = false;
                        setimageresource.setGroupDividerEnabled = false;
                        if (z) {
                            return false;
                        }
                    } else {
                        AppCompatImageView appCompatImageView = setsupportimagetintlist.write;
                        if (!(setsupportimagetintlist.RatingCompat == null || setsupportimagetintlist.RatingCompat.RatingCompat == setsupportimagetintlist)) {
                            setsupportimagetintlist.RatingCompat.write.write.add(appCompatImageView);
                        }
                    }
                    if (!IconCompatParcelizer(setsupportimagetintlist.RatingCompat.IconCompatParcelizer, r9, list, z)) {
                        return false;
                    }
                }
            }
            return true;
        }
        if (setimageresource.MediaDescriptionCompat != r9) {
            r9.write.addAll(setimageresource.MediaDescriptionCompat.write);
            r9.MediaBrowserCompat$CustomActionResultReceiver.addAll(setimageresource.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver);
            r9.read.addAll(setimageresource.MediaDescriptionCompat.read);
            if (!setimageresource.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver) {
                r9.MediaBrowserCompat$ItemReceiver = false;
            }
            list.remove(setimageresource.MediaDescriptionCompat);
            for (setImageResource setimageresource2 : setimageresource.MediaDescriptionCompat.write) {
                setimageresource2.MediaDescriptionCompat = r9;
            }
        }
        return true;
    }

    public static Intent write(Activity activity) {
        Intent parentActivityIntent;
        if (Build.VERSION.SDK_INT >= 16 && (parentActivityIntent = activity.getParentActivityIntent()) != null) {
            return parentActivityIntent;
        }
        String read2 = read(activity);
        if (read2 == null) {
            return null;
        }
        ComponentName componentName = new ComponentName(activity, read2);
        try {
            if (MediaBrowserCompat$ItemReceiver((Context) activity, componentName) == null) {
                return Intent.makeMainActivity(componentName);
            }
            return new Intent().setComponent(componentName);
        } catch (PackageManager.NameNotFoundException unused) {
            StringBuilder sb = new StringBuilder();
            sb.append("getParentActivityIntent: bad parentActivityName '");
            sb.append(read2);
            sb.append("' in manifest");
            Log.e("NavUtils", sb.toString());
            return null;
        }
    }

    public static Intent IconCompatParcelizer(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(context, componentName);
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), MediaBrowserCompat$ItemReceiver2);
        if (MediaBrowserCompat$ItemReceiver(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    public static String read(Activity activity) {
        try {
            return MediaBrowserCompat$ItemReceiver((Context) activity, activity.getComponentName());
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String MediaBrowserCompat$ItemReceiver(Context context, ComponentName componentName) throws PackageManager.NameNotFoundException {
        String string;
        String str;
        ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, 128);
        if (Build.VERSION.SDK_INT >= 16 && (str = activityInfo.parentActivityName) != null) {
            return str;
        }
        if (activityInfo.metaData == null || (string = activityInfo.metaData.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(context.getPackageName());
        sb.append(string);
        return sb.toString();
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(Context context, String str) {
        return MediaBrowserCompat$CustomActionResultReceiver(context, str, Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null);
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, int i, int i2, String str2) {
        if (context.checkPermission(str, i, i2) == -1) {
            return -1;
        }
        String MediaBrowserCompat$ItemReceiver2 = AppCompatSpinner.MediaBrowserCompat$ItemReceiver(str);
        if (MediaBrowserCompat$ItemReceiver2 == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i2);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        if (AppCompatSpinner.read(context, MediaBrowserCompat$ItemReceiver2, str2) != 0) {
            return -2;
        }
        return 0;
    }

    public static int MediaBrowserCompat$ItemReceiver(Context context, String str) {
        return MediaBrowserCompat$CustomActionResultReceiver(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }

    public static boolean read(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, boolean z) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return z;
        }
        return typedArray.getBoolean(i, z);
    }

    public static int write(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return 0;
        }
        return typedArray.getColor(i, 0);
    }

    public static setLineHeight MediaBrowserCompat$ItemReceiver(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            if (typedValue.type >= 28 && typedValue.type <= 31) {
                return setLineHeight.read(typedValue.data);
            }
            setLineHeight IconCompatParcelizer2 = setLineHeight.IconCompatParcelizer(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            if (IconCompatParcelizer2 != null) {
                return IconCompatParcelizer2;
            }
        }
        return setLineHeight.read(0);
    }

    public static float MediaBrowserCompat$CustomActionResultReceiver(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, float f) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return f;
        }
        return typedArray.getFloat(i, f);
    }

    public static int read(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return i2;
        }
        return typedArray.getInt(i, i2);
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return 0;
        }
        return typedArray.getResourceId(i, 0);
    }

    public static String MediaBrowserCompat$ItemReceiver(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static TypedValue write(TypedArray typedArray, XmlPullParser xmlPullParser, String str) {
        if (!(xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null)) {
            return null;
        }
        return typedArray.peekValue(0);
    }

    public static int IconCompatParcelizer(int i, int i2) {
        int i3;
        int i4;
        int alpha = Color.alpha(i2);
        int alpha2 = Color.alpha(i);
        int i5 = 255 - alpha2;
        int i6 = 255 - (((255 - alpha) * i5) / 255);
        int red = Color.red(i);
        int red2 = Color.red(i2);
        int i7 = 0;
        if (i6 == 0) {
            i3 = 0;
        } else {
            i3 = (((red * 255) * alpha2) + ((red2 * alpha) * i5)) / (i6 * 255);
        }
        int green = Color.green(i);
        int green2 = Color.green(i2);
        if (i6 == 0) {
            i4 = 0;
        } else {
            i4 = (((green * 255) * alpha2) + ((green2 * alpha) * i5)) / (i6 * 255);
        }
        int blue = Color.blue(i);
        int blue2 = Color.blue(i2);
        if (i6 != 0) {
            i7 = (((blue * 255) * alpha2) + ((blue2 * alpha) * i5)) / (i6 * 255);
        }
        return Color.argb(i6, i3, i4, i7);
    }

    public static int MediaBrowserCompat$ItemReceiver(int i, int i2) {
        if (i2 >= 0 && i2 <= 255) {
            return (i & 16777215) | (i2 << 24);
        }
        throw new IllegalArgumentException("alpha must be between 0 and 255.");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0018, code lost:
        r0 = r2.getClass().getName();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MediaBrowserCompat$ItemReceiver(java.lang.Object r2, java.lang.StringBuilder r3) {
        /*
            if (r2 != 0) goto L_0x0008
            java.lang.String r2 = "null"
            r3.append(r2)
            return
        L_0x0008:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getSimpleName()
            if (r0 == 0) goto L_0x0018
            int r1 = r0.length()
            if (r1 > 0) goto L_0x002e
        L_0x0018:
            java.lang.Class r0 = r2.getClass()
            java.lang.String r0 = r0.getName()
            r1 = 46
            int r1 = r0.lastIndexOf(r1)
            if (r1 <= 0) goto L_0x002e
            int r1 = r1 + 1
            java.lang.String r0 = r0.substring(r1)
        L_0x002e:
            r3.append(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r3.append(r0)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r3.append(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(java.lang.Object, java.lang.StringBuilder):void");
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.Keep keep, setContentId setcontentid, View view, View view2, RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, boolean z) {
        setMinWidth setminwidth = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) != 0) {
            if (!((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) == 0 || view == null || view2 == null)) {
                if (!z) {
                    return Math.abs(RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view) - RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2)) + 1;
                }
                return Math.min(setcontentid.MediaBrowserCompat$SearchResultReceiver(), setcontentid.IconCompatParcelizer(view2) - setcontentid.MediaBrowserCompat$ItemReceiver(view));
            }
        }
        return 0;
    }

    public static int IconCompatParcelizer(RecyclerView.Keep keep, setContentId setcontentid, View view, View view2, RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, boolean z, boolean z2) {
        int i;
        setMinWidth setminwidth = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) != 0) {
            if (!((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) == 0 || view == null || view2 == null)) {
                int min = Math.min(RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view), RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2));
                int max = Math.max(RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view), RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2));
                if (z2) {
                    i = Math.max(0, ((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) - max) - 1);
                } else {
                    i = Math.max(0, min);
                }
                if (!z) {
                    return i;
                }
                return Math.round((((float) i) * (((float) Math.abs(setcontentid.IconCompatParcelizer(view2) - setcontentid.MediaBrowserCompat$ItemReceiver(view))) / ((float) (Math.abs(RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view) - RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2)) + 1)))) + ((float) (setcontentid.MediaDescriptionCompat() - setcontentid.MediaBrowserCompat$ItemReceiver(view))));
            }
        }
        return 0;
    }

    public static int MediaBrowserCompat$ItemReceiver(RecyclerView.Keep keep, setContentId setcontentid, View view, View view2, RecyclerView$MediaBrowserCompat$SearchResultReceiver recyclerView$MediaBrowserCompat$SearchResultReceiver, boolean z) {
        setMinWidth setminwidth = recyclerView$MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper;
        if ((setminwidth != null ? setminwidth.read.MediaBrowserCompat$CustomActionResultReceiver() - setminwidth.MediaBrowserCompat$ItemReceiver.size() : 0) != 0) {
            if (!((keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem) == 0 || view == null || view2 == null)) {
                if (!z) {
                    return keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem;
                }
                return (int) ((((float) (setcontentid.IconCompatParcelizer(view2) - setcontentid.MediaBrowserCompat$ItemReceiver(view))) / ((float) (Math.abs(RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view) - RecyclerView$MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat(view2)) + 1))) * ((float) (keep.MediaBrowserCompat$ItemReceiver ? keep.MediaDescriptionCompat - keep.IconCompatParcelizer : keep.MediaBrowserCompat$MediaItem)));
            }
        }
        return 0;
    }

    public static <T> ObjectAnimator IconCompatParcelizer(T t, Property<T, PointF> property, Path path) {
        if (Build.VERSION.SDK_INT >= 21) {
            return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
        }
        return ObjectAnimator.ofFloat(t, new getLifecycle(property, path), new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f});
    }

    public static <T> List<T> MediaBrowserCompat$ItemReceiver(Iterator<? extends T> it) {
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    /* JADX INFO: finally extract failed */
    public static int IconCompatParcelizer(List<ImageHeaderParser> list, InputStream inputStream, CheckParameters.CheckCountry checkCountry) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new onStateNotSaved(inputStream, checkCountry);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                int MediaBrowserCompat$CustomActionResultReceiver2 = list.get(i).MediaBrowserCompat$CustomActionResultReceiver(inputStream, checkCountry);
                if (MediaBrowserCompat$CustomActionResultReceiver2 != -1) {
                    inputStream.reset();
                    return MediaBrowserCompat$CustomActionResultReceiver2;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return -1;
    }

    /* JADX INFO: finally extract failed */
    public static ImageHeaderParser.ImageType read(List<ImageHeaderParser> list, InputStream inputStream, CheckParameters.CheckCountry checkCountry) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new onStateNotSaved(inputStream, checkCountry);
        }
        inputStream.mark(5242880);
        int i = 0;
        int size = list.size();
        while (i < size) {
            try {
                ImageHeaderParser.ImageType read2 = list.get(i).read(inputStream);
                if (read2 != ImageHeaderParser.ImageType.UNKNOWN) {
                    inputStream.reset();
                    return read2;
                }
                inputStream.reset();
                i++;
            } catch (Throwable th) {
                inputStream.reset();
                throw th;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static boolean IconCompatParcelizer(Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }

    public static Drawable MediaBrowserCompat$ItemReceiver(Context context, Context context2, int i, Resources.Theme theme) {
        try {
            if (ParcelableVolumeInfo) {
                return AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(theme != null ? new setPopupCallback(context2, theme) : context2, i);
            }
        } catch (NoClassDefFoundError unused) {
            ParcelableVolumeInfo = false;
        } catch (IllegalStateException e) {
            if (!context.getPackageName().equals(context2.getPackageName())) {
                return setLastBaselineToBottomHeight.write(context2, i);
            }
            throw e;
        } catch (Resources.NotFoundException unused2) {
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return ContentFrameLayout.read(context2.getResources(), i, theme);
    }

    /* JADX INFO: finally extract failed */
    public static getSubElementOffsetBytes read(File file) throws ImageProcessingException, IOException {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            getSubElementOffsetBytes MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver((InputStream) fileInputStream, file.length());
            fileInputStream.close();
            if (!file.isFile()) {
                throw new IOException("File object must reference a file");
            } else if (!file.exists()) {
                throw new IOException("File does not exist");
            } else if (file.canRead()) {
                I8_4 i8_4 = new I8_4();
                String name = file.getName();
                if (name != null) {
                    i8_4.IconCompatParcelizer(1, name);
                    i8_4.IconCompatParcelizer(2, Long.valueOf(file.length()));
                    i8_4.IconCompatParcelizer(3, new Date(file.lastModified()));
                    MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer.add(i8_4);
                    return MediaBrowserCompat$CustomActionResultReceiver2;
                }
                throw new NullPointerException("cannot set a null String");
            } else {
                throw new IOException("File is not readable");
            }
        } catch (Throwable th) {
            fileInputStream.close();
            throw th;
        }
    }

    public static getSubElementOffsetBytes MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, long j) throws ImageProcessingException, IOException {
        BufferedInputStream bufferedInputStream = inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream);
        setItemViewCacheSize write2 = setEdgeEffectFactory.write(bufferedInputStream);
        if (write2 == setItemViewCacheSize.Jpeg) {
            return setHasFixedSize.MediaBrowserCompat$ItemReceiver(bufferedInputStream);
        }
        if (write2 == setItemViewCacheSize.Tiff || write2 == setItemViewCacheSize.Arw || write2 == setItemViewCacheSize.Cr2 || write2 == setItemViewCacheSize.Nef || write2 == setItemViewCacheSize.Orf || write2 == setItemViewCacheSize.Rw2) {
            copy1DRangeToUnchecked copy1drangetounchecked = new copy1DRangeToUnchecked(bufferedInputStream, j);
            getSubElementOffsetBytes getsubelementoffsetbytes = new getSubElementOffsetBytes();
            ConstraintHelper$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(copy1drangetounchecked, new validateIsInt32(getsubelementoffsetbytes), 0);
            return getsubelementoffsetbytes;
        } else if (write2 == setItemViewCacheSize.Psd) {
            return setBackgroundDrawable.read.read(bufferedInputStream);
        } else {
            if (write2 == setItemViewCacheSize.Png) {
                return setLayoutManager.read(bufferedInputStream);
            }
            if (write2 == setItemViewCacheSize.Bmp) {
                return MediaMetadataCompat.IconCompatParcelizer(bufferedInputStream);
            }
            if (write2 == setItemViewCacheSize.Gif) {
                return C1134xe5b94a38.MediaBrowserCompat$ItemReceiver((InputStream) bufferedInputStream);
            }
            if (write2 == setItemViewCacheSize.Ico) {
                return setBackgroundDrawable.write(bufferedInputStream);
            }
            if (write2 == setItemViewCacheSize.Pcx) {
                return setBackgroundDrawable.write.MediaBrowserCompat$CustomActionResultReceiver((InputStream) bufferedInputStream);
            }
            if (write2 == setItemViewCacheSize.Riff) {
                return onDestroyView.write.MediaBrowserCompat$ItemReceiver(bufferedInputStream);
            }
            if (write2 == setItemViewCacheSize.Raf) {
                return read.MediaBrowserCompat$CustomActionResultReceiver((InputStream) bufferedInputStream);
            }
            throw new ImageProcessingException("File format is not supported");
        }
    }

    public static getHost write(copy1DRangeFromUnchecked copy1drangefromunchecked, Iterable<setItemAnimator> iterable) throws JpegProcessingException, IOException {
        List list;
        int RatingCompat2 = copy1drangefromunchecked.RatingCompat();
        if (RatingCompat2 == 65496) {
            HashSet hashSet = new HashSet();
            for (setItemAnimator setitemanimator : iterable) {
                hashSet.add(Byte.valueOf(setitemanimator.byteValue));
            }
            getHost gethost = new getHost();
            while (true) {
                byte MediaBrowserCompat$ItemReceiver2 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
                byte MediaBrowserCompat$ItemReceiver3 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
                while (true) {
                    if (MediaBrowserCompat$ItemReceiver2 == -1 && MediaBrowserCompat$ItemReceiver3 != -1 && MediaBrowserCompat$ItemReceiver3 != 0) {
                        break;
                    }
                    byte b = MediaBrowserCompat$ItemReceiver3;
                    MediaBrowserCompat$ItemReceiver3 = copy1drangefromunchecked.MediaBrowserCompat$ItemReceiver();
                    MediaBrowserCompat$ItemReceiver2 = b;
                }
                if (MediaBrowserCompat$ItemReceiver3 == -38 || MediaBrowserCompat$ItemReceiver3 == -39) {
                    return gethost;
                }
                int RatingCompat3 = copy1drangefromunchecked.RatingCompat() - 2;
                if (RatingCompat3 < 0) {
                    throw new JpegProcessingException("JPEG segment size would be less than zero");
                } else if (hashSet.contains(Byte.valueOf(MediaBrowserCompat$ItemReceiver3))) {
                    byte[] IconCompatParcelizer2 = copy1drangefromunchecked.IconCompatParcelizer(RatingCompat3);
                    if (gethost.MediaBrowserCompat$CustomActionResultReceiver.containsKey(Byte.valueOf(MediaBrowserCompat$ItemReceiver3))) {
                        list = gethost.MediaBrowserCompat$CustomActionResultReceiver.get(Byte.valueOf(MediaBrowserCompat$ItemReceiver3));
                    } else {
                        ArrayList arrayList = new ArrayList();
                        gethost.MediaBrowserCompat$CustomActionResultReceiver.put(Byte.valueOf(MediaBrowserCompat$ItemReceiver3), arrayList);
                        list = arrayList;
                    }
                    list.add(IconCompatParcelizer2);
                } else if (!copy1drangefromunchecked.MediaBrowserCompat$CustomActionResultReceiver((long) RatingCompat3)) {
                    return gethost;
                }
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("JPEG data is expected to begin with 0xFFD8 (ÿØ) not 0x");
            sb.append(Integer.toHexString(RatingCompat2));
            throw new JpegProcessingException(sb.toString());
        }
    }

    public static Charset write(byte[] bArr) {
        int i = 0;
        String[] strArr = {"UTF-8", System.getProperty("file.encoding"), LocalizedMessage.DEFAULT_ENCODING};
        while (i < 3) {
            Charset forName = Charset.forName(strArr[i]);
            try {
                forName.newDecoder().decode(ByteBuffer.wrap(bArr));
                return forName;
            } catch (CharacterCodingException unused) {
                i++;
            }
        }
        return null;
    }

    public static String IconCompatParcelizer(String str, String str2) {
        int length = str.length() - str2.length();
        if (length < 0 || length > 1) {
            throw new IllegalArgumentException("Invalid input received");
        }
        StringBuilder sb = new StringBuilder(str2.length() + str.length());
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            if (str2.length() > i) {
                sb.append(str2.charAt(i));
            }
        }
        return sb.toString();
    }

    public static void MediaBrowserCompat$ItemReceiver(String str, String str2, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportRuntime.");
        sb.append(str);
        Log.d(sb.toString(), String.format(str2, new Object[]{obj}));
    }

    public static void IconCompatParcelizer(String str, String str2, Object... objArr) {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportRuntime.");
        sb.append(str);
        Log.d(sb.toString(), String.format(str2, objArr));
    }

    public static void write(String str, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportRuntime.");
        sb.append(str);
        Log.e(sb.toString(), str2, th);
    }

    public static void read(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append("TransportRuntime.");
        sb.append(str);
        Log.i(sb.toString(), str2);
    }

    public static <TInput, TResult, TException extends Throwable> TResult read(TInput tinput, nAllocationCopyFromBitmap<TInput, TResult, TException> nallocationcopyfrombitmap, isUseNative<TInput, TResult> isusenative) throws Throwable {
        TResult write2;
        int i = 5;
        do {
            write2 = nallocationcopyfrombitmap.write(tinput);
            tinput = isusenative.MediaBrowserCompat$CustomActionResultReceiver(tinput, write2);
            if (tinput == null || i - 1 <= 0) {
                return write2;
            }
            write2 = nallocationcopyfrombitmap.write(tinput);
            tinput = isusenative.MediaBrowserCompat$CustomActionResultReceiver(tinput, write2);
            break;
        } while (i - 1 <= 0);
        return write2;
    }

    public static boolean write(DrawableContainer drawableContainer, Drawable.ConstantState constantState) {
        if (!Keep) {
            try {
                Method declaredMethod = DrawableContainer.class.getDeclaredMethod("setConstantState", new Class[]{DrawableContainer.DrawableContainerState.class});
                AlertController$RecycleListView = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
                Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
            }
            Keep = true;
        }
        Method method = AlertController$RecycleListView;
        if (method != null) {
            try {
                method.invoke(drawableContainer, new Object[]{constantState});
                return true;
            } catch (Exception unused2) {
                Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
            }
        }
        return false;
    }

    public static float MediaBrowserCompat$ItemReceiver(float f, float f2, float f3, float f4) {
        double d = (double) (BitmapDescriptorFactory.HUE_RED - f);
        double d2 = (double) (BitmapDescriptorFactory.HUE_RED - f2);
        float hypot = (float) Math.hypot(d, d2);
        double d3 = (double) (f3 - f);
        float hypot2 = (float) Math.hypot(d3, d2);
        double d4 = (double) (f4 - f2);
        float hypot3 = (float) Math.hypot(d3, d4);
        float hypot4 = (float) Math.hypot(d, d4);
        if (hypot > hypot2 && hypot > hypot3 && hypot > hypot4) {
            return hypot;
        }
        if (hypot2 <= hypot3 || hypot2 <= hypot4) {
            return hypot3 > hypot4 ? hypot3 : hypot4;
        }
        return hypot2;
    }

    public static ColorStateList IconCompatParcelizer(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList MediaBrowserCompat$CustomActionResultReceiver2;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (MediaBrowserCompat$CustomActionResultReceiver2 = AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$CustomActionResultReceiver(context, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return MediaBrowserCompat$CustomActionResultReceiver2;
    }

    private static int write(float[] fArr, int[] iArr, byte[] bArr) {
        Arrays.fill(bArr, (byte) 0);
        int i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        for (int i2 = 0; i2 < 6; i2++) {
            iArr[i2] = (int) Math.ceil((double) fArr[i2]);
            int i3 = iArr[i2];
            if (i > i3) {
                Arrays.fill(bArr, (byte) 0);
                i = i3;
            }
            if (i == i3) {
                bArr[i2] = (byte) (bArr[i2] + 1);
            }
        }
        return i;
    }

    public static void write(char c) {
        String hexString = Integer.toHexString(c);
        StringBuilder sb = new StringBuilder();
        sb.append(LivenessStatus.f5461OK.substring(0, 4 - hexString.length()));
        sb.append(hexString);
        String obj = sb.toString();
        StringBuilder sb2 = new StringBuilder("Illegal character: ");
        sb2.append(c);
        sb2.append(" (0x");
        sb2.append(obj);
        sb2.append(')');
        throw new IllegalArgumentException(sb2.toString());
    }

    public static int IconCompatParcelizer(CharSequence charSequence, int i, int i2) {
        float[] fArr;
        int i3;
        CharSequence charSequence2 = charSequence;
        int i4 = i;
        if (i4 >= charSequence.length()) {
            return i2;
        }
        int i5 = 6;
        if (i2 == 0) {
            fArr = new float[]{BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f, 1.0f, 1.0f, 1.25f};
        } else {
            fArr = new float[]{1.0f, 2.0f, 2.0f, 2.0f, 2.0f, 2.25f};
            fArr[i2] = 0.0f;
        }
        int i6 = 0;
        while (true) {
            int i7 = i4 + i6;
            if (i7 == charSequence.length()) {
                byte[] bArr = new byte[i5];
                int[] iArr = new int[i5];
                int write2 = write(fArr, iArr, bArr);
                int i8 = 0;
                for (int i9 = 0; i9 < i5; i9++) {
                    i8 += bArr[i9];
                }
                if (iArr[0] == write2) {
                    return 0;
                }
                if (i8 == 1 && bArr[5] > 0) {
                    return 5;
                }
                if (i8 == 1 && bArr[4] > 0) {
                    return 4;
                }
                if (i8 != 1 || bArr[2] <= 0) {
                    return (i8 != 1 || bArr[3] <= 0) ? 1 : 3;
                }
                return 2;
            }
            char charAt = charSequence2.charAt(i7);
            i6++;
            if (charAt >= '0' && charAt <= '9') {
                fArr[0] = fArr[0] + 0.5f;
            } else {
                if (charAt >= 128 && charAt <= 255) {
                    fArr[0] = (float) Math.ceil((double) fArr[0]);
                    fArr[0] = fArr[0] + 2.0f;
                } else {
                    fArr[0] = (float) Math.ceil((double) fArr[0]);
                    fArr[0] = fArr[0] + 1.0f;
                }
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'A' && charAt <= 'Z')) {
                fArr[1] = fArr[1] + 0.6666667f;
            } else {
                if (charAt >= 128 && charAt <= 255) {
                    fArr[1] = fArr[1] + 2.6666667f;
                } else {
                    fArr[1] = fArr[1] + 1.3333334f;
                }
            }
            if (charAt == ' ' || (charAt >= '0' && charAt <= '9') || (charAt >= 'a' && charAt <= 'z')) {
                fArr[2] = fArr[2] + 0.6666667f;
            } else {
                if (charAt >= 128 && charAt <= 255) {
                    fArr[2] = fArr[2] + 2.6666667f;
                } else {
                    fArr[2] = fArr[2] + 1.3333334f;
                }
            }
            if (MediaBrowserCompat$CustomActionResultReceiver(charAt)) {
                fArr[3] = fArr[3] + 0.6666667f;
            } else {
                if (charAt >= 128 && charAt <= 255) {
                    fArr[3] = fArr[3] + 4.3333335f;
                } else {
                    fArr[3] = fArr[3] + 3.3333333f;
                }
            }
            if (charAt >= ' ' && charAt <= '^') {
                i3 = 4;
                fArr[4] = fArr[4] + 0.75f;
            } else {
                i3 = 4;
                if (charAt >= 128 && charAt <= 255) {
                    fArr[4] = fArr[4] + 4.25f;
                } else {
                    fArr[4] = fArr[4] + 3.25f;
                }
            }
            fArr[5] = fArr[5] + 1.0f;
            i5 = 6;
            if (i6 >= i3) {
                int[] iArr2 = new int[6];
                byte[] bArr2 = new byte[6];
                write(fArr, iArr2, bArr2);
                int i10 = 0;
                for (int i11 = 0; i11 < 6; i11++) {
                    i10 += bArr2[i11];
                }
                if (iArr2[0] < iArr2[5] && iArr2[0] < iArr2[1] && iArr2[0] < iArr2[2] && iArr2[0] < iArr2[3] && iArr2[0] < iArr2[4]) {
                    return 0;
                }
                if (iArr2[5] < iArr2[0] || bArr2[1] + bArr2[2] + bArr2[3] + bArr2[4] == 0) {
                    return 5;
                }
                if (i10 == 1 && bArr2[4] > 0) {
                    return 4;
                }
                if (i10 == 1 && bArr2[2] > 0) {
                    return 2;
                }
                if (i10 == 1 && bArr2[3] > 0) {
                    return 3;
                }
                if (iArr2[1] + 1 < iArr2[0] && iArr2[1] + 1 < iArr2[5] && iArr2[1] + 1 < iArr2[4] && iArr2[1] + 1 < iArr2[2]) {
                    if (iArr2[1] < iArr2[3]) {
                        return 1;
                    }
                    if (iArr2[1] == iArr2[3]) {
                        int i12 = i4 + i6 + 1;
                        while (i12 < charSequence.length()) {
                            char charAt2 = charSequence2.charAt(i12);
                            if (!(charAt2 == 13 || charAt2 == '*' || charAt2 == '>')) {
                                if (!MediaBrowserCompat$CustomActionResultReceiver(charAt2)) {
                                    break;
                                }
                                i12++;
                            } else {
                                return 3;
                            }
                        }
                        return 1;
                    }
                }
            }
        }
    }

    private static int MediaDescriptionCompat(int i, int i2) {
        int i3 = i - i2;
        if (i3 <= i2) {
            int i4 = i3;
            i3 = i2;
            i2 = i4;
        }
        int i5 = 1;
        int i6 = 1;
        while (i > i3) {
            i5 *= i;
            if (i6 <= i2) {
                i5 /= i6;
                i6++;
            }
            i--;
        }
        while (i6 <= i2) {
            i5 /= i6;
            i6++;
        }
        return i5;
    }

    public static int IconCompatParcelizer(int[] iArr, int i, boolean z) {
        int[] iArr2 = iArr;
        int i2 = i;
        int i3 = 0;
        for (int i4 : iArr2) {
            i3 += i4;
        }
        int length = iArr2.length;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (true) {
            int i8 = length - 1;
            if (i5 >= i8) {
                return i6;
            }
            int i9 = 1 << i5;
            i7 |= i9;
            int i10 = 1;
            while (i10 < iArr2[i5]) {
                int i11 = i3 - i10;
                int i12 = length - i5;
                int i13 = i12 - 2;
                int MediaDescriptionCompat2 = MediaDescriptionCompat(i11 - 1, i13);
                if (z && i7 == 0) {
                    int i14 = i12 - 1;
                    if (i11 - i14 >= i14) {
                        MediaDescriptionCompat2 -= MediaDescriptionCompat(i11 - i12, i13);
                    }
                }
                if (i12 - 1 > 1) {
                    int i15 = i11 - i13;
                    int i16 = 0;
                    while (i15 > i2) {
                        i16 += MediaDescriptionCompat((i11 - i15) - 1, i12 - 3);
                        i15--;
                        int[] iArr3 = iArr;
                    }
                    MediaDescriptionCompat2 -= i16 * (i8 - i5);
                } else if (i11 > i2) {
                    MediaDescriptionCompat2--;
                }
                i6 += MediaDescriptionCompat2;
                i10++;
                i7 &= ~i9;
                iArr2 = iArr;
            }
            i3 -= i10;
            i5++;
            iArr2 = iArr;
        }
    }

    public static int write(zzge.zzf.read read2, boolean z) {
        int i;
        int i2;
        if (z) {
            i = read2.MediaBrowserCompat$ItemReceiver;
        } else {
            i = read2.read;
        }
        if (z) {
            i2 = read2.read;
        } else {
            i2 = read2.MediaBrowserCompat$ItemReceiver;
        }
        byte[][] bArr = read2.MediaBrowserCompat$CustomActionResultReceiver;
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            byte b = -1;
            int i5 = 0;
            for (int i6 = 0; i6 < i2; i6++) {
                byte b2 = z ? bArr[i4][i6] : bArr[i6][i4];
                if (b2 == b) {
                    i5++;
                } else {
                    if (i5 >= 5) {
                        i3 += (i5 - 5) + 3;
                    }
                    i5 = 1;
                    b = b2;
                }
            }
            if (i5 >= 5) {
                i3 += (i5 - 5) + 3;
            }
        }
        return i3;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(byte[] bArr, int i, int i2) {
        int min = Math.min(i2, bArr.length);
        for (int max = Math.max(i, 0); max < min; max++) {
            if (bArr[max] == 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(byte[][] bArr, int i, int i2, int i3) {
        int min = Math.min(i3, bArr.length);
        for (int max = Math.max(i2, 0); max < min; max++) {
            if (bArr[max][i] == 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0016, code lost:
        r0 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.recyclerview.widget.RecyclerView.setContentView IconCompatParcelizer(android.view.View r3) {
        /*
            r0 = r3
        L_0x0001:
            r1 = 0
            if (r0 == 0) goto L_0x0016
            android.view.ViewParent r0 = r0.getParent()
            boolean r2 = r0 instanceof androidx.recyclerview.widget.RecyclerView
            if (r2 == 0) goto L_0x000f
            androidx.recyclerview.widget.RecyclerView r0 = (androidx.recyclerview.widget.RecyclerView) r0
            goto L_0x0017
        L_0x000f:
            boolean r2 = r0 instanceof android.view.View
            if (r2 == 0) goto L_0x0016
            android.view.View r0 = (android.view.View) r0
            goto L_0x0001
        L_0x0016:
            r0 = r1
        L_0x0017:
            if (r0 != 0) goto L_0x001a
            return r1
        L_0x001a:
            android.view.View r3 = r0.write((android.view.View) r3)
            if (r3 != 0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            androidx.recyclerview.widget.RecyclerView$setContentView r1 = r0.MediaBrowserCompat$MediaItem((android.view.View) r3)
        L_0x0025:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.IconCompatParcelizer(android.view.View):androidx.recyclerview.widget.RecyclerView$setContentView");
    }

    public static <T> T read(RecyclerView.IconCompatParcelizer iconCompatParcelizer, Class<T> cls, int i) {
        FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment = new FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment();
        if (MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, (RecyclerView.IconCompatParcelizer) null, (Object) null, i, fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) == -1) {
            return null;
        }
        for (zzge$zzh$zza$MediaBrowserCompat$ItemReceiver next : fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer) {
            if (cls.isInstance(next.read)) {
                return cls.cast(next.read);
            }
        }
        return null;
    }

    public static RecyclerView.IconCompatParcelizer MediaBrowserCompat$ItemReceiver(RecyclerView.IconCompatParcelizer iconCompatParcelizer) {
        if (!(iconCompatParcelizer instanceof addInvokeInternal)) {
            return iconCompatParcelizer;
        }
        addInvokeInternal addinvokeinternal = (addInvokeInternal) iconCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        addinvokeinternal.MediaBrowserCompat$ItemReceiver(arrayList);
        addinvokeinternal.MediaBrowserCompat$CustomActionResultReceiver();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            MediaBrowserCompat$ItemReceiver((RecyclerView.IconCompatParcelizer) arrayList.get(size));
        }
        arrayList.clear();
        return iconCompatParcelizer;
    }

    public static int MediaBrowserCompat$ItemReceiver(RecyclerView.IconCompatParcelizer iconCompatParcelizer, RecyclerView.IconCompatParcelizer iconCompatParcelizer2, Object obj, int i, FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment) {
        C1188xc0532a8d fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver = new C1188xc0532a8d();
        if (fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment != null) {
            fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.clear();
        }
        if (iconCompatParcelizer == null) {
            return -1;
        }
        if (fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment != null) {
            fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.add(new zzge$zzh$zza$MediaBrowserCompat$ItemReceiver(iconCompatParcelizer, (Object) null));
        }
        while (true) {
            if (i != -1 && iconCompatParcelizer != iconCompatParcelizer2) {
                if (iconCompatParcelizer instanceof addInvokeInternal) {
                    fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.read = null;
                    fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.write = -1;
                    ((addInvokeInternal) iconCompatParcelizer).MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver, i);
                    i = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.write;
                    if (((fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.read == null || fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.write == -1) ? false : true) && fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment != null) {
                        fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.add(new zzge$zzh$zza$MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.read, (Object) null));
                    }
                    iconCompatParcelizer = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment$MediaBrowserCompat$CustomActionResultReceiver.read;
                    if (iconCompatParcelizer == null) {
                        break;
                    }
                } else if (iconCompatParcelizer2 != null) {
                    i = -1;
                }
            } else {
                break;
            }
        }
        if (!(iconCompatParcelizer2 == null || iconCompatParcelizer == iconCompatParcelizer2)) {
            i = -1;
        }
        if (!(obj == null || obj == null)) {
            i = -1;
        }
        if (i == -1 && fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment != null) {
            fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer.clear();
        }
        return i;
    }

    public static int write(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment, RecyclerView.IconCompatParcelizer iconCompatParcelizer, RecyclerView.IconCompatParcelizer iconCompatParcelizer2, int i) {
        List<zzge$zzh$zza$MediaBrowserCompat$ItemReceiver> list = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer;
        int size = list.size();
        int i2 = iconCompatParcelizer == null ? size - 1 : -1;
        int i3 = iconCompatParcelizer2 == null ? 0 : -1;
        if (!(iconCompatParcelizer == null && iconCompatParcelizer2 == null)) {
            for (int i4 = 0; i4 < size; i4++) {
                zzge$zzh$zza$MediaBrowserCompat$ItemReceiver zzge_zzh_zza_mediabrowsercompat_itemreceiver = list.get(i4);
                if (iconCompatParcelizer != null && zzge_zzh_zza_mediabrowsercompat_itemreceiver.read == iconCompatParcelizer) {
                    i2 = i4;
                }
                if (iconCompatParcelizer2 != null && zzge_zzh_zza_mediabrowsercompat_itemreceiver.read == iconCompatParcelizer2) {
                    i3 = i4;
                }
            }
        }
        if (i2 == -1 || i3 == -1 || i3 > i2) {
            return -1;
        }
        List<zzge$zzh$zza$MediaBrowserCompat$ItemReceiver> list2 = fragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.IconCompatParcelizer;
        while (i2 > i3) {
            i = ((addInvokeInternal) list2.get(i2 - 1).read).read(list2.get(i2), i);
            if (i == -1) {
                break;
            }
            i2--;
        }
        return i;
    }

    public static byte[] write(int i, int i2) {
        int i3 = 4;
        byte[] array = ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(i).array();
        ByteBuffer allocate = ByteBuffer.allocate(i2);
        boolean z = true;
        for (byte b : array) {
            if (z) {
                if (b != 0 || i3 <= i2) {
                    z = false;
                } else {
                    i3--;
                }
            }
            i3--;
            allocate.put(b);
        }
        return allocate.array();
    }

    public static byte[] read(byte[]... bArr) {
        int i = 0;
        for (byte[] length : bArr) {
            i += length.length;
        }
        byte[] bArr2 = new byte[i];
        int i2 = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i2, bArr3.length);
            i2 += bArr3.length;
        }
        return bArr2;
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(String str) {
        if (str.length() % 2 == 1) {
            StringBuilder sb = new StringBuilder();
            sb.append("0");
            sb.append(str);
            str = sb.toString();
        }
        return validateSPR.read(IconCompatParcelizer(str));
    }

    public static byte[] IconCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return str.getBytes();
        }
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        try {
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return new String(bArr);
        }
    }

    public static List<setTvRemark.write> MediaBrowserCompat$ItemReceiver(resolve resolve) {
        List<uri> list;
        List<setTvRemark.write> arrayList = new ArrayList<>();
        if (!(resolve == null || (list = resolve.write) == null)) {
            for (uri uri : list) {
                setTvRemark.write write2 = new setTvRemark.write();
                if (uri != null) {
                    write2.IconCompatParcelizer = uri.read;
                    String str = uri.MediaBrowserCompat$ItemReceiver;
                    double d = 0.0d;
                    write2.MediaBrowserCompat$CustomActionResultReceiver = str != null ? Double.parseDouble(str) : 0.0d;
                    String str2 = uri.MediaBrowserCompat$CustomActionResultReceiver;
                    write2.MediaBrowserCompat$ItemReceiver = str2 != null ? Double.parseDouble(str2) : 0.0d;
                    String str3 = uri.write;
                    if (str3 != null) {
                        d = Double.parseDouble(str3);
                    }
                    write2.write = d;
                }
                arrayList.add(write2);
            }
        }
        return arrayList;
    }

    public static onClickNext$MediaBrowserCompat$CustomActionResultReceiver MediaBrowserCompat$CustomActionResultReceiver(scheme scheme) {
        Double d;
        if (scheme == null) {
            return null;
        }
        String str = scheme.MediaBrowserCompat$ItemReceiver;
        if (str == null) {
            str = "";
        }
        String str2 = scheme.IconCompatParcelizer;
        if (str2 == null || (d = GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str2)) == null) {
            d = Double.valueOf(0.0d);
        }
        return new onClickNext$MediaBrowserCompat$CustomActionResultReceiver(str, d, MediaBrowserCompat$ItemReceiver((resolve) scheme));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.util.List<o.onEvent>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.interceptEvent write(p040o.build r6) {
        /*
            r0 = 0
            if (r6 == 0) goto L_0x0054
            o.interceptEvent r1 = new o.interceptEvent
            r1.<init>()
            java.lang.Integer r2 = r6.write
            r1.MediaBrowserCompat$ItemReceiver = r2
            java.lang.String r2 = r6.MediaBrowserCompat$CustomActionResultReceiver
            r1.MediaBrowserCompat$CustomActionResultReceiver = r2
            java.util.List<o.setPathSegment> r6 = r6.IconCompatParcelizer
            if (r6 == 0) goto L_0x0051
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.Iterator r6 = r6.iterator()
        L_0x0021:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L_0x004e
            java.lang.Object r3 = r6.next()
            o.setPathSegment r3 = (p040o.setPathSegment) r3
            if (r3 == 0) goto L_0x0047
            o.onEvent r4 = new o.onEvent
            r4.<init>()
            java.lang.String r5 = r3.MediaBrowserCompat$ItemReceiver
            r4.MediaBrowserCompat$ItemReceiver = r5
            java.lang.String r5 = r3.IconCompatParcelizer
            r4.write = r5
            java.lang.Boolean r3 = r3.read
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r3 = p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver((java.lang.Object) r3, (java.lang.Object) r5)
            r4.read = r3
            goto L_0x0048
        L_0x0047:
            r4 = r0
        L_0x0048:
            if (r4 == 0) goto L_0x0021
            r2.add(r4)
            goto L_0x0021
        L_0x004e:
            r0 = r2
            java.util.List r0 = (java.util.List) r0
        L_0x0051:
            r1.read = r0
            return r1
        L_0x0054:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.write(o.build):o.interceptEvent");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v7, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: java.util.List<o.getSmallestDisplacement>} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.setExpirationTime write(p040o.setInitialPoint r4) {
        /*
            o.setExpirationTime r0 = new o.setExpirationTime
            r0.<init>()
            if (r4 == 0) goto L_0x0061
            java.lang.String r1 = r4.write
            r0.MediaBrowserCompat$ItemReceiver = r1
            java.lang.String r1 = r4.IconCompatParcelizer
            r0.IconCompatParcelizer = r1
            java.lang.String r1 = r4.read
            r0.MediaBrowserCompat$CustomActionResultReceiver = r1
            java.lang.String r1 = r4.MediaBrowserCompat$SearchResultReceiver
            r0.MediaMetadataCompat = r1
            java.lang.String r1 = r4.MediaBrowserCompat$CustomActionResultReceiver
            r2 = 0
            org.threeten.bp.OffsetDateTime r1 = write((java.lang.String) r1, (org.threeten.p041bp.OffsetDateTime) r2)
            r0.read = r1
            java.util.List<o.Repeater> r4 = r4.MediaBrowserCompat$ItemReceiver
            if (r4 == 0) goto L_0x005f
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            java.lang.String r3 = "$this$collectionSizeOrDefault"
            p040o.onGetStartedClick.write((java.lang.Object) r4, (java.lang.String) r3)
            boolean r3 = r4 instanceof java.util.Collection
            if (r3 == 0) goto L_0x003a
            r2 = r4
            java.util.Collection r2 = (java.util.Collection) r2
            int r2 = r2.size()
        L_0x003a:
            r1.<init>(r2)
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.Iterator r4 = r4.iterator()
        L_0x0043:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r4.next()
            o.Repeater r2 = (p040o.Repeater) r2
            o.getSmallestDisplacement r3 = new o.getSmallestDisplacement
            r3.<init>()
            java.lang.String r2 = r2.write
            r3.MediaBrowserCompat$ItemReceiver = r2
            r1.add(r3)
            goto L_0x0043
        L_0x005c:
            r2 = r1
            java.util.List r2 = (java.util.List) r2
        L_0x005f:
            r0.write = r2
        L_0x0061:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.write(o.setInitialPoint):o.setExpirationTime");
    }

    public static List MediaBrowserCompat$ItemReceiver(getLogger getlogger, List list) {
        show show = new show(list);
        return (List) new show(show.write, new getSharedElementEnterTransition(show.IconCompatParcelizer, new wrapCollection.IconCompatParcelizer(getlogger))).write(new setupDialog.IconCompatParcelizer(new getArguments<List<T>>() {
            public final /* synthetic */ Object read() {
                return new ArrayList();
            }
        }, new ensureAnimationInfo<List<T>, T>() {
            public final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(Object obj, Object obj2) {
                ((List) obj).add(obj2);
            }
        }));
    }

    public static getRotateGesturesEnabled read(setDrawHoleEnabled setdrawholeenabled) {
        onGetStartedClick.write((Object) setdrawholeenabled, "$this$toDomain");
        return new getRotateGesturesEnabled(setdrawholeenabled.MediaBrowserCompat$ItemReceiver, setdrawholeenabled.IconCompatParcelizer, setdrawholeenabled.read, setdrawholeenabled.write, setdrawholeenabled.RatingCompat, setdrawholeenabled.MediaDescriptionCompat, setdrawholeenabled.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public static scrollGesturesEnabledDuringRotateOrZoom IconCompatParcelizer(setRotationAngle setrotationangle) {
        onGetStartedClick.write((Object) setrotationangle, "$this$toDomain");
        return new scrollGesturesEnabledDuringRotateOrZoom(setrotationangle.MediaBrowserCompat$CustomActionResultReceiver, setrotationangle.read, setrotationangle.MediaBrowserCompat$ItemReceiver, setrotationangle.IconCompatParcelizer, setrotationangle.write, setrotationangle.MediaMetadataCompat, setrotationangle.RatingCompat, setrotationangle.MediaBrowserCompat$MediaItem);
    }

    public static String MediaBrowserCompat$ItemReceiver(String str, String str2) {
        return ((str == null || str.trim().isEmpty()) || "null".equalsIgnoreCase(str)) ? str2 : str;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append("Android/");
        sb.append(Build.VERSION.RELEASE);
        sb.append(";FastEasy/");
        sb.append("3.40.1");
        sb.append("/");
        sb.append(4331);
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.close();
        r2.closeEntry();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0063, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r4.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r8.addSuppressed(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        r8.addSuppressed(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x007f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0082, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0087, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0088, code lost:
        r8.addSuppressed(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x008b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MediaBrowserCompat$CustomActionResultReceiver(java.lang.String r8) throws java.io.IOException {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            java.io.FileInputStream r1 = new java.io.FileInputStream
            r1.<init>(r8)
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream     // Catch:{ all -> 0x0080 }
            java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch:{ all -> 0x0080 }
            r3.<init>(r1)     // Catch:{ all -> 0x0080 }
            r2.<init>(r3)     // Catch:{ all -> 0x0080 }
            r3 = 1024(0x400, float:1.435E-42)
            byte[] r3 = new byte[r3]     // Catch:{ all -> 0x0074 }
        L_0x0018:
            java.util.zip.ZipEntry r4 = r2.getNextEntry()     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x006d
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x0074 }
            boolean r4 = r4.isDirectory()     // Catch:{ all -> 0x0074 }
            if (r4 == 0) goto L_0x0031
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x0074 }
            r4.<init>(r8, r5)     // Catch:{ all -> 0x0074 }
            r4.mkdirs()     // Catch:{ all -> 0x0074 }
            goto L_0x0018
        L_0x0031:
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ all -> 0x0074 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0074 }
            r6.<init>()     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = r0.getParent()     // Catch:{ all -> 0x0074 }
            r6.append(r7)     // Catch:{ all -> 0x0074 }
            java.lang.String r7 = "/"
            r6.append(r7)     // Catch:{ all -> 0x0074 }
            r6.append(r5)     // Catch:{ all -> 0x0074 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0074 }
            r4.<init>(r5)     // Catch:{ all -> 0x0074 }
        L_0x004e:
            int r5 = r2.read(r3)     // Catch:{ all -> 0x0061 }
            r6 = -1
            if (r5 == r6) goto L_0x005a
            r6 = 0
            r4.write(r3, r6, r5)     // Catch:{ all -> 0x0061 }
            goto L_0x004e
        L_0x005a:
            r4.close()     // Catch:{ all -> 0x0074 }
            r2.closeEntry()     // Catch:{ all -> 0x0074 }
            goto L_0x0018
        L_0x0061:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x0068 }
            goto L_0x006c
        L_0x0068:
            r3 = move-exception
            r8.addSuppressed(r3)     // Catch:{ all -> 0x0074 }
        L_0x006c:
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x006d:
            r2.close()     // Catch:{ all -> 0x0080 }
            r1.close()
            return
        L_0x0074:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            r2.close()     // Catch:{ all -> 0x007b }
            goto L_0x007f
        L_0x007b:
            r2 = move-exception
            r8.addSuppressed(r2)     // Catch:{ all -> 0x0080 }
        L_0x007f:
            throw r0     // Catch:{ all -> 0x0080 }
        L_0x0080:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x0087 }
            goto L_0x008b
        L_0x0087:
            r1 = move-exception
            r8.addSuppressed(r1)
        L_0x008b:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(java.lang.String):void");
    }

    public static String write(List<String> list, String str) {
        onGetStartedClick.write((Object) list, "$this$join");
        onGetStartedClick.write((Object) str, "separator");
        return HmlNTBBusinessURLInformationActivity.MediaBrowserCompat$ItemReceiver(list, str, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (FundFactSheetActivity) null, 62);
    }

    public static OffsetDateTime write(String str, OffsetDateTime offsetDateTime) {
        if (str == null) {
            return null;
        }
        try {
            if (str.length() <= 10) {
                return ProfileManagementAdapter$ProfileManagementHolder_ViewBinding.parse(str, new SequentialSearchAdapter$ItemViewHolder_ViewBinding().appendPattern("yyyy-MM-dd").parseDefaulting(TierPricingInstallmentAdapter$InstallmentViewHolder.NANO_OF_DAY, 0).toFormatter().withZone(LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.systemDefault())).toOffsetDateTime();
            }
            return OffsetDateTime.parse(str);
        } catch (DateTimeParseException e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "date format string is not ISO-8601 format (2018-04-17T07:55:01+00:00)", new Object[0]);
            return null;
        } catch (RuntimeException e2) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e2, "cannot create datetime object due to some settings are wrong", new Object[0]);
            return null;
        }
    }

    public static <R> R read(FundActionsSuccessActivity<? extends R> fundActionsSuccessActivity, R r) {
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "$this$tryMandatoryOr");
        try {
            R invoke = fundActionsSuccessActivity.invoke();
            return invoke != null ? invoke : r;
        } catch (Exception unused) {
            return r;
        }
    }

    public static byte read(String str) {
        if (str == null) {
            return Ascii.DC2;
        }
        String lowerCase = str.toLowerCase();
        if (lowerCase.contains("sha224")) {
            return 19;
        }
        if (lowerCase.contains("sha256")) {
            return Ascii.DC4;
        }
        if (lowerCase.contains("sha384")) {
            return Ascii.NAK;
        }
        if (lowerCase.contains("sha512")) {
            return Ascii.SYN;
        }
        return Ascii.DC2;
    }

    public static DebitCardResetOtpActivity<JSONObject> MediaBrowserCompat$ItemReceiver(File file, OkHttpClient okHttpClient, String str) {
        File file2 = new File(file, str.substring(str.lastIndexOf(47) + 1));
        if (!file2.exists()) {
            return DebitCardResetOtpActivity.fromCallable(new partition(str, okHttpClient)).flatMap(new removeIf(file2));
        }
        return DebitCardResetOtpActivity.fromCallable(new iterators(file2));
    }

    public static String write(Bundle bundle, String str) {
        onGetStartedClick.write((Object) str, "key");
        if (bundle == null) {
            return "";
        }
        String string = bundle.getString(str, "");
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(key, \"\")");
        return string;
    }

    public static Context write(Context context) {
        if (context == null) {
            return null;
        }
        Resources resources = context.getResources();
        onGetStartedClick.IconCompatParcelizer((Object) resources, "context.resources");
        Configuration configuration = resources.getConfiguration();
        onGetStartedClick.IconCompatParcelizer((Object) configuration, "context.resources.configuration");
        Locale locale = new Locale(onGetLayoutInflater.IconCompatParcelizer());
        configuration.setLocale(locale);
        Locale.setDefault(locale);
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = new LocaleList(new Locale[]{locale});
            LocaleList.setDefault(localeList);
            configuration.setLocales(localeList);
        }
        return context.createConfigurationContext(configuration);
    }

    public static void read(Context context, Locale locale) {
        onGetStartedClick.write((Object) locale, "locale");
        if (context != null) {
            Resources resources = context.getResources();
            onGetStartedClick.IconCompatParcelizer((Object) resources, "context.resources");
            Configuration configuration = resources.getConfiguration();
            onGetStartedClick.IconCompatParcelizer((Object) configuration, "context.resources.configuration");
            configuration.setLocale(locale);
            Locale.setDefault(locale);
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleList localeList = new LocaleList(new Locale[]{locale});
                LocaleList.setDefault(localeList);
                configuration.setLocales(localeList);
                context.getApplicationContext().createConfigurationContext(configuration);
                return;
            }
            context.getApplicationContext().createConfigurationContext(configuration);
        }
    }

    public static int read(setTitleMarginStart settitlemarginstart, FundFactSheetActivity<? super CardView, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) settitlemarginstart, "$this$makeTransaction");
        onGetStartedClick.write((Object) fundFactSheetActivity, "block");
        CardView read2 = settitlemarginstart.read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "this");
        fundFactSheetActivity.invoke(read2);
        return read2.write();
    }

    public static String write(String str) {
        onGetStartedClick.write((Object) str, "$this$toFileName");
        onGetStartedClick.write((Object) str, "$this$substringAfterLast");
        onGetStartedClick.write((Object) "/", "delimiter");
        onGetStartedClick.write((Object) str, "missingDelimiterValue");
        CharSequence charSequence = str;
        onGetStartedClick.write((Object) charSequence, "$this$lastIndex");
        int IconCompatParcelizer2 = GoodToKnowActivity.IconCompatParcelizer(charSequence, "/", charSequence.length() - 1, false);
        if (IconCompatParcelizer2 != -1) {
            str = str.substring(IconCompatParcelizer2 + 1, str.length());
            onGetStartedClick.IconCompatParcelizer((Object) str, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        return GoodToKnowActivity.MediaBrowserCompat$ItemReceiver(str, ".", str);
    }

    public static Utils.C39323.C12941 IconCompatParcelizer(reportDeviceAtPlace reportdeviceatplace) {
        onGetStartedClick.write((Object) reportdeviceatplace, "$this$toDisplay");
        String str = reportdeviceatplace.read;
        String str2 = reportdeviceatplace.MediaBrowserCompat$ItemReceiver;
        String str3 = "";
        if (str2 == null) {
            str2 = str3;
        }
        String str4 = reportdeviceatplace.write;
        if (str4 != null) {
            str3 = str4;
        }
        return new Utils.C39323.C12941(str, str2, str3);
    }

    public static String MediaBrowserCompat$ItemReceiver(Context context) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getApplicationInfo().packageName, 0);
        } catch (PackageManager.NameNotFoundException e) {
            onCheckBoxClick.write((Throwable) e);
            applicationInfo = null;
        }
        return (String) (applicationInfo != null ? packageManager.getApplicationLabel(applicationInfo) : "Unknown");
    }

    public static Uri read(Bitmap bitmap, String str, Context context) throws IOException {
        File file = new File(Environment.getExternalStorageDirectory(), MediaBrowserCompat$ItemReceiver(context));
        if (!file.exists()) {
            onCheckBoxClick.read("%s created %s", file.getAbsolutePath(), Boolean.valueOf(file.mkdir()));
        }
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(new Point());
        if (str != null) {
            str = str.replaceAll(":", ".");
        }
        File file2 = new File(file, str);
        if (!file2.exists()) {
            FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
            fileOutputStream.close();
        }
        bitmap.recycle();
        Uri fromFile = Uri.fromFile(file2);
        Uri IconCompatParcelizer2 = AppCompatTextView.IconCompatParcelizer(context, RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver, file2);
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", fromFile));
        return IconCompatParcelizer2;
    }

    public static Uri MediaBrowserCompat$ItemReceiver(Bitmap bitmap, Context context, String str) throws IOException {
        File file = new File(context.getFilesDir(), "images");
        if (!file.exists()) {
            onCheckBoxClick.read("%s created %s", file.getAbsolutePath(), Boolean.valueOf(file.mkdir()));
        }
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(new Point());
        if (str != null) {
            str = str.replaceAll(":", ".");
        }
        File file2 = new File(file, str);
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
        fileOutputStream.close();
        bitmap.recycle();
        Uri IconCompatParcelizer2 = AppCompatTextView.IconCompatParcelizer(context, RttiJsonBill_MembersInjector$MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver, file2);
        context.grantUriPermission("com.scb.phone.domain", IconCompatParcelizer2, 1);
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", IconCompatParcelizer2));
        return IconCompatParcelizer2;
    }

    public static <F extends BaseFragment & C1346xf91fc122> void MediaBrowserCompat$ItemReceiver(getTimeOutParameters gettimeoutparameters, Fragment fragment, BaseFragment baseFragment, String str) {
        fragment.getView().setVisibility(4);
        gettimeoutparameters.getSupportFragmentManager().read().write(R.id.container, baseFragment, baseFragment.getClass().getSimpleName()).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
    }

    public static void read(getTimeOutParameters gettimeoutparameters, C1346xf91fc122 gettimeoutparameters_mediabrowsercompat_customactionresultreceiver) {
        gettimeoutparameters.MediaSessionCompat$ResultReceiverWrapper().write(gettimeoutparameters_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat());
        gettimeoutparameters.ParcelableVolumeInfo().setCurrentState(gettimeoutparameters_mediabrowsercompat_customactionresultreceiver.ParcelableVolumeInfo());
        gettimeoutparameters.ParcelableVolumeInfo().setVisibility(gettimeoutparameters_mediabrowsercompat_customactionresultreceiver.setHasDecor() ? 0 : 8);
    }

    public static int read(Context context) {
        onGetStartedClick.write((Object) context, "$this$getResourceIdFromAttribute");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.profilePlaceholder, typedValue, true);
        return typedValue.resourceId;
    }

    public static void MediaBrowserCompat$ItemReceiver(ImageView imageView, String str, isReset isreset) {
        onGetStartedClick.write((Object) imageView, "$this$loadFromUrl");
        onGetStartedClick.write((Object) str, "imageUrl");
        getViewModelStore<Drawable> MediaBrowserCompat$ItemReceiver2 = Glide.MediaBrowserCompat$CustomActionResultReceiver((View) imageView).MediaBrowserCompat$ItemReceiver(str);
        if (isreset != null) {
            MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver((abandon<?>) isreset);
        }
        MediaBrowserCompat$ItemReceiver2.MediaBrowserCompat$ItemReceiver(imageView);
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context, RecyclerView recyclerView, List<CrashlyticsReport.Session.OperatingSystem.Builder> list, FragmentBuilder_BindBaseFragment fragmentBuilder_BindBaseFragment, boolean z) {
        PaymentInfoAdapter paymentInfoAdapter = new PaymentInfoAdapter(context, fragmentBuilder_BindBaseFragment, z);
        paymentInfoAdapter.write = list;
        paymentInfoAdapter.IconCompatParcelizer.write();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(paymentInfoAdapter);
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setVisibility(0);
    }

    public static reportFromJson read(Intent intent, Context context) {
        reportFromJson reportfromjson = null;
        try {
            Cursor query = context.getContentResolver().query(intent.getData(), new String[]{"data1", "data4", "display_name"}, (String) null, (String[]) null, (String) null);
            if (query != null) {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex("data1"));
                    String string2 = query.getString(query.getColumnIndex("display_name"));
                    reportFromJson reportfromjson2 = new reportFromJson();
                    reportfromjson2.MediaBrowserCompat$CustomActionResultReceiver = string2;
                    reportfromjson2.MediaBrowserCompat$ItemReceiver = string;
                    reportfromjson = reportfromjson2;
                }
                query.close();
            }
        } catch (Exception e) {
            onCheckBoxClick.MediaBrowserCompat$ItemReceiver(e, "findContact", new Object[0]);
        }
        return reportfromjson;
    }

    public static int IconCompatParcelizer(Context context) {
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        NetworkInfo activeNetworkInfo;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
            return false;
        }
        return "mobile".equalsIgnoreCase(activeNetworkInfo.getTypeName());
    }

    public static int RatingCompat(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (!(connectivityManager == null || connectivityManager.getActiveNetworkInfo() == null || !connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting())) {
            if (connectivityManager.getActiveNetworkInfo().getType() == 1) {
                return 1;
            }
            if (connectivityManager.getActiveNetworkInfo().getType() == 0) {
                return 0;
            }
        }
        return -1;
    }

    public static boolean MediaBrowserCompat$SearchResultReceiver(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities == null) {
                return false;
            }
            if (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1)) {
                return true;
            }
            return false;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    public static void read(AppBarLayout appBarLayout, int i, WeakReference<TextView> weakReference) {
        float abs = ((float) Math.abs(i)) / ((float) appBarLayout.MediaBrowserCompat$ItemReceiver());
        if (weakReference.get() != null) {
            weakReference.get().setAlpha(abs);
        }
    }

    public static boolean write(Intent intent, Context context) {
        if (context == null || intent == null || intent.getComponent() == null) {
            return false;
        }
        ComponentName component = intent.getComponent();
        if (component.equals(new Intent(context, GoManagePromptPayActivity.class).getComponent()) || component.equals(new Intent(context, InvestmentDetailsActivity.class).getComponent()) || component.equals(new Intent(context, RequestToPayActivity.class).getComponent())) {
            return true;
        }
        return false;
    }

    public static void IconCompatParcelizer(Context context, verifyReferral.write write2, verifyReferral.IconCompatParcelizer iconCompatParcelizer, verifyReferral.IconCompatParcelizer iconCompatParcelizer2, ViewGroup viewGroup, String str) {
        WebView webView = new WebView(context);
        webView.setWebChromeClient(new WebChromeClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setSupportZoom(true);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);
        webView.setWebViewClient(new verifyReferral(write2, iconCompatParcelizer, iconCompatParcelizer2));
        webView.clearCache(true);
        webView.clearHistory();
        try {
            String encode = URLEncoder.encode(str, "UTF-8");
            StringBuilder sb = new StringBuilder();
            sb.append("https://docs.google.com/gview?embedded=true&url=");
            sb.append(encode);
            String obj = sb.toString();
            WebViewAsp.aspectOf();
            try {
                Context context2 = webView.getContext();
                new onRotateClicked();
                String write3 = onRotateClicked.write(obj);
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
                sb2.append(write3);
                sb2.append("\n with context ");
                sb2.append(context2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb2.toString());
                webView.loadUrl(write3);
            } catch (Throwable th) {
                th.printStackTrace();
            }
            viewGroup.removeAllViews();
            viewGroup.addView(webView);
        } catch (UnsupportedEncodingException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    public static void write(Activity activity, int i, int i2, String str, int i3) {
        MediaBrowserCompat$CustomActionResultReceiver(activity, activity.findViewById(i), i2, str, R.color.f71012131100257, i3, 0, (TSnackbar.IconCompatParcelizer) null, 0, (View.OnClickListener) null, 0);
    }

    public static void read(Activity activity, int i, int i2, String str, int i3, int i4, int i5) {
        MediaBrowserCompat$CustomActionResultReceiver(activity, activity.findViewById(i), i2, str, R.color.f71012131100257, i4, i5, (TSnackbar.IconCompatParcelizer) null, 0, (View.OnClickListener) null, 0);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Activity activity, View view, int i, String str, int i2, int i3, int i4, TSnackbar.IconCompatParcelizer iconCompatParcelizer, int i5, View.OnClickListener onClickListener, int i6) {
        if (!activity.isFinishing()) {
            if (view == null) {
                onCheckBoxClick.read("view for displaying Snackbar is null", new Object[0]);
                return;
            }
            TSnackbar write2 = TSnackbar.write(view, str, i6);
            int unused = write2.RatingCompat.MediaBrowserCompat$MediaItem = AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS;
            if (i > 0) {
                write2.MediaBrowserCompat$ItemReceiver(i);
                write2.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver.setCompoundDrawablePadding(24);
            }
            if (iconCompatParcelizer != null) {
                write2.IconCompatParcelizer = iconCompatParcelizer;
            }
            if (onClickListener != null) {
                write2.read(write2.write.getText(i5), onClickListener);
            }
            TSnackbar.SnackbarLayout snackbarLayout = write2.RatingCompat;
            if (i4 > 0) {
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) snackbarLayout.getLayoutParams();
                layoutParams.gravity = 49;
                snackbarLayout.setLayoutParams(layoutParams);
                snackbarLayout.setPadding(0, i4, 0, 0);
            }
            snackbarLayout.setBackgroundColor(setLastBaselineToBottomHeight.read(activity, i3));
            TextView textView = (TextView) snackbarLayout.findViewById(R.id.snackbar_text);
            textView.setTextColor(setLastBaselineToBottomHeight.read(activity, i2));
            textView.setTextSize(0, activity.getResources().getDimension(R.dimen.f72302131165354));
            textView.setMaxLines(10);
            CalligraphyUtils.applyFontToTextView((Context) activity, textView, "fonts/db_heavent_medium.ttf");
            if (setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver == null) {
                setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver = new setShowsDialog();
            }
            setShowsDialog.MediaBrowserCompat$CustomActionResultReceiver.read(write2.read, write2.MediaBrowserCompat$ItemReceiver);
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(AppCompatActivity appCompatActivity, Fragment fragment, int i) {
        onGetStartedClick.write((Object) appCompatActivity, "$this$addFragment");
        onGetStartedClick.write((Object) fragment, "fragment");
        setTitleMarginStart supportFragmentManager = appCompatActivity.getSupportFragmentManager();
        onGetStartedClick.IconCompatParcelizer((Object) supportFragmentManager, "supportFragmentManager");
        CardView read2 = supportFragmentManager.read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "beginTransaction()");
        CardView MediaBrowserCompat$CustomActionResultReceiver2 = read2.MediaBrowserCompat$CustomActionResultReceiver(i, fragment);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "add(frameId, fragment)");
        MediaBrowserCompat$CustomActionResultReceiver2.write();
    }

    public static /* synthetic */ void IconCompatParcelizer(EditText editText, boolean z) {
        onGetStartedClick.write((Object) editText, "$this$phoneFormat");
        String obj = editText.getText().toString();
        if (z) {
            editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(12)});
            editText.setText(getICheckDeserializerRtti.IconCompatParcelizer(false, true, obj));
            return;
        }
        editText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(10)});
        if (obj != null && !obj.equals("")) {
            obj = obj.replace("-", "");
        }
        editText.setText(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0069  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ android.net.Uri MediaBrowserCompat$ItemReceiver(p040o.getUuidUtf8Bytes r6, android.content.Context r7, boolean r8) throws java.lang.Exception {
        /*
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = r6.ParcelableVolumeInfo
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "CHEQUE_%s.jpg"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout     // Catch:{ all -> 0x0064 }
            r1.<init>(r7)     // Catch:{ all -> 0x0064 }
            android.widget.LinearLayout$LayoutParams r3 = new android.widget.LinearLayout$LayoutParams     // Catch:{ all -> 0x0064 }
            r4 = -1
            r5 = -2
            r3.<init>(r4, r5)     // Catch:{ all -> 0x0064 }
            r1.setLayoutParams(r3)     // Catch:{ all -> 0x0064 }
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r7)     // Catch:{ all -> 0x0064 }
            r4 = 2131494347(0x7f0c05cb, float:1.86122E38)
            android.view.View r1 = r3.inflate(r4, r1, r2)     // Catch:{ all -> 0x0064 }
            com.scb.phone.view.fragment.chequemanagement.ChequeScreenshotFragment r2 = new com.scb.phone.view.fragment.chequemanagement.ChequeScreenshotFragment     // Catch:{ all -> 0x0064 }
            r2.<init>()     // Catch:{ all -> 0x0064 }
            r2.write(r6, r1, r7)     // Catch:{ all -> 0x0064 }
            android.util.DisplayMetrics r6 = new android.util.DisplayMetrics     // Catch:{ all -> 0x0064 }
            r6.<init>()     // Catch:{ all -> 0x0064 }
            java.lang.String r2 = "window"
            java.lang.Object r2 = r7.getSystemService(r2)     // Catch:{ all -> 0x0064 }
            android.view.WindowManager r2 = (android.view.WindowManager) r2     // Catch:{ all -> 0x0064 }
            android.view.Display r2 = r2.getDefaultDisplay()     // Catch:{ all -> 0x0064 }
            r2.getMetrics(r6)     // Catch:{ all -> 0x0064 }
            int r2 = r6.widthPixels     // Catch:{ all -> 0x0064 }
            int r6 = r6.widthPixels     // Catch:{ all -> 0x0064 }
            int r6 = r6 << 2
            android.graphics.Bitmap r6 = IconCompatParcelizer((android.view.View) r1, (int) r2, (int) r6)     // Catch:{ all -> 0x0064 }
            if (r8 == 0) goto L_0x0056
            android.net.Uri r7 = read((android.graphics.Bitmap) r6, (java.lang.String) r0, (android.content.Context) r7)     // Catch:{ all -> 0x0062 }
            goto L_0x005c
        L_0x0056:
            java.lang.String r8 = "screen_image.jpg"
            android.net.Uri r7 = MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r6, (android.content.Context) r7, (java.lang.String) r8)     // Catch:{ all -> 0x0062 }
        L_0x005c:
            if (r6 == 0) goto L_0x0061
            r6.recycle()
        L_0x0061:
            return r7
        L_0x0062:
            r7 = move-exception
            goto L_0x0067
        L_0x0064:
            r6 = move-exception
            r7 = r6
            r6 = 0
        L_0x0067:
            if (r6 == 0) goto L_0x006c
            r6.recycle()
        L_0x006c:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(o.getUuidUtf8Bytes, android.content.Context, boolean):android.net.Uri");
    }

    public static boolean MediaBrowserCompat$MediaItem(String str) {
        return HomeActivity.class.getName().equalsIgnoreCase(str) || CreditCardBilledDetailActivity.class.getName().equalsIgnoreCase(str) || CreditCardDetailActivity.class.getName().equalsIgnoreCase(str) || DepositDetailActivity.class.getName().equalsIgnoreCase(str) || InvestmentDetailsActivity.class.getName().equalsIgnoreCase(str) || DiscoverSearchActivity.class.getName().equalsIgnoreCase(str) || DiscoverDisclaimerActivity.class.getName().equalsIgnoreCase(str) || DiscoverFundFilterActivity.class.getName().equalsIgnoreCase(str) || DiscoverFundFilterListActivity.class.getName().equalsIgnoreCase(str) || DeviceSettingsActivity.class.getName().equalsIgnoreCase(str) || LoanDetailActivity.class.getName().equalsIgnoreCase(str) || MediaImagePreviewActivity.class.getName().equalsIgnoreCase(str) || PersonalLimitActivity.class.getName().equalsIgnoreCase(str) || EnterProxyActivity.class.getName().equalsIgnoreCase(str) || InputDetailsActivity.class.getName().equalsIgnoreCase(str) || RequestToPayActivity.class.getName().equalsIgnoreCase(str) || CardPaySelectedActivity.class.getName().equalsIgnoreCase(str) || EditFavouriteActivity.class.getName().equalsIgnoreCase(str) || FavouriteSelectedActivity.class.getName().equalsIgnoreCase(str) || NewTransactionActivity.class.getName().equalsIgnoreCase(str) || TransferActivity.class.getName().equalsIgnoreCase(str) || TopUpActivity.class.getName().equalsIgnoreCase(str) || BillPaymentActivity.class.getName().equalsIgnoreCase(str) || ReviewActivity.class.getName().equalsIgnoreCase(str) || BillPaymentReviewActivity.class.getName().equalsIgnoreCase(str) || TopUpReviewActivity.class.getName().equalsIgnoreCase(str) || TransferReviewActivity.class.getName().equalsIgnoreCase(str) || SuccessActivity.class.getName().equalsIgnoreCase(str) || SharingMomentsPreviewActivity.class.getName().equalsIgnoreCase(str) || CardlessATMTutorialActivity.class.getName().equalsIgnoreCase(str) || ModifyQuickPromptPayActivity.class.getName().equalsIgnoreCase(str) || ModifyQuickBalanceActivity.class.getName().equalsIgnoreCase(str) || SetupQuickPromptPayActivity.class.getName().equalsIgnoreCase(str) || SetupQuickBalanceActivity.class.getName().equalsIgnoreCase(str) || GoManagePromptPayActivity.class.getName().equalsIgnoreCase(str) || InvestmentFundDetailsActivity.class.getName().equalsIgnoreCase(str) || PayerReviewActivity.class.getName().equalsIgnoreCase(str) || SummaryDetailActivity.class.getName().equalsIgnoreCase(str) || CardlessAtmInfoActivity.class.getName().equalsIgnoreCase(str) || CardlessATMTermsConditionsActivity.class.getName().equalsIgnoreCase(str) || CardlessATMReviewActivity.class.getName().equalsIgnoreCase(str) || CardlessATMSuccessfulRequestActivity.class.getName().equalsIgnoreCase(str) || CardlessATMActivity.class.getName().equalsIgnoreCase(str) || RtpEBillPaymentDetailActivity.class.getName().equalsIgnoreCase(str) || RtpEBillPaymentReviewActivity.class.getName().equalsIgnoreCase(str) || EBillSubscriptionActivity.class.getName().equalsIgnoreCase(str) || RewardsHomeActivity.class.getName().equalsIgnoreCase(str) || ProductListActivity.class.getName().equalsIgnoreCase(str) || ProductDetailActivity.class.getName().equalsIgnoreCase(str) || RewardSearchActivity.class.getName().equalsIgnoreCase(str) || RewardSearchResultActivity.class.getName().equalsIgnoreCase(str) || PromptPayQRActivity.class.getName().equalsIgnoreCase(str) || ReviewRedemptionActivity.class.getName().equalsIgnoreCase(str) || FixedTransferSuccessActivity.class.getName().equalsIgnoreCase(str) || ConfirmRedemptionActivity.class.getName().equalsIgnoreCase(str) || BulkTransferActivity.class.getName().equalsIgnoreCase(str) || BulkTransferInputActivity.class.getName().equalsIgnoreCase(str) || CreateRecipientGroupActivity.class.getName().equalsIgnoreCase(str) || GiftingActivity.class.getName().equalsIgnoreCase(str) || GiftingTransferLandingActivity.class.getName().equalsIgnoreCase(str) || GiftOpenSharingMomentActivity.class.getName().equalsIgnoreCase(str) || GiftingOpenedActivity.class.getName().equalsIgnoreCase(str) || GiftingMoneyReviewActivity.class.getName().equalsIgnoreCase(str) || ChequeStatusActivity.class.getName().equalsIgnoreCase(str) || StopChequeLandingActivity.class.getName().equalsIgnoreCase(str) || ActivateChequeLandingActivity.class.getName().equalsIgnoreCase(str) || SelectRecipientFromFavouriteActivity.class.getName().equalsIgnoreCase(str) || AddNewRecipientActivity.class.getName().equalsIgnoreCase(str) || ManageRecipientGroupActivity.class.getName().equalsIgnoreCase(str) || ManageEmailLandingActivity.class.getName().equalsIgnoreCase(str) || ManageEmailInputActivity.class.getName().equalsIgnoreCase(str) || ManageEmailVerificationActivity.class.getName().equalsIgnoreCase(str) || ManageEmailVerificationSuccessActivity.class.getName().equalsIgnoreCase(str) || ExportStatementSuccessfulActivity.class.getName().equalsIgnoreCase(str) || DepositExportStatementActivity.class.getName().equalsIgnoreCase(str) || CardActivationActivity.class.getName().equalsIgnoreCase(str) || LoanInputActivity.class.getName().equalsIgnoreCase(str) || PurchaseInputActivity.class.getName().equalsIgnoreCase(str) || PinChangeActivity.class.getName().equalsIgnoreCase(str) || CustomizeYourPageActivity.class.getName().equalsIgnoreCase(str) || ProfileManagementActivity.class.getName().equalsIgnoreCase(str) || MileageQuantitySelectionActivity.class.getName().equalsIgnoreCase(str) || MileageAirlineMembershipDetailsActivity.class.getName().equalsIgnoreCase(str) || MileageReviewRedemptionActivity.class.getName().equalsIgnoreCase(str) || MileageConfirmRedemptionActivity.class.getName().equalsIgnoreCase(str) || OrderChequeReviewActivity.class.getName().equalsIgnoreCase(str) || OrderChequeLandingActivity.class.getName().equalsIgnoreCase(str) || ActivateChequeReviewActivity.class.getName().equalsIgnoreCase(str) || StopChequeReviewActivity.class.getName().equalsIgnoreCase(str) || ChequeReviewActivity.class.getName().equalsIgnoreCase(str) || FundOnboardingLandingActivity.class.getName().equalsIgnoreCase(str) || CheckEligibilityActivity.class.getName().equalsIgnoreCase(str) || EDonationConsentActivity.class.getName().equalsIgnoreCase(str) || SmeLoanDetailActivity.class.getName().equalsIgnoreCase(str) || FundAppFormActivity.class.getName().equalsIgnoreCase(str) || FatcaActivity.class.getName().equalsIgnoreCase(str) || FundOtpActivity.class.getName().equalsIgnoreCase(str) || FundOnboardingSuccessActivity.class.getName().equalsIgnoreCase(str) || AssessmentPopupActivity.class.getName().equalsIgnoreCase(str) || RiskLevelAssessmentActivity.class.getName().equalsIgnoreCase(str) || RiskAssessmentSuccessActivity.class.getName().equalsIgnoreCase(str) || QuantitySelectionActivity.class.getName().equalsIgnoreCase(str) || ActivationSuccessfulActivity.class.getName().equalsIgnoreCase(str) || FundPurchaseLandingActivity.class.getName().equalsIgnoreCase(str) || FundActionsSearchActivity.class.getName().equalsIgnoreCase(str) || FundActionsSuccessActivity.class.getName().equalsIgnoreCase(str) || FundPurchaseReviewActivity.class.getName().equalsIgnoreCase(str) || FundRedeemLandingActivity.class.getName().equalsIgnoreCase(str) || FundSwitchLandingActivity.class.getName().equalsIgnoreCase(str) || FundRedeemReviewActivity.class.getName().equalsIgnoreCase(str) || FundSwitchReviewActivity.class.getName().equalsIgnoreCase(str) || RequestToPayInfoActivity.class.getName().equalsIgnoreCase(str) || CalendarDialogActivity.class.getName().equalsIgnoreCase(str) || ScheduleLandingActivity.class.getName().equalsIgnoreCase(str) || ContactUsActivity.class.getName().equalsIgnoreCase(str) || ScheduleBulkTransferActivity.class.getName().equalsIgnoreCase(str) || ScheduleTransactionActivity.class.getName().equalsIgnoreCase(str) || QuickOperationSuccessActivity.class.getName().equalsIgnoreCase(str) || RtpEBillSubscriptionDetailActivity.class.getName().equalsIgnoreCase(str) || EBillSubscriptionSearchActivity.class.getName().equalsIgnoreCase(str) || EBillSubscriptionInputActivity.class.getName().equalsIgnoreCase(str) || EBillSubscriptionReviewActivity.class.getName().equalsIgnoreCase(str) || RequesterReviewActivity.class.getName().equalsIgnoreCase(str) || GiftingAboutActivity.class.getName().equalsIgnoreCase(str) || GiftRecipientActivity.class.getName().equalsIgnoreCase(str) || GiftingSelectRecipientActivity.class.getName().equalsIgnoreCase(str) || GiftPreviewActivity.class.getName().equalsIgnoreCase(str) || AddFavoriteTransferActivity.class.getName().equalsIgnoreCase(str) || BulkTransferInfoActivity.class.getName().equalsIgnoreCase(str) || EditRecipientActivity.class.getName().equalsIgnoreCase(str) || BulkTransferReviewActivity.class.getName().equalsIgnoreCase(str) || BulkTransferOtpActivity.class.getName().equalsIgnoreCase(str) || BulkTransferSuccessActivity.class.getName().equalsIgnoreCase(str) || GiftingPresentReviewActivity.class.getName().equalsIgnoreCase(str) || LoanPaymentReviewActivity.class.getName().equalsIgnoreCase(str) || PinChangeSuccessActivity.class.getName().equalsIgnoreCase(str) || ManageChequeActivity.class.getName().equalsIgnoreCase(str) || ChequeSuccessActivity.class.getName().equalsIgnoreCase(str) || OrderChequeHelpActivity.class.getName().equalsIgnoreCase(str) || TempLimitHomeActivity.class.getName().equalsIgnoreCase(str) || TempLimitReviewActivity.class.getName().equalsIgnoreCase(str) || TempLimitConfirmationActivity.class.getName().equalsIgnoreCase(str) || BondLandingActivity.class.getName().equalsIgnoreCase(str) || BondPurchaseReviewActivity.class.getName().equalsIgnoreCase(str) || BondTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || ReviewSuccessfulActivity.class.getName().equalsIgnoreCase(str) || PurchaseReviewActivity.class.getName().equalsIgnoreCase(str) || ETBCheckEligibilityActivity.class.getName().equalsIgnoreCase(str) || EtbActivity.class.getName().equalsIgnoreCase(str) || ETBSaleSheetAccountTypeActivity.class.getName().equalsIgnoreCase(str) || ETBSaleSheetProductListActivity.class.getName().equalsIgnoreCase(str) || PdfViewerActivity.class.getName().equalsIgnoreCase(str) || BaseOtpActivity.class.getName().equalsIgnoreCase(str) || EtbOtpActivity.class.getName().equalsIgnoreCase(str) || ManageFastPayQrScanActivity.class.getName().equalsIgnoreCase(str) || FastPaySettingActivity.class.getName().equalsIgnoreCase(str) || FastPayOtpActivity.class.getName().equalsIgnoreCase(str) || EtbSuccessActivity.class.getName().equalsIgnoreCase(str) || ETBSetDetailNoteActivity.class.getName().equalsIgnoreCase(str) || AccountManagementActivity.class.getName().equalsIgnoreCase(str) || AddAccountsActivity.class.getName().equalsIgnoreCase(str) || ManageAccountInboundActivity.class.getName().equalsIgnoreCase(str) || ReviewAccountsActivity.class.getName().equalsIgnoreCase(str) || AccountManagementSuccessActivity.class.getName().equalsIgnoreCase(str) || DebitCardLandingActivity.class.getName().equalsIgnoreCase(str) || DebitCardMarketConductActivity.class.getName().equalsIgnoreCase(str) || DebitCardProductCatalogActivity.class.getName().equalsIgnoreCase(str) || DebitCardSaleSheetActivity.class.getName().equalsIgnoreCase(str) || DebitCardRequestTermsConditionsActivity.class.getName().equalsIgnoreCase(str) || DebitCardRequestInputActivity.class.getName().equalsIgnoreCase(str) || DebitCardActivationActivity.class.getName().equalsIgnoreCase(str) || DebitCardRequestPayOtpActivity.class.getName().equalsIgnoreCase(str) || DebitCardRequestReviewActivity.class.getName().equalsIgnoreCase(str) || DebitCardRequestSuccessActivity.class.getName().equalsIgnoreCase(str) || DebitCardSuccessfulActivationActivity.class.getName().equalsIgnoreCase(str) || DebitCardConfirmPinActivity.class.getName().equalsIgnoreCase(str) || DebitCardOtpActivationActivity.class.getName().equalsIgnoreCase(str) || DebitCardCoachMarkActivity.class.getName().equalsIgnoreCase(str) || DealsBuyReviewActivity.class.getName().equalsIgnoreCase(str) || DealsSuccessActivity.class.getName().equalsIgnoreCase(str) || DeejungTransferInstallmentOtpActivity.class.getName().equalsIgnoreCase(str) || DeejungTransferMinFullOtpActivity.class.getName().equalsIgnoreCase(str) || SelectPurchasesActivity.class.getName().equalsIgnoreCase(str) || CCAboutActivity.class.getName().equalsIgnoreCase(str) || DeejungPlansActivity.class.getName().equalsIgnoreCase(str) || DeejungInstallmentsReviewActivity.class.getName().equalsIgnoreCase(str) || DeejungTransferInstallmentsReviewActivity.class.getName().equalsIgnoreCase(str) || AmortizationActivity.class.getName().equalsIgnoreCase(str) || AmortizationMerchantsActivity.class.getName().equalsIgnoreCase(str) || DeejungInstallmentsConfirmationActivity.class.getName().equalsIgnoreCase(str) || DeejungTransferInstallmentsConfirmationActivity.class.getName().equalsIgnoreCase(str) || LinkAndUnlinkPromptPayActivity.class.getName().equalsIgnoreCase(str) || ManagePromptpayLandingActivity.class.getName().equalsIgnoreCase(str) || ManagePromptpaySuccessActivity.class.getName().equalsIgnoreCase(str) || PromptPayTermsAndConditionsLandingActivity.class.getName().equalsIgnoreCase(str) || PromptPayOtpActivity.class.getName().equalsIgnoreCase(str) || PromptPayTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || EasycashNCBConsentActivity.class.getName().equalsIgnoreCase(str) || EasycashCollateralInformationActivity.class.getName().equalsIgnoreCase(str) || EasycashSuccessActivity.class.getName().equalsIgnoreCase(str) || EasycashActivity.class.getName().equalsIgnoreCase(str) || EasycashIssuerSearchActivity.class.getName().equalsIgnoreCase(str) || EasycashInputIncomeActivity.class.getName().equalsIgnoreCase(str) || EasycashLandingActivity.class.getName().equalsIgnoreCase(str) || EasycashReferralSendProductActivity.class.getName().equalsIgnoreCase(str) || EasycashOccupationSearchActivity.class.getName().equalsIgnoreCase(str) || EasycashSubDistrictSearchActivity.class.getName().equalsIgnoreCase(str) || EasycashCreditCardIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashMCMCIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashSpeedyCashIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashSpeedyLoanIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashSpeedyLoanTopupIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashSequentialSearchActivity.class.getName().equalsIgnoreCase(str) || ChubbReviewActivity.class.getName().equalsIgnoreCase(str) || CloseAccountEligibilityActivity.class.getName().equalsIgnoreCase(str) || CloseAccountConfirmationOtpActivity.class.getName().equalsIgnoreCase(str) || CloseAccountAmountDetailsActivity.class.getName().equalsIgnoreCase(str) || CloseAccountReviewActivity.class.getName().equalsIgnoreCase(str) || CloseAccountSelectionActivity.class.getName().equalsIgnoreCase(str) || CloseAccountSuccessActivity.class.getName().equalsIgnoreCase(str) || MerchantWalletDetailActivity.class.getName().equalsIgnoreCase(str) || VerifyIdentityActivity.class.getName().equalsIgnoreCase(str) || VerifyIdentityTipsActivity.class.getName().equalsIgnoreCase(str) || ChubbPaySuccessActivity.class.getName().equalsIgnoreCase(str) || EasycashPurposefulLoanIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashCommercialLoanIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashMortgageIntroductionActivity.class.getName().equalsIgnoreCase(str) || EasycashAdditionalDocumentTypeActivity.class.getName().equalsIgnoreCase(str) || EasycashCreditPowerInputActivity.class.getName().equalsIgnoreCase(str) || EasycashCreditPowerInformationActivity.class.getName().equalsIgnoreCase(str) || EasycashLoanTrackActivity.class.getName().equalsIgnoreCase(str) || EasycashCarInformationActivity.class.getName().equalsIgnoreCase(str) || MwTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || MwLandingActivity.class.getName().equalsIgnoreCase(str) || MwBankAccountActivity.class.getName().equalsIgnoreCase(str) || MwCurrentUserEwalletActivity.class.getName().equalsIgnoreCase(str) || MwBusinessDetailsActivity.class.getName().equalsIgnoreCase(str) || MwCoachMarkActivity.class.getName().equalsIgnoreCase(str) || MwCreateQrActivity.class.getName().equalsIgnoreCase(str) || MwEditCreateQrActivity.class.getName().equalsIgnoreCase(str) || MwManageWalletActivity.class.getName().equalsIgnoreCase(str) || MwOnboardInfoActivity.class.getName().equalsIgnoreCase(str) || MwOnBoardSuccessActivity.class.getName().equalsIgnoreCase(str) || MwPartnerCropPhotoActivity.class.getName().equalsIgnoreCase(str) || MwReviewActivity.class.getName().equalsIgnoreCase(str) || MwSearchMarketMallActivity.class.getName().equalsIgnoreCase(str) || MwShopAddressActivity.class.getName().equalsIgnoreCase(str) || MwShopTypeActivity.class.getName().equalsIgnoreCase(str) || MwCasaOtpActivity.class.getName().equalsIgnoreCase(str) || MwManageReceivingAccountActivity.class.getName().equalsIgnoreCase(str) || MwChangeCasaSuccessActivity.class.getName().equalsIgnoreCase(str) || MwPinShopLocationActivity.class.getName().equalsIgnoreCase(str) || MwPinnedSuccessActivity.class.getName().equalsIgnoreCase(str) || MwSubDistrictSearchActivity.class.getName().equalsIgnoreCase(str) || ScbsLandingActivity.class.getName().equalsIgnoreCase(str) || ScbsAccountDetailActivity.class.getName().equalsIgnoreCase(str) || AddAccountInfoActivity.class.getName().equalsIgnoreCase(str) || AddAccountConsentActivity.class.getName().equalsIgnoreCase(str) || OffshoreCurrencyActivity.class.getName().equalsIgnoreCase(str) || SCBSProductDetailActivity.class.getName().equalsIgnoreCase(str) || NdidIdpVerificationActivity.class.getName().equalsIgnoreCase(str) || IdpShareInformationActivity.class.getName().equalsIgnoreCase(str) || IdpLivenessCheckActivity.class.getName().equalsIgnoreCase(str) || NdidIdpShareSuccessActivity.class.getName().equalsIgnoreCase(str) || BillPaymentSuccessActivity.class.getName().equalsIgnoreCase(str) || ScbsOnboardingLaserIdActivity.class.getName().equalsIgnoreCase(str) || OnboardingFatcaQuestionsActivity.class.getName().equalsIgnoreCase(str) || ScbsOnboardingProductCatalogActivity.class.getName().equalsIgnoreCase(str) || CheckSCBSEligibilityActivity.class.getName().equalsIgnoreCase(str) || ScbsOnboardingConsentActivity.class.getName().equalsIgnoreCase(str) || AddAccountOtpActivity.class.getName().equalsIgnoreCase(str) || PrepaidDetailsActivity.class.getName().equalsIgnoreCase(str) || DebitCardDetailActivity.class.getName().equalsIgnoreCase(str) || DebitWithdrawalLimitActivity.class.getName().equalsIgnoreCase(str) || DebitLimitOtpActivity.class.getName().equalsIgnoreCase(str) || SCBSFormActivity.class.getName().equalsIgnoreCase(str) || DocumentInstructionsActivity.class.getName().equalsIgnoreCase(str) || CaptureDocumentActivity.class.getName().equalsIgnoreCase(str) || ReviewDocumentActivity.class.getName().equalsIgnoreCase(str) || CropDocumentActivity.class.getName().equalsIgnoreCase(str) || HmlVerifyEmailActivity.class.getName().equalsIgnoreCase(str) || HmlRepaymentMethodAboutActivity.class.getName().equalsIgnoreCase(str) || HmlOccupationInfoActivity.class.getName().equalsIgnoreCase(str) || HmlMonthlyIncomeAboutActivity.class.getName().equalsIgnoreCase(str) || HmlWorkAddressActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessAddressActivity.class.getName().equalsIgnoreCase(str) || HmlConsentActivity.class.getName().equalsIgnoreCase(str) || HmlETBReviewActivity.class.getName().equalsIgnoreCase(str) || HmlETBPersonalInfoActivity.class.getName().equalsIgnoreCase(str) || HmlETBLoanSetupActivity.class.getName().equalsIgnoreCase(str) || HmlETBAccountSetupActivity.class.getName().equalsIgnoreCase(str) || HmlEtbSubmissionOtpActivity.class.getName().equalsIgnoreCase(str) || HmlEtbConfirmationOtpActivity.class.getName().equalsIgnoreCase(str) || HmlETBLandingActivity.class.getName().equalsIgnoreCase(str) || HmlRepaymentAboutActivity.class.getName().equalsIgnoreCase(str) || HmlSimulatorAboutActivity.class.getName().equalsIgnoreCase(str) || HmlSimulatorTutorialActivity.class.getName().equalsIgnoreCase(str) || HmlETBLoanReviewActivity.class.getName().equalsIgnoreCase(str) || HmlLaserIdAboutActivity.class.getName().equalsIgnoreCase(str) || HmlVerifyEmailSuccessfulActivity.class.getName().equalsIgnoreCase(str) || HmlETBSuccessActivity.class.getName().equalsIgnoreCase(str) || HmlSelectedOfferReviewActivity.class.getName().equalsIgnoreCase(str) || HmlETBSummaryActivity.class.getName().equalsIgnoreCase(str) || HmlAdditionalDocumentActivity.class.getName().equalsIgnoreCase(str) || HmlCropDocumentActivity.class.getName().equalsIgnoreCase(str) || HmlCaptureDocumentActivity.class.getName().equalsIgnoreCase(str) || HmlETBOperatingBankActivity.class.getName().equalsIgnoreCase(str) || BScanCEntryPointActivity.class.getName().equalsIgnoreCase(str) || ManageQrToPayActivity.class.getName().equalsIgnoreCase(str) || QrToPayOtpActivity.class.getName().equalsIgnoreCase(str) || QRPaymentActivity.class.getName().equalsIgnoreCase(str) || CommercialReferralNCBConsentActivity.class.getName().equalsIgnoreCase(str) || HmlDocumentSubmissionActivity.class.getName().equalsIgnoreCase(str) || EasycashCommonNCBConsentActivity.class.getName().equalsIgnoreCase(str) || EasycashCreditPowerSummaryActivity.class.getName().equalsIgnoreCase(str) || ChequeAnnouncementActivity.class.getName().equalsIgnoreCase(str) || BankingEnterAmountActivity.class.getName().equalsIgnoreCase(str) || GenerateQRActivity.class.getName().equalsIgnoreCase(str) || BankingAgentReviewActivity.class.getName().equalsIgnoreCase(str) || BankingAgentTCActivity.class.getName().equalsIgnoreCase(str) || BankingAgentTransactionsDeepLinkActivity.class.getName().equalsIgnoreCase(str) || BankingAgentSuccessActivity.class.getName().equalsIgnoreCase(str) || ServiceAtBankingAgentCoachMarkActivity.class.getName().equalsIgnoreCase(str) || ServiceAtBankingAgentActivity.class.getName().equalsIgnoreCase(str) || HmlDocumentListActivity.class.getName().equalsIgnoreCase(str) || HmlDocumentUploadGuidelineActivity.class.getName().equalsIgnoreCase(str) || JuristicRequestFormActivity.class.getName().equalsIgnoreCase(str) || DebitPrepaidMenuActivity.class.getName().equalsIgnoreCase(str) || PrepaidRequestMarketConductActivity.class.getName().equalsIgnoreCase(str) || PrepaidRequestProductCatalogActivity.class.getName().equalsIgnoreCase(str) || PrepaidRequestLandingActivity.class.getName().equalsIgnoreCase(str) || PrepaidRequestTermConditionsActivity.class.getName().equalsIgnoreCase(str) || PrepaidRequestReviewActivity.class.getName().equalsIgnoreCase(str) || PrepaidActivationLandingActivity.class.getName().equalsIgnoreCase(str) || PrepaidActivationSuccessfulActivity.class.getName().equalsIgnoreCase(str) || PrepaidConfirmPinActivity.class.getName().equalsIgnoreCase(str) || PrepaidOtpActivity.class.getName().equalsIgnoreCase(str) || PrepaidResetOtpActivity.class.getName().equalsIgnoreCase(str) || PrepaidResetPinSuccessActivity.class.getName().equalsIgnoreCase(str) || AddNewCurrencyActivity.class.getName().equalsIgnoreCase(str) || PrepaidTravelForeignCurrencyWalletDetailActivity.class.getName().equalsIgnoreCase(str) || PrepaidTravelConversionLandingActivity.class.getName().equalsIgnoreCase(str) || PrepaidTravelConversionReviewActivity.class.getName().equalsIgnoreCase(str) || PrepaidTravelConversionSuccessActivity.class.getName().equalsIgnoreCase(str) || PrepaidCashOutLandingAndInputActivity.class.getName().equalsIgnoreCase(str) || PrepaidCashOutReviewActivity.class.getName().equalsIgnoreCase(str) || PrepaidCashOutSuccessActivity.class.getName().equalsIgnoreCase(str) || HmlETBManageEmailVerificationActivity.class.getName().equalsIgnoreCase(str) || DeejungTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || MutualFundTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || PartnerDiscoverWebViewActivity.class.getName().equalsIgnoreCase(str) || RemittanceLandingActivity.class.getName().equalsIgnoreCase(str) || RemittanceReviewActivity.class.getName().equalsIgnoreCase(str) || RemittanceSuccessActivity.class.getName().equalsIgnoreCase(str) || FriendsLandingActivity.class.getName().equalsIgnoreCase(str) || RemittanceRecipientDetailActivity.class.getName().equalsIgnoreCase(str) || RemittanceInputActivity.class.getName().equalsIgnoreCase(str) || RemittanceAddFavouriteInputActivity.class.getName().equalsIgnoreCase(str) || RemittanceAddFavouriteRecipientDetailActivity.class.getName().equalsIgnoreCase(str) || DiscoverActivity.class.getName().equalsIgnoreCase(str) || PrivacyManagementLandingActivity.class.getName().equalsIgnoreCase(str) || HmlCompanyNameActivity.class.getName().equalsIgnoreCase(str) || JuristicOnboardingLandingActivity.class.getName().equalsIgnoreCase(str) || HmlETBBusinessInformationActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessIndustrySelectionActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessOccupationInfoActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessURLInformationActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessOwnerDocumentSubmissionActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessETBPersonalInfoActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessOwnerReviewSubmissionActivity.class.getName().equalsIgnoreCase(str) || RemittanceSenderAddressActivity.class.getName().equalsIgnoreCase(str) || RemittanceAddressSearchActivity.class.getName().equalsIgnoreCase(str) || RemittanceSenderAddressReviewActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessOwnerAccountSetupActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessOwnerLoanSetupActivity.class.getName().equalsIgnoreCase(str) || NsipPaymentLandingActivity.class.getName().equals(str) || HmlIssuerLandingActivity.class.getName().equalsIgnoreCase(str) || HmlConsumerEmailAboutActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessEmailAboutActivity.class.getName().equalsIgnoreCase(str) || NsipPartnerPaymentReviewActivity.class.getName().equals(str) || NsipPartnerPaymentOtpActivity.class.getName().equals(str) || FriendsRegistrationActivity.class.getName().equalsIgnoreCase(str) || CcSofHybridActivity.class.getName().equalsIgnoreCase(str) || CcSofCreditCardOnlyActivity.class.getName().equalsIgnoreCase(str) || CcSofReviewActivity.class.getName().equalsIgnoreCase(str) || CcSofSuccessActivity.class.getName().equalsIgnoreCase(str) || CcSofReviewTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || ThirdPartySlipActivity.class.getName().equalsIgnoreCase(str) || ThirdPartyWebActivity.class.getName().equalsIgnoreCase(str) || StatementChannelLandingActivity.class.getName().equalsIgnoreCase(str) || TermAndConditionStatementChannelActivity.class.getName().equalsIgnoreCase(str) || StatementChannelChooseAddressActivity.class.getName().equalsIgnoreCase(str) || StatementChannelSuccessfulActivity.class.getName().equalsIgnoreCase(str) || StatementChannelCommonActivity.class.getName().equalsIgnoreCase(str) || HmlDocumentSubmissionTutorialsActivity.class.getName().equalsIgnoreCase(str) || EasyAppTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || QuestionnaireActivity.class.getName().equalsIgnoreCase(str) || DirectDebitInputActivity.class.getName().equalsIgnoreCase(str) || DirectDebitBillerSearchActivity.class.getName().equalsIgnoreCase(str) || DirectDebitOtpActivity.class.getName().equalsIgnoreCase(str) || DirectDebitReviewActivity.class.getName().equalsIgnoreCase(str) || DirectDebitSuccessActivity.class.getName().equalsIgnoreCase(str) || DirectDebitTermsAndConditionsActivity.class.getName().equalsIgnoreCase(str) || ECouponCommonActivity.class.getName().equalsIgnoreCase(str) || ECouponDetailActivity.class.getName().equalsIgnoreCase(str) || ECouponSuccessfulActivity.class.getName().equalsIgnoreCase(str) || MyECouponActivity.class.getName().equalsIgnoreCase(str) || MailingAddressInputActivity.class.getName().equalsIgnoreCase(str) || BillPaymentSearchActivity.class.getName().equalsIgnoreCase(str) || GoodToKnowActivity.class.getName().equalsIgnoreCase(str) || BillPaymentSearchCoachMarkActivity.class.getName().equalsIgnoreCase(str) || DepositOpenAccountActivity.class.getName().equalsIgnoreCase(str) || DepositProductCatalogActivity.class.getName().equalsIgnoreCase(str) || InsurancePortfolioActivity.class.getName().equalsIgnoreCase(str) || TransferGiftingInputActivity.class.getName().equalsIgnoreCase(str) || RoboAdvisorLandingActivity.class.getName().equalsIgnoreCase(str) || RemittanceFaqActivity.class.getName().equalsIgnoreCase(str) || PayNowReviewActivity.class.getName().equalsIgnoreCase(str) || PayNowSuccessActivity.class.getName().equalsIgnoreCase(str) || JustForYouLandingActivity.class.getName().equalsIgnoreCase(str);
    }

    public static boolean read(Intent intent) {
        if (intent == null || intent.getComponent() == null || intent.getComponent().getClassName() == null) {
            return false;
        }
        String className = intent.getComponent().getClassName();
        if (HomeActivity.class.getName().equalsIgnoreCase(className)) {
            return false;
        }
        if (!PartnerWebViewActivity.class.getName().equalsIgnoreCase(className)) {
            return MediaBrowserCompat$MediaItem(className);
        }
        if (!intent.hasExtra("EXTRA_REQUIRE_LOGIN") || intent.getIntExtra("EXTRA_REQUIRE_LOGIN", 0) != 1) {
            return false;
        }
        return true;
    }

    public static boolean RatingCompat(String str) {
        return PinLoginActivity.class.getName().equalsIgnoreCase(str) || PartnerWebViewActivity.class.getName().equalsIgnoreCase(str) || FindUsActivity.class.getName().equalsIgnoreCase(str) || SelectProvinceOrDistrictActivity.class.getName().equalsIgnoreCase(str) || HelpActivity.class.getName().equalsIgnoreCase(str) || BankingActionActivity.class.getName().equalsIgnoreCase(str) || HomeActivity.class.getName().equalsIgnoreCase(str) || GroupBillerActivity.class.getName().equalsIgnoreCase(str) || DonationsFoundationDetailsActivity.class.getName().equalsIgnoreCase(str) || ShortcutRouterActivity.class.getName().equalsIgnoreCase(str) || DonationsLandingActivity.class.getName().equalsIgnoreCase(str) || PersonalizeActivity.class.getName().equalsIgnoreCase(str) || GroupFavoriteActivity.class.getName().equalsIgnoreCase(str) || ScanPaymentActivity.class.getName().equalsIgnoreCase(str) || FastPayInputActivity.class.getName().equalsIgnoreCase(str) || ThemesActivity.class.getName().equalsIgnoreCase(str) || PartnerLandingActivity.class.getName().equalsIgnoreCase(str) || ScbsOnboardingTcActivity.class.getName().equalsIgnoreCase(str) || CheckCaptureExperience.class.getName().equalsIgnoreCase(str) || ScbsInputActivity.class.getName().equalsIgnoreCase(str) || AddressSearchActivity.class.getName().equalsIgnoreCase(str) || SelectInvestmentActivity.class.getName().equalsIgnoreCase(str) || PrepaidDetailsActivity.class.getName().equalsIgnoreCase(str) || HmlApplicationOutcomeActivity.class.getName().equalsIgnoreCase(str) || MwPinnedSuccessActivity.class.getName().equalsIgnoreCase(str) || JuristicOnboardingLandingActivity.class.getName().equalsIgnoreCase(str) || RegistrationNoDataActivity.class.getName().equalsIgnoreCase(str) || RegistrationFacialRecognitionLandingActivity.class.getName().equalsIgnoreCase(str) || RegistrationFacialVerificationLockedActivity.class.getName().equalsIgnoreCase(str) || PullSlipActivity.class.getName().equalsIgnoreCase(str) || HmlApiBasedDocumentInstructionsActivity.class.getName().equalsIgnoreCase(str) || HmlBusinessOwnerSubmissionReviewStepTwoActivity.class.getName().equalsIgnoreCase(str) || ExportCardStatementActivity.class.getName().equalsIgnoreCase(str) || EStatementsSuccessfulActivity.class.getName().equalsIgnoreCase(str) || HmlETBOperatingAccountActivity.class.getName().equalsIgnoreCase(str) || ThirdPartySlipActivity.class.getName().equalsIgnoreCase(str) || ThirdPartyWebActivity.class.getName().equalsIgnoreCase(str) || HmlIssuerInputActivity.class.getName().equalsIgnoreCase(str) || ECouponRedemptionDetailActivity.class.getName().equalsIgnoreCase(str) || DebitCardResetOtpActivity.class.getName().equalsIgnoreCase(str) || DebitCardResetPinSuccessActivity.class.getName().equalsIgnoreCase(str);
    }

    public static boolean MediaBrowserCompat$SearchResultReceiver(String str) {
        return "LANDING_PAGE_TAG".equalsIgnoreCase(str) || "MONEY_OUT_TAG".equalsIgnoreCase(str) || TextUtils.isEmpty(str);
    }

    public static Bitmap IconCompatParcelizer(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return null;
        }
        view.measure(MediaBrowserCompat$SearchResultReceiver(layoutParams.width, i), MediaBrowserCompat$SearchResultReceiver(layoutParams.height, i2));
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (!(measuredWidth == 0 || measuredHeight == 0)) {
            view.layout(0, 0, measuredWidth, measuredHeight);
            int width = view.getWidth();
            int height = view.getHeight();
            view.measure(View.MeasureSpec.makeMeasureSpec(width, 1073741824), View.MeasureSpec.makeMeasureSpec(height, 1073741824));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
            view.setDrawingCacheEnabled(true);
            try {
                Bitmap drawingCache = view.getDrawingCache(true);
                if (drawingCache != null) {
                    Bitmap createScaledBitmap = Bitmap.createScaledBitmap(drawingCache, width, height, true);
                    view.setDrawingCacheEnabled(false);
                    return createScaledBitmap;
                }
                Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
                view.draw(new Canvas(createBitmap));
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Bitmap Out of memory error", new Object[0]);
            } catch (Exception unused2) {
                onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Bitmap throws exception", new Object[0]);
                return null;
            }
        }
        return null;
    }

    private static int MediaBrowserCompat$SearchResultReceiver(int i, int i2) {
        if (i == -2) {
            return View.MeasureSpec.makeMeasureSpec(i2, PKIFailureInfo.systemUnavail);
        }
        if (i != -1) {
            return View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
    }

    public static String MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindEasycashLandingEmptyFragment fragmentBuilder_BindEasycashLandingEmptyFragment, String str) {
        onGetStartedClick.write((Object) str, "data");
        StringBuilder sb = new StringBuilder();
        sb.append("javascript:");
        sb.append(fragmentBuilder_BindEasycashLandingEmptyFragment.MediaBrowserCompat$CustomActionResultReceiver());
        sb.append('.');
        sb.append(fragmentBuilder_BindEasycashLandingEmptyFragment.IconCompatParcelizer());
        sb.append("('");
        sb.append(str);
        sb.append("')");
        return sb.toString();
    }

    public static void MediaBrowserCompat$ItemReceiver(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(String.valueOf(obj));
        Log.e("RootBeer", sb.toString());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(IconCompatParcelizer());
        sb2.append(String.valueOf(obj));
        Log.e("QLog", sb2.toString());
    }

    private static String IconCompatParcelizer() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        String methodName = stackTrace[2].getMethodName();
        String className = stackTrace[2].getClassName();
        int lineNumber = stackTrace[2].getLineNumber();
        String substring = className.substring(className.lastIndexOf(46) + 1);
        StringBuilder sb = new StringBuilder();
        sb.append(substring);
        sb.append(": ");
        sb.append(methodName);
        sb.append("() [");
        sb.append(lineNumber);
        sb.append("] - ");
        return sb.toString();
    }

    public static void IconCompatParcelizer(Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer());
        sb.append(String.valueOf(obj));
        Log.v("RootBeer", sb.toString());
    }

    public static /* synthetic */ FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment MediaBrowserCompat$ItemReceiver(FundFactSheetActivity<? super FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) fundFactSheetActivity, "initializer");
        FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read read2 = new FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read();
        fundFactSheetActivity.invoke(read2);
        return new FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment(read2.read, read2.write, (byte) 0);
    }

    public static FragmentBuilder_BindHmlNtbOutcomeApproveFragment write(BaseResponse baseResponse) {
        onGetStartedClick.write((Object) baseResponse, "$this$toOneInteractionResponse");
        baseResponse.getStatusCode();
        baseResponse.getTid();
        Trackers[] trackers = baseResponse.getTrackers();
        onGetStartedClick.IconCompatParcelizer((Object) trackers, "trackers");
        HmlBusinessOwnerReviewSubmissionActivity.write((T[]) trackers);
        Captures[] captures = baseResponse.getCaptures();
        onGetStartedClick.IconCompatParcelizer((Object) captures, "captures");
        HmlBusinessOwnerReviewSubmissionActivity.write((T[]) captures);
        Optimizations[] optimizations = baseResponse.getOptimizations();
        onGetStartedClick.IconCompatParcelizer((Object) optimizations, "optimizations");
        HmlBusinessOwnerReviewSubmissionActivity.write((T[]) optimizations);
        baseResponse.getTrace();
        URI create = URI.create(baseResponse.getInteractionPath());
        onGetStartedClick.IconCompatParcelizer((Object) create, "URI.create(interactionPath)");
        new FragmentBuilder_BindHmlNTBSuccessFragment(create);
        return new FragmentBuilder_BindHmlNtbOutcomeApproveFragment((byte) 0);
    }

    public static /* synthetic */ String write(String str, String str2) {
        String format = String.format("A(n) %s error occurred and was ignored in %s.", Arrays.copyOf(new Object[]{str2, str}, 2));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(this, *args)");
        return format;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        onGetStartedClick.write((Object) activity, "$this$getInfoName");
        ComponentName componentName = activity.getComponentName();
        onGetStartedClick.IconCompatParcelizer((Object) componentName, "componentName");
        String className = componentName.getClassName();
        onGetStartedClick.IconCompatParcelizer((Object) className, "componentName.className");
        return className;
    }

    public static boolean write() {
        try {
            if (SetupQuickTopUpActivity.class.getMethod("encode", new Class[]{byte[].class}) != null) {
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    public static <T> List<T> write(Object obj) {
        if (obj instanceof Collection) {
            try {
                if (obj != null) {
                    return new ArrayList<>((Collection) obj);
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<T>");
            } catch (ClassCastException unused) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLtfTabFragment.OBJECT_TO_LIST_ERROR);
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
        } else if (obj instanceof Map) {
            Collection values = ((Map) obj).values();
            if (values != null) {
                return new ArrayList<>(values);
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Collection<T>");
        } else {
            int i = 0;
            if (obj instanceof SparseArray) {
                int size = ((SparseArray) obj).size();
                ArrayList arrayList = new ArrayList(size);
                while (i < size) {
                    arrayList.add(((SparseArray) obj).get(((SparseArray) obj).keyAt(i)));
                    i++;
                }
                return arrayList;
            } else if (obj instanceof AppCompatCheckBox) {
                int size2 = ((AppCompatCheckBox) obj).size();
                ArrayList arrayList2 = new ArrayList(size2);
                while (i < size2) {
                    arrayList2.add(((AppCompatCheckBox) obj).get(((AppCompatCheckBox) obj).read[i << 1]));
                    i++;
                }
                return arrayList2;
            } else if (obj instanceof Iterable) {
                Iterable<Object> iterable = (Iterable) obj;
                int i2 = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i2 = ((Collection) iterable).size();
                }
                Collection arrayList3 = new ArrayList(i2);
                for (Object add : iterable) {
                    arrayList3.add(add);
                }
                return (List) arrayList3;
            } else if (obj == null) {
                return HmlNationalIdActivity.IconCompatParcelizer;
            } else {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindLtfTabFragment.UNKNOWN_TYPE_TO_LIST);
                return HmlNationalIdActivity.IconCompatParcelizer;
            }
        }
    }

    private static String MediaSessionCompat$QueueItem(Context context) {
        onGetStartedClick.write((Object) context, "$this$getApplicationVersion");
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }

    public static DeviceInfo MediaBrowserCompat$MediaItem(Context context) {
        if (context == null) {
            return null;
        }
        FragmentBuilder_BindHmlOutcomeResubmissionFragment MediaMetadataCompat2 = MediaMetadataCompat(context);
        DeviceInfo deviceInfo = new DeviceInfo();
        deviceInfo.setAppName(MediaMetadataCompat2.write.IconCompatParcelizer);
        deviceInfo.setAppVersion(MediaMetadataCompat2.read.IconCompatParcelizer);
        deviceInfo.setDeviceType(MediaMetadataCompat2.MediaSessionCompat$Token.write);
        deviceInfo.setModel(MediaMetadataCompat2.MediaDescriptionCompat.IconCompatParcelizer);
        deviceInfo.setManufacturer(MediaMetadataCompat2.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver);
        deviceInfo.setLocLastUpdated(MediaMetadataCompat2.MediaMetadataCompat.write);
        deviceInfo.setLocHorzAccuracy(MediaMetadataCompat2.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver);
        deviceInfo.setLocLongitude(MediaMetadataCompat2.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver);
        deviceInfo.setLocLatitude(MediaMetadataCompat2.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver);
        deviceInfo.setPushToken(MediaMetadataCompat2.MediaSessionCompat$QueueItem.read);
        deviceInfo.setLocale(MediaMetadataCompat2.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver);
        deviceInfo.setOsVersion(MediaMetadataCompat2.f2548x50fd9e4a.MediaBrowserCompat$ItemReceiver);
        deviceInfo.setIpAddress(MediaMetadataCompat2.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer);
        deviceInfo.setOsName(MediaMetadataCompat2.ParcelableVolumeInfo.read);
        return deviceInfo;
    }

    public static FragmentBuilder_BindHmlOutcomeResubmissionFragment MediaMetadataCompat(Context context) {
        onGetStartedClick.write((Object) context, "$this$getDeviceInformation");
        String packageName = context.getPackageName();
        String str = "";
        if (packageName == null) {
            packageName = str;
        }
        FragmentBuilder_BindHmlOutcomePendingWithAIPFragment fragmentBuilder_BindHmlOutcomePendingWithAIPFragment = new FragmentBuilder_BindHmlOutcomePendingWithAIPFragment(packageName);
        String MediaSessionCompat$QueueItem2 = MediaSessionCompat$QueueItem(context);
        if (MediaSessionCompat$QueueItem2 == null) {
            MediaSessionCompat$QueueItem2 = str;
        }
        FragmentBuilder_BindHmlOutcomeApproveFragment fragmentBuilder_BindHmlOutcomeApproveFragment = new FragmentBuilder_BindHmlOutcomeApproveFragment(MediaSessionCompat$QueueItem2);
        String str2 = Build.VERSION.RELEASE;
        if (str2 == null) {
            str2 = str;
        }
        FragmentBuilder_BindHmlVerifyIdentifyFragment fragmentBuilder_BindHmlVerifyIdentifyFragment = new FragmentBuilder_BindHmlVerifyIdentifyFragment(str2);
        FragmentBuilder_BindHmlWorkAddressFragment fragmentBuilder_BindHmlWorkAddressFragment = new FragmentBuilder_BindHmlWorkAddressFragment("ANDROID");
        String MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper(context);
        if (MediaSessionCompat$ResultReceiverWrapper2 == null) {
            MediaSessionCompat$ResultReceiverWrapper2 = str;
        }
        FragmentBuilder_BindHmlUserInfoFragment fragmentBuilder_BindHmlUserInfoFragment = new FragmentBuilder_BindHmlUserInfoFragment(MediaSessionCompat$ResultReceiverWrapper2);
        String str3 = Build.MANUFACTURER;
        if (str3 == null) {
            str3 = str;
        }
        FragmentBuilder_BindHmlTermsConditionsFragment fragmentBuilder_BindHmlTermsConditionsFragment = new FragmentBuilder_BindHmlTermsConditionsFragment(str3);
        String str4 = Build.MODEL;
        if (str4 != null) {
            str = str4;
        }
        FragmentBuilder_BindHmlVerifyEmailFragment fragmentBuilder_BindHmlVerifyEmailFragment = new FragmentBuilder_BindHmlVerifyEmailFragment(str);
        String obj = Locale.getDefault().toString();
        onGetStartedClick.IconCompatParcelizer((Object) obj, "Locale.getDefault().toString()");
        return new FragmentBuilder_BindHmlOutcomeResubmissionFragment(fragmentBuilder_BindHmlOutcomePendingWithAIPFragment, fragmentBuilder_BindHmlOutcomeApproveFragment, fragmentBuilder_BindHmlVerifyIdentifyFragment, fragmentBuilder_BindHmlWorkAddressFragment, fragmentBuilder_BindHmlUserInfoFragment, fragmentBuilder_BindHmlTermsConditionsFragment, fragmentBuilder_BindHmlVerifyEmailFragment, new FragmentBuilder_BindHmlSelectAccountFragment(obj), (FragmentBuilder_BindHmlPromptPayAboutFragment) null, (FragmentBuilder_BindHmlRepaymentMethodFragment) null, (FragmentBuilder_BindHmlSetNTBPinSuccessFragment) null, (FragmentBuilder_BindHmlOutcomePendingFragment) null, (FragmentBuilder_BindHmlPromptpayCodeFragment) null, (FragmentBuilder_BindHmlVerifyEmailSuccessfulFragment) null, 16128);
    }

    private static String MediaSessionCompat$ResultReceiverWrapper(Context context) {
        onGetStartedClick.write((Object) context, "$this$getDeviceType");
        try {
            return context.getResources().getBoolean(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.read.th_boolean_is_tablet) ? "TABLET" : "SMARTPHONE";
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }

    public static boolean MediaBrowserCompat$ItemReceiver(TextInputEditText textInputEditText) {
        CharSequence text = textInputEditText != null ? textInputEditText.getText() : null;
        return text == null || text.length() == 0;
    }

    public static String MediaBrowserCompat$CustomActionResultReceiver(TextInputEditText textInputEditText) {
        if ((textInputEditText != null ? textInputEditText.getText() : null) == null) {
            return "";
        }
        return String.valueOf(textInputEditText.getText());
    }

    public static OkHttpClient.Builder IconCompatParcelizer(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT == 21) {
            try {
                SSLContext instance = SSLContext.getInstance("TLSv1.2");
                instance.init((KeyManager[]) null, (TrustManager[]) null, (SecureRandom) null);
                X509TrustManager read2 = read();
                if (read2 != null) {
                    builder.sslSocketFactory(new UpdateEmailUseCase$Error1047(instance.getSocketFactory()), read2);
                } else {
                    builder.sslSocketFactory(new UpdateEmailUseCase$Error1047(instance.getSocketFactory()));
                }
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Error while setting TLS 1.2: \n");
                sb.append(e.getMessage());
                MyECouponActivity_ViewBinding.write(sb.toString());
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        }
        return builder;
    }

    private static X509TrustManager read() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init((KeyStore) null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1) {
                if (trustManagers[0] instanceof X509TrustManager) {
                    return (X509TrustManager) trustManagers[0];
                }
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            return null;
        } catch (GeneralSecurityException e) {
            MyECouponActivity_ViewBinding.write("Error while setting TLS 1.2: No TLS available.");
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return null;
        }
    }

    public static <S, I> setLoaderView<S> read(MwCasaOtpActivity mwCasaOtpActivity, FundFactSheetActivity<? super ScbMapActivity_ViewBinding<S, I>, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        onGetStartedClick.write((Object) mwCasaOtpActivity, "$this$cancellableEpicFactory");
        onGetStartedClick.write((Object) fundFactSheetActivity, "init");
        ScbMapActivity_ViewBinding scbMapActivity_ViewBinding = new ScbMapActivity_ViewBinding(onChoosePhotoClick.MediaBrowserCompat$ItemReceiver(mwCasaOtpActivity, mwCasaOtpActivity.MediaBrowserCompat$CustomActionResultReceiver()));
        fundFactSheetActivity.invoke(scbMapActivity_ViewBinding);
        return scbMapActivity_ViewBinding;
    }

    public static String read(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment, Object... objArr) {
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "$this$format");
        onGetStartedClick.write((Object) objArr, "args");
        String MediaBrowserCompat$CustomActionResultReceiver2 = fragmentBuilder_BindMerchantWalletSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, C8183f.f4230JO);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        String format = String.format(MediaBrowserCompat$CustomActionResultReceiver2, Arrays.copyOf(copyOf, copyOf.length));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(this, *args)");
        String format2 = String.format("%s: %s", Arrays.copyOf(new Object[]{Integer.valueOf(fragmentBuilder_BindMerchantWalletSelectorFragment.IconCompatParcelizer()), format}, 2));
        onGetStartedClick.IconCompatParcelizer((Object) format2, "java.lang.String.format(this, *args)");
        return format2;
    }

    public static OneSDKError write(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
        onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "$this$toOneSdkError");
        fragmentBuilder_BindMerchantWalletSelectorFragment.IconCompatParcelizer();
        String MediaBrowserCompat$CustomActionResultReceiver2 = fragmentBuilder_BindMerchantWalletSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, C8183f.f4230JO);
        return new OneSDKError(MediaBrowserCompat$CustomActionResultReceiver2);
    }

    public static View MediaBrowserCompat$CustomActionResultReceiver(Activity activity, View view) {
        View findViewById = activity.getWindow().getDecorView().findViewById(activity.getResources().getIdentifier("action_bar_container", Name.MARK, "android"));
        if (findViewById == null) {
            findViewById = read((ViewGroup) activity.getWindow().getDecorView().findViewById(16908290));
            if (findViewById == null) {
                findViewById = activity.getWindow().getDecorView().findViewById(activity.getResources().getIdentifier("abs__action_bar_container", Name.MARK, "android"));
            }
            if (findViewById == null) {
                findViewById = activity.getWindow().getDecorView().findViewById(activity.getResources().getIdentifier("action_bar_container", Name.MARK, activity.getPackageName()));
            }
        }
        if (findViewById == null) {
            return null;
        }
        View view2 = (View) findViewById.getParent();
        while (view2 != null && !view2.equals(view) && (view2.getParent() instanceof View)) {
            view2 = (View) view2.getParent();
        }
        if (view2 == null || !view2.equals(view)) {
            return findViewById;
        }
        return null;
    }

    private static ViewGroup read(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        ViewGroup viewGroup2 = null;
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getClass().getName().equals("androidx.appcompat.widget.Toolbar") || childAt.getClass().getName().equals("android.widget.Toolbar")) {
                viewGroup2 = (ViewGroup) childAt;
            } else if (childAt instanceof ViewGroup) {
                viewGroup2 = read((ViewGroup) childAt);
            }
            if (viewGroup2 != null) {
                break;
            }
        }
        return viewGroup2;
    }

    public static View IconCompatParcelizer(DrawerLayout drawerLayout) {
        int childCount = drawerLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = drawerLayout.getChildAt(i);
            if ((IconCompatParcelizer((DrawerLayout$MediaBrowserCompat$ItemReceiver) childAt.getLayoutParams()) & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    private static int IconCompatParcelizer(DrawerLayout$MediaBrowserCompat$ItemReceiver drawerLayout$MediaBrowserCompat$ItemReceiver) {
        try {
            Field declaredField = Class.forName("androidx.drawerlayout.widget.DrawerLayout$MediaBrowserCompat$ItemReceiver").getDeclaredField("read");
            if (declaredField == null) {
                return -1;
            }
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(drawerLayout$MediaBrowserCompat$ItemReceiver)).intValue();
        } catch (NoSuchFieldException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("DrawerLayoutHelper - Reflection: No Such Field. ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return -1;
        } catch (IllegalAccessException e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("DrawerLayoutHelper - Reflection: Illegal Access. ");
            sb2.append(e2.getMessage());
            MyECouponActivity_ViewBinding.write(sb2.toString());
            return -1;
        } catch (ClassNotFoundException e3) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("DrawerLayoutHelper - Reflection: Class Not Found. ");
            sb3.append(e3.getMessage());
            MyECouponActivity_ViewBinding.write(sb3.toString());
            return -1;
        }
    }

    private static ArrayList<BScanCEntryPointActivity> IconCompatParcelizer(List<BondLandingActivity> list) {
        ArrayList<BScanCEntryPointActivity> arrayList = new ArrayList<>();
        int i = 0;
        while (i < list.size() - 1) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < list.size(); i3++) {
                arrayList.add(BScanCEntryPointActivity.read(list.get(i), list.get(i3)));
            }
            i = i2;
        }
        return arrayList;
    }

    public static Set<String> write(Activity activity, List<View> list) {
        HashSet hashSet = new HashSet();
        List<BondLandingActivity> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(activity, list);
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.size(); i++) {
            String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver);
            if (MediaBrowserCompat$ItemReceiver2.get(i).read && (FragmentBuilder_BindHmlExternalAuthenticationFragment.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver) || FragmentBuilder_BindHmlExternalAuthenticationFragment.write(MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver))) {
                hashSet.add(MediaBrowserCompat$CustomActionResultReceiver2);
            } else if (FragmentBuilder_BindHmlExternalAuthenticationFragment.write(activity, MediaBrowserCompat$CustomActionResultReceiver2) && FragmentBuilder_BindHmlExternalAuthenticationFragment.IconCompatParcelizer("", MediaBrowserCompat$CustomActionResultReceiver(activity, MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver))) {
                hashSet.add(MediaBrowserCompat$CustomActionResultReceiver2);
            }
        }
        return hashSet;
    }

    public static List<BondLandingActivity> MediaBrowserCompat$ItemReceiver(Activity activity, List<View> list) {
        List<BondLandingActivity> write2 = BondLandingActivity.write(new FragmentBuilder_BindHmlBusinessOwnerProgressSuccessFragment().read(ManageQrToPayActivity.read(activity, list)));
        write(write2);
        MediaBrowserCompat$ItemReceiver(write2);
        return write2;
    }

    public static List<BondLandingActivity> IconCompatParcelizer(Activity activity, List<View> list) {
        List<BondLandingActivity> MediaBrowserCompat$ItemReceiver2 = MediaBrowserCompat$ItemReceiver(activity, list);
        for (int i = 0; i < MediaBrowserCompat$ItemReceiver2.size(); i++) {
            String MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver);
            if (!MediaBrowserCompat$ItemReceiver2.get(i).read || !FragmentBuilder_BindHmlExternalAuthenticationFragment.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver)) {
                if (!FragmentBuilder_BindHmlExternalAuthenticationFragment.write(activity, MediaBrowserCompat$CustomActionResultReceiver2)) {
                    MediaBrowserCompat$ItemReceiver2.get(i).read = false;
                } else if (FragmentBuilder_BindHmlExternalAuthenticationFragment.IconCompatParcelizer("", MediaBrowserCompat$CustomActionResultReceiver(activity, MediaBrowserCompat$ItemReceiver2.get(i).MediaBrowserCompat$ItemReceiver))) {
                    MediaBrowserCompat$ItemReceiver2.get(i).read = true;
                }
            }
        }
        return MediaBrowserCompat$ItemReceiver2;
    }

    private static void MediaBrowserCompat$ItemReceiver(List<BondLandingActivity> list) {
        boolean z;
        for (int i = 0; i < list.size(); i++) {
            BondLandingActivity bondLandingActivity = list.get(i);
            if (bondLandingActivity.MediaBrowserCompat$ItemReceiver instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) bondLandingActivity.MediaBrowserCompat$ItemReceiver;
                int childCount = viewGroup.getChildCount();
                if (bondLandingActivity.read && childCount != 0) {
                    boolean z2 = false;
                    for (int i2 = 0; i2 < childCount; i2++) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (!(FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(childAt) != null)) {
                            if (childAt instanceof ViewGroup) {
                                ViewGroup viewGroup2 = (ViewGroup) childAt;
                                if (viewGroup2.getChildCount() == 1 && FragmentBuilder_BindHmlBusinessURLInfoFragment.MediaBrowserCompat$CustomActionResultReceiver(viewGroup2.getChildAt(0)) != null) {
                                    z = true;
                                    z2 = !z2 || !z;
                                }
                            }
                            z = false;
                            if (!z2) {
                            }
                        }
                    }
                    bondLandingActivity.read = z2;
                }
            }
        }
    }

    private static void write(List<BondLandingActivity> list) {
        ArrayList<BScanCEntryPointActivity> IconCompatParcelizer2 = IconCompatParcelizer(list);
        for (int i = 0; i < IconCompatParcelizer2.size(); i++) {
            BScanCEntryPointActivity bScanCEntryPointActivity = IconCompatParcelizer2.get(i);
            if (bScanCEntryPointActivity.IconCompatParcelizer) {
                BondLandingActivity bondLandingActivity = bScanCEntryPointActivity.MediaBrowserCompat$ItemReceiver;
                BondLandingActivity bondLandingActivity2 = bScanCEntryPointActivity.write;
                if (bScanCEntryPointActivity.read >= 100.0f || bScanCEntryPointActivity.MediaBrowserCompat$CustomActionResultReceiver >= 100.0f) {
                    boolean read2 = new onRedeemAnotherRewardClick(bondLandingActivity2.MediaBrowserCompat$ItemReceiver).read(bondLandingActivity.MediaBrowserCompat$ItemReceiver);
                    if (bScanCEntryPointActivity.read == 100.0f && read2 && bondLandingActivity2.MediaBrowserCompat$CustomActionResultReceiver() > 90) {
                        bondLandingActivity.read = false;
                    } else if (bScanCEntryPointActivity.MediaBrowserCompat$CustomActionResultReceiver == 100.0f && !read2 && bondLandingActivity.MediaBrowserCompat$CustomActionResultReceiver() > 90) {
                        bondLandingActivity2.read = false;
                    }
                }
            }
        }
    }

    public static OptimizationActions MediaMetadataCompat(String str) {
        String str2;
        try {
            str2 = new String(Base64.decode(str, 0), "UTF-8");
        } catch (UnsupportedEncodingException e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            str2 = "";
        }
        return (OptimizationActions) new Gson().fromJson(str2, OptimizationActions.class);
    }

    public static boolean IconCompatParcelizer(Activity activity) {
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null || (currentFocus instanceof ViewGroup)) {
            return false;
        }
        ((InputMethodManager) currentFocus.getContext().getSystemService("input_method")).hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        activity.getWindow().getDecorView().clearFocus();
        return true;
    }

    public static String MediaDescriptionCompat(String str) {
        if (str == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append(str);
        sb.append("\"");
        return sb.toString();
    }

    public static Context MediaDescriptionCompat(Context context) {
        if ("interactionStudio".toLowerCase().contains("interactionstudio")) {
            return new ContextThemeWrapper(context, C1189xa6547b7b.ThunderheadThemeLight);
        }
        return new ContextThemeWrapper(context, C1189xa6547b7b.ThunderheadThemeDark);
    }

    public static URI write(FragmentBuilder_BindHmlNTBSuccessFragment fragmentBuilder_BindHmlNTBSuccessFragment, FragmentBuilder_BindHmlNdidInstructionFragment fragmentBuilder_BindHmlNdidInstructionFragment) {
        if (fragmentBuilder_BindHmlNTBSuccessFragment == null) {
            MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindManageEmailVerificationFragment.ERROR_MISSING_INTERACTION_PATH);
            if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(write((FragmentBuilder_BindMerchantWalletSelectorFragment) FragmentBuilder_BindManageEmailVerificationFragment.ERROR_MISSING_INTERACTION_PATH));
            }
            return null;
        }
        URI uri = fragmentBuilder_BindHmlNTBSuccessFragment.write;
        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver2 = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
        boolean z = false;
        boolean z2 = uri.getScheme() != null && !uri.getScheme().isEmpty();
        boolean z3 = uri.getHost() != null && !uri.getHost().isEmpty();
        if (uri.getPath() != null && !uri.getPath().isEmpty()) {
            z = true;
        }
        URI RatingCompat2 = FragmentBuilder_BindOnboardingInputAddressFragment.RatingCompat(MediaBrowserCompat$ItemReceiver2);
        if (z && !z3 && !z2 && RatingCompat2 != null) {
            try {
                return new URI(RatingCompat2.getScheme(), RatingCompat2.getHost(), uri.getPath(), uri.getFragment());
            } catch (URISyntaxException e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else if (!z || !z3 || z2) {
            if (z2 || z3 || z) {
                if (!z2 || !z3) {
                    return null;
                }
            } else if (RatingCompat2 != null) {
                uri = new URI(RatingCompat2.toString());
            } else if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError("Thunderhead SDK has not been initialized yet"));
            }
            return uri;
        } else {
            if (fragmentBuilder_BindHmlNdidInstructionFragment != null) {
                FragmentBuilder_BindManageEmailVerificationFragment fragmentBuilder_BindManageEmailVerificationFragment = FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI;
                fragmentBuilder_BindHmlNdidInstructionFragment.read(new OneSDKError(FragmentBuilder_BindManageEmailVerificationFragment.ERROR_INVALID_INTERACTION_URI.message));
            }
            return null;
        }
        return null;
    }

    public static boolean write(Map<String, String> map) {
        if (map == null || map.isEmpty()) {
            MyECouponActivity_ViewBinding.write("Properties map is null or empty");
            return false;
        }
        HashSet<String> hashSet = null;
        for (String next : map.keySet()) {
            if (next == null || next.trim().isEmpty()) {
                if (hashSet == null) {
                    hashSet = new HashSet<>();
                }
                hashSet.add(next);
            }
        }
        if (hashSet != null) {
            MyECouponActivity_ViewBinding.write("Provided properties map contains null or empty keys. These keys will be ignored and won't be sent to a server.");
            for (String remove : hashSet) {
                map.remove(remove);
            }
        }
        return !map.isEmpty();
    }

    public static void MediaBrowserCompat$ItemReceiver(Activity activity) {
        Application application = activity.getApplication();
        if (application instanceof MileageConfirmRedemptionActivity) {
            MileageQuantitySelectionActivity_ViewBinding<Activity> write2 = ((MileageConfirmRedemptionActivity) application).write();
            C1133x65c1ec57.IconCompatParcelizer(write2, "%s.activityInjector() returned null", application.getClass());
            write2.IconCompatParcelizer(activity);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), MileageConfirmRedemptionActivity.class.getCanonicalName()}));
    }

    public static void IconCompatParcelizer(Service service) {
        Application application = service.getApplication();
        if (application instanceof MileageReviewRedemptionActivity) {
            MileageQuantitySelectionActivity_ViewBinding<Service> IconCompatParcelizer2 = ((MileageReviewRedemptionActivity) application).IconCompatParcelizer();
            C1133x65c1ec57.IconCompatParcelizer(IconCompatParcelizer2, "%s.serviceInjector() returned null", application.getClass());
            IconCompatParcelizer2.IconCompatParcelizer(service);
            return;
        }
        throw new RuntimeException(String.format("%s does not implement %s", new Object[]{application.getClass().getCanonicalName(), MileageReviewRedemptionActivity.class.getCanonicalName()}));
    }

    public static void write(Fragment fragment) {
        ProductDetailActivity productDetailActivity;
        Fragment fragment2 = fragment;
        while (true) {
            fragment2 = fragment2.getParentFragment();
            if (fragment2 != null) {
                if (fragment2 instanceof ProductDetailActivity) {
                    productDetailActivity = (ProductDetailActivity) fragment2;
                    break;
                }
            } else {
                FragmentActivity activity = fragment.getActivity();
                if (activity instanceof ProductDetailActivity) {
                    productDetailActivity = (ProductDetailActivity) activity;
                } else if (activity.getApplication() instanceof ProductDetailActivity) {
                    productDetailActivity = (ProductDetailActivity) activity.getApplication();
                } else {
                    throw new IllegalArgumentException(String.format("No injector was found for %s", new Object[]{fragment.getClass().getCanonicalName()}));
                }
            }
        }
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", new Object[]{fragment.getClass().getCanonicalName(), productDetailActivity.getClass().getCanonicalName()}));
        }
        MileageQuantitySelectionActivity_ViewBinding<Fragment> MediaBrowserCompat$CustomActionResultReceiver2 = productDetailActivity.MediaBrowserCompat$CustomActionResultReceiver();
        C1133x65c1ec57.IconCompatParcelizer(MediaBrowserCompat$CustomActionResultReceiver2, "%s.supportFragmentInjector() returned null", productDetailActivity.getClass());
        MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer(fragment);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v13, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String read(byte[] r8) {
        /*
            r0 = 64
            char[] r0 = new char[r0]
            r0 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 0
            r3 = r2
            r4 = r3
        L_0x000f:
            int r5 = r8.length
            if (r3 >= r5) goto L_0x004f
            byte r5 = r8[r3]
            r5 = r5 & 255(0xff, float:3.57E-43)
            int r5 = r5 << 16
            r6 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = r5 & r6
            int r6 = r3 + 1
            int r7 = r8.length
            if (r6 >= r7) goto L_0x0029
            byte r6 = r8[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r6 = r6 << 8
            r5 = r5 | r6
            goto L_0x002b
        L_0x0029:
            int r4 = r4 + 1
        L_0x002b:
            int r6 = r3 + 2
            int r7 = r8.length
            if (r6 >= r7) goto L_0x0036
            byte r6 = r8[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r5 = r5 | r6
            goto L_0x0038
        L_0x0036:
            int r4 = r4 + 1
        L_0x0038:
            r6 = r2
        L_0x0039:
            int r7 = 4 - r4
            if (r6 >= r7) goto L_0x004c
            r7 = 16515072(0xfc0000, float:2.3142545E-38)
            r7 = r7 & r5
            int r7 = r7 >> 18
            char r7 = r0[r7]
            r1.append(r7)
            int r5 = r5 << 6
            int r6 = r6 + 1
            goto L_0x0039
        L_0x004c:
            int r3 = r3 + 3
            goto L_0x000f
        L_0x004f:
            if (r2 >= r4) goto L_0x0059
            java.lang.String r8 = "="
            r1.append(r8)
            int r2 = r2 + 1
            goto L_0x004f
        L_0x0059:
            java.lang.String r8 = r1.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.read(byte[]):java.lang.String");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:6|18|19|20|21|22) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x005b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0067 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void MediaBrowserCompat$ItemReceiver(java.io.InputStream r7, java.io.OutputStream r8) {
        /*
            java.lang.String r0 = " bytes"
            java.lang.String r1 = "TFT"
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
            r3 = 1
        L_0x0009:
            int r4 = r7.read(r2)     // Catch:{ IOException -> 0x0052 }
            if (r4 <= 0) goto L_0x004a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            r5.<init>()     // Catch:{ IOException -> 0x0052 }
            java.lang.String r6 = "run: writing "
            r5.append(r6)     // Catch:{ IOException -> 0x0052 }
            r5.append(r4)     // Catch:{ IOException -> 0x0052 }
            r5.append(r0)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r5 = r5.toString()     // Catch:{ IOException -> 0x0052 }
            android.util.Log.d(r1, r5)     // Catch:{ IOException -> 0x0052 }
            r5 = 0
            r8.write(r2, r5, r4)     // Catch:{ IOException -> 0x0052 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x0052 }
            r5.<init>()     // Catch:{ IOException -> 0x0052 }
            java.lang.String r6 = "run: writed "
            r5.append(r6)     // Catch:{ IOException -> 0x0052 }
            int r4 = r4 * r3
            r5.append(r4)     // Catch:{ IOException -> 0x0052 }
            r5.append(r0)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r4 = r5.toString()     // Catch:{ IOException -> 0x0052 }
            android.util.Log.d(r1, r4)     // Catch:{ IOException -> 0x0052 }
            java.lang.String r4 = "run: reading next 4096 bytes"
            android.util.Log.d(r1, r4)     // Catch:{ IOException -> 0x0052 }
            int r3 = r3 + 1
            goto L_0x0009
        L_0x004a:
            java.lang.String r0 = "run: write done"
            android.util.Log.d(r1, r0)     // Catch:{ IOException -> 0x0052 }
            goto L_0x0058
        L_0x0050:
            r0 = move-exception
            goto L_0x0064
        L_0x0052:
            r0 = move-exception
            java.lang.String r2 = "IOException when writing to out"
            android.util.Log.e(r1, r2, r0)     // Catch:{ all -> 0x0050 }
        L_0x0058:
            r7.close()     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r8.close()     // Catch:{ IOException -> 0x005e }
        L_0x005e:
            java.lang.String r7 = "Thread should exit here"
            android.util.Log.d(r1, r7)
            return
        L_0x0064:
            r7.close()     // Catch:{ IOException -> 0x0067 }
        L_0x0067:
            r8.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(java.io.InputStream, java.io.OutputStream):void");
    }

    public static BankingAgentDeepLinkActivity IconCompatParcelizer(Callable<BankingAgentDeepLinkActivity> callable) {
        try {
            BankingAgentDeepLinkActivity call = callable.call();
            if (call != null) {
                return call;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw HmlBusinessOccupationInfoActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(th);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: o.DebitCardProductCatalogActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> boolean write(java.lang.Object r2, p040o.DirectDebitDeepLinkActivity<? super T, ? extends p040o.DebitCardProductCatalogActivity> r3, p040o.DebitCardRequestInputActivity r4) {
        /*
            boolean r0 = r2 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L_0x002d
            java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r2.call()     // Catch:{ all -> 0x0025 }
            if (r2 == 0) goto L_0x001b
            java.lang.Object r2 = r3.write(r2)     // Catch:{ all -> 0x0025 }
            java.lang.String r3 = "The mapper returned a null CompletableSource"
            java.lang.Object r2 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r2, r3)     // Catch:{ all -> 0x0025 }
            r0 = r2
            o.DebitCardProductCatalogActivity r0 = (p040o.DebitCardProductCatalogActivity) r0     // Catch:{ all -> 0x0025 }
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            p040o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.read(r4)
            goto L_0x0024
        L_0x0021:
            r0.IconCompatParcelizer(r4)
        L_0x0024:
            return r1
        L_0x0025:
            r2 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r2)
            p040o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Throwable) r2, (p040o.DebitCardRequestInputActivity) r4)
            return r1
        L_0x002d:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.write(java.lang.Object, o.DirectDebitDeepLinkActivity, o.DebitCardRequestInputActivity):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: o.BaseChangePinWithMaxActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T, R> boolean MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object r2, p040o.DirectDebitDeepLinkActivity<? super T, ? extends p040o.BaseChangePinWithMaxActivity<? extends R>> r3, p040o.BankingAgentTransactionsDeepLinkActivity<? super R> r4) {
        /*
            boolean r0 = r2 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r2.call()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x001b
            java.lang.Object r2 = r3.write(r2)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "The mapper returned a null MaybeSource"
            java.lang.Object r2 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r2, r3)     // Catch:{ all -> 0x0029 }
            r0 = r2
            o.BaseChangePinWithMaxActivity r0 = (p040o.BaseChangePinWithMaxActivity) r0     // Catch:{ all -> 0x0029 }
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            p040o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((p040o.BankingAgentTransactionsDeepLinkActivity<?>) r4)
            goto L_0x0028
        L_0x0021:
            o.BaseChangePinWithMaxActivity_ViewBinding r2 = p040o.IntroductionActivity.MediaBrowserCompat$ItemReceiver(r4)
            r0.read(r2)
        L_0x0028:
            return r1
        L_0x0029:
            r2 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r2)
            p040o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Throwable) r2, (p040o.BankingAgentTransactionsDeepLinkActivity<?>) r4)
            return r1
        L_0x0031:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(java.lang.Object, o.DirectDebitDeepLinkActivity, o.BankingAgentTransactionsDeepLinkActivity):boolean");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: o.BillerDeepLinkActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T, R> boolean IconCompatParcelizer(java.lang.Object r2, p040o.DirectDebitDeepLinkActivity<? super T, ? extends p040o.BillerDeepLinkActivity<? extends R>> r3, p040o.BankingAgentTransactionsDeepLinkActivity<? super R> r4) {
        /*
            boolean r0 = r2 instanceof java.util.concurrent.Callable
            if (r0 == 0) goto L_0x0031
            java.util.concurrent.Callable r2 = (java.util.concurrent.Callable) r2
            r0 = 0
            r1 = 1
            java.lang.Object r2 = r2.call()     // Catch:{ all -> 0x0029 }
            if (r2 == 0) goto L_0x001b
            java.lang.Object r2 = r3.write(r2)     // Catch:{ all -> 0x0029 }
            java.lang.String r3 = "The mapper returned a null SingleSource"
            java.lang.Object r2 = p040o.HmlLatestPersonalInformationDeepLinkActivity.write(r2, r3)     // Catch:{ all -> 0x0029 }
            r0 = r2
            o.BillerDeepLinkActivity r0 = (p040o.BillerDeepLinkActivity) r0     // Catch:{ all -> 0x0029 }
        L_0x001b:
            if (r0 != 0) goto L_0x0021
            p040o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.write((p040o.BankingAgentTransactionsDeepLinkActivity<?>) r4)
            goto L_0x0028
        L_0x0021:
            o.ActivateChequeDeepLinkActivity r2 = p040o.FriendsLandingActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(r4)
            r0.IconCompatParcelizer(r2)
        L_0x0028:
            return r1
        L_0x0029:
            r2 = move-exception
            p040o.AlertController$RecycleListView.read.write((java.lang.Throwable) r2)
            p040o.HmlBusinessOwnerLatestLoanOfferStatusDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver((java.lang.Throwable) r2, (p040o.BankingAgentTransactionsDeepLinkActivity<?>) r4)
            return r1
        L_0x0031:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.IconCompatParcelizer(java.lang.Object, o.DirectDebitDeepLinkActivity, o.BankingAgentTransactionsDeepLinkActivity):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> void MediaBrowserCompat$ItemReceiver(p040o.DebitCardResetPinSuccessActivity_ViewBinding<? extends T> r3, p040o.BankingAgentTransactionsDeepLinkActivity<? super T> r4) {
        /*
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r0.<init>()
            o.MoreOptionsPromptPayDeepLinkActivity r1 = new o.MoreOptionsPromptPayDeepLinkActivity
            r1.<init>(r0)
            r4.onSubscribe(r1)
            r3.subscribe(r1)
        L_0x0010:
            boolean r3 = r1.isDisposed()
            if (r3 != 0) goto L_0x0039
            java.lang.Object r3 = r0.poll()
            if (r3 != 0) goto L_0x0029
            java.lang.Object r3 = r0.take()     // Catch:{ InterruptedException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r3 = move-exception
            r1.dispose()
            r4.onError(r3)
            return
        L_0x0029:
            boolean r2 = r1.isDisposed()
            if (r2 != 0) goto L_0x0039
            java.lang.Object r2 = p040o.MoreOptionsPromptPayDeepLinkActivity.MediaBrowserCompat$ItemReceiver
            if (r3 == r2) goto L_0x0039
            boolean r3 = p040o.HmlCaptureDocumentActivity.MediaBrowserCompat$ItemReceiver(r3, r4)
            if (r3 == 0) goto L_0x0010
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(o.DebitCardResetPinSuccessActivity_ViewBinding, o.BankingAgentTransactionsDeepLinkActivity):void");
    }

    public static <T> void IconCompatParcelizer(DebitCardResetPinSuccessActivity_ViewBinding<? extends T> debitCardResetPinSuccessActivity_ViewBinding, DebitCardMarketConductDeepLinkActivity<? super T> debitCardMarketConductDeepLinkActivity, DebitCardMarketConductDeepLinkActivity<? super Throwable> debitCardMarketConductDeepLinkActivity2, DataPrivacyManagementDeepLinkActivity dataPrivacyManagementDeepLinkActivity) {
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity, "onNext is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(debitCardMarketConductDeepLinkActivity2, "onError is null");
        HmlLatestPersonalInformationDeepLinkActivity.write(dataPrivacyManagementDeepLinkActivity, "onComplete is null");
        MediaBrowserCompat$ItemReceiver(debitCardResetPinSuccessActivity_ViewBinding, new OpenAccountEtbNoActiveCasaDeepLinkActivity(debitCardMarketConductDeepLinkActivity, debitCardMarketConductDeepLinkActivity2, dataPrivacyManagementDeepLinkActivity, HmlCalculatorDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver()));
    }

    public static long write(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            j3 = Long.MAX_VALUE;
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            long j4 = j2 + j;
            if (j4 >= 0) {
                j3 = j4;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j2;
    }

    public static long IconCompatParcelizer(AtomicLong atomicLong, long j) {
        long j2;
        long j3;
        do {
            j2 = atomicLong.get();
            if (j2 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j3 = j2 - j;
            if (j3 < 0) {
                StringBuilder sb = new StringBuilder();
                sb.append("More produced than requested: ");
                sb.append(j3);
                read.read((Throwable) new IllegalStateException(sb.toString()));
                j3 = 0;
            }
        } while (!atomicLong.compareAndSet(j2, j3));
        return j3;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static String m3034x50fd9e4a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("It is not allowed to subscribe with a(n) ");
        sb.append(str);
        sb.append(" multiple times. Please create a fresh instance of ");
        sb.append(str);
        sb.append(" and subscribe that to the target source instead.");
        return sb.toString();
    }

    public static void MediaBrowserCompat$ItemReceiver(BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity, Throwable th, AtomicInteger atomicInteger, HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity) {
        if (!HmlBusinessOccupationInfoActivity_ViewBinding.IconCompatParcelizer(hmlBusinessETBPersonalInfoActivity, th)) {
            read.read(th);
        } else if (atomicInteger.getAndIncrement() == 0) {
            bankingAgentTransactionsDeepLinkActivity.onError(HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity));
        }
    }

    public static <T> void MediaBrowserCompat$CustomActionResultReceiver(BankingAgentTransactionsDeepLinkActivity<? super T> bankingAgentTransactionsDeepLinkActivity, T t, AtomicInteger atomicInteger, HmlBusinessETBPersonalInfoActivity hmlBusinessETBPersonalInfoActivity) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            bankingAgentTransactionsDeepLinkActivity.onNext(t);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable read2 = HmlBusinessOccupationInfoActivity_ViewBinding.read(hmlBusinessETBPersonalInfoActivity);
                if (read2 != null) {
                    bankingAgentTransactionsDeepLinkActivity.onError(read2);
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                }
            }
        }
    }

    private static <T, U> boolean MediaBrowserCompat$ItemReceiver(boolean z, boolean z2, BankingAgentTransactionsDeepLinkActivity<?> bankingAgentTransactionsDeepLinkActivity, boolean z3, HmlSuccessfulDeepLinkActivity<?> hmlSuccessfulDeepLinkActivity, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity, HmlCompanyNameActivity<T, U> hmlCompanyNameActivity) {
        if (hmlCompanyNameActivity.read()) {
            hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
            bulkTransferDeepLinkActivity.dispose();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (!z3) {
                Throwable write2 = hmlCompanyNameActivity.write();
                if (write2 != null) {
                    hmlSuccessfulDeepLinkActivity.MediaBrowserCompat$ItemReceiver();
                    if (bulkTransferDeepLinkActivity != null) {
                        bulkTransferDeepLinkActivity.dispose();
                    }
                    bankingAgentTransactionsDeepLinkActivity.onError(write2);
                    return true;
                } else if (!z2) {
                    return false;
                } else {
                    if (bulkTransferDeepLinkActivity != null) {
                        bulkTransferDeepLinkActivity.dispose();
                    }
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                    return true;
                }
            } else if (!z2) {
                return false;
            } else {
                if (bulkTransferDeepLinkActivity != null) {
                    bulkTransferDeepLinkActivity.dispose();
                }
                Throwable write3 = hmlCompanyNameActivity.write();
                if (write3 != null) {
                    bankingAgentTransactionsDeepLinkActivity.onError(write3);
                } else {
                    bankingAgentTransactionsDeepLinkActivity.onComplete();
                }
                return true;
            }
        }
    }

    public static <T, U> void write(HmlLoanOfferStatusDeepLinkBaseActivity<T> hmlLoanOfferStatusDeepLinkBaseActivity, BankingAgentTransactionsDeepLinkActivity<? super U> bankingAgentTransactionsDeepLinkActivity, boolean z, BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity, HmlCompanyNameActivity<T, U> hmlCompanyNameActivity) {
        int i = 1;
        while (!MediaBrowserCompat$ItemReceiver(hmlCompanyNameActivity.MediaBrowserCompat$CustomActionResultReceiver(), hmlLoanOfferStatusDeepLinkBaseActivity.write(), bankingAgentTransactionsDeepLinkActivity, z, hmlLoanOfferStatusDeepLinkBaseActivity, bulkTransferDeepLinkActivity, hmlCompanyNameActivity)) {
            while (true) {
                boolean MediaBrowserCompat$CustomActionResultReceiver2 = hmlCompanyNameActivity.MediaBrowserCompat$CustomActionResultReceiver();
                T read2 = hmlLoanOfferStatusDeepLinkBaseActivity.read();
                boolean z2 = read2 == null;
                if (!MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$CustomActionResultReceiver2, z2, bankingAgentTransactionsDeepLinkActivity, z, hmlLoanOfferStatusDeepLinkBaseActivity, bulkTransferDeepLinkActivity, hmlCompanyNameActivity)) {
                    if (z2) {
                        i = hmlCompanyNameActivity.MediaBrowserCompat$ItemReceiver(-i);
                        if (i == 0) {
                            return;
                        }
                    } else {
                        hmlCompanyNameActivity.write(bankingAgentTransactionsDeepLinkActivity, read2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public static void read(int i, int i2) {
        String str;
        if (!(i > 0 && i2 > 0)) {
            if (i != i2) {
                StringBuilder sb = new StringBuilder();
                sb.append("Both size ");
                sb.append(i);
                sb.append(" and step ");
                sb.append(i2);
                sb.append(" must be greater than zero.");
                str = sb.toString();
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("size ");
                sb2.append(i);
                sb2.append(" must be greater than zero.");
                str = sb2.toString();
            }
            throw new IllegalArgumentException(str.toString());
        }
    }

    public static <R, T> void read(BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, R r, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "$this$startCoroutine");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver2 = HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(HmlDocumentSubmissionActivity.read(baseDiscoverFundFilterActivity, r, hmlNTBPromptPayNotFoundActivity));
        HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        MediaBrowserCompat$ItemReceiver2.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(hmlVerifyPhoneValidateOtpActivity));
    }

    public static int MediaBrowserCompat$ItemReceiver(HmlNTBCropDocumentActivity hmlNTBCropDocumentActivity) {
        try {
            Field declaredField = hmlNTBCropDocumentActivity.getClass().getDeclaredField("label");
            onGetStartedClick.IconCompatParcelizer((Object) declaredField, "field");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(hmlNTBCropDocumentActivity);
            if (!(obj instanceof Integer)) {
                obj = null;
            }
            Integer num = (Integer) obj;
            return -1 + (num != null ? num.intValue() : 0);
        } catch (Exception unused) {
            return -1;
        }
    }

    public static int IconCompatParcelizer(int i, int i2, int i3) {
        int i4 = i % i3;
        if (i4 < 0) {
            i4 += i3;
        }
        int i5 = i2 % i3;
        if (i5 < 0) {
            i5 += i3;
        }
        int i6 = (i4 - i5) % i3;
        return i6 < 0 ? i6 + i3 : i6;
    }

    public static /* synthetic */ long MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream, OutputStream outputStream) {
        onGetStartedClick.write((Object) inputStream, "$this$copyTo");
        onGetStartedClick.write((Object) outputStream, "out");
        byte[] bArr = new byte[8192];
        int read2 = inputStream.read(bArr);
        long j = 0;
        while (read2 >= 0) {
            outputStream.write(bArr, 0, read2);
            j += (long) read2;
            read2 = inputStream.read(bArr);
        }
        return j;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(Closeable closeable, Throwable th) {
        if (closeable == null) {
            return;
        }
        if (th == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (Throwable th2) {
            onGetStartedClick.write((Object) th, "$this$addSuppressed");
            onGetStartedClick.write((Object) th2, "exception");
            InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(th, th2);
        }
    }

    public static <T> Class<T> write(ScbsAccountDetailActivity<T> scbsAccountDetailActivity) {
        onGetStartedClick.write((Object) scbsAccountDetailActivity, "$this$javaObjectType");
        Class MediaBrowserCompat$CustomActionResultReceiver2 = ((DiscoverFundFilterListActivity) scbsAccountDetailActivity).MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver2.isPrimitive()) {
            String name = MediaBrowserCompat$CustomActionResultReceiver2.getName();
            if (name != null) {
                switch (name.hashCode()) {
                    case -1325958191:
                        if (name.equals("double")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Double.class;
                            break;
                        }
                        break;
                    case 104431:
                        if (name.equals("int")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Integer.class;
                            break;
                        }
                        break;
                    case 3039496:
                        if (name.equals("byte")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Byte.class;
                            break;
                        }
                        break;
                    case 3052374:
                        if (name.equals("char")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Character.class;
                            break;
                        }
                        break;
                    case 3327612:
                        if (name.equals("long")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Long.class;
                            break;
                        }
                        break;
                    case 3625364:
                        if (name.equals("void")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Void.class;
                            break;
                        }
                        break;
                    case 64711720:
                        if (name.equals("boolean")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Boolean.class;
                            break;
                        }
                        break;
                    case 97526364:
                        if (name.equals("float")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Float.class;
                            break;
                        }
                        break;
                    case 109413500:
                        if (name.equals("short")) {
                            MediaBrowserCompat$CustomActionResultReceiver2 = Short.class;
                            break;
                        }
                        break;
                }
            }
            if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
                return MediaBrowserCompat$CustomActionResultReceiver2;
            }
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        } else if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            return MediaBrowserCompat$CustomActionResultReceiver2;
        } else {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
        }
    }

    public static /* synthetic */ clickManagePin read(MwCasaOtpActivity mwCasaOtpActivity, HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, BaseDiscoverFundFilterActivity baseDiscoverFundFilterActivity, int i) {
        if ((i & 1) != 0) {
            hmlPromptPayVerificationActivity = HmlPromptPayAboutActivity.IconCompatParcelizer;
        }
        return read.MediaBrowserCompat$ItemReceiver(mwCasaOtpActivity, hmlPromptPayVerificationActivity, (i & 2) != 0 ? onDeleteClick.DEFAULT : null, (BaseDiscoverFundFilterActivity<? super MwCasaOtpActivity, ? super HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity>, ? extends Object>) baseDiscoverFundFilterActivity);
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(MailingAddressReviewOTPActivity<?> mailingAddressReviewOTPActivity, MwCurrentUserEwalletActivity mwCurrentUserEwalletActivity) {
        onGetStartedClick.write((Object) mailingAddressReviewOTPActivity, "$this$disposeOnCancellation");
        onGetStartedClick.write((Object) mwCurrentUserEwalletActivity, "handle");
        mailingAddressReviewOTPActivity.IconCompatParcelizer((FundFactSheetActivity<? super Throwable, HmlVerifyPhoneValidateOtpActivity>) new MwCreateQrActivity.MwScreenshotDisplay_ViewBinding(mwCurrentUserEwalletActivity));
    }

    public static <T> MailingAddressReviewActivity<T> MediaBrowserCompat$CustomActionResultReceiver(HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        MailingAddressReviewActivity<T> mailingAddressReviewActivity;
        MailingAddressReviewActivity<T> mailingAddressReviewActivity2;
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "delegate");
        if (!(hmlNTBPromptPayNotFoundActivity instanceof saveSlipButton)) {
            return new MailingAddressReviewActivity<>(hmlNTBPromptPayNotFoundActivity, 0);
        }
        saveSlipButton saveslipbutton = (saveSlipButton) hmlNTBPromptPayNotFoundActivity;
        while (true) {
            Object obj = saveslipbutton._reusableCancellableContinuation;
            mailingAddressReviewActivity = null;
            if (obj == null) {
                saveslipbutton._reusableCancellableContinuation = onCreateQRCodeButtonClick.MediaBrowserCompat$CustomActionResultReceiver;
                mailingAddressReviewActivity2 = null;
                break;
            } else if (obj instanceof MailingAddressReviewActivity) {
                if (saveSlipButton.MediaBrowserCompat$CustomActionResultReceiver.compareAndSet(saveslipbutton, obj, onCreateQRCodeButtonClick.MediaBrowserCompat$CustomActionResultReceiver)) {
                    mailingAddressReviewActivity2 = (MailingAddressReviewActivity) obj;
                    break;
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Inconsistent state ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString().toString());
            }
        }
        if (mailingAddressReviewActivity2 != null) {
            boolean z = true;
            if (MwChangeCasaSuccessActivity.write()) {
                if (!(((MwCurrentUserEwalletActivity) mailingAddressReviewActivity2._parentHandle) != MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer)) {
                    throw new AssertionError();
                }
            }
            Object obj2 = mailingAddressReviewActivity2._state;
            if (!MwChangeCasaSuccessActivity.write() || (!(obj2 instanceof onGMBClick))) {
                if (obj2 instanceof MediaImagePreviewActivity_ViewBinding) {
                    MwCurrentUserEwalletActivity mwCurrentUserEwalletActivity = (MwCurrentUserEwalletActivity) mailingAddressReviewActivity2._parentHandle;
                    if (mwCurrentUserEwalletActivity != null) {
                        mwCurrentUserEwalletActivity.MediaBrowserCompat$CustomActionResultReceiver();
                    }
                    mailingAddressReviewActivity2._parentHandle = MwOnBoardSuccessActivity_ViewBinding.IconCompatParcelizer;
                    z = false;
                } else {
                    mailingAddressReviewActivity2._decision = 0;
                    mailingAddressReviewActivity2._state = GoodToKnowActivity_ViewBinding.IconCompatParcelizer;
                }
                if (z) {
                    mailingAddressReviewActivity = mailingAddressReviewActivity2;
                }
                if (mailingAddressReviewActivity != null) {
                    return mailingAddressReviewActivity;
                }
            } else {
                throw new AssertionError();
            }
        }
        return new MailingAddressReviewActivity<>(hmlNTBPromptPayNotFoundActivity, 0);
    }

    public static <T> Object write(Object obj, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "uCont");
        if (obj instanceof MerchantWalletDetailActivity_ViewBinding) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            Throwable MediaBrowserCompat$CustomActionResultReceiver2 = NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer, hmlNTBPromptPayNotFoundActivity);
            onGetStartedClick.write((Object) MediaBrowserCompat$CustomActionResultReceiver2, "exception");
            return HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(MediaBrowserCompat$CustomActionResultReceiver2));
        }
        HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        return HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(obj);
    }

    public static void MediaBrowserCompat$ItemReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity, Throwable th) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        onGetStartedClick.write((Object) th, "exception");
        try {
            if (((CoroutineExceptionHandler) hmlPromptPayVerificationActivity.IconCompatParcelizer(CoroutineExceptionHandler.write)) == null) {
                MwBankAccountActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(hmlPromptPayVerificationActivity, th);
            }
        } catch (Throwable th2) {
            onGetStartedClick.write((Object) th, "originalException");
            onGetStartedClick.write((Object) th2, "thrownException");
            if (th != th2) {
                Throwable runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                onGetStartedClick.write((Object) runtimeException, "$this$addSuppressed");
                onGetStartedClick.write((Object) th, "exception");
                InvestmentDetailsActivity_ViewBinding.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(runtimeException, th);
                th = runtimeException;
            }
            MwBankAccountActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(hmlPromptPayVerificationActivity, th);
        }
    }

    public static MwCasaOtpActivity write(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "context");
        if (hmlPromptPayVerificationActivity.IconCompatParcelizer(clickManagePin.write) == null) {
            hmlPromptPayVerificationActivity = hmlPromptPayVerificationActivity.MediaBrowserCompat$ItemReceiver(new clickManageShopAccount((clickManagePin) null));
        }
        return new IdpShareInformationActivity_ViewBinding(hmlPromptPayVerificationActivity);
    }

    public static boolean MediaBrowserCompat$ItemReceiver(MwCasaOtpActivity mwCasaOtpActivity) {
        onGetStartedClick.write((Object) mwCasaOtpActivity, "$this$isActive");
        clickManagePin clickmanagepin = (clickManagePin) mwCasaOtpActivity.MediaBrowserCompat$CustomActionResultReceiver().IconCompatParcelizer(clickManagePin.write);
        if (clickmanagepin != null) {
            return clickmanagepin.write();
        }
        return true;
    }

    public static String IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity) {
        Object obj;
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "$this$toDebugString");
        if (hmlNTBPromptPayNotFoundActivity instanceof saveSlipButton) {
            return hmlNTBPromptPayNotFoundActivity.toString();
        }
        try {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append(hmlNTBPromptPayNotFoundActivity);
            sb.append('@');
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "$this$hexAddress");
            String hexString = Integer.toHexString(System.identityHashCode(hmlNTBPromptPayNotFoundActivity));
            onGetStartedClick.IconCompatParcelizer((Object) hexString, "Integer.toHexString(System.identityHashCode(this))");
            sb.append(hexString);
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(sb.toString());
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            obj = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th));
        }
        Throwable IconCompatParcelizer2 = HmlVerifyIdentifyActivity.IconCompatParcelizer(obj);
        String str = obj;
        if (IconCompatParcelizer2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(hmlNTBPromptPayNotFoundActivity.getClass().getName());
            sb2.append('@');
            onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "$this$hexAddress");
            String hexString2 = Integer.toHexString(System.identityHashCode(hmlNTBPromptPayNotFoundActivity));
            onGetStartedClick.IconCompatParcelizer((Object) hexString2, "Integer.toHexString(System.identityHashCode(this))");
            sb2.append(hexString2);
            str = sb2.toString();
        }
        return (String) str;
    }

    public static MwChangeCasaSuccessActivity_ViewBinding read(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "$this$delay");
        HmlPromptPayVerificationActivity.IconCompatParcelizer IconCompatParcelizer2 = hmlPromptPayVerificationActivity.IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity_ViewBinding.write);
        if (!(IconCompatParcelizer2 instanceof MwChangeCasaSuccessActivity_ViewBinding)) {
            IconCompatParcelizer2 = null;
        }
        MwChangeCasaSuccessActivity_ViewBinding mwChangeCasaSuccessActivity_ViewBinding = (MwChangeCasaSuccessActivity_ViewBinding) IconCompatParcelizer2;
        return mwChangeCasaSuccessActivity_ViewBinding == null ? onClickDone.write() : mwChangeCasaSuccessActivity_ViewBinding;
    }

    public static <T> void write(onReturnHomeClick<? super T> onreturnhomeclick, int i) {
        boolean z;
        onReturnHomeClick IconCompatParcelizer2;
        onGetStartedClick.write((Object) onreturnhomeclick, "$this$dispatch");
        HmlNTBPromptPayNotFoundActivity<? super T> write2 = onreturnhomeclick.write();
        if ((i == 0 || i == 1) && (write2 instanceof saveSlipButton)) {
            if ((i == 1) == (onreturnhomeclick.MediaDescriptionCompat == 1)) {
                MwBusinessDetailsActivity mwBusinessDetailsActivity = ((saveSlipButton) write2).read;
                HmlPromptPayVerificationActivity context = write2.getContext();
                if (mwBusinessDetailsActivity.write(context)) {
                    mwBusinessDetailsActivity.IconCompatParcelizer(context, onreturnhomeclick);
                    return;
                }
                handleTextChange handletextchange = handleTextChange.write;
                MwCreateQrActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver2 = handleTextChange.MediaBrowserCompat$CustomActionResultReceiver();
                if (MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer >= MwCreateQrActivity_ViewBinding.read(true)) {
                    MediaBrowserCompat$CustomActionResultReceiver2.write(onreturnhomeclick);
                    return;
                }
                MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer += MwCreateQrActivity_ViewBinding.read(true);
                try {
                    MediaBrowserCompat$ItemReceiver(onreturnhomeclick, onreturnhomeclick.write(), 2);
                    do {
                        BaseLivenessCheckActivity_ViewBinding<onReturnHomeClick<?>> baseLivenessCheckActivity_ViewBinding = MediaBrowserCompat$CustomActionResultReceiver2.read;
                        if (baseLivenessCheckActivity_ViewBinding == null || (IconCompatParcelizer2 = baseLivenessCheckActivity_ViewBinding.IconCompatParcelizer()) == null) {
                            z = false;
                            continue;
                        } else {
                            IconCompatParcelizer2.run();
                            z = true;
                            continue;
                        }
                    } while (z);
                } catch (Throwable th) {
                    MediaBrowserCompat$CustomActionResultReceiver2.read();
                    throw th;
                }
                MediaBrowserCompat$CustomActionResultReceiver2.read();
                return;
            }
        }
        MediaBrowserCompat$ItemReceiver(onreturnhomeclick, write2, i);
    }

    private static <T> void MediaBrowserCompat$ItemReceiver(onReturnHomeClick<? super T> onreturnhomeclick, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity, int i) {
        onGetStartedClick.write((Object) onreturnhomeclick, "$this$resume");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "delegate");
        Object MediaBrowserCompat$ItemReceiver2 = onreturnhomeclick.MediaBrowserCompat$ItemReceiver();
        Throwable th = null;
        MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) (!(MediaBrowserCompat$ItemReceiver2 instanceof MerchantWalletDetailActivity_ViewBinding) ? null : MediaBrowserCompat$ItemReceiver2);
        Throwable th2 = merchantWalletDetailActivity_ViewBinding != null ? merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer : null;
        if (th2 != null) {
            th = NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(th2, hmlNTBPromptPayNotFoundActivity);
        }
        if (th != null) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            MediaBrowserCompat$ItemReceiver2 = new HmlVerifyIdentifyActivity.write(th);
        } else {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
        }
        Object MediaBrowserCompat$CustomActionResultReceiver2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
        if (i == 0) {
            hmlNTBPromptPayNotFoundActivity.resumeWith(MediaBrowserCompat$CustomActionResultReceiver2);
        } else if (i == 1) {
            onCreateQRCodeButtonClick.read(hmlNTBPromptPayNotFoundActivity, MediaBrowserCompat$CustomActionResultReceiver2);
        } else if (i == 2) {
            saveSlipButton saveslipbutton = (saveSlipButton) hmlNTBPromptPayNotFoundActivity;
            HmlPromptPayVerificationActivity context = saveslipbutton.getContext();
            Object MediaBrowserCompat$ItemReceiver3 = EkycSuccessActivity.MediaBrowserCompat$ItemReceiver(context, saveslipbutton.write);
            try {
                saveslipbutton.MediaBrowserCompat$ItemReceiver.resumeWith(MediaBrowserCompat$CustomActionResultReceiver2);
                HmlVerifyPhoneValidateOtpActivity hmlVerifyPhoneValidateOtpActivity = HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
            } finally {
                EkycSuccessActivity.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver3);
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Invalid mode ");
            sb.append(i);
            throw new IllegalStateException(sb.toString().toString());
        }
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(HmlPromptPayVerificationActivity hmlPromptPayVerificationActivity) {
        onGetStartedClick.write((Object) hmlPromptPayVerificationActivity, "$this$checkCompletion");
        clickManagePin clickmanagepin = (clickManagePin) hmlPromptPayVerificationActivity.IconCompatParcelizer(clickManagePin.write);
        if (clickmanagepin != null && !clickmanagepin.write()) {
            throw clickmanagepin.MediaDescriptionCompat();
        }
    }

    public static onEditNicknameClick MediaBrowserCompat$ItemReceiver(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        onGetStartedClick.write((Object) mainDispatcherFactory, "$this$tryCreateDispatcher");
        onGetStartedClick.write((Object) list, "factories");
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return new NdidNationalIdInputActivity_ViewBinding(th, mainDispatcherFactory.hintOnError());
        }
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(String str, int i, int i2, int i3) {
        onGetStartedClick.write((Object) str, "propertyName");
        return (int) read.MediaBrowserCompat$ItemReceiver(str, (long) i, (long) i2, (long) i3);
    }

    public static /* synthetic */ int IconCompatParcelizer(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return MediaBrowserCompat$CustomActionResultReceiver(str, i, i2, i3);
    }

    public static void IconCompatParcelizer(HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> hmlNTBPromptPayNotFoundActivity, HmlNTBPromptPayNotFoundActivity<?> hmlNTBPromptPayNotFoundActivity2) {
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "$this$startCoroutineCancellable");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity2, "fatalCompletion");
        try {
            HmlNTBPromptPayNotFoundActivity<? super HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver2 = HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(hmlNTBPromptPayNotFoundActivity);
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onCreateQRCodeButtonClick.read(MediaBrowserCompat$ItemReceiver2, HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver));
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            hmlNTBPromptPayNotFoundActivity2.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
        }
    }

    public static <R, T> void IconCompatParcelizer(BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, R r, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "$this$startCoroutineCancellable");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        try {
            HmlNTBPromptPayNotFoundActivity<HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver2 = HmlDocumentSubmissionActivity.MediaBrowserCompat$ItemReceiver(HmlDocumentSubmissionActivity.read(baseDiscoverFundFilterActivity, r, hmlNTBPromptPayNotFoundActivity));
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onCreateQRCodeButtonClick.read(MediaBrowserCompat$ItemReceiver2, HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver));
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
        }
    }

    public static <R, T> void write(BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, R r, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        HmlPromptPayVerificationActivity context;
        Object MediaBrowserCompat$ItemReceiver2;
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "$this$startCoroutineUndispatched");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        try {
            context = hmlNTBPromptPayNotFoundActivity.getContext();
            MediaBrowserCompat$ItemReceiver2 = EkycSuccessActivity.MediaBrowserCompat$ItemReceiver(context, (Object) null);
            Object MediaBrowserCompat$CustomActionResultReceiver2 = ((BaseDiscoverFundFilterActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(baseDiscoverFundFilterActivity, 2)).MediaBrowserCompat$CustomActionResultReceiver(r, hmlNTBPromptPayNotFoundActivity);
            EkycSuccessActivity.IconCompatParcelizer(context, MediaBrowserCompat$ItemReceiver2);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
            }
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
        }
    }

    public static <R, T> void MediaBrowserCompat$CustomActionResultReceiver(BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity, R r, HmlNTBPromptPayNotFoundActivity<? super T> hmlNTBPromptPayNotFoundActivity) {
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "$this$startCoroutineUnintercepted");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        onGetStartedClick.write((Object) hmlNTBPromptPayNotFoundActivity, "completion");
        try {
            Object MediaBrowserCompat$CustomActionResultReceiver2 = ((BaseDiscoverFundFilterActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(baseDiscoverFundFilterActivity, 2)).MediaBrowserCompat$CustomActionResultReceiver(r, hmlNTBPromptPayNotFoundActivity);
            if (MediaBrowserCompat$CustomActionResultReceiver2 != HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
                HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
                hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$CustomActionResultReceiver2));
            }
        } catch (Throwable th) {
            HmlVerifyIdentifyActivity.IconCompatParcelizer iconCompatParcelizer2 = HmlVerifyIdentifyActivity.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) th, "exception");
            hmlNTBPromptPayNotFoundActivity.resumeWith(HmlVerifyIdentifyActivity.MediaBrowserCompat$CustomActionResultReceiver(new HmlVerifyIdentifyActivity.write(th)));
        }
    }

    public static <T, R> Object MediaBrowserCompat$ItemReceiver(BaseNtbInstructionActivity_ViewBinding<? super T> baseNtbInstructionActivity_ViewBinding, R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity) {
        Object obj;
        onGetStartedClick.write((Object) baseNtbInstructionActivity_ViewBinding, "$this$startUndispatchedOrReturn");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        baseNtbInstructionActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((clickManagePin) baseNtbInstructionActivity_ViewBinding.IconCompatParcelizer.IconCompatParcelizer(clickManagePin.write));
        try {
            obj = ((BaseDiscoverFundFilterActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(baseDiscoverFundFilterActivity, 2)).MediaBrowserCompat$CustomActionResultReceiver(r, baseNtbInstructionActivity_ViewBinding);
        } catch (Throwable th) {
            obj = new MerchantWalletDetailActivity_ViewBinding(th);
        }
        if (obj == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            return HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        }
        Object MediaBrowserCompat$CustomActionResultReceiver2 = baseNtbInstructionActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(obj);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            return HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        }
        if (!(MediaBrowserCompat$CustomActionResultReceiver2 instanceof MerchantWalletDetailActivity_ViewBinding)) {
            return MwOnBoardSuccessActivity.read(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        throw NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(((MerchantWalletDetailActivity_ViewBinding) MediaBrowserCompat$CustomActionResultReceiver2).IconCompatParcelizer, baseNtbInstructionActivity_ViewBinding.MediaDescriptionCompat);
    }

    public static <T, R> Object read(BaseNtbInstructionActivity_ViewBinding<? super T> baseNtbInstructionActivity_ViewBinding, R r, BaseDiscoverFundFilterActivity<? super R, ? super HmlNTBPromptPayNotFoundActivity<? super T>, ? extends Object> baseDiscoverFundFilterActivity) {
        Object obj;
        onGetStartedClick.write((Object) baseNtbInstructionActivity_ViewBinding, "$this$startUndispatchedOrReturnIgnoreTimeout");
        onGetStartedClick.write((Object) baseDiscoverFundFilterActivity, "block");
        baseNtbInstructionActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((clickManagePin) baseNtbInstructionActivity_ViewBinding.IconCompatParcelizer.IconCompatParcelizer(clickManagePin.write));
        try {
            obj = ((BaseDiscoverFundFilterActivity) onAddAccountClick.MediaBrowserCompat$ItemReceiver(baseDiscoverFundFilterActivity, 2)).MediaBrowserCompat$CustomActionResultReceiver(r, baseNtbInstructionActivity_ViewBinding);
        } catch (Throwable th) {
            obj = new MerchantWalletDetailActivity_ViewBinding(th);
        }
        if (obj == HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED) {
            return HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        }
        Object MediaBrowserCompat$CustomActionResultReceiver2 = baseNtbInstructionActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(obj);
        if (MediaBrowserCompat$CustomActionResultReceiver2 == MwOnBoardSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver) {
            return HmlPromptPayVerificationActivity_ViewBinding.COROUTINE_SUSPENDED;
        }
        if (!(MediaBrowserCompat$CustomActionResultReceiver2 instanceof MerchantWalletDetailActivity_ViewBinding)) {
            return MwOnBoardSuccessActivity.read(MediaBrowserCompat$CustomActionResultReceiver2);
        }
        MerchantWalletDetailActivity_ViewBinding merchantWalletDetailActivity_ViewBinding = (MerchantWalletDetailActivity_ViewBinding) MediaBrowserCompat$CustomActionResultReceiver2;
        Throwable th2 = merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer;
        if (!(th2 instanceof TimeoutCancellationException) || ((TimeoutCancellationException) th2).IconCompatParcelizer != baseNtbInstructionActivity_ViewBinding) {
            throw NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(merchantWalletDetailActivity_ViewBinding.IconCompatParcelizer, baseNtbInstructionActivity_ViewBinding.MediaDescriptionCompat);
        } else if (!(obj instanceof MerchantWalletDetailActivity_ViewBinding)) {
            return obj;
        } else {
            throw NdidSelectIdpActivity.MediaBrowserCompat$CustomActionResultReceiver(((MerchantWalletDetailActivity_ViewBinding) obj).IconCompatParcelizer, baseNtbInstructionActivity_ViewBinding.MediaDescriptionCompat);
        }
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i < 128) {
            byteArrayOutputStream.write(i);
        } else {
            int MediaMetadataCompat2 = MediaMetadataCompat(i);
            byteArrayOutputStream.write(MediaMetadataCompat2 | 128);
            for (int i2 = 0; i2 < MediaMetadataCompat2; i2++) {
                int i3 = ((MediaMetadataCompat2 - i2) - 1) << 3;
                byteArrayOutputStream.write(((255 << i3) & i) >> i3);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return MediaBrowserCompat$ItemReceiver(i).length;
    }

    public static byte[] read(int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int log = ((int) (Math.log((double) i) / Math.log(256.0d))) + 1;
        for (int i2 = 0; i2 < log; i2++) {
            int i3 = ((log - i2) - 1) << 3;
            byteArrayOutputStream.write(((255 << i3) & i) >> i3);
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int RatingCompat2 = RatingCompat(i);
        if (RatingCompat2 == 1) {
            byteArray[0] = (byte) (byteArray[0] | 64);
        } else if (RatingCompat2 == 2) {
            byteArray[0] = (byte) (byteArray[0] | ISOFileInfo.DATA_BYTES1);
        } else if (RatingCompat2 == 3) {
            byteArray[0] = (byte) (byteArray[0] | ISO7816.INS_GET_RESPONSE);
        }
        if (!IconCompatParcelizer(i)) {
            byteArray[0] = (byte) (byteArray[0] | 32);
        }
        return byteArray;
    }

    public static int write(int i) {
        return read(i).length;
    }

    private static int MediaMetadataCompat(int i) {
        int i2 = 0;
        while (i > 0) {
            i /= 256;
            i2++;
        }
        return i2;
    }

    public static String read(byte b) {
        byte b2 = b & 255;
        StringBuilder sb = new StringBuilder();
        sb.append(b2 < 16 ? "0" : "");
        sb.append(Integer.toHexString(b2));
        return sb.toString().toUpperCase();
    }

    public static String MediaBrowserCompat$ItemReceiver(byte[] bArr) {
        return bArr == null ? "NULL" : IconCompatParcelizer(bArr, bArr.length, 1000);
    }

    public static String IconCompatParcelizer(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return "NULL";
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i3 = 0; i3 < i; i3++) {
            if (i3 != 0 && i3 % 1000 == 0) {
                stringBuffer.append("\n");
            }
            stringBuffer.append(read(bArr[i3]));
        }
        return stringBuffer.toString();
    }

    private static int read(char c) throws NumberFormatException {
        switch (c) {
            case '0':
                return 0;
            case '1':
                return 1;
            case '2':
                return 2;
            case '3':
                return 3;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 7;
            case '8':
                return 8;
            case '9':
                return 9;
            default:
                switch (c) {
                    case 'A':
                        return 10;
                    case 'B':
                        return 11;
                    case 'C':
                        return 12;
                    case 'D':
                        return 13;
                    case 'E':
                        return 14;
                    case 'F':
                        return 15;
                    default:
                        switch (c) {
                            case 'a':
                                return 10;
                            case 'b':
                                return 11;
                            case 'c':
                                return 12;
                            case 'd':
                                return 13;
                            case 'e':
                                return 14;
                            case 'f':
                                return 15;
                            default:
                                throw new NumberFormatException();
                        }
                }
        }
    }

    public static byte[] ParcelableVolumeInfo(String str) throws NumberFormatException {
        if (str == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt)) {
                if ("0123456789abcdefABCDEF".indexOf(charAt) >= 0) {
                    stringBuffer.append(charAt);
                } else {
                    throw new NumberFormatException();
                }
            }
        }
        if (stringBuffer.length() % 2 != 0) {
            stringBuffer.insert(0, "0");
        }
        byte[] bArr = new byte[(stringBuffer.length() / 2)];
        for (int i2 = 0; i2 < stringBuffer.length(); i2 += 2) {
            bArr[i2 / 2] = (byte) (((read(stringBuffer.charAt(i2)) & 255) << 4) | (read(stringBuffer.charAt(i2 + 1)) & 255));
        }
        return bArr;
    }

    public static String read(short s) {
        short s2 = 65535 & s;
        StringBuilder sb = new StringBuilder();
        String str = "";
        sb.append(s2 < 4096 ? "0" : str);
        sb.append(s2 < 256 ? "0" : str);
        if (s2 < 16) {
            str = "0";
        }
        sb.append(str);
        sb.append(Integer.toHexString(s));
        String obj = sb.toString();
        if (obj.length() > 4) {
            obj = obj.substring(obj.length() - 4, obj.length());
        }
        return obj.toUpperCase();
    }

    public static boolean read(byte[] bArr, int i, byte[] bArr2, int i2, int i3) {
        onGetStartedClick.write((Object) bArr, "a");
        onGetStartedClick.write((Object) bArr2, "b");
        for (int i4 = 0; i4 < i3; i4++) {
            if (bArr[i4 + i] != bArr2[i4 + i2]) {
                return false;
            }
        }
        return true;
    }

    public static void MediaBrowserCompat$ItemReceiver(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            StringBuilder sb = new StringBuilder();
            sb.append("size=");
            sb.append(j);
            sb.append(" offset=");
            sb.append(j2);
            sb.append(" byteCount=");
            sb.append(j3);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
    }

    public static <T> T read(T t) throws CloneNotSupportedException {
        if (t == null) {
            return null;
        }
        if (t instanceof Cloneable) {
            try {
                try {
                    return t.getClass().getMethod("clone", (Class[]) null).invoke(t, (Object[]) null);
                } catch (InvocationTargetException e) {
                    Throwable cause = e.getCause();
                    if (cause instanceof CloneNotSupportedException) {
                        throw ((CloneNotSupportedException) cause);
                    }
                    throw new Error("Unexpected exception", cause);
                } catch (IllegalAccessException e2) {
                    throw new IllegalAccessError(e2.getMessage());
                }
            } catch (NoSuchMethodException e3) {
                throw new NoSuchMethodError(e3.getMessage());
            }
        } else {
            throw new CloneNotSupportedException();
        }
    }

    public static String read(AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        String str = (String) amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.protocol.element-charset");
        return str == null ? CreditCardBilledDetailAdapter$ChildViewHolder_ViewBinding.read.name() : str;
    }

    public static byte[] MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(str, "Input");
        if (str2 != null) {
            boolean z = true;
            if (!(str2 == null || str2.length() == 0)) {
                z = false;
            }
            if (!z) {
                try {
                    return str.getBytes(str2);
                } catch (UnsupportedEncodingException unused) {
                    return str.getBytes();
                }
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Charset");
                sb.append(" may not be empty");
                throw new IllegalArgumentException(sb.toString());
            }
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Charset");
            sb2.append(" may not be null");
            throw new IllegalArgumentException(sb2.toString());
        }
    }

    private static CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding read(DataInputStream dataInputStream, EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) throws IOException, ConstructionException, ParseException {
        EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2;
        DeviceSettingsAdapter$ParentViewHolder deviceSettingsAdapter$ParentViewHolder;
        int readUnsignedByte = dataInputStream.readUnsignedByte();
        if ((readUnsignedByte & 31) == 31) {
            readUnsignedByte = (readUnsignedByte << 8) + dataInputStream.readByte();
        }
        EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder[] values = EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2 = null;
                break;
            }
            easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2 = values[i];
            if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.value == readUnsignedByte) {
                break;
            }
            i++;
        }
        if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2 == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown CVC tag value ");
            sb.append(Integer.toHexString(readUnsignedByte));
            throw new ParseException(sb.toString());
        } else if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder == null || easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2 == easycashLoanTrackAdapter$LoanInfoHeaderViewHolder) {
            int IconCompatParcelizer2 = CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding.IconCompatParcelizer(dataInputStream);
            if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.isSequence) {
                int available = dataInputStream.available();
                if (easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.isSequence) {
                    int i2 = ExtendedAccountSelectorAdapter$ExtendedItemViewHolder.C11773.write[easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.ordinal()];
                    if (i2 == 1) {
                        deviceSettingsAdapter$ParentViewHolder = new CVCertificate();
                    } else if (i2 == 2) {
                        deviceSettingsAdapter$ParentViewHolder = new EasycashHeaderAdapter$LoanHeaderViewHolder_ViewBinding();
                    } else if (i2 == 3) {
                        deviceSettingsAdapter$ParentViewHolder = new C1174x485c104b();
                    } else if (i2 == 4) {
                        deviceSettingsAdapter$ParentViewHolder = new CVCAuthorizationTemplate();
                    } else if (i2 == 5) {
                        deviceSettingsAdapter$ParentViewHolder = new AdditionDocumentTypeAdapter$DocumentViewHolder_ViewBinding();
                    } else {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Unsupported type ");
                        sb2.append(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2);
                        throw new IllegalArgumentException(sb2.toString());
                    }
                    while (dataInputStream.available() > available - IconCompatParcelizer2) {
                        deviceSettingsAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver(read(dataInputStream, (EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) null));
                    }
                    return deviceSettingsAdapter$ParentViewHolder instanceof C1174x485c104b ? EasycashLoanTrackingAdapter$LoanViewHolder_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver((C1174x485c104b) deviceSettingsAdapter$ParentViewHolder) : deviceSettingsAdapter$ParentViewHolder;
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("Tag ");
                sb3.append(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2);
                sb3.append(" is not a sequence");
                throw new IllegalArgumentException(sb3.toString());
            }
            byte[] bArr = new byte[IconCompatParcelizer2];
            dataInputStream.read(bArr, 0, IconCompatParcelizer2);
            if (!easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.isSequence) {
                switch (EasycashHeaderAdapter$LoanHeaderViewHolder.C11731.read[easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2.ordinal()]) {
                    case 1:
                        return new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, bArr);
                    case 2:
                        return new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, bArr);
                    case 3:
                        return new CardLoanOfferViewPagerAdapter$ItemViewHolder(bArr);
                    case 4:
                        return new EasycashLoanTrackAdapter$LoanInfoItemBodyViewHolder_ViewBinding(bArr);
                    case 5:
                        return new EasycashLoanTrackAdapter$LoanInfoItemHeaderViewHolder(bArr);
                    case 6:
                        return new AdditionDocumentAdapter$DocumentViewHolder_ViewBinding(bArr);
                    case 7:
                        return new EasycashLoanTrackingAdapter$LoanViewHolder(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, bArr);
                    case 8:
                        return new EasycashLoanTrackingAdapter$LoanViewHolder(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, bArr);
                    default:
                        return new CustomCheckboxAdapter$CheckBoxViewHolder(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2, bArr);
                }
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append("Tag ");
                sb4.append(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2);
                sb4.append(" is a sequence");
                throw new IllegalArgumentException(sb4.toString());
            }
        } else {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Expected first tag ");
            sb5.append(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder);
            sb5.append(" but found ");
            sb5.append(easycashLoanTrackAdapter$LoanInfoHeaderViewHolder2);
            throw new ParseException(sb5.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0018 A[Catch:{ IOException -> 0x001c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p040o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding write(byte[] r1, p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder r2) throws org.ejbca.cvc.exception.ParseException, org.ejbca.cvc.exception.ConstructionException {
        /*
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch:{ all -> 0x0014 }
            r0.<init>(r1)     // Catch:{ all -> 0x0014 }
            java.io.DataInputStream r1 = new java.io.DataInputStream     // Catch:{ all -> 0x0012 }
            r1.<init>(r0)     // Catch:{ all -> 0x0012 }
            o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding r1 = read((java.io.DataInputStream) r1, (p040o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder) r2)     // Catch:{ all -> 0x0012 }
            r0.close()     // Catch:{ IOException -> 0x001c }
            return r1
        L_0x0012:
            r1 = move-exception
            goto L_0x0016
        L_0x0014:
            r1 = move-exception
            r0 = 0
        L_0x0016:
            if (r0 == 0) goto L_0x001b
            r0.close()     // Catch:{ IOException -> 0x001c }
        L_0x001b:
            throw r1     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            r1 = move-exception
            org.ejbca.cvc.exception.ParseException r2 = new org.ejbca.cvc.exception.ParseException
            r2.<init>((java.lang.Throwable) r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.AlertController$RecycleListView.write(byte[], o.EasycashLoanTrackAdapter$LoanInfoHeaderViewHolder):o.CardLoanOfferViewPagerAdapter$ItemViewHolder_ViewBinding");
    }

    public static byte[] MediaBrowserCompat$ItemReceiver(String str, byte[] bArr) throws SignatureException {
        if (!str.toUpperCase(Locale.getDefault()).contains("ECDSA")) {
            return bArr;
        }
        int length = bArr.length / 2;
        byte[] bArr2 = new byte[length];
        int length2 = bArr.length / 2;
        byte[] bArr3 = new byte[length2];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        System.arraycopy(bArr, length, bArr3, 0, length2);
        BigInteger bigInteger = new BigInteger(1, bArr2);
        BigInteger bigInteger2 = new BigInteger(1, bArr3);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DEROutputStream dEROutputStream = new DEROutputStream(byteArrayOutputStream);
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        aSN1EncodableVector.add(new ASN1Integer(bigInteger));
        aSN1EncodableVector.add(new ASN1Integer(bigInteger2));
        try {
            dEROutputStream.writeObject(new DERSequence(aSN1EncodableVector));
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new SignatureException(e);
        }
    }

    /* JADX INFO: finally extract failed */
    public static byte[] write(String str, byte[] bArr) throws IOException {
        byte[] bArr2;
        if (!str.toUpperCase(Locale.getDefault()).contains("ECDSA")) {
            return bArr;
        }
        ASN1InputStream aSN1InputStream = new ASN1InputStream(bArr);
        try {
            ASN1Sequence aSN1Sequence = (ASN1Sequence) aSN1InputStream.readObject();
            aSN1InputStream.close();
            BigInteger value = ((ASN1Integer) aSN1Sequence.getObjectAt(0)).getValue();
            BigInteger value2 = ((ASN1Integer) aSN1Sequence.getObjectAt(1)).getValue();
            byte[] byteArray = value.toByteArray();
            if (byteArray[0] == 0) {
                int length = byteArray.length - 1;
                byte[] bArr3 = new byte[length];
                System.arraycopy(byteArray, 1, bArr3, 0, length);
                byteArray = bArr3;
            }
            byte[] byteArray2 = value2.toByteArray();
            if (byteArray2[0] == 0) {
                int length2 = byteArray2.length - 1;
                byte[] bArr4 = new byte[length2];
                System.arraycopy(byteArray2, 1, bArr4, 0, length2);
                byteArray2 = bArr4;
            }
            if (byteArray.length > byteArray2.length) {
                bArr2 = new byte[(byteArray.length << 1)];
            } else {
                bArr2 = new byte[(byteArray2.length << 1)];
            }
            System.arraycopy(byteArray, 0, bArr2, (bArr2.length / 2) - byteArray.length, byteArray.length);
            System.arraycopy(byteArray2, 0, bArr2, bArr2.length - byteArray2.length, byteArray2.length);
            return bArr2;
        } catch (Throwable th) {
            aSN1InputStream.close();
            throw th;
        }
    }

    public static void write(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            if (i < 25) {
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i++;
                }
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    public static void read(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            } else {
                throw new p043rx.exceptions.CompositeException(list);
            }
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Throwable th) {
        if (th instanceof p043rx.exceptions.OnErrorNotImplementedException) {
            throw ((p043rx.exceptions.OnErrorNotImplementedException) th);
        } else if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        } else if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        } else if (th instanceof StackOverflowError) {
            throw ((StackOverflowError) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
