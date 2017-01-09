package com.xinyu.mwp.ui.fragments;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.RelativeSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xinyu.mwp.R;
import com.xinyu.mwp.base.BaseFragment;
import com.xinyu.mwp.ui.activities.LogonActivity;
import com.xinyu.mwp.ui.activities.RegisterActivity;
import com.xinyu.mwp.view.CircleImageView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * 左侧侧滑菜单的fragment
 * Created by cg on 2015/8/26.
 */
public class ToolNavigationDrawerFragment extends BaseFragment {

    @BindView(R.id.tv_assets)
    TextView mAssets;
    @BindView(R.id.tv_grade)
    TextView mGrade;
    @BindView(R.id.view_head)
    CircleImageView mViewHead;
    @BindView(R.id.tv_personal_name)
    TextView mTvPersonalName;
    @BindView(R.id.tv_personal_login)
    TextView mTvPersonalLogin;
    @BindView(R.id.tv_personal_register)
    TextView mTvPersonalRegister;
    @BindView(R.id.ll_btn)
    LinearLayout mLlBtn;
    @BindView(R.id.ll_personal_assets)
    LinearLayout mLlPersonalAssets;
    @BindView(R.id.ll_personal_grade)
    LinearLayout mLlPersonalGrade;
    @BindView(R.id.tv_drawer_my_attention)
    TextView mTvDrawerMyAttention;
    @BindView(R.id.tv_drawer_my_push_bill)
    TextView mTvDrawerMyPushBill;
    @BindView(R.id.tv_drawer_my_share_bill)
    TextView mTvDrawerMyShareBill;
    @BindView(R.id.tv_drawer_exchange_detail)
    TextView mTvDrawerExchangeDetail;
    @BindView(R.id.tv_drawer_comment_feedback)
    TextView mTvDrawerCommentFeedback;
    @BindView(R.id.tv_drawer_product_grade)
    TextView mTvDrawerProductGrade;
    @BindView(R.id.tv_drawer_focus_us)
    TextView mTvDrawerFocusUs;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        setContentView(R.layout.fragment_setting_drawer);
        initView();
        initListener();
        ButterKnife.bind(this, parentView);
        return parentView;
    }

    @Override
    public void initView() {
        /**
         * 我的资产
         */
        String assets = String.format(getString(R.string.my_assets_num), "16202.00");
        SpannableString spanAssets = new SpannableString(assets);
        spanAssets.setSpan(new RelativeSizeSpan(0.56f), assets.length() - 1, assets.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        mAssets.setText(spanAssets);
        /**
         * 我的积分
         */
        String grade = String.format(getString(R.string.my_grade_num), "235");
        SpannableString spanGrade = new SpannableString(grade);
        spanGrade.setSpan(new RelativeSizeSpan(0.56f), grade.length() - 1, grade.length(), Spannable.SPAN_INCLUSIVE_EXCLUSIVE);
        mGrade.setText(spanGrade);
    }

    @Override
    public void initListener() {

    }

    @OnClick({R.id.view_head, R.id.tv_personal_login, R.id.tv_personal_register, R.id.ll_personal_assets, R.id.ll_personal_grade, R.id.tv_drawer_my_attention, R.id.tv_drawer_my_push_bill, R.id.tv_drawer_my_share_bill, R.id.tv_drawer_exchange_detail, R.id.tv_drawer_comment_feedback, R.id.tv_drawer_product_grade, R.id.tv_drawer_focus_us})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.view_head:
                //fall through
            case R.id.tv_personal_login:
                toActivity(LogonActivity.class);  //跳转到登录界面
                break;
            case R.id.tv_personal_register:
                toActivity(RegisterActivity.class);
                break;
            case R.id.ll_personal_assets:
                break;
            case R.id.ll_personal_grade:
                break;
            case R.id.tv_drawer_my_attention:
                break;
            case R.id.tv_drawer_my_push_bill:
                break;
            case R.id.tv_drawer_my_share_bill:
                break;
            case R.id.tv_drawer_exchange_detail:
                break;
            case R.id.tv_drawer_comment_feedback:
                break;
            case R.id.tv_drawer_product_grade:
                break;
            case R.id.tv_drawer_focus_us:
                break;
        }
    }

    /**
     * 设置菜单点击接口，以方便外部Activity调用
     */
    public interface menuItemClickListener {
        void menuItemClick(int position, String menuName);
    }

}
