package com.atay.kg.neobis.models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;

@Entity(tableName = "notes")
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name ="text")
    private String noteText;
    @ColumnInfo(name ="date")
    private long noteDates;


    public Note(String noteText, long noteDates) {
        this.noteText = noteText;
        this.noteDates = noteDates;

    }

    public String getNoteText() {
        return noteText;
    }

    public void setNoteText(String noteText) {
        this.noteText = noteText;

    }

    public long getNoteDates() {
        return noteDates;
    }

    public void setNoteDates( long noteDates) {
        this.noteDates = noteDates;
    }

    public  int getId(){
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
}

