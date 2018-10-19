/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.object;

/**
 *
 * @author Hung Vi Manh
 */
public class Word {

    private int word_id;
    private String word_taget;
    private String word_explain;

    public Word(int word_id, String word_taget, String word_explain) {
        this.word_id = word_id;
        this.word_taget = word_taget;
        this.word_explain = word_explain;
    }

    public int getWord_id() {
        return word_id;
    }

    public void setWord_id(int word_id) {
        this.word_id = word_id;
    }

    public String getWord_taget() {
        return word_taget;
    }

    public void setWord_taget(String word_taget) {
        this.word_taget = word_taget;
    }

    public String getWord_explain() {
        return word_explain;
    }

    public void setWord_explain(String word_explain) {
        this.word_explain = word_explain;
    }

}
