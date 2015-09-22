package br.com.bpaulino.android.geoquiz;

/**
 * Created by brunopaulino on 9/21/15.
 */
public class Question {

    private int mTextResID;
    private boolean mAnswertrue;

    public int getTextResID() {
        return mTextResID;
    }

    public boolean isAnswertrue() {
        return mAnswertrue;
    }

    public void setTextResID(int textResID) {
        mTextResID = textResID;
    }

    public void setAnswertrue(boolean answertrue) {
        mAnswertrue = answertrue;
    }

    public Question(int textResID, boolean answertrue) {
        this.mTextResID = textResID;
        this.mAnswertrue = answertrue;
    }
}
