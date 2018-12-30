package com.example.aakash.drishti;

public enum ModelObject
{

    RED(R.string.first, R.layout.activity_view_pager_layout),
    BLUE(R.string.second, R.layout.activity_view_pager_layout1);


    private int mTitleResId;
    private int mLayoutResId;

    ModelObject(int titleResId, int layoutResId) {
        mTitleResId = titleResId;
        mLayoutResId = layoutResId;
    }

    public int getTitleResId() {
        return mTitleResId;
    }

    public int getLayoutResId() {
        return mLayoutResId;
    }

}