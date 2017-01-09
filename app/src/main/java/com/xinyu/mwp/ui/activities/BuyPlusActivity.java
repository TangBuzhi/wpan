package com.xinyu.mwp.ui.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.xinyu.mwp.R;
import com.xinyu.mwp.base.BaseActivity;

import butterknife.BindView;

/**
 * Created by Don on 2017/1/9.
 * Describe ${TODO}
 * Modified ${TODO}
 */

public class BuyPlusActivity extends BaseActivity {

    @BindView(R.id.toolbar_title)
    TextView mToolbarTitle;
    @BindView(R.id.toolBar)
    Toolbar mToolBar;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy_plus);
        initView();
        initData(null);
        initListener();
    }

    @Override
    public void initView() {
        initToolbar(mToolBar, mToolbarTitle, getString(R.string.buy_plus));
        mToolBar.setNavigationIcon(R.mipmap.ic_toolbar_back);
    }

    @Override
    public void initData(Object data) {

    }

    @Override
    public void initListener() {

    }
}
