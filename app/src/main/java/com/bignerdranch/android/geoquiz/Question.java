package com.bignerdranch.android.geoquiz;

import java.io.Serializable;

public class Question implements Serializable {

    private int mTextId;
    private boolean mAnswerTrue;
    private boolean mAlreadyAnswer;

    public boolean isAlreadyAnswer() {
        return mAlreadyAnswer;
    }

    public void setAlreadyAnswer(boolean alreadyAnswer) {
        mAlreadyAnswer = alreadyAnswer;
    }

    public Question(int mTextId, boolean mAnswerTrue) {
        this.mTextId = mTextId;
        this.mAnswerTrue = mAnswerTrue;
    }

    public int getTextId() {
        return mTextId;
    }

    public void setTextId(int textId) {
        mTextId = textId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }
}
